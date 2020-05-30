package com.lmy.oauth.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * 验证码异常
 * @author lmy
 */
public class ValidateCodeException extends AuthenticationException {
	private static final long serialVersionUID = -7285211528095468156L;

	public ValidateCodeException(String msg) {
		super(msg);
	}
}
