package last_task;

import java.util.Random;

public class Management {

    private last_task.Duck duck1;
    private last_task.Duck duck2;
    private last_task.Duck duck3;

    public Management() {
        duck1 = new last_task.Duck();
        duck2 = new last_task.Duck();
        duck3 = new last_task.Duck();
    }
    static int[][] lake = {
            {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}
    }; //lake를 따로 만들 필요 없이 클래스변수로 빼 놓자.
    public void printLake() {
        //오리 좌표 찍기
        lake[duck1.getY()][duck1.getX()] = 2;
        lake[duck2.getY()][duck2.getX()] = 2;
        lake[duck3.getY()][duck3.getX()] = 2;

        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                System.out.print(lake[i][j]); // 출력 프로세스
            }
            System.out.println(); //물은 1, 땅은 0, 오리는 2로 표현 (일단)
        }
    }


    public void showAllDuckInfo() {
        System.out.printf("Duck no.1 :(%d, %d) / %s\n", duck1.getX(), duck1.getY(), duck1.getStatus());
        System.out.printf("Duck no.2 :(%d, %d) / %s\n", duck2.getX(), duck2.getY(), duck2.getStatus());
        System.out.printf("Duck no.3 :(%d, %d) / %s\n", duck3.getX(), duck3.getY(), duck3.getStatus());
        System.out.println();
    }

    public void randomPositionGenerator() {
        Random random = new Random();
        duck1.setX(random.nextInt(16));
        duck1.setY(random.nextInt(6));
        duck2.setX(random.nextInt(16));
        duck2.setY(random.nextInt(6));
        duck3.setX(random.nextInt(16));
        duck3.setY(random.nextInt(6));

    } //랜덤 값을 받아와서 저장
}