package projeto_final;

public class Gafanhoto extends Pessoa {
    private String login;
    private double totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getTotAssistido() {
        return this.totAssistido;
    }

    public void setTotAssistido(double totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                " login='" + getLogin() + "'" +
                ", totAssistido='" + getTotAssistido() + "'" +
                "}";
    }

}
