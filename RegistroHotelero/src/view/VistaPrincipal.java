package view;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import org.jdesktop.beansbinding.AutoBinding;

public class VistaPrincipal extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public VistaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				VistaPrincipal.class.getResource("/ImagesIcons/walkers-iloveimg-resized-iloveimg-resized.png")));
		initComponents();
	}

	private void initComponents() {
		bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

		jLabelImagen = new javax.swing.JLabel();
		jLabelBienvenido = new javax.swing.JLabel();
		jSeparator = new javax.swing.JSeparator();
		jSeparator.setBorder(new LineBorder(new Color(255, 102, 51), 1, true));
		btnIniciar = new javax.swing.JButton();

		setResizable(false);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("BINNACLE HOSTEL");
		setName("framePpal");

		@SuppressWarnings({})
		AutoBinding<VistaPrincipal, Object, VistaPrincipal, Object> binding = org.jdesktop.beansbinding.Bindings
		.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this,
				org.jdesktop.beansbinding.ELProperty.create("${iconImage}"), this,
				org.jdesktop.beansbinding.BeanProperty.create("iconImage"));
		bindingGroup.addBinding(binding);

		jLabelImagen.setIcon(new ImageIcon(
				VistaPrincipal.class.getResource("/ImagesIcons/walkers-iloveimg-resized-iloveimg-resized.png")));

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
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addGap(44)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jSeparator, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
						.addComponent(btnIniciar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
						.addComponent(jLabelBienvenido, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 250,
								Short.MAX_VALUE)
						.addComponent(jLabelImagen, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(50)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap(24, Short.MAX_VALUE).addComponent(jLabelImagen)
						.addGap(18).addComponent(jSeparator, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(jLabelBienvenido).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnIniciar).addGap(19)));
		getContentPane().setLayout(layout);

		jLabelImagen.getAccessibleContext().setAccessibleName("labelImagenApp");

		bindingGroup.bind();

		pack();
	}

	private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {
		VistaSecundaria vistaSecundaria = new VistaSecundaria();
		vistaSecundaria.setExtendedState(JFrame.MAXIMIZED_BOTH);
		vistaSecundaria.setVisible(true);
	}

	public static void main(String args[]) {
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