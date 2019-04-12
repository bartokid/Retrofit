package Models;

import Utils.RandomUtils;
import org.omg.CORBA.PERSIST_STORE;

import java.util.*;

public class Usuario {

    private String id;
    private String name;
    private ArrayList<Pedido> listaPedidos;

    public Usuario(){
        this.id= RandomUtils.getId();
    }

    public Usuario (String name, ArrayList<Pedido> listaPedido){
        this();
        this.name=name;
        this.listaPedidos=listaPedido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
}
