public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);

        // Solicitação: Criar um novo modelo de carro "Esportivo"
        Carro esportivo = Carro.criarCarroEsportivo();

        // Solicitação: Criar um novo modelo de carro "utilitario"
        Carro utilitario = Carro.criarCarroUtilitario();

        // Solicitação: Criar um novo modelo de carro "suv"
        Carro suv = Carro.criarCarroSUV();

        // Abastecendo o carro básico
        System.out.println("\nAbastecendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);

        // Viajando com o carro básico
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);

        // Abastecendo o carro esportivo
        System.out.println("\nAbastecendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);

        // Viajando com o carro esportivo
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(200);
        System.out.println(esportivo);

        // Abastecer o carro utilitário com diesel
        System.out.println("\nAbastecendo carro utilitario com diesel");
        utilitario.abastece(TipoCombustivel.DIESEL, 70);
        System.out.println(utilitario);

        // Viajar com o carro utilitário
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(300);
        System.out.println(utilitario);

        // Abastecer o carro SUV com gasolina
        System.out.println("\nAbastecendo carro SUV com gasolina");
        suv.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(suv);

        // Viajar com o carro SUV
        System.out.println("\nViajando com o carro SUV");
        suv.viaja(200);
        System.out.println(suv);
    }
}