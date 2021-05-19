#!/bin/bash

java -jar /usr/local/lib/antlr-4.7.2-complete.jar -visitor TP1.g4
javac TP1*.java
java org.antlr.v4.gui.TestRig TP1 s -tree < CodigoFuenteEjemplo.c 