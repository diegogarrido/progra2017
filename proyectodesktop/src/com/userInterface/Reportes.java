/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userInterface;

import com.archivos.Serial;
import com.proyecto1.Alumno;
import com.proyecto1.Asignatura;
import com.proyecto1.Curso;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.transform.TransformerException;
import org.json.JSONException;

/**
 * Ventana reportes
 *
 * @author Diego
 */
public final class Reportes extends javax.swing.JFrame {

    private boolean gen;
    private Curso cur;
    private final Serial ser = new Serial();

    /**
     * Creates new form Reporte
     */
    public Reportes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     *
     * @param curso
     */
    public Reportes(Curso curso,boolean gen) {
        initComponents();
        this.cur = curso;
        this.gen=gen;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planificacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        asignatura = new javax.swing.JButton();
        porcentajes = new javax.swing.JButton();
        asistencia = new javax.swing.JButton();
        reprobados = new javax.swing.JButton();
        alumnos = new javax.swing.JButton();
        enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        planificacion.setText("Planificación/Notas/Anotaciones");
        planificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planificacionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Generar Reportes");

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        asignatura.setText("Ver Promedios por Asignatura ");
        asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturaActionPerformed(evt);
            }
        });

        porcentajes.setText("Porcentaje de Notas/Asistencia");
        porcentajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajesActionPerformed(evt);
            }
        });

        asistencia.setText("Ver estudiantes con asistencia X");
        asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistenciaActionPerformed(evt);
            }
        });

        reprobados.setText("Ver estudiantes reprobando");
        reprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprobadosActionPerformed(evt);
            }
        });

        alumnos.setText("Apoderados con más de un alumno");
        alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnosActionPerformed(evt);
            }
        });

        enviar.setText("Planificación para los apoderados");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(planificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(porcentajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reprobados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(volver)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(reprobados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(asistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(porcentajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asignatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volver)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void planificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planificacionActionPerformed
        planificacion();
    }//GEN-LAST:event_planificacionActionPerformed

    private void planificacion() {
        try {
            String dir = "cursos/curso" + cur.getNivel() + cur.getLetra() + "/curso" + cur.getNivel() + cur.getLetra();
            ser.guardarXml(cur, dir);
            ser.guardarGson(cur, dir);
            ser.planificacionWord(dir);
            ser.planificacionHtml(dir);
            ser.planificacionExcel(dir);
            JOptionPane.showMessageDialog(null, "Documentos creados, guardados como: Planific", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException | TransformerException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException | IOException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        volver();
    }//GEN-LAST:event_volverActionPerformed

    private void volver() {
        Cursos cur = new Cursos(this.gen);
        this.dispose();
        cur.setVisible(true);
    }

    private void asignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturaActionPerformed
        asignatura();
    }//GEN-LAST:event_asignaturaActionPerformed

    private void asignatura() {
        try {
            Object[] ob = new Object[cur.getAsignaturas().size()];
            for (int i = 0; i < cur.getAsignaturas().size(); i++) {
                ob[i] = cur.getAsignaturas().get(i).getProfesor().getNombre();
            }
            int sel = JOptionPane.showOptionDialog(null, "Seleccione Profesor", "Selección", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, 0);
            if ("" + sel == null) {
                sel = -1;
            }
            if (sel != -1) {
                String prof = "" + ob[sel];
                if (prof != null) {
                    ArrayList<String> array = new ArrayList();
                    array.add("Profesor: " + prof);
                    array.add("Asignatura: " + cur.getAsignaturas().get(sel).getNombre());
                    array.add("Nombre alumno , Promedio en la asignatura");
                    array.add(" ");
                    for (Alumno alumno : cur.getAlumnos()) {
                        array.add(alumno.getNombre() + " " + alumno.getPromedioAsignatura(cur.getAsignaturas().get(sel).getNombre()));
                    }
                    String str = "cursos/curso" + cur.getNivel() + cur.getLetra();
                    ser.guardarGson(array, str + "/reportes/asign" + prof);
                    ser.guardarXml(array, str + "/reportes/asign" + prof);
                    ser.asignaturaWord(str + "/reportes/asign" + prof, prof);
                    ser.asignaturaHtml(str + "/reportes/asign" + prof, prof);
                    ser.asignaturaExcel(str + "/reportes/asign" + prof, prof);
                    JOptionPane.showMessageDialog(null, "Documentos creados, guardados como: asign" + prof, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | JSONException | TransformerException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void porcentajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajesActionPerformed
        porcentaje();
    }//GEN-LAST:event_porcentajesActionPerformed

    private void porcentaje() {
        try {
            String[] ob = new String[cur.getAlumnos().size()];
            for (int i = 0; i < ob.length; i++) {
                ob[i] = cur.getAlumnos().get(i).getNombre();
            }
            String sel = (String) JOptionPane.showInputDialog(null, "Seleccione Alumno", "Selección", JOptionPane.QUESTION_MESSAGE, null, ob, 0);
            if (sel != null) {
                int se = -1;
                for (int i = 0; i < ob.length; i++) {
                    if (ob[i].contains(sel)) {
                        se = i;
                    }
                }
                int rojos = 0;
                ArrayList<String> array = new ArrayList();
                array.add("Alumno: " + sel);
                array.add("Porcentaje asistencia: " + cur.getAlumnos().get(se).getPorcentajeAsistencia());
                array.add("Notas: ");
                for (int i = 0; i < cur.getAsignaturas().size(); i++) {
                    array.add(cur.getAsignaturas().get(i).getNombre() + ": (Promedio: "+ cur.getAlumnos().get(se).getPromedioAsignatura(cur.getAsignaturas().get(i).getNombre()) +")");
                    if (Double.parseDouble(cur.getAlumnos().get(se).getPromedioAsignatura(cur.getAsignaturas().get(i).getNombre())) < 4.0) {
                            rojos++;
                    }
                    int cont =0;
                    for (int j = 0; j < cur.getAlumnos().get(se).getNotas().size(); j++) {
                        if (cur.getAlumnos().get(se).getNotas().get(j).contains(cur.getAsignaturas().get(i).getNombre())) {
                            array.add("Actividad: "+cur.getAsignaturas().get(i).getPlanificacion().get(cont).split(",")[0]+" Nota: " + cur.getAlumnos().get(se).getNotas().get(j).split(",")[0] + " Ponderacion: " + cur.getAlumnos().get(se).getNotas().get(j).split(",")[1] + "%");
                            cont++;
                        }
                    }
                }
                array.add("Promedio General: " + cur.getAlumnos().get(se).getPromedio());
                array.add("Promedios rojos: " + rojos);
                if (cur.getAlumnos().get(se).estaReprobando()) {
                    array.add("Condicion: No Aprueba");
                } else {
                    array.add("Condicion: Aprueba");
                }
                String str = "cursos/curso" + cur.getNivel() + cur.getLetra();
                ser.guardarGson(array, str + "/reportes/reporteAlumno" + sel);
                ser.guardarXml(array, str + "/reportes/reporteAlumno" + sel);
                ser.porcentajesWord(str + "/reportes/reporteAlumno" + sel, sel);
                ser.porcentajesExcel(str + "/reportes/reporteAlumno" + sel, sel);
                ser.porcentajesHtml(str + "/reportes/reporteAlumno" + sel, sel);
                JOptionPane.showMessageDialog(null, "Documentos creados, guardados como: reporteAlumno" + sel, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | JSONException | TransformerException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistenciaActionPerformed
        asistencia();
    }//GEN-LAST:event_asistenciaActionPerformed

    private void asistencia() {
        try {
            String por = "-1";
            int porc = 0;
            do {
                por = JOptionPane.showInputDialog(null, "Ingrese Porcentaje límite", "Ingresar", JOptionPane.QUESTION_MESSAGE);
                if (por == null) {
                    por = "-1";
                    break;
                }
                try {
                    porc = Integer.parseInt(por);
                    if (porc <= 0 || porc >= 100) {
                        por = "";
                        JOptionPane.showMessageDialog(null, "Ingrese un número entre 1 y 99", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (java.lang.NumberFormatException ex) {
                    por = "";
                    JOptionPane.showMessageDialog(null, "Ingrese solo números", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (por.length() == 0);
            if (!por.contains("-1")) {
                ArrayList<String> array = new ArrayList();
                array.add("Alumnos del curso " + cur.getNivel() + cur.getLetra() + " con porcentaje de asistencia bajo " + porc + "%");
                for (int i = 0; i < cur.getAlumnos().size(); i++) {
                    if (Double.parseDouble(cur.getAlumnos().get(i).getPorcentajeAsistencia().replaceAll("%", "")) < porc) {
                        array.add(cur.getAlumnos().get(i).getNombre() + " con " + cur.getAlumnos().get(i).getPorcentajeAsistencia());
                    }
                }
                String str = "cursos/curso" + cur.getNivel() + cur.getLetra();
                ser.guardarGson(array, str + "/reportes/reporteAsistencia");
                ser.guardarXml(array, str + "/reportes/reporteAsistencia");
                ser.asistenciaWord(str + "/reportes/reporteAsistencia");
                ser.asistenciaExcel(str + "/reportes/reporteAsistencia");
                ser.asistenciaHtml(str + "/reportes/reporteAsistencia");
                JOptionPane.showMessageDialog(null, "Documentos creados, guardados como: reporteAsistenia", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | JSONException | TransformerException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprobadosActionPerformed
        reprobados();
    }//GEN-LAST:event_reprobadosActionPerformed

    private void reprobados() {
        try {
            ArrayList<String> array = new ArrayList();
            array.add("Alumnos del curso " + cur.getNivel() + cur.getLetra() + " en estado de repitencia:");
            for (int i = 0; i < cur.getAlumnos().size(); i++) {
                if (cur.getAlumnos().get(i).estaReprobando()) {
                    array.add(cur.getAlumnos().get(i).getNombre() + " por " + cur.getAlumnos().get(i).razonReprobado());
                }
            }
            String str = "cursos/curso" + cur.getNivel() + cur.getLetra();
            ser.guardarGson(array, str + "/reportes/reprobados");
            ser.guardarXml(array, str + "/reportes/reprobados");
            ser.reprobadosExcel(str + "/reportes/reprobados");
            ser.reprobadosHtml(str + "/reportes/reprobados");
            ser.reprobadosWord(str + "/reportes/reprobados");
            JOptionPane.showMessageDialog(null, "Documentos creados, guardados como: reprobados", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | JSONException | TransformerException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnosActionPerformed
        alumnos();
    }//GEN-LAST:event_alumnosActionPerformed

    private void alumnos() {
        try {
            ArrayList<String> array = new ArrayList();
            array.add("Apoderados con mas de un hijo en el curso " + cur.getNivel() + cur.getLetra() + ": ");
            String exis = "";
            for (Alumno alumno : cur.getAlumnos()) {
                if (alumno.getApoderado().getHijos().size() > 1 && !exis.contains(alumno.getNombre().split(" ")[0])) {
                    array.add("Nombre: " + alumno.getApoderado().getNombre());
                    array.add("Hijos: ");
                    array.add(alumno.getApoderado().getHijos().toString().replaceAll("\\[", "").replaceAll("\\]", ""));
                    array.add(" ");
                    exis += alumno.getNombre().split(" ")[0];
                }
            }
            String str = "cursos/curso" + cur.getNivel() + cur.getLetra();
            ser.guardarGson(array, str + "/reportes/apoderados");
            ser.guardarXml(array, str + "/reportes/apoderados");
            ser.apoderadosExcel(str + "/reportes/apoderados");
            ser.apoderadosHtml(str + "/reportes/apoderados");
            ser.apoderadosWord(str + "/reportes/apoderados");
            JOptionPane.showMessageDialog(null, "Documentos creados, guardados como: apoderados", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | JSONException | TransformerException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        enviar();
    }//GEN-LAST:event_enviarActionPerformed

    private void enviar() {
        try {
            int cont = 0;
            String exis = "";
            for (Alumno alumno : cur.getAlumnos()) {
                if (!exis.contains(alumno.getNombre().split(" ")[0])) {
                    cont++;
                    exis += alumno.getNombre().split(" ")[0];
                }
            }
            Object[] ob = new Object[cont];
            cont = 0;
            exis = "";
            for (Alumno alumno : cur.getAlumnos()) {
                if (!exis.contains(alumno.getNombre().split(" ")[0])) {
                    ob[cont] = alumno.getApoderado().getNombre();
                    cont++;
                    exis += alumno.getNombre().split(" ")[0];
                }
            }
            String sel = (String) JOptionPane.showInputDialog(null, "Seleccione apoderado para crear reporte(s)", "Selección", JOptionPane.QUESTION_MESSAGE, null, ob, 0);
            if (sel == null) {
                sel = "-1";
            }
            if (sel != "-1") {
                int index = 0;
                int cont2 = 0;
                for (int i = 0; i < cur.getAlumnos().size(); i++) {
                    if (cur.getAlumnos().get(i).getApoderado().getNombre().contains(sel)) {
                        index = i;
                        cont2++;
                    }
                }
                ArrayList<String> array = new ArrayList();
                array.add("Apoderado: " + sel);
                array.add("Hijos:");
                for (int i = 0; i < cur.getAlumnos().get(index - cont2 + 1).getApoderado().getHijos().size(); i++) {
                    array.add(cur.getAlumnos().get(index - cont2 + 1).getNombre());
                    for (Asignatura asignatura1 : cur.getAsignaturas()) {
                        array.add(asignatura1.getNombre() + ":");
                        array.add("Profesor: " + asignatura1.getProfesor().getNombre());
                        array.add("Nombre actividad-Fecha Actividad");
                        for (String planificacion1 : asignatura1.getPlanificacion()) {
                            array.add(planificacion1.split(",")[0] + " - " + planificacion1.split(",")[2]);
                        }
                    }
                    cont2--;
                    array.add(" ");
                }
                String str = "cursos/curso" + cur.getNivel() + cur.getLetra();
                ser.guardarGson(array, str + "/reportes/reporteApoderado" + sel);
                ser.guardarXml(array, str + "/reportes/reporteApoderado" + sel);
                ser.apoderadosExcel(str + "/reportes/reporteApoderado" + sel, sel);
                ser.apoderadosHtml(str + "/reportes/reporteApoderado" + sel, sel);
                ser.apoderadosWord(str + "/reportes/reporteApoderado" + sel, sel);
                JOptionPane.showMessageDialog(null, "Documentos creados, guardados como: reporteApoderado" + sel, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | JSONException | TransformerException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Reportes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alumnos;
    private javax.swing.JButton asignatura;
    private javax.swing.JButton asistencia;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton planificacion;
    private javax.swing.JButton porcentajes;
    private javax.swing.JButton reprobados;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
