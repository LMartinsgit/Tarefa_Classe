package br.com.lmartins;

public class Projeto {

	public static void main(String[] args) {
		
		Objeto objeto = new Objeto();
		
		//nome do objeto
		objeto.setNome1("     -     Automóvel     -     ");
		
		//propriedades do objeto
		objeto.setPropriedade1("1 - Rodas de liga leve 18;");
		objeto.setPropriedade2("2 - Bancos em couro com regulagem;");
		objeto.setPropriedade3("3 - Airbag para o motorista e passageiros;");
		objeto.setPropriedade4("4 - Sistema de Frenagem Autônoma;");
		objeto.setPropriedade5("5 - Motor de 530 cv;");
		objeto.setPropriedade6("6 - Piloto automático adaptativo.");
		
		System.out.println(objeto.getNome1());
		System.out.println(objeto.getPropriedade1());
		System.out.println(objeto.getPropriedade2());
		System.out.println(objeto.getPropriedade3());
		System.out.println(objeto.getPropriedade4());
		System.out.println(objeto.getPropriedade5());
		System.out.println(objeto.getPropriedade6());
		
	}

}
