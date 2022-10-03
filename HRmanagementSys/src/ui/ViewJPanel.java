/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author Dell
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
     EmployeeHistory history;
     
    public ViewJPanel(EmployeeHistory history) {
        initComponents();
         this.history=history;
         
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblempdetails = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTeamInfo = new javax.swing.JLabel();
        txtLevl = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblCellPhoneNum = new javax.swing.JLabel();
        txtPositionTitle = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        txtCellPhoneNum = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        txtEmailAdd = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmpId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        txtimage = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();
        btnbrowse = new javax.swing.JButton();
        lblimage1 = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("                                                                    View Employee Records");

        tblempdetails.setBackground(new java.awt.Color(204, 204, 204));
        tblempdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblempdetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblempdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "EmpId", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cellphone Num", "Email Address", "Image"
            }
        ));
        tblempdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblempdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblempdetails);

        btnView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnView.setText("View");
        btnView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTeamInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTeamInfo.setText("Team Info");

        txtLevl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPositionTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPositionTitle.setText("Position Title");

        txtTeamInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCellPhoneNum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCellPhoneNum.setText("Cell Phone Number");

        txtPositionTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionTitleActionPerformed(evt);
            }
        });

        lblEmailAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmailAddress.setText("Emial Address");

        txtCellPhoneNum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCellPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumActionPerformed(evt);
            }
        });

        txtEmailAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setText("Name");

        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEmpId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmpId.setText("EmpId");

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAge.setText("Age");

        txtEmpId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIdActionPerformed(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGender.setText("Gender");

        txtAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblLevel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLevel.setText("Level");

        txtGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblStartDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStartDate.setText("Start Date");

        txtStartDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        txtimage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimageActionPerformed(evt);
            }
        });

        lblimage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblimage.setText("Image");

        btnbrowse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbrowse.setText("Browse");
        btnbrowse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        lblimage1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblimage1.setText("     Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblimage1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmpId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCellPhoneNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPositionTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCellPhoneNum, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmpId, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStartDate, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLevl, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtimage, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(67, 67, 67)
                                                .addComponent(btnbrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch)
                                .addGap(254, 254, 254)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimage1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmpId)))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGender)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStartDate)
                            .addComponent(lblStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLevel)
                            .addComponent(txtLevl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPositionTitle)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCellPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCellPhoneNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailAddress)
                            .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimage)
                            .addComponent(txtimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionTitleActionPerformed

    private void txtCellPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumActionPerformed

    private void txtEmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblempdetails.getSelectedRow();
         if (selectedRowIndex<0){
             
             JOptionPane.showMessageDialog(this, "Please select the row to delete");
             return;
         }
          DefaultTableModel model=(DefaultTableModel)tblempdetails.getModel();
          Employee selectedemp = (Employee)model.getValueAt(selectedRowIndex, 0);
          history.deleteemp(selectedemp);
          
              JOptionPane.showMessageDialog(this, "Employee Details Deleted");
          
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblempdetails.getSelectedRow();
         if (selectedRowIndex<0){
             
             JOptionPane.showMessageDialog(this, "Please select the row to view");
             return;
         }
          DefaultTableModel model=(DefaultTableModel)tblempdetails.getModel();
          Employee selectedemp = (Employee)model.getValueAt(selectedRowIndex, 0);
          
          txtName.setText(selectedemp.getName());
          txtEmpId.setText(String.valueOf(selectedemp.getEmpid()));
          txtAge.setText(String.valueOf(selectedemp.getAge()));
          txtGender.setText(selectedemp.getGender());
          txtStartDate.setText(selectedemp.getStartdate());
          txtLevl.setText(selectedemp.getLevel());
          txtPositionTitle.setText(selectedemp.getPositiontitle());
          txtCellPhoneNum.setText(String.valueOf(selectedemp.getCellphonenum()));
          txtEmailAdd.setText(selectedemp.getEmailid());
          txtimage.setText(selectedemp.getPhoto());
          
//                      File file = new File(selectedemp.getPhoto());
//                      String ph =  file.getAbsolutePath();
 //              File file = new File(selectedemp.getPhoto());
  //          String getSelectedImage = file.getAbsolutePath();
           
            ImageIcon image = new ImageIcon(selectedemp.getPhoto());          
               Image imFit = image.getImage();
            imFit = imFit.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
            lblPhoto.setIcon(new ImageIcon(imFit));
                 
          
    }//GEN-LAST:event_btnViewActionPerformed

    private void tblempdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblempdetailsMouseClicked
      //set data to thier text field
      // int selectedRowIndex = tblempdetails.getSelectedRow();
       // DefaultTableModel model=(DefaultTableModel)tblempdetails.getModel();
        
        // set data to text field when raw is selected
     //  String Name = model.getValueAt(selectedRowIndex, 1).toString();
    
      // Employee selectedemp = history.getEmployeeById(Name);
      
      // txtName.setText(selectedemp.getName());
      // txtEmpId.setText(selectedemp.getEmpid());
      // txtAge.setText(selectedemp.getAge());
      // txtGender.setText(selectedemp.getGender());
      /// txtStartDate.setText(selectedemp.getStartdate());
      // txtLevl.setText(selectedemp.getLevel());
      // txtPositionTitle.setText(selectedemp.getPositiontitle());
      // txtCellPhoneNum.setText(selectedemp.getCellphonenum());
      // txtEmailAdd.setText(selectedemp.getEmailid());
        
    }//GEN-LAST:event_tblempdetailsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblempdetails.getModel();
        int selectedRowIndex =  tblempdetails.getSelectedRow();
       
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a Row to Update");
            return;
        }
       
        if(tblempdetails.getSelectedRowCount() == 1){
            //if single row is selected then update
            String name=txtName.getText();
            String empId=txtEmpId.getText();
            String age=txtAge.getText();
            String gender=txtGender.getText();
             String startdate=txtStartDate.getText();            
             String level=txtLevl.getText();
             String teaminfo=txtTeamInfo.getText();
             String positiontitle=txtPositionTitle.getText();
             String cellphonenum=txtCellPhoneNum.getText();
            String emailid=txtEmailAdd.getText();
            String photo= txtimage.getText();

            model.setValueAt(name, tblempdetails.getSelectedRow(), 0);
            model.setValueAt(empId, tblempdetails.getSelectedRow(), 1);
            model.setValueAt(age, tblempdetails.getSelectedRow(), 2);
            model.setValueAt(gender, tblempdetails.getSelectedRow(), 3);
            model.setValueAt(startdate, tblempdetails.getSelectedRow(), 4);
            model.setValueAt(level, tblempdetails.getSelectedRow(), 5);
            model.setValueAt(teaminfo, tblempdetails.getSelectedRow(), 6);
            model.setValueAt(positiontitle, tblempdetails.getSelectedRow(), 7);
            model.setValueAt(cellphonenum, tblempdetails.getSelectedRow(), 8);
            model.setValueAt(emailid, tblempdetails.getSelectedRow(), 9);
            model.setValueAt(photo, tblempdetails.getSelectedRow(), 10);
            

            JOptionPane.showMessageDialog(this, "Employee Records Updated successfully!!!");
        }
        else{
           
            if(tblempdetails.getRowCount () == 0){
                //if table is empty
                JOptionPane.showMessageDialog(this, "Table is empty !!!");
            }
            else{
                //if row is not selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select single row for update !!!");

            }
           
        }
         
       
    
    }//GEN-LAST:event_btnUpdateActionPerformed

     public void search(String str){
          DefaultTableModel model=(DefaultTableModel)tblempdetails.getModel();
          TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel> (model);
       tblempdetails.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(str));
    }
     
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        
        String Search=txtSearch.getText();
        search(Search);
        
        //DefaultTableModel model=(DefaultTableModel)tblempdetails.getModel();
       //String search=txtSearch.getText().toLowerCase();
       //TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel> (model);
      // tblempdetails.setRowSorter(tr);
       // tr.setRowFilter(RowFilter.regexFilter(search));
        
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimageActionPerformed

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("4 supported extensions", "jpg","jpeg","gif","png");
        fileChooser.setFileFilter(filter);
        int selected = fileChooser.showOpenDialog(null);

        if(selected == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            String getSelectedImage = file.getAbsolutePath();
            JOptionPane.showMessageDialog(null, getSelectedImage);
            ImageIcon imIco = new ImageIcon(getSelectedImage);

            txtimage.setText(file.getAbsolutePath());

            //image to fit in the jlabel
            Image imFit = imIco.getImage();
            Image imgFit = imFit.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
            lblPhoto.setIcon(new ImageIcon(imFit));
        }

    }//GEN-LAST:event_btnbrowseActionPerformed

    private void txtEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIdActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnbrowse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhoneNum;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblimage1;
    private javax.swing.JTable tblempdetails;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhoneNum;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevl;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JTextField txtimage;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model=(DefaultTableModel)tblempdetails.getModel();
        model.setRowCount(0);
        
      for (Employee e : history.getHistory()){
     Object[] row = new Object[11];
    row[0]=e;
    row[1]=e.getEmpid();
    row[2]=e.getAge();
    row[3]=e.getGender();
    row[4]=e.getStartdate();
    row[5]=e.getLevel();
    row[6]=e.getTeaminfo();
    row[7]=e.getPositiontitle();
    row[8]=e.getCellphonenum();
    row[9]=e.getCellphonenum();
    row[10]=e.getPhoto();
    
    model.addRow(row);
                                                            
    }
    }
//    private Employee getData(DefaultTableModel model,int selectedRowIndex){
//        Employee employee=new Employee();
//        employee.setName((String)model.getValueAt(selectedRowIndex, 0));
//        employee.setEmpid((String)model.getValueAt(selectedRowIndex, 1));
//        employee.setAge((String)model.getValueAt(selectedRowIndex, 2));
//        employee.setGender((String)model.getValueAt(selectedRowIndex, 3));
//        employee.setStartdate((String)model.getValueAt(selectedRowIndex, 4));
//        employee.setLevel((String)model.getValueAt(selectedRowIndex, 5));
//        employee.setTeaminfo((String)model.getValueAt(selectedRowIndex, 6));
//        employee.setPositiontitle((String)model.getValueAt(selectedRowIndex, 7));
//        employee.setCellphonenum((String)model.getValueAt(selectedRowIndex, 8));
//        employee.setEmailid((String)model.getValueAt(selectedRowIndex, 9));
//        employee.setPhoto((String)model.getValueAt(selectedRowIndex, 10));
//       
//        return employee;
//    }
//    private void setData(Employee employeeList){
//        employeeList.setName(txtName.getText());
//         employeeList.setEmpid(txtEmpId.getText());
//         employeeList.setAge(txtAge.getText());
//          employeeList.setGender(txtGender.getText());
//           employeeList.setStartdate(txtStartDate.getText());
//            employeeList.setLevel(txtLevl.getText());
//             employeeList.setTeaminfo(txtTeamInfo.getText());
//         employeeList.setPositiontitle(txtPositionTitle.getText());
//          employeeList.setCellphonenum(txtCellPhoneNum.getText());
//           employeeList.setEmailid(txtEmailAdd.getText());
//            employeeList.setPhoto(txtimage.getText());
//            
//    }
//    
             
    
        
        
        
        

        
        
    
}

    
    

