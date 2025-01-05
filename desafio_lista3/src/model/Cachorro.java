package model;

public class Cachorro extends Animal {
    private boolean mensagemExibida = false; // Flag para controlar a exibição da mensagem

    @Override
    public void pertence() {
        if (!mensagemExibida) { 
            System.out.println("Pertence ao reino Animalia e é um mamífero.");
            mensagemExibida = true; // Marca como exibida evitando a sua repetição
        }
    }
}
