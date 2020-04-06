package com.slam.dunk.structure.adapter;


import com.slam.dunk.entity.bag.AppleBag;
import com.slam.dunk.entity.bag.OrangeBag;
import com.slam.dunk.entity.fruit.Orange;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class AdapterClient {
    public static void main(String[] args) {
        Orange orange = new Orange("peter", 100);
        OrangeBag bag = getBag2();
        orange.pack(bag);
    }


//	private static OrangeBag getBag(){
//		OrangeBag bag = new OrangeBag();
//		return bag;
//	}

    /**
     * use the apple bag as the orange bag
     *
     * @return
     */
    private static OrangeBag getBag2() {
        //prepare the apple bag
        AppleBag appleBag = new AppleBag();

        //adapt the apple bag as the orange bag
        OrangeBag orangeBag = new OrangeBagAdapter(appleBag);

        return orangeBag;
    }
}
