package spot_hero.concrete;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonFile {
    public JSONObject getJsonObject(){
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        JSONArray rates = null;
        try (Reader reader = new FileReader("C:\\Users\\Anthony\\Documents\\Programming\\Code\\Java-Projects\\InterviewChallenge\\src\\main\\resources\\rates.json")) {
            jsonObject = (JSONObject) parser.parse(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
