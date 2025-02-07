package gr.aueb.cf.ch16.marker;

public class Attachment implements IArchivable {
    private String fileName;
    private String extension;

    public Attachment() {

    }

    public Attachment(String fileName, String extension) {
        this.fileName = fileName;
        this.extension = extension;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
