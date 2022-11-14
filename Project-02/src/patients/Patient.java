package patients;

public class Patient {
    public int pid;
    public String pname;
    private String history;

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    private String medicines;

    Patient(){

    }


    Patient(int pid,String pname){
        this.pid=pid;
        this.pname=pname;
    }

    Patient(int pid,String pname,String history){
        this.pname=pname;
        this.pid=pid;
        setHistory(history);
    }

}
