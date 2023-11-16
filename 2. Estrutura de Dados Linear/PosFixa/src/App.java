import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String infixa, posfixa;

        System.out.print("Informe a expressão infixa --> ");
        infixa = sc.nextLine();

        posfixa = converter(infixa);

        System.out.println("Expressão pós-fixa --> " + posfixa);

    }

    private static String converter(String infixa) {
		Stack<Character> pilha = new Stack<Character>();
		String posfixa = "";
		char ch;
		
		for(int i = 0; i < infixa.length(); i++) {
			ch = infixa.charAt(i);
			switch(ch) {
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':
					while(!pilha.isEmpty() && (prioridade(ch) <= prioridade(pilha.peek()))) {
						posfixa += pilha.pop();
					}
					pilha.push(ch);
					break;
				case '(':
					pilha.push(ch);
					break;
				case ')':
					while(pilha.peek() != '(') {
						posfixa += pilha.pop();
					}
					pilha.pop();
					break;
				default:
					posfixa += ch;
			}
		}
		
		// será que sobrou algum operador na pilha??
		while(!pilha.isEmpty()) {
			posfixa += pilha.pop();
		}
		
		return posfixa;
	}
	
	private static int prioridade(char ch) {
		int p = 0;
		
		switch(ch) {
			case '(':
				p = 1;
				break;
			case '+':
			case '-':
				p = 2;
				break;
			case '*':
			case '/':
			case '%':
				p = 3;
				break;
			default:
				p = 4;
		}
		
		return p;
	}
}
