/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telegramapi;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author dogus
 */
public class TelegramApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String response;
        try {
            String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";

            String apiToken = "APITOKEN";
            String chatId = "chatID";
            String text = "sendData";

            urlString = String.format(urlString, apiToken, chatId, text);
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            StringBuilder sb = new StringBuilder();
            InputStream is = new BufferedInputStream(conn.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine = "";
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            response = sb.toString();
        }catch (Exception ex){

        }
    }
    
}
