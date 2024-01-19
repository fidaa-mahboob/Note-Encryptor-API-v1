package com.fidaamahboob.app;

public class Encyrypt {
    public String encryptMessage(String message, int shift){
        StringBuilder encryptedMessage = new StringBuilder();

        message = message.toLowerCase();

        for (int position = 0; position < message.length(); position++){
            char value = message.charAt(position);

            if (Character.isLetter(value)){
                value = (char)((value - 'a' + shift + 26) % 26 + 'a');
            }

            encryptedMessage.append(value);
        }

        return encryptedMessage.toString();
    }
}
