    /**
     * Created by katherine_celeste on 8/10/16.
     */
    public class Main {
        public static void main(String[] args)
        {
            // 1. call explode
            System.out.println("Kata.explode(\"example\") -> "+Kata.explode("example")); // "e x a m p l e"
            System.out.println("Kata.explode(\"example\") -> "+Kata.explode("cat")); // "c a t"
            System.out.println("Kata.explode(\"\") -> " + Kata.explode("")); // ""
            System.out.println("Kata.explode(\"c\") -> "+Kata.explode("c\n")); // "c"


            // 2. call notString
            System.out.println("Kata.notString(\"candy\") -> "+Kata.notString("candy")); // "not candy"
            System.out.println("Kata.notString(\"x\") -> "+Kata.notString("x")); // "not x"
            System.out.println("Kata.notString(\"not bad\") -> "+Kata.notString("not bad")); // "not bad"


            // 3. call missingChar
            System.out.println("Kata.missingChar(\"kitten\", 1) -> " + Kata.missingChar("kitten", 1)); // "ktten"
            System.out.println("Kata.missingChar(\"kitten\", 0) -> "+Kata.missingChar("kitten", 0)); // "itten"
            System.out.println("Kata.missingChar(\"kitten\", 4) -> " + Kata.missingChar("kitten", 4)); // "kittn"
            System.out.println();

            // 4. call frontBack
            System.out.println("Kata.frontBack(\"code\") -> "+Kata.frontBack("code")); // "eodc"
            System.out.println("Kata.frontBack(\"a\") -> " + Kata.frontBack("a")); // "a"
            System.out.println("Kata.frontBack(\"ab\") -> " + Kata.frontBack("ab")); // "ba"
            System.out.println();

            // 5. call front3
            System.out.println("Kata.front3(\"Java\") -> " + Kata.front3("Java")); // "JavJavJav"
            System.out.println("Kata.front3(\"Chocolate\") -> "+Kata.front3("Chocolate")); // "ChoChoCho"
            System.out.println("Kata.front3(\"abc\") -> " + Kata.front3("abc")); // "abcabcabc"
            System.out.println();

            // 6. call backAround
            System.out.println("Kata.backAround(\"cat\") -> "+Kata.backAround("cat")); // "tcatt"
            System.out.println("Kata.backAround(\"Hello\") -> "+Kata.backAround("Hello")); // "oHelloo"
            System.out.println("Kata.backAround(\"a\") -> "+Kata.backAround("a")); // "aaa"
            System.out.println();

            // 7. call front22
            System.out.println("Kata.front22(\"kitten\") -> "+Kata.front22("kitten")); // "kikittenki"
            System.out.println("Kata.front22(\"Ha\") -> "+Kata.front22("Ha")); // "HaHaHa"
            System.out.println("Kata.front22(\"abc\") -> "+Kata.front22("abc")); // "ababcab"
            System.out.println();

            // 8. call delDel
            System.out.println("Kata.delDel(\"adelbc\") -> "+Kata.delDel("adelbc")); // "abc"
            System.out.println("Kata.delDel(\"adelHello\") -> "+Kata.delDel("adelHello")); // "aHello"
            System.out.println("Kata.delDel(\"adedbc\") -> "+Kata.delDel("adedbc")); // "adedbc"
            System.out.println();

            // 9. call startOz
            System.out.println();
            System.out.println("Kata.startOz(\"ozymandias\") -> "+Kata.startOz("ozymandias")); // "oz"
            System.out.println("Kata.startOz(\"bzoo\") -> " + Kata.startOz("bzoo")); // "z"
            System.out.println("Kata.startOz(\"oxx\") -> "+Kata.startOz("oxx")); // "o"
            System.out.println("Kata.startOz(\"kitten\") -> "+Kata.startOz("kitten")); // "ki"

            // 10. call endUp
            System.out.println();
            System.out.println("Kata.endUp(\"Hello\") -> "+Kata.endUp("Hello")); // "HeLLO"
            System.out.println("Kata.endUp(\"hi there\") ->"+ Kata.endUp("hi there")); // "hi thERE"
            System.out.println("Kata.endUp(\"hi\") ->"+Kata.endUp("hi")); // "HI"

        }
    }
