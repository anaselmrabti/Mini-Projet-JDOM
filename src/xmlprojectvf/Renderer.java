/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlprojectvf;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anase
 */
 class Renderer extends DefaultTableCellRenderer {
  JLabel lbl = new JLabel();

 public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
  boolean hasFocus, int row, int column) {
//lbl.setText("Aff.rôles");
lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/icons8-visible-15.png")));
lbl.addMouseListener(new MouseAdapter() {
    public void mouseCliked(MouseEvent e){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRow = table.getSelectedRow();
        ArrayList<role> roles = (ArrayList<role>) model.getValueAt(selectedRow,5);
        JTable mytable = new JTable();

            mytable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Nom", "Prénom", "Intitule"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
                };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DefaultTableModel mdl = (DefaultTableModel) mytable.getModel();
                for (int i = 0; i < roles.size(); i++){
                    role r = roles.get(i);
                    Object data[]  = {r.getNom(), r.getPrenom(), r.getIntitule()};
                    mdl.addRow(data);
                }
        JScrollPane scrollPane= new  JScrollPane(mytable);
        JFrame f = new JFrame();
        f.setTitle("Roles");
        f.getContentPane().add(scrollPane,BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }
});

return lbl;
}
}
