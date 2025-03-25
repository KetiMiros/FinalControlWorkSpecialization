{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fnil\fcharset0 Calibri;}{\f1\fnil\fcharset204 Calibri;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 // \f1\lang1049\'ca\'eb\'e0\'f1\'f1 Horse \'ed\'e0\'f1\'eb\'e5\'e4\'f3\'e5\'f2\'f1\'ff \'ee\'f2 \'ea\'eb\'e0\'f1\'f1\'e0 Animal\par
public class Horse extends Animal \{\par
\tab public Horse(String name, String skills) \{\par
\tab\tab super(name, skills);\par
\tab\}\par
\par
\tab @Override\par
\tab public void displayCommands() \{\par
\tab\tab System.out.println("\'d1\'ef\'e8\'f1\'ee\'ea \'ea\'ee\'ec\'e0\'ed\'e4 \'e4\'eb\'ff \'ea\'ee\'ed\'ff:");\par
\tab\tab System.out.println(getSkills());\par
\tab\}\par
\par
\tab @Override\par
\tab public void teachNewCommand(String command) \{\par
\tab\tab String updatedSkills = getSkills() + "," + command;\par
\tab\tab setSkills(updatedSkills);\par
\tab\}\par
\}\f0\lang9\par
}

