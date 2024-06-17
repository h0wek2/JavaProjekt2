package wit.projekt;

import wit.projekt.Frame.Frame;
import wit.projekt.Student.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame();

                //studentRegistry.addStudent(new Student("Jan", "Kowalski", "123456"));

                StudentGUI studentGUI = new StudentGUI("studa");
                StudentGUI studentGUI2 = new StudentGUI("stude");
            }
        });
    }
}
