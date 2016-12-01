public class MergeSort {
	

    public static void main(String args[]){
       int arrayEntrada[]={1, 3, 5, 8, 7, 4, 5, 9}; //Este es el array de elementos que vamos a ordenar

       mergeSort(arrayEntrada); //llamada al metodo mergeSort 
       for (int i=0;i < arrayEntrada.length;i++){ //Este bucle imprime el contenido del array
          System.out.print(arrayEntrada[i]+" ");
       }//fin del for
     }//fin del main
     
    public static void mergeSort( int a[ ]){
        int tmpArray[] = new int[ a.length ];

        mergeSort( a, tmpArray, 0, a.length - 1 );
    }
    private static void mergeSort( int a[ ], int tmpArray[],int left, int right ){
        if( left < right )
        {
            int center = ( left + right ) / 2;
            mergeSort( a, tmpArray, left, center );
            mergeSort( a, tmpArray, center + 1, right );
            merge( a, tmpArray, left, center + 1, right );
        }
    }

    private static void merge( int a[ ],int tmpArray[],int leftPos, int rightPos, int rightEnd){
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd ){
            if( a[ leftPos ]<( a[ rightPos ] ) ){
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            }
            else{
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];
            }
        }
        while( leftPos <= leftEnd ){    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];
        }
        while( rightPos <= rightEnd ){  // Copy rest of right half
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];
        }
        // Copy TmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- ){
            a[ rightEnd ] = tmpArray[ rightEnd ];
        }
    }
}