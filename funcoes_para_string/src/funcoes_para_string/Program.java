package funcoes_para_string;

public class Program {

	public static void main(String[] args) {
		
		 String original = " abcde FGHIJ ABC abc DEFG   ";

		 String s01 = original.toLowerCase(); // Vai Deixar Tudo Minúsculo 
		 String s02 = original.toUpperCase(); // Vai Deixar Tudo Maiúsculo 
		 String s03 = original.trim(); // Vai eliminar os espaços no final e começo da string 
		 String s04 = original.substring(2); // Vai continuar a string do 3 caractere e elimina os 2 
		 String s05 = original.substring(2, 9); // Faz a mesma coisa do acima mas limita ate 9
		 String s06 = original.replace('a', 'x'); // Troca de caractres
		 String s07 = original.replace("abc", "xy");// Troca de caractres
		 int i = original.indexOf("bc");
		 int j = original.lastIndexOf("bc");
		 
		 System.out.println("Original: -" + original + "-");
		 System.out.println("toLowerCase: -" + s01 + "-");
		 System.out.println("toUpperCase: -" + s02 + "-");
		 System.out.println("trim: -" + s03 + "-");
		 System.out.println("substring(2): -" + s04 + "-");
		 System.out.println("substring(2, 9): -" + s05 + "-");
		 System.out.println("replace('a', 'x'): -" + s06 + "-");
		 System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		 System.out.println("Index of 'bc': " + i);
		 System.out.println("Last index of 'bc': " + j);

	}

}