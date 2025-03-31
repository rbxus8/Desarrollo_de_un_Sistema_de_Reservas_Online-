
class Cola {
    // public Cola() { }
    
    
    
    public void MostrarPila() {
        Console.WriteLine("Programa para mostrar una pila");
        string datos = string.Empty;

Stack<string> pila = new Stack<string>();

pila.Push("Maria");
pila.Push("Ana");
pila.Push("Sandra");
pila.Push("Claudia");
pila.Push("Marcela");




foreach (string s in pila) {
     Console.WriteLine("Persona Pendiente = " + s);
}
 
// Push - Apilar // Pop - Desapilar
 
Console.ReadLine ();

datos = pila.Pop();
Console.WriteLine("Persona Atendida " + datos);
 


foreach(string s in pila) {
     Console.WriteLine("Persona Pendiente = " + s);
}

Console.ReadLine ();

datos = pila.Pop();
Console.WriteLine("Persona Atendida " + datos);
datos = pila.Pop();
Console.WriteLine("Persona Atendida " + datos);

Console.ReadLine();

foreach(string s in pila) {
     Console.WriteLine("Persona Pendiente = " + s);
}
 
//Int cantidad = pila.Count;

//for(int i = 0; i < cantidad; i++) {
//    Console.WriteLine("Cantidad = " + i + " pila.Count);
//    datos = pila.Pop();
//    Console.WriteLine("Valor " + datos);
//}
//
    }

    public void MostrarCola() {

        Console.WriteLine("Programa para Mostrar una Cola");
        Console.WriteLine("Programa para Mostrar una Cola");

Queue<int> cola = new Queue<int>();
cola.Enqueue(500);
cola.Enqueue(300);
cola.Enqueue(200);
cola.Enqueue(100);

// Enqueue - Agregar a la Cola // Dequeue - Eliminar el elemento de la cola

foreach(int i in cola){
    Console.WriteLine("Valor = " + i);
}

   Console.ReadLine();

   int datos = 0;

   datos = cola.Peek();
   Console.WhiteLine ("Valor a E liminar de la cola" + datos);

   cola.Dequeue ();

 Console.ReadLine();

   foreach(int i in cola){
    Console.WriteLine("Valor = " + i);
}

 Console.ReadLine();

    }
}