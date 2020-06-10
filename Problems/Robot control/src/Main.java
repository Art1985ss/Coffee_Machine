

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        goToX(robot, toX);
        goToY(robot, toY);
    }

    private static void goToX(Robot robot, int toX) {
        int x = toX - robot.getX();
        if (x == 0) {
            return;
        }
        switch (robot.getDirection()) {
            case UP:
                if (x > 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (x > 0) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (x > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (x < 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            default:
        }
        moveForward(robot, x);
    }

    private static void goToY(Robot robot, int toY) {
        int y = toY - robot.getY();
        if (y == 0) {
            return;
        }
        switch (robot.getDirection()) {
            case UP:
                if (y < 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            case DOWN:
                if (y > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if (y > 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (y > 0) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            default:
        }
        moveForward(robot, y);
    }

    private static void moveForward(Robot robot, int steps) {
        for (int i = 0; i < Math.abs(steps); i++) {
            robot.stepForward();
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}