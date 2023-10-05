package org.example.passwordValidator;

import org.example.passwordValidator.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

	@Override
	public String generatePassword() {
		return "abcedfgf";	// 8글자
	}
}
