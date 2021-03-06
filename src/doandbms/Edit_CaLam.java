/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doandbms;
import com.mysql.jdbc.CallableStatement;
import java.util.Calendar;
import java.util.Date;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Son Thuol
 */
public class Edit_CaLam extends javax.swing.JFrame {

    /**
     * Creates new form AddCa
     */
    MySQLConnection connection = new MySQLConnection();
    DefaultTableModel tableModel;
    public Edit_CaLam() {
        initComponents();
        tableModel = (DefaultTableModel)Table_Edit.getModel();
        ShowTC_TTCL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TC_MaNV = new javax.swing.JFormattedTextField();
        TC_BoxBuoi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Edit = new javax.swing.JTable();
        TC_Ngay = new javax.swing.JComboBox<>();
        TC_Thang = new javax.swing.JComboBox<>();
        TC_Nam = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TC_UPdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TC_ghichu = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TC_MaCL = new javax.swing.JFormattedTextField();
        Exit = new javax.swing.JButton();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("SỬA CA LÀM");

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buổi:");

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mã NV: ");

        jLabel4.setBackground(new java.awt.Color(102, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ngày làm:");

        TC_MaNV.setBackground(new java.awt.Color(255, 255, 255));
        TC_MaNV.setForeground(new java.awt.Color(0, 0, 0));
        TC_MaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        TC_BoxBuoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sáng", "Chiều", "Tối" }));
        TC_BoxBuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC_BoxBuoiActionPerformed(evt);
            }
        });

        Table_Edit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CL", "Mã Chức Vụ", "Mã Nhân Viên", "Họ Và Tên", "Ngày làm", "Buổi"
            }
        ));
        Table_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_EditMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Edit);

        TC_Ngay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        TC_Thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        TC_Nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ngày");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tháng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Năm");

        TC_UPdate.setBackground(new java.awt.Color(204, 204, 255));
        TC_UPdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TC_UPdate.setForeground(new java.awt.Color(0, 0, 0));
        TC_UPdate.setText("Sửa ");
        TC_UPdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC_UPdateActionPerformed(evt);
            }
        });

        TC_ghichu.setBackground(new java.awt.Color(255, 255, 255));
        TC_ghichu.setColumns(20);
        TC_ghichu.setForeground(new java.awt.Color(0, 0, 0));
        TC_ghichu.setRows(5);
        jScrollPane2.setViewportView(TC_ghichu);

        jLabel10.setBackground(new java.awt.Color(102, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ghi chú");

        jLabel11.setBackground(new java.awt.Color(102, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Mã CL: ");

        TC_MaCL.setBackground(new java.awt.Color(255, 255, 255));
        TC_MaCL.setForeground(new java.awt.Color(0, 0, 0));
        TC_MaCL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Exit.setText("Thoát");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TC_MaCL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(TC_Ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(TC_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TC_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TC_BoxBuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TC_MaNV)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(jLabel6)
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(TC_UPdate)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 553, Short.MAX_VALUE)
                        .addComponent(Exit))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(TC_MaCL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TC_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TC_Ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TC_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TC_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TC_BoxBuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addComponent(TC_UPdate)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TC_BoxBuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC_BoxBuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TC_BoxBuoiActionPerformed
    private String chuyendoiBuoi(String Buoi){
        String buoi = "";
        switch (Buoi){
            case "Sáng": {
                buoi = "S";
                break;
            }
            case "Chiều":{
                buoi = "C";
                break;
            }
            case "Tối":{
                buoi = "T";
                break;
            }
        }
        return buoi;
    }
    private boolean laNamNhuan(int Nam){
        if((Nam % 4 == 0 && Nam % 100 != 0) || Nam % 400 == 0)
            return true;
        else return false;
    }
    
    int tinhSoNgay(int thang, int nam){
        int  songay = 0;
        switch(thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                songay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                songay = 30;
                break;
            case 2:{
                if(laNamNhuan(nam)) songay = 29;
                else songay = 28;
                break;
            }
        }
        return songay;
    }
    private boolean laNgayHopLe(int nDay, int nMonth, int nYear){
	// Kiểm tra năm
	if (nYear < 0){
            return false; // Ngày không còn hợp lệ nữa!
	}
	// Kiểm tra tháng
	if (nMonth < 1 || nMonth > 12){
            return false; // Ngày không còn hợp lệ nữa!
	}
	// Kiểm tra ngày
        if (nDay < 1 || nDay > tinhSoNgay(nMonth, nYear)){
            return false; // Ngày không còn hợp lệ nữa!
	}
	return true; // Trả về trạng thái cuối cùng...
    }
    
        
    private boolean SauNgayHienTai(int ngay, int thang, int nam){
       Calendar c = Calendar.getInstance(); 
  
        // set Month 
        // MONTH starts with 0 i.e. ( 0 - Jan) 
        c.set(Calendar.MONTH, (thang-1)); 
  
        // set Date 
        c.set(Calendar.DATE, ngay); 
  
        // set Year 
        c.set(Calendar.YEAR, nam); 
  
        // creating a date object with specified time. 
        Date dateOne = c.getTime(); 
  
        // creating a date of object 
        // storing the current date 
        Date currentDate = new Date(); 
  
        //System.out.print("Is currentDate after date one : "); 
  
        // if currentDate is after dateOne 
        //System.out.println(currentDate.after(dateOne));
        return currentDate.after(dateOne);
    }
    private void TC_UPdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC_UPdateActionPerformed
       Connection conn = connection.ConnectMySQL();
        Statement Stmt = null;
        String macl = String.valueOf(TC_MaCL.getText()).trim();
        String manv = String.valueOf(TC_MaNV.getText()).trim();
        String ngay = String.valueOf(TC_Ngay.getSelectedItem().toString().trim());
        String thang = String.valueOf(TC_Thang.getSelectedItem().toString().trim());
        String nam = String.valueOf(TC_Nam.getSelectedItem().toString().trim());
        String BUOI = String.valueOf(TC_BoxBuoi.getSelectedItem().toString().trim());
        String buoi = chuyendoiBuoi(BUOI);
        String ghichu = TC_ghichu.getText();
        String NgayThang = nam+"-"+thang+"-"+ngay;
        boolean chekcdate = SauNgayHienTai(Integer.parseInt(ngay) , Integer.parseInt(thang), Integer.parseInt(nam));
        if(manv.equals("") || macl.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Yêu cầu nhập đầy đủ thông tin!!!", "Error", 1);
        }else if(laNgayHopLe(Integer.parseInt(ngay) , Integer.parseInt(thang), Integer.parseInt(nam)) == false){
                JOptionPane.showMessageDialog(rootPane, "Ngày đăng ký không hợp lệ! Yêu cầu chọn lại!", "Erro", 1);
        }else if(chekcdate == true){
            JOptionPane.showMessageDialog(rootPane, "Ngày đăng ký không hợp lệ! Yêu cầu chọn lại!", "Erro", 1);
        }else{
            boolean checktrung = true;
            try {
                CallableStatement cSmt1 = (CallableStatement) conn.prepareCall("{call kiemtracalam(?,?,?)}");
                cSmt1.setString(1, manv);
                cSmt1.setString(2, NgayThang);
                cSmt1.setString(3, buoi);
                ResultSet rs_checkid = cSmt1.executeQuery();
                if(rs_checkid.next()){
                    JOptionPane.showMessageDialog(rootPane, "Yêu cầu bạn chỉnh sửa ngày và buổi làm", "Erro", 1);
                    checktrung = false;
                }else{
                    try{
                        CallableStatement cStmt = (CallableStatement) conn.prepareCall("{call edit_calam(?,?,?,?,?)}");
                        cStmt.setString(1, macl);
                        cStmt.setString(2, manv);
                        cStmt.setString(3, NgayThang);
                        cStmt.setString(4, buoi);
                        cStmt.setString(5, ghichu);
                        ResultSet rs = cStmt.executeQuery();
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ShowTC_TTCL();
    }//GEN-LAST:event_TC_UPdateActionPerformed

    private void Table_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_EditMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tableModel= (DefaultTableModel)Table_Edit.getModel();
        String macl = tableModel.getValueAt(Table_Edit.getSelectedRow(), 0).toString();
        String macv = tableModel.getValueAt(Table_Edit.getSelectedRow(), 1).toString();
        String manv = tableModel.getValueAt(Table_Edit.getSelectedRow(), 2).toString();
        String tennv = tableModel.getValueAt(Table_Edit.getSelectedRow(), 3).toString();
        String ngaylam = tableModel.getValueAt(Table_Edit.getSelectedRow(), 4).toString();
        String NL[] = ngaylam.split("/");
        String buoi = tableModel.getValueAt(Table_Edit.getSelectedRow(), 5).toString();
        if(buoi.equals("C")){
            buoi = "Chiều";
        }else if(buoi.equals("S")){
            buoi = "Sáng";
        }else{
            buoi = "Tối";
        }
        TC_MaCL.setText(macl);
        TC_MaNV.setText(manv);
        TC_Ngay.setSelectedItem(NL[0]);
        TC_Thang.setSelectedItem(NL[1]);
        TC_Nam.setSelectedItem(NL[2]);
        TC_BoxBuoi.setSelectedItem(buoi);
    }//GEN-LAST:event_Table_EditMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed
    private void ShowTC_TTCL(){
    DefaultTableModel tableModel= (DefaultTableModel)Table_Edit.getModel();
        tableModel.setRowCount(0);
        Connection conn = connection.ConnectMySQL();
        ResultSet rs = null;
        try {
            CallableStatement cStmt = (CallableStatement) conn.prepareCall("{call hienthithongtincalam()}");
            rs = cStmt.executeQuery();
            while(rs.next()){
                String macl = rs.getString("ma_calam");
                String manv = rs.getString("ma_nv");
                String macv = rs.getString("ma_cv");
                String tennv = rs.getString("ten_nv");
                String dateNS = rs.getString("ngaylam");
                String NS[] = dateNS.split("-");
                String ngaylam = NS[2]+"/"+NS[1]+"/"+NS[0];
                String buoi = rs.getString("buoi");
                //String ngaysinh = dateNS.getDay()+"/"+dateNS.getMonth()+""+dateNS.getYear();
                tableModel.addRow(new String[]{macl, macv, manv, tennv, ngaylam, buoi});
            } 
        } catch (Exception e) {
            e.printStackTrace();
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit_CaLam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_CaLam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_CaLam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_CaLam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_CaLam().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> TC_BoxBuoi;
    private javax.swing.JFormattedTextField TC_MaCL;
    private javax.swing.JFormattedTextField TC_MaNV;
    private javax.swing.JComboBox<String> TC_Nam;
    private javax.swing.JComboBox<String> TC_Ngay;
    private javax.swing.JComboBox<String> TC_Thang;
    private javax.swing.JButton TC_UPdate;
    private javax.swing.JTextArea TC_ghichu;
    private javax.swing.JTable Table_Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
