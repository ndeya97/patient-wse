package com.ynovgroup.patientwse.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import com.google.auth.oauth2.GoogleCredentials;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FirebaseInitialize {
	
	@PostConstruct
	public void initialize() {
		try {
		FileInputStream serviceAccount =
				new FileInputStream("classpath:serviceAccount.json");
			
			FirebaseOptions options = new FirebaseOptions.Builder()
						  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
						  .setDatabaseUrl("https://patient-ws.firebaseio.com")
						  .build();

			FirebaseApp.initializeApp(options);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	} 
}
