package collections;

public class CollectionMimic {
   
}

interface CollectionM{
   // Generic operations on elements
}
interface SetM extends CollectionM{
   // non duplicate items
}
interface SortedSetM extends SetM{
   // sorted items with sort order
}
interface ListM extends CollectionM{
   // duplicate items with insertion order
}

class TreeSetM implements SortedSetM{
   
}
