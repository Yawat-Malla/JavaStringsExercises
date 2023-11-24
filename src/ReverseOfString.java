public class ReverseOfString {
    public static void main(String[] args) {
        String word= "Random word";
        for(int i = word.length()-1;i>=0;i-=1){
            System.out.print("The reverse of the stirng is: " + word.charAt(i));
        }
    }
}
