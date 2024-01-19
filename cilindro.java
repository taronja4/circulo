public class cilindro extends circulo {

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public cilindro(double radio,double altura) {
        super(radio);
        if(altura<0){
            this.altura=0;
        } else {
            this.altura=altura;
        }
    }

    public double getVolumen(){
        return getArea()*altura;
    }
}
