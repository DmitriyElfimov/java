// программа, которая из имеющегося массива строк формирует 
// новый массив из строк, длина которых меньше, либо равна 3 символам.

Console.Write("Введите кол-во элементов массива: ");
int size = Convert.ToInt32(Console.ReadLine());

string[] FillArray(int size)
{
    string[] arr = new string[size];

    for (int i = 0; i < arr.Length; i++)
    {
        Console.Write("Введите элемент массива: ");
        arr[i] = Console.ReadLine();
    }
    return arr;
}

string[] array = FillArray(size);
Console.WriteLine($"[{string.Join(", ", array)}]");

