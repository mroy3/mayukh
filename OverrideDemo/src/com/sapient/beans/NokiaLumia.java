package com.sapient.beans;

public class NokiaLumia extends Nokia1100 {

	public int price = 10000;
	
	public void doConverse() {
		System.out.println("3g converse");
	}

	public void CaptureVideo() {
		System.out.println("Capture Video");
	}

	public void do2gconverse() {
		super.doConverse();// Access Superclass method
	}
}
