package com.enigma.model;

public class Mobil {
    //cartesian
    private Integer postX;
    private Integer postY;
    //bensin
    private Integer fuel = 0;
    //Variable Move
    private final String FORWARD = "F";
    private final String BACKWARD = "B";
    private final String RIGHT = "R";
    private final String LEFT = "L";
    private char[]commands;

//    private Integer y = 0;
//    private Integer x = 0;

    //method move
    private String move(String movement) {
        switch (movement){
            case FORWARD:
                postY +=1;
                break;
            case RIGHT:
                postX +=1;
                break;
            case LEFT:
                postX -=1;
                break;
            case BACKWARD:
                postY -=1;
                break;
        }
        return "";
    }
    //method x,y
    public Mobil(Integer x, Integer y) {
        this.postX = x;
        this.postY = y;
    }

    public void setCommands(String commands){
        this.commands = commands.toCharArray();
        //System.out.println(this.commands[0]);
    }

    //method isi bensin
    public void setFuel(Integer fuel) {
        this.fuel = this.fuel + fuel;
    }

        public void run(){
            for (int i = 0; i < commands.length ; i++){
                if (fuel==0){ // Jika Bensin o
                    System.out.println("Selamat Mobil Anda Mogok"); // Maka Akan Mogok
                    break; //
                }
                //char command = commands[i];
                move(String.valueOf(commands[i]));
                System.out.println(this.commands[i] + getPosition());;
                if ((i+1)%3== 0){
                    fuel -=1;
                }
            }
    }
        private String getPosition(){
        return"("+this.postX+","+this.postY+")";
    }

    //method mobil carseian bensin
    public String print() {
        return "Mobil{" +
                "postX=" + postX +
                ",postY=" + postY +
                ",fuel=" + fuel +
                '}';

    }
}





