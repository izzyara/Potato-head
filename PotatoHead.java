public class PotatoHead
{ 

//instance variables - to be used in all methods in the class 
private int amntArms;
private String colorEars;
private boolean hat;
private String colorShoes;
private String colorEyes;
private boolean mustache;
private String colorNose;
/*************************************************************************/ 

//constructors 
//default constructor 
public PotatoHead() 
{ 

amntArms = 2;
colorEars = "pink";
hat = true;
colorShoes = "blue";
colorEyes = "blue";
mustache = true;
colorNose = "red";
}


           //give initial values to all the instance variables that are declared as private } 
//initializer/ parameterized constructor 
public PotatoHead ( int a, String e, boolean h, String cs, String ce, boolean m, String cn) 
{ 

amntArms = a;
colorEars = e;
hat = h;
colorShoes = cs;
colorEyes = ce;
mustache = m;
colorNose = cn;

            //set instance variables to parameter values 
} 
/******************************************************/ 

//Accessor Methods 
public int getAmntArms()
{ 
return amntArms; 
} 
public String getColorEars() 
{ 
return colorEars; 
} 
public boolean getHat() 
{ 
return hat; 
} 
public String getColorShoes() 
{ 
return colorShoes; 
} 
public String getColorEyes() 
{ 
return colorEyes; 
} 
public boolean getMustache() 
{ 
return mustache; 
} 
public String getColorNose() 
{ 
return colorNose; 
} 
/**********************************************************************/ 

//mutator methods 
public void setAmntArms(int arms) 
{ 
               amntArms= arms; 
} 
public void setColorEars(String ears) 
{ 
               colorEars = ears; 
} 
public void setHat(boolean ifhat) 
{ 
               hat = ifhat; 
} 
public void setColorShoes(String shoes) 
{ 
               colorShoes = shoes; 
} 
public void setColorEyes(String eyes) 
{ 
               colorEyes = eyes; 
} 
public void setMustache(boolean ifmustache) 
{ 
               mustache = ifmustache; 
} 
public void setColorNose(String nose) 
{ 
               colorNose = nose; 
} 
/********************************************************************/ 

//Other methods 
/*****************************************************/


//toString 
public String toString() 
{ 
return "I have " + amntArms + " arms, " + colorEars + " ears, " + "I have a hat: " + hat + ", my shoes are " + colorShoes + ", " + colorEyes + " eyes," + " I have a mustache: " + mustache + ", my nose is " + colorNose; } 
/*****************************************************/ //main method 
public static void main (String [] args) 
{ 
PotatoHead jim = new PotatoHead();
PotatoHead bob = new PotatoHead(2,"pink",true,"blue","blue",true,"red");



String i = bob.getColorEars();

jim.setAmntArms(1);
jim.setColorEars("black");
jim.setColorEyes("black");
jim.setColorNose("red");
jim.setColorShoes("blue");
jim.setHat(true);
jim.setMustache(true);

String text = jim.toString();
String text2 = bob.toString();

System.out.println(text + "\n" + text2);
//create objects or instances
//call or access constructors
//call or access (test) all of the methods



} 
}
