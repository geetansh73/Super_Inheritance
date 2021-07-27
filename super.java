class parent
{
String name;
}
class Child extends parent
{
String name;
void details()
{
super.name="parent";
name="child";
System.out.print(super.name);
System.out.print(name);
}
}



class super
{
public static void main(String geetu[])
{
Child obj=new Child();
obj.details();
}
}
