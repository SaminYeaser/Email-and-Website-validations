import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samin
 */
public class file {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        boolean j = false;

        Scanner f = new Scanner(new File("input"));
        String a = null;
       
        int n=f.nextInt();
             f.nextLine();
             int b=1;

      
        String s = null;
        while(f.hasNext() && b<=n){
            s = f.nextLine();
            String[] k = s.split("\\.");
        if(web(s) && mail(s)){
            System.out.println("Valid website and email at line "+ b);
        }else if(web(s)){
            System.out.println("valid website at line "+ b);
        }else if(mail(s)){
            System.out.println("valid email at line "+ b);
        }else if(web(s)==false && mail(s)==false){
            System.out.println("No valid website nor email found in line "+b);
        }
        b++;

    }
    }
public static boolean web(String s) throws FileNotFoundException, IOException {
        ArrayList<String> t = new ArrayList(Arrays.asList("www"));
        ArrayList<String> t2 = new ArrayList(Arrays.asList("org","net","bd","com"));
      boolean website = false;

            int j=1;

            String[] k = s.split("\\.");
            for (int k1 = 0;k1<k.length;k1++) {
                if (t.contains(k[k1]) && t2.contains(k[k.length-1]) ) {
                        website = true;

                } else {
                    website = false;
                   
                }
                j++;
                break;
            }
        
return website;
    }

public static boolean mail(String s) throws FileNotFoundException, IOException {
    
    

        ArrayList<String> t = new ArrayList(Arrays.asList("gmail.com","yahoo.com","hotmail.com","outlook.com","bracu.ac.bd"));
      boolean email = false;

            int j=0;
            int flag = 0;


            String[] k = s.split("@");
             
            for (int k1 =0;k1<k.length;k1++) {
                ArrayList<Character> a = new ArrayList<>();
                String w = k[0];
//                for (char ch : k[k1].toCharArray()) { 
//  
//            a.add(ch); 
//        } 
                if((int)w.charAt(0)>=48 && (int)w.charAt(0)<=57){
                    email = false;
                }
                else if (t.contains(k[k.length-1])) {
                    email = true;
                }
                
                else {
                    email = false;
                   
                }
                j++;
                break;
            }
            
return email;
    }
}