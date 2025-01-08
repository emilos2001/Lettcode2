package LeetCode.Hard;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int currentLength = 0;

        for (String word : words) {
            if (currentLength + currentLine.size() + word.length() > maxWidth) {
                result.add(justifyLine(currentLine, currentLength, maxWidth));
                currentLine.clear();
                currentLength = 0;
            }
            currentLine.add(word);
            currentLength += word.length();
        }

        StringBuilder lastLine = new StringBuilder(String.join(" ", currentLine));
        while (lastLine.length() < maxWidth) {
            lastLine.append(" ");
        }
        result.add(lastLine.toString());

        return result;
    }

    private static String justifyLine(List<String> line, int currentLength, int maxWidth) {
        StringBuilder justifiedLine = new StringBuilder();
        int spacesToDistribute = maxWidth - currentLength;
        int gaps = line.size() - 1;

        if (gaps == 0) {
            justifiedLine.append(line.get(0));
            while (justifiedLine.length() < maxWidth) {
                justifiedLine.append(" ");
            }
            return justifiedLine.toString();
        }

        int spacesPerGap = spacesToDistribute / gaps;
        int extraSpaces = spacesToDistribute % gaps;

        for (int i = 0; i < line.size(); i++) {
            justifiedLine.append(line.get(i));
            if (i < gaps) {
                for (int j = 0; j < spacesPerGap; j++) {
                    justifiedLine.append(" ");
                }
                if (extraSpaces > 0) {
                    justifiedLine.append(" ");
                    extraSpaces--;
                }
            }
        }

        return justifiedLine.toString();
    }

    public static void main(String[] args) {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 16;
        List<String> output = fullJustify(words, maxWidth);
        for (String line : output) {
            System.out.println("\"" + line + "\"");
        }
    }
}
