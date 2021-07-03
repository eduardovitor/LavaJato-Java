
package carro;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    EstacionamentodoZé e1=new EstacionamentodoZé("62747383687597");
    int op=0;
    Scanner ler=new Scanner(System.in);
    op=ler.nextInt();
    while(true){
    if(op==1){
    e1.setCNPJ("123104/003"); // Resolvendo o menu 1
    }
    else if(op==2){
    Carro carro=new Carro(); // Resolvendo o menu 2
    e1.ColocarCarro(carro);
    }
    else if(op==3){
        Moto moto=new Moto(); // Resolvendo o menu 3
        e1.ColocarMoto(moto);
    }
    else if(op==4){
    Caminhão caminhão=new Caminhão(); // Resolvendo o menu 4
    e1.ColocarCaminhão(caminhão);
    }
    else if(op==5){
        e1.lavagemajatodecarro(e1.getUltimoCarroinserido()); //Resolvendo o menu 5
    }
    else if(op==6){
        e1.lavagemajatodecaminhão(e1.getUltimoCaminhãoinserido()); // Resolvendo o menu 6
    }
    else if(op==7){
        e1.trocaróleodecarro(e1.getUltimoCarroinserido()); // Resolvendo o menu 7
    }
    else if(op==8){
        System.out.println(""+e1.getQuantidadedecarros()); // Resolvendo o menu 8
        System.out.println(""+e1.getQuantidadedemotos());  
        System.out.println(""+e1.getQuantidadedecaminhões());
        System.out.println(""+e1.getGanhototal());
        System.out.println(""+e1.getQuantidadedecaminhõeslavados());
        System.out.println(""+e1.getQuantidadedecarroslavados());
        System.out.println(""+e1.getValorarrecadadocomalavagem());
        System.out.println(""+e1.getQuantidadedecarrosquetrocaramoóleo());
        System.out.println(""+e1.getValorarrecadadocomatrocadeoleo());
        break;
    }
    else if(e1.lotado()){
        System.out.println(""+e1.getGanhototal()); // Resolvendo o menu 9
        break;
    }
    op=ler.nextInt();
    }
}
}
