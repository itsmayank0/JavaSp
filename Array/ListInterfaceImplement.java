package Array;

// Defines a class ListInterfaceImplement to implement

// ListInterface methods

public class ListInterfaceImplement<T extends Comparable<T>>

        implements ListInterface<T>

{

    // Creates an object of type generic

    Object arr[] = new Object[5];

    // To point to current position of array

    int current = 0;

    // Adds a new entry to the end of the list.

    public void add(T newEntry)

    {

        // Checks if current position is equals to

        // array length then display error message

        if (current == arr.length)

            System.out.print("\n Insufficient Space");

        // Otherwise add the newEntry at current index

        // position and increase the current counter

        else

            arr[current++] = newEntry;

    }// End of method

    // Retrieves all entries in the list in their current order.

    public void toArray()

    {

        System.out.println();

        // Checks if current position is 0 then display error

        if (current == 0)

            System.out.print("\n Empty list.");

        // Otherwise not empty

        else

        {

            // Loops till current position and display

            // each element

            for (int c = 0; c < current; c++)

                System.out.print(arr[c] + " ");

        } // End of else

    }// End of method

    // Replaces the entry at a given position in the list with a given entry.

    public void replace(int givenPosition, T newEntry)

    {

        // Checks if given position is greater than

        // array length or negative display error message

        if (givenPosition > arr.length || givenPosition < 0)

            System.out.print("\n Invalid position." +

                    givenPosition);

        // Otherwise assigns newEntry to givenPosition

        // of the array

        arr[givenPosition] = newEntry;

    }// End of method

    // Adds a new entry to the list at a given position.

    public void add(int newPosition, T newEntry)

    {

        // Checks if given position is greater than

        // array length or negative display error message

        if (newPosition > arr.length || newPosition < 0)

            System.out.print("\n Invalid position." +

                    newPosition);

        // Otherwise checks if current position is equals to

        // array length then display error message

        else if (current == arr.length)

            System.out.print("\n Insufficient Space");

        // Otherwise valid position

        else

        {

            // Loops till current position to new position

            for (int c = current; c > newPosition; c--)

                // Shift fight

                arr[c] = arr[c - 1];

            // Assigns newEntry to newPosition of the array

            arr[newPosition] = newEntry;

            // Increase the current counter by one

            current++;

        } // End of else

    }// End of method

    // Removes the entry at a given position from the list.

    public void remove(int givenPosition)

    {

        // Checks if given position is greater than

        // current position or negative display error message

        if (givenPosition > current || givenPosition < 0)

            System.out.print("\n Invalid position." +

                    givenPosition);

        // Otherwise valid position

        else

        {

            // Loops from given position to current position

            for (int c = givenPosition; c < current; c++)

                // Shift left

                arr[c] = arr[c + 1];

            // Decrease the current counter by one

            current--;

        } // End of else

    }// End of method

    // Retrieves the entry at a given position in the list.

    public T getEntry(int givenPosition)

    {

        // Checks if given position is greater than

        // array length or negative display error message

        if (givenPosition > arr.length || givenPosition < 0)

        {

            System.out.print("\n Invalid position." +

                    givenPosition);

            return null;

        } // End of if condition

        // Otherwise valid position returns the data

        else

            return (T) arr[givenPosition];

    }// End of method

    // Removes all entries from the list

    public void clear()

    {

        // Loops till current position

        for (int c = 0; c < current; c++)

            // Assigns null to each index position

            arr[c] = null;

        // Reset the current counter to 0

        current = 0;

    }// End of method

    // Sees whether the list contains a given entry.

    public boolean contains(T anEntry)

    {

        // Checks if current counter is 0 then display error message

        if (current == 0)

            System.out.print("\n Empty list.");

        // Otherwise array is not empty

        else

        {

            // Loops till current position

            for (int c = 0; c < current; c++)

                // Checks if current index position value

                // is equals to parameter anEntry

                // return true for found

                if (arr[c] == anEntry)

                    return true;

        } // End of else

        // Returns false for not found

        return false;

    }// End of method

    // Gets the number of entries in the list.

    public int getLength()

    {

        return current;

    }// End of method

    // Sees whether the list is empty.

    public boolean isEmpty()

    {

        return (current == 0);

    }// End of method

    public void resize()

    {
    }

    // main method definition

    public static void main(String[] ss)

    {

        // Creates an object of class ListInterfaceImplement

        // of type integer

        ListInterfaceImplement<Integer> li = new

        ListInterfaceImplement<Integer>();

        // Checks each method

        System.out.print("\n Is empty: " + li.isEmpty());

        System.out.print("\n Adds 10 to list");

        li.add(10);

        System.out.print("\n Is empty: " + li.isEmpty());

        System.out.print("\n Adds 20 to list");

        li.add(20);

        System.out.print("\n Adds 25 at 1 index position.");

        li.add(1, 25);

        System.out.print("\n Adds 30 to list");

        li.add(30);

        System.out.print("\n Current length: " + li.getLength());

        li.toArray();

        System.out.print("\n Removes 9th index position.");

        li.remove(9);

        System.out.print("\n Removes 1st index position.");

        li.remove(1);

        li.toArray();

        System.out.print("\n Replaces 0th position value " +

                "by 55.");

        li.replace(0, 55);

        li.toArray();

        System.out.print("\n Get data at 2nd index position.");

        li.getEntry(2);

        System.out.print("\n Checks the availability of " +

                "value 99 " + li.contains(99));

        System.out.print("\n Checks the availability of " +

                "value 30 " + li.contains(30));

        System.out.print("\n Clears the list.");

        li.clear();

        System.out.print("\n Is empty: " + li.isEmpty());

        System.out.print("\n Current length: " +

                li.getLength());

    }// End of main method

}// End of class