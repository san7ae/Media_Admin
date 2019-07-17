package mediaDB;

import java.util.Collection;

public class LicensedAudioVideoImpl implements LicensedAudioVideo {

    private int samplingRate;
    private int width;
    private int height;
    private String encoding;
    private String holder;
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
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public String getEncoding() {
        return this.encoding;
    }

    @Override
    public String getHolder() {
        return this.holder;
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
        return ContentType.AudioVideo;
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
