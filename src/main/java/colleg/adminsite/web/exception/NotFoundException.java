package colleg.adminsite.web.exception;


import colleg.adminsite.web.ApiStatus;

/**
 * @author ock
 */
public class NotFoundException extends ApiException {
    /**
     *
     */
    public NotFoundException() {
        super(ApiStatus.NOT_FOUND, "");
    }

    /**
     * @param message
     */
    public NotFoundException(String message) {
        super(ApiStatus.NOT_FOUND, message);
    }
}
