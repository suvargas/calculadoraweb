package centroide;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
//import java.io.IOException;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Algoritmo_centroide extends Fondo
{

    DefaultTableModel miModelo=new DefaultTableModel();
    public int n;
    public int m;
    public String[] nombresCol; //Vector que guarda el nombre de las columnas
    public String[] nombresFil; //Vector que guarda el nombre de las filas
    public static String tipo;  //Guarda el tipo de accion, maximizar o minimizar(max y min)

    double[][] matrix;//matriz donde se extraen los numeros ingresados en la tabla


    public Algoritmo_centroide()
    {
       initComponents();
       setTitle("\t\tCentroide por Distancias Euclidianas");
       matriz.setModel(new DefaultTableModel());

       Dimension pantalla, cuadro;
                pantalla = Toolkit.getDefaultToolkit().getScreenSize();
                cuadro = this.getSize();
                this.setLocation(((pantalla.width - cuadro.width)/2),(pantalla.height - cuadro.height)/2);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filas = new javax.swing.JTextField();
        columnas = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        matriz = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));

        filas.setEditable(false);
        filas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        filas.setText("2");
        filas.setUI(null);
        filas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        filas.setEnabled(false);
        filas.setName("filas"); // NOI18N
        filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filasActionPerformed(evt);
            }
        });
        filas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                filasFocusLost(evt);
            }
        });

        columnas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        columnas.setToolTipText("");
        columnas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        columnas.setName("columnas"); // NOI18N
        columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasActionPerformed(evt);
            }
        });
        columnas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                columnasFocusGained(evt);
            }
        });
        columnas.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                columnasHierarchyChanged(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Resolver");
        jButton2.setEnabled(false);
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 0));
        jButton1.setText("Tabla");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        matriz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        matriz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        matriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        matriz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        matriz.setName("matriz"); // NOI18N
        matriz.setRowHeight(25);
        matriz.setRowSelectionAllowed(false);
        matriz.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(matriz);

        jLabel4.setText("NUMERO DE PARES:");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("CENTROIDE:");
        jLabel5.setName("jLabel5"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\rie\\Desktop\\ALGORITMOS\\Centroide\\src\\centroide\\logo_ucb.png")); // NOI18N
        jLabel9.setText("     ");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/centroide/system_help-2.png"))); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel10.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel10.setName("jLabel10"); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel11.setName("jLabel11"); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel12.setName("jLabel12"); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/centroide/icon.printer_64.png"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel13.setName("jLabel13"); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jMenuBar1.setName("jMenuBar1"); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(662, 662, 662)
                .addComponent(filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(461, 461, 461)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(459, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(461, 461, 461)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(478, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(461, 461, 461)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(478, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(280, 280, 280)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(314, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(298, 298, 298)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(314, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(298, 298, 298)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(314, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filasActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_filasActionPerformed

    private void columnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasActionPerformed

        // TODO add your handling code here:
}//GEN-LAST:event_columnasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton2.setEnabled(true);
        
            m = Integer.parseInt(filas.getText()); //Numero de filas
            n = Integer.parseInt(columnas.getText()); //Numero de columnas
            if(n < 3)
                // se verifica la condicion de que el nf sea <= nc
                javax.swing.JOptionPane.showMessageDialog(null,"El numero de pares debe ser mayor a 3","Error",javax.swing.JOptionPane.WARNING_MESSAGE);
            else //En caso de que la condicion no se cumpla
            {
                getNames(); //Se llama a la funcion de abajo
                buildTable();
                
            }       
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void columnasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_columnasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_columnasFocusGained

    private void columnasHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_columnasHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_columnasHierarchyChanged

    private void filasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filasFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_filasFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
Graphics g = jPanel1.getGraphics();
int ancho=jPanel1.getWidth();
int alto=jPanel1.getHeight();

/*
double dxi,dyi,dxf,dyf;
int xi,yi,xf,yf;


int p = matriz.getColumnCount();
 
dxi = Double.parseDouble((String) matriz.getValueAt(0,1)); //1
dyi = Double.parseDouble((String) matriz.getValueAt(1,1)); //4

dxf = Double.parseDouble((String) matriz.getValueAt(0,2)); //1
dyf = Double.parseDouble((String) matriz.getValueAt(1,2)); //4

xi=(int) dxi;
yi=(int) dyi;
xf=(int) dxf;
yf=(int) dyf;
*/


//int p = (int) d;
/* 
int numFilas = matriz.getRowCount();
int numColumnas = matriz.getColumnCount();

int matrix[][] = new int[numFilas][numColumnas];

int xi = Integer.parseInt((String) matriz.getValueAt(0,0));


int yi= matrix[1][2] = Integer.parseInt((String) matriz.getValueAt(1,2));
int xf= matrix[2][1] = Integer.parseInt((String) matriz.getValueAt(2,1));
int yf= matrix[2][2] = Integer.parseInt((String) matriz.getValueAt(2,2));

System.out.print(xi + "\t");

System.out.print(yi + "\t");
System.out.print(yi + "\t");
System.out.print(yf + "\t");

g.setColor(Color.blue);
g.drawLine(xi,yi,xf,yf);

   
        
        for (int rowIndex = 0; rowIndex < numFilas; rowIndex++)
        {
            for (int colIndex = 1; colIndex < numColumnas; colIndex++)
            {
                  
                matrix[rowIndex][colIndex] = Double.parseDouble((String) matriz.getValueAt(rowIndex, colIndex));
                 double d = matrix[rowIndex][colIndex];
               xi = (int)d;
                System.out.print(xi + "\t");
            }
            
            System.out.println();
        }
*/

/**********************************
 **********************************
 **********************************
 ***                            ***
 ***           EJEMPLO          ***
 ***                            ***    
 **********************************
 **********************************
 **********************************/

/*************Triangulo Original*************/
g.setColor(Color.BLACK);
g.drawString("("+10+","+10+")",100,100);
g.drawLine(100,100,300,300);
g.drawString("("+30+","+30+")",300,300);
g.drawLine(300,300,400,100);
g.drawString("("+40+","+10+")",400,100);
g.drawLine(400,100,100,100);
/*************Primera Iteracion*************/
g.setColor(Color.green);
g.drawString("("+20+","+20+")",200,200);
g.drawLine(200,200,250,100);
g.drawString("("+25+","+10+")",250,100);
g.drawLine(250,100,350,200);
g.drawString("("+35+","+20+")",350,200);
g.drawLine(350,200,200,200);
/*************Segunda Iteracion*************/
g.setColor(Color.red);
g.drawString("("+22+","+15+")",225,150);
g.drawLine(225,150,300,150);
g.drawString("("+30+","+15+")",300,150);
g.drawLine(300,150,275,200);
g.drawString("("+27+","+20+")",275,200);
g.drawLine(275,200,225,150);

    
   /*    

g.setColor(Color.BLUE);
g.drawLine(xi,yi,xf,yf);
//System.out.print(dxi+" , "+dyi+"\n"+dxf+" , "+dyf);
System.out.print(xi+" , "+yi+"\n"+xf+" , "+yf);
g.drawString("("+xi+","+yi+")",xi,yi);
g.drawString("("+xf+","+yf+")",xf,yf);
g.setColor(Color.RED);
g.drawString("o"+"("+(xf-xi)/2+","+(yf-yi)/2+")",(xf-xi)/2,(yf-yi)/2);
g.setColor(Color.GREEN);
g.drawLine((xf-xi)/2,(yf-yi)/2,400,45);
*/

//g.drawString("("+(p-1)+","+10,20,20);


/*
for(int f=0;f<3;f++)
{    
//g.drawLine(f*10*p,f+10*p,f*20*p,f+20*p);
g.drawLine(f*10*p,f+10*p,f*20*p,f+20*p);
}
* */
//g.drawLine(Integer.parseInt(tfx.getText()),alto- Integer.parseInt(tfy.getText()), Integer.parseInt(tfancho.getText()), alto - Integer.parseInt (tfalto.getText()));
//g.drawString(tfx.getText()+","+tfy.getText(),Integer.parseInt(tfx.getText()),alto-Integer.parseInt (tfy.getText()));

       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
              Help calar=new Help();
        calar.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
      //  imprimirturno();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        //imprimirturno();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
       // imprimirturno();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        imprimirturno();
    }//GEN-LAST:event_jLabel13MouseClicked

        public void imprimirturno() {
         PrinterJob printerJob = PrinterJob.getPrinterJob(); 
         //printerJob.setPrintable(null);
          printerJob.printDialog(); 
         // printerJob.print();
         try {
             printerJob.print();
         }
         catch (PrinterException ex){
             System.out.println("Error: "+ ex);
         }
     }
    public int print (Graphics graphics, PageFormat pageFormat, int pageIndex)throws PrinterException{
        //throw new UnsupportedOperationException("Not supported yet.");
        if (pageIndex==0)
        {
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX (), pageFormat.getImageableY());
          jPanel1.printAll(graphics);
        //this.printAll(graphics);
        return PAGE_EXISTS;
    }
        else
        {
            return NO_SUCH_PAGE;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField columnas;
    private javax.swing.JTextField filas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable matriz;
    // End of variables declaration//GEN-END:variables

    public void getNames()
    {
        
        nombresFil = new String[m];
        nombresFil[0] ="X:";
        nombresFil[1] ="Y:";
        nombresCol = new String[n+1];
        nombresCol[0] = "(x,y)";//primera columna
        for (int i=0;i<n;i++)
        {
            nombresCol[i+1]=Integer.toString(i);
            //nombresCol[i+1] = javax.swing.JOptionPane.showInputDialog("Nombre de destino: " + (i+1));
        }
        //dispose();
    }
    
    public  void buildTable() //Construye la tabla---ingresa nombres de filas y columnas..mediante llamado de dato al "Main_1"
    {
        //se crea un dtm tomando a los nombres de columnas como los nombres de destino --> nD
        javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel(nombresCol, m)
        {//sobreescribimos el metodo isCellEditable para que la primera columna no sea
         //editable ya que contiene los nombres de origen
        @Override
	public boolean isCellEditable(int row, int column)
        {
	if (0 == column)
	return false;
	return super.isCellEditable(row, column);
	}
        };
        
        for (int i=0;i<m;i++)
        {
        dtm.setValueAt(nombresFil[i], i, 0);//se llena la columna de origenes ---> columna 0
        //se llena la columna de origenes ---> columna 0
        }
        matriz.setModel(dtm); //matriz --> es la tabla
        //hacemos que la columna de los origenes tenga la misma apariencia que la de destinos
        matriz.getColumnModel().getColumn(0).setCellRenderer(matriz.getTableHeader().getDefaultRenderer());//Interesante---aplicar
        
    }

    public double[][] obtenerInformacion()
    {

        int numFilas = matriz.getRowCount();
        int numColumnas = matriz.getColumnCount();
        double matrix[][] = new double[numFilas][numColumnas];
        for (int rowIndex = 0; rowIndex < numFilas; rowIndex++)
        {
            for (int colIndex = 1; colIndex < numColumnas; colIndex++)
            {
                matrix[rowIndex][colIndex] = Double.parseDouble((String) matriz.getValueAt(rowIndex, colIndex));
                System.out.print(matrix[rowIndex][colIndex] + "\t");
            }
            System.out.println();
        }
        return (matrix);
    }
}
