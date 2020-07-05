package keon_test.demo.sample.exception;

import keon_test.demo.common.exception.ErrorMessageCode;
import keon_test.demo.common.exception.KeonException;
import org.springframework.http.HttpStatus;

public class SampleValidException extends KeonException {


    public SampleValidException() {
        super("SampleValidException");
    }

    public SampleValidException(String message) {
        super(message);
    }

    public SampleValidException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public SampleValidException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public SampleValidException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public SampleValidException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
