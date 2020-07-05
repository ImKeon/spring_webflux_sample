package keon_test.demo.sample;

import keon_test.demo.sample.view.SampleView;
import keon_test.demo.sample.exception.SampleValidException;
import keon_test.demo.common.exception.ErrorMessageCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleValidator {
    public void postValidate(SampleView sampleView) {
        log.debug("]-----] SampleValidator::postValidate.sampleView [-----[ {}", sampleView);
        if (StringUtils.isBlank(sampleView.getTitle())) {
            throw new SampleValidException(ErrorMessageCode.SAMPLE_TITLE_IS_REQUIRED);
        }

    }

}
