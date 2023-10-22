package com.mynotesapp.notes;

import com.mynotesapp.util.DateTimeUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    private static final String NOTES_FILE = "notes.txt";
    public static List<Note> loadNotes(){
        List<Note> notes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(NOTES_FILE))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(" -> ");
                if(parts.length == 2){
                    notes.add(new Note(parts[1], parts[0]));
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return notes;
    }
    public static void saveNote(String content){
        String timestamp = DateTimeUtils.getCurrentTimestamp();
        Note note = new Note(content, timestamp);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(NOTES_FILE, true))){
            writer.write(note.toString());
            writer.newLine();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
