package Aula_18_09;

public class ObjItem {

	public static void main(String[] args) {
		
		Item item = new Item("Computador", "bom", 123456789);
		Item item1 = new Item(); 
		
		System.out.println (item.getDescricao());
		System.out.println (item.getId());
		System.out.println (item.getNome());
		
		item1.setDescricao("not");
		item1.setId(12);
		item1.setNome("guh");
		
		System.out.println (item1.getDescricao());
		System.out.println (item1.getId());
		System.out.println (item1.getNome());

}
}