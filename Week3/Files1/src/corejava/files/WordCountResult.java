package corejava.files;

public class WordCountResult {
    private int charCount, lineCount, wordCount;

    public WordCountResult(int charCount, int lineCount, int wordCount) {
        this.charCount = charCount;
        this.lineCount = lineCount;
        this.wordCount = wordCount;
    }

    public int getCharacterCount() {
        return this.charCount;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getWordCount() {
        return this.wordCount;
    }

}
