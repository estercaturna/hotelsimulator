package hotelsimul;

import hotelsimul.Room;

public class Hotel {
        private String name;
        private Room[] rooms;
        private int customerKey;
        //private hotelsimul.Customer[] customers;
    public Hotel(String name,int rooms) {
        this.name = name;
        this.rooms = new Room[rooms];
        //this.customers = new hotelsimul.Customer[rooms];

        for(int i =0; i < this.rooms.length; i++) {
            //Atribuir uma chave a cada quarto.
            this.rooms[i] = new Room(i +1);

        }

    }
        public void checkIn(Customer customer) {
            //Verificar a disponibilidade de cada quarto e dar chave.
            //Dar a chave do quarto se tiver disponibilidade.
            for(int i =0; i < rooms.length; i++){
                if(rooms[i].isAvailable()){
                    customer.setCustomKey(i +1);
                    rooms[i].changeAvaile();
                }
            }
            System.out.println(customer.getName()+ ": Welcome to the "+this.name);

        }


        public void checkOut(Customer customer){
            //Entegar a chave
            //mudar dispon do quarto
            //Verificar se o cliente tem checkin
        if(customer.getCustomKey() == 0) {
            System.out.println(customer.getName() +": You're not checked in.");
            }
        else {
            for(int i =0; i < rooms.length; i++){
                if(rooms[i].isAvailable() == false) {
                    customer.setCustomKey(0); //altera o customerKey
                    rooms[i].changeAvaile();
                }
            }
        }
        }



}
