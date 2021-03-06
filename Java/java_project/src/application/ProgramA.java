package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ProgramA {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Bianca");
		list.add("Heitor");//SIMPLES ADIÇÃO
		list.add(2, "Marco"); // ADICIONA NA LISTA POSIÇÃO 2
		list.remove("Bob"); //REMOVE BOB
		list.remove(1);//REMOVE POSIÇÃO 1 ALEX
		System.out.println(list.size()); //TAMANHO DA LISTA
		
		for (String obj: list) {
			System.out.println(obj);
		}	
		System.out.println("---------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------------------");
		System.out.println("Index of Heitor: " + list.indexOf("Bianca"));
		System.out.println("Index of Heitor: " + list.indexOf("Heitor"));
		System.out.println("Index of Heitor: " + list.indexOf("Marco"));//resultado -1 quando a lista não conter a busca
		
		System.out.println("---------------------------------");
		list.add("Maria");
		list.add("Marco");
		for (String obj: list) {
			System.out.println(obj);
		}
		System.out.println("---------------------------------");
		
		List<String> result = list.stream().filter(x-> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String obj: result) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------------------");
		String name = list.stream().filter(x->x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
		String name2 = list.stream().filter(x->x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
		
	}

}
