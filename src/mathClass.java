public class mathClass {
    
    //Gerar número aleatório
    public int gerarNum(){
        return (int) ((Math.random() * (100 - 1) + 1));
    }

    //Validar se é par ou não
    public String verificarPar(int num){
        if(num % 2 == 0){
            return "é par";
        }
        else{
            return "é impar";
        }
    }

    //Encontrar o primeiro múltiplo
    public String encontrarMúltiplo(int num){
        int i = 3;

        while(i <= 10){
            if(num % i == 0){
                break;
            } else{
                i++;
            }
        }

        if(i > 10){
            return "É um número primo";
        }else{
            return "O primeiro múltiplo é: " + i;
        }
    }
}
