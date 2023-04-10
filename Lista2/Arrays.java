class Arrays {
    int[] arr;

    Arrays(int n) {
        arr = new int [n];
        for (int i = 0; i < arr.length; i++) { 
                arr[i] = -1;
            }
    }

    Arrays(int n, int v) {
        arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = v;
            }
    }

    int somaValores() {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) { 
                temp += arr[i];
            }
        return temp;
    }

    void resetaArray() {

        for (int i = 0; i < arr.length; i++) { 
                arr[i] = 0; 
        }
    }
}

