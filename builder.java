package com.designprinciples;

class Control{
    private String MainDoor;
    private String Window;
    //    optional
    private String Room;

    public String getMainDoor() {
        return "Main Door : "+this.MainDoor;
    }
    public String getWindow() {
        return "Window : "+this.Window;
    }
    public String getRoom() {
        return "Room : "+this.Room;
    }

    public Control(ControlBuilder builder){
        this.MainDoor = builder.MainDoor;
        this.Window = builder.Window;
        this.Room = builder.Room;

    }
    public static class ControlBuilder{
        private String MainDoor;
        private String Window;

        private String Room;

        public ControlBuilder(String mainDoor, String window) {
            MainDoor = mainDoor;
            Window = window;
        }
        public ControlBuilder setRoom(String room) {
            Room = room;
            return this;
        }
        public Control build(){
            return new Control(this);
        }
    }
}

public class builder {
    public static void main(String[] args) {
        Control owner = new Control.ControlBuilder("Access", "Access").setRoom("Access").build();
        Control worker = new Control.ControlBuilder("Access", "Access").build();

        System.out.println("Owner");
        System.out.println(owner.getMainDoor());
        System.out.println(owner.getWindow());
        System.out.println(owner.getRoom());
        System.out.println("Worker");
        System.out.println(worker.getMainDoor());
        System.out.println(worker.getWindow());
        System.out.println(worker.getRoom());


    }
}
