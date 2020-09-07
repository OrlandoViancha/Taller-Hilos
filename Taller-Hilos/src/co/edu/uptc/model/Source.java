package co.edu.uptc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

public class Source {

	private String source;
    private List <Routes> targets;

    public Source(String source, List<Routes> targets) {
        this.source = source;
        this.targets = targets;
    }

    public Source() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Routes> getTargets() {
        return targets;
    }

    public void setTargets(List<Routes> targets) {
        this.targets = targets;
    }

    @Override
    public String toString() {
        return "source{" + "source=" + source + ", targets=" + targets + '}';
    }
    
    public Source leer (String json_source)
    {
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(json_source));

            String linea;
            while ((linea = br.readLine()) != null) {
                json += linea;
            }

            br.close();
            
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
           
        }

        
        
        Gson gson = new Gson();
        Source p = gson.fromJson(json, Source.class);
        return  p;
    }

}
