package com.slam.dunk.structure.facade;

import com.alibaba.fastjson.JSON;
import com.slam.dunk.structure.composite.DistrictNode;
import com.slam.dunk.structure.composite.LeafNode;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class SendService {

    /**
     * send package
     */
    public void doSend() {
        //root node
        DistrictNode root = new DistrictNode("root");

        //first level
        root.addChild(new DistrictNode("ShangHai"));
        root.addChild(new DistrictNode("Tianjin"));
        DistrictNode districtNode = new DistrictNode("Beijing");
        root.addChild(districtNode);

        //second level
        districtNode.addChild(new DistrictNode("Haidian District"));
        districtNode.addChild(new DistrictNode("Xicheng District"));
        DistrictNode districtNode2 = new DistrictNode("Zhaoyang District");
        districtNode.addChild(districtNode2);

        //third level
        districtNode2.addChild(new LeafNode("sanli tun"));
        districtNode2.addChild(new LeafNode("zhaoyang men"));

        System.out.println("please select the destination: " + JSON.toJSON(root));
        //the destination
        System.out.println("the destination is :");
    }

    public void doOther() {
        System.out.println("other services");
    }
}
