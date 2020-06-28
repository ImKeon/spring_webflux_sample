package keon_test.demo.communication.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import keon_test.demo.common.model.BaseView;
import keon_test.demo.communication.model.Communication;
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
public class CommunicationView extends BaseView {

    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String subTitle;
    private String contents;

    public CommunicationView(Communication communication) {
        this.setId(communication.getId());
        this.setActive(communication.getActive());
        this.setCreatedAt(communication.getCreatedAt());
        this.setCreatedId(communication.getCreatedId());
        this.setUpdatedAt(communication.getUpdatedAt());
        this.setUpdatedId(communication.getUpdatedId());

        this.title = communication.getTitle();
        this.subTitle = communication.getSubTitle();
        this.contents = communication.getContents();
    }
}
