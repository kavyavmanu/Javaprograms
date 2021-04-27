class StudentMark{
public static void main(String[] args)
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int sum=a+b+c;
char result='p';
if(a<40){
result='f';
}
if(b<40)
{
result='f';
}
if(c<40){
result='f';
}
if(sum<125){
result='f';
}
if(result=='p')
{
System.out.println("Student has passed");
}
else
{
System.out.println("Student has failed");
}
}
}
