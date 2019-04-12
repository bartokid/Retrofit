package Manager;

import Models.Pedido;
import Models.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class ProductManagerIMPL implements ProductManager  {
    private Logger log;
    private static volatile ProductManagerIMPL instance = null;
    private ProductManagerIMPL(){

    }
    public static ProductManagerIMPL getInstance() {
        if (instance == null) {
            synchronized(ProductManagerIMPL.class) {
                if (instance == null) {
                    instance = new ProductManagerIMPL();
                }
            }
        }

        return instance;
    }


    @Override
    public List<Producto> ListaProducto(){
        int x =30 ;
        log.warning("esto no va");
        log.info("hola" );
        return new ArrayList<Producto>();

    }


    @Override
    public Pedido RealizarPedido(){

        return new Pedido();
    }

    /**
     *
     * @return
     */
    @Override
    public Pedido ServirPedido(){

        return new Pedido();
    }
    @Override
    public List<Pedido> PedidoUsuario() {
        return new ArrayList<Pedido>();
    }

    @Override
    public List<Producto> ProductosVendidos() {
        return new ArrayList<Producto>();
    }


}
