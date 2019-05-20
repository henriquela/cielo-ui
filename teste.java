package testeThread;

public class teste {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

        //cria tr�s tarefas
        Tarefa t1 = new Tarefa(0, 1000);
        t1.setName("Tarefa1");
        //Tarefa t2 = new Tarefa(1001, 2000);
       // t2.setName("Tarefa2");
        //Tarefa t3 = new Tarefa(2001, 3000);
       // t3.setName("Tarefa3");
  
        //inicia a execu��o paralela das tr�s tarefas, iniciando tr�s novas threads no programa
        t1.start();
        
        for (int i = 0;i < 10; i++) {
        	try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        	System.out.println("tentativa: " + i);
        	if (t1.getTotal() > 0) {
        		t1.stop();
        		break;
        	}
        }
        System.out.println("Teste: " + t1.getTotal());
    }

}

class Tarefa extends Thread {
	  
    private final long valorInicial;
    private final long valorFinal;
    private long total = 0;
  
    //m�todo construtor que receber� os par�metros da tarefa
    public Tarefa(int valorInicial, int valorFinal) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }
  
    //m�todo que retorna o total calculado
    public long getTotal() {
        return total;
    }
  
    /*
     Este m�todo se faz necess�rio para que possamos dar start() na Thread 
     e iniciar a tarefa em paralelo
     */
    @Override
    public void run() {
    	try { Thread.sleep (15000); } catch (InterruptedException ex) {}
        for (long i = valorInicial; i <= valorFinal; i++) {
            total += i;
        }
    }
}