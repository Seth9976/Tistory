package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

public class UnitTranscoder implements ResourceTranscoder {
    public static final UnitTranscoder a;

    static {
        UnitTranscoder.a = new UnitTranscoder();
    }

    public static ResourceTranscoder get() {
        return UnitTranscoder.a;
    }

    @Override  // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource transcode(@NonNull Resource resource0, @NonNull Options options0) {
        return resource0;
    }
}

