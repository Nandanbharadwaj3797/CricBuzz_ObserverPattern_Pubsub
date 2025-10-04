package pull_base_naive;

public class Cricbuzz {
    private int runs;
    private int wickets;
    private double overs;

    private IccApiService iccApiService; // this violet Dip

    public Cricbuzz(){
        this.iccApiService=new IccApiService(runs,wickets,overs);
    }

    public void updateScore(int runs,int wickets,double overs){
        while(true){
            iccApiService.updateScore(runs, wickets, overs);
            // we can write a logic to check if the runs or wickets or overs are update then we update them also.
            if(this.runs!=iccApiService.getRuns() ||
                this.wickets!= iccApiService.getWickets() ||
                this.overs!= iccApiService.getOvers()){
                    this.runs= iccApiService.getRuns();
                    this.wickets= iccApiService.getWickets();
                    this.overs= iccApiService.getOvers();
            }
        }
    }

}
