package com.example.demo.shared;

import java.util.UUID;

public class Utils {

	public String generateUserId() {
		return UUID.randomUUID().toString();
	}

}
