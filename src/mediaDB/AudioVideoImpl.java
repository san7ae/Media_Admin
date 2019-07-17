package mediaDB;

import java.util.Collection;

public class AudioVideoImpl implements AudioVideo{

    private int samplingRate;
    private int width;
    private int height;
    private String encoding;
    private int bitrate;
    private long length;
    private Uploader uploader;
    private String address;
    private Collection<Tag> tags;

    public AudioVideoImpl(int samplingRate, int width, int height, String encoding, int bitrate, long length, String address) {
        this.samplingRate = samplingRate;
        this.width = width;
        this.height = height;
        this.encoding = encoding;
        this.bitrate = bitrate;
        this.length = length;
        this.address = address;
    }

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
