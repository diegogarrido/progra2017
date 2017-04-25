package com.archivos;

import com.proyecto1.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONException;

/**
 * Clase generadora de datos json y xml del curso
 * @author Diego
 */
public class Generator {

    /**
     * Generar
     * @param args
     * @throws IOException
     * @throws org.json.JSONException
     */
    public static void main(String[] args) throws IOException, JSONException {
        Serial ser = new Serial();
        String[] nomAsig = new String[]{"Lenguaje", "Matematica", "Ciencias", "Historia", "Ingles"};
        int nivel = 1;
        for (int k = 0; k < 16; k++) {
            char letra = 'A';
            if (k >= 8) {
                letra = 'B';
            }
            if (nivel == 9) {
                nivel = 1;
            }
            Curso cur = new Curso(nivel, letra);
            ArrayList<String> nombresProf = generarProf();
            for (int j = 0; j < 5; j++) {
                Profesor prof = new Profesor(nombresProf.get(j));
                prof.getCursos().add(cur.getNivel() + " " + cur.getLetra());
                cur.getProfesores().add(prof.getNombre());
                Asignatura as = new Asignatura(prof.getNombre(), nomAsig[j]);
                int cont = 1;
                for (int i = 0; i < as.getPlanificacion().length; i++) {
                    int dia = 1 + (cont * 5);
                    if (i < 4) {
                        as.getPlanificacion()[i] = "Prueba " + (cont) + ",true," + dia + "/5/2017";
                        cont++;
                    } else if (i == 4) {
                        as.getPlanificacion()[i] = "Promedio Actividades,true, ";
                    } else {
                        as.getPlanificacion()[i] = "Actividad,false," + (-3+i) + "/5/2017";
                    }
                }

                prof.getAsignaturas().add(as);
                cur.getAsignaturas()[j] = as;
            }
            cur = generarNombres(cur);
            ArrayList<Apoderado> aps = new ArrayList();
            int cont = 0;
            for (int l = 0; l < cur.getAlumnos().length; l++) {
                int index = -1;
                for (int j = 0; j < aps.size(); j++) {
                    if (aps.get(j).getNombre().contains(cur.getAlumnos()[l].getApoderado().getNombre())) {
                        index = j;
                        aps.get(index).getHijos().add(cur.getAlumnos()[l].getNombre());
                        break;
                    }
                }
                if (aps.isEmpty()) {
                    index = -2;
                    aps.add(new Apoderado(cur.getAlumnos()[l].getApoderado().getNombre()));
                    aps.get(0).getHijos().add(cur.getAlumnos()[l].getNombre());
                }
                if (index == -1 && !aps.isEmpty()) {
                    aps.add(new Apoderado(cur.getAlumnos()[l].getApoderado().getNombre()));
                    aps.get(aps.size() - 1).getHijos().add(cur.getAlumnos()[l].getNombre());
                }
                for (int m = 0; m < cur.getAlumnos()[l].getNotas().length; m++) {
                    Double nota = Math.random() * 6 + 1;
                    String str = nota.toString();
                    str = str.substring(0, 3);
                    cur.getAlumnos()[l].getNotas()[m] = str + ",";
                }
                if (cont == 0) {
                    for (int j = 0; j < cur.getAlumnos()[l].getNotas().length; j++) {
                        int pond = (int) (Math.random() * 20 + 1);
                        if (j == 4 || j == 9 || j == 14 || j == 19 || j == 24) {
                            int sum = 0;
                            sum += Integer.parseInt(cur.getAlumnos()[l].getNotas()[j - 1].split(",")[1]);
                            sum += Integer.parseInt(cur.getAlumnos()[l].getNotas()[j - 2].split(",")[1]);
                            sum += Integer.parseInt(cur.getAlumnos()[l].getNotas()[j - 3].split(",")[1]);
                            sum += Integer.parseInt(cur.getAlumnos()[l].getNotas()[j - 4].split(",")[1]);
                            cur.getAlumnos()[l].getNotas()[j] += 100 - sum;
                        } else {
                            cur.getAlumnos()[l].getNotas()[j] += pond;
                        }
                    }
                } else {
                    for (int j = 0; j < cur.getAlumnos()[l].getNotas().length; j++) {
                        cur.getAlumnos()[l].getNotas()[j] += cur.getAlumnos()[0].getNotas()[j].split(",")[1];
                    }
                }
                for (int i = 0; i < cur.getAlumnos()[l].getNotasAsig().length; i++) {
                    Double nota = Math.random() * 6 + 1;
                    String str = nota.toString();
                    str = str.substring(0, 3);
                    cur.getAlumnos()[l].getNotasAsig()[i] = str;
                }
                double prom1 = (Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[0]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[1]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[2]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[3]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[4])) / 5;
                String not1 = "" + prom1;
                not1 = not1.substring(0, 3);
                String pond1 = cur.getAlumnos()[l].getNotas()[4].split(",")[1];
                cur.getAlumnos()[l].getNotas()[4] = not1 + "," + pond1;
                double prom2 = (Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[5]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[6]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[7]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[8]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[9])) / 5;
                String not2 = "" + prom2;
                not2 = not2.substring(0, 3);
                String pond2 = cur.getAlumnos()[l].getNotas()[9].split(",")[1];
                cur.getAlumnos()[l].getNotas()[9] = not2 + "," + pond2;
                double prom3 = (Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[10]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[11]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[12]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[13]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[14])) / 5;
                String not3 = "" + prom3;
                not3 = not3.substring(0, 3);
                String pond3 = cur.getAlumnos()[l].getNotas()[14].split(",")[1];
                cur.getAlumnos()[l].getNotas()[14] = not3 + "," + pond3;
                double prom4 = (Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[15]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[16]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[17]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[18]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[19])) / 5;
                String not4 = "" + prom4;
                not4 = not4.substring(0, 3);
                String pond4 = cur.getAlumnos()[l].getNotas()[19].split(",")[1];
                cur.getAlumnos()[l].getNotas()[19] = not4 + "," + pond4;
                double prom5 = (Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[20]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[21]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[22]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[23]) + Double.parseDouble(cur.getAlumnos()[l].getNotasAsig()[24])) / 5;
                String not5 = "" + prom5;
                not5 = not5.substring(0, 3);
                String pond5 = cur.getAlumnos()[l].getNotas()[24].split(",")[1];
                cur.getAlumnos()[l].getNotas()[24] = not5 + "," + pond5;
                cont++;
            }
            for (int i = 0; i < aps.size(); i++) {
                for (Alumno alumno : cur.getAlumnos()) {
                    if (aps.get(i).getNombre().contains(alumno.getApoderado().getNombre())) {
                        alumno.setApoderado(aps.get(i));
                    }
                }
                ser.guardarGson(aps.get(i), "cursos/curso" + nivel + letra + "/apoderados/" + aps.get(i).getNombre());
                ser.guardarXml(cur, "cursos/curso" + nivel + letra + "/apoderados/" + aps.get(i).getNombre());
            }
            ser.guardarGson(cur, "cursos/curso" + nivel + letra + "/curso" + nivel + letra);
            ser.guardarXml(cur, "cursos/curso" + nivel + letra + "/curso" + nivel + letra);
            nivel++;
        }

    }

    /**
     * generar nombres de alunos y apoderados
     * @param cur clase curso sin alumnos ni apoderados
     * @return una clase cursos con alumnos y apoderados random
     */
    public static Curso generarNombres(Curso cur) {
        ArrayList<String> nomb = new ArrayList();
        //agregar mas nombres y apellidos para obtener mas variedad
        String[] nombres = new String[]{"Pedro", "Juan", "Diego", "Alberto", "Pablo", "Manuel", "Lorenzo", "Roberto", "Adrian", "Ana", "Martina", "Diana", "Carlos", "Daniel", "Arturo", "Alexis", "Belen", "Camila", "Daniela", "Valentina", "Sofia", "Florencia", "Francisca", "Fransisco", "Isidora", "Catalina", "Agustina", "Agustin", "Gonzalo", "Paz", "Rocio", "Julieta", "Renata", "Matilda", "Benjamin", "Vicente", "Martin", "Joaquin", "Jose", "Paulina", "Lucas", "Mateo", "Javier", "Emilio", "Santiago", "Esteban", "David"};
        String[] apellidos = new String[]{"Rodriguez", "Garrido", "Martines", "Rojas", "Plaza", "Toledo", "Ortiz", "Zapata", "Fierro", "Suazo", "Zuniga", "Ovalle", "Sanhueza", "Obreque", "Aguero", "Gonzales", "Munoz", "Diaz", "Vazques", "Perez", "Soto", "Contreras", "Lopez", "Mora", "Morales", "Fuentes", "Valenzuela", "Araya", "Sepulveda", "Espinoza", "Torres", "Castillo", "Castro", "Chavez", "Bravo", "Gomez", "Iturria", "Pereira", "Salinas", "Sanchez", "Ruiz", "Tapia", "Carrasco", "Cortes", "Vergara", "Oliveros", "Riquelme", "Salazar", "Parra", "Medina"};
        String exist = "";
        for (int i = 0; i < 30; i++) {//modificar el 30 para cambiar la cantidad de nombres generados
            int nom;
            int ape;
            do {
                nom = (int) (Math.random() * (nombres.length));
                ape = (int) (Math.random() * (apellidos.length));
            } while (exist.contains(nom + "," + ape));
            nomb.add(apellidos[ape] + " " + nombres[nom]);
            exist += nom + "," + ape + " ";
        }
        Collections.sort(nomb);
        exist = "";
        for (int i = 0; i < cur.getAlumnos().length; i++) {
            int newnom;
            Apoderado ap;
            String[] split = exist.split(",");
            newnom = (int) (Math.random() * (nombres.length));
            String ape = nomb.get(i).split(" ")[0];
            if (exist.contains(ape)) {
                String antiguo = "";
                for (String split1 : split) {
                    if (split1.contains(ape)) {
                        antiguo = split1;
                    }
                }
                ap = new Apoderado(antiguo);
            } else {
                ap = new Apoderado(ape + " " + nombres[newnom]);
                exist += ape + " " + nombres[newnom] + ",";
            }
            cur.getAlumnos()[i] = new Alumno(nomb.get(i), cur.getNivel() + " " + cur.getLetra(), ap);
            ap.getHijos().add(cur.getAlumnos()[i].getNombre());
            for (int j = 0; j < cur.getAlumnos()[i].getAsistencia().length; j++) {
                int rand = (int) (Math.random() * 15);
                if (rand > 2) {
                    cur.getAlumnos()[i].getAsistencia()[j] = true;
                }
            }
        }
        return cur;
    }

    /**
     * Generar nombres random de profesores
     * @return array con nombres generados
     */
    public static ArrayList<String> generarProf() {
        String[] nombres = new String[]{"Pedro", "Juan", "Diego", "Alberto", "Pablo", "Manuel", "Lorenzo", "Roberto", "Adrian", "Ana", "Martina", "Diana", "Carlos", "Daniel", "Arturo", "Alexis", "Belen", "Camila", "Daniela", "Valentina", "Sofia", "Florencia", "Francisca", "Fransisco", "Isidora", "Catalina", "Agustina", "Agustin", "Gonzalo", "Paz", "Rocio", "Julieta", "Renata", "Matilda", "Benjamin", "Vicente", "Martin", "Joaquin", "Jose", "Paulina", "Lucas", "Mateo", "Javier", "Emilio", "Santiago", "Esteban", "David"};
        String[] apellidos = new String[]{"Rodriguez", "Garrido", "Martines", "Rojas", "Plaza", "Toledo", "Ortiz", "Zapata", "Fierro", "Suazo", "Zuniga", "Ovalle", "Sanhueza", "Obreque", "Aguero", "Gonzales", "Munoz", "Diaz", "Vazques", "Perez", "Soto", "Contreras", "Lopez", "Mora", "Morales", "Fuentes", "Valenzuela", "Araya", "Sepulveda", "Espinoza", "Torres", "Castillo", "Castro", "Chavez", "Bravo", "Gomez", "Iturria", "Pereira", "Salinas", "Sanchez", "Ruiz", "Tapia"};
        String exist = "";
        ArrayList<String> nombresProf = new ArrayList();
        for (int i = 0; i < 5; i++) {
            int nom;
            int ape;
            do {
                nom = (int) (Math.random() * (nombres.length));
                ape = (int) (Math.random() * (apellidos.length));
            } while (exist.contains(nom + "," + ape));
            nombresProf.add(apellidos[ape] + " " + nombres[nom]);
            exist += nom + "," + ape + " ";
        }
        return nombresProf;
    }
}
