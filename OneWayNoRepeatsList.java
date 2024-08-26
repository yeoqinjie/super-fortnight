public class OneWayNoRepeatsList
{
    public static int START_POSITION = 1;
    public static int DEFAULT_SIZE = 50;

    private int countOfEntries; 
    private String[] entry;

    public OneWayNoRepeatsList(int maximumNumberOfEntries)
    {
        entry = new String[maximumNumberOfEntries];
        countOfEntries = 0;
    }

    public OneWayNoRepeatsList()
    {
        entry = new String[DEFAULT_SIZE];
        countOfEntries = 0;
        // or replace these two statements with this(DEFAULT_SIZE);
    }

    public boolean isFull()
    {
        return countOfEntries == entry.length;
    }

    public boolean isEmpty()
    {
        return countOfEntries == 0;
    }

    public void addItem
    (
        String item
    )
    {
        if (!isOnList(item))
        {
            if (countOfEntries == entry.length)
            {
                System.out.println("Attempt to add to a full list!");
                System.exit(0);
            }
            else
            {
                entry[countOfEntries] = item;
                countOfEntries++;
            }
        } 
    }

    public String getEntryAt
    (
        int position
    )
    {
        String result = null;
        if ((1 <= position) && (position <= countOfEntries))
            result = entry[position - 1];
        return result;
    }

    public boolean atLastEntry
    (
        int position
    )
    {
        return position == countOfEntries;
    }

    public boolean isOnList
    (
        String item
    )
    {
        boolean found = false;
        int i = 0;
        while (!found && (i < countOfEntries))
        {
            if (item.equalsIgnoreCase(entry[i]))
                found = true;
            else
                i++;
        }
        return found;
    }

    public int getMaximumNumberOfEntries()
    {
        return entry.length;
    }

    public int getNumberOfEntries()
    {
        return countOfEntries;
    }

    public void eraseList()
    {
        countOfEntries = 0;
    }
}