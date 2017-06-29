
class Book1
{
private int id;
private String name, author, publiser;
private int quantity;
void setValue(int id,String name,String author,String publiser,int quantity)
{
    this.id=id;
    this.name=name;
    this.author=author;
    this.publiser=publiser;
    this.quantity=quantity;
}

public String toString() {
return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity;
}

public static void main(String args[])
{
    Book1 b1=new Book1();
    b1.setValue(1,"hemanth","hema","technical",5);
    Book1 c=b1;
    System.out.println(b1);
    System.out.println(c);
}
}