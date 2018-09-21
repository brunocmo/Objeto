import javax.swing.JOptionPane;

public class Cadastro {

    String nome;
    String telefone;
    String endereco;
    int horario;
    int Aluguel;
    Tema t;

    void imprimirDados() {


        nome = JOptionPane.showInputDialog("Informe o nome do comprador");
        telefone = JOptionPane.showInputDialog("Informe o telefone");
        endereco = JOptionPane.showInputDialog("Informe o endereco");

        do
        {
            String strHora = JOptionPane.showInputDialog("Informe o horario (0-24)");
            horario = Integer.parseInt(strHora);
            if(horario < 0 || horario >24)
                JOptionPane.showMessageDialog(null,"Erro: Horario inexistente.");
        }
        while(horario < 0 || horario >24);

        t = new Tema();
        t.imprimirTema();
        t.resolverTema();

    }

    int CalculoValor () {

        t.resolverTema();
        return t.valor;

    }

    void exibirDados(){

        String total = "";

        total += "Nome: " + nome + '\n';
        total += "Telefone: " + telefone + '\n';
        total += "Endereco: " + endereco + '\n';
        total += "Horario: " + horario + 'h' + '\n';
        total += "Cor da mesa: " + t.cor + '\n';
        total += "Valor: " + CalculoValor() + " Reais";
        JOptionPane.showMessageDialog(null, total);
    }
}
