package com.fidaamahboob.app;

public class Decrypt {
    public String decryptMessage(String message, int shift){
        StringBuilder decryptedMessage = new StringBuilder();
        
        for (int position = 0; position < message.length(); position++){
            char value = message.charAt(position);

            if(Character.isLetter(value)){
                value = (char)((value - 'a' - shift + 26) % 26 + 'a');
            }

            decryptedMessage.append(value);
        }
        
        return decryptedMessage.toString();
    }
}
