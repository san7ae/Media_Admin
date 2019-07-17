package mediaDB;

import java.util.Collection;

public class ContentImpl implements Content{

    ContentType contentType;
    Uploader uploader;
    Collection<Tag> tags;


    @Override
    public ContentType getContentType(){
        return contentType;
    }

    @Override
    public Uploader getUploader() {
        return uploader;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public Collection<Tag> getTags() {
        return tags;
    }
}
