package Decipher05;

public class decipherer {

    public static String decipher(String phrase) {
        int keyNumber = phrase.length() / 2;
        String subString = phrase
                .substring(5, 5 + phrase.length() / 2)
                .replaceAll("@#\\?", " ");

        return new StringBuilder(subString).reverse().toString();
    }


    public static void main(String[] args) {
        String[] phraseList = {
                "0@sn9sirppa@#?ia'jgtvryko1",
                "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
                "aopi?sedohtém@#?sedhtmg+p9l!"
        };
        StringBuilder decipheredPhrase = new StringBuilder();
        for (int i = 0; i < phraseList.length; i++) {
            decipheredPhrase.append(decipher(phraseList[i]));
            decipheredPhrase.append(i == phraseList.length - 1 ? "." : " ");
        }
            System.out.println(decipheredPhrase);

    }
}