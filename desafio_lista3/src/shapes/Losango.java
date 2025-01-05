package shapes;

import model.Forma;

public class Losango implements Forma {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2.0;
    }
}
