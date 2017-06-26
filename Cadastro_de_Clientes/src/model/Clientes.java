package model;

public class Clientes {
        
        private String ID;
        private String nome;
        private String CPF;
        private String RG;
        private String Endereco; 
        private String Bairro;
        private String Cidade;
        private String CEP;
        private String Telefone;
        private String Celular;
        private String Email;
        private String Nascimento;
        private int UF;

    public Clientes() {
        
        
    }

    public Clientes(String ID, String nome, String CPF, String RG, String Endereco, String Bairro, String Cidade, String CEP, String Telefone, String Celular, String Email, String Nascimento, int UF) {
        this.ID = ID;
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.CEP = CEP;
        this.Telefone = Telefone;
        this.Celular = Celular;
        this.Email = Email;
        this.Nascimento = Nascimento;
        this.UF = UF;
    }

    public String getID() {
        return ID;
    }

    public void setID (String ID) {
        this.ID = ID;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }
     
    public int getUF() {
        return UF;
    }

    public void setUF(int UF) {
        this.UF = UF;
    }
    
        
        
    
}



 

