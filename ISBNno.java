# ISBNNUmber
public class ISBNno{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int mod=0;
int y=0;
int output=0;
while(s>0){
mod=s%10;
output+=mod*y;
s=s/10;
y++;
}
if(output%11==0){
System.out.println("the number is an ISBN number");
}
else{
System.out.println("the number is not an ISBN number");
}
}
}
