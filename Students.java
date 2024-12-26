abstract class Student {
    private String fullName;
    private int course;
    private double lastExamGrade;

    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    public abstract void writeExam();

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Курс: " + course + ", Оценка за последний экзамен: " + lastExamGrade;
    }
}


class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " из ИУ пишет экзамен.");
    }

    public String getFullName() {
        return super.toString();
    }
}


class MathStudent extends Student {
    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " из ФН пишет экзамен.");
    }

    public String getFullName() {
        return super.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Ершов Арсений Михайлович", 1, 4.0);
        Student mathStudent = new MathStudent("Петров Иван Васильевич", 3, 5.0);

        iuStudent.writeExam();
        mathStudent.writeExam();

        System.out.println(iuStudent); //
        System.out.println(mathStudent); //
    }
}

