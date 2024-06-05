package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido){
            System.out.println("Aguardando resultado demais candidatos");
        }else{
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }
}
