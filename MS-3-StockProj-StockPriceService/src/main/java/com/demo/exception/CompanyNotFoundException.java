package com.demo.exception;

public class CompanyNotFoundException extends RuntimeException{
	String msg="";
	public CompanyNotFoundException(String msg){
		this.msg=msg;
	}
}
