package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private double fee;

    public Course(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Course: " + name + " Tuition Fee: " + fee;
    }
}

class Students implements Homepage {
    private List<Course> enrolledCourses;
    private double tuitionFee;
    private double paidFee;

    public Students() {
        this.enrolledCourses = new ArrayList<>();
        this.tuitionFee = 0.0;
        this.paidFee = 0.0;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        tuitionFee += course.getFee();
    }

    public void payFee(double amount) {
        paidFee += amount;
    }

    public double getBalanceFee() {
        return tuitionFee - paidFee;
    }

    @Override
    public String toString() {
        StringBuilder studentInfo = new StringBuilder();

        studentInfo.append("Enrolled Courses:\n");
        for (Course course : enrolledCourses) {
            studentInfo.append(course.toString()).append("\n");
        }

        studentInfo.append("Total Tuition Fee: ").append(tuitionFee).append("\n");
        studentInfo.append("Paid Fee: ").append(paidFee).append("\n");
        studentInfo.append("Balance Fee: ").append(getBalanceFee());

        return studentInfo.toString();
    }



    }

