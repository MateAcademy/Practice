package javaIoNio.io.ex1500;

import java.io.Serializable;

/**
 * @author Serhii Klunniy
 */
public class SubjectGrades implements Serializable {
    private final String subject;
    private final int grade;

    public SubjectGrades(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "SubjectGrades{" +
                "subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
