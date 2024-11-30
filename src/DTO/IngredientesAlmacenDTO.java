package DTO;
public class IngredientesAlmacenDTO {
    private int AlmacenId;
    private int IngredienteId;
    private String NomAlmacen;
    private String NomIngrediente;
    private int StockIngrediente;
    private float PrecioIngrediente;
    private float Preciototal;
    private String DesIngrediente;

    public int getAlmacenId() {
        return AlmacenId;
    }

    public void setAlmacenId(int AlmacenId) {
        this.AlmacenId = AlmacenId;
    }

    public int getIngredienteId() {
        return IngredienteId;
    }

    public void setIngredienteId(int IngredienteId) {
        this.IngredienteId = IngredienteId;
    }

    public String getNomAlmacen() {
        return NomAlmacen;
    }

    public void setNomAlmacen(String NomAlmacen) {
        this.NomAlmacen = NomAlmacen;
    }

    public String getNomIngrediente() {
        return NomIngrediente;
    }

    public void setNomIngrediente(String NomIngrediente) {
        this.NomIngrediente = NomIngrediente;
    }

    public int getStockIngrediente() {
        return StockIngrediente;
    }

    public void setStockIngrediente(int StockIngrediente) {
        this.StockIngrediente = StockIngrediente;
    }

    public float getPrecioIngrediente() {
        return PrecioIngrediente;
    }

    public void setPrecioIngrediente(float PrecioIngrediente) {
        this.PrecioIngrediente = PrecioIngrediente;
    }

    public float getPreciototal() {
        return Preciototal;
    }

    public void setPreciototal(float Preciototal) {
        this.Preciototal = Preciototal;
    }

    public String getDesIngrediente() {
        return DesIngrediente;
    }

    public void setDesIngrediente(String DesIngrediente) {
        this.DesIngrediente = DesIngrediente;
    }
}
