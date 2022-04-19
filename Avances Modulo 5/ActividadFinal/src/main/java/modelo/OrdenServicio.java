package modelo;

public class OrdenServicio {
	private int id;
	private String rut;
	private String nCliente;
	private String tCliente;
	private Electrodomestico tipoElec;
	private Region region;
	private String comuna;
	private String dCliente;
	private String fecha;
	private String fechaAct;
	private Estado estado;
	private String obs;
	
	public OrdenServicio(int id, String rut, String nCliente, String tCliente, Electrodomestico tipoElec, Region region,
			String comuna, String dCliente, String fecha, String fechaAct, Estado estado, String obs) {
		
		this.id = id;
		this.rut = rut;
		this.nCliente = nCliente;
		this.tCliente = tCliente;
		this.tipoElec = tipoElec;
		this.region = region;
		this.comuna = comuna;
		this.dCliente = dCliente;
		this.fecha = fecha;
		this.fechaAct = fechaAct;
		this.estado = estado;
		this.obs = obs;
	}
		
	public OrdenServicio(String rut, String nCliente, String tCliente, Electrodomestico tipoElec, Region region,
			String comuna, String dCliente, String fecha, String obs) {

		this.rut = rut;
		this.nCliente = nCliente;
		this.tCliente = tCliente;
		this.tipoElec = tipoElec;
		this.region = region;
		this.comuna = comuna;
		this.dCliente = dCliente;
		this.fecha = fecha;
		this.fechaAct = fecha;
		this.estado = new Estado (1, "Pendiente");
		this.obs = obs;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getnCliente() {
		return nCliente;
	}
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	public String gettCliente() {
		return tCliente;
	}
	public void settCliente(String tCliente) {
		this.tCliente = tCliente;
	}
	public Electrodomestico getTipoElec() {
		return tipoElec;
	}
	public void setTipoElec(Electrodomestico tipoElec) {
		this.tipoElec = tipoElec;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public String getdCliente() {
		return dCliente;
	}
	public void setdCliente(String dCliente) {
		this.dCliente = dCliente;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getFechaAct() {
		return fechaAct;
	}
	public void setFechaAct(String fechaAct) {
		this.fechaAct = fechaAct;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
}
