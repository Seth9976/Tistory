package com.bumptech.glide.load.data;

import java.net.HttpURLConnection;
import java.net.URL;

public final class b implements HttpUrlConnectionFactory {
    @Override  // com.bumptech.glide.load.data.HttpUrlFetcher$HttpUrlConnectionFactory
    public final HttpURLConnection build(URL uRL0) {
        return (HttpURLConnection)uRL0.openConnection();
    }
}

