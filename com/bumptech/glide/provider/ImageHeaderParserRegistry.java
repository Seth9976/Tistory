package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class ImageHeaderParserRegistry {
    public final ArrayList a;

    public ImageHeaderParserRegistry() {
        this.a = new ArrayList();
    }

    public void add(@NonNull ImageHeaderParser imageHeaderParser0) {
        synchronized(this) {
            this.a.add(imageHeaderParser0);
        }
    }

    @NonNull
    public List getParsers() {
        synchronized(this) {
        }
        return this.a;
    }
}

