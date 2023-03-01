import java.util.ArrayList;
public class Student {
    String fullName;
    int age;
    double gpa;
    int height;
    public Student(){

    }

    public Student(String fullName, int age, double gpa, int height) {
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
        this.height = height;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
