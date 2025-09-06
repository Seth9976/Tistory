package com.bumptech.glide.load.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class m implements FileOpener {
    @Override  // com.bumptech.glide.load.model.FileLoader$FileOpener
    public final void close(Object object0) {
        ((InputStream)object0).close();
    }

    @Override  // com.bumptech.glide.load.model.FileLoader$FileOpener
    public final Class getDataClass() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.model.FileLoader$FileOpener
    public final Object open(File file0) {
        return new FileInputStream(file0);
    }
}

