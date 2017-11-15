package de.fhro.inf.prg3.a06.model;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class JokeAdapter extends TypeAdapter<Joke> {


    @Override
    public void write(JsonWriter out, Joke value) throws IOException {
        out.beginObject();
        out.name("id").value(value.getNumber());
        out.name("content").value(value.getContent());
        out.name("rubrics").value(String.valueOf(value.getRubrics()));
        out.endObject();
    }

    @Override
    public Joke read(JsonReader in) throws IOException {

        final Joke joke = new Joke();

        in.beginObject();
        while (in.hasNext()){
            switch (in.nextName()){
                case "id":
                    joke.getNumber();
                    break;
                case "content":
                    joke.getContent();
                    break;
                case "rubrics":
                    joke.getRubrics();
                    break;
            }
        }
        in.endObject();

        return joke;
    }
}
