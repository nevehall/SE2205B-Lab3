package Dictionary;

import java.util.Iterator;


/**
 * A class that will be used to display the lines of text that are corrected.
 *
 */
public class LinesToDisplay {

    public static final int LINES = 10;     // Display 10 lines
    private AList<Wordlet>[] lines;
    private int currentLine;

    /**
     * Constructor for objects of class LinesToDisplay
     */
    public LinesToDisplay() {
        lines = (AList<Wordlet>[]) new AList[LINES + 1];
        for(int i = 0; i < LINES+1; i++) {
            lines[i] = new AList();
        }
        currentLine = 0;
    }

    /**
     * Add a new wordlet to the current line.
     *
     */
    public void addWordlet(Wordlet w) {
       lines[currentLine].add(w);
    }

    /**
     * Go to the next line, if the number of lines has exceeded LINES, shift
     * them all up by one
     *
     */
    public void nextLine() {
        if(currentLine==LINES) {
            for(int i = 0;i<LINES;i++) {
                lines[i] = lines[i+1];
            }
            lines[LINES] = new AList();
        }
        else {
            currentLine++;
        }
    }

      
    public int getCurrentLine(){
        return currentLine;
    }
    
    public AList<Wordlet>[] getLines(){
        return lines;
    }
}
