public class Student {
    private String name;
    private final String id;
    private int year;

    private static int studentCount = 0;

    public Student(String name, String id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void incrementYear() {
        this.year++;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}