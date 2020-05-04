PAPER = stonecutterspec
TEX = $(wildcard *.tex)
BIB = refs.bib
FIGS = $(wildcard figures/*.pdf figures/*.png figures/*.jpg ./*.jpg)
VER = 0.6

.PHONY: all clean

$(PAPER).pdf: $(TEX) $(BIB) $(FIGS)
	echo $(FIGS)
	pdflatex $(PAPER)
	bibtex $(PAPER)
	pdflatex $(PAPER)
	pdflatex $(PAPER)
	cp $(PAPER).pdf $(PAPER).$(VER).pdf
clean:
	rm -f *.aux *.bbl *.blg *.log *.out *.toc *.hst *.lof *.lol *.lot *.ver $(PAPER).pdf $(PAPER).$(VER).pdf
