
package krsti;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.konek;
import javax.swing.table.DefaultTableModel;
import java.*;
import javax.swing.table.TableColumn;
import krsti.form_login;

public class daftar_matakuliah extends javax.swing.JFrame {
    form_login cot;
    public String nim;
    public String hapus;
    DefaultTableModel model1;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    DefaultTableModel model5;
    DefaultTableModel model6;
    DefaultTableModel model7;
    DefaultTableModel model8;
    DefaultTableModel model9;
    
    konek xxx;
    public daftar_matakuliah(String a) {
        this.nim=a;
//        System.out.println(this.nim);
        initComponents();
        cot = new form_login();
        this.setLocationRelativeTo(null);
        xxx = new konek();
        xxx.Class();
        //System.out.println(cot.nim);
        String []judul = {"Kode Matakuliah", "Nama Matakuliah", "sks", "js"};
        String []judulhasil = {"Kode Matakuliah", "Nama Matakuliah", "sks", "js","smt"};
        //semester 1
        model1 = new DefaultTableModel(judul,0);
        jTable3.setModel(model1);
        tampilkan1();
        //semester 2
        model2 = new DefaultTableModel(judul,0);
        jTable4.setModel(model2);
        tampilkan2();
        //semester 3
        model3 = new DefaultTableModel(judul,0);
        jTable5.setModel(model3);
        tampilkan3();
        //semester 4
        model4 = new DefaultTableModel(judul,0);
        jTable6.setModel(model4);
        tampilkan4();
        //semester 5
        model5 = new DefaultTableModel(judul,0);
        jTable7.setModel(model5);
        tampilkan5();
        //semester 6
        model6 = new DefaultTableModel(judul,0);
        jTable8.setModel(model6);
        tampilkan6();
        //semester 7
        model7 = new DefaultTableModel(judul,0);
        jTable9.setModel(model7);
        tampilkan7();
        //semester 8
        model8 = new DefaultTableModel(judul,0);
        jTable10.setModel(model8);
        tampilkan8();
        //semester 9
        model9 = new DefaultTableModel(judulhasil,0);
        jTable11.setModel(model9);
        tampilkan9();
        
    }
    private void semua(){
        tampilkan1();
        tampilkan2();
        tampilkan3();
        tampilkan4();
        tampilkan5();
        tampilkan6();
        tampilkan7();
        tampilkan8();
        tampilkan9();
    }
    private void tampilkan1(){
        TableColumn column;
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable3.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable3.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable3.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable3.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        int row = jTable3.getRowCount();
        for(int a=0;a<row;a++){
            model1.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester1";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model1.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan2(){
        TableColumn column;
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable4.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable4.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable4.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable4.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        int row = jTable4.getRowCount();
        for(int a=0;a<row;a++){
            model2.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester2";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model2.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan3(){
        TableColumn column;
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable5.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable5.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable5.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable5.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        int row = jTable5.getRowCount();
        for(int a=0;a<row;a++){
            model3.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester3";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model3.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan4(){
        TableColumn column;
        jTable6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable6.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable6.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable6.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable6.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        int row = jTable6.getRowCount();
        for(int a=0;a<row;a++){
            model4.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester4";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model4.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan5(){
        TableColumn column;
        jTable7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable7.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable7.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable7.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable7.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        
        int row = jTable7.getRowCount();
        for(int a=0;a<row;a++){
            model5.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester5";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model5.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan6(){
        TableColumn column;
        jTable8.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable8.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable8.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable8.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable8.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        
        int row = jTable8.getRowCount();
        for(int a=0;a<row;a++){
            model6.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester6";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model6.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan7(){
        TableColumn column;
        jTable9.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable9.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable9.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable9.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable9.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        int row = jTable9.getRowCount();
        for(int a=0;a<row;a++){
            model7.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester7";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model7.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan8(){
        TableColumn column;
        jTable10.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable10.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable10.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable10.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable10.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        int row = jTable10.getRowCount();
        for(int a=0;a<row;a++){
            model8.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js FROM tb_semester8";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4)};
                model8.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    private void tampilkan9(){
        TableColumn column;
        jTable11.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = jTable11.getColumnModel().getColumn(0); 
        column.setPreferredWidth(110);
        column = jTable11.getColumnModel().getColumn(1); 
        column.setPreferredWidth(270); 
        column = jTable11.getColumnModel().getColumn(2); 
        column.setPreferredWidth(30); 
        column = jTable11.getColumnModel().getColumn(3); 
        column.setPreferredWidth(30);
        column = jTable11.getColumnModel().getColumn(4); 
        column.setPreferredWidth(40);
        int row = jTable11.getRowCount();
        for(int a=0;a<row;a++){
            model9.removeRow(0);
        }
        try{
            xxx.ss = xxx.cc.createStatement();
            String sql = "SELECT kode_matkul,nama_matkul,sks,js,smt FROM tb_ambil_matakuliah WHERE id_user = '"+this.nim+"'";
            xxx.rr=xxx.ss.executeQuery(sql);
            int i=1;
            String j;
            while (xxx.rr.next()) {
                j=Integer.toString(i);
                String data[]={xxx.rr.getString(1),xxx.rr.getString(2),xxx.rr.getString(3),xxx.rr.getString(4),xxx.rr.getString(5)};
                model9.addRow(data);
                i=i+1;
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jtab2 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(110);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable3.getColumnModel().getColumn(1).setMinWidth(270);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable3.getColumnModel().getColumn(2).setMinWidth(30);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable3.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable3.getColumnModel().getColumn(3).setMinWidth(30);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable3.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jtab2.addTab("SMT 1", jScrollPane3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(110);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable4.getColumnModel().getColumn(1).setMinWidth(270);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable4.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable4.getColumnModel().getColumn(2).setMinWidth(30);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable4.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable4.getColumnModel().getColumn(3).setMinWidth(30);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable4.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jtab2.addTab("SMT 2", jScrollPane4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setMinWidth(110);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable5.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable5.getColumnModel().getColumn(1).setMinWidth(270);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable5.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable5.getColumnModel().getColumn(2).setMinWidth(30);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable5.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable5.getColumnModel().getColumn(3).setMinWidth(30);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable5.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jtab2.addTab("SMT 3", jScrollPane5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(110);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable6.getColumnModel().getColumn(1).setMinWidth(270);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable6.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable6.getColumnModel().getColumn(2).setMinWidth(30);
            jTable6.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable6.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable6.getColumnModel().getColumn(3).setMinWidth(30);
            jTable6.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable6.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jtab2.addTab("SMT 4", jScrollPane6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(110);
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable7.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable7.getColumnModel().getColumn(1).setMinWidth(270);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable7.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable7.getColumnModel().getColumn(2).setMinWidth(30);
            jTable7.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable7.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable7.getColumnModel().getColumn(3).setMinWidth(30);
            jTable7.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable7.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jtab2.addTab("SMT 5", jScrollPane7);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setMinWidth(110);
            jTable8.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable8.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable8.getColumnModel().getColumn(1).setMinWidth(270);
            jTable8.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable8.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable8.getColumnModel().getColumn(2).setMinWidth(30);
            jTable8.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable8.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable8.getColumnModel().getColumn(3).setMinWidth(30);
            jTable8.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable8.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jtab2.addTab("SMT 6", jScrollPane8);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setMinWidth(110);
            jTable9.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable9.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable9.getColumnModel().getColumn(1).setMinWidth(270);
            jTable9.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable9.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable9.getColumnModel().getColumn(2).setMinWidth(30);
            jTable9.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable9.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable9.getColumnModel().getColumn(3).setMinWidth(30);
            jTable9.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable9.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jtab2.addTab("SMT 7", jScrollPane9);

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable10.setColumnSelectionAllowed(true);
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable10);
        jTable10.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setMinWidth(110);
            jTable10.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable10.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable10.getColumnModel().getColumn(1).setMinWidth(270);
            jTable10.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable10.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable10.getColumnModel().getColumn(2).setMinWidth(30);
            jTable10.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable10.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable10.getColumnModel().getColumn(3).setMinWidth(30);
            jTable10.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable10.getColumnModel().getColumn(3).setMaxWidth(30);
        }

        jtab2.addTab("SMT 8", jScrollPane10);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Kode");

        jLabel2.setText("Nama Matakuliah");

        jLabel3.setText("SKS");

        jLabel4.setText("JS");

        jLabel5.setText("SMT");

        jLabel6.setText("NIM");

        text6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text6ActionPerformed(evt);
            }
        });

        create.setText("INPUT");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        delete.setText("HAPUS");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Matakuliah", "sks", "js", "smt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable11MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTable11);
        if (jTable11.getColumnModel().getColumnCount() > 0) {
            jTable11.getColumnModel().getColumn(0).setMinWidth(110);
            jTable11.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable11.getColumnModel().getColumn(0).setMaxWidth(110);
            jTable11.getColumnModel().getColumn(1).setMinWidth(270);
            jTable11.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable11.getColumnModel().getColumn(1).setMaxWidth(270);
            jTable11.getColumnModel().getColumn(2).setMinWidth(30);
            jTable11.getColumnModel().getColumn(2).setPreferredWidth(5);
            jTable11.getColumnModel().getColumn(2).setMaxWidth(30);
            jTable11.getColumnModel().getColumn(3).setMinWidth(30);
            jTable11.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable11.getColumnModel().getColumn(3).setMaxWidth(30);
            jTable11.getColumnModel().getColumn(4).setMinWidth(70);
            jTable11.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable11.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(create)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(text6)
                                            .addComponent(text5)
                                            .addComponent(text4)
                                            .addComponent(text1)
                                            .addComponent(text2)
                                            .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(51, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delete)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(create))
                    .addComponent(jtab2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new home(this.nim).show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void text6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text6ActionPerformed
        
    }//GEN-LAST:event_text6ActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        try {
            xxx.ss = xxx.cc.createStatement();
            String sql = "INSERT INTO tb_ambil_matakuliah VALUES (null,'"+text1.getText()+"','"+text2.getText()+"','"+text3.getText()+"','"+text4.getText()+"','"+text5.getText()+"','"+this.nim+"') ";
            xxx.ss.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
        semua();
        
        
    }//GEN-LAST:event_createActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int i = jTable3.getSelectedRow();
        if(i>-1){
            text1.setText(model1.getValueAt(i,0).toString());
            text2.setText(model1.getValueAt(i,1).toString());
            text3.setText(model1.getValueAt(i,2).toString());
            text4.setText(model1.getValueAt(i,3).toString());
            text5.setText("1");
            text6.setText(this.nim.toString());
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable11MouseClicked
        int i = jTable11.getSelectedRow();
        if(i>-1){
            this.hapus = model9.getValueAt(i,0).toString();
        }
    }//GEN-LAST:event_jTable11MouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            xxx.ss = xxx.cc.createStatement();
            String sql = "DELETE FROM tb_ambil_matakuliah WHERE kode_matkul = '"+this.hapus+"'";
            xxx.ss.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
        semua();
    }//GEN-LAST:event_deleteActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        int i = jTable4.getSelectedRow();
        if(i>-1){
            text1.setText(model2.getValueAt(i,0).toString());
            text2.setText(model2.getValueAt(i,1).toString());
            text3.setText(model2.getValueAt(i,2).toString());
            text4.setText(model2.getValueAt(i,3).toString());
            text5.setText("2");
            text6.setText(this.nim.toString());
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        int i = jTable5.getSelectedRow();
        if(i>-1){
            text1.setText(model3.getValueAt(i,0).toString());
            text2.setText(model3.getValueAt(i,1).toString());
            text3.setText(model3.getValueAt(i,2).toString());
            text4.setText(model3.getValueAt(i,3).toString());
            text5.setText("3");
            text6.setText(this.nim.toString());
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        int i = jTable6.getSelectedRow();
        if(i>-1){
            text1.setText(model4.getValueAt(i,0).toString());
            text2.setText(model4.getValueAt(i,1).toString());
            text3.setText(model4.getValueAt(i,2).toString());
            text4.setText(model4.getValueAt(i,3).toString());
            text5.setText("4");
            text6.setText(this.nim.toString());
        }
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        int i = jTable7.getSelectedRow();
        if(i>-1){
            text1.setText(model5.getValueAt(i,0).toString());
            text2.setText(model5.getValueAt(i,1).toString());
            text3.setText(model5.getValueAt(i,2).toString());
            text4.setText(model5.getValueAt(i,3).toString());
            text5.setText("5");
            text6.setText(this.nim.toString());
        }
    }//GEN-LAST:event_jTable7MouseClicked

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
        int i = jTable8.getSelectedRow();
        if(i>-1){
            text1.setText(model6.getValueAt(i,0).toString());
            text2.setText(model6.getValueAt(i,1).toString());
            text3.setText(model6.getValueAt(i,2).toString());
            text4.setText(model6.getValueAt(i,3).toString());
            text5.setText("6");
            text6.setText(this.nim.toString());
        }
    }//GEN-LAST:event_jTable8MouseClicked

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        int i = jTable9.getSelectedRow();
        if(i>-1){
            text1.setText(model7.getValueAt(i,0).toString());
            text2.setText(model7.getValueAt(i,1).toString());
            text3.setText(model7.getValueAt(i,2).toString());
            text4.setText(model7.getValueAt(i,3).toString());
            text5.setText("7");
            text6.setText(this.nim.toString());
        }
    }//GEN-LAST:event_jTable9MouseClicked

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        int i = jTable10.getSelectedRow();
        if(i>-1){
            text1.setText(model8.getValueAt(i,0).toString());
            text2.setText(model8.getValueAt(i,1).toString());
            text3.setText(model8.getValueAt(i,2).toString());
            text4.setText(model8.getValueAt(i,3).toString());
            text5.setText("7");
            text6.setText(this.nim.toString());
        }
    }//GEN-LAST:event_jTable10MouseClicked

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
            java.util.logging.Logger.getLogger(daftar_matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar_matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar_matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar_matakuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar_matakuliah(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTabbedPane jtab2;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JTextField text6;
    // End of variables declaration//GEN-END:variables
}
