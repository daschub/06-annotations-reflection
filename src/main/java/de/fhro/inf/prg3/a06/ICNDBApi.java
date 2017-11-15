package de.fhro.inf.prg3.a06;

import retrofit2.http.GET;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public interface ICNDBApi {

    @GET("/jokes/random")
    void getRandomJoke();

    void getRandomJoke(String[] categoriesToInclude);
    void getRandomJokes(int count);
    void getJokeById(int id);


}
