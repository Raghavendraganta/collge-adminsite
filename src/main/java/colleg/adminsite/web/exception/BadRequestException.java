package colleg.adminsite.web.exception;

import colleg.adminsite.web.ApiStatus;

/**
 * @author ock
 */
public class BadRequestException extends ApiException {
    /**
     *
     */
    public BadRequestException() {
        super(ApiStatus.BAD_REQUEST, "");
    }

    /**
     * @param message
     */
    public BadRequestException(String message) {
        super(ApiStatus.BAD_REQUEST, message);
    }
}
