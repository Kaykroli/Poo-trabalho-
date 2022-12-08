public class PessoaJuridica extends Pessoa {
    private long cnpj;
    /**
     * 
     */
    private String RazaoSocial;

    public PessoaJuridica() {
    }
  
    public long getCpf() {
      return cnpj;
    }
  
    public void setCpf(long cnpj) {
      this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
      }
    
      /**
     * @param razaoSocial
     * @param pessoaJuridica TODO
     */
    public void setRazaoSocial( String razaoSocial, PessoaJuridica pessoaJuridica) {
        pessoaJuridica.RazaoSocial = RazaoSocial;
      }
  
    
    @Override
	public String toString() {
		return "\n"+ mostra();
	}

    private String mostra() {
        return null;
    }
  }


