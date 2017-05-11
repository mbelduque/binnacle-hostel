package interfazGrafica;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class VistaPrincipal extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public VistaPrincipal() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(VistaPrincipal.class.getResource("/ImagesIcons/IconoApp.png")));
		initComponents();
	}

	private void initComponents() {
		bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

		jLabelImagen = new javax.swing.JLabel();
		jLabelBienvenido = new javax.swing.JLabel();
		jSeparator = new javax.swing.JSeparator();
		btnIniciar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Registro Hotelero");
		setName("framePpal");
		setResizable(false);

		@SuppressWarnings("rawtypes")
		org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(
				org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this,
				org.jdesktop.beansbinding.ELProperty.create("${iconImage}"), this,
				org.jdesktop.beansbinding.BeanProperty.create("iconImage"));
		bindingGroup.addBinding(binding);

		jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/IconoApp.png")));

		jLabelBienvenido.setFont(new java.awt.Font("Arial", 1, 18));
		jLabelBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelBienvenido.setText("Bienvenido");

		btnIniciar.setText("Iniciar ");
		btnIniciar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnIniciarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(32, 32, 32)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelImagen)
						.addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGap(67, 67, 67).addComponent(btnIniciar,
								javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(34, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(24, Short.MAX_VALUE).addComponent(jLabelImagen)
						.addGap(18, 18, 18)
						.addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabelBienvenido)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnIniciar)
						.addGap(19, 19, 19)));

		jLabelImagen.getAccessibleContext().setAccessibleName("labelImagenApp");

		bindingGroup.bind();

		pack();
	}

	private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {
		VistaSecundaria vistaSecundaria = new VistaSecundaria();
		vistaSecundaria.setExtendedState(JFrame.MAXIMIZED_BOTH);
		vistaSecundaria.setLocationRelativeTo(null);
		vistaSecundaria.setVisible(true);
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(() -> {
			new VistaPrincipal().setVisible(true);
		});
	}

	private javax.swing.JButton btnIniciar;
	private javax.swing.JLabel jLabelImagen;
	private javax.swing.JLabel jLabelBienvenido;
	private javax.swing.JSeparator jSeparator;
	private org.jdesktop.beansbinding.BindingGroup bindingGroup;
}