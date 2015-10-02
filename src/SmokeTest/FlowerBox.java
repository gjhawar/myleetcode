package SmokeTest;

import java.util.ArrayList;

/**
 * Created by gjhawar on 10/1/15.

public class FlowerBox {

    public boolean canPlaceFlowers(ArrayList<Boolean> flowerbed, int numberToPlace) {
        // Implementation here
        if(flowerbed.size() == 1 && flowerbed.get(0)== true)
            return false;
        else if(flowerbed.size() == 1 && flowerbed.get(0)!= true)
            return true;

        if(numberToPlace == 0)
            return true;

        int count = 0;
        for(int i=0; i<flowerbed.size(); i++){
            if(i==0 && flowerbed.size()>1){
                if(flowerbed.get(1)!= true){
                    count+=1;
                }

            }
        }
    }


    public static void main(String args[]){
        FlowerBox fb = new FlowerBox();
        ArrayList flowerbed = new ArrayList<Boolean>();
        for(int i=0;i<10;i++){
            flowerbed.add(i, Math.random() < 0.5);
            System.out.println(flowerbed.get(i));
        }

        fb.canPlaceFlowers(flowerbed, 3);

    }
}
 */