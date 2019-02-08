package com.tekion.query.db_query.service;

import com.mongodb.client.result.UpdateResult;
import com.tekion.query.db_query.DealerMaster.DealerMaster;
import com.tekion.query.db_query.repo.DealerMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DealerMasterServiceImpl implements DealerMasterService {
    @Autowired
    DealerMasterRepo repo;

    @Override
    public DealerMaster createNewDM(DealerMaster request) {

        return repo.save(request);
    }

    @Override
    public UpdateResult updateDM(String id, Map<Object,Object> update) {
    DealerMaster master=repo.findById(id);
    if(!master.isActive()){
        throw new IllegalArgumentException("Requesting for an invalid data");}
        return repo.update(id,update);
    }

    @Override
    public List<DealerMaster> searchAll() {
        return repo.findByIds();
    }

    @Override
    public DealerMaster searchDM(String id) {
        DealerMaster master=repo.findById(id);
        if(!master.isActive()){
            throw new IllegalArgumentException("Requesting for an invalid data");}
        return master;
    }

    @Override
    public String deleteById(String id) {
        DealerMaster master=repo.findById(id);
        if(!master.isActive()){
            throw new IllegalArgumentException("Requesting for an invalid data");}
        master.setActive(false);
        repo.save(master);
        return "Deleted successfully";
    }

}
