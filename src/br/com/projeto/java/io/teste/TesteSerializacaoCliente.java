package br.com.projeto.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Pedro");
		cliente2.setProfissao("Dev");
		cliente2.setCpf("234113161");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente2.bin"));
		oos.writeObject(cliente2);
		oos.close();

		// ObjectInputStream ois = new ObjectInputStream(new
		// FileInputStream("cliente.bin"));
		// Cliente cliente2 = (Cliente) ois.readObject();
		// ois.close();
		// System.out.println(cliente2.getNome());
	}
}
