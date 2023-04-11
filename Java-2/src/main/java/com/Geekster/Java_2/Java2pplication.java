package com.Geekster.Java_2;

import org.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class Java2pplication {

	public static void main(String[] args) throws IOException {
		URL getUrl = new URL("https://api.zippopotam.us/us/33162");
		HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
		connection.setRequestMethod("GET");


		int responseCode = connection.getResponseCode();

		if (responseCode == 200) {


			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder jsonResponseData = new StringBuilder();
			String readLine = null;


			while ((readLine = in.readLine()) != null) {
				jsonResponseData.append(readLine);
			}

			in.close();
			JSONObject masterData = new JSONObject(jsonResponseData.toString());

			System.out.println( masterData);

		} else {
			System.out.println("This is not valid URL- " + responseCode);
		}
	}

}
