package Classes;

import java.util.ArrayList;

public class Session {
    int id;
    String name;
    Teacher teacher; //This takes the assumption that there can only be one teacher for a session. If there can be more than one teacher, change this to ArrayList<Teacher>
    ArrayList<Student> students;
    int slots;
    boolean isSet = false;
    String sessionType;

    public Session(int id, String name, Teacher teacher, ArrayList<Student> students, int slots, String sessionType) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.students = students;
        this.slots = slots;
        this.sessionType = sessionType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public boolean isSet() {
        return isSet;
    }

    public void setSet(boolean set) {
        isSet = set;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }
}
