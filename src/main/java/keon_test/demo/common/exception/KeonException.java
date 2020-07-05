package keon_test.demo.common.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class KeonException extends RuntimeException{

    private HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    private ErrorMessageCode errorMessagerCode = ErrorMessageCode.ERROR;
    private List<KeonError> errors;


    public KeonException(String message) {
        super(message);
    }

    public KeonException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public KeonException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorMessagerCode = errorMessagerCode;
    }

    public KeonException(String message, ErrorMessageCode errorMessagerCode) {
        super(message);
        this.errorMessagerCode = errorMessagerCode;
    }

    public KeonException(ErrorMessageCode errorMessagerCode) {
        this.errorMessagerCode = errorMessagerCode;
    }


    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public ErrorMessageCode getErrorMessagerCode() {
        return this.errorMessagerCode;
    }

    public List<KeonError> getErrors() {
        return this.errors;
    }

    public void setErrors(List<KeonError> errors) {
        this.errors = errors;
    }

}
