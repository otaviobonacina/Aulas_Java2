public class ExemploCondicional {
    public static void execute(){
        boolean flag = true;
        if(flag){
            System.out.println("Executa IF");
        }else{
            System.out.println("Executa ELSE");
        }
        String periodo ="Noite";

        switch(periodo){

            case "manhã":

            System.out.println("Bom dia");

            break;

            case "tarde":

            System.out.println("Boa Tarde");  

            break;

            case "Noite":

            System.out.println("Bom dia");

            break;
            
            default:

            System.out.println("Valor Invalido");

            break;

            
        }


    }
}
