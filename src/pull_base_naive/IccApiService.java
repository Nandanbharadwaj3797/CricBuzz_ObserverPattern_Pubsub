package pull_base_naive;

public class IccApiService {
    private int runs;
    private int wickets;
    private double overs;

    public IccApiService(int runs,int wickets,double overs){
        this.runs=runs;
        this.wickets=wickets;
        this.overs=overs;
    }

    public int getRuns(){
        return runs;
    }

    public int getWickets(){
        return wickets;
    }

    public double getOvers(){
        return overs;
    }

    public void updateScore(int runs,int wickets,double overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

}
