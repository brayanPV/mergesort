/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author stive
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MergeSort ms = new MergeSort();
        int[] a = new int[10];
        ms.llenarArray(a);
        System.out.println("ORDENAR");
        ms.mergeSort(a, 0, 9);
        ms.mostrarArray(a);
    }
    //EL OBJETIVO ES USAR EL METODO DE ORDENAMIENTO LLAMADO MERGESORT
    //THE OBJETIVE IS TO USE THE ORDERING METHOD CALLED MERGESORT 
    public void mergeSort(int[] a, int ini, int fin){
        if(ini>=fin) return;
        int m=(ini+fin)/2;
        mergeSort(a, ini, m);
        mergeSort(a,m +1, fin);
        merge(a, ini, m, fin);
    }

    private void merge(int[] a, int ini, int m, int fin) {
       int b[] = new int[fin-ini+1];
       int i,j,k;
       i=ini;
       j=m+1;
       k=0;
       while(i<=m && j<=fin){
           if(a[i] < a[j]){
               b[k] = a[i];
               i=i+1;
           }else{
               b[k] = a[j];
               j=j+1;
           }
           k=k+1;
       }
       while(i<=m){
           b[k] = a[i];
           i=i+1;
           k=k+1;
       }
       while(j<=fin){
           b[k] = a[j];
           j=j+1;
           k=k+1;
       }
       i=ini;
       k=0;
       while(i<=fin){
           a[i]=b[k];
           i=i+1;
           k=k+1;
       }
    }
    //ENTERING VALUES TO ARRAY
    public void llenarArray(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = (int) Math.floor(Math.random()*100);
            System.out.println("A en " + i + " = " + a[i]);
        }
    }
    //SHOW THE ARRAY
    public void mostrarArray(int[] a){
        for(int i =0; i<a.length;i++){
            System.out.println("A en " + i + " = " + a[i]);
        }
    }
    
    
    
    
}
