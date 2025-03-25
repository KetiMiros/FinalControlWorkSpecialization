{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fnil\fcharset0 Calibri;}{\f1\fnil\fcharset204 Calibri;}}
{\*\generator Riched20 10.0.19041}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 // \f1\lang1049\'ca\'eb\'e0\'f1\'f1 Database \'e4\'eb\'ff \'f5\'f0\'e0\'ed\'e5\'ed\'e8\'ff \'e8 \'f3\'ef\'f0\'e0\'e2\'eb\'e5\'ed\'e8\'ff \'e6\'e8\'e2\'ee\'f2\'ed\'fb\'ec\'e8\par
import java.io.*;\par
import java.util.*;\par
\par
public class Database \{\par
\tab private final List<Animal> animals;\par
\tab private static final String FILE_PATH = "app/database.txt";\par
\par
\tab public Database() \{\par
\tab\tab animals = new ArrayList<>();\par
\tab\tab loadDatabase();\par
\tab\}\par
\par
\tab public void addAnimal(Animal animal) \{\par
\tab\tab animals.add(animal);\par
\tab\tab saveDatabase();\par
\tab\}\par
\par
\tab public void displayAnimalCommands(String name) \{\par
\tab\tab for (Animal animal : animals) \{\par
\tab\tab\tab if (animal.getName().equals(name)) \{\par
\tab\tab\tab\tab animal.displayCommands();\par
\tab\tab\tab\tab return;\par
\tab\tab\tab\}\par
\tab\tab\}\par
\tab\tab System.out.println("\'c6\'e8\'e2\'ee\'f2\'ed\'ee\'e5 \'f1 \'e8\'ec\'e5\'ed\'e5\'ec " + name + " \'ed\'e5 \'ed\'e0\'e9\'e4\'e5\'ed\'ee.");\par
\tab\}\par
\par
\par
\par
\tab public void teachNewCommand(String name, String command) \{\par
\tab\tab for (Animal animal : animals) \{\par
\tab\tab\tab if (animal.getName().equals(name)) \{\par
\tab\tab\tab\tab String[] commands = command.split(",");\par
\tab\tab\tab\tab for (int i = 0; i < commands.length; i++) \{\par
\tab\tab\tab\tab\tab String trimmedCommand = commands[i].trim();\par
\tab\tab\tab\tab\tab commands[i] = trimmedCommand;\par
\tab\tab\tab\tab\}\par
\tab\tab\tab\tab animal.teachNewCommand(command);\par
\tab\tab\tab\tab saveDatabase();\par
\tab\tab\tab\tab System.out.println("\'ca\'ee\'ec\'e0\'ed\'e4\'e0 \'f3\'f1\'ef\'e5\'f8\'ed\'ee \'e4\'ee\'e1\'e0\'e2\'eb\'e5\'ed\'e0 \'e4\'eb\'ff \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee.");\par
\tab\tab\tab\tab return;\par
\tab\tab\tab\}\par
\tab\tab\}\par
\tab\tab System.out.println("\'c6\'e8\'e2\'ee\'f2\'ed\'ee\'e5 \'f1 \'e8\'ec\'e5\'ed\'e5\'ec " + name + " \'ed\'e5 \'ed\'e0\'e9\'e4\'e5\'ed\'ee.");\par
\tab\}\par
\par
\par
\tab private void loadDatabase() \{\par
\tab\tab try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) \{\par
\tab\tab\tab String line;\par
\tab\tab\tab while ((line = reader.readLine()) != null) \{\par
\tab\tab\tab\tab String[] data = line.split(",");\par
\tab\tab\tab\tab if (data.length >= 3) \{\par
\tab\tab\tab\tab\tab String className = data[0];\par
\tab\tab\tab\tab\tab String name = data[1];\par
\tab\tab\tab\tab\tab String skills = String.join(",", Arrays.copyOfRange(data, 2, data.length));\par
\par
\tab\tab\tab\tab\tab Animal animal;\par
\tab\tab\tab\tab\tab switch (className) \{\par
\tab\tab\tab\tab\tab\tab case "Dog" -> animal = new Dog(name, skills);\par
\tab\tab\tab\tab\tab\tab case "Cat" -> animal = new Cat(name, skills);\par
\tab\tab\tab\tab\tab\tab case "Hamster" -> animal = new Hamster(name, skills);\par
\tab\tab\tab\tab\tab\tab case "Donkey" -> animal = new Donkey(name, skills);\par
\tab\tab\tab\tab\tab\tab case "Horse" -> animal = new Horse(name, skills);\par
\tab\tab\tab\tab\tab\tab default -> \{\par
\tab\tab\tab\tab\tab\tab\tab System.out.println("\'cd\'e5\'e8\'e7\'e2\'e5\'f1\'f2\'ed\'fb\'e9 \'ea\'eb\'e0\'f1\'f1 \'e6\'e8\'e2\'ee\'f2\'ed\'ee\'e3\'ee: " + className);\par
\tab\tab\tab\tab\tab\tab\tab continue;\par
\tab\tab\tab\tab\tab\tab\}\par
\tab\tab\tab\tab\tab\}\par
\tab\tab\tab\tab\tab animals.add(animal);\par
\tab\tab\tab\tab\} else \{\par
\tab\tab\tab\tab\tab System.out.println("\'cd\'e5\'ea\'ee\'f0\'f0\'e5\'ea\'f2\'ed\'fb\'e5 \'e4\'e0\'ed\'ed\'fb\'e5 \'e2 \'f4\'e0\'e9\'eb\'e5: " + line);\par
\tab\tab\tab\tab\}\par
\tab\tab\tab\}\par
\tab\tab\tab System.out.println("\'c1\'e0\'e7\'e0 \'e4\'e0\'ed\'ed\'fb\'f5 \'f3\'f1\'ef\'e5\'f8\'ed\'ee \'e7\'e0\'e3\'f0\'f3\'e6\'e5\'ed\'e0.");\par
\tab\tab\} catch (IOException e) \{\par
\tab\tab\tab System.out.println("\'ce\'f8\'e8\'e1\'ea\'e0 \'ef\'f0\'e8 \'f7\'f2\'e5\'ed\'e8\'e8 \'e1\'e0\'e7\'fb \'e4\'e0\'ed\'ed\'fb\'f5: " + e.getMessage());\par
\tab\tab\}\par
\tab\}\par
\par
\par
\tab public void displayAllAnimals() \{\par
\tab\tab try \{\par
\tab\tab\tab File file = new File(FILE_PATH);\par
\tab\tab\tab Scanner fileScanner = new Scanner(file);\par
\par
\tab\tab\tab while (fileScanner.hasNextLine()) \{\par
\tab\tab\tab\tab String animalData = fileScanner.nextLine();\par
\tab\tab\tab\tab System.out.println(animalData);\par
\tab\tab\tab\}\par
\par
\tab\tab\tab fileScanner.close();\par
\tab\tab\} catch (FileNotFoundException e) \{\par
\tab\tab\tab System.out.println("\'d4\'e0\'e9\'eb \'f1 \'e4\'e0\'ed\'ed\'fb\'ec\'e8 \'ee \'e6\'e8\'e2\'ee\'f2\'ed\'fb\'f5 \'ed\'e5 \'ed\'e0\'e9\'e4\'e5\'ed.");\par
\tab\tab\}\par
\tab\}\par
\par
\tab private void saveDatabase() \{\par
\tab\tab try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) \{\par
\tab\tab\tab for (Animal animal : animals) \{\par
\tab\tab\tab\tab String className = animal.getClass().getSimpleName();\par
\tab\tab\tab\tab String name = animal.getName();\par
\tab\tab\tab\tab String skills = animal.getSkills().replaceAll(",\\\\s+", ",");\par
\par
\tab\tab\tab\tab String line = className + "," + name + "," + skills;\par
\tab\tab\tab\tab writer.write(line);\par
\tab\tab\tab\tab writer.newLine();\par
\tab\tab\tab\}\par
\tab\tab\tab System.out.println("\'c1\'e0\'e7\'e0 \'e4\'e0\'ed\'ed\'fb\'f5 \'f3\'f1\'ef\'e5\'f8\'ed\'ee \'f1\'ee\'f5\'f0\'e0\'ed\'e5\'ed\'e0.");\par
\tab\tab\} catch (IOException e) \{\par
\tab\tab\tab System.out.println("\'ce\'f8\'e8\'e1\'ea\'e0 \'ef\'f0\'e8 \'f1\'ee\'f5\'f0\'e0\'ed\'e5\'ed\'e8\'e8 \'e1\'e0\'e7\'fb \'e4\'e0\'ed\'ed\'fb\'f5: " + e.getMessage());\par
\tab\tab\}\par
\tab\}\par
\par
\}\f0\lang9\par
}
