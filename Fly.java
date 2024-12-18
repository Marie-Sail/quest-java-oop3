public interface Fly{

void takeOff();

int ascend(int altitude);

int descend(int altitude);

default void glide() {
    System.out.println("It glides into the air.");
}

void land();

}