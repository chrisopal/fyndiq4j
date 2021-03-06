package com.salesmore.yak.integration.fyndiq.api.exceptions;

import com.google.common.base.MoreObjects;

/**
 * Captures Server based Errors (Return Codes between 500 - 600)
 *
 */
public class ServerResponseException extends ResponseException {

	private static final long serialVersionUID = 1L;

	private StatusCode code;

	public ServerResponseException(String message, int status) {
		super(message, status);
		code = StatusCode.fromCode(status);
	}

	public ServerResponseException(String message, int status, Throwable cause) {
		super(message, status, cause);
		code = StatusCode.fromCode(status);
	}

	/**
	 * @return the status code mapping for the current {@link #getStatus()}
	 */
	public StatusCode getStatusCode() {
		return code;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues()
				     .add("message", getMessage()).add("status", getStatus()).add("status-code", code)
				     .toString();
	}

}
