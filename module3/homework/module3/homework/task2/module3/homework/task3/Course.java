package module3.homework.module3.homework.task2.module3.homework.task3;

import java.util.GregorianCalendar;

public class Course {
    private GregorianCalendar startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(GregorianCalendar startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }
    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
