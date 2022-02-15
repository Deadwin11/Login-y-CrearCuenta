package ventana;

import java.util.Random;

public class Contraseñas 
{
    private Random obr = new Random();
    private String validos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz.-_#$&+@[]{}¡?¿!=<>";
    private String clv="";
    int x;
    
    //LOS DOS METODOS TIENEN LA MISMA FUNCION QUE ES GENERAR CONTRASEÑAS Y OPTE POR DEJAR EL SEGUNDO
    /*public String Contraseña()
    {
		for (x = 0; x < 8; x++)
                {
			clv += validos.charAt(obr.nextInt(validos.length()));                
                }
		return clv;
    }
    */
    
    public String Prueba()
    {
        for (x = 0; x < 8 ; x++) {
        clv += validos.charAt((int) Math.floor((validos.length())*Math.random()));   
    }
        return clv;
    }
}
