/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userInterface;

import com.archivos.Serial;
import com.proyecto1.Curso;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Ventana cursos Si se mantiene el click izquierdo sobre un alumno se muestra
 * un popup con su apoderado y sus hijos
 *
 * @author Diego
 */
public final class Cursos extends javax.swing.JFrame {

    /**
     * Creates new form Cursos
     *
     * @throws java.io.FileNotFoundException
     */
    public Cursos() throws FileNotFoundException {
        initComponents();
        crearLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        nivel = new javax.swing.JComboBox<>();
        ab = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        asistencia = new javax.swing.JButton();
        anotaciones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        notas = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo", "Octavo" }));
        nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelActionPerformed(evt);
            }
        });

        ab.setMaximum(1);
        ab.setPaintLabels(true);
        ab.setValue(0);
        ab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abMouseClicked(evt);
            }
        });

        jLabel1.setText("A");

        jLabel2.setText("B");

        jScrollPane1.setMinimumSize(new java.awt.Dimension(256, 23));

        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.setMaximumSize(new java.awt.Dimension(300, 0));
        lista.setMinimumSize(new java.awt.Dimension(300, 0));
        lista.setPreferredSize(new java.awt.Dimension(300, 600));
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        asistencia.setText("Asistencia");
        asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistenciaActionPerformed(evt);
            }
        });

        anotaciones.setText("Anotaciones");
        anotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anotacionesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Alumnos en el Curso:");

        notas.setText("Notas");
        notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasActionPerformed(evt);
            }
        });

        reportes.setText("Reportes");
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salir)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(anotaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(notas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ab, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(ab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notas)
                    .addComponent(reportes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anotaciones)
                    .addComponent(asistencia)
                    .addComponent(salir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelActionPerformed
        try {
            crearLista();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nivelActionPerformed

    private void abMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abMouseClicked
        if (evt.getButton() == (java.awt.event.MouseEvent.BUTTON1)) {
            try {
                crearLista();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_abMouseClicked

    private void asistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistenciaActionPerformed
        asistencia();
    }//GEN-LAST:event_asistenciaActionPerformed

    private void asistencia() {
        if (lista.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un alumno", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            char letra;
            if (ab.getValue() == 0) {
                letra = 'A';
            } else {
                letra = 'B';
            }
            Asistencia asis = new Asistencia(lista.getSelectedValue(), "cursos/curso" + (nivel.getSelectedIndex() + 1) + letra + "/curso" + (nivel.getSelectedIndex() + 1) + letra, lista.getSelectedIndex());
            this.dispose();
            asis.setVisible(true);
        }
    }
    
    private void anotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anotacionesActionPerformed
        anotaciones();
    }//GEN-LAST:event_anotacionesActionPerformed

    private void anotaciones(){
        if (lista.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un alumno", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            char letra;
            if (ab.getValue() == 0) {
                letra = 'A';
            } else {
                letra = 'B';
            }
            Anotaciones anot;
            try {
                anot = new Anotaciones(lista.getSelectedValue(), "cursos/curso" + (nivel.getSelectedIndex() + 1) + letra + "/curso" + (nivel.getSelectedIndex() + 1) + letra, lista.getSelectedIndex());
                anot.setVisible(true);
                this.dispose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void listaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseReleased
        if (evt.getButton() == (java.awt.event.MouseEvent.BUTTON1)) {
            popup.setVisible(false);
        }
    }//GEN-LAST:event_listaMouseReleased

    private void listaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMousePressed
        if (evt.getButton() == (java.awt.event.MouseEvent.BUTTON1)) {
            popup.setLocation(evt.getLocationOnScreen());
            crearPopup();
        }
    }//GEN-LAST:event_listaMousePressed

    private void notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasActionPerformed
        notas();
    }//GEN-LAST:event_notasActionPerformed

    private void notas(){
        if (lista.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione un alumno", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            char letra;
            if (ab.getValue() == 0) {
                letra = 'A';
            } else {
                letra = 'B';
            }
            try {
                Notas not = new Notas(lista.getSelectedValue(), "cursos/curso" + (nivel.getSelectedIndex() + 1) + letra + "/curso" + (nivel.getSelectedIndex() + 1) + letra, lista.getSelectedIndex());
                this.dispose();
                not.setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        reportes();
    }//GEN-LAST:event_reportesActionPerformed

    private void reportes(){
        char letra;
        if (ab.getValue() == 0) {
            letra = 'A';
        } else {
            letra = 'B';
        }
        Reportes rep;
        rep = new Reportes("cursos/curso" + (nivel.getSelectedIndex() + 1) + letra + "/curso" + (nivel.getSelectedIndex() + 1) + letra);
        this.dispose();
        rep.setVisible(true);
    }
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    /**
     * Crear Popup de apoderados con sus hijos
     */
    private void crearPopup() {
        if (lista.getSelectedIndex() != -1) {
            Serial ser = new Serial();
            char letra;
            if (ab.getValue() == 0) {
                letra = 'A';
            } else {
                letra = 'B';
            }
            try {
                Curso cur = (Curso) ser.cargarGson(Curso.class, "cursos/curso" + (nivel.getSelectedIndex() + 1) + letra + "/curso" + (nivel.getSelectedIndex() + 1) + letra);
                popup.removeAll();
                popup.add("Apoderado: " + cur.getAlumnos()[lista.getSelectedIndex()].getApoderado().getNombre());
                String str = "" + cur.getAlumnos()[lista.getSelectedIndex()].getApoderado().getHijos();
                popup.add("Hijos: " + str.replaceAll("[\\[\\]]", ""));
                popup.setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Rellenar la lista con los nombres del curso seleccionado
     *
     * @throws FileNotFoundException
     */
    private void crearLista() throws FileNotFoundException {
        char letra;
        if (ab.getValue() == 0) {
            letra = 'A';
        } else {
            letra = 'B';
        }
        String[] list = new String[30];
        Serial ser = new Serial();
        Curso cur = (Curso) ser.cargarGson(Curso.class, "cursos/curso" + (nivel.getSelectedIndex() + 1) + letra + "/curso" + (nivel.getSelectedIndex() + 1) + letra);
        for (int i = 0; i < 30; i++) {
            list[i] = (cur.getAlumnos()[i].getNombre());
        }
        lista.setListData(list);
        //test\cursos\curso1A
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
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Cursos().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cursos.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider ab;
    private javax.swing.JButton anotaciones;
    private javax.swing.JButton asistencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JComboBox<String> nivel;
    private javax.swing.JButton notas;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JButton reportes;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
