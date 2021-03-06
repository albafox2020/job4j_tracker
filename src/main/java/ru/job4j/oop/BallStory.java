package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        WolfKolobok wolf = new WolfKolobok();
        Fox fox = new Fox();
        hare.tryEat(ball);
        ball.run(hare);
        wolf.tryEat(ball);
        ball.run(wolf);
        fox.tryEat(ball);
        ball.wasKilld(fox);
    }
}
