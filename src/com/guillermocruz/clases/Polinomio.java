package com.guillermocruz.clases;

public class Polinomio extends Monomios {
	
	private Monomios[] polinomios = new Monomios[100];
	private byte grade;
	private byte CantidadDeMonomios;
	
	
	
	public Polinomio() {
		this.CantidadDeMonomios = 0;
	}


	public Monomios[] getPolinomios() {
		return polinomios;
	}


	public void setPolinomios(Monomios monomio) {
		
		if (CantidadDeMonomios != 0) {
			byte exp = monomio.getExponente();
			byte exp2 = polinomios[CantidadDeMonomios -1].getExponente();
				if (exp2 < exp) {
					this.polinomios[CantidadDeMonomios ] = monomio;
					CantidadDeMonomios++;
				}
		}else if (CantidadDeMonomios == 0){
			this.polinomios[CantidadDeMonomios] = monomio;
			CantidadDeMonomios++;
		}
		
		this.grade = monomio.getExponente();
		
	}
	


	public byte getGrade() {
		return grade;
	}


	public void setGrade(byte grade) {
		this.grade = grade;
	}


	public byte getCantidadDeMonomios() {
		return CantidadDeMonomios;
	}



	public void setCantidadDeMonomios(byte cantidadDeMonomios) {
		CantidadDeMonomios = cantidadDeMonomios;
	}

	public int resultado (Polinomio poli, int x) {
		int resultado = 0;
		int iterador = Math.abs((int)poli.polinomios.length-102);
		while (iterador > 0) {
			resultado = resultado +poli.polinomios[iterador - 1].escalar(x);
			iterador--;
		}
		return resultado;	
	}

	public void insertar (Polinomio poli , Monomios monomio) {
		int i = 0;
		int iterador = poli.CantidadDeMonomios;
		int ban = 0;
		if (monomio.getExponente() > poli.getGrade()) {
			setPolinomios(monomio);
		}else {
			while(iterador > 0) {
				//i = Math.abs((int)poli.polinomios.length-102);
				if (poli.polinomios[iterador-1].getExponente() == monomio.getExponente()) {
					poli.polinomios[iterador - 1] = monomio;
					ban = 1;
					
				}
				if ((poli.polinomios[iterador-1].getExponente() < monomio.getExponente()) && ban == 0) {
					int posicionauxiliar = iterador;
					this.CantidadDeMonomios++;
					int o = this.CantidadDeMonomios;
					while(o > posicionauxiliar +1) {
						poli.polinomios[o - 1] = poli.polinomios[o -2];
						o--;
					}
					poli.polinomios[o - 1] = monomio;
					
					iterador = 1;
				}
				
			iterador--;	
			}
			
		}
		
		
	}
	//no esta impl
	public Polinomio sumaPolinomio (Polinomio a, Polinomio b){
		Polinomio c = new Polinomio();
		int elementosA = a.CantidadDeMonomios;
		int elementosB = b.CantidadDeMonomios;
		int i = 0;
		int j = 0;
		int k = 0;
		while (elementosA  > i || elementosB  > j) {
			if (a.polinomios[i].getExponente() == b.polinomios[j].getExponente()) {
				c.polinomios[k] = suma(a.polinomios[i], b.polinomios[j]);
				i++;
				j++;
				k++;
				c.CantidadDeMonomios++;
			}else
			{i++;
			j++;}
				/*else if (a.polinomios[i].getExponente() > b.polinomios[j].getExponente()) {
				Monomios aux = new Monomios();
				aux = b.polinomios[j];
				c.polinomios[k] = aux;
				//c.insertar(c, b.polinomios[j]);
				j++;
				
				k++;
				
				c.CantidadDeMonomios++;
			}else if (a.polinomios[i].getExponente() < b.polinomios[j].getExponente()) {
				Monomios aux = new Monomios();
				aux = a.polinomios[i];
				c.polinomios[k] = aux;
				
				//c.insertar(c, b.polinomios[i]);
				i++;
				k++;
				
				c.CantidadDeMonomios++;
			}*/
			
		}
		
		return c;
		
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		int i = 0;
		String poli = "";
		while (CantidadDeMonomios > i) {
		poli = poli + ' ' + polinomios[i].toString();
		i++;
		}
		return poli;
	}
	
	
	

}
