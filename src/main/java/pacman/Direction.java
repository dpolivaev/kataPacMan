package pacman;

enum Direction {
    UP, DOWN;

    public Direction invert() {
        return this == UP ? DOWN : UP;
    }
}