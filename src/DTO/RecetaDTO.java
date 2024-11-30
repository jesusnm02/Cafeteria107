package DTO;
public class RecetaDTO {
    private int HeladosId;
    private String NomHelados;
    private int Cantidad;
    private int IngredienteId;

    public int getHeladosId() {
        return HeladosId;
    }

    public void setHeladosId(int HeladosId) {
        this.HeladosId = HeladosId;
    }

    public String getNomHelados() {
        return NomHelados;
    }

    public void setNomHelados(String NomHelados) {
        this.NomHelados = NomHelados;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getIngredienteId() {
        return IngredienteId;
    }

    public void setIngredienteId(int IngredienteId) {
        this.IngredienteId = IngredienteId;
    }
}
