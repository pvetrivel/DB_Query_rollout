package com.tekion.query.db_query.repo;

import com.tekion.query.db_query.DealerMaster.DealerMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.Optional;

public interface DealerMasterRepository extends CrudRepository<DealerMaster, String> {
    @Override
    Optional<DealerMaster> findById(String s);
}
