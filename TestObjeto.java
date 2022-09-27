class TestObjeto {
    public static void main(String[] args) {
        objeto obj1 = new objeto();
        obj1.setNumero(10);
        obj1.setNome(/*"Miguel"*/);
        System.out.println("Nome: " + obj1.getNome() + "  Numero: " + obj1.getNumero());
        System.out.println("Nome em maiusculo: " + obj1.maiusculo() + "  Numero dobrado: " + obj1.multi() + "  Numero dividido: " + obj1.divide());

        objeto obj2 = new objeto();
        obj2.setNumero(50);
        obj2.setNome(/*"Miguel"*/);
        System.out.println("Nome: " + obj2.getNome() + "  Numero: " + obj2.getNumero());
        System.out.println("Nome em maiusculo: " + obj2.maiusculo() + "  Numero dobrado: " + obj2.multi() + "  Numero dividido: " + obj1.divide());
    }
}