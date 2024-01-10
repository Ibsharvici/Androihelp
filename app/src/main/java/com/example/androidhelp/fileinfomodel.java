package com.example.androidhelp;

public class fileinfomodel {
    String filename , fileurl;

    public fileinfomodel(String filename , String fileurl) {
        this.filename = filename;
        this.fileurl = fileurl;

    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
