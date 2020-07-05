package keon_test.demo.sample.exception;

import keon_test.demo.common.exception.ErrorMessageCode;
import keon_test.demo.common.exception.KeonException;
import org.springframework.http.HttpStatus;

public class SampleNotFoundException extends KeonException {

    public SampleNotFoundException() {
        super("SampleNotFoundException", ErrorMessageCode.SAMPLE_NOT_FOUND);
    }

    public SampleNotFoundException(String message) {
        super(message);
    }

    public SampleNotFoundException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public SampleNotFoundException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public SampleNotFoundException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public SampleNotFoundException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
