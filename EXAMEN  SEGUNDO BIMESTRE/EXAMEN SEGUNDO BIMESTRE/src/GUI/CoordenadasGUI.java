package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingWorker;


import BusinessLogic.ArmamentoBL;
import BusinessLogic.Entities.Armamento;
import Framework.AppException;
import Framework.AppConfiguration;

import java.awt.event.*;

public class CoordenadasGUI extends JFrame implements ActionListener{
    JPanel slPanel = new JPanel();
    static JProgressBar slProgressBar = new JProgressBar();
    static JTable slTablaCoordenadas = new JTable();
    JLabel slLabelLeyendo = new JLabel();
    DefaultTableModel slTableModel = new DefaultTableModel();
    

    public CoordenadasGUI() {
        setTitle("COORDENADAS");
        setSize(500,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        slPanel.setLayout(null);
        slLabelLeyendo.setText("Cargando Coordenadas...");
        slLabelLeyendo.setBounds(20, 20, 200, 25);
        
        slPanel.add(slLabelLeyendo);
        
        slProgressBar.setValue(0);
        slProgressBar.setStringPainted(true);
        slProgressBar.setBounds(20, 50, 200, 25);

        
        slTablaCoordenadas.setBounds(20, 100, 400, 200);
        slTablaCoordenadas.setModel(slTableModel);
        
        slTableModel.addColumn("Capacidad Belica");
        slTableModel.addColumn("Geolocalizacion");
        slTableModel.addColumn("Arsenal");
        
        add(slPanel);
        
        slPanel.add(slProgressBar);
        slPanel.add(slTablaCoordenadas);

        try {
            slMostrarCoordenadas();
        } catch (AppException e) {
            e.printStackTrace();
        }
    }

    private static void slProgressBar() {
        slProgressBar.setValue(0);
        try {
            for (int i = 1; i <= 100; i++) {
                slProgressBar.setValue(i);
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void slMostrarCoordenadas() throws AppException {
        ArmamentoBL slArmamentoBL = new ArmamentoBL();

        for (Armamento slC : slArmamentoBL.getAllArmamento()) {
            slProgressBar();
            Object[] slFila = new Object[3];
            slFila[0] = slC.getSL_CAPACIDAD_BELICA();;
            slFila[1] = slC.getSL_GEOLOCALIZACION();
            slFila[2] = slC.getSL_ARSENAL();
            slTableModel.addRow(slFila);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}