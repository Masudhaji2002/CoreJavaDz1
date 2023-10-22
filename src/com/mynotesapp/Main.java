package com.mynotesapp;
import com.mynotesapp.notes.Note;
import com.mynotesapp.notes.NoteManager;

import java.util.List;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            NoteManager noteManager = new NoteManager();

            while (true) {
                System.out.println("Введите заметку (для выхода введите 'exit'): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                noteManager.saveNote(input);
                System.out.println("Заметка создана и сохранена.");
            }
        }
    }