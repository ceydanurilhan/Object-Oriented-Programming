public enum Book{
    JHTP("Java How To Ppgram","2012"),
    CHTP("C How To Program","2007"),
    IW3HTP("Internet & World Wide Web How To Program ","2008"),
    CPPHTP("C++ How To Program","2012"),
    VBHTP("Visual Basic 2011 How To Program","2011"),
    CSHARPHTP("Visual C# 2010 How To Program","2010");

    private final String title;
    private final String copyrightYear;

    Book(String bookTitle,String year){
        title=bookTitle;
        copyrightYear=year;
    }
    public String getTitle(){
        return title;
    }
    public String getCopyrightYear(){
        return copyrightYear;
    }

}
