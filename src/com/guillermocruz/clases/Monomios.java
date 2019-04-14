package com.guillermocruz.clases;

public class Monomios {
	private char signo;
	private int coeficiente;
	private char variable;
	private byte exponente;
	
	public Monomios() {
		
	}
	
	public Monomios(char signo, int coeficiente, byte exponente) {
		super();
		this.signo = signo;
		this.coeficiente = coeficiente;
		
		if(exponente == 0) {
			this.exponente = 0;
		}else {
			this.exponente = exponente;
		}
		
		if(exponente == 0) {
			variable = ' ';
		}else {
			variable = 'x';
		}
	}

	public char getSigno() {
		return signo;
	}

	public void setSigno(char signo) {
		this.signo = signo;
	}

	public int getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(int coeficiente) {
		this.coeficiente = coeficiente;
	}

	public char getVariable() {
		return variable;
	}

	public void setVariable(char variable) {
		this.variable = variable;
	}

	public byte getExponente() {
		return exponente;
	}

	public void setExponente(byte exponente) {
		this.exponente = exponente;
	}
	
	public int escalar(int x) {
		int escalar;
		if(exponente == 0) {
			 escalar =coeficiente;
		}else{
			escalar = (int) (coeficiente * Math.pow((double) x,(double) exponente));	
		}
		return escalar;
	}
	
	
	public Monomios suma (Monomios a, Monomios b) {
		if(a.exponente == b.exponente) {
			
			if (a.signo == b.signo) {
				a.coeficiente = a.coeficiente  + b.coeficiente;
				
			} else if ((a.signo == '-') && (a.coeficiente < b.coeficiente)) {
				a.signo = '+';
				a.coeficiente = Math.abs((-a.coeficiente)  + b.coeficiente);
				
			}else if ((a.signo == '+') && (a.coeficiente < b.coeficiente)) {
				a.signo = '-';
				a.coeficiente = Math.abs((a.coeficiente)  + -(b.coeficiente));
				
			}else {
				a.signo = '-';
				a.coeficiente = Math.abs((-a.coeficiente  + b.coeficiente));//esto hay que quitar
			}
		}
		return a;
	}
	
	public void multiplicacionMonomios (Monomios a, Monomios b) {
		if(a.exponente == b.exponente) {
			
			if (a.signo == b.signo) {
				a.signo = '+';
				a.coeficiente = a.coeficiente  * b.coeficiente;
				
			} else if ((a.signo == '-') && (a.coeficiente < b.coeficiente)) {
				a.signo = '-';
				a.coeficiente = Math.abs((-a.coeficiente)  * b.coeficiente);
				
			}else if ((a.signo == '+') && (a.coeficiente < b.coeficiente)) {
				a.signo = '-';
				a.coeficiente = Math.abs((a.coeficiente)  * -(b.coeficiente));
				
			}
		}
	}
	
	@Override
	public String toString() {
		String monomio;
		if (exponente == 0) {
			monomio =Character.toString(signo) + Integer.toString(coeficiente);
		}else {
			monomio = Character.toString(signo) + coeficiente +Character.toString(variable) + '^' + exponente;
		}
		
		return monomio;
	}
	
	
}
