
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;		
		
		//bolean simples
		//boolean acompanhado = true;
		
		//express�o boleana
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 || acompanhado /* == true*/) {
			System.out.println("Seja bem vindo.");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar.");
			}
		}
}

// ou: ||
// e:  &&
// igual: ==