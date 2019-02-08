package com.tekion.query.db_query.repo;

import com.mongodb.client.result.UpdateResult;
import com.tekion.query.db_query.DealerMaster.DealerMaster;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
class DealerMasterRepoImpl implements DealerMasterRepo {

    MongoTemplate mongoTemplate;

    public DealerMasterRepoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public DealerMaster save(DealerMaster dm) {
        mongoTemplate.save(dm);
        return null;
    }

    @Override
    public DealerMaster findById(String id) {
        Query qr = new Query();
        qr.addCriteria(Criteria.where("_id").is(id));
        qr.addCriteria(Criteria.where("isActive").is(true));
        return mongoTemplate.findById(id,DealerMaster.class);
    }

    @Override
    public List<DealerMaster> findByIds() {
        ArrayList<DealerMaster> dealeraMasters=new ArrayList();
        for(DealerMaster master:mongoTemplate.findAll(DealerMaster.class)){
            if(master.isActive()){
                dealeraMasters.add(master);
            }
        }
        return dealeraMasters;
    }

    @Override
    public UpdateResult update(String id, Map<Object,Object> request) {
        Update update = new Update();

        for(Map.Entry<Object,Object> entry:request.entrySet()) {
            update.set(""+entry.getKey(),entry.getValue());
        }
        Query qr = new Query();
        qr.addCriteria(Criteria.where("_id").is(id));
        qr.addCriteria(Criteria.where("isActive").is(true));
        return mongoTemplate.updateFirst(qr,update,DealerMaster.class);
    }
}
