public class Decipher{
    public static String decrypt(String text){
        String cipherText = "";
        int length = text.length();
        
        for (int i = 0; i<length; i++){
            char ch = text.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    int num = ch-97;
                    char c = (char)(122-num);
                    cipherText += c;
                }
                else if (Character.isUpperCase(ch)){
                    int numcap = ch-65;
                    char c = (char)(90-numcap);
                    cipherText += c;
                }    
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }
}