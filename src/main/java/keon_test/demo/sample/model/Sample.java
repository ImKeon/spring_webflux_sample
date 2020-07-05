package keon_test.demo.sample.model;

import keon_test.demo.common.model.BaseEntity;
import keon_test.demo.sample.constant.SampleStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Sample extends BaseEntity {

    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String contents;
    private SampleStatus status = SampleStatus.INIT;

}
