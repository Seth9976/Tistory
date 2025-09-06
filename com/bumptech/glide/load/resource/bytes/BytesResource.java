package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

public class BytesResource implements Resource {
    public final byte[] a;

    public BytesResource(byte[] arr_b) {
        this.a = (byte[])Preconditions.checkNotNull(arr_b);
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Object get() {
        return this.get();
    }

    @NonNull
    public byte[] get() {
        return this.a;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class getResourceClass() {
        return byte[].class;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.a.length;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public void recycle() {
    }
}

