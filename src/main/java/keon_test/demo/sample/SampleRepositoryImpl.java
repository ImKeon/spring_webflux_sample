package keon_test.demo.sample;

import com.querydsl.jpa.impl.JPAQuery;
import keon_test.demo.common.model.ActiveType;
import keon_test.demo.sample.constant.SampleStatus;
import keon_test.demo.sample.model.Sample;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Repository
//public class SampleRepositoryImpl extends QuerydslRepositorySupport {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public SampleRepositoryImpl() {
//        super(Sample.class);
//    }
//
//    public Page<Sample> findAll(PageRequest pageable) {
//        QSample sample = QSample.sample;
//        JPAQuery<Sample> query = new JPAQuery(entityManager);
//        query.select(
//                sample
//        )
//                .from(sample)
//                .where(
//                        sample.active.eq(ActiveType.ACTIVE)
//                                .and(sample.status.eq(SampleStatus.INIT))
//                );
//        List<Sample> samples = getQuerydsl().applyPagination(pageable, query).fetch();
//        return new PageImpl<>(samples, pageable, query.fetchCount());
//    }
//}