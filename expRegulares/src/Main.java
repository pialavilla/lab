import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //1
        System.out.println("Ingrese su numero de telefono: ");
        String numero= leer.nextLine();

        Pattern pattern= Pattern.compile("\\d{7,10}"); //lo que va a verificar
        Matcher matcher = pattern.matcher(numero); //le pasas la variable

        if (matcher.matches()){
            System.out.println("numero valido");
        }else {
            System.out.println("numero invalido");
        }

        //2
        System.out.println("ingrese su cuil: ");
        String cuil = leer.nextLine();

        Pattern pattern1=Pattern.compile("\\d{11}");
        Matcher matcher1=pattern1.matcher(cuil);

        if (matcher1.matches()){
            System.out.println("cuil valido");
        }else {
            System.out.println("cuil invalido");
        }

        //3
        System.out.println("ingrese su correo electronico");
        String correo =leer.nextLine();

        Pattern pattern2=Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
        Matcher matcher2=pattern2.matcher(correo);

        if (matcher2.matches()){
            System.out.println("el correo es valido");
        }else {
            System.out.println("el correo es invalido");
        }

        //4
        System.out.println("ingrese una nomenclaruta:");
        String nomen= leer.nextLine();

        Pattern pattern3= Pattern.compile("[0,9],{22}");
        Matcher matcher3=pattern3.matcher(nomen);

        if (matcher3.matches()){
            System.out.println("nomenclatura valida");
        }else{
            System.out.println("nomenclatura valida");
        }

        //5
        System.out.println("ingrese un nombre: ");
        String nombre= leer.nextLine();

        Pattern pattern4=Pattern.compile("a-z,{7,10}");
        Matcher matcher4=pattern4.matcher(nombre);

        if (matcher4.matches()){
            System.out.println("nombre vaLido");
        }else {
            System.out.println("nombre invlido");
        }

        //6
        System.out.println("Ingrese su numero de telefono: ");
        String numero2= leer.nextLine();

        Pattern pattern5= Pattern.compile("\\d{7,10}"); //lo que va a verificar
        Matcher matcher5 = pattern5.matcher(numero); //le pasas la variable

        System.out.println("ingrese su cuil: ");
        String cuil2 = leer.nextLine();

        Pattern pattern6=Pattern.compile("\\d{11}");
        Matcher matcher6=pattern6.matcher(cuil);

        System.out.println("ingrese su correo electronico");
        String correo2 =leer.nextLine();

        Pattern pattern7=Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
        Matcher matcher7=pattern7.matcher(correo);

        if (matcher5.matches()){
            System.out.println("numero valido");
        }else {
            System.out.println("numero invalido");
        }

        if (matcher6.matches()){
            System.out.println("cuil valido");
        }else {
            System.out.println("cuil invalido");
        }

        if (matcher7.matches()){
            System.out.println("el correo es valido");
        }else {
            System.out.println("el correo es invalido");
        }

        //7
        System.out.println("ingrese correos electronicos separados por coma: ");
        String correos= leer.nextLine();

        //separa la lista usando comas
        String[] array= correos.split(",");

        String regex="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern8=pattern.compile(regex);

        for (String i: array){
            i=correos.trim();//eliminar espacios en blanco

            Matcher matcher8=pattern8.matcher(i);
            if (matcher8.matches()){
                System.out.println("valido");
            }else {
                System.out.println("invalido");
            }
        }

        //8
        System.out.println("ingrese su numero con el prefijo internacional +..:");
        String prefijo= leer.nextLine();

        Pattern pattern9= Pattern.compile("^'+'54\\d{7,10}"); //lo que va a verificar
        Matcher matcher9 = pattern9.matcher(prefijo); //le pasas la variable

        if (matcher9.matches()){
            System.out.println("numero invalido debe ser internacional");
        }else {
            System.out.println("numero valido");
        }

        //9
        System.out.println("ingrese su correo electronico");
        String correo3 =leer.nextLine();

        Pattern pattern10=Pattern.compile("^[a-zA-Z0-9._%+-]+@+.(miempresa.com).");
        Matcher matcher10=pattern10.matcher(correo3);

        if (matcher10.matches()){
            System.out.println("el correo es valido");
        }else {
            System.out.println("el correo es invalido");
        }

        //10
        System.out.println("ingrese su codigo postal");
        String codpostal =leer.nextLine();

        Pattern pattern11=Pattern.compile("[a-zA-Z0-9]{4}");
        Matcher matcher11=pattern11.matcher(codpostal);

        if (matcher11.matches()){
            System.out.println("numero cod postal valido");
        }else {
            System.out.println("numero invalido");
        }

        //11
        System.out.println("ingrese su dni");
        String dni =leer.nextLine();

        Pattern pattern12=Pattern.compile("\\d{8}$");
        Matcher matcher12=pattern12.matcher(codpostal);

        if (matcher12.matches()){
            System.out.println("dni valido");
        }else {
            System.out.println("dni invalido");
        }

        //12
        System.out.println("ingrese su usuario");
        String usuario =leer.nextLine();

        Pattern pattern13=Pattern.compile("a-zA-Z0-9_{7}");
        Matcher matcher13=pattern13.matcher(codpostal);

        if (matcher13.matches()){
            System.out.println("usuario valido");
        }else {
            System.out.println("usuario invalido");
        }

        //13
        System.out.println("ingrese una fecha en formato dd/mm/aaaa");
        String fecha =leer.nextLine();

        Pattern pattern14=Pattern.compile ("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})$");
        Matcher matcher14=pattern14.matcher(fecha);

        if (matcher14.matches()){
            System.out.println("fecha valida");
        }else {
            System.out.println("facha invalida");
        }

        //14
        System.out.println("ingrese nombres de dominios web: ");
        String dominioWeb = leer.nextLine();

        Pattern pattern15=Pattern.compile("^[a-zA-Z0-]+.(mozilla.org).");
        Matcher matcher15=pattern15.matcher(dominioWeb);

        if (matcher15.matches()){
            System.out.println("dominio valido");
        }else {
            System.out.println("dominio invalido");
        }

        //15
        System.out.println("ingrese el nombre de un producto que contenga 5 caracteres o menos:");
        String producto =leer.nextLine();

        Pattern pattern16=Pattern.compile("^[a-zA-Z]{5,}$");
        Matcher matcher16=pattern16.matcher(producto);

        if (matcher16.matches()){
            System.out.println("producto valido");
        }else {
            System.out.println("producto invalido");
        }

        //16
        System.out.println("ingrese una contraseña:" );
        String contrasenia = leer.nextLine();


        Pattern pattern17=Pattern.compile( "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
        Matcher matcher17=pattern17.matcher(contrasenia);

        if (matcher17.matches()){
            System.out.println("contraseña valida");
        }else {
            System.out.println("contraseña invalida");
        }



















    }
}