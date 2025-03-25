{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fnil\fcharset0 Calibri;}{\f1\fnil\fcharset204 Calibri;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 public class Cat extends Animal \{\par
\tab public Cat(String name, String skills) \{\par
\tab\tab super(name, skills);\par
\tab\}\par
\par
\tab @Override\par
\tab public void displayCommands() \{\par
\tab\tab System.out.println("\f1\lang1049\'ca\'ee\'ec\'e0\'ed\'e4\'fb \'e4\'eb\'ff \'ea\'ee\'f8\'ea\'e8 " + getName() + ": " + getSkills());\par
\tab\}\par
\par
\tab @Override\par
\tab public void teachNewCommand(String command) \{\par
\tab\tab String updatedSkills = getSkills() + "," + command;\par
\tab\tab setSkills(updatedSkills);\par
\tab\tab System.out.println("\'ca\'ee\'f8\'ea\'e0 " + getName() + " \'ed\'e0\'f3\'f7\'e8\'eb\'e0\'f1\'fc \'ed\'ee\'e2\'ee\'e9 \'ea\'ee\'ec\'e0\'ed\'e4\'e5: " + command);\par
\tab\}\par
\}\f0\lang9\par
}
