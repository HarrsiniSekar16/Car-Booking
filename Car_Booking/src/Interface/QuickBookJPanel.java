/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarInformationList;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshi
 */
public class QuickBookJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuickBookJPanel
     */
    
    private JPanel UserProcessContainer;
    private CarInformationList carInformationList;
    private Car car;
   private List<Car> templist=new ArrayList<>();
    
    QuickBookJPanel(JPanel UserProcessContainer, CarInformationList carinformationlist) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.carInformationList = carinformationlist;
        this.car = car;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MC = new javax.swing.ButtonGroup();
        Availability = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BrandTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        MinSeatComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        MaxSeatComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ManuYearTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        serialnumbertextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        YesAvailableRBtn = new javax.swing.JRadioButton();
        NAVailRbTN = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        noMCRBtn = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        ModelNumberTextField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        BtnBook = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model No", "Min Seats", "Max seats", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewTable);

        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Brand :");

        BrandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Min Seats :");

        MinSeatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        MinSeatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinSeatComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Max Seats :");

        MaxSeatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        MaxSeatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxSeatComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Manufactured Year :");

        jLabel5.setText("Serial Number :");

        jLabel6.setText("Availability :");

        Availability.add(YesAvailableRBtn);
        YesAvailableRBtn.setText("Yes");

        Availability.add(NAVailRbTN);
        NAVailRbTN.setText("No");

        jLabel7.setText("Maintanence Certificate :");

        MC.add(jRadioButton1);
        jRadioButton1.setText("Yes");

        MC.add(noMCRBtn);
        noMCRBtn.setText("No");

        jLabel8.setText("Model Number:");

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        BtnBook.setText("Book Ride");

        jLabel9.setText("Available City:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchBtn)
                .addGap(309, 309, 309))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(YesAvailableRBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ManuYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NAVailRbTN))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118)
                                        .addComponent(jLabel2)
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(noMCRBtn))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(MinSeatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(113, 113, 113)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(MaxSeatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(serialnumbertextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ModelNumberTextField))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(91, 91, 91))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(MinSeatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(MaxSeatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ManuYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(serialnumbertextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ModelNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(YesAvailableRBtn)
                    .addComponent(NAVailRbTN)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton1)
                    .addComponent(noMCRBtn))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBook)
                    .addComponent(SearchBtn))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
                
        
        for(Car car: carInformationList.carInformationList)
        {
            //System.out.println((YesMainCert.isSelected()&&car.isMaintenance_certificate())||(NoMainCert.isSelected()&&!car.isMaintenance_certificate())||(NAmaincert.isSelected()));
            if((BrandTextField.getText().equals(car.getBrand()) || car.getBrand().equals(""))
                    && (ModelNumberTextField.getText().equals(car.getModel_num()) || 
                            ModelNumberTextField.getText().equals("")
                    )
                    &&
                    (serialnumbertextfield.getText().equals(car.getSerial_num() + "") ||
                    serialnumbertextfield.getText().equals("")
                    )
                    &&(cityTextField.getText().equals(car.getAvailble_city()) ||
                    cityTextField.getText().equals("")
                    )
                   &&((
                    !ManuYearTextField.getText().isEmpty() 
                    && Integer.parseInt(ManuYearTextField.getText())
                           == car.getManufactured_year() 
                         ) || ManuYearTextField.getText().isEmpty() )
                //    &&(
                 //   jRadioButton1.isSelected() == car.isMaintenance_certificate()
                    
                    
                    //)
                    )
            {
               
             //   if(Integer.parseInt(String.valueOf(MaxSeatComboBox.getSelectedItem())) <= car.getMax_seats()
               //        && Integer.parseInt(String.valueOf(MinSeatComboBox.getSelectedItem()))
                 //      >= car.getMin_seats())
                {
               //    if(YesAvailableRBtn.isSelected()&&car.isAvailable())
                   {
                      templist.add(car);
                   }
               
                }
            }
           
        }
        populateTable(templist);
    
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void BrandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandTextFieldActionPerformed

    private void MinSeatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinSeatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinSeatComboBoxActionPerformed

    private void MaxSeatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxSeatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxSeatComboBoxActionPerformed
private void populateTable(List<Car> carinformationlist){
        DefaultTableModel dtm = (DefaultTableModel)viewTable.getModel();
        dtm.setRowCount(0);
       
        for ( Car car : carinformationlist )
        {
            Object row[] = new Object[5];
            row[0] = car;
            row[1] = car.getModel_num();
            row[2] = car.getMin_seats();
            row[3] = car.getMax_seats();
            row[4] = car.getAvailble_city();
            dtm.addRow(row);
    }
    
}

public void populateTable()
{
     DefaultTableModel dtm = (DefaultTableModel)viewTable.getModel();
        dtm.setRowCount(0);
        
         for ( Car car : carInformationList.carInformationList )
        {
            Object row[] = new Object[5];
            row[0] = car;
            row[1] = car.getModel_num();
            row[2] = car.getMin_seats();
            row[3] = car.getMax_seats();
            row[4] = car.getAvailble_city();
            dtm.addRow(row);
    }
    }  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Availability;
    private javax.swing.JTextField BrandTextField;
    private javax.swing.JButton BtnBook;
    private javax.swing.ButtonGroup MC;
    private javax.swing.JTextField ManuYearTextField;
    private javax.swing.JComboBox<String> MaxSeatComboBox;
    private javax.swing.JComboBox<String> MinSeatComboBox;
    private javax.swing.JTextField ModelNumberTextField;
    private javax.swing.JRadioButton NAVailRbTN;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JRadioButton YesAvailableRBtn;
    private javax.swing.JButton btnBack1;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton noMCRBtn;
    private javax.swing.JTextField serialnumbertextfield;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
