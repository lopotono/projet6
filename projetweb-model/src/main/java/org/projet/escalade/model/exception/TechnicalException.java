package org.projet.escalade.model.exception;

public class TechnicalException extends Exception {
	
	private static final long serialVersionUID = -5533406561285976220L;

	public TechnicalException(String pMessage) {
        super(pMessage);
    }
	
	 public TechnicalException(String pMessage, Throwable pCause) {
	        super(pMessage, pCause);
	    }	
}
