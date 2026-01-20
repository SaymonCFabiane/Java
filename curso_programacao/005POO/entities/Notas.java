package entities;

public class Notas {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean resultado(){
        return notaFinal() >= 60;
}

    public double faltou(){
        if (!resultado()) {
            return 60 - notaFinal();
        } else {
            return 0.0;
        }
    }
}
