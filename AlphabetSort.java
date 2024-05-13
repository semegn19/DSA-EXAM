import java.util.Arrays;

public class AlphabetSort {
    static void sortbubble(char [] alphabets){
        for(int i=alphabets.length-1;i>=0;i--){
            for(int j=0; j<i; j++){
                if(alphabets[j]>alphabets[j+1]){
                    char temp = alphabets[j];
                    alphabets[j] = alphabets[j+1];
                    alphabets[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char [] alphabets= new char[5];

        alphabets[0]='e';
        alphabets[1]='B';
        alphabets[2]='i';
        alphabets[3]='D';
        alphabets[4]='a';
        sortbubble(alphabets);
        System.out.println(Arrays.toString(alphabets));
    }

}
