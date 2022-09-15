project: MainApp MainApp2 MainApp3 MainApp4 MainApp5 MainApp6 object project2
project2: exemple1 exemple2 exemple3 exemple4 project3 project4 heritage
project3: ex1 ex2 ex3 ex4 ex5 
project4: exe6 test angle 
heritage: main2 main3 main4 main5 main6 clean
resume: resume0 resume1 resume2 resume3
clean: clean2
	rm -rf *.txt~ *.java~ Makefile~ *.class mypackage/*.class mypackage/*.java~
clean2:
	rm -rf others_heritage/*.java~ others_heritage/*.class paquets/*.class paquets/*.java~ paquets_autres/*.class paquets_autres/*.java~ abstraits/*.java~ abstraits/*.class vehicules/*.java~ vehicules/*.class batiments/*.java~ batiments/*.class
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
ex3: ex3.java
	javac $<
	java $@
ex4: ex4.java
	javac $<
	java $@
ex5: ex5.java mypackage/*.java
	javac $^ && java $@
exe6: exe6.java
	javac $< && java $@
test: test.java
	javac $< && java $@
angle: angle.java
	javac $< ; java $@
resume0: summary_objet_et_encapsulation
	cat $<
resume1: summary_objet_et_encapsulation2
	cat $<
resume2: summary_objet_et_encapsulation3
	cat $<
resume3: summary_objet_et_encapsulation4
	cat $<
main2: main2.java others_heritage/exemple1.java others_heritage/part1.java
	javac $^ && java $@
main3: main3.java paquets/*.java
	javac $^ && java main3
main4: main4.java paquets_autres/*.java
	javac $^ && java main4
main5: main5.java #sans les sous-classes qui importent (faits automatiquement)
	javac $< && java $@
main6: main6.java
	javac $< && java $@
