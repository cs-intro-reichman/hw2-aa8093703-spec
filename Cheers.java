public class Cheers {
        public static void main(String[] args) {
	    String Word = args[0];
            Word = Word.toUpperCase();
            int number = Integer.parseInt(args[1]);

            int length = Word.length();
            String anLetters = "AEFHILMNORSX";


            for (int i = 0; i < length; i++ ){
                if (anLetters.indexOf(Word.charAt(i)) == -1) { System.out.println("Give me a  " + Word.charAt(i) + ": " + Word.charAt(i) + "!");
                        
                } else System.out.println("Give me an " + Word.charAt(i) + ": " + Word.charAt(i) + "!");
            }

            System.out.println("What does that spell?");

            for (int i = 0; i < number; i++){
                System.out.println(Word + "!!!");
            }
        }
}
