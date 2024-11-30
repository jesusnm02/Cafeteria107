package DTO;
public class StockIngredienteDTO {
    private int AlmacenIngredienteId;
    private int StockIngrediente;
    private Float PrecioIngrediente;
    private int IngredienteId;

    public int getAlmacenIngredienteId() {
        return AlmacenIngredienteId;
    }

    public void setAlmacenIngredienteId(int AlmacenIngredienteId) {
        this.AlmacenIngredienteId = AlmacenIngredienteId;
    }

    public int getStockIngrediente() {
        return StockIngrediente;
    }

    public void setStockIngrediente(int StockIngrediente) {
        this.StockIngrediente = StockIngrediente;
    }

    public Float getPrecioIngrediente() {
        return PrecioIngrediente;
    }

    public void setPrecioIngrediente(Float PrecioIngrediente) {
        this.PrecioIngrediente = PrecioIngrediente;
    }

    public int getIngredienteId() {
        return IngredienteId;
    }

    public void setIngredienteId(int IngredienteId) {
        this.IngredienteId = IngredienteId;
    }
}
