public class DateTest {
    
    int month;
    int day;
    int year;

    DateTest(int month,int day,int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //Getter and Setter Methods.
    void setMonth(int month)
    {
        this.month = month;
    }
    void setDay(int day)
    {
        this.day = day;
    }
    void setYear(int year)
    {
        this.year = year;
    }

    int getMonth()
    {
        return month;
    }
    int getDay()
    {
        return day;
    }
    int getYear()
    {
        return year;
    }

    void displayDate()
    {
        System.out.println("Date: " + month + "/" + day + "/" + year);
    }


    public static void main(String[] args)
    {
        DateTest dt = new DateTest(7, 9, 24);
        dt.displayDate();
        System.out.println(dt.getDay());
        dt.setDay(5);
        System.out.println(dt.getDay());
    }

}
