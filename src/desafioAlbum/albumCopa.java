
package desafioAlbum;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class albumCopa {

	public static void main(String[] args) {
		String var;
		int numAl, numFigt, faltam=0, comprar;
		int[] numComp = new int[300];
		int[] unicos = new int[numComp.length];
		
		var= JOptionPane.showInputDialog("Digite o n�mero de figurinhas que cabem no �lbum");
		numAl= Integer.parseInt(var);
		var=JOptionPane.showInputDialog("Quantas figurinhas voc� comprou?");
		numFigt= Integer.parseInt(var);
		int cont = 0;
		
		if(numAl<=100 && numAl>0 && numFigt>0 && numFigt <= 300) {
			
			for(int i=0; i<numFigt; i++) {
				var= JOptionPane.showInputDialog("Entre com o n�mero das figurinhas compradas");
				numComp[i]=Integer.parseInt(var);
				boolean iguais = false;
				for(int j=0; j<cont; j++) {
					if(unicos[j] == numComp[i]) {
						iguais = true;						
					}
					
				}
				if(!iguais) {
					unicos[cont++] = numComp[i];
				}
			}
			unicos =Arrays.copyOf(unicos,cont);
			
			for( int i = 0 ; i < unicos.length ; i++ ) {
				faltam++;
	            System.out.print(  unicos[ i ] + " - " );
	        }
			System.out.println();
			comprar= numAl-faltam;
			System.out.print(comprar);
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O n�mero de figuras n�o corresponde ao n�mero em mercado");
		}
		
		
	

	}

}
