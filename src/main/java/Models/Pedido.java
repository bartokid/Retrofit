package Models;

import Utils.RandomUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pedido {

    private String id;
    private String usrId;
    private ArrayList<Producto> listaProductos;

    /**
     * Constructores
     */
    public Pedido(){
        this.id= RandomUtils.getId();
    }
    public Pedido( String usrId, ArrayList<Producto> listaProductos) {
        this();
        this.usrId = usrId;
        this.listaProductos = listaProductos;
    }

    /**
     * getters &setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsr() {
        return usrId;
    }


    public void setUsr(String usr) {
        this.usrId = usr;
    }


    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public void AddProducto(Producto prod){
        listaProductos.add(prod);
    }
}
