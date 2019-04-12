package Manager;
import Models.*;

import java.util.List;

public interface ProductManager {

    public List<Producto> ListaProducto();
    public  Pedido RealizarPedido();
    public Pedido ServirPedido();
    public List<Pedido> PedidoUsuario();
    public List<Producto> ProductosVendidos();

}
