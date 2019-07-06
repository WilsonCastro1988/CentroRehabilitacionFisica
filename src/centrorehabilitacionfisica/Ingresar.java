/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrorehabilitacionfisica;

/**
 *
 * @author USUARIO
 */
public class Ingresar {
    
    private String usuario;
    private String clave;

    public Ingresar() {
     
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean validar(String nombre,String clave){
        if(("ADMINISTRADOR".equals(nombre)&&"rehabi123".equals(clave))||"PACIENTE".equals(nombre)){
            return true;
        }else if("FISIOTERAPIA".equals(nombre)&&"espe6064".equals(clave)){
            return true;
        }else if("NUTRICION".equals(nombre)&&"nutri123".equals(clave)){
            return true;
        }else if("MEDICINA GENERAL".equals(nombre)&&"medi123".equals(clave)){
            return true;
        }else if("TERAPIA OCUPACIONAL".equals(nombre)&&"tera123".equals(clave)){
            return true;
        }
        return false;
        
        
        
    }
    
    public boolean paciente(String nombre){
        if("PACIENTE".equals(nombre)){
            return false;
        }else{
            return true;
        }       
    }
    
    
    
    
    
    
}
