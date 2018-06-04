package centroide;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fondo extends JFrame
{

    private final Llama_fondo contenedor = new Llama_fondo();

    public Fondo()
    {
        setContentPane(contenedor);
    }

    public void setImagen(String nombreImagen)
    {
        contenedor.setImagen(nombreImagen);
        //ImageIcon contendor = new ImageIcon(getClass().getResource("/imagenes/ww.png"));
        
    }

    public void setImagen(Image nuevaImagen)
    {
        contenedor.setImagen(nuevaImagen);
    }
}
