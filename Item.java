package Aula_18_09;

public class Item {

		private String nome;
		private String descricao;
		private int id;
		
		public Item() {}
		
		public Item(String nome,String descricao, int id) {
			this.nome = nome;
			setDescricao(descricao);
			setId(id);
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome (String nome) {
			this.nome = nome;
		}
		
		public String getDescricao() {
			return descricao;
		}
		
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		public int getId() {
			return id;
		}
	
		public void setId(int id) {
			this.id = id;
		}
		
		public void exibirInformacoes() {
			System.out.println("Nome: "+ nome + " Descrição: " + descricao + " Id: " +id );
		}
	}



