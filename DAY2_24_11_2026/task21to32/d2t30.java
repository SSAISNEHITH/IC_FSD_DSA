class Course {
    String courseName;
    int duration;
    double fee;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: ₹" + fee);
    }
}

public class d2t30 {
    public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", 8, 12000.0);
        Course c2 = new Course("Spring Boot & SQL", 6, 8500.0);

        c1.displayCourse();
        c2.displayCourse();
    }
}