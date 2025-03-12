interface ITeacher {
    String teacherName();
    int subjectCode();
    void addSubjectCode(int code);
    void addTeacherName(String name);
}

public class Teacher implements ITeacher {
    String name;
    int subjectCode;

    @Override
    public String teacherName() {
        return this.name;
    }

    @Override
    public int subjectCode() {
        return this.subjectCode;
    }

    @Override
    public void addSubjectCode(int code) {
        subjectCode = code;
    }

    @Override
    public void addTeacherName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {}
}
