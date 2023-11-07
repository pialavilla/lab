import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        //guardar gmail en un array
        String[] email = {
                "ejemplo@gmail.com",
                "pia@gmail",
                "ejemplo_email_invalido.com"
        };
        // Expresión regular para validar correo electrónico
        String validar_email = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        Pattern validar = Pattern.compile(validar_email);

        for (String i : email) {
            Matcher matcher = validar.matcher(i);
            if (matcher.matches()) {
                System.out.println("Válido: " + i);
            } else {
                System.out.println("Inválido: " + i);
            }
        }

        //validar entrada de datos de un array list y aplicarlo
        ArrayList<String> correosElectronicos = new ArrayList<String>();//agregar direcciones de correo electronico en el array

        correosElectronicos.add("ejemplo@gmail.com");
        correosElectronicos.add("pia@gmail.com");
        correosElectronicos.add("ejemplo_email_invalido.com");

        //expresion para validar el correo electronico
        String ValidarEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        Pattern pattern = Pattern.compile(ValidarEmail);

        for (String correo : correosElectronicos) {
            Matcher matcher = pattern.matcher(correo);
            if (matcher.matches()) {
                System.out.println("valido: " + correo);
                //aplicar el correo electronico (por ejemplo guardar en una base de datos)
            } else {
                System.out.println("invalido: " + correo);
                //correo invalido devuelve error
            }
        }

        //verificar que no termine con un digito

        String cadena1 = "Mundo123";
        String cadena2 = "Mundo";

        if (!cadena1.matches(".*\\d$")) {
            System.out.println("la cadena1 no acaba en digito");
        } else {
            System.out.println("la cadena1 acaba con un digito");
        }

        if (!cadena2.matches(".*\\d$")) {
            System.out.println("la cadena2 no acaba en digito");
        } else {
            System.out.println("la cadena2 acaba con un digito");
        }

        //verificar que la cadena no empieze con un digito
        String cadena3 = "26pia";
        String cadena4 = "pia26";

        if (!cadena1.matches("^\\d.*")) {
            System.out.println("la cadena1 uno no empieza con un digito");
        } else {
            System.out.println("la cadena1 empieza con un digito");
        }

        if (!cadena2.matches("^\\d.*")) {
            System.out.println("la cadena2 uno no empieza con un digito");
        } else {
            System.out.println("la cadena2 empieza con un digito");
        }

        //comprobar que la cadena este formado po un minimo de 5 letras mayusculas o mins y maximo 10

        String cadena5 = "aBcDeFgHi";

        String regex = "^[a-zA-Z]{5,10}$";

        if (cadena5.matches(regex)) {
            System.out.println("la cadena5 cumple con los criterios");
        } else {
            System.out.println("la cadena5 no comple con los criterios");
        }

        //validar el ingreso de un dni

        String dni = "46.398.641";
        //expresion para validar dni
        String rege = "^\\d{2}-\\d{3}\\-d{3}$";

        if (dni.matches(rege)) {
            System.out.println("el DNI ingresado es valido");
        } else {
            System.out.println("el DNI ingresado no es valido");
        }

        //validar un mail luego agregralo a un list

        ArrayList<String> correoElectronico = new ArrayList<String>();
        // Expresión regular para validar correo electrónico
        String validar_gmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        Pattern valida = Pattern.compile(validar_email);

        String[] gmails = {
                "usuario1@ejem.com",
                "usuario2@ejem.com",
                "invalido_correo_.com"
        };
        for (String gmail : gmails) {
            Matcher matcher = pattern.matcher(gmail);
            if (matcher.matches()) {
                correoElectronico.add(gmail);
                System.out.println("correo valido: " + gmail);
            } else {
                System.out.println("correo invalido: " + gmail);
            }
        }
        //imprimir correos validos almacenados en el array list

        System.out.println("correos electronicos validos en el arraylist:");
        for (String correoValido : correoElectronico) {
            System.out.println(correoValido);
        }


        //comprobar que contenga abc

        String letras = "hhabcll";
        String comprobar = ".*abc.*";

        if(letras.matches(comprobar)){
            System.out.println("letras contiene 'abc'");
        }else {
            System.out.println("letras no contiene 'abc'");
        }


















    }
}