package com.bumptech.glide.load.resource;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

public class SimpleResource implements Resource {
    protected final Object data;

    public SimpleResource(@NonNull Object object0) {
        this.data = Preconditions.checkNotNull(object0);
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    @NonNull
    public final Object get() {
        return this.data;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class getResourceClass() {
        return this.data.getClass();
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return 1;
    }

    @Override  // com.bumptech.glide.load.engine.Resource
    public void recycle() {
    }
}

