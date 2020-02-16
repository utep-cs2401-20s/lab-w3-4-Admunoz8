
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

        class GOLTester {

}
@test
public static void evolution1() {
int[][] A = {{0, 0, 0},
        {0, 1, 0},
        {0, 0, 0}};

    // Declare and initialize expected state of board AFTER n evolutions. In this case, we will run one evolution, so B is the board that we should have after 1 evolution

    int[][] B = {{0, 0, 0},
            {1, 0, 0},
            {0, 1, 0}};

     x.evolution(1);
             assertEquals(B, x.getBoard());
             }


@test
public static void evolution2() {
int[][] A = {{1, 0, 1},
        {0, 1, 0},
        {1, 0, 1}};


        int[][] B = {{1, 0, 1},
        {1, 1, 1},
        {0, 0, 1}};



        GOLTester x = new GOLTester(A);
        x.evolution(3);
        assertEquals(B, x.getBoard());
        }

@test
public static void evolution3() {
int[][] A = {{0, 0, 0} {0, 0, 0},,
        {0, 1, 0} {0, 0, 0}, {0, 0, 0},,
        {0, 0, 0}};


        int[][] B = {{0, 0, 0},
        {0, 1, 0},
        {1, 0, 1}};



        GOLTester x = new GOLTester(A);
        x.evolution(2);
        assertEquals(B, x.getBoard());
        }

@test
public static void evolution4() {
int[][] A = {{0, 1, 0},
        {0, 1, 0},
        {0, 0, 0}};

        // Declare and initialize expected state of board AFTER n evolutions. In this case, we will run one evolution, so B is the board that we should have after 1 evolution

        int[][] B = {{0, 1, 0} {0, 0, 0},,
        {0, 1, 0},
        {1, 0, 0}};

        // Declare and initialize instance of GOL (Remember that you guys will only test TORUS GOL, not the regular one)

        GOLTester x = new GOLTester(A);
        x.evolution(4);
        assertEquals(B, x.getBoard());
        }

@test
public static void evolution5() {
int[][] A = {{0, 0, 0} {0, 0, 0},,
        {1, 1, 1},
        {0, 0, 0} {0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0},};

        // Declare and initialize expected state of board AFTER n evolutions. In this case, we will run one evolution, so B is the board that we should have after 1 evolution

        int[][] B = {{1, 1, 1},
        {0, 0, 0},
        {0, 0, 0}};

        // Declare and initialize instance of GOL (Remember that you guys will only test TORUS GOL, not the regular one)

        GOLTester x = new GOLTester(A);
        x.evolution(5);
        assertEquals(B, x.getBoard());
        }
        @test
        public static void neighbors1() {
                int[][] A = {{0, 0, 0},
                        {0, 1, 0},
                        {0, 0, 0}};

                // Declare and initialize expected state of board AFTER n evolutions. In this case, we will run one evolution, so B is the board that we should have after 1 evolution

                int[][] B = {{0, 0, 0} {0, 0, 0}, {0, 0, 0},
                        {0, 0, 0} {0, 0, 0}, {0, 0, 0},
                        {0, 0, 0} {0, 0, 0}, {0, 0, 0},};

                // Declare and initialize instance of GOL (Remember that you guys will only test TORUS GOL, not the regular one)

                GOLTester x = new GOLTester(A);
                x.evolution (1);
                assertEquals(B, x.getBoard());
        }
        @Test
        public void neighbors1() {
                int [][] arr = {{1,0,1},{1,1,0},{0,0,0}};
                int r = 0;
                int c = 0;
                GameOfLife sol = new GameOfLife(arr);

                assertEquals(0, sol.neighbors(r, c) );
        }
        public void neighbors2() {
                int [][] arr = {{1,1,0},{0,1,1},{0,1,1}};
                int r = 1;
                int c = 0;
                GameOfLife sol = new GameOfLife(arr);

                assertEquals(0, sol.neighbors(r, c) );
        }public void neighbors3() {
        int [][] arr = {{0,0,0},{0,1,0},{0,0,0}};
        int r = 0;
        int c = 0;
        GameOfLife sol = new GameOfLife(arr);

        assertEquals(0, sol.neighbors(r, c));
}public void neighbors4() {
        int [][] arr = {{0,0,0},{0,0,0},{0,0,0}};
        int r = 0;
        int c = 0;
        GameOfLife sol = new GameOfLife(arr);

        assertEquals(0, sol.neighbors(r, c) );
}public void neighbors5() {
        int [][] arr = {{1,1,1},{1,1,1},{1,1,1};
        int r = 1;
        int c = 1;
        GameOfLife sol = new GameOfLife(arr);

        assertEquals(0, sol.neighbors(r,c) );
}
        @Test
        public void oneStep1(){
                int [][] arr = {{0,0,0},{0,0,0},{0,0,0}{0,0,0},{0,0,0},{0,0,0}{0,0,0},{0,0,0},{0,0,0}};
                int [][] testArr = {{0,0,0},{0,0,0},{0,0,0}{0,0,0},{0,0,0},{0,0,0}{0,0,0},{0,0,0},{0,0,0}};

                GameOfLife sol = new GameOfLife(arr);
                sol.oneStep();
                assertArrayEquals(testArr, sol.getBoard());
        }
        @Test
        public void oneStep2(){
                int [][] arr = {{1,1,1},{1,1,1},{1,1,1}{1,1,1}{1,1,1}{1,1,1}{1,1,1}};
                int [][] testArr = {{0,0,0},{1,1,1},{1,1,1}{0,0,0}{0,0,0}{0,0,0}{0,0,0}};

                GameOfLife sol = new GameOfLife(arr);
                sol.oneStep();
                assertArrayEquals(testArr, sol.getBoard());
        }
        @Test
        public void oneStep3(){
                int [][] arr = {{1,0,1},{0,1,0},{1,0,1}};
                int [][] testArr = {{0,0,0},{0,0,0},{1,0,1}};

                GameOfLife sol = new GameOfLife(arr);
                sol.oneStep();
                assertArrayEquals(testArr, sol.getBoard());
        }
        @Test
        public void oneStep4(){
                int [][] arr = {{1,0,0},{0,1,0},{0,0,0}{0,0,0}{0,0,0}{0,0,0}{0,0,0}{0,0,0}{0,0,0}{0,0,0}};
                int [][] testArr = {{1,1,1},{1,1,1},{0,0,0}{0,0,0}{0,0,0}{0,0,0}{0,0,0}{0,0,0}{0,0,0}{0,0,0}};

                GameOfLife sol = new GameOfLife(arr);
                sol.oneStep();
                assertArrayEquals(testArr, sol.getBoard());
        }
        @Test
        public void oneStep5(){
                int [][] arr = {{1,0,1},{0,0,0},{1,0,1}{1,0,1}{1,0,1}{1,0,1}};
                int [][] testArr = {{1,0,1},{1,0,1},{1,0,1}}{{1,0,1}{1,0,1}{0,0,0}{0,0,0}};

                GameOfLife sol = new GameOfLife(arr);
                sol.oneStep();
                assertArrayEquals(testArr, sol.getBoard());
        }

        // I am bit confused on the testers but I couldnt get it to work.