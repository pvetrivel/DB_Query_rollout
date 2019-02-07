package com.tekion.query.db_query.Controller;



import com.mongodb.client.result.UpdateResult;
import com.tekion.query.db_query.DealerMaster.DealerMaster;
import com.tekion.query.db_query.Exception.InvalidDataSearch;
import com.tekion.query.db_query.repo.DealerMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController
public class DealerController {
    @Autowired
    DealerMasterRepository dmRepo;

    @Autowired
    MongoTemplate mongoTemplate;

    //---------------DealerMaster-----------//

    //DealerMaster
    @GetMapping(value = "/dealerMasters")
    public Iterable<DealerMaster> getAllDealerMaster() {
    Iterable<DealerMaster> masters=  dmRepo.findAll();
    ArrayList<DealerMaster> availableDealers=new ArrayList<DealerMaster>();
    for(DealerMaster dm:masters){
        if(dm.isActive()){
            availableDealers.add(dm);
        }
    }
    return availableDealers;
    }

    @GetMapping(value = "/dealerMaster/{id}")
    public ResponseEntity<DealerMaster> getDealer(@PathVariable String id) throws InvalidDataSearch {
        DealerMaster master=dmRepo.findById(id).get();
        if(!master.isActive()){
                throw new InvalidDataSearch("NoDataAvailable");
        }
        //return dealerMaster.get();
        return ResponseEntity.ok(master);
    }

    @PostMapping(value = "/addDealerMaster")
    public ResponseEntity<DealerMaster> addDealerManager(@RequestBody DealerMaster dealerMaster){
       return ResponseEntity.ok(dmRepo.save(dealerMaster));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<DealerMaster> updateDealerMaster(@RequestBody DealerMaster dealerMaster, @PathVariable String id){
        dealerMaster.set_id(id);
        return ResponseEntity.ok(dmRepo.save(dealerMaster));
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteDealerMaster(@PathVariable String id) throws InvalidDataSearch {
        DealerMaster dealerMaster=  dmRepo.findById(id).get();
        if(!dealerMaster.isActive()){
            throw new InvalidDataSearch("No such document available");
        }
        dealerMaster.setActive(false);
        dmRepo.save(dealerMaster);
        return ResponseEntity.ok("Deleted Successfully");
    }

    @PatchMapping("/edit/{id}")
    public ResponseEntity<UpdateResult> editDealerMaster(@PathVariable String id,@Valid @RequestBody Map<Object, Object> fields ) throws InvalidDataSearch {
        DealerMaster dealer=  dmRepo.findById(id).get();
        if(!dealer.isActive()){
            throw new InvalidDataSearch("RecordNotAvailable");
        }
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        Update update = new Update();
        for(Map.Entry<Object,Object> entry:fields.entrySet())
            update.set(""+entry.getKey(),entry.getValue());
        UpdateResult master=mongoTemplate.updateFirst(query, update, DealerMaster.class);

        return ResponseEntity.ok(master);

    }


}