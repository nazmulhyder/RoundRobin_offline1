package offline_1;



import java.util.LinkedList;

public class RR {

    static LinkedList <Process> processList=  new LinkedList<Process>();
    static int time = 0;

    public static void main(String [] args ){
        processList.add(new Process(1,0,4));
        processList.add(new Process(2,0,5));
        processList.add(new Process(3,0,9));
        processList.add(new Process(4,0,6));
        processList.add(new Process(5,0,3));

        while (true){
            if (!processList.isEmpty()){

                runProcessinCpu();
            }
            else {

                break;
            }


        }

    }
    public static void runProcessinCpu(){
        Process process = processList.poll();
        process.runProcess(processList);

    }


}
