public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento ordenar = new MetodoOrdenamiento();
        int[] array = ordenar.crearArreglo();
        System.out.println(" ");
        ordenar.imprimirArreglo(array);
        System.out.println(" ");
        ordenar.sortInserccion(array, true);
        System.out.println(" ");
        ordenar.imprimirArreglo(array);
    }
}