package co.edu.icesi.demo.vista;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.icesi.demo.businessdelegate.IBusinessDelegate;
import co.edu.icesi.demo.modelo.Clientes;
import co.edu.icesi.demo.modelo.TiposDocumentos;

@ManagedBean
@ViewScoped
public class GestionarClienteView {

	private final static Logger log = LoggerFactory.getLogger(GestionarClienteView.class); 
	
	@ManagedProperty(value = "#{businessDelegate}")
	private IBusinessDelegate businessDelegate;
	
	private InputText txtIdentificacion;
	private InputText txtNombre;
	private InputText txtDireccion;
	private InputText txtTelefono;
	private InputText txtMail;
	private SelectOneMenu somTipoDocumento;

	private CommandButton btnCrear;
	private CommandButton btnModificar;
	private CommandButton btnBorrar;
	private CommandButton btnLimpiar;
	
	private List<SelectItem> lstTiposDocumentosItem;
	
	private List<Clientes> lstClientes;
	
	public String action_crear() {
		
		log.info("Action Crear");
		try {
			
			Clientes cliente = new Clientes();
			cliente.setCliDireccion(txtDireccion.getValue().toString());
			cliente.setCliMail(txtMail.getValue().toString());
			cliente.setCliNombre(txtNombre.getValue().toString());
			cliente.setCliTelefono(txtTelefono.getValue().toString());
			
			Long identificacion = Long.parseLong(txtIdentificacion.getValue().toString());
			cliente.setCliId(identificacion);
			
			Long idTipoDocu = Long.parseLong(somTipoDocumento.getValue().toString());
			TiposDocumentos tiposDocumentos = businessDelegate.findByIdTipoDocumento(idTipoDocu);
			
			cliente.setTiposDocumentos(tiposDocumentos);
			
			businessDelegate.saveCliente(cliente);
			
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente creado Satisfactoriamente",""));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
		}
				
		action_limpiar();

		lstClientes = null;
		return "";
	}
	
	public String action_modificar() {
		log.info("Action Modificar");

		try {
			
			Clientes cliente = new Clientes();
			cliente.setCliDireccion(txtDireccion.getValue().toString());
			cliente.setCliMail(txtMail.getValue().toString());
			cliente.setCliNombre(txtNombre.getValue().toString());
			cliente.setCliTelefono(txtTelefono.getValue().toString());
			
			Long identificacion = Long.parseLong(txtIdentificacion.getValue().toString());
			cliente.setCliId(identificacion);
			
			Long idTipoDocu = Long.parseLong(somTipoDocumento.getValue().toString());
			TiposDocumentos tiposDocumentos = businessDelegate.findByIdTipoDocumento(idTipoDocu);
			
			cliente.setTiposDocumentos(tiposDocumentos);
			
			businessDelegate.updateCliente(cliente);
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente Modificado Satisfactoriamente",""));

			action_limpiar();
			lstClientes = null;
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
		}
		
		return "";
	}
	
	public String action_borrar() {
		log.info("Action Borrar");
		
		try {
			
			Clientes cliente = new Clientes();
			
			Long identificacion = Long.parseLong(txtIdentificacion.getValue().toString());
			cliente.setCliId(identificacion);
			
			cliente = businessDelegate.findByIdCliente(identificacion);
			
			businessDelegate.deleteCliente(cliente);
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente eliminado satisfactoriamente",""));

			action_limpiar();
			
			lstClientes = null;
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
		}
		return "";
	}
	
	public String action_limpiar() {
		
		txtDireccion.resetValue();
		txtNombre.resetValue();
		txtIdentificacion.resetValue();
		txtTelefono.resetValue();
		txtMail.resetValue();
		somTipoDocumento.resetValue();

		lstClientes = null;
		return "";
	}
	
	public void txtIdentificacionListener() {
		log.info("ajax");
		
		try {
				
			if(txtIdentificacion == null || txtIdentificacion.getValue() == null) {
				throw new Exception("Debe ingresar un número de identificación");
			}
			
			Long identificacion = Long.parseLong(txtIdentificacion.getValue().toString());
			
			Clientes cliente = businessDelegate.findByIdCliente(identificacion);
			
			if(cliente == null) {
				btnCrear.setDisabled(false);
				btnBorrar.setDisabled(true);
				btnModificar.setDisabled(true);
				
				txtNombre.resetValue();
				txtTelefono.resetValue();
				txtDireccion.resetValue();
				txtMail.resetValue();
				
				somTipoDocumento.resetValue();
				
			}else {
				btnCrear.setDisabled(true);
				btnBorrar.setDisabled(false);
				btnModificar.setDisabled(false);
				
				txtNombre.setValue(cliente.getCliNombre());
				txtTelefono.setValue(cliente.getCliTelefono());
				txtDireccion.setValue(cliente.getCliDireccion());
				txtMail.setValue(cliente.getCliMail());
				
				somTipoDocumento.setValue(cliente.getTiposDocumentos().getTdocCodigo());
			}
			
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
		}
	}
	
	
	
	
	public List<SelectItem> getLstTiposDocumentosItem() {
		
		if(lstTiposDocumentosItem == null) {
			lstTiposDocumentosItem = new ArrayList<SelectItem>();
			List<TiposDocumentos> lstTiposDocumentos = businessDelegate.findAllTipoDocumento();
			
			for(TiposDocumentos tiposDocumentos:lstTiposDocumentos) {
				lstTiposDocumentosItem.add(new SelectItem(tiposDocumentos.getTdocCodigo(), tiposDocumentos.getTdocNombre()));
			}
			
		}
		
		return lstTiposDocumentosItem;
	}

	public void setLstTiposDocumentosItem(List<SelectItem> lstTiposDocumentosItem) {
		this.lstTiposDocumentosItem = lstTiposDocumentosItem;
	}

	public IBusinessDelegate getBusinessDelegate() {
		return businessDelegate;
	}

	public void setBusinessDelegate(IBusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	public InputText getTxtIdentificacion() {
		return txtIdentificacion;
	}
	public void setTxtIdentificacion(InputText txtIdentificacion) {
		this.txtIdentificacion = txtIdentificacion;
	}
	public InputText getTxtNombre() {
		return txtNombre;
	}
	public void setTxtNombre(InputText txtNombre) {
		this.txtNombre = txtNombre;
	}
	public InputText getTxtDireccion() {
		return txtDireccion;
	}
	public void setTxtDireccion(InputText txtDireccion) {
		this.txtDireccion = txtDireccion;
	}
	public InputText getTxtTelefono() {
		return txtTelefono;
	}
	public void setTxtTelefono(InputText txtTelefono) {
		this.txtTelefono = txtTelefono;
	}
	public InputText getTxtMail() {
		return txtMail;
	}
	public void setTxtMail(InputText txtMail) {
		this.txtMail = txtMail;
	}
	public SelectOneMenu getSomTipoDocumento() {
		return somTipoDocumento;
	}
	public void setSomTipoDocumento(SelectOneMenu somTipoDocumento) {
		this.somTipoDocumento = somTipoDocumento;
	}
	public CommandButton getBtnCrear() {
		return btnCrear;
	}
	public void setBtnCrear(CommandButton btnCrear) {
		this.btnCrear = btnCrear;
	}
	public CommandButton getBtnModificar() {
		return btnModificar;
	}
	public void setBtnModificar(CommandButton btnModificar) {
		this.btnModificar = btnModificar;
	}
	public CommandButton getBtnBorrar() {
		return btnBorrar;
	}
	public void setBtnBorrar(CommandButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}
	public CommandButton getBtnLimpiar() {
		return btnLimpiar;
	}
	public void setBtnLimpiar(CommandButton btnLimpiar) {
		this.btnLimpiar = btnLimpiar;
	}

	public List<Clientes> getLstClientes() {
		
		try {
			
			if(lstClientes == null) {
				lstClientes = businessDelegate.findAllClientes();
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lstClientes;
	}

	public void setLstClientes(List<Clientes> lstClientes) {
		this.lstClientes = lstClientes;
	}
	
	
	
}
