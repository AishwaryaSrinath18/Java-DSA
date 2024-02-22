import java.util.Scanner;

/*
 Print the word with odd letters as
P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M
*/
public class WordArrangement {
    public static void oddArangement(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i == j || i+j+1 == s.length()){
                    System.out.print(s.charAt(j)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of odd size:");
        String str = sc.next();
        if(str.length()%2 == 0){
            System.out.println("Wrong input. Give string of odd length");
            return;
        }
        oddArangement(str);
    }
}
