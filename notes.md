## Java

## Sintaxe Básica

    public class Programa{

        public static void main(String[] args){

            System.out.println("ola mundo");
        }
    }


## Lembretes
* O nome do arquivo salvo deve ser exatamente igual ao nome da classe criada, inclusive as letras maiúsculas e minúsculas! Lembre-se que o Java é case-sensitive.

* Para compilar / gerar o Bytecode: javac Programa.java

* Para executar: java Programa

# Tipos primitivos em java

    int: inteiro (32 bits / positivos e negativos até 2 bilhões)

    double: número flutuante

    long: ...L (64 bits maior que dois bilhões)
        		long numeroGrande = 32323233232323L;

    short: (16 bits até 32 mil)
        short valorPequeno = 2131;

    byte: (até 127)
        byte b = 127;

    float (32 bits)
    float preco = 13.5f 

    char variavel = 'a'; ---> guarda um único caractere

    String variavel = "Nome Completo";

    
# Operações matemáticas

Divisão: para que o resulta seja um número de ponto flutuante deve-se declarara o divisor como ponto flutuante.

        // divisão inteira
        int divisao1 = 4/2;

        // divisão fracionária
        double divisao3 = 5.0 / 2;
        System.out.println(divisao3);



# Conversões matemáticas

Inteiro para double: compilador aceita (double numero = 1;)

double para inteiro: sem perda de precisão - compilador não aceita; 
                     com perda de precisão - por meio do casting (int valor = (int) flutuante)



# Instruções

## System.out.println()

Comando para imprimir algo na tela.

    System.out.println("Meu salário é " + salario);
















<br><br><br><br><br><br>
### git 
git config --local user.name "alanserafim"
git config --local user.email "alan.serafim@fatec.sp.gov.br"
git add .
git commit -m "Lesson X"