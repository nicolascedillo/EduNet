package ec.ups.edu.poo.principal;

import  ec.ups.edu.poo.clases.*;
import  ec.ups.edu.poo.enums.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class principal {
    public static void main(String[] args) {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        //Creación primera institución

        Institucion institucion = new Institucion();
        institucion.setIdentificacion(1);
        institucion.setNombre("Instituto de idiomas");
        List<String> sedesInstitutoIdiomas = new ArrayList<>();
        sedesInstitutoIdiomas.add("Guayaquill");
        sedesInstitutoIdiomas.add("Cuenca");
        institucion.setSedes(sedesInstitutoIdiomas);
        institucion.addDireccion(TipoDireccion.INSTITUCION, "Av de las Americas", "Calle larga","10", "Cuenca","Azuay","Ecuador");


        //Institucion 2

        Institucion institucion2 = new Institucion();
        institucion2.setIdentificacion(2);
        institucion2.setNombre("Centro Deportivo");
        List<String> sedesCentroDeportivo = new ArrayList<>();
        sedesCentroDeportivo.add("Quito");
        sedesCentroDeportivo.add("Cuenca");
        institucion2.setSedes(sedesCentroDeportivo);
        institucion2.addDireccion(TipoDireccion.INSTITUCION, "Calle vieja", "Elia liut","9", "Cuenca","Azuay","Ecuador");


        Direccion direccion = new Direccion();

        //Estudiante

        Estudiante persona = new Estudiante();
        persona.setCedula("01");
        persona.setNombre("Eduardo");
        persona.setApellido("Segarra");
        persona.setCelular("09512232");
        persona.setEmail("eduardosegarra@gmail.com");
        direccion.setCallePrincipal("Calle Principal");
        direccion.setCalleSecundaria("Calle secundaria");
        direccion.setTipo(TipoDireccion.CASA);
        direccion.setNumeracion("15");
        direccion.setCiudad("Cuenca");
        direccion.setProvincia("Azuay");
        direccion.setPais("Ecuador");
        persona.addDireccion(direccion);
        persona.setCarrera("Ciencias de la computación");
        GregorianCalendar fecha = new GregorianCalendar(2023, 5, 16);
        Asignacion asignacionEstudianteInstitucion1 = new Asignacion();
        asignacionEstudianteInstitucion1.setPersona(persona);
        asignacionEstudianteInstitucion1.setRol(Rol.ESTUDIANTE);
        asignacionEstudianteInstitucion1.setFechaDeInicio(fecha);
        institucion.addAsignacion(asignacionEstudianteInstitucion1);

        //Profesor

        List<String> titulosProfesor = new ArrayList<>();
        titulosProfesor.add("Arquitecto");
        titulosProfesor.add("Diseñador");
        List<String> areasProfesor = new ArrayList<>();
        areasProfesor.add("Creatividad");
        areasProfesor.add("Arte");
        Profesor persona2 = new Profesor("02","Juanito", "Perez", "0952452", "juanitoperez@gmail.com",titulosProfesor,areasProfesor);
        direccion.setCallePrincipal("Calle Principal 2");
        direccion.setCalleSecundaria("Calle secundaria 2");
        direccion.setTipo(TipoDireccion.CASA);
        direccion.setNumeracion("16");
        direccion.setCiudad("Cuenca");
        direccion.setProvincia("Azuay");
        direccion.setPais("Ecuador");
        persona2.addDireccion(direccion);
        Asignacion asignacionProfesorInstitucion1 = new Asignacion();
        GregorianCalendar fecha2 = new GregorianCalendar(2024, 6, 01);
        asignacionProfesorInstitucion1.setPersona(persona2);
        asignacionProfesorInstitucion1.setRol(Rol.DOCENTE);
        asignacionProfesorInstitucion1.setFechaDeInicio(fecha2);
        institucion.addAsignacion(asignacionProfesorInstitucion1);

        //Administrativo

        List<String> areasAdministracion = new ArrayList<>();
        areasAdministracion.add("Contabilidad");
        areasAdministracion.add("Secretaria");
        List<String> responsabilidadesAdministracion = new ArrayList<>();
        responsabilidadesAdministracion.add("Dinero");
        responsabilidadesAdministracion.add("Registro de personas");
        Administracion persona3 = new Administracion("04","Juana","Tijuana","096526","tijuana@gmail.com",areasAdministracion,responsabilidadesAdministracion);
        direccion.setCallePrincipal("Calle principal 3");
        direccion.setCalleSecundaria("Calle secundaria 3");
        direccion.setTipo(TipoDireccion.TRABAJO);
        direccion.setNumeracion("7");
        direccion.setCiudad("Cuenca");
        direccion.setProvincia("Azuay");
        direccion.setPais("Ecuador");
        persona3.addDireccion(direccion);
        Asignacion asignacionAdministracionInstitucion2 = new Asignacion();
        GregorianCalendar fecha3 = new GregorianCalendar(1999, 4, 7);
        asignacionAdministracionInstitucion2.setPersona(persona3);
        asignacionAdministracionInstitucion2.setRol(Rol.ADMINISTRATIVO);
        asignacionAdministracionInstitucion2.setFechaDeInicio(fecha3);
        institucion2.addAsignacion(asignacionAdministracionInstitucion2);

        //Visitante
        GregorianCalendar fechaInicio = new GregorianCalendar(2025, 7, 18);
        GregorianCalendar fechaFin = new GregorianCalendar(2025, 7, 18);
        Visitante persona4 = new Visitante("05","Jose","Vazcones","095513","jose@gmail.com","Dudas sobre notas de su hijo",fechaInicio,fechaFin);
        direccion.setCallePrincipal("Calle principal 4");
        direccion.setCalleSecundaria("Calle secundaria 4");
        direccion.setTipo(TipoDireccion.TRABAJO);
        direccion.setNumeracion("7");
        direccion.setCiudad("Cuenca");
        direccion.setProvincia("Azuay");
        direccion.setPais("Ecuador");
        persona4.addDireccion(direccion);
        Asignacion asignacionVisitanteInstitucion2 = new Asignacion();
        GregorianCalendar fecha4 = new GregorianCalendar(1999, 4, 7);
        asignacionVisitanteInstitucion2.setPersona(persona4);
        asignacionVisitanteInstitucion2.setRol(Rol.VISITANTE);
        asignacionVisitanteInstitucion2.setFechaDeInicio(fecha4);
        institucion2.addAsignacion(asignacionVisitanteInstitucion2);

        System.out.println(institucion.toString());
        System.out.println(institucion2.toString());


    }
}
