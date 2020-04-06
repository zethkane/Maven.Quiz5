package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> classroom = new LinkedList<>();

    public void enroll(Student student) {
        classroom.add(student);
    }

    public Boolean isEnrolled(Student student) {
        if (classroom.contains(student)){
        return true;
        }
        return false;
    }

    public void lecture(double numberOfHours) {
        for (Student p: classroom) {
            p.learn(numberOfHours);
        }

    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studied = new HashMap<>();
        for (Student p: classroom) {
            studied.put(p, p.getTotalStudyTime());
        }
        return studied;
    }
}
