public class ControleFluxo {
    
    public static void main (String[] args) {

       /* Tipos:
       Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução.
       Opçãos: if(se), switch(escolha) e operador ternário
       
       Decisão: if, if-else, if-else-if, if-eslse-if-else

       Boas práticas:
       - Switch é para valores exatos e if para expressões booleanas
       - Evitar usar o defeault do switch para "cases genéricos"
       - Evitar o efeito "fecha" dos if's
       - Evitar muitos if's aninhados
       - Usar a boa prática da aula 2 para diminuir o tamanho if
       */ 

       ifFlecha();
       ifSemFlecha();
       ifFerias();
       ifMenor();

       switchSemana();
       switchNumero();
       switchFerias();
    }

    private static void ifFlecha() {

        int mes = 9;
        if (mes ==1){
            System.out.println("Janeiro");
            } else {
                if (mes ==2){
                 System.out.println("Fevereiro");
              } else {
                  if (mes ==3){
                 System.out.println("Março");
                     } else {
                         if (mes ==4){
                            System.out.println("Abril");
                                 } else {
                                      if (mes ==5){
                                        System.out.println("Maio");
                                          } else {
                                             if (mes ==6){
                                                 System.out.println("Junho");
                                                     } else {
                                                        if (mes ==7){
                                                             System.out.println("Julho");
                                                                } else {
                                                                     if (mes ==8){
                                                                          System.out.println("Agosto");
                                                                              else {
                                                                                 if (mes ==9){
                                                                                     System.out.println("Setembro");
                                                                                 }
                                                                              }
                                                                     }
                                                                    }
                                                     }
                                                    }
                                 }
                                }
                            }

  
  
    }

 private static Void ifSemFlecha() {
    int mes = 9;
    if (mes ==1){
    System.out.println("Janeiro");
    } else {
    if (mes ==2){
    System.out.println("Fevereiro");
    } else {
    if (mes ==3){
    System.out.println("Março");
    } else {
    if (mes ==4){
    System.out.println("Abril");
    } else {
    if (mes ==5){
    System.out.println("Maio");
    } else {
    if (mes ==6){
    System.out.println("Junho");
    } else {
    if (mes ==7){
    System.out.println("Julho");
    } else {
    if (mes ==8){
    System.out.println("Agosto");
    } else {
    if (mes ==9){
    System.out.println("Setembro");
    }
}
}
}
}
}
}
}
}
}
    
  private static void ifFerias() {

    String mes = "julho";
    if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
        System.out.println("Ferias");
    }
  }                                                   

  private static void ifMenor() {

  // Voltar aula para 05:47 minutos  
  }
}