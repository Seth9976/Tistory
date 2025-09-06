package com.bumptech.glide.load.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class c implements Converter {
    @Override  // com.bumptech.glide.load.model.ByteArrayLoader$Converter
    public final Object convert(byte[] arr_b) {
        return new ByteArrayInputStream(arr_b);
    }

    @Override  // com.bumptech.glide.load.model.ByteArrayLoader$Converter
    public final Class getDataClass() {
        return InputStream.class;
    }
}

