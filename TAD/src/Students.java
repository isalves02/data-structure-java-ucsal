interface IStudents {
    String studentName();
    int studentSemester();
    void addStudentInfo(String name, int semester);
}

public class Students implements IStudents {
    String studentName;
    int studentSemester;

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

    public static void main(String[] args) {}
}
