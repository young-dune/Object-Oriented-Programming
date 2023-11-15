class Course {
    String code;
    String name;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String toString() {
        return "Code: " + code + ", Name: " + name;
    }
}

class OnlineCourse extends Course {
    String type;

    public OnlineCourse(String code, String name) {
        super(code, name);
        this.type = "Online";
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}

class OfflineCourse extends Course {
    String type;

    public OfflineCourse(String code, String name) {
        super(code, name);
        this.type = "Offline";
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}
