package principal;

import java.util.GregorianCalendar;

import metodos.MetodosGenerales;

public class VehÝculo {
	//properties
	private String MatrÝcula;
	private String marca;
	private String modelo;
	private String color;
	private GregorianCalendar fechaalta;
	private double kmsrecorridos;
	private String ubicacion;
	//getters and setters
	/**
	 * 
	 * @return
	 */
	public String getMatrÝcula() {
		return MatrÝcula;
	}
	/**
	 * 
	 * @param matrÝcula
	 */
	public void setMatrÝcula(String matrÝcula) {
		MatrÝcula = matrÝcula;
	}
	/**
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * 
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * 
	 * @return
	 */
	public GregorianCalendar getFechaalta() {
		return fechaalta;
	}
	/**
	 * 
	 * @param fechaalta
	 */
	public void setFechaalta(GregorianCalendar fechaalta) {
		this.fechaalta = fechaalta;
	}
	/**
	 * 
	 * @return
	 */
	public double getKmsrecorridos() {
		return kmsrecorridos;
	}
	/**
	 * 
	 * @param kmsrecorridos
	 */
	public void setKmsrecorridos(double kmsrecorridos) {
		this.kmsrecorridos = kmsrecorridos;
	}
	/**
	 * 
	 * @return
	 */
	public String getUbicacion() {
		MetodosGenerales ubicacion1= new MetodosGenerales();
		ubicacion1.Provincia();
		return ubicacion;
	}
	/**
	 * 
	 * @param ubicacion
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	//constructors
	/**
	 * 
	 */
	public VehÝculo()
	{
		super();
		this.setMatrÝcula(MatrÝcula);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setColor(color);
		this.setKmsrecorridos(kmsrecorridos);
		this.setFechaalta(fechaalta);
		this.setUbicacion(ubicacion);
	}
	/**
	 * 
	 * @param matrÝcula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param kmsrecorridos
	 * @param fechaalta
	 * @param ubicacion
	 */
	public VehÝculo(String matrÝcula, String marca, String modelo, String color, double kmsrecorridos, GregorianCalendar fechaalta, String ubicacion) 
	{
		super();
		this.getMatrÝcula();
		this.getMarca();
		this.getModelo();
		this.getColor();
		this.getKmsrecorridos();
		this.getFechaalta();
		this.getUbicacion();
	}
	//methods
	
	
	
}
