package de.fhro.inf.prg3.a06.model;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class JokeAdapter extends TypeAdapter<Joke> {


    @Override
    public void write(JsonWriter out, Joke value) throws IOException {
        
    }

    @Override
    public Joke read(JsonReader in) throws IOException {
        return null;
    }
}
