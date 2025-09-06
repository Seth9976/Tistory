package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import java.io.File;

public final class k implements FileOpener {
    @Override  // com.bumptech.glide.load.model.FileLoader$FileOpener
    public final void close(Object object0) {
        ((ParcelFileDescriptor)object0).close();
    }

    @Override  // com.bumptech.glide.load.model.FileLoader$FileOpener
    public final Class getDataClass() {
        return ParcelFileDescriptor.class;
    }

    @Override  // com.bumptech.glide.load.model.FileLoader$FileOpener
    public final Object open(File file0) {
        return ParcelFileDescriptor.open(file0, 0x10000000);
    }
}

