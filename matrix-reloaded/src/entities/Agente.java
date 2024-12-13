package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;

    public static int nivelAgente = 0;
    
        public Agente(int id, String nombre, String habilidadEspecial) {
            super(id, nombre);
            this.habilidadEspecial = habilidadEspecial;
        }
    
        public String getHabilidadEspecial() {
            return habilidadEspecial;
        }
    
        public void setHabilidadEspecial(String habilidadEspecial) {
            this.habilidadEspecial = habilidadEspecial;
        }
    
        public String getMisionAsignada() {
            return misionAsignada;
        }
    
        public void asignarMision(String mision) {
            this.misionAsignada = mision;
        }
    
        public static void incrementarNivel() {
            nivelAgente += 1;
    }

    public int getNivelAgente() {
        return nivelAgente();
    }

    public int nivelAgente() {
        return nivelAgente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
