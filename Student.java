WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/**
 * Represents a simple student class.
 * <p>
 * You do not need to change this class.
 */

public class Student {

    long studentId;
    long recordId;
    int age;
    String studentName;
    String major;
    String level;

    public Student(long studentId, int age, String studentName, String major, String level, long recordId) {
        this.studentId = studentId;
        this.age = age;
        this.studentName = studentName;
        this.major = major;
        this.level = level;
        this.recordId = recordId;
    }
}
