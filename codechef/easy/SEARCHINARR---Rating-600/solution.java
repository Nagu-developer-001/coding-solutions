public static String solve(int N, int X, int[] A) {
    for(int i=0;i<N;i++){
        if(A[i] == X){
            return "YES";
        }
    }    
    return "NO";
}