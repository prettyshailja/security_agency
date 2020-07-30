

package sbs_security;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class HomePage extends javax.swing.JFrame {
     GridBagLayout layout = new GridBagLayout();
     EmployeRegistration emp=new EmployeRegistration();
     EditEmployee edit=new EditEmployee();
     EmployeeList emplist=new EmployeeList();
     AddCategory addcategory=new AddCategory();
     ClientRegistration clientregister=new ClientRegistration();
     ClientList clientlist=new ClientList();
     EditCategory editcategory=new EditCategory();
     CategoryList categorylist=new CategoryList();
    public HomePage() {
        initComponents();
        emp=new EmployeRegistration();
        edit=new EditEmployee();
        emplist=new EmployeeList();
        addcategory=new AddCategory();
        categorylist=new CategoryList();
        clientregister=new ClientRegistration();
        clientlist=new ClientList();
        editcategory=new EditCategory();
        
        panelbody.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
    
        c.gridx = 0;
        c.gridy = 0;
        panelbody.add(emp,c);
        
        c.gridx = 0;
        c.gridy = 0;
        panelbody.add(categorylist,c);


        c.gridx = 0;
        c.gridy = 0;
        panelbody.add(edit,c);
        
        c.gridx = 0;
        c.gridy = 0;
        panelbody.add(emplist,c);

        c.gridx = 0;
        c.gridy = 0;
        panelbody.add(addcategory,c);
        c.gridx = 0;
        c.gridy = 0;
        panelbody.add(clientregister,c);
        
        c.gridx = 0;
        c.gridy = 0;
        panelbody.add(clientlist,c);
        
        c.gridx = 0;
        c.gridy = 0;
        panelbody.add(editcategory,c);
        
        emp.setVisible(false);
        edit.setVisible(false);
        emplist.setVisible(false);
        addcategory.setVisible(false);
        categorylist.setVisible(false);
        clientregister.setVisible(false);
        clientlist.setVisible(false);
        editcategory.setVisible(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }
private void execute()
{
    ImageIcon iconEmployee=new ImageIcon(getClass().getResource("/sbs_security/hired.png"));
    ImageIcon iconCategory=new ImageIcon(getClass().getResource("/sbs_security/list.png"));
    ImageIcon iconSubMenu=new ImageIcon(getClass().getResource("/sbs_security/next.png"));
    ImageIcon iconLogout=new ImageIcon(getClass().getResource("/sbs_security/logout.png"));
    ImageIcon iconBooking=new ImageIcon(getClass().getResource("/sbs_security/old-fashion-briefcase.png"));
    ImageIcon iconClient=new ImageIcon(getClass().getResource("/sbs_security/target.png"));
    ImageIcon iconSalary=new ImageIcon(getClass().getResource("/sbs_security/payday.png"));
    
    
    MenuItem menuClient1=new MenuItem(iconSubMenu,"New Client?",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
         clientregister.setVisible(true);
         emp.setVisible(false);
        edit.setVisible(false);
        emplist.setVisible(false);
        addcategory.setVisible(false);
        categorylist.setVisible(false);
        clientlist.setVisible(false);
            editcategory.setVisible(false);
             }
    });
    
    MenuItem menuClient2=new MenuItem(iconSubMenu,"List of Client",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
         clientregister.setVisible(false);
         emp.setVisible(false);
        edit.setVisible(false);
        emplist.setVisible(false);
        addcategory.setVisible(false);
           categorylist.setVisible(false);
            clientlist.setVisible(true);
            editcategory.setVisible(false);
             }
    });
    
    
    MenuItem menuCategory1=new MenuItem(iconSubMenu,"Add Category",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            clientregister.setVisible(false);
        emp.setVisible(false);
        edit.setVisible(false);
        emplist.setVisible(false);
        addcategory.setVisible(true);
            categorylist.setVisible(false);
            clientlist.setVisible(false);
            editcategory.setVisible(false);
        }
        
    });
    
        
    
    
    MenuItem menuCategory2=new MenuItem(iconSubMenu,"Edit Detail of Category",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            emp.setVisible(false);
            clientregister.setVisible(false);
        edit.setVisible(false);
        emplist.setVisible(false);
        addcategory.setVisible(false);
        clientlist.setVisible(false);
        categorylist.setVisible(false);
        editcategory.setVisible(true);
            
        }
        
    });
    
    MenuItem menuCategory3=new MenuItem(iconSubMenu,"List of Job Category",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            clientregister.setVisible(false);
        emp.setVisible(false);
        edit.setVisible(false);
        emplist.setVisible(false);
        addcategory.setVisible(false);
           categorylist.setVisible(true);
            clientlist.setVisible(false);
            editcategory.setVisible(false);
        }
        
    });
    
     
    MenuItem menuEmployee1=new MenuItem(iconSubMenu,"Register Employee",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            emp.setVisible(true);
        edit.setVisible(false);
        clientregister.setVisible(false);
        editcategory.setVisible(false);
        emplist.setVisible(false);
        clientlist.setVisible(false);
        addcategory.setVisible(false);
       categorylist.setVisible(false);
            
             }
    });
    MenuItem menuEmployee2=new MenuItem(iconSubMenu,"Employee Profile",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
         emp.setVisible(false);
        edit.setVisible(true);
        clientlist.setVisible(false);
        emplist.setVisible(false);
        addcategory.setVisible(false);
        categorylist.setVisible(false);
        editcategory.setVisible(false);
        clientregister.setVisible(false);
        }
        
    });
    MenuItem menuEmployee3=new MenuItem(iconSubMenu,"List of Employee",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
          emp.setVisible(false);
          clientlist.setVisible(false);
        edit.setVisible(false);
        emplist.setVisible(true);
        addcategory.setVisible(false);
        categorylist.setVisible(false);
        clientregister.setVisible(false);
        editcategory.setVisible(false);
        }
        
    });
    
    MenuItem menuEmployee=new MenuItem(iconEmployee,"Employee Management",null,menuEmployee1,menuEmployee2,menuEmployee3);
    MenuItem menuCategory=new MenuItem(iconCategory,"Job Category",null,menuCategory1,menuCategory2,menuCategory3);
    MenuItem menuClient=new MenuItem(iconClient,"Clients Info",null,menuClient1,menuClient2);
    MenuItem menuBooking=new MenuItem(iconBooking,"Bookings",null);
    MenuItem menuSalary=new MenuItem(iconSalary,"Salary Management",null);
    MenuItem menuLogout=new MenuItem(iconLogout,"Logout",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    });
    addMenu(menuEmployee,menuCategory,menuClient,menuBooking,menuSalary,menuLogout);
    
   }

private void addMenu(MenuItem... menu)
{
for(int i=0;i<menu.length;i++)   
{
    menus.add(menu[i]);
    ArrayList<MenuItem>subMenu=menu[i].getSubMenu();
    for(MenuItem m:subMenu){
    addMenu(m);
    
    }
}
menus.revalidate();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelheader = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelbody = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelmenu.setBackground(new java.awt.Color(0, 102, 204));
        panelmenu.setPreferredSize(new java.awt.Dimension(561, 50));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel1.setText("SBS Security");

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(785, Short.MAX_VALUE))
        );
        panelmenuLayout.setVerticalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panelmenu, java.awt.BorderLayout.PAGE_START);

        panelheader.setBackground(new java.awt.Color(102, 0, 204));
        panelheader.setPreferredSize(new java.awt.Dimension(250, 304));

        jScrollPane1.setBorder(null);

        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelheaderLayout = new javax.swing.GroupLayout(panelheader);
        panelheader.setLayout(panelheaderLayout);
        panelheaderLayout.setHorizontalGroup(
            panelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelheaderLayout.setVerticalGroup(
            panelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        getContentPane().add(panelheader, java.awt.BorderLayout.LINE_START);

        panelbody.setBackground(new java.awt.Color(153, 153, 255));
        panelbody.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sbs_security/securti.jpg"))); // NOI18N
        jLabel2.setText("Security Agency");
        panelbody.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelbody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1067, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelbody;
    private javax.swing.JPanel panelheader;
    private javax.swing.JPanel panelmenu;
    // End of variables declaration//GEN-END:variables
}
