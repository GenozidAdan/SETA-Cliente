package utez.edu.mx.seta.models;
import java.util.List;

public interface DaoRepository<T>{

    List<T> findAll();
    T findOne(int id);

    Object findOne(String correo, String contrasena);

    boolean update(int id, T object);

    boolean delete(int id);
}