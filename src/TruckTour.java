import java.io.IOException;
import java.util.List;



class TruckTour {
    public static int truckTour(List<List<Integer>> petrolpumps) {
        for(int i = 0;i<petrolpumps.size();i++){
            if(possibleToCompleteJourney(petrolpumps, i))
                return i;
        }
        return -1;
    }

    private static boolean possibleToCompleteJourney(List<List<Integer>> petrolPumps, int petrolPump){
        int petrolAvailable = 0;
        for(int i = petrolPump;i<petrolPump+petrolPumps.size();i++){
            int j = i;
            if(j>=petrolPumps.size()){
                j = Math.abs(petrolPumps.size()-j);
            }
            petrolAvailable += petrolPumps.get(j).get(0);
            int distanceToNextPump = petrolPumps.get(j).get(1);
            if(petrolAvailable < distanceToNextPump){
                return false;
            } else {
                petrolAvailable -= distanceToNextPump;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(truckTour(List.of(List.of(1,5), List.of(10, 3), List.of(3, 4))));
    }
}
