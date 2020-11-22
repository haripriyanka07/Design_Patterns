package com.designprinciples;

import java.util.ArrayList;
import java.util.List;

class Access implements Cloneable{
    private List<String> accessList;
    public Access(){
        this.accessList = new ArrayList<String>();
    }
    public Access(List<String> list){
        this.accessList = list;
    }
    public void addAccess(){
        accessList.add("Door");
        accessList.add("windows");
//        accessList.add("rooms");
    }
    public List<String> getAccessList(){
        return this.accessList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<String>();

        for(String s : this.getAccessList()){
            list.add(s);
        }
        return new Access(list);
    }
}

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException{
        Access Owner = new Access();
        Owner.addAccess();
        Access Worker = (Access) Owner.clone();
        List<String> accesslist = Worker.getAccessList();
        Owner.getAccessList().add("room");
        System.out.println(Owner.getAccessList());
        System.out.println(Worker.getAccessList());
        System.out.println(accesslist);

        accesslist.remove("windows");
        System.out.println(accesslist);

    }

}
