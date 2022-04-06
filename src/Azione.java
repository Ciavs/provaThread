public class Azione  extends Thread {

    Salvadanaio salvadanaio; 
    boolean inserisci;

    public Azione( Salvadanaio s , boolean i)
    {
        salvadanaio = s; 
        inserisci = i;
    }
    
    public void run(){
        for(int i = 0 ; i < 1000 ; i++){
            if(inserisci){
                salvadanaio.inserisci();
            }else{
                salvadanaio.preleva();
            }
        }
    }
}
