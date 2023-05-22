import java.util.*;
import java.io.*;

class PalindromicSubstring {
    public static String PalindromicSubstring2(String strd){
        int left = 0, right = 0 ;
        String s = "";
        String s3 = "";
        for(int i = 0; i<str.length()-1 ; i++){
            left = -1; right = -1;
            s="";
            if(str.charAt(i) == str.charAt(i+1)){
                s+=str.charAt(i);
                s= str.charAt(i+1)+s;
                left = i-1;
                right = i+2;
            }

            while(left >= 0 && right < str.length()){
                if(str.charAt(left) == str.charAt(right)){
                    s+=str.charAt(right);
                    s= str.charAt(left)+s;
                    if(s.length() > s3.length()){
                        s3 = s;
                    }
                    left--;
                    right++;
                }
                else{
                    if(s.length() == 2)
                        s="";
                    if(s.length() > s3.length()){
                        s3 = s;
                        s="";
                    }
                    break;
                }
            }

        }
        if(s.length() > s3.length()){
            s3 = s;
            s="";
        }
        return s3;
    }
    public static String PalindromicSubstring1(String str) {
        int left = 0, right = 0;
        String s = "";
        String s3 = "";
        for(int i = 0; i<str.length()-2 ; i++){
            s="";
            left = -1; right = -1;
            if( str.charAt(i) == str.charAt(i+2)){
                s= str.charAt(i)+s;

                s+=str.charAt(i+1);
                s+= str.charAt(i+2);
                left = i-1;
                right = i+3;
            }

            while(left >= 0 && right < str.length()){
                if(str.charAt(left) == str.charAt(right)){
                    s+=str.charAt(right);
                    s= str.charAt(left)+s;
                    if(s.length() > s3.length()){
                        s3 = s;
                    }
                    left--;
                    right++;
                }
                else{
                    if(s.length() == 2)
                        s="";
                    if(s.length() > s3.length()){
                        s3 = s;
                        s="";
                    }
                    break;
                }
            }
        }
        if(s.length() > s3.length()){
            s3 = s;
            s="";
        }
        return s3;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String ans1 = PalindromicSubstring1(input);
        String ans2 = PalindromicSubstring2(input);

        if(ans1.length() <= 2 && ans2.length() <=2){
            System.out.print("none");
        }
        else if(ans1.length() > ans2.length()){
            System.out.print(ans1);
        }
        else{
            System.out.print(ans2);
        }
    }

}