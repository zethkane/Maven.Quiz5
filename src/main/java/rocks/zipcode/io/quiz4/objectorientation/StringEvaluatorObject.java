package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    private String string;
    public StringEvaluatorObject(String str) {
        this.string = str;
    }

    public String[] getAllSubstrings() {
        String[] arr;
        String toBeSplit = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                if (!string.substring(i,j).equals(" "))
                    toBeSplit += (string.substring(i,j) +",");
            }
        }

        arr = toBeSplit.split(",");


        return arr;

    }

    public String[] getCommonSubstrings(String secondInput) {
        String[] first = getAllSubstrings();
        String[] second;
        String toBeSplit = "";
        String splitten2 = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                if (!string.substring(i,j).equals(" "))
                    toBeSplit += (string.substring(i,j) +",");
            }
        }

        second = toBeSplit.split(",");
        for (int i = 0; i < second.length ; i++) {
            if (first[i].equals(second[i])){
                splitten2 += first[i] + ",";
            }

        } String[] results = splitten2.split(",");
        return results;
    }

    public String getLargestCommonSubstring(String secondInput) {
        return null;
    }
}
