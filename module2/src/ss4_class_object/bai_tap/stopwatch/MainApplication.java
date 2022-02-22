package ss4_class_object.bai_tap.stopwatch;

public class MainApplication {
    public static void main(String[] args) {
        double[][] twoDimensionArrs = {
                {1, 2, 3, 4, 5, 7},
                {2, 3, 5, 6, 7, 9},
                {1, 2, 3, 4, 5, 7},
                {2, 3, 4, 7, 7, 9},
                {1, 2, 3, 4, 5, 7},
                {2, 3, 4, 6, 7, 9}
        };
        double sum = 0;
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        System.out.println("Start calculate at " + stopWatch.getStartTime());
        for (int i = 0; i < twoDimensionArrs.length; i++) {
            for (int j = 0; j < twoDimensionArrs[i].length; j++) {
                sum += twoDimensionArrs[i][j];
                try {
                    sum += twoDimensionArrs[i][j];
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        stopWatch.stop();
        System.out.println("End calculate at " + stopWatch.getEndTime());
        System.out.println("Sum of elements of array: " + sum);
        System.out.println("Time Taken by calculate sum of 2 dimension array: " + stopWatch.getElapsedTime());
    }
}
