public class Main {
    public static void main(String[] args) {

        AnimalHouse<Fish> fishHouse = new AnimalHouse<Fish>();
        Fish fish = new Fish();
        fish.name = "fish";
        fishHouse.animal = fish;

        AnimalHouse<Snake> snakeHouse = new AnimalHouse<Snake>();
        Snake snake = new Snake();
        snake.length = 10;
        snakeHouse.animal = snake;

    }
}