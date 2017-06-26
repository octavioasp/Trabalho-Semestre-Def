package data;

import java.util.ArrayList;
import model.Clientes;

public class DadosClientes {

    ArrayList<Clientes> cliente = new ArrayList();

    public void cadastaCliente(Clientes clientes) {
        cliente.add(clientes);

    }

}
