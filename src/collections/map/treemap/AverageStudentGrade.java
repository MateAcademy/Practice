package collections.map.treemap;

/**
 * @author Serhii Klunniy
 */
public class AverageStudentGrade implements Comparable<AverageStudentGrade>{
    private final String name;
    private final float averageGrade;

    public AverageStudentGrade(String name, float averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(AverageStudentGrade that) {
        if (that.averageGrade<that.averageGrade) {
            return -1;
        }
        if (that.averageGrade>that.averageGrade) {
            return 1;
        }
        return name.compareTo(that.getName());
    }

    public String getName() {
        return name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }
}
