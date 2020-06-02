#JFLAGS = -g
#JC = javac
#JVM = java 
#MAIN= Core

#run: $(MAIN).class
#	$(JVM) $(MAIN)

#$(MAIN):
#	$(JC) $(JFLAGS) *.java

#borrar:
#	rm *.class

all:src/Core.class

src/Core.class: src/Core.java
	javac src/*.java
	
clean:
	$(RM) src/*.class Core.jar