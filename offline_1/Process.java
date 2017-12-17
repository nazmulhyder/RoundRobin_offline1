package offline_1;

import java.util.LinkedList;

public class Process {

    int process_id;
    int arrivalTime;
    int duration;
    int Quantum ;

    Process(int process_id , int arrivalTime , int duration ){
        this.process_id = process_id;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
        this.Quantum = 2;
    }

   public LinkedList runProcess (LinkedList <Process> processList){

        if (duration > Quantum){
            for (int i = 0 ; i< Quantum ; i++){

                System.out.println("my process id :"+process_id);
                System.out.println("Global Time :"+ RR.time); RR.time++;
            }
            duration-=Quantum;
            processList.addLast(new Process(process_id,0,duration));

        }

        else if (duration<=Quantum){
            for (int i= 0; i<duration ; i++){
                System.out.println("my process id :"+ process_id);
                System.out.println("Global Time :"+ RR.time); RR.time++;

            }

        }



            System.out.println("------------process " + process_id + " complete-----------");
            RR.time--;




        return processList;


  }

    public int getProcess_id() {
        return process_id;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getDuration() {
        return duration;
    }
}
