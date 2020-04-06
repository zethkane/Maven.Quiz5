package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        StringAssembler assembler = new StringAssembler(delimeter);
        assembler.assemble();
        return assembler;
    }

    public String assemble() {
        String assembled;
        return null;
    }
}
