package com.nfwork.dbfound.exception;

public class DBFoundPackageException extends DBFoundRuntimeException{

	private static final long serialVersionUID = -2995635750158569598L;

	public DBFoundPackageException(String message,Exception e) {
		super(e);
		setMessage(message);
	}
	
	public DBFoundPackageException(Exception e) {
		super(e);
	}
	
}
