class mother
{
    void beating(){
        System.out.println("Mother like beating");
    }
}
class Brother extends mother
{
    void studying(){
        System.out.println("Brother like studying");
    }
}
class Me extends mother
{
    void coding(){
        System.out.println("I like coding");
    }
}
class program
{
   public static void main(String[] args) {
    Me a=new Me();
    Brother b=new Brother();
    a.beating();
    b.studying();
   }
}