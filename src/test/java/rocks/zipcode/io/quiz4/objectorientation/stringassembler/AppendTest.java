package rocks.zipcode.io.quiz4.objectorientation.stringassembler;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.objectorientation.StringAssembler;

/**
 * @author leon on 11/12/2018.
 */
public class AppendTest {
    @Test
    public void test1() {
        // given
        Character delimeter = 'x';
        String expected = "Thexquickxbrownxfoxxjumps";

        // when
        String actual = new StringAssembler(delimeter)
                .append("The")
                .append("quick")
                .append("brown")
                .append("fox")
                .append("jumps")
                .assemble();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Character delimeter = '\r';
        String expected = "The\rquick\rbrown\rfox\rjumps";

        // when
        String actual = new StringAssembler(delimeter)
                .append("The")
                .append("quick")
                .append("brown")
                .append("fox")
                .append("jumps")
                .assemble();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        Character delimeter = 'Z';
        String expected = "TheZquickZbrownZfoxZjumps";

        // when
        String actual = new StringAssembler(delimeter)
                .append("The")
                .append("quick")
                .append("brown")
                .append("fox")
                .append("jumps")
                .assemble();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        Character delimeter = ':';
        String expected = "The:quick:brown:fox:jumps";

        // when
        String actual = new StringAssembler(delimeter)
                .append("The")
                .append("quick")
                .append("brown")
                .append("fox")
                .append("jumps")
                .assemble();

        // then
        Assert.assertEquals(expected, actual);
    }

}
