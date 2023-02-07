 public class SonesTestLoadedDie {
    
    public static void main(String [] args){

        final int TIMES = 1000;
        int count = 0;
        int Loadedcount = 0;

        SonesDie DieValue0 = new SonesDie();
        SonesDie DieValue1 = new SonesDie();

        for(int i =0; i < TIMES; i++){
            SonesDie(DieValue0);
            SonesDie(DieValue1);
                                            // if the previous die roll is larger than the current value, 
            if (SetValue(DieValue0) > SetValue(DieValue1)){
                
                count = count++;              // and one to the value of how many times the first die won
                SetValue(DieValue0) + 1; // and add one to the value of the first die.
            }
            }
            
            
        System.out.print("The first die won " + count + " times!"); //Displayed will be the amount of time the first die won.

        SonesLoadedDie LoadedDieValue0 = new SonesLoadedDie();
        SonesLoadedDie LoadedDieValue1 = new SonesLoadedDie();

        for(int i =0; i < TIMES; i++){
            SonesLoadedDie(LoadedDieValue0); 
            SonesLoadedDie(LoadedDieValue1);
                                                        // if the previous die roll is larger than the current value, 
            if (SetValue(LoadedDieValue0) > Setvalue(LoadedDieValue1)){
                
                Loadedcount = Loadedcount++;            // and one to the value of how many times the first die won
                return SetValue(LoadedDieValue0) + 1;     // and add one to the value of the first die.
            }

        System.out.print("The first die won " + Loadedcount + " times the second match!");


        
    }
}

}