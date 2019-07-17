package mediaDB;

import java.util.Collection;

public interface Content {
    ContentType getContentType();
    Uploader getUploader();
    String getAddress();
    Collection<Tag> getTags();
}
