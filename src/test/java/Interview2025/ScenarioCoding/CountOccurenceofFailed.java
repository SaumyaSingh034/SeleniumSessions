package Interview2025.ScenarioCoding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurenceofFailed {
    public static int fileAnalyzer(String fiePath, String word)  {
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(fiePath))){
            String line;
            while((line=br.readLine()) != null){
                if(line.contains(word))
                    count++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }
}
