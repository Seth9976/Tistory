package com.bumptech.glide;

import com.bumptech.glide.request.RequestOptions;

public final class c implements RequestOptionsFactory {
    public final RequestOptions a;

    public c(RequestOptions requestOptions0) {
        this.a = requestOptions0;
    }

    @Override  // com.bumptech.glide.Glide$RequestOptionsFactory
    public final RequestOptions build() {
        return this.a == null ? new RequestOptions() : this.a;
    }
}

