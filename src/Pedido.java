public class Pedido {

    private int id;
    private String nomeCliente;
    private String lanche;

    public Pedido(int id, String nomeCliente, String lanche) {
        
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.lanche = lanche;
    }

    public int getId() {

        return id;
    }

    public String getNomeCliente() {

        return nomeCliente;
    }

    public String getLanche() {

        return lanche;
    }

    @Override
    public String toString() {

        return "Pedido{id=" + id +
        ", cliente=" + nomeCliente +
        ", lanche=" + lanche + "}";
    }
}
