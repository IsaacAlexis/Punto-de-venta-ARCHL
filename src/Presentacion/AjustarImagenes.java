
package Presentacion;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AjustarImagenes {
    public void ImagenFix(String nombre,JLabel etiquieta,String extencion){
        String ruta = "C:\\Users\\Jose Luis\\Documents\\NetBeansProjects\\Auto Refacciones Chee Luis\\src\\Imagenes\\"+nombre+extencion;
        ImageIcon img = new ImageIcon(ruta);
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(etiquieta.getWidth(),etiquieta.getHeight(),Image.SCALE_DEFAULT));
        etiquieta.setIcon(icono);
    }
    
    public void ImagenFixFile(String nombre,JLabel etiquieta){
        String ruta = nombre;
        ImageIcon img = new ImageIcon(ruta);
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(etiquieta.getWidth(),etiquieta.getHeight(),Image.SCALE_DEFAULT));
        etiquieta.setIcon(icono);
    }
    
    public void ImagenFixBtn(String nombre,JButton etiquieta,String extencion){
        String ruta = "C:\\Users\\Jose Luis\\Documents\\NetBeansProjects\\Auto Refacciones Chee Luis\\src\\Imagenes\\"+nombre+extencion;
        ImageIcon img = new ImageIcon(ruta);
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(etiquieta.getWidth(),etiquieta.getHeight(),Image.SCALE_DEFAULT));
        etiquieta.setIcon(icono);
    }
    
    public void ImagenFixBtnRoll(String nombre,JButton etiquieta,String extencion){
        String ruta = "C:\\Users\\Jose Luis\\Documents\\NetBeansProjects\\Auto Refacciones Chee Luis\\src\\Imagenes\\"+nombre+extencion;
        ImageIcon img = new ImageIcon(ruta);
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(etiquieta.getWidth(),etiquieta.getHeight(),Image.SCALE_DEFAULT));
        etiquieta.setRolloverIcon(icono);
    }
}
