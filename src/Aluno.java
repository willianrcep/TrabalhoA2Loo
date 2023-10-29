import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private ArrayList<Integer> lista;
    private ArrayList<Double> listaA1;
    private ArrayList<Double> listaP1;
    private ArrayList<Double> listaA2;
    private ArrayList<Double> listaP2;
    private ArrayList<String> lista2;
    private Scanner scan;
    private int codigo;
    
    public Aluno(){//construtor
        this.lista = new ArrayList<Integer>();
        this.listaA1 = new ArrayList<Double>();
        this.listaP1 = new ArrayList<Double>();
        this.listaA2 = new ArrayList<Double>();
        this.listaP2 = new ArrayList<Double>();
        this.lista2 = new ArrayList<String>();
        this.scan =new Scanner(System.in);
    }

public void Executar(){
    int continuar = 99;
    while(continuar != 0){
        
        System.out.println("-----------------------------------------------------");
        System.out.println("");
        System.out.println("1 -  Gerenciar Alunos ");
        System.out.println("2 -  Rendimento Escolar");
        System.out.println("9 -  Sair, finalizando o programa.");
        System.out.println("");
        System.out.println("-----------------------------------------------------");

        int opcao = this.scan.nextInt();
        switch (opcao){
            case 1:
            this.ExecutarOpcao1();
            break;
            case 2:
            this.ExecutarOpcao2();
            break;
            case 9:
            System.out.println("");
            System.out.println("Programa finalizado!");
            System.out.println("");
            continuar = 0;
            break;
            default:
            System.out.println("Digite opcao valida");

        }
    }
}

private void ExecutarOpcao1(){
    int continuar = 99;
    while(continuar != 0){
        System.out.println("-----------------------------------------------------");
        System.out.println("");
        System.out.println("1 -  Adicionar Aluno:  ");
        System.out.println("2 -  Alterar nome do Aluno: ");
        System.out.println("3 -  Excluir Aluno: ");
        System.out.println("4 -  Listar todos:  ");
        System.out.println("5 -  Selecionar um aluno da lista, para adicionar notas e calcular média:  ");
        System.out.println("9 -  Para voltar: ");
        System.out.println("");
        System.out.println("----------------------------------------------------");

        int opcao = this.scan.nextInt();
        switch (opcao){           
            case 1:               
                     int conti = 99;
                    while(conti != 0){
                        System.out.println("----------------------------------------------------");
                        System.out.println("");
                        System.out.println("Digite o codigo do aluno ou 0 para voltar:");  
                        System.out.println("");
                        System.out.println("----------------------------------------------------");                    
                        int cod = this.scan.nextInt();
                                         
                        if(cod != 0){
                            System.out.println("----------------------------------------------------");
                            System.out.println("");
                            System.out.println("Informe o nome do aluno");     
                            System.out.println("");  
                            System.out.println("----------------------------------------------------"); 
                                scan.nextLine();
                                String nom = this.scan.nextLine();
                            this.lista.add(cod);
                            this.lista2.add(nom);                       
                        }
                        else{
                            conti = 0;
                        } 
                    }
            break;
            case 2:                       
                        System.out.println("Digite o codigo do aluno para alterar nome: ");
                        System.out.println("");
                        System.out.println("-----------------------------------------------------");
                        System.out.println("--Lista de alunos--");          
                        this.ImprimeLista();       
                        System.out.println("-----------------------------------------------------");
                        System.out.println("");
                        int cod = this.scan.nextInt(); 
                        System.out.println("");  
                        this.scan.nextLine();                           
                        int tam = this.lista.size();//size pega o tamanho.size -1 pega o ultimo.pegar o primeiro e get 0.                               
                                for(int i = 0; i<tam; i++){                                                                 
                                if(cod == this.lista.get(i)){
                                    System.out.println("indice[" + i + "] = " + this.lista2.get(i));
                                    System.out.println("Digite o novo nome: "); 
                                     
                                    String alterarNome = this.scan.nextLine();  
                                    this.lista2.set(i,alterarNome);
                                    System.out.println("indice[" + i + "] = " + this.lista2.get(i));                                                                    
                                }
                                else{
                                    conti = 0;
                                }  
                            }                                             
            break;
            case 3:
            
               
                        System.out.println("Digite o codigo do aluno para remover: ");
                        System.out.println("");
                        System.out.println("-----------------------------------------------------");
                        System.out.println("--Lista de alunos--");          
                        this.ImprimeLista();       
                        System.out.println("-----------------------------------------------------");
                        System.out.println("");
                        int codi = this.scan.nextInt();   
                        System.out.println("");                               
                        int tama = this.lista.size();//size pega o tamanho.size -1 pega o ultimo.pegar o primeiro e get 0.                               
                        this.scan.nextLine();         
                        for(int i = 0; i<tama; i++){                               
                                if(codi == this.lista.get(i)){                                                                
                                    System.out.println("indice[" + i + "] = " + this.lista2.get(i));  
                                    lista.remove(i);
                                    lista2.remove(i);                                                                                                                                                                                
                                }
                                else{
                                    conti = 0;
                                }  
                            }  
                                            
            break;
            case 4:
            System.out.println("");
            System.out.println("-----------------------------------------------------");
            System.out.println("--Lista de alunos--");          
            this.ImprimeLista();       
            System.out.println("-----------------------------------------------------");
            System.out.println("");

            break;
            case 5:
            
            System.out.println("");
            System.out.println("1 - Adicionar a nota A1 do aluno selecionado");
            System.out.println("2 - Adicionar a nota P1 do aluno selecionado");
            System.out.println("3 - Adicionar a nota A2 do aluno selecionado");
            System.out.println("4 - Adicionar a nota P2 do aluno selecionado");
            System.out.println("5 - Calcular a Média do Aluno (usando a fórmula abaixo), exibir o resultado, e se o aluno foi aprovado ou reprovado. ");
            System.out.println("");
            System.out.println("----------------------------------------------------");
                int codig = this.scan.nextInt();
                System.out.println("");
                    this.scan.nextLine();
                                         
                    switch (codig){
                        case 1:
                        int contin = 99;

                                while(contin != 0){
                                    
                                    
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("--Lista de alunos--");          
                                    this.ImprimeLista();       
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("");
                                    System.out.println(" Digite qual codigo do aluno para Adicionar A1");
                                    int codd = this.scan.nextInt();
                                    
                                    int tamm = this.lista.size();//size pega o tamanho.size -1 pega o ultimo.pegar o primeiro e get 0.                               
                                            for(int i = 0; i<tamm; i++){                                                                 
                                            if(codd == this.lista.get(i)){
                                                System.out.println("-----------------------------------------------------");
                                                System.out.println("Codigo[" + this.lista.get(i) + "] = " + this.lista2.get(i));
                                                System.out.println("Digite nota A1: "); 
                                                System.out.println("-----------------------------------------------------");
                                                double cod2 = this.scan.nextInt();                                   
                                                this.listaA1.add(cod2);  
                                                System.out.println("Nota A1 = "+  this.listaA1.get(i)+ " - Aluno = " + this.lista2.get(i));                                                             
                                                System.out.println("");
                                                contin = 0;
                                            }
                                            else{
                                                contin = 0;
                                            }  
                                        }  
                                }
                        break;
                        case 2:
                        int contin2 = 99;

                                while(contin2 != 0){
                                    
                                    System.out.println(" Digite qual codigo do aluno para Adicionar P1");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("--Lista de alunos--");          
                                    this.ImprimeLista();       
                                    System.out.println("-----------------------------------------------------");
                                    int codd2 = this.scan.nextInt();
                                    this.scan.nextLine();
                                    int tamm2 = this.lista.size();//size pega o tamanho.size -1 pega o ultimo.pegar o primeiro e get 0.                               
                                            for(int i = 0; i<tamm2; i++){                                                                 
                                            if(codd2 == this.lista.get(i)){
                                                System.out.println("indice[" + i + "] = " + this.lista2.get(i));
                                                System.out.println(" Digite nota P1: "); 
                                                double cod3 = this.scan.nextInt(); 
                                                this.scan.nextLine();                                  
                                                this.listaP1.add(cod3);  
                                                System.out.println(" Nota P1 = "+  this.listaP1.get(i)+ " - Aluno = " + this.lista2.get(i));                                                             
                                            contin2 = 0;
                                            }
                                            else{
                                                contin2 = 0;
                                            }  
                                        }  
                                }
                        break;
                        case 3:
                            int contin3 = 99;

                                while(contin3 != 0){
                                    
                                    System.out.println(" Digite qual codigo do aluno para Adicionar A2");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("--Lista de alunos--");          
                                    this.ImprimeLista();       
                                    System.out.println("-----------------------------------------------------");
                                    int codd2 = this.scan.nextInt();
                                    this.scan.nextLine();
                                    int tamm2 = this.lista.size();//size pega o tamanho.size -1 pega o ultimo.pegar o primeiro e get 0.                               
                                            for(int i = 0; i<tamm2; i++){                                                                 
                                            if(codd2 == this.lista.get(i)){
                                                System.out.println("indice[" + i + "] = " + this.lista2.get(i));
                                                System.out.println(" Digite nota A2: "); 
                                                double cod3 = this.scan.nextInt(); 
                                                this.scan.nextLine();                                  
                                                this.listaA2.add(cod3);  
                                                System.out.println(" Nota A2 = "+  this.listaA2.get(i)+ " - Aluno = " + this.lista2.get(i));                                                             
                                            contin3 = 0;
                                            }
                                            else{
                                                contin3 = 0;
                                            }  
                                        }  
                                }
                        break;
                        case 4:
                        int contin4 = 99;

                                while(contin4 != 0){
                                    
                                    System.out.println(" Digite qual codigo do aluno para Adicionar P2");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("--Lista de alunos--");          
                                    this.ImprimeLista();       
                                    System.out.println("-----------------------------------------------------");
                                    int codd2 = this.scan.nextInt();
                                    this.scan.nextLine();
                                    int tamm2 = this.lista.size();//size pega o tamanho.size -1 pega o ultimo.pegar o primeiro e get 0.                               
                                            for(int i = 0; i<tamm2; i++){                                                                 
                                            if(codd2 == this.lista.get(i)){
                                                System.out.println("indice[" + i + "] = " + this.lista2.get(i));
                                                System.out.println(" Digite nota P2: "); 
                                                double cod3 = this.scan.nextInt(); 
                                                this.scan.nextLine();                                  
                                                this.listaP2.add(cod3);  
                                                System.out.println(" Nota P2 = "+  this.listaP2.get(i)+ " - Aluno = " + this.lista2.get(i));                                                             
                                                contin4 = 0;
                                            }
                                            else{
                                                contin4 = 0;
                                            }  
                                        }  
                                }
                        break;
                        case 5:
                        int contin5 = 99;

                                while(contin5 != 0){
                                    System.out.println(" Digite qual codigo do aluno para calcular a média");
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("--Lista de alunos--");          
                                    this.ImprimeLista();       
                                    System.out.println("-----------------------------------------------------");
                                    int codd5 = this.scan.nextInt();
                                    System.out.println("----------------------------------------------------");        
                                    int tamm5 = this.lista.size();//size pega o tamanho.size -1 pega o ultimo.pegar o primeiro e get 0.                               
                                            for(int i = 0; i<tamm5; i++){                        
                                            if(codd5 == this.lista.get(i)){
                                                double a1 = this.listaA1.get(i);
                                                double p1 = this.listaP1.get(i);
                                                double a2 = this.listaA2.get(i);
                                                double p2 = this.listaP2.get(i);
                
                                                    System.out.println("A1 " + this.listaA1.get(i));
                                                    System.out.println("p1 " + this.listaP1.get(i));
                                                    System.out.println("A2 " + this.listaA2.get(i));
                                                    System.out.println("p2 " + this.listaP2.get(i));

                                                    double media = (((a1+p1)/2)+((a2+p2)/2))/2;
                                                    System.out.println("indice[" + i + "] = " + this.lista2.get(i));
                                                    System.out.println("Média: " + media); 
                                                    if(media >=6){
                                                        System.out.println("Aluno(A): "+ this.lista2.get(i)+ " = Aprovado");
                                                    }
                                                    else{
                                                        System.out.println("Aluno(A): "+ this.lista2.get(i)+ " = Reprovado");
                                                    }
                                                    contin5 = 0;                                                           
                                            }
                                            else{
                                                contin5 = 0;
                                            }  
                                        }  
                                }
                        break;
                        }
                        break;              
                        case 9:
                        continuar = 0;
                        break;
                        default:
                        System.out.println("Digite opcao valida");
        }
    }
}

private void ExecutarOpcao2(){
    
    int continuar = 99;
    while(continuar != 0){
        
        System.out.println("-----------------------------------------------------");
        System.out.println("1 -  Selecionar um aluno da lista, para: Exibir as notas de prova, de atividade e a média");
        System.out.println("2 -  Exibir rendimento da turma (a lista toda, exibir as notas de prova, de atividade e a média). ");
        System.out.println("9 -  voltar");
        System.out.println("-----------------------------------------------------");
        
        int opcao = this.scan.nextInt();
        this.scan.nextLine();
        switch (opcao){
            case 1:
            int contin6 = 99;

                while(contin6 != 0){
                    System.out.println(" Digite qual codigo do aluno para: Exibir as notas de prova, de atividade e a média");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("--Lista de alunos--");          
                    this.ImprimeLista();       
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Ou digite 0 para voltar.");
                    System.out.println("-----------------------------------------------------");
                    int codd5 = this.scan.nextInt();
                    System.out.println("----------------------------------------------------");        
                    int tamm6 = this.lista.size();//size pega o tamanho.size -1 pega o ultimo.pegar o primeiro e get 0.                               
                            for(int i = 0; i<tamm6; i++){  
                                
                                if(codd5 == this.lista.get(i)){
                                    double a1 = this.listaA1.get(i);
                                    double p1 = this.listaP1.get(i);
                                    double a2 = this.listaA2.get(i);
                                    double p2 = this.listaP2.get(i);
                                    double media = (((a1+p1)/2)+((a2+p2)/2))/2;
                                    System.out.println("Atividade A1 = " + this.listaA1.get(i));
                                    System.out.println("Prova P1 = " + this.listaA1.get(i));
                                    System.out.println("Atividae A2 = " + this.listaA1.get(i));
                                    System.out.println("Prova P2 = " + this.listaA1.get(i));
                                    
                                    double media1 = (((a1+p1)/2)+((a2+p2)/2))/2;
                                    System.out.println("indice [" + i + "] = " + this.lista2.get(i));
                                    System.out.println("Média: " + media);  
                                                                                                    
                                }
                                else{
                                    contin6 = 0;
                                }  
                            }  
                         }
                 break;
           
            case 2:
                int tam = this.lista.size();//size pega o tamanho. size -1 pega o ultimo. pegar o primeiro e get 0.
                for(int i =0; i<tam; i++){
                    double a1 = this.listaA1.get(i);
                    double p1 = this.listaP1.get(i);
                    double a2 = this.listaA2.get(i);
                    double p2 = this.listaP2.get(i);
                    double media = (((a1+p1)/2)+((a2+p2)/2))/2;
                System.out.println("Indice[" + i + "] - " + "Codigo = " + this.lista.get(i)+" - Nome = " + this.lista2.get(i)+" - A1 = " + this.listaA1.get(i)+" - P1 = " + this.listaP1.get(i)+" - A2 = " + this.listaA2.get(i)+" - P2 = " + this.listaP2.get(i) + " - Média = "+ media);          
            }
            break;
            case 9:
            continuar = 0;
            break;
            default:
            System.out.println("Digite opcao valida");
        }
    }
}

private void ImprimeLista(){
    int tam = this.lista.size();//size pega o tamanho. size -1 pega o ultimo. pegar o primeiro e get 0.
        for(int i =0; i<tam; i++){
        System.out.println("Indice[" + i + "] - " + "Codigo = " + this.lista.get(i)+" - Nome = " + this.lista2.get(i));          
    }
}
    
}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             