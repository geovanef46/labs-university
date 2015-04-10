

public class BubbleSortRec {
	
public int[] bubbleSortRec(int A[],int tamanhoArray) {
	int troca;
	int ultimo=tamanhoArray;
	if(A[ultimo] < A[ultimo-1]){
		troca = A[ultimo];
		A[ultimo] = A[ultimo-1];
		A[ultimo-1] = troca;
		ultimo--;
		for (int elemento : A) {
			System.out.print("["+elemento+"]");
		}
		System.out.println("\n");
	}else{
	ultimo--;}
	if (ultimo>0) {
		bubbleSortRec(A,ultimo);	
	}else{
		if(estaOrdenado(A)==false){
		ultimo=A.length-1;
		bubbleSortRec(A,ultimo);}
	}
	
	return A;
}


private void bubbleSortRecur(int A[]) {
	bubbleSortRec(A,A.length-1);
}

private boolean estaOrdenado(int A[]) {
for (int i = 0; i < A.length-1; i++) {
	if (A[i]<= A[i+1]) {
	}else{
		return false;
	}
}
return true;
}

public static void main(String[] args) {
	int A[]={2,9,5,7,1,23,5,8,3,0,4,14,13,6,12};
	BubbleSortRec bubble=new BubbleSortRec();
	long tempo=System.currentTimeMillis();
	bubble.bubbleSortRecur(A);
	System.out.println(System.currentTimeMillis()-tempo);
}
}
