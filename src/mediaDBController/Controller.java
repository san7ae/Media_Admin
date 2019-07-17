package mediaDBController;

import mediaDB.Content;
import mediaDB.Tag;
import mediaDB.Uploader;

import java.util.Collection;
import java.util.List;

public interface Controller {

    void addUploader(Uploader uploader);
    void deleteUploader(Uploader uploader);
    void addContent(Content content);
    void deleteContent(Content content);

    /**
     *
     * @param content Types : Audio, AudioVideo, Video, LicensedAudioVideo
     * @return List of specified ContentType
     */
    List<Content> getContent(Content content);

    /**
     * Clients including Uploader can access Media Content. Uploader can add or delete their own Content.
     * @return Address and Upload Date (if and Uploader)
     */
    String getUploadAddressAndUploadDate(Content content);
    Collection<Tag> getAvailableTags();
    Collection<Tag> getTagsNotAvailable();
    int getNumberOfContent(Uploader uploader);
    void updateView();
    List<Uploader> getUploaderList();
    List<Content> getContentList();
    int getUploaderListSize();
    int getContentListSize();
}
