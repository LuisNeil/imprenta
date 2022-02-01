package org.ltejeda.interfaces.imprenta;

import org.ltejeda.interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen laboral",new Persona("Jhon","Doe"),"Ingeniero");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DB")
        .addExperiencia("Spring framework")
        .addExperiencia("Angular")
        .addExperiencia("Fullstack");

        Libro libro = new Libro(new Persona("Erich","Gamma"),"Patrones de diseños",Genero.PATRON_DE_DISENO);
        libro.addPagina(new Pagina("Singleton"))
                .addPagina(new Pagina("Observador"))
                .addPagina(new Pagina("Factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Facade"));

        Informe informe = new Informe("Estudio sobre microservicios",
                new Persona("Martin","Fowler"),
                new Persona("James","Martin"));
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
