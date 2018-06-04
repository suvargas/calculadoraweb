package centroide;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Llama_fondo extends JPanel
{

     
    private Image imagen;

    public Llama_fondo()
    {
    }

    public Llama_fondo(String nombreImagen)
    {
        if (nombreImagen != null)
        {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
             //imagen = new ImageIcon(getClass().getResource("/centroide/ww.png"));
            // nombreImagen = new ImageIcon(getClass().getResource("ww.png"));
           // nombreImagen = new ImageIcon(getClass().getResource("/imagenes/ww.png"));
        }
    }

    public Llama_fondo(Image imagenInicial)
    {
        if (imagenInicial != null)
        {
            imagen = imagenInicial;
        }
    }

    public void setImagen(String nombreImagen)
    {
        if (nombreImagen != null)
        {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        }
        else
        {
            imagen = null;
        }
        repaint();
    }

    public void setImagen(Image nuevaImagen)
    {
        imagen = nuevaImagen;
        //ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/imagenes/ww.png"));

        repaint();
    }

    @Override
    public void paint(Graphics g){
        
        ImageIcon imagenfondo = new ImageIcon(getClass().getResource("/imagenes/ww.png"));
        setOpaque(false);
        super.paint(g);
        /*
        
        if (imagen != null)
        {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            //ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/ww.png"));

            setOpaque(false);
        }
        else
        {
            setOpaque(true);
        }

        super.paint(g);*/
    }
}
