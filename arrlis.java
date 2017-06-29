class arrlis
{
    int id,qty;
    String book_name,author_name;

    public arrlis(int id,int qty,String book_name,String authorname)
    {
        this.id=id;
        this.qty=qty;
        this.book_name=book_name;
        this.author_name=author_name;
    }
    public void setBookName(String book_name)
    {
        this.book_name=book_name;
    }
    public String getBookName()
    {
        return book_name;
    }
    public String toString()
    {
        return "id: "+id+" Book name: "+book_name+" Author name: "+author_name+" Quantity: "+qty;
    }
}