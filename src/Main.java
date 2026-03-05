public class Main{
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in;

        int op;

        do {
            System.out.printf("|||MENU|||");
            System.out.printf("|||1º Añadir Tarea|||");
            System.out.printf("|||0º Salir|||");

            op = sc.nextInt();
            sc.nextline();


            switch (op){

                case 1:
                    System.out.printf("Introduce la descripcion de la tarea");
                    String descripcion = sc.nextline();
                    gestor.añadirTarea(descripcion);
                    System.out.println("Tarea añadida");
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (op != 0);

    }
}
