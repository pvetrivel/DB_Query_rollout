package com.tekion.query.db_query.Controller;

import com.mongodb.client.result.UpdateResult;
import com.tekion.query.db_query.DealerMaster.DealerMaster;
import com.tekion.query.db_query.dto.DMUpadate;
import com.tekion.query.db_query.service.DealerMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ApiController {
    @Autowired
    DealerMasterService service;

    @GetMapping("/dm/find")
    public ResponseEntity<List> findAll(){
        return ResponseEntity.ok(service.searchAll());
    }

    @GetMapping("/dm/find/{id}")
    public ResponseEntity<DealerMaster> findById(@PathVariable String id){
       return ResponseEntity.ok(service.searchDM(id));
    }
    @PostMapping("/dm/save")
    public ResponseEntity<DealerMaster> save(@RequestBody DealerMaster dm){
        return ResponseEntity.ok(service.createNewDM(dm));
    }

    @PutMapping("/dm/update/{id}")
    public ResponseEntity<UpdateResult> updateById(@PathVariable String id, @RequestBody Map<Object,Object> update){
        return  ResponseEntity.ok(service.updateDM(id,update) );
    }

    @DeleteMapping("/dm/delete/{id}")
    public ResponseEntity deleteById(@PathVariable String id){
        return ResponseEntity.ok(service.deleteById(id));
    }
}
