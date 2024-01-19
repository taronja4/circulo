public class main {

    public static void main(String [] args){
        
        circulo cir=new circulo(4.3);
        circulo cir2=new circulo(-2.8);
        cilindro dil=new cilindro(3.9,2.6);
        cilindro dil2=new cilindro(2.7,-1.5);

        System.out.println("el radio del circulo1 es: "+cir.getRadio());
        System.out.println("el area del circulo1 es: "+cir.getArea());
        System.out.println("...............................................");
        System.out.println("el radio del circulo2 es: "+ cir2.getRadio());
        System.out.println("el area del circulo2 es: "+cir2.getArea());
        System.out.println("...............................................");
        System.out.println("el area del cilindro1 es: "+dil.getArea());
        System.out.println("el volumen del cilindro1 es: "+dil.getVolumen());
        System.out.println("el radio del cilindro1 es: "+dil.getRadio());
        System.out.println("...............................................");
        System.out.println("el area del cilindro2 es: "+dil2.getArea());
        System.out.println("el volumen del cilindro2 es: "+dil2.getVolumen());
        System.out.println("el radio del cilindro2 es: "+dil2.getRadio());




    }
}
