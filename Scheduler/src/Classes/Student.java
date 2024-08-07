package Classes;

import java.util.ArrayList;

public class Student {
    int id;
    String firstName;
    String lastName;
    ArrayList<Session> sessions;

    public Student(int id, String firstName, String lastName, ArrayList<Session> sessions) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sessions = sessions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }
}
