package com.tekion.query.db_query.repo;

import com.mongodb.client.result.UpdateResult;
import com.tekion.query.db_query.DealerMaster.DealerMaster;

import java.util.List;
import java.util.Map;

public interface DealerMasterRepo {
    public DealerMaster save(DealerMaster dm);

    public DealerMaster findById(String id);
    public List<DealerMaster> findByIds();
    public UpdateResult update(String id, Map<Object,Object> request);
}
