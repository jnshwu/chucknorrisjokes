package com.jinshiwu.webapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

/**
 * Created by EL on 8/20/18.
 */
@Component
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getjoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
