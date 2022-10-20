package view;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.wb.swt.SWTResourceManager;

import controller.Controlador;
import modelo.Veterinaria;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ColumnPixelData;

public class VeterinariaView extends ApplicationWindow {
	
	Controlador controlador = new Controlador();
	Veterinaria veterinaria = controlador.getVeterinaria();
	
	private Text nombreCliente;
	private Text correoClienete;
	private Text contraseñaCliente;
	private Text cedulaCliente;
	private Text text_4;
	private Text text_5;
	private Table table_2;
	private Table table;
	private Table table_1;
	private Table table_3;

	public Veterinaria getVeterinaria() {
		return veterinaria;
	}

	public void setVeterinaria(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}

	/**
	 * Create the application window.
	 */
	public VeterinariaView() {
		super(null);
		createActions();
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		
		TabFolder tabFolder = new TabFolder(container, SWT.NONE);
		tabFolder.setBounds(0, 0, 1066, 905);
		
		TabItem tbtmPrincipal = new TabItem(tabFolder, SWT.NONE);
		tbtmPrincipal.setText("Principal");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(255, 255, 255));
		composite.setForeground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		tbtmPrincipal.setControl(composite);
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setBounds(0, 0, 256, 147);
		composite_1.setBackgroundImage(SWTResourceManager.getImage("imagenes/1.png"));
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setBackground(SWTResourceManager.getColor(255, 204, 153));
		composite_2.setBounds(256, 0, 802, 64);
		
		Label lblParaTuMascota = new Label(composite_2, SWT.NONE);
		lblParaTuMascota.setFont(SWTResourceManager.getFont("Forte", 18, SWT.BOLD));
		lblParaTuMascota.setBackground(SWTResourceManager.getColor(255, 204, 153));
		lblParaTuMascota.setBounds(146, 10, 442, 44);
		lblParaTuMascota.setText("Para tu mascota, todo!");
		
		Composite composite_3 = new Composite(composite, SWT.NONE);
		composite_3.setBackground(SWTResourceManager.getColor(255, 239, 213));
		composite_3.setBounds(256, 62, 802, 85);
		
		Button btnIniciarSeccion = new Button(composite_3, SWT.NONE);
		btnIniciarSeccion.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		btnIniciarSeccion.setBounds(164, 24, 162, 35);
		btnIniciarSeccion.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnIniciarSeccion.setText("Iniciar Sesion");
		
		Button btnRegistrarse = new Button(composite_3, SWT.NONE);
		btnRegistrarse.setFont(SWTResourceManager.getFont("Segoe Print", 10, SWT.BOLD));
		btnRegistrarse.setBounds(399, 24, 162, 35);
		btnRegistrarse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnRegistrarse.setText("Registrarse");
		
		Composite composite_4 = new Composite(composite, SWT.NONE);
		composite_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		composite_4.setBounds(0, 145, 1058, 722);
		
		Group grpProductos = new Group(composite_4, SWT.NONE);
		grpProductos.setFont(SWTResourceManager.getFont("Forte", 11, SWT.BOLD));
		grpProductos.setText("Productos");
		grpProductos.setBackground(SWTResourceManager.getColor(255, 204, 153));
		grpProductos.setBounds(24, 10, 486, 276);
		
		ComboViewer comboViewer = new ComboViewer(grpProductos, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.setBounds(138, 216, 195, 33);
		
		Composite composite_6 = new Composite(grpProductos, SWT.NONE);
		composite_6.setBounds(138, 40, 195, 170);
		composite_6.setBackgroundImage(SWTResourceManager.getImage("imagenes/3.jpg"));
		
		Group grpServicios = new Group(composite_4, SWT.NONE);
		grpServicios.setFont(SWTResourceManager.getFont("Forte", 11, SWT.BOLD));
		grpServicios.setText("Servicios");
		grpServicios.setBackground(SWTResourceManager.getColor(255, 204, 153));
		grpServicios.setBounds(543, 10, 486, 276);
		
		ComboViewer comboViewer_1 = new ComboViewer(grpServicios, SWT.NONE);
		Combo combo_1 = comboViewer_1.getCombo();
		combo_1.setBounds(141, 207, 195, 33);
		
		Composite composite_5 = new Composite(grpServicios, SWT.NONE);
		composite_5.setBounds(146, 31, 179, 170);
		composite_5.setBackgroundImage(SWTResourceManager.getImage("imagenes/2.jpg"));
		
		text_4 = new Text(composite_4, SWT.BORDER);
		text_4.setBounds(24, 327, 486, 31);
		
		text_5 = new Text(composite_4, SWT.BORDER);
		text_5.setBounds(543, 327, 486, 31);
		
		Group grpMediosDePago = new Group(composite_4, SWT.NONE);
		grpMediosDePago.setBackground(SWTResourceManager.getColor(255, 204, 153));
		grpMediosDePago.setFont(SWTResourceManager.getFont("Forte", 11, SWT.BOLD));
		grpMediosDePago.setText("Medios de pago");
		grpMediosDePago.setBounds(24, 620, 1011, 92);
		
		Label lblEfectivo = new Label(grpMediosDePago, SWT.NONE);
		lblEfectivo.setText("Efectivo");
		lblEfectivo.setFont(SWTResourceManager.getFont("Forte", 11, SWT.BOLD));
		lblEfectivo.setBackground(SWTResourceManager.getColor(255, 204, 153));
		lblEfectivo.setBounds(262, 42, 109, 44);
		
		Label lblTarjetasDeCredito = new Label(grpMediosDePago, SWT.NONE);
		lblTarjetasDeCredito.setText("Tarjetas de credito y debito");
		lblTarjetasDeCredito.setFont(SWTResourceManager.getFont("Forte", 11, SWT.BOLD));
		lblTarjetasDeCredito.setBackground(SWTResourceManager.getColor(255, 204, 153));
		lblTarjetasDeCredito.setBounds(495, 42, 333, 44);
		
		TableViewer tableViewer_2 = new TableViewer(composite_4, SWT.BORDER | SWT.FULL_SELECTION);
		table_2 = tableViewer_2.getTable();
		table_2.setLinesVisible(true);
		table_2.setHeaderVisible(true);
		table_2.setBounds(24, 396, 486, 192);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer_2, SWT.NONE);
		TableColumn tblclmnProductos = tableViewerColumn.getColumn();
		tblclmnProductos.setWidth(468);
		tblclmnProductos.setText("Productos");
		
		TableViewer tableViewer = new TableViewer(composite_4, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setBounds(543, 396, 486, 192);
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnServicios = tableViewerColumn_1.getColumn();
		tblclmnServicios.setWidth(475);
		tblclmnServicios.setText("Servicios");
		
		TabItem tbtmRegistroCliente = new TabItem(tabFolder, SWT.NONE);
		tbtmRegistroCliente.setText("Registro Cliente");
		
		Composite composite_cliente = new Composite(tabFolder, SWT.NONE);
		composite_cliente.setBackground(SWTResourceManager.getColor(255, 204, 153));
		tbtmRegistroCliente.setControl(composite_cliente);
		
		Group groupCliente = new Group(composite_cliente, SWT.NONE);
		groupCliente.setBackground(SWTResourceManager.getColor(255, 248, 220));
		groupCliente.setBounds(106, 95, 837, 736);
		
		Composite composite_8 = new Composite(groupCliente, SWT.NONE);
		composite_8.setBounds(303, 551, 256, 147);
		composite_8.setBackgroundImage(SWTResourceManager.getImage("imagenes/1.png"));
		
		Button btnRegistrarse_cliente = new Button(groupCliente, SWT.NONE);
		btnRegistrarse_cliente.setBounds(167, 481, 506, 35);
		btnRegistrarse_cliente.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			//	controlador.crearCliente(text, cedula, correo, password, listaCompras, listaServicios, listaMascotas)
				
			}
		});
		btnRegistrarse_cliente.setText("Registrarse");
		btnRegistrarse_cliente.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		
		contraseñaCliente = new Text(groupCliente, SWT.BORDER);
		contraseñaCliente.setBounds(276, 339, 397, 31);
		
		cedulaCliente = new Text(groupCliente, SWT.BORDER);
		cedulaCliente.setBounds(276, 198, 397, 31);
		
		nombreCliente = new Text(groupCliente, SWT.BORDER);
		nombreCliente.setBounds(276, 128, 397, 31);
		
		correoClienete = new Text(groupCliente, SWT.BORDER);
		correoClienete.setBounds(276, 266, 397, 31);
		
		Label lblNombre = new Label(groupCliente, SWT.NONE);
		lblNombre.setBounds(167, 131, 81, 25);
		lblNombre.setBackground(SWTResourceManager.getColor(255, 248, 220));
		lblNombre.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblNombre.setText("Nombre:");
		
		Label lblCedula = new Label(groupCliente, SWT.NONE);
		lblCedula.setBounds(167, 201, 81, 25);
		lblCedula.setBackground(SWTResourceManager.getColor(255, 248, 220));
		lblCedula.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblCedula.setText("Cedula:");
		
		Label lblCorreo = new Label(groupCliente, SWT.NONE);
		lblCorreo.setBounds(167, 269, 81, 25);
		lblCorreo.setBackground(SWTResourceManager.getColor(255, 248, 220));
		lblCorreo.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblCorreo.setText("Correo:");
		
		Label lblContrasea = new Label(groupCliente, SWT.NONE);
		lblContrasea.setBounds(167, 342, 98, 25);
		lblContrasea.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblContrasea.setBackground(SWTResourceManager.getColor(255, 248, 220));
		lblContrasea.setText("Contrase\u00F1a:");
		
		Label lblRegistroCliente = new Label(groupCliente, SWT.NONE);
		lblRegistroCliente.setBounds(283, 29, 442, 44);
		lblRegistroCliente.setText("Registro Cliente");
		lblRegistroCliente.setFont(SWTResourceManager.getFont("Forte", 18, SWT.BOLD));
		lblRegistroCliente.setBackground(SWTResourceManager.getColor(255, 248, 220));
		
		TabItem tbtmHistorial = new TabItem(tabFolder, SWT.NONE);
		tbtmHistorial.setText("Historial");
		
		Composite composite_9 = new Composite(tabFolder, SWT.NONE);
		composite_9.setBackground(SWTResourceManager.getColor(255, 204, 153));
		composite_9.setToolTipText("Historial");
		tbtmHistorial.setControl(composite_9);
		
		Label lblHistorialDeCompras = new Label(composite_9, SWT.NONE);
		lblHistorialDeCompras.setText("Historial de compras y servicios usados");
		lblHistorialDeCompras.setFont(SWTResourceManager.getFont("Forte", 18, SWT.BOLD));
		lblHistorialDeCompras.setBackground(SWTResourceManager.getColor(255, 204, 153));
		lblHistorialDeCompras.setBounds(178, 31, 676, 44);
		
		Group group_1 = new Group(composite_9, SWT.NONE);
		group_1.setBackground(SWTResourceManager.getColor(255, 248, 220));
		group_1.setBounds(42, 81, 974, 736);
		
		Composite composite_10 = new Composite(group_1, SWT.NONE);
		composite_10.setBackgroundImage(SWTResourceManager.getImage("imagenes/1.png"));
		composite_10.setBounds(362, 562, 256, 147);
		
		TableViewer tableViewer_1 = new TableViewer(group_1, SWT.BORDER | SWT.FULL_SELECTION);
		table_1 = tableViewer_1.getTable();
		table_1.setLinesVisible(true);
		table_1.setHeaderVisible(true);
		table_1.setBounds(54, 41, 410, 497);
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tblclmnProductosUsados = tableViewerColumn_2.getColumn();
		tblclmnProductosUsados.setWidth(392);
		tblclmnProductosUsados.setText("productos usados ");
		
		TableViewer tableViewer_3 = new TableViewer(group_1, SWT.BORDER | SWT.FULL_SELECTION);
		table_3 = tableViewer_3.getTable();
		table_3.setLinesVisible(true);
		table_3.setHeaderVisible(true);
		table_3.setBounds(504, 41, 410, 497);
		
		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer_3, SWT.NONE);
		TableColumn tblclmnServiciosUsados = tableViewerColumn_3.getColumn();
		tblclmnServiciosUsados.setWidth(392);
		tblclmnServiciosUsados.setText("Servicios Usados");

		return container;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Create the status line manager.
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			VeterinariaView window = new VeterinariaView();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("New Application");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(1113, 1175);
	}
}
