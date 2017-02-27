package module3.homework.task3;

import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        Course course = new Course(date,"Java");
        Course course1 = new Course("Python",200,"Jobs");
        Course course2 = new Course(date,"C#");
        Course course3 = new Course(date,"C++");
        Course course4 = new Course("JS",150,"Smith");
        Student student = new Student("Tanya","Pleshka",21);
        Student student1 = new Student("Pleshka", new Course[]{course,course1});
        CollegeStudent collegeStudent = new CollegeStudent("Andrey","Gazhur",21);
        CollegeStudent collegeStudent1 = new CollegeStudent("Gazhur",new Course[]{course3,course4});
        CollegeStudent collegeStudent2 = new CollegeStudent("Harvard",90,50);
        SpecialStudent specialStudent = new SpecialStudent("Yarik","Bubka",22);
        SpecialStudent specialStudent1 = new SpecialStudent("Bubka",new Course[]{course1,course4});
        SpecialStudent specialStudent2 = new SpecialStudent(12345678);
        System.out.println(course.getName() + course.getStartDate());
        System.out.println(course1.getName() + course1.getHoursDuration() + course1.getTeacherName());
        System.out.println(course2.getName() + course2.getStartDate());
        System.out.println(course3.getName() + course3.getStartDate());
        System.out.println(course4.getName() + course4.getHoursDuration() + course4.getTeacherName());
        System.out.println(student.getFirstName() + student.getLastName() + student.getGroup());
        System.out.println(student1.getLastName()+ Arrays.toString(student1.getCourseTaken()));
        System.out.println(collegeStudent.getFirstName() + collegeStudent.getLastName() + collegeStudent.getGroup());
        System.out.println(collegeStudent1.getLastName() + Arrays.toString(collegeStudent1.getCourseTaken()));
        System.out.println(collegeStudent2.getCollegeName() + collegeStudent2.getRating() + collegeStudent2.getId());
        System.out.println(specialStudent.getFirstName() + specialStudent.getLastName() + specialStudent.getGroup());
        System.out.println(specialStudent1.getLastName() + Arrays.toString(specialStudent1.getCourseTaken()));
        System.out.println(specialStudent2.getSecretKey());
    }
}
