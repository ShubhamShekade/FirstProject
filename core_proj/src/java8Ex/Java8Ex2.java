package java8Ex;
import java.util.*;
import java.util.stream.*;
class EInfo
{
int id;
String name;
float sal;

EInfo(int id,String name,float sal)
{
this.id=id;
this.name=name;
this.sal=sal;
}
}
public class Java8Ex2 {



public static void main(String[] args) {
List l=new ArrayList();
l.add(new EInfo(1,"abc",1234));
l.add(new EInfo(2,"cds",9087));
l.add(new EInfo(3,"zxc",5678));

//System.out.println(l);
Stream <EInfo>st=l.stream();
st.forEach(Einfo->System.out.println(Einfo.id+" "+Einfo.name+" "+Einfo.sal));



}



}