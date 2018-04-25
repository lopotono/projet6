package org.projet.escalade.model.exception;

public class FunctionalException extends Exception {
		
	private static final long serialVersionUID = 8804435547055149079L;
	
	public FunctionalException(String pMessage) {
        super(pMessage);
	}
        
    public FunctionalException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }
}
