package interfazGrafica;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import classes.Huesped;

public class VistaSecundaria extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	// Variables para borrar
	String habitacion = "";
	String nombreApellidos = "";
	String iD = "";
	String precio = "";

	// Declaracion Estructuras de datos
	ArrayList<Huesped> lista = new ArrayList<>();
	ArrayList<Huesped> listaBusqueda = new ArrayList<>();

	public VistaSecundaria() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(VistaSecundaria.class.getResource("/ImagesIcons/IconoApp.png")));
		initComponents();

		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);

		tablaHuesped.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			DefaultTableModel model = new DefaultTableModel();

			@Override
			public void mouseClicked(MouseEvent e) {
				int i = tablaHuesped.getSelectedRow();
				habitacion = (tablaHuesped.getValueAt(i, 0).toString());
				nombreApellidos = (tablaHuesped.getValueAt(i, 1).toString());
				iD = (tablaHuesped.getValueAt(i, 2).toString());
				precio = (tablaHuesped.getValueAt(i, 3).toString());
			}
		});
	}

	private void initComponents() {

		jPanelLabels = new javax.swing.JPanel();
		lblHabitacion = new javax.swing.JLabel();
		lblNombApellidos = new javax.swing.JLabel();
		lblPrecio = new javax.swing.JLabel();
		lblID = new javax.swing.JLabel();
		btnRegistrar = new javax.swing.JButton();
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setIcon(new ImageIcon(
				VistaSecundaria.class.getResource("/com/sun/javafx/scene/web/skin/IncreaseIndent_16x16_JFX.png")));
		jScrollPaneTablaDatos = new javax.swing.JScrollPane();
		tablaHuesped = new javax.swing.JTable();
		tablaHuesped.setFont(new Font("Tahoma", Font.BOLD, 14));
		jPanelTextFields = new javax.swing.JPanel();
		txtHabitacion = new javax.swing.JTextField();
		txtNombreApellidos = new javax.swing.JTextField();
		txtPrecio = new javax.swing.JTextField();
		txtId = new javax.swing.JTextField();
		btnEliminar = new javax.swing.JToggleButton();
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEliminar.setIcon(new ImageIcon(
				VistaSecundaria.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		btnBuscar = new javax.swing.JButton();
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBuscar.setIcon(
				new ImageIcon(VistaSecundaria.class.getResource("/javax/swing/plaf/metal/icons/ocean/expanded.gif")));
		txtBuscar = new javax.swing.JTextField();
		btnOrdenar = new javax.swing.JButton();
		btnOrdenar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOrdenar.setIcon(new ImageIcon(
				VistaSecundaria.class.getResource("/com/sun/javafx/scene/web/skin/AlignLeft_16x16_JFX.png")));
		lblImagenApp = new javax.swing.JLabel();

		setTitle("Registro Hotelero");
		setResizable(false);

		lblHabitacion.setText("Habitacion");

		lblNombApellidos.setText("Nombre y apellidos");

		lblPrecio.setText("Precio");

		lblID.setText("ID");

		javax.swing.GroupLayout jPanelLabelsLayout = new javax.swing.GroupLayout(jPanelLabels);
		jPanelLabelsLayout.setHorizontalGroup(jPanelLabelsLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelLabelsLayout.createSequentialGroup().addContainerGap(20, Short.MAX_VALUE)
						.addGroup(jPanelLabelsLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblID, Alignment.TRAILING).addComponent(lblPrecio, Alignment.TRAILING)
								.addComponent(lblNombApellidos, Alignment.TRAILING)
								.addComponent(lblHabitacion, Alignment.TRAILING))));
		jPanelLabelsLayout.setVerticalGroup(jPanelLabelsLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelLabelsLayout.createSequentialGroup().addGap(28).addComponent(lblHabitacion).addGap(43)
						.addComponent(lblNombApellidos).addGap(47).addComponent(lblID)
						.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE).addComponent(lblPrecio)
						.addGap(29)));
		jPanelLabels.setLayout(jPanelLabelsLayout);

		btnRegistrar.setText("Registrar huesped");
		btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnRegistrarActionPerformed(evt);
			}
		});

		tablaHuesped.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Habitacion", "Nombre y apellidos", "ID", "Precio" }));
		tablaHuesped.setRowHeight(30);
		jScrollPaneTablaDatos.setViewportView(tablaHuesped);

		javax.swing.GroupLayout jPanelTextFieldsLayout = new javax.swing.GroupLayout(jPanelTextFields);
		jPanelTextFields.setLayout(jPanelTextFieldsLayout);
		jPanelTextFieldsLayout.setHorizontalGroup(jPanelTextFieldsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtId)
				.addComponent(txtNombreApellidos)
				.addGroup(jPanelTextFieldsLayout.createSequentialGroup()
						.addGroup(jPanelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(0, 198, Short.MAX_VALUE)));
		jPanelTextFieldsLayout
				.setVerticalGroup(jPanelTextFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelTextFieldsLayout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtNombreApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(27, 27, 27).addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(16, 16, 16)));

		btnEliminar.setText("Eliminar huesped");
		btnEliminar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEliminarActionPerformed(evt);
			}
		});

		btnBuscar.setText("Buscar huesped");
		btnBuscar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBuscarActionPerformed(evt);
			}
		});

		placeHolderHabitacion = new TextPrompt("*", txtHabitacion);
		placeHolderHabitacion.changeStyle(Font.ITALIC);
		placeHolderHabitacion.changeAlpha(0.75f);
		placeHolderHabitacion.setHorizontalAlignment(SwingConstants.RIGHT);

		placeHolderNombreApellidos = new TextPrompt("*", txtNombreApellidos);
		placeHolderNombreApellidos.changeStyle(Font.ITALIC);
		placeHolderNombreApellidos.changeAlpha(0.75f);
		placeHolderNombreApellidos.setHorizontalAlignment(SwingConstants.RIGHT);

		placeHolderId = new TextPrompt("*", txtId);
		placeHolderId.changeStyle(Font.ITALIC);
		placeHolderId.changeAlpha(0.75f);
		placeHolderId.setHorizontalAlignment(SwingConstants.RIGHT);

		placeHolderPrecio = new TextPrompt("$", txtPrecio);
		placeHolderPrecio.changeStyle(Font.ITALIC);
		placeHolderPrecio.changeAlpha(0.75f);
		placeHolderPrecio.setHorizontalAlignment(SwingConstants.LEFT);

		placeHolderBuscar = new TextPrompt("Número de habitación", txtBuscar);
		placeHolderBuscar.changeStyle(Font.ITALIC);
		placeHolderBuscar.changeAlpha(0.75f);
		placeHolderBuscar.setHorizontalAlignment(SwingConstants.CENTER);

		btnOrdenar.setText("Ordenar lista");
		btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnOrdenarActionPerformed(evt);
			}
		});

		lblImagenApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesIcons/IconoApp.png")));

		JSeparator separator = new JSeparator();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnRegistrar).addGap(18).addComponent(btnEliminar).addGap(18)
										.addComponent(btnOrdenar).addGap(18).addComponent(btnBuscar).addGap(18)
										.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 236,
												GroupLayout.PREFERRED_SIZE)
										.addGap(542))
								.addGroup(
										layout.createSequentialGroup().addGap(62).addComponent(lblImagenApp).addGap(18)
												.addComponent(jPanelLabels, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(jPanelTextFields, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(0, 692, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(separator,
										GroupLayout.DEFAULT_SIZE, 1424, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(
										jScrollPaneTablaDatos, GroupLayout.DEFAULT_SIZE, 1424, Short.MAX_VALUE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(41)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(jPanelTextFields, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup().addComponent(lblImagenApp).addGap(47))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanelLabels, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addGap(18).addComponent(separator, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
						.addGap(37)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(btnRegistrar)
								.addComponent(btnEliminar).addComponent(btnOrdenar).addComponent(btnBuscar)
								.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jScrollPaneTablaDatos, GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
						.addGap(18)));
		getContentPane().setLayout(layout);

		pack();
	}

	private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
		registrarHuesped();
	}

	private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
		eliminarHuesped();
	}

	private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {
		ordenarLista();
	}

	private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
		buscarHuesped();
	}

	// Metodos para cada uno de los 4 botones
	// ********************************************************************************************************************************************************

	public void registrarHuesped() {
		if (txtHabitacion.getText().isEmpty() && txtNombreApellidos.getText().isEmpty() && txtId.getText().isEmpty()
				&& txtPrecio.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane,
					"Debe llenar los campos marcados con (*) para registrar un nuevo huesped!", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		} else {
			Huesped huesped = new Huesped(txtHabitacion.getText(), txtNombreApellidos.getText(), txtId.getText(),
					txtPrecio.getText());
			lista.add(huesped);
			JOptionPane.showMessageDialog(rootPane, "Huesped registrado con exito!", "Registro huespedes",
					JOptionPane.INFORMATION_MESSAGE);
			actualizarTabla();
		}

		txtHabitacion.setText("");
		txtNombreApellidos.setText("");
		txtId.setText("");
		txtPrecio.setText("");
	}

	// ********************************************************************************************************************************************************

	public void eliminarHuesped() {
		if (lista.isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "Debe ingresar minimo un huesped para eliminar!", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		} else {
			for (int i = 0; i < lista.size(); i++) {
				if (habitacion.equals(lista.get(i).getHabitacion())) {
					lista.remove(i);
					JOptionPane.showMessageDialog(rootPane, "La habitación ahora esta desocupada!",
							"Eliminación huesped", 1);
				}
			}
			actualizarTabla();
		}
	}

	// ********************************************************************************************************************************************************

	public void ordenarLista() {
		if (lista.isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "Debe ingresar minimo dos huespedes para ordenar!", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		} else
			Collections.sort(lista);

		String matris[][] = new String[lista.size()][4];
		for (int i = 0; i < lista.size(); i++) {
			matris[i][1] = lista.get(i).getNombreYapellidos();
		}

		JOptionPane.showMessageDialog(rootPane, matris, "Listado de huespedes por orden alfabetico",
				JOptionPane.PLAIN_MESSAGE);
	}

	// ********************************************************************************************************************************************************

	public void buscarHuesped() {
		if (txtBuscar.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "Debe ingresar un número de habitación para buscar", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		} else {
			listaBusqueda = lista;
			String dato = txtBuscar.getText();
			for (int i = 0; i < listaBusqueda.size(); i++) {
				if (dato.equals(listaBusqueda.get(i).getHabitacion())) {
					JOptionPane.showMessageDialog(rootPane,
							"\nHabitación : " + lista.get(i).getHabitacion() + "\n\nNombre y apellidos : "
									+ lista.get(i).getNombreYapellidos() + "\n\nID : " + lista.get(i).getId()
									+ "\n\nPrecio : " + lista.get(i).getPrecio() + "\n\n",
							"Resultado de busqueda", 1);
				}
			}
		}

		txtBuscar.setText("");
	}

	// ********************************************************************************************************************************************************

	public void actualizarTabla() {
		String matris[][] = new String[lista.size()][4];

		for (int i = 0; i < lista.size(); i++) {
			matris[i][0] = lista.get(i).getHabitacion();
			matris[i][1] = lista.get(i).getNombreYapellidos();
			matris[i][2] = lista.get(i).getId();
			matris[i][3] = lista.get(i).getPrecio();
		}

		tablaHuesped.setModel(new javax.swing.table.DefaultTableModel(matris,
				new String[] { "Habitación", "Nombre y apellidos", "ID", "Precio" }));
	}

	// ********************************************************************************************************************************************************

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(() -> {
			new VistaSecundaria().setVisible(true);
		});
	}

	// Declaracion de variables
	private TextPrompt placeHolderBuscar, placeHolderHabitacion, placeHolderNombreApellidos, placeHolderId,
			placeHolderPrecio;
	private javax.swing.JButton btnBuscar;
	private javax.swing.JToggleButton btnEliminar;
	private javax.swing.JButton btnOrdenar;
	private javax.swing.JButton btnRegistrar;
	private javax.swing.JPanel jPanelLabels;
	private javax.swing.JPanel jPanelTextFields;
	private javax.swing.JScrollPane jScrollPaneTablaDatos;
	private javax.swing.JLabel lblHabitacion;
	private javax.swing.JLabel lblID;
	private javax.swing.JLabel lblImagenApp;
	private javax.swing.JLabel lblNombApellidos;
	private javax.swing.JLabel lblPrecio;
	private javax.swing.JTable tablaHuesped;
	private javax.swing.JTextField txtBuscar;
	private javax.swing.JTextField txtHabitacion;
	private javax.swing.JTextField txtId;
	private javax.swing.JTextField txtNombreApellidos;
	private javax.swing.JTextField txtPrecio;
}