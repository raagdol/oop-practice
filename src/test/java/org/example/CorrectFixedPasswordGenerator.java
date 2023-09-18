package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

	@Override
	public String generatePassword() {
		return "abcedfgf";	// 8글자
	}
}
