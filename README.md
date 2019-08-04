# Desafio-OBI
Desafio álbum de figurinhas
Álbum da copa
Em ano de Copa do Mundo de Futebol, o álbum de figurinhas oficial é sempre um grande sucesso entre crianças e também entre adultos.
Para quem não conhece, o álbum contém espaços numerados de 1 a N para colar as figurinhas; cada figurinha, também numerada de 1 a N, 
é uma pequena foto de um jogador de uma das seleções que jogará a Copa do Mundo. O objetivo é colar todas as figurinhas nos respectivos
espaços no álbum, de modo a completar o álbum (ou seja, não deixar nenhum espaço sem a correspondente figurinha).
As figurinhas são vendidas em envelopes fechados, de forma que o comprador não sabe quais figurinhas está comprando, e pode ocorrer de comprar 
uma figurinha que ele já tenha colado no álbum.
Para ajudar os usuários, a empresa responsável pela venda do álbum e das figurinhas quer criar um aplicativo que permita gerenciar facilmente
as figurinhas que faltam para completar o álbum e está solicitando a sua ajuda.
Dados o número total de espaços e figurinhas do álbum, e uma lista das figurinhas já compradas (que pode conter figurinhas repetidas), 
sua tarefa é determinar quantas figurinhas faltam para completar o álbum.

Entrada
A primeira linha contém um inteiro N indicando o número total de figurinhas e espaços no álbum. A segunda linha contém um inteiro M indicando 
o número de figurinhas já compradas. Cada uma das M linhas seguintes contém um número inteiro X indicando uma figurinha já comprada.

Saída
Seu programa deve produzir uma única linha contendo um inteiro, o número de figurinhas que falta para completar o álbum.



package desafioAlbum;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class albumCopa {

	public static void main(String[] args) {
		String var;
		int numAl, numFigt, comprar;  // Número de espaços no álbum, quantidade de figuras compradas.
		int cont = 0, faltam=0;       //váriavel usada para contar as figuras e as figuras que faltam.
		int[] numComp = new int[300]; //Quantidade possível de compra de figurinhas.
		int[] unicos = new int[numComp.length]; //Utilizado para armazenar os números de figurinhas sem repetição.
		
		var= JOptionPane.showInputDialog("Digite o número de figurinhas que cabem no álbum");
		numAl= Integer.parseInt(var);
		var=JOptionPane.showInputDialog("Quantas figurinhas você comprou?");
		numFigt= Integer.parseInt(var);
		
		
		if(numAl<=100 && numAl>0 && numFigt>0 && numFigt <= 300) {
			
			for(int i=0; i<numFigt; i++) {
				var= JOptionPane.showInputDialog("Entre com o número das figurinhas compradas");
				numComp[i]=Integer.parseInt(var);
				boolean iguais = false;
				for(int j=0; j<cont; j++) {
					if(unicos[j] == numComp[i]) { //Comparação para retirar os números repetidos
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
	            //System.out.print(  unicos[ i ] + " - " ); Mostra o conteúdo do array sem repetição
	        }
			System.out.println();
			comprar= numAl-faltam;
			System.out.print(comprar); //Quantidade de figuras que falta para completar o álbum
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "O número de figuras não corresponde ao número em mercado");
		}
		
		
	

	}

}

