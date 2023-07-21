package utez.edu.mx.seta.models;
import com.mysql.cj.xdevapi.Client;
import utez.edu.mx.seta.utils.MysqlConector;

import java.util.*;
import java.sql.*;

public class DaoCliente implements DaoRepository{
    @Override
    public List findAll() {
        List<Cliente> ListClientes = new ArrayList<>();
        MysqlConector conn = new MysqlConector();
        Connection con = conn.connect();
        try {
            PreparedStatement stmt = con.prepareStatement("select * from cliente");
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                Cliente cliente = new Cliente();
                cliente.setId(res.getInt("id_cliente"));
                cliente.setCorreo(res.getString("correo"));
                cliente.setContrasena(res.getString("contrasena"));
                ListClientes.add(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ListClientes;
    }


    @Override
    public Object findOne(int id) {
        Cliente cliente = new Cliente();
        MysqlConector conector = new MysqlConector();
        Connection con = conector.connect();
        try {
            PreparedStatement stmt =
                    con.prepareStatement("select * from cliente " +
                            "where id_cliente = ?");
            stmt.setInt(1,id);
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                cliente.setId(res.getInt("id_cliente"));
                cliente.setCorreo(res.getString("correo"));
                cliente.setContrasena(res.getString("contrasena"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cliente;
    }

    @Override
    public Object findOne(String correo, String contrasena) {
        Cliente cliente = new Cliente();
        MysqlConector conector = new MysqlConector();
        Connection con = conector.connect();
        try {
            PreparedStatement stmt =
                    con.prepareStatement("select * from cliente " +
                            "where correo = ? AND CONTRASENA = sha2(?,224)");
            stmt.setString(1,correo);
            stmt.setString(2,contrasena);
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                cliente.setId(res.getInt("id_cliente"));
                cliente.setCorreo(res.getString("correo"));
                cliente.setContrasena(res.getString("contrasena"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cliente;
    }

    @Override
    public boolean update(int id, Object object) {
        boolean flag = false;
        Connection con = new MysqlConector().connect();
        try {
            PreparedStatement stmt = con.prepareStatement(
                    "update cliente set codigo = sha2(?,224)," +
                            " nombre = ?, " +
                            " apaterno = ?, " +
                            " amaterno = ?, " +
                            " correo = ?, " +
                            " CONTRASENA = sha2(?,224)," +
                            " calle = ?, " +
                            " colonia = ?," +
                            " localidad = ?," +
                            " estado = ?," +
                            " codigo_postal = ?" +
                            " where id_cliente = ?"
            );
            Cliente cliente = (Cliente) object;
            stmt.setString(1,cliente.getCodigo());
            stmt.setString(2,cliente.getNombre());
            stmt.setString(3,cliente.getApaterno());
            stmt.setString(4,cliente.getAmaterno());
            stmt.setString(5,cliente.getCorreo());
            stmt.setString(6,cliente.getContrasena());
            stmt.setString(7,cliente.getCalle());
            stmt.setString(8,cliente.getColonia());
            stmt.setString(9,cliente.getLocalidad());
            stmt.setString(10,cliente.getEstado());
            stmt.setString(11,cliente.getCodigo_postal());
            stmt.setInt(12,id);
            flag = stmt.executeUpdate() > 0 ? true:false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }

    public boolean insert (Cliente cliente){
        Connection con = new MysqlConector().connect();
        try {
            PreparedStatement stmt = con.prepareStatement(
                    "insert into cliente (codigo, nombre, apaterno, amaterno, correo, contrasena, calle, colonia, localidad, estado, codigo_postal) " +
                            "values (sha2(?,224),?,?,?,?,sha2(?,224),?,?,?,?,?)"
            );
            stmt.setString(1,cliente.getCodigo());
            stmt.setString(2,cliente.getNombre());
            stmt.setString(3,cliente.getApaterno());
            stmt.setString(4,cliente.getAmaterno());
            stmt.setString(5,cliente.getCorreo());
            stmt.setString(6,cliente.getContrasena());
            stmt.setString(7,cliente.getCalle());
            stmt.setString(8,cliente.getColonia());
            stmt.setString(9,cliente.getLocalidad());
            stmt.setString(10,cliente.getEstado());
            stmt.setString(11,cliente.getCodigo_postal());
           if (stmt.executeUpdate() > 0){
               return true;
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public Object findCodigo(String Codigo){
        Cliente cliente = new Cliente();
        MysqlConector conector = new MysqlConector();
        Connection con = conector.connect();
        try {
            PreparedStatement stmt =
                    con.prepareStatement("select * from cliente " +
                            "where codigo = ?");
            stmt.setString(1,Codigo);
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                cliente.setId(res.getInt("id_cliente"));
                cliente.setCodigo(res.getString("codigo"));
                cliente.setCorreo(res.getString("correo"));
                cliente.setContrasena(res.getString("contrasena"));
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cliente;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
