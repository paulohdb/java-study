class Matriz {
    int n,m;
    double [][] M;
  
  
    Matriz(double [][] valores) {
      // copiar valores pra M
      // e tambem setar n e m
      copiaMatriz(valores);
    }
  
    Matriz(int n_, int m_) {
      n = n_;
      m = m_;
  
      M = new double[n][m];
    }
  
    void copiaMatriz(double [][] valores) {
      M = valores;
  
      n = valores.length;
      m = valores[0].length;
    }
  
    boolean ehQuadrada() {
      return n == m;
    }
  
    void imprimeMatriz() {
      for (int i = 0 ; i < n ; i++) 
        for (int j = 0 ; j < m ; j++)  {
          if (j != m-1) 
            System.out.print(M[i][j] + " ");
          else
            System.out.println(M[i][j]);
      }
    }
  
    Matriz somaMatriz(Matriz B) {
      if ( n != B.n || m != B.m )
        return null;
  
      
      Matriz C = new Matriz(n, m);
  
      for (int i = 0 ; i < n ; i++) 
        for (int j = 0 ; j < m ; j++) 
          C.M[i][j] = M[i][j] + B.M[i][j];
      return C;
    }
  
    Matriz multiplicaMatriz(Matriz B) {
      if ( this.m != B.n )
        return null;
  
      // matriz resultante tamanho n por B.m
      Matriz C = new Matriz(this.n, B.m);
  
      for (int i = 0 ; i < this.n ; i++) 
        for (int j = 0 ; j < B.m ; j++) 
          for (int k = 0 ; k < this.m ; k++)
            C.M[i][j] += this.M[i][k] * B.M[k][j];
      return C;
    }
  }
  