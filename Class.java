class objeto {
    private int num;
    private String nome;
    public objeto() {
        num = 0;
        nome = "a";
        System.out.println("Funcionou");
    }
    public void setNumero(/*int a*/) {
        //this.num = a;
        num = 20;
    }
    public void setNome(/*String name*/) {
        //this.nome = name;
        nome = "Jorge";
    }
    public int getNumero() {
        return num;
    }
    public String getNome() {
        return nome;
    }
}