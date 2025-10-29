package esempio_Incapsulamento;

public class Anagrafica 
{
	private String nome;
	private int annoDiNascita;
	
	public void setNome(String n) {
	    nome = n;  
	  }
	    
	  public String getNome() {
	    return nome;      
	  }
	    
	  public void setAnnoDiNascita(int anno) {
	    annoDiNascita = anno;
	  }

	  public int getAnnoDiNascita() {
	    return annoDiNascita;
	  }
}
