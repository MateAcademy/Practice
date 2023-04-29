package javaIoNio.io.ex1500;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Serhii Klunniy
 */
public class Student implements Serializable {
    private String name;
    private float averageGrade;
    private Set<SubjectGrades> grades;

    public Student(String name, float averageGrade, Set<SubjectGrades> grades) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Set<SubjectGrades> getGrades() {
        return grades;
    }

    public void setGrades(Set<SubjectGrades> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", grades=" + grades +
                '}';
    }
}
