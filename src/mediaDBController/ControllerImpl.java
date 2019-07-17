package mediaDBController;

import mediaDB.Content;
import mediaDB.Tag;
import mediaDB.Uploader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ControllerImpl implements Controller {

    Collection<Tag> allTagCollection = new ArrayList<Tag>();
    List<Uploader> uploaderList = new ArrayList<Uploader>();
    List<Content> contentList = new ArrayList<Content>();

    @Override
    public void addUploader(Uploader uploader) {
        uploaderList.add(uploader);
    }

    @Override
    public void deleteUploader(Uploader uploader) {
        Iterator<Uploader> itr = uploaderList.iterator();
        while (itr.hasNext()) {
            Uploader uploaderX = itr.next();
            if (uploaderX.getName() == uploader.getName()) {
                itr.remove();
            }
        }
    }

    @Override
    public void addContent(Content content) {
        contentList.add(content);
    }

    @Override
    public void deleteContent(Content content) {
        Iterator<Content> itr = contentList.iterator();
        while (itr.hasNext()) {
            Content contentX = itr.next();
            if (contentX.getAddress() == content.getAddress()) {
                itr.remove();
            }
        }
    }

    @Override
    public List<Content> getContent(Content content) {
        List<Content> list = new ArrayList<Content>();
        return list;
    }

    @Override
    public String getUploadAddressAndUploadDate(Content content) {
        return content.getAddress();
    }

    @Override
    public Collection<Tag> getAvailableTags() {
        Collection<Tag> tagCollection = new ArrayList<Tag>();
        return tagCollection;
    }


    @Override
    public Collection<Tag> getTagsNotAvailable() {
        Collection<Tag> availableTagCollection = getAvailableTags();
        allTagCollection.removeAll(availableTagCollection);
        return allTagCollection;
    }

    @Override
    public int getNumberOfContent(Uploader uploader) {
        return contentList.size();
    }

    @Override
    public void updateView(){}

    @Override
    public List<Uploader> getUploaderList() {
        return uploaderList;
    }

    @Override
    public List<Content> getContentList() {
        return contentList;
    }

    @Override
    public int getUploaderListSize(){
        return this.uploaderList.size();
    }

    @Override
    public int getContentListSize(){
        return this.contentList.size();
    }
}
