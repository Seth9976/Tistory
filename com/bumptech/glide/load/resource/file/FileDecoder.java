package com.bumptech.glide.load.resource.file;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.IOException;

public class FileDecoder implements ResourceDecoder {
    public Resource decode(@NonNull File file0, int v, int v1, @NonNull Options options0) {
        return new FileResource(file0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((File)object0), v, v1, options0);
    }

    public boolean handles(@NonNull File file0, @NonNull Options options0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((File)object0), options0);
    }
}

