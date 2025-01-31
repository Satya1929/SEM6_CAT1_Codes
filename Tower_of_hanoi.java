class Tower_of_hanoi {

    public static int totalMoves = 0;

    public static void solveHanoi(int n, char from, char to, char aux) {
        if (n == 0) return;

        solveHanoi(n - 1, from, aux, to);         // actual visual sequence

        totalMoves++;
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);        

        solveHanoi(n - 1, aux, to, from);        // Swap outer ones , keep mid same
    }

    public static void main(String[] args) {
        int N = 3;
        //from,aux,to = A,B,C
        solveHanoi(N, 'A', 'C', 'B');
        System.out.println("Total moves: " + totalMoves);
    }
}
