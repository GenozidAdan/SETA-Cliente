package utez.edu.mx.seta.models;

public class Cliente {
    private int id;
    private String codigo;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String correo;
    private String contrasena;
    private String calle;
    private String colonia;
    private String localidad;
    private String estado;
    private String codigo_postal;

    public Cliente() {
    }

    public Cliente(int id, String codigo, String correo, String contrasena) {
        this.id = id;
        this.codigo = codigo;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Cliente(int id, String codigo, String nombre, String apaterno, String amaterno, String correo, String contrasena, String calle, String colonia, String localidad, String estado, String codigo_postal) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.correo = correo;
        this.contrasena = contrasena;
        this.calle = calle;
        this.colonia = colonia;
        this.localidad = localidad;
        this.estado = estado;
        this.codigo_postal = codigo_postal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
}
