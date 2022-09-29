import java.util.ArrayList;

class main {
    public static void main(String[] args) {
        ArrayList<TeamMate> lista = new ArrayList<TeamMate>();

        Data dados = new Data("Miguel Jorge", "MJ", false);
        TeamMate l = new TeamMate(dados);
        
        lista.add(l);
        System.out.println("Nome: " + l.getName() + " | Id de usuario: " + l.getUser() + " | Online? " + l.getStatus());
        for(int i = 0; i < 3; i++) {
            lista.add(new TeamMate(new Data("João", "Joãozim", true)));
            //System.out.println("Nome: " + l.getName(i) + " | Id de usuario: " + l.getUser(i) + " | Online? " + l.getStatus(i));
            if(l.getStatus()) {
                System.out.println(l.getName() + " está online  id do usuario: " + l.getUser());
            }
        }
    }
}