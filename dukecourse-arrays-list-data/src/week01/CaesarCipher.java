package week01;
import edu.duke.*;


public class CaesarCipher {
    public String encrypt (String input, int key){   
        // Make a stringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);
        // Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        // Count from the 0 to < length of encrypted, (call it i)
        for (int i = 0; i < encrypted.length(); i++) {
//            System.out.println(i);
        // Look at the ith character of encrypted (call it currChar)
        char currChar = encrypted.charAt(i);
            System.out.println(currChar);
        // Find the index of currChar in the alphabet.
        int idx = alphabet.indexOf(currChar);
        // If currChar is in the alphabet - In case the alphabet is not present it will return -1
            if (idx != -1){
                // Get the idxth character of the shiftedAlphabet
                char newChar = shiftedAlphabet.charAt(idx);
                // Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
    }
        return encrypted.toString();
}

public void testCaesar(){
    int key = 17;
    FileResource fr = new FileResource();
    String message = fr.asString();
    System.out.println(message);
    String encrypted = encrypt(message, key);
    System.out.println(encrypted);
    String decrypted = encrypt(encrypted, 26-key);
    System.out.println(decrypted);
    }



    public static void main(String[] args) {

        CaesarCipher cc = new CaesarCipher();
        cc.testCaesar();

    }
}