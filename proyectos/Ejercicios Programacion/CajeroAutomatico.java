import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class CajeroAutomatico {

    static HashMap<String, Usuario> usuariosRegistrados = new HashMap<String, Usuario>();
    static final String ARCHIVO_CSV = "usuarios.csv";

    public static void main(String[] args) {
        cargarUsuarios();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("¡BIENVENIDO AL CAJERO AUTOMÁTICO!");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");

            int opcionUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcionUsuario) {
                case 3:
                    guardarNuevoUsuario();
                    System.out.println("usuarios.csv");
                    imprimirTablaUsuarios();
                    scanner.close();
                    return;
                case 1:
                    iniciarSesion(scanner);
                    break;
                case 2:
                    registrarUsuario(scanner);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static void cargarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_CSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length == 4) {
                    String usuario = datos[0];
                    String password = datos[1];
                    int id = Integer.parseInt(datos[2]);
                    int saldo = Integer.parseInt(datos[3]);
                    usuariosRegistrados.put(usuario, new Usuario(usuario, password, id, saldo));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los usuarios: " + e.getMessage());
        }
    }

    public static void guardarNuevoUsuario() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_CSV))) {
            for (Usuario usuario : usuariosRegistrados.values()) {
                bw.write(usuario.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los usuarios: " + e.getMessage());
        }
    }

    public static void iniciarSesion(Scanner scanner) {
        System.out.println("--- INICIAR SESIÓN ---");

        System.out.println("Por favor ingrese su nombre de usuario:");
        String userName = scanner.nextLine();

        System.out.println("Por favor ingrese su contraseña:");
        String password = scanner.nextLine();

        verificarCredenciales(userName, password, scanner);
    }

    public static void registrarUsuario(Scanner scanner) {
        System.out.println("--- REGISTRO DE USUARIO ---");

        System.out.println("Por favor ingrese su nombre de usuario:");
        String newUserName = scanner.nextLine();

        System.out.println("Por favor ingrese su contraseña:");
        String newPassword = scanner.nextLine();

        if (usuariosRegistrados.containsKey(newUserName)) {
            System.out.println("Usuario ya registrado, por favor verifique sus datos.");
        } else {
            int nuevoId = usuariosRegistrados.size() + 1; // Generar un nuevo ID
            usuariosRegistrados.put(newUserName, new Usuario(newUserName, newPassword, nuevoId, 1000));
            System.out.println("Usuario registrado con éxito.");
        }
    }

    public static void verificarCredenciales(String userName, String password, Scanner scanner) {
        Usuario usuario = usuariosRegistrados.get(userName);
        if (usuario != null && usuario.getPassword().equals(password)) {
            System.out.println("¡Inicio de sesión exitoso!");
            bienvenido(scanner, usuario);
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos. Inténtelo nuevamente.");
            System.out.println("Si es usuario nuevo, por favor regístrese.");
        }
    }

    public static void bienvenido(Scanner scanner, Usuario usuario) {
        while (true) {
            System.out.println("════════════════ BIENVENIDO ════════════════");
            System.out.println("1. DEPOSITO A CUENTA");
            System.out.println("2. RETIRO DE EFECTIVO");
            System.out.println("3. CONSULTAR SALDO");
            System.out.println("4. CERRAR SESION");

            int operacion = scanner.nextInt();
            scanner.nextLine();

            switch (operacion) {
                case 4:
                    return;
                case 1:
                    depositarSaldo(scanner, usuario);
                    break;
                case 2:
                    retirarSaldo(scanner, usuario);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + usuario.getSaldo());
                    break;
                default:
                    System.out.println("ERROR!! Por favor seleccione una operación válida.");
                    break;
            }
        }
    }

    public static void depositarSaldo(Scanner scanner, Usuario usuario) {
        System.out.println("Ingrese la cantidad a depositar:");
        int montoDepositado = obtenerMonto(scanner);

        usuario.setSaldo(usuario.getSaldo() + montoDepositado);
        System.out.println("Su nuevo saldo ahora es: " + usuario.getSaldo());
    }

    public static void retirarSaldo(Scanner scanner, Usuario usuario) {
        System.out.println("Ingrese la cantidad a retirar:");
        int montoRetirado = obtenerMonto(scanner);

        if (montoRetirado > usuario.getSaldo()) {
            System.out.println("Fondos insuficientes.");
        } else {
            usuario.setSaldo(usuario.getSaldo() - montoRetirado);
            System.out.println("Su nuevo saldo ahora es: " + usuario.getSaldo());
        }
    }

    public static int obtenerMonto(Scanner scanner) {
        while (true) {
            try {
                int monto = scanner.nextInt();
                if (monto < 0) {
                    System.out.println("El monto debe ser positivo. Inténtelo de nuevo.");
                } else {
                    scanner.nextLine(); // Consumir la nueva línea después del entero
                    return monto;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor ingrese un monto válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }

    public static void imprimirTablaUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_CSV))) {
            String linea;
            System.out.println("Usuario      | Contraseña   | ID   | Saldo");
            System.out.println("-------------------------------------------");
    
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    // Formatear la salida en una tabla
                    String usuario = datos[0];
                    String password = datos[1];
                    String id = datos[2];
                    String saldo = datos[3];
    
                    System.out.printf("%-12s| %-12s| %-5s| %-5s\n", usuario, password, id, saldo);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los usuarios: " + e.getMessage());
        }
    }
    
    

    // Clase Usuario dentro del archivo principal
    static class Usuario {
        private String usuario;
        private String password;
        private int id;
        private int saldo;

        public Usuario(String usuario, String password, int id, int saldo) {
            this.usuario = usuario;
            this.password = password;
            this.id = id;
            this.saldo = saldo;
        }

        public String getUsuario() {
            return usuario;
        }

        public String getPassword() {
            return password;
        }

        public int getId() {
            return id;
        }

        public int getSaldo() {
            return saldo;
        }

        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }

        public String toCSV() {
            return usuario + "," + password + "," + id + "," + saldo;
        }
    }
}
