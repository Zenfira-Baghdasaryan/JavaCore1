package classwork.homework1.bracechecker;

import org.w3c.dom.Text;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text="[Hello( (from) {Java]";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();


}}
