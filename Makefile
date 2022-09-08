project: MainApp MainApp2 MainApp3 MainApp4 MainApp5 MainApp6 object project2
project2: exemple1 exemple2 exemple3 exemple4 project3 
project3: ex1 ex2 clean
clean:
	rm -rf *.txt~ *.java~ Makefile~ *.class
MainApp: MainApp.java
	javac $< 
	java $@
MainApp2: MainApp2.java
	javac $< 
	java $@
MainApp3: MainApp3.java
	javac $< 
	java $@
MainApp4: MainApp4.java
	javac $< 
	java $@
MainApp5: MainApp5.java
	javac $< 
	java $@
MainApp6: MainApp6.java
	javac $< 
	java $@
object:
	@echo "passage au coeur de l'objet et le classe (instanciations)\n\n\n"
	@echo "========================================================\n\n"
exemple1: cat.java objet.java
	javac $^
	java objet
	@echo "classes puis les attributs=================\n\n\n\n\n"
	@echo "modification+les méthodes================\n=================\n"
exemple2: objet2.java
	javac $<
	java objet2
exemple3: objet3.java player.java
	javac $^
	java objet3
	@echo "méthodes et surcharge de méthodes manipulant différents args²"
	@echo "passage aux encapsulations de données"
exemple4: objet4.java sr.java
	javac $^
	java objet4
ex1: ex1.java
	javac $<
	java $@
ex2: ex2.java
	javac $<
	java $@


