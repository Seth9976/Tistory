package com.bumptech.glide.load.model;

import java.nio.ByteBuffer;

public final class a implements Converter {
    @Override  // com.bumptech.glide.load.model.ByteArrayLoader$Converter
    public final Object convert(byte[] arr_b) {
        return ByteBuffer.wrap(arr_b);
    }

    @Override  // com.bumptech.glide.load.model.ByteArrayLoader$Converter
    public final Class getDataClass() {
        return ByteBuffer.class;
    }
}

