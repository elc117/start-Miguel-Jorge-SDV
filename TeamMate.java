class TeamMate {
    Data dados;

    public TeamMate() {
        this.dados = new Data("a", "a", true);
    }

    public TeamMate(Data info) {
        this.dados = info;
    }

    public String getName() {
        return this.dados.name;
    }

    public String getUser() {
        return this.dados.userId;
    }

    public boolean getStatus() {
        return this.dados.online;
    }
}