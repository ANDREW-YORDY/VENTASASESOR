package com.model;

public class VentasModel {

    /*
     * ATRIBUTES & SET-GET & CONEX DB.
     */

    private String id;
    private String linea;
    private String tipo_ident;
    private String identificacion;
    private String nombre_cliente;
    private String email;
    private String imsi;
    private String dummi;
    private String nip;
    private String plan;
    private String categoria_plan;
    private String contrato_tdc;
    private String cesion_pre;
    private String adicionales;
    //private String vista_previa;

    public VentasModel(String id, String linea, String tipo_ident, String identificacion,
            String nombre_cliente, String email, String imsi, String dummi,
            String nip, String plan, String categoria_plan, String contrato_tdc,
            String cesion_pre, String adicionales) {
        
        this.id = id;
        this.linea = linea;
        this.tipo_ident = tipo_ident;
        this.identificacion = identificacion;
        this.nombre_cliente = nombre_cliente;
        this.email = email;
        this.imsi = imsi;
        this.dummi = dummi;
        this.nip = nip;
        this.plan = plan;
        this.categoria_plan = categoria_plan;
        this.contrato_tdc = contrato_tdc;
        this.cesion_pre = cesion_pre;
        this.adicionales = adicionales;
        //this.vista_previa = vista_previa;
    }

    public String getId() {
        return id;
    };
    public void setId(String id) {
        this.id = id;
    }; 
    
    public String getLinea() {
        return linea;
    };
    public void setLinea(String linea) {
        this.linea = linea;
    }; 
    
    public String getTipoIdent() {
        return tipo_ident;
    };
    public void setTipoIdent(String tipo_ident) {
        this.tipo_ident = tipo_ident;   
    };
    
    public String getIdentificacion(){
        return identificacion;
    };
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    };
    
    public String getNombreCliente(){
        return nombre_cliente;
    };
    public void setNombreCliente(String nombre_cliente){
        this.nombre_cliente = nombre_cliente;
    };
    
    public String getEmail(){
        return email;
    };
    public void setEmail(String email){
        this.email = email;
    };
    
    public String getImsi(){
        return imsi;
    };
    public void setImsi(String imsi){
        this.imsi = imsi;
    };
    
    public String getDummi(){
        return dummi;
    };
    public void setDummi(String dummi){
        this.dummi = dummi;
    }
    
    public String getNip(){
        return nip;
    };
    public void setNip(String nip){
        this.nip = nip;
    };
    
    public String getPlan(){
        return plan;
    };
    public void setPlan(String plan){
        this.plan = plan;
    };
    
    public String getCategoriaPlan(){
        return categoria_plan;
    };
    public void setCategoriaPlan(String categoria_plan){
        this.categoria_plan = categoria_plan;
    };
    
    public String getContratoTdc(){
        return contrato_tdc;
    };
    public void setContratoTdc(String contrato_tdc){
        this.contrato_tdc = contrato_tdc;
    };
    
    public String getCesionPre(){
        return cesion_pre;
    };
    public void setCesionPre(String cesion_pre){
        this.cesion_pre = cesion_pre;
    };
    
    public String getAdicionales(){
        return adicionales;
    };
    public void setAdicionales(String adicionales){
        this.adicionales = adicionales;
    };
    
    /*
    public String getVistaPrevia(){
        return vista_previa;
    };
    public void setVistaPrevia(String vista_previa){
        this.vista_previa = vista_previa;
    };
    */

}
