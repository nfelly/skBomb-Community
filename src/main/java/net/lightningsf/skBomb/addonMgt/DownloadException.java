package net.lightningsf.skBomb.addonMgt;

/**
 * Created by xiurobert on 5/19/2015.
 */
public class DownloadException extends Exception {
    public DownloadException() {
        super();
    }

    public DownloadException(String msg) {
        super(msg);
    }

    public DownloadException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public DownloadException(Throwable cause) {
        super(cause);
    }

}
