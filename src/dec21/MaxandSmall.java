package dec21;

public class MaxandSmall {
    public int findmax(int[] maximum){
        int max=maximum[0];
        for(int i=0; i<maximum.length; i++){
            if(maximum[i] > max){
                max=maximum[i];
            }
        }
        return max;
    }
    public int findmin(int[] minimum){
        int min=minimum[0];
        for(int i=0; i<minimum.length; i++){
            if(minimum[i] < min){
                min=minimum[i];
            }
        }
        return min;
    }
}
