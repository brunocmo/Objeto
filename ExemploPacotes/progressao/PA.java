package progressao;

public class PA {

	int a0;
	int n;
	int r;
	
	Termo[] termos;
	
	public PA(int _a0, int _n, int _r) {
		a0 = _a0;
		n = _n;
		r = _r;
		termos = null;
		
	}
	
	public int CalculoPA() {
		int soma = 0;
		for (Termo t : termos) {
			soma += t.valor;
		}
		return soma;
	}
	
	public Termo[] computartermos() {
		//instanciar o vetor de termos
		termos = new Termo[n];
		
		for(int i=0; i<n; i++) {
			//criar um termo
			Termo t = new Termo();
			t.posicao = i;
			t.valor = a0 + i*r;
			
			//adicionar termo ao vetor
			termos[i] = t;
			
		}
		return termos;
	}
}
