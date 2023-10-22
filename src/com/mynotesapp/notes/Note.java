package com.mynotesapp.notes;

public class Note {
    private String content;
    private String timestamp;

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Note(String content, String timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return timestamp + "->" + content;
    }
}
