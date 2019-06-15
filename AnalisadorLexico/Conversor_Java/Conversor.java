package model;

import java.util.ArrayList;
import java.util.List;

public class Conversor {
	
	public static String ConverteParaBinario (int entrada) {
		int base = 2;
		List<Integer> restos = new ArrayList<Integer>();
		while(entrada >= base) {
			restos.add(entrada%base);
			entrada = entrada/base;
		}
		String resposta = String.valueOf(entrada);
		for (int i = restos.size()-1; i >= 0; i--) {
			resposta += String.valueOf(restos.get(i));
		}
		return resposta;
	}
	
	public static String ConverteParaOctal (int entrada) {
		int base = 8;
		List<Integer> restos = new ArrayList<Integer>();
		while(entrada >= base) {
			restos.add(entrada%base);
			entrada = entrada/base;
		}
		String resposta = String.valueOf(entrada);
		for (int i = restos.size()-1; i >= 0; i--) {
			resposta += String.valueOf(restos.get(i));
		}
		return resposta;
	}
	
	public static String ConverteParaHexa (int entrada) {
		int base = 16;
		List<String> restos = new ArrayList<String>();
		while(entrada >= base) {
			int resto = entrada%base;
			if (resto > 9) {
				restos.add(retornaLetraHexa(resto));
			}else {
				restos.add(String.valueOf(resto));
			}
			entrada = entrada/base;
		}
		String resposta = "";
		if(entrada > 9) {
			resposta = retornaLetraHexa(entrada);
		}
		else {
			resposta = String.valueOf(entrada);
		}
		for (int i = restos.size()-1; i >= 0; i--) {
			resposta += String.valueOf(restos.get(i));
		}
		return resposta;
	}
	
	private static String retornaLetraHexa (int numero) {
		String letra = "";
		switch (numero) {
			case 10: letra = "A"; break;
			case 11: letra = "B"; break;
			case 12: letra = "C"; break;
			case 13: letra = "D"; break;
			case 14: letra = "E"; break;
			case 15: letra = "F"; break;
		}
		return letra;
	}
}
