import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Aluguel {

    public static void main(String[] args) {

        Cadastro[] cliente;
        cliente = new Cadastro[4];

        for(int i=0;i<=3;i++)
        {
            cliente[i] = new Cadastro();
            cliente[i].imprimirDados();
        }

            while(true)
            {
                String strP = JOptionPane.showInputDialog("Qual cliente deseja analisar");
                int p = Integer.parseInt(strP);
                if(p == 4)
                    break;
                else
                    cliente[p].exibirDados();
            }

    }
}