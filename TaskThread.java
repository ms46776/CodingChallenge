package Part2;

public class TaskThread implements Runnable {
	  
    private String command;

    public TaskThread(String s){
        this.command=s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+" Starting. enter your command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End of task");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString(){
        return this.command;
    }
}
