package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

public class UnitDrawableDecoder implements ResourceDecoder {
    @Nullable
    public Resource decode(@NonNull Drawable drawable0, int v, int v1, @NonNull Options options0) {
        return drawable0 != null ? new d(drawable0) : null;  // 初始化器: Lcom/bumptech/glide/load/resource/drawable/DrawableResource;-><init>(Landroid/graphics/drawable/Drawable;)V
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((Drawable)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Drawable drawable0, @NonNull Options options0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((Drawable)object0), options0);
    }
}

