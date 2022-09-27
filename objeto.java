class objeto {
    private int num;
    private String nome;
    public objeto() {
        num = 0;
        nome = "a";
        System.out.println("Funcionou");
    }
    public void setNumero(int a) {
        this.num = a;
        //num = 10;
    }
    public void setNome(/*String name*/) {
        //this.nome = name;
        nome = "Miguel";
    }
    public int getNumero() {
        return num;
    }
    public String getNome() {
        return nome;
    }
    public int multi() {
        num = num * 2;
        return num;
    }
    public int divide() { //Por algum motivo o segundo objeto fica zerado
        return num = num / 5;
    }
    public String maiusculo() { //Não funcionou :(
        nome.toUpperCase();
        return nome;
    }
}