package com.tekion.query.db_query.dto;

import com.tekion.query.db_query.DealerMaster.DealerMaster;

import java.util.Date;

public class DMUpadate extends DealerMaster {
    @Override
    public void applyToExist(DealerMaster dm) {
        super.applyToExist(dm);
        dm.setLastUpdatedDateTime(new Date());
    }
}
