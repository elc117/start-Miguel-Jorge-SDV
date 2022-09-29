class Data {
    /*private*/ String userId;
    /*private*/ String name;
    /*private*/ boolean online;

    public Data() {

    }

    public Data(String nome, String usuario, boolean on) {
        this.name = nome;
        this.userId = usuario;
        this.online = on;
    }

    public void setData(String nome, String usuario, boolean on) {
        this.name = nome;
        this.userId = usuario;
        this.online = on;
    }
}