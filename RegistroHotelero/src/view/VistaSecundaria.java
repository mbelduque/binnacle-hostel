package view;

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

import model.Huesped;
import java.awt.Color;
import javax.swing.border.LineBorder;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				VistaSecundaria.class.getResource("/ImagesIcons/walkers-iloveimg-resized-iloveimg-resized.png")));
		initComponents();

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
		lblHabitacion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombApellidos = new javax.swing.JLabel();
		lblNombApellidos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio = new javax.swing.JLabel();
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblID = new javax.swing.JLabel();
		lblID.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistrar = new javax.swing.JButton();
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.setIcon(new ImageIcon(VistaSecundaria.class
				.getResource("/de/javasoft/plaf/synthetica/orangemetallic/images/homeFolderIcon.png")));
		jScrollPaneTablaDatos = new javax.swing.JScrollPane();
		tablaHuesped = new javax.swing.JTable();
		tablaHuesped.setFont(new Font("Tahoma", Font.BOLD, 14));
		jPanelTextFields = new javax.swing.JPanel();
		txtHabitacion = new javax.swing.JTextField();
		txtNombreApellidos = new javax.swing.JTextField();
		txtPrecio = new javax.swing.JTextField();
		txtId = new javax.swing.JTextField();
		btnEliminar = new javax.swing.JToggleButton();
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setIcon(new ImageIcon(VistaSecundaria.class
				.getResource("/de/javasoft/plaf/synthetica/orangemetallic/images/closeIcon_hover.png")));
		btnBuscar = new javax.swing.JButton();
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBuscar.setIcon(new ImageIcon(VistaSecundaria.class.getResource("/ImagesIcons/search.png")));
		txtBuscar = new javax.swing.JTextField();
		btnOrdenar = new javax.swing.JButton();
		btnOrdenar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOrdenar.setIcon(new ImageIcon(VistaSecundaria.class
				.getResource("/de/javasoft/plaf/synthetica/orangemetallic/images/checkBox_selected.png")));
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
								.addComponent(lblHabitacion, Alignment.TRAILING).addComponent(lblID, Alignment.TRAILING)
								.addComponent(lblNombApellidos, Alignment.TRAILING)
								.addComponent(lblPrecio, Alignment.TRAILING))));
		jPanelLabelsLayout.setVerticalGroup(jPanelLabelsLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelLabelsLayout.createSequentialGroup().addGap(28).addComponent(lblHabitacion).addGap(30)
						.addComponent(lblNombApellidos).addGap(30).addComponent(lblID).addGap(26)
						.addComponent(lblPrecio).addContainerGap(90, Short.MAX_VALUE)));
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
		jPanelTextFieldsLayout.setHorizontalGroup(jPanelTextFieldsLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanelTextFieldsLayout.createSequentialGroup()
						.addGroup(jPanelTextFieldsLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNombreApellidos, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
								.addComponent(txtHabitacion, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtId, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
								.addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		jPanelTextFieldsLayout.setVerticalGroup(jPanelTextFieldsLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanelTextFieldsLayout.createSequentialGroup().addGap(20)
						.addComponent(txtHabitacion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(txtNombreApellidos, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtId, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(76, Short.MAX_VALUE)));
		jPanelTextFields.setLayout(jPanelTextFieldsLayout);

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

		placeHolderBuscar = new TextPrompt("Numero de habitacion", txtBuscar);
		placeHolderBuscar.changeStyle(Font.ITALIC);
		placeHolderBuscar.changeAlpha(0.75f);
		placeHolderBuscar.setHorizontalAlignment(SwingConstants.CENTER);

		btnOrdenar.setText("Ordenar lista");
		btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnOrdenarActionPerformed(evt);
			}
		});

		lblImagenApp.setIcon(new ImageIcon(
				VistaSecundaria.class.getResource("/ImagesIcons/walkers-iloveimg-resized-iloveimg-resized.png")));

		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(new Color(255, 102, 51), 1, true));
		separator.setBackground(Color.ORANGE);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addGap(22)
						.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnOrdenar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 646, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(62).addComponent(lblImagenApp).addGap(18)
								.addComponent(jPanelLabels, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jPanelTextFields,
										GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPaneTablaDatos,
								GroupLayout.DEFAULT_SIZE, 1522, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 1542, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(41)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(jPanelTextFields, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
												268, GroupLayout.PREFERRED_SIZE)
										.addComponent(jPanelLabels, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGap(125).addComponent(lblImagenApp,
								GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
						.addGap(138)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE, false).addComponent(btnRegistrar)
								.addComponent(btnEliminar).addComponent(btnOrdenar).addComponent(btnBuscar)
								.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jScrollPaneTablaDatos, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
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
					JOptionPane.showMessageDialog(rootPane, "la habitacion ahora esta desocupada",
							"Eliminacion huesped", 1);
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

		JOptionPane.showMessageDialog(rootPane, matris, "Listado de huespedes",
				JOptionPane.PLAIN_MESSAGE);
	}

	// ********************************************************************************************************************************************************

	public void buscarHuesped() {
		if (txtBuscar.getText().isEmpty()) {
			JOptionPane.showMessageDialog(rootPane, "Debe ingresar un numero de habitacion para buscar", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		} else {
			listaBusqueda = lista;
			String dato = txtBuscar.getText();
			for (int i = 0; i < listaBusqueda.size(); i++) {
				if (dato.equals(listaBusqueda.get(i).getHabitacion())) {
					JOptionPane.showMessageDialog(rootPane,
							"\nHabitacion : " + lista.get(i).getHabitacion() + "\n\nNombre y apellidos : "
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
				new String[] { "Habitacion", "Nombre y apellidos", "ID", "Precio" }));
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