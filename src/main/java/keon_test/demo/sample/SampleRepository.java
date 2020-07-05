package keon_test.demo.sample;

import keon_test.demo.common.model.ActiveType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import keon_test.demo.sample.model.Sample;

@Repository
public interface SampleRepository extends CrudRepository<Sample, Long>, QuerydslPredicateExecutor<Sample>{
    Page<Sample> findAllByActive(Pageable pageable, ActiveType activeType);

    Sample findByIdAndActive(Long id, ActiveType active);
}
