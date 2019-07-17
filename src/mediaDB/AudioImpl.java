package mediaDB;

import java.util.Collection;

public class AudioImpl implements Audio {

    private ContentType Audio;
    private int samplingRate;
    private String encoding;
    private int bitrate;
    private long length;
    private Uploader uploader;
    private String address;
    private Collection<Tag> tags;

    @Override
    public int getSamplingRate() {
        return this.samplingRate;
    }

    @Override
    public String getEncoding() {
        return this.encoding;
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
        return ContentType.Audio;
    }

    @Override
    public Uploader getUploader() {
        return this.uploader;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public Collection<Tag> getTags() {
        return this.tags;
    }
}
