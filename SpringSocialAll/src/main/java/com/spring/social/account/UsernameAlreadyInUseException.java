
package com.spring.social.account;

@SuppressWarnings("serial")
public class UsernameAlreadyInUseException extends Exception {
	public UsernameAlreadyInUseException(String username) {
		super("The username '" + username + "' is already in use.");
	}
}
