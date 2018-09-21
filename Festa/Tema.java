import javax.swing.JOptionPane;

public class Tema {

    char A;
    int valor;
    String cor;

    void imprimirTema() {

        String strA = JOptionPane.showInputDialog("Informe o tema da festa(Castelo, Boneca, Pirata, Flash)");
        A = strA.charAt(0);
        }

     void resolverTema(){

        switch(A){
             case 'C':
             case 'c': valor = 1000; cor = "Branco";   break;
             case 'B':
             case 'b': valor = 2500; cor = "Amarelo";  break;
             case 'P':
             case 'p': valor = 3000; cor = "Preto";    break;
             case 'F':
             case 'f': valor = 1500; cor = "Vermelho"; break;
        }

     }
}

