interface IStudent {
    String studentName();
    int studentSemester();
    void addStudentInfo(String name, int semester);
}

class Student implements IStudent {
    private String studentName;
    private int studentSemester;

    @Override
    public void addStudentInfo(String name, int semester) {
        studentName = name;
        studentSemester = semester;
    }

    @Override
    public int studentSemester() {
        return studentSemester;
    }

    @Override
    public String studentName() {
        return studentName;
    }
}

public class Students {
    public static void main(String[] args) {
        Student student = new Student();
    }
}