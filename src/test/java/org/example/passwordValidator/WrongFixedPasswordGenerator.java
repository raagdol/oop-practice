package org.example.passwordValidator;

import org.example.passwordValidator.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

	@Override
	public String generatePassword() {
		return "ab";	// 2글자
	}
}
