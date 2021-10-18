package Array;

// Defines an interface ListInterface of type generic

public interface ListInterface <T>

{

// Adds a new entry to the end of the list.

void add(T newEntry);

// Adds a new entry to the list at a given position.

void add(int newPosition, T newEntry);

// Removes the entry at a given position from the list.

void remove(int givenPosition);

// Removes all entries from the list

void clear();

// Replaces the entry at a given position in the list

// with a given entry.

void replace(int givenPosition, T newEntry);

// Retrieves the entry at a given position in the list.

T getEntry(int givenPosition);

// Retrieves all entries in the list in their current order.

void toArray();

// Sees whether the list contains a given entry.

boolean contains(T anEntry);

// Gets the number of entries in the list.

int getLength();

// Sees whether the list is empty.

boolean isEmpty();

// method is required to resize the array to twice

// its current size when needed.

void resize ();

}// End of interface