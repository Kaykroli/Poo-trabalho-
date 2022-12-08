public class PessoaFisica extends Pessoa {
    private long cpf;
    /**
     * 
     */
    private String Sobrenome;

    public PessoaFisica() {
    }
  
    public long getCpf() {
      return cpf;
    }
  
    public void setCpf(long cpf) {
      this.cpf = cpf;
    }

    public String getSobrenome() {
        return Sobrenome;
      }
    
      public void setSobrenome( String Sobrenome) {
        this.Sobrenome = Sobrenome;
      }
  
    
    @Override
	public String toString() {
		return "\n"+ mostra();
	}

    private String mostra() {
        return null;
    }
  }

