package controller;

public class Controle {

	public int palindromo(int num, int palin) {
		// TODO Auto-generated method stub
		if(num==0) {
			return palin/10;
		}
		palin=palin+(num%10);
		return palindromo(num/10,palin*10);
	}

	public boolean condicao(int num, int palindromo) {
		// TODO Auto-generated method stub
		return (palindromo==num ? true : false);
	}

}
