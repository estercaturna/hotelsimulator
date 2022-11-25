package hotelsimul;

public class Room {
        private int key;
        private boolean available = true;

        public int getKey() {
            return key;
        }
        public Room(int key){
            this.key = key;
        }

        public boolean isAvailable() {
            return available;
        }

        public void changeAvaile() {
            if (available == true){
                available = false;
            } else {
                 available = true;
            }
        }
}
