package Aula_18_09;

public class ObjCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente ("Giovana", 56891, "15998653", "47801553802", "56432190");
		Cliente cliente1 = new Cliente ();
		
	
		System.out.println("nome" + cliente.getNome());
		System.out.println("id" + cliente.getId());
		System.out.println("telefone" + cliente.getTelefone());
		System.out.println("cpf" + cliente.getCpf());
		System.out.println("rg" + cliente.getRg());
		
		cliente1.setNome("Nome: Giovana");
		cliente1.setId(56891);
		cliente1.setTelefone( "Telefone: 15998653");
		cliente1.setCpf("Cpf: 47801553802");
		cliente1.setRg("Rg: 56432190");
		
		System.out.println("---------------------------");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());

	}

}
