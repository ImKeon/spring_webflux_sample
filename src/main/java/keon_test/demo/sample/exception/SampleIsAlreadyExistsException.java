package keon_test.demo.sample.exception;

import keon_test.demo.common.exception.KeonException;
import keon_test.demo.common.exception.ErrorMessageCode;
import org.springframework.http.HttpStatus;

public class SampleIsAlreadyExistsException extends KeonException {

    public SampleIsAlreadyExistsException() {
        super("SampleIsAlreadyExistsException", ErrorMessageCode.SAMPLE_IS_ALREADY_EXISTS);
    }

    public SampleIsAlreadyExistsException(String message) {
        super(message);
    }

    public SampleIsAlreadyExistsException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public SampleIsAlreadyExistsException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public SampleIsAlreadyExistsException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public SampleIsAlreadyExistsException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
