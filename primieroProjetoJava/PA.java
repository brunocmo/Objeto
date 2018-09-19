package primieroProjetoJava;

import javax.swing.JOptionPane;

public class PA {
    
	int a0,r,n,res;
	Termos[] t; // eh preciso ter um vetor de referencia ao objeto
    
    void lerParametros() {
        //Ler valores do telado e armazenar no objeto
        String strA0 = JOptionPane.showInputDialog("Informe o valor inicial");
        a0 = Integer.parseInt(strA0);
        
        String strR = JOptionPane.showInputDialog("Informe a razao");
        r = Integer.parseInt(strR);
        
        String strN = JOptionPane.showInputDialog("Informe o numero de interações");
        n = Integer.parseInt(strN);
    }
    
    void imprimirPA() {
        String resposta = "";
        resposta += "a0: " + a0 + '\n';
        resposta += "r: " + r + '\n';
        resposta += "n: " + n + '\n';
        JOptionPane.showMessageDialog(null, resposta);
        
    }
    
    void calcularTermos() {
    	int a=2;
    	t = new Termos[n]; // precisamos declarar a variavel que deseja ser vetor em relacao ao numero de vetores .
    	res = 0;
    		for (int i=0; i<n;i++)
    		{	    		
    			while(true)
    			{
    					res = a0 + (a-1) * r;
    						a++;
    						break;
    			}
    		t[i] = new Termos(); // temos que declarar aos vetores, cada variavel do objeto(Termos).
    		t[i].valor = res;
    		t[i].posicao = i;

    		}
    }
    
    void resultado() {
        for(int i=0;i<n;i++)
        {	
        	System.out.println(t[i].valor + " -- " + t[i].posicao);      
        }
    }
	
	

}
