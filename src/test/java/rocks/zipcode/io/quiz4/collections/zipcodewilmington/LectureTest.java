package rocks.zipcode.io.quiz4.collections.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.collections.ZipCodeWilmington;
import rocks.zipcode.io.quiz4.collections.Student;

/**
 * @author leon on 11/12/2018.
 */
public class LectureTest {
    @Test
    public void test1() {
        test(100.0,
                new Student());
    }

    @Test
    public void test2() {
        test(200.0,
                new Student(),
                new Student());
    }

    @Test
    public void test3() {
        test(300.0,
                new Student(),
                new Student(),
                new Student());
    }


    @Test
    public void test4() {
        test(400.0,
                new Student(),
                new Student(),
                new Student(),
                new Student());
    }

    @Test
    public void test5() {
        test(500.0,
                new Student(),
                new Student(),
                new Student(),
                new Student(),
                new Student());
    }


    @Test
    public void test6() {
        test(600.0,
                new Student(),
                new Student(),
                new Student(),
                new Student(),
                new Student(),
                new Student());
    }

    public void test(Double lectureTime, Student... students) {
        // given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        for (Student student : students) {
            zipCodeWilmington.enroll(student);
            Assert.assertEquals(0.0, student.getTotalStudyTime().doubleValue(), 0);
        }

        // when
        zipCodeWilmington.lecture(lectureTime);

        // then
        for (Student student : students) {
            Assert.assertEquals(student.getTotalStudyTime(), lectureTime, 0);
        }
    }
}
