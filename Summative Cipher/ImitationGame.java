import java.util.Scanner;
public class ImitationGame{
    public static void main(){
        Cipher c = new Cipher();
        Decipher d = new Decipher();
        
        System.out.println("Enter your message to be encrypted:");
        Scanner m = new Scanner(System.in);
        String message = m.nextLine();
        
        String cipher = c.encrypt(message);
        System.out.println("Encrypted message: "+cipher);
        
        String decrypted = d.decrypt(cipher);
        System.out.println("Decrypted message: "+decrypted);
    }
}