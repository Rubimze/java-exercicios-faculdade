package pratica09;

public class Exercicio03 {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private String telefone;
    private String endereco;

    /**
     * Cria um novo objeto Funcionario.
     *
     * @param nome O nome do funcionário.
     * @param idade A idade do funcionário.
     * @param cargo O cargo do funcionário.
     * @param salario O salário do funcionário.
     * @param telefone O telefone do funcionário.
     * @param endereco O endereço do funcionário.
     */
    public Exercicio03(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    /**
     * Apresenta todos os dados do funcionário.
     */
    public void exibe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
    }
}

public class Cadastro {
    private Funcionario[] funcionarios;

    /**
     * Cria um novo objeto Cadastro com o tamanho especificado.
     *
     * @param tamanho O tamanho do vetor de objetos Funcionario.
     */
    public Cadastro(int tamanho) {
        funcionarios = new Funcionario[tamanho];
    }

    /**
     * Cadastra um novo objeto Funcionario no vetor.
     *
     * @param f O objeto Funcionario a ser cadastrado.
     */
    public void cadastrar(Funcionario f) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = f;
                break;
            }
        }
    }

    /**
     * Imprime todos os objetos Funcionario cadastrados no vetor.
     */
    public void imprimir() {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                System.out.println("Funcionário " + (i+1) + ":");
                funcionarios[i].exibe();
                System.out.println();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3);

        Funcionario f1 = new Funcionario("João", 25, "Programador", 3000.0, "(11) 99999-9999", "Rua A, 123");
        Funcionario f2 = new Funcionario("Maria", 30, "Analista", 4000.0, "(11) 88888-8888", "Rua B, 456");
        Funcionario f3 = new Funcionario("Pedro", 35, "Gerente", 5000.0, "(11) 77777-7777", "Rua C, 789");

        cadastro.cadastrar(f1);
        cadastro.cadastrar(f2);
        cadastro.cadastrar(f3);

        cadastro.imprimir();
    }
}
