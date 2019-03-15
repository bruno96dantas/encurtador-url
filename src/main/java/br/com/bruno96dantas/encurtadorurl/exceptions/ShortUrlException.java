package br.com.bruno96dantas.encurtadorurl.exceptions;

public class ShortUrlException extends RuntimeException {

    public ShortUrlException(String message) {
        super(message);
    }

    public ShortUrlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShortUrlException(Throwable cause) {
        super(cause);
    }

    public ShortUrlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
