/**
 * Encrytion of ciphter alphbet Java Class.
 * Created by: Bryen Xie
 * Created on: April 14th, 2016
 * This progarm will encrypt a message from original Alphabet to cipher Alphabet.
 */
import java.io.File;
import java.util.Scanner;  
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Encryption  
{
  public static void main (String[] args) throws FileNotFoundException
  {
    //this is the main method  that will write the encrypted message to the file
    File plaintext1= new File("plaintext1.txt");
    File plaintext2= new File("plaintext2.txt");
    File ciphertext1= new File("ciphertext1.txt");
    File ciphertext2= new File("ciphertext2.txt");
    //files we will
    /////////////////////
    //file1
    Scanner in1 = new Scanner (plaintext1);
    String cipher1 = in1.nextLine();
    String encryptedString1 = "";
    while(in1.hasNext())
     {
      encryptedString1 = encryptedString1 + encrypt(in1.nextLine(),cipher1) +"\r\n";
     }//end of while
    in1.close();//input close
    PrintWriter print1 = new PrintWriter(ciphertext1);
    print1.print(cipher1 +"\r\n"+encryptedString1);
    print1.close();//output close
    
    //File 2
    Scanner in2 = new Scanner (plaintext2);
    String cipher2 = in2.nextLine();
    String encryptedString2 = "";
    while(in2.hasNext())
     {
      encryptedString2 = encryptedString2 + encrypt(in2.nextLine(),cipher2) +"\r\n";
     }//end of while
    
    in2.close();
    PrintWriter print2 = new PrintWriter(ciphertext2);
    print2.print(cipher2 +"\r\n"+encryptedString2);
    print2.close();
    
    System.out.println("Your message had benn encrypted, please go the encryption folder to find the cipher text");
    //tell the user the programm works
  }
  public static String encrypt(String originalText, String cipherAlphabet){
    /* A method to encrypt a message from a specific file.   
     * @param originalText, the message you want to convert
     * @param cipherAlphabet, the cipherAlphabet that you want to replace with original Alphabet
     * @return ciphertext1, the first encrypt message 
     * @return ciphertext2, the second encrypt message
     */
    String origAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String encrypted = "";
    for(int i =0 ; i < originalText.length();i++){
      if(Character.isLetter(originalText.charAt(i))){
        int index = origAlphabet.indexOf(originalText.charAt(i));
        encrypted = encrypted + cipherAlphabet.charAt(index);
      }//end of if
      else{
        encrypted = encrypted + originalText.charAt(i);
      }//end of if
    }// end of for
    return encrypted;
  }//end of encrypt
}//end of the class