package com.tekion.query.db_query.service;

import com.mongodb.client.result.UpdateResult;
import com.tekion.query.db_query.DealerMaster.DealerMaster;

import java.util.List;
import java.util.Map;

public interface DealerMasterService {
    DealerMaster createNewDM(DealerMaster request);

    UpdateResult updateDM(String id, Map<Object,Object> request);

    List<DealerMaster> searchAll();

    DealerMaster searchDM(String id);

    String deleteById(String id);

}
