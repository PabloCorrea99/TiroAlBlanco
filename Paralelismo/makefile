all:src/Core.class

src/Core.class: src/Core.java
	javac src/*.java
	
clean:
	$(RM) src/*.class Core.jar
	
run: $(Core).class
	$(java) $(Core)