public class StringElements {
    public static void main(String[] args) {
        String word = "Random word";
        word = word.toLowerCase();
        for(int i= 0;i<word.length();i++){
            System.out.print("Character at index " + i + ": ");
            System.out.println(word.charAt(i));

        }
    }
}
