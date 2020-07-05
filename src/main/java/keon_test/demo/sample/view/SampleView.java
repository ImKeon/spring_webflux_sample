package keon_test.demo.sample.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import keon_test.demo.common.model.BaseView;
import keon_test.demo.sample.constant.SampleStatus;
import keon_test.demo.sample.model.Sample;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleView extends BaseView {

    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String contents;
    private SampleStatus status;

    public SampleView(Sample sample) {
        this.setId(sample.getId());
        this.setActive(sample.getActive());
        this.setCreatedAt(sample.getCreatedAt());
        this.setCreatedId(sample.getCreatedId());
        this.setUpdatedAt(sample.getUpdatedAt());
        this.setUpdatedId(sample.getUpdatedId());

        this.title = sample.getTitle();
        this.contents = sample.getContents();
        this.status = sample.getStatus();
    }

}
