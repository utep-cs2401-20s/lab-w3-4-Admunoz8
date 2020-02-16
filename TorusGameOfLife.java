
public class TorusGameOfLife extends GameOfLife{

// This is extending the constructors. It also inherits the methods.

// I had to change the neighbors part. I used a modulus.
    public int neighbors(int r, int c) {
        int Top = 0, Bottom = 0, Right = 0, Left = 0, TopLeft = 0, TopRight = 0, BottomLeft = 0, BottomRight = 0;

        Top = previous[(r - 1) % size][(c) % size];

        Bottom = previous[(r + 1) % size][(c) % size];

        Right = previous[(r) % size][(c + 1) % size];

        Left = previous[(r) % size][(c - 1) % size];

        TopLeft = previous[(r - 1) % size][(c - 1) % size];

        TopRight = previous[(r - 1) % size][(c + 1) % size];

        BottomLeft = previous[(r + 1) % size][(c) % size];

        BottomRight = previous[(r + 1) % size][(c + 1) % size];
        int neighbors = Top + Bottom + Right + Left + TopLeft + TopRight + BottomLeft + BottomRight;
        return neighbors;


    }
    }

