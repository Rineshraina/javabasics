package basic;

public class Emergency {
String name;
String  phnnumber;
String location;
String time;
static String type;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhnnumber() {
	return phnnumber;
}
public void setPhnnumber(String phnnumber) {
	this.phnnumber = phnnumber;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getType() {
	return type;
}
public  String setType(String type) {
	Emergency.type = type;
	return type;
}
public String solve()
{
	switch(type)
	{
	case "crime":
		return "police";

	case "injury":
		return "ambulance";
	case "fire":
	 return "fireengine";
		default:
			return "nomessage";
	}
	
}
public static void main(String args[])
{
	Emergency e=new Emergency();
	e.setName("SRV matric school");
	e.setPhnnumber("04522252252");
	e.setLocation("school");
	e.setTime("11.00am");
	e.setType("injury");
	//System.out.println("the method is " +e.solve());
	System.out.println(e.getName());
	System.out.println(e.getPhnnumber());
	System.out.println(e.getLocation());
	System.out.println(e.getTime());
	System.out.println(e.getType());
	System.out.println("the method is " +e.solve());
	
	
}

}