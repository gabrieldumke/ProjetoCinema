package projetocinema;

public class Sessao {
    String nSala;
    String hInicio;
    String hTermino;
    Filme filme;

    public Sessao(String nSala, String hInicio, String hTermino, Filme filme) {
        setnSala(nSala);
        sethInicio(hInicio);
        sethTermino(hTermino);
        setFilme(filme);
    }

    public void setnSala(String nSala) {
        if (nSala != null && !nSala.isEmpty()) {
            this.nSala = nSala;
        } else {
            System.out.println("O numero da sala está vazio ou é nulo!");
            System.exit(0);
        }

    }

    public void sethInicio(String hInicio) {
        if (hInicio != null && !hInicio.isEmpty()) {
            this.hInicio = hInicio;
        } else {
            System.out.println("O horário de início está vazio ou é nulo!");
            System.exit(0);
        }

    }

    public void sethTermino(String hTermino) {
        if (hTermino != null && !hTermino.isEmpty()) {
            this.hTermino = hTermino;
        } else {
            System.out.println("O horário de termino está vazio ou é nulo!");
            System.exit(0);
        }

    }

    public void setFilme(Filme filme) {
        if (filme != null) {
            this.filme = filme;
        } else {
            System.out.println("O filme está vazio ou é nulo!");
            System.exit(0);
        }

    }

    @Override
    public String toString() {
        return      this.filme + "\n" +
                "Sala: " + this.nSala + "\n" +
                "Horario de inicio: " + this.hInicio + "\n" +
                "Horario de termino: " + this.hTermino;
    }
}
