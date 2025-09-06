package com.bumptech.glide.load.model;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class f implements DataDecoder {
    @Override  // com.bumptech.glide.load.model.DataUrlLoader$DataDecoder
    public final void close(Object object0) {
        ((InputStream)object0).close();
    }

    @Override  // com.bumptech.glide.load.model.DataUrlLoader$DataDecoder
    public final Object decode(String s) {
        if(!s.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int v = s.indexOf(44);
        if(v == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if(!s.substring(0, v).endsWith(";base64")) {
            throw new IllegalArgumentException("Not a base64 image data URL.");
        }
        return new ByteArrayInputStream(Base64.decode(s.substring(v + 1), 0));
    }

    @Override  // com.bumptech.glide.load.model.DataUrlLoader$DataDecoder
    public final Class getDataClass() {
        return InputStream.class;
    }
}

