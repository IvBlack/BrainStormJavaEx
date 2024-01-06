package com.IVdev.sortingAlgo;

/*
Алгоритм сортировки методом выбора превосходит пузырьковую сортировку по
характеристикам — количество необходимых перестановок сокращается с O(N^2) до
O(N). Количество сравнений остается равным O(N^2).

В сортировке методом выбора вы последовательно перебираете все элементы и выбираете (отсюда и название)
самого меньшего из них. Этот элемент меняется местами с тем, который стоит в крайней левой позиции (0).
Левый элемент отсортирован, и в дальнейшем уже перемещаться не будет. Обратите внимание: в этом
алгоритме отсортированные элементы собираются слева (нижние индексы), тогда как при пузырьковой сортировке они собираются справа.
Следующий проход начинается с позиции 1, а обнаруженный минимальный элемент меняется местами с элементом в позиции 1.
Процесс продолжается до тех пор, пока не будут отсортированы все элементы (Р.Лафоре)
*/
public class SelectSort {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr = new ArrayBub(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        arr.bubbleSort();
        arr.display();
    }

    int maxSize = 100;
    ArrayBub arr;
    private long[] a;
    private int nElems;
}

class ArraySort
{
    private long[] a;
    private int nElems;
    //-----------------------------------
    public ArraySort(int max)
    {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value)
    {
        a[nElems] = value;
        nElems++;
    }

    public void display()
    {
        for (int j=0; j < nElems; j++)
        {
            System.out.println(a[j] + " ");
            System.out.println("");
        }
    }

    public  void selectSort()
    {
        int out, in, min;

        for(out=0; out<nElems-1; out++)
        {
            min=out;
            for (in=out+1; in<nElems; in++)
            {
                if (a[in] < a[min])
                    min = in;
                swap(out, in);
            }
        }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
