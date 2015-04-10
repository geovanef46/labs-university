
public class Test {

	//algoritmo menos eficiente
	private int algoritmoInicial() {
		int s = 0;
		for (int i = 1; i < 20; i++) {
		s=s+i*i;
		}
		return s;
		}
	//algoritmo mais eficiente
	private int algoritmoRecursivo(int resultExpre,int incremento,int qtdDeVezes) {
		int s=resultExpre;
		int i=incremento;
		int n=qtdDeVezes;
		if (1 < n) {
				s=s+i*i;
				n--;
				s=algoritmoRecursivo(s,i+1,n);
		}
		return s;	
	}
	
	public static void main(String[] args) {
		Test t=new Test();		
		System.out.println("inicial "+t.algoritmoInicial());
		long tempo=System.currentTimeMillis();
		System.out.println("recursiva "+t.algoritmoRecursivo(0,1,20));
		System.out.println("tempo recursivo:"+(System.currentTimeMillis()-tempo));
	}
}
