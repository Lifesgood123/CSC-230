C = javac
CFLAGS = -d 
OUTPUTDIR = ./build
.SUFFIXES: .java .class
.java.class:
		$(C) $(CFLAGS) $(OUTPUTDIR) $*.java

CLASSES = ./src/Question01/*.java

default: classes

classes: $(CLASSES:.java=.class)
