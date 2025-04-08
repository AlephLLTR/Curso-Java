public class Computacao_Distribuida {
    
    public static double disponibilidade(int n_servidores, int k_minimo, double p_probabilidade) {
        double res = Math.pow(p_probabilidade, k_minimo) - Math.pow((1 - p_probabilidade), (n_servidores - k_minimo));        
        return res;
    }

    public static void main(String[] args) {
        System.out.println(disponibilidade(0, 1, 0));
    }
}
