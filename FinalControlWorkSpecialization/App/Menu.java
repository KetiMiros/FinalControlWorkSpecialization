{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fnil\fcharset0 Calibri;}{\f1\fnil\fcharset204 Calibri;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 // \f1\lang1049\'ca\'eb\'e0\'f1\'f1 Menu \'e4\'eb\'ff \'ee\'f2\'ee\'e1\'f0\'e0\'e6\'e5\'ed\'e8\'ff \'ec\'e5\'ed\'fe \'e8 \'e2\'e7\'e0\'e8\'ec\'ee\'e4\'e5\'e9\'f1\'f2\'e2\'e8\'ff \'f1 \'ef\'ee\'eb\'fc\'e7\'ee\'e2\'e0\'f2\'e5\'eb\'e5\'ec\par
import java.util.InputMismatchException;\par
import java.util.Scanner;\par
\par
public class Menu \{\par
\tab private final Database database;\par
\tab private final Scanner scanner;\par
\par
\tab public Menu(Database database) \{\par
\tab\tab this.database = database;\par
\tab\tab scanner = new Scanner(System.in);\par
\tab\}\par
\par
\tab public void displayMenu() \{\par
\tab\tab while (true) \{\par
\tab\tab\tab try \{\par
\tab\tab\tab\tab System.out.println("\'cc\'e5\'ed\'fe:");\par
\tab\tab\tab\tab System.out.println("1. \'c4\'ee\'e1\'e0\'e2\'e8\'f2\'fc \'ed\'ee\'e2\'ee\'e5 \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e5");\par
\tab\tab\tab\tab System.out.println("2. \'cf\'ee\'ea\'e0\'e7\'e0\'f2\'fc \'f1\'ef\'e8\'f1\'ee\'ea \'e2\'f1\'e5\'f5 \'e6\'e8\'e2\'ee\'f2\'ed\'fb\'f5");\par
\tab\tab\tab\tab System.out.println("3. \'cf\'f0\'ee\'f1\'ec\'ee\'f2\'f0\'e5\'f2\'fc \'f1\'ef\'e8\'f1\'ee\'ea \'ea\'ee\'ec\'e0\'ed\'e4 \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee");\par
\tab\tab\tab\tab System.out.println("4. \'ce\'e1\'f3\'f7\'e8\'f2\'fc \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e5 \'ed\'ee\'e2\'ee\'e9 \'ea\'ee\'ec\'e0\'ed\'e4\'e5");\par
\tab\tab\tab\tab System.out.println("0. \'c2\'fb\'f5\'ee\'e4");\par
\tab\tab\tab\tab System.out.print("\'c2\'fb\'e1\'e5\'f0\'e8\'f2\'e5 \'ef\'f3\'ed\'ea\'f2 \'ec\'e5\'ed\'fe: ");\par
\tab\tab\tab\tab int choice = scanner.nextInt();\par
\tab\tab\tab\tab scanner.nextLine();\par
\par
\tab\tab\tab\tab switch (choice) \{\par
\tab\tab\tab\tab\tab case 1 -> addNewAnimal();\par
\tab\tab\tab\tab\tab case 2 -> database.displayAllAnimals();\par
\tab\tab\tab\tab\tab case 3 -> displayAnimalCommands();\par
\tab\tab\tab\tab\tab case 4 -> teachNewCommand();\par
\tab\tab\tab\tab\tab case 0 -> \{\par
\tab\tab\tab\tab\tab\tab System.out.println("\'cf\'f0\'ee\'e3\'f0\'e0\'ec\'ec\'e0 \'e7\'e0\'e2\'e5\'f0\'f8\'e5\'ed\'e0.");\par
\tab\tab\tab\tab\tab\tab return;\par
\tab\tab\tab\tab\tab\}\par
\tab\tab\tab\tab\tab default -> System.out.println("\'cd\'e5\'e2\'e5\'f0\'ed\'fb\'e9 \'e2\'fb\'e1\'ee\'f0. \'cf\'ee\'ef\'f0\'ee\'e1\'f3\'e9\'f2\'e5 \'f1\'ed\'ee\'e2\'e0.");\par
\tab\tab\tab\tab\}\par
\tab\tab\tab\} catch (InputMismatchException e) \{\par
\tab\tab\tab\tab System.out.println("\'ce\'f8\'e8\'e1\'ea\'e0: \'ed\'e5\'e2\'e5\'f0\'ed\'fb\'e9 \'f4\'ee\'f0\'ec\'e0\'f2 \'e2\'e2\'ee\'e4\'e0. \'cf\'ee\'ef\'f0\'ee\'e1\'f3\'e9\'f2\'e5 \'f1\'ed\'ee\'e2\'e0.");\par
\tab\tab\tab\tab scanner.nextLine(); // \'ce\'f7\'e8\'f1\'f2\'ea\'e0 \'e1\'f3\'f4\'e5\'f0\'e0 \'f1\'ea\'e0\'ed\'e5\'f0\'e0 \'ef\'ee\'f1\'eb\'e5 \'ee\'f8\'e8\'e1\'ee\'f7\'ed\'ee\'e3\'ee \'e2\'e2\'ee\'e4\'e0\par
\tab\tab\tab\}\par
\tab\tab\}\par
\tab\}\par
\par
\par
\tab private void addNewAnimal() \{\par
\tab\tab System.out.println("\'c2\'e2\'e5\'e4\'e8\'f2\'e5 \'e8\'ec\'ff \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee:");\par
\tab\tab String name = scanner.nextLine();\par
\tab\tab System.out.println("\'c2\'e2\'e5\'e4\'e8\'f2\'e5 \'f1\'ef\'e8\'f1\'ee\'ea \'ea\'ee\'ec\'e0\'ed\'e4 \'f7\'e5\'f0\'e5\'e7 \'e7\'e0\'ef\'ff\'f2\'f3\'fe:");\par
\tab\tab String skills = scanner.nextLine();\par
\par
\tab\tab System.out.println("\'c2\'fb\'e1\'e5\'f0\'e8\'f2\'e5 \'ea\'eb\'e0\'f1\'f1 \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee:");\par
\tab\tab System.out.println("1. \'d1\'ee\'e1\'e0\'ea\'e0");\par
\tab\tab System.out.println("2. \'ca\'ee\'f8\'ea\'e0");\par
\tab\tab System.out.println("3. \'d5\'ee\'ec\'ff\'ea");\par
\tab\tab System.out.println("4. \'ce\'f1\'b8\'eb");\par
\tab\tab System.out.println("5. \'ca\'ee\'ed\'fc");\par
\tab\tab int animalClass = scanner.nextInt();\par
\tab\tab scanner.nextLine();\par
\par
\tab\tab Animal animal;\par
\tab\tab switch (animalClass) \{\par
\tab\tab\tab case 1 -> animal = new Dog(name, skills);\par
\tab\tab\tab case 2 -> animal = new Cat(name, skills);\par
\tab\tab\tab case 3 -> animal = new Hamster(name, skills);\par
\tab\tab\tab case 4 -> animal = new Donkey(name, skills);\par
\tab\tab\tab case 5 -> animal = new Horse(name, skills);\par
\tab\tab\tab default -> \{\par
\tab\tab\tab\tab System.out.println("\'cd\'e5\'e2\'e5\'f0\'ed\'fb\'e9 \'e2\'fb\'e1\'ee\'f0 \'ea\'eb\'e0\'f1\'f1\'e0 \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee.");\par
\tab\tab\tab\tab return;\par
\tab\tab\tab\}\par
\tab\tab\}\par
\par
\tab\tab database.addAnimal(animal);\par
\tab\tab System.out.println("\'c6\'e8\'e2\'ee\'f2\'ed\'ee\'e5 \'f3\'f1\'ef\'e5\'f8\'ed\'ee \'e4\'ee\'e1\'e0\'e2\'eb\'e5\'ed\'ee \'e2 \'e1\'e0\'e7\'f3 \'e4\'e0\'ed\'ed\'fb\'f5.");\par
\tab\}\par
\par
\tab private void displayAnimalCommands() \{\par
\tab\tab System.out.println("\'c2\'e2\'e5\'e4\'e8\'f2\'e5 \'e8\'ec\'ff \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee:");\par
\tab\tab String name = scanner.nextLine();\par
\par
\tab\tab database.displayAnimalCommands(name);\par
\tab\}\par
\par
\tab private void teachNewCommand() \{\par
\tab\tab System.out.println("\'c2\'e2\'e5\'e4\'e8\'f2\'e5 \'e8\'ec\'ff \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee:");\par
\tab\tab String name = scanner.nextLine();\par
\tab\tab System.out.println("\'c2\'e2\'e5\'e4\'e8\'f2\'e5 \'ed\'ee\'e2\'fb\'e5 \'ea\'ee\'ec\'e0\'ed\'e4\'fb \'f7\'e5\'f0\'e5\'e7 \'e7\'e0\'ef\'ff\'f2\'f3\'fe:");\par
\tab\tab String command = scanner.nextLine();\par
\par
\tab\tab database.teachNewCommand(name, command);\par
\tab\tab System.out.println("\'ca\'ee\'ec\'e0\'ed\'e4\'e0 \'f3\'f1\'ef\'e5\'f8\'ed\'ee \'e4\'ee\'e1\'e0\'e2\'eb\'e5\'ed\'e0 \'e4\'eb\'ff \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee.");\par
\tab\}\par
\}\f0\lang9\par
}
