package io.nio.ex05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String str;
            while ((str = br.readLine()) != null) {
                if (str.contains("Долар США"))
                System.out.println(str);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
