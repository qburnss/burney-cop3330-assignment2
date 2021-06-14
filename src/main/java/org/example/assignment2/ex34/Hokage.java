package org.example.assignment2.ex34;

import java.util.ArrayList;

public class Hokage {
    private ArrayList<String> list = new ArrayList<>();

    public void create() {
        this.list.add("Minato Namakaze");
        this.list.add("Naruto Uzumaki");
        this.list.add("Hiruzen Sarutobi");
        this.list.add("Tobirama Senju");
        this.list.add("Hashirama Senju");
    }

    public void print() {
        System.out.printf("%nThere are %d Hokage: %n", this.list.size());
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i));
        }
    }
    public String remove(String Hokage) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).equals(Hokage)) {
                String output = String.format("The Will of Fire continues, %s.", this.list.get(i));
                this.list.remove(i);
                return output;
            }
        }
        return "Unable to find Hokage to remove.";
    }
}
