CC = antlr4
CC2 = javac
SRC = $(wildcard *.g4)
SRC2 = $(wildcard *.java)
EXE = CactusParser$TokenContext.class
RED = \033[1;31m
GREEN = \033[1;32m
YELLOW = \033[1;33m
BLUE = \033[1;34m
NC = \033[1;0m

clean :
	@echo "$(YELLOW)Cleaning...$(NC)"
	rm CactusBaseListener.java CactusLexer.java CactusListener.java Cactus.tokens CactusLexer.tokens CactusBaseListener.class CactusLexer.class CactusListener.class Cactus.interp CactusLexer.interp CactusParser*
	@echo "$(GREEN)Done!$(NC)"
