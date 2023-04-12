package lesson03.ex01;

/**
 * @author Serhii Klunniy
 */
public class SubjectGrade {
    private final String subject;
    private final int grade;

    public SubjectGrade(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }
}
