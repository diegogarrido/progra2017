package com.proyecto1;

import java.util.ArrayList;

/**
 * Clase Alumno las notas se guardan en el formato "nota,ponderacion" ej: notas[0]="5.5,50"
 * @author Diego
 */
public class Alumno {

    private String[] notas = new String[25];
    private String[] notasAsig = new String[25];
    private ArrayList<String> anotaciones = new ArrayList();
    private boolean[] asistencia = new boolean[30];
    private String curso;
    private Apoderado apoderado;
    private String nombre;

    /**
     * Constructor
     * @param nombre Nombre del alumno
     * @param curso Curso al que pertenece
     * @param apoderado Apoderado
     */
    public Alumno(String nombre, String curso, Apoderado apoderado) {
        this.nombre = nombre;
        this.curso = curso;
        this.apoderado = apoderado;
    }

    /**
     * Constructor sin parámetros
     */
    public Alumno() {
    }

    /**
     * Retorna Un arreglo con las notas de actividades de las asignaturas
     * @return notas de una asignatura
     */
    public String[] getNotasAsig() {
        return notasAsig;
    }

    /**
     * @param notasAsig Un arreglo con las notas de actividades de las asignaturas
     */
    public void setNotasAsig(String[] notasAsig) {
        this.notasAsig = notasAsig;
    }

    /**
     * GetAnotaciones
     *
     * @return arrayList con las anotaciones en formato (tipo,detalle) ej: "Positiva,Se porta bien"
     */
    public ArrayList<String> getAnotaciones() {
        return this.anotaciones;
    }

    /**
     * SetAnotaciones 
     * 
     * @param anotaciones arrayList con las anotaciones en formato (tipo,detalle) ej: "Positiva,Se porta bien"
     */
    public void setAnotaciones(ArrayList<String> anotaciones) {
        this.anotaciones = anotaciones;
    }

    /**
     * GetNotas
     *
     * @return array con las notas que se promedian de las asignaturas en el formato (nota,ponderacion) ej: "4.0,60"
     */
    public String[] getNotas() {
        return notas;
    }

    /**
     * SetNotas
     *
     * @param notas array con las notas que se promedian de las asignaturas en el formato (nota,ponderacion) ej: "4.0,60"
     */
    public void setNotas(String[] notas) {
        this.notas = notas;
    }

    /**
     * GetAsistencia
     *
     * @return array de booleanos con las asistencias, true si asistió, false si no.
     */
    public boolean[] getAsistencia() {
        return asistencia;
    }

    /**
     * SetAsistencia
     *
     * @param asistencia array de booleanos con las asistencias, true si asistió, false si no.
     */
    public void setAsistencia(boolean[] asistencia) {
        this.asistencia = asistencia;
    }

    /**
     * GetCurso
     *
     * @return String con el curso (numero,letra) ej: "1,B"
     */
    public String getCurso() {
        return curso;
    }

    /**
     * SetCurso
     *
     * @param curso String con el curso (numero,letra) ej: "1,B"
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * GetApoderado
     *
     * @return Objeto de tipo Apoderado correspondiente al alumno
     */
    public Apoderado getApoderado() {
        return apoderado;
    }

    /**
     * SetApoderado
     *
     * @param apoderado Objeto de tipo Apoderado correspondiente al alumno
     */
    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    /**
     * GetNombre
     * @return String con el nombre del alumno (apellido nombre)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * SetNombre
     * @param nombre String con el nombre del alumno (apellido nombre)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Verificacion de la asistencia del alumno
     *
     * @return porcentaje de asistencia
     */
    public String getPorcentajeAsistencia() {
        String por = "%";
        int cont = 0;
        for (int i = 0; i < this.asistencia.length; i++) {
            if (this.asistencia[i]) {
                cont++;
            }
        }
        double calc = (cont * 100) / 30;
        por += calc;
        return por;
    }

    /**
     * @param asignatura Un int de 1 a 5 para determinar cual de las asignaturas
     * será promediada
     * @return El promedio de las 5 notas de la asignatura seleccionada
     */
    public String getPromedioAsignatura(int asignatura) {
        String prom = "";
        double sum = 0;
        for (int i = (asignatura * 5) - 5; i < asignatura * 5; i++) {
            double nota = Double.parseDouble(this.notas[i].split(",")[0]);
            double pond = Double.parseDouble(this.notas[i].split(",")[1]) / 100;
            sum += nota * pond;
        }
        prom += sum;
        prom = prom.substring(0, 3);
        return prom;
    }

    /**
     * Calculo del promedio general, se calculan los promedios de cada
     * asignatura y se promedian entre ellos Las 5 asignaturas se consideran con
     * la misma ponderación
     *
     * @return Promedio General
     */
    public String getPromedio() {
        String prom;
        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += Double.parseDouble(getPromedioAsignatura(i));
        }
        prom = "" + sum / 5;
        prom = prom.substring(0, 3);
        return prom;
    }

    /**
     * Calcular si el alumno está en condicion de reprobar. Se considera
     * reprobado al alumno que tiene menos del 85% de asistencia, Si tiene 2
     * promedios rojos y promedio general menor a 4.5 o si tiene 3 promedios
     * rojos sin importar su promedio general.
     *
     * @return Verdadero si esta reprobando o Falso si no.
     */
    public boolean estaReprobando() {
        boolean estado = false;
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            if (Double.parseDouble(getPromedioAsignatura(i)) < 4.0) {
                cont++;
            }
        }
        if (cont >= 2 && Double.parseDouble(getPromedio()) < 4.5) {
            estado = true;
        }
        if (cont >= 3) {
            estado = true;
        }
        if (Double.parseDouble(getPorcentajeAsistencia().replaceAll("%", "")) < 85) {
            estado = true;
        }
        return estado;
    }

    /**
     *
     * @return
     */
    public String razonReprobado() {
        String str = "No está reprobando";
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            if (Double.parseDouble(getPromedioAsignatura(i)) < 4.0) {
                cont++;
            }
        }
        if (cont == 2 && Double.parseDouble(getPromedio()) < 4.5) {
            str = "Dos promedios rojos y promedio general bajo 4.5";
            if (Double.parseDouble(getPorcentajeAsistencia().replaceAll("%", "")) < 85) {
                str += ", además de tener un Porcentaje de Asistencia bajo %85";
            }
        } else if (cont >= 3) {
            str = "Más de dos promedios rojos";
            if (Double.parseDouble(getPorcentajeAsistencia().replaceAll("%", "")) < 85) {
                str += " y Porcentaje de Asistencia bajo %85";
            }
        } else if (Double.parseDouble(getPorcentajeAsistencia().replaceAll("%", "")) < 85) {
            str = "Porcentaje de Asistencia bajo %85";
        }
        return str;
    }
}
