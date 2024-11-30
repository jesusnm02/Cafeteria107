package DTO;
public class HeladoAlmacenDTO {
    private int AlmacenId;
    private int HeladosId;
    private String NomAlmacen;
    private String NomHelados;
    private int StockHelado;
    private float PrecioHelado;
    private float PrecioTotal;
    private String DesHelados;

    public int getAlmacenId() {
        return AlmacenId;
    }

    public void setAlmacenId(int AlmacenId) {
        this.AlmacenId = AlmacenId;
    }

    public int getHeladosId() {
        return HeladosId;
    }

    public void setHeladosId(int HeladosId) {
        this.HeladosId = HeladosId;
    }

    public String getNomAlmacen() {
        return NomAlmacen;
    }

    public void setNomAlmacen(String NomAlmacen) {
        this.NomAlmacen = NomAlmacen;
    }

    public String getNomHelados() {
        return NomHelados;
    }

    public void setNomHelados(String NomHelados) {
        this.NomHelados = NomHelados;
    }

    public int getStockHelado() {
        return StockHelado;
    }

    public void setStockHelado(int StockHelado) {
        this.StockHelado = StockHelado;
    }

    public float getPrecioHelado() {
        return PrecioHelado;
    }

    public void setPrecioHelado(float PrecioHelado) {
        this.PrecioHelado = PrecioHelado;
    }

    public float getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(float PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public String getDesHelados() {
        return DesHelados;
    }

    public void setDesHelados(String DesHelados) {
        this.DesHelados = DesHelados;
    }
}
