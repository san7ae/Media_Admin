package mediaDB;

import java.util.Collection;

public class MediaContentImpl implements MediaContent {
    private int bitrate;
    private int length;
    private Uploader uploader;

    public MediaContentImpl(int bitrate, int length, Uploader uploader) {
        this.bitrate = bitrate;
        this.length = length;
        this.uploader = uploader;
    }

    @Override
    public int getBitrate() {
        return this.bitrate;
    }

    @Override
    public long getLength() {
        return this.length;
    }

    @Override
    public ContentType getContentType() {
        return null;
    }

    @Override
    public Uploader getUploader() {
        return this.uploader;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public Collection<Tag> getTags() {
        return null;
    }
}
