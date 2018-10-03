//import progressao.PA;
//import progressao.Termo;
import progressao.*;

public class Principal {
	public static void main(String[] args) {
		PA pa = new PA(1, 10, 2);
		
		Termo[] t = pa.computartermos();
		for(Termo temp : t) {
			System.out.println(temp);
		}
	}
}
