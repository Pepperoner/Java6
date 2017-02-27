package module3.homework.task3;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] courseTaken;
    private int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] courseTaken) {
        this.lastName = lastName;
        this.courseTaken = courseTaken;
    }

    public Student() {
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCourseTaken() {
        return courseTaken;
    }

    public void setCourseTaken(Course[] courseTaken) {
        this.courseTaken = courseTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("First Name: ").append(firstName);
        result.append("\tLast Name: ").append(lastName);
        result.append("\tGroup: ").append(group);
        result.append("\tCourse Taken: ").append(Arrays.toString(courseTaken));
        result.append("\tAge: ").append(age);
        return result.toString();
    }
}
