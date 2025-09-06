package com.kakao.kandinsky.preview.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\'\u0010\n\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"com/kakao/kandinsky/preview/ui/PreviewTextureViewKt$TextureView$1$1$1$1", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/graphics/SurfaceTexture;", "surface", "", "width", "height", "", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureSizeChanged", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PreviewTextureViewKt.TextureView.1.1.1.1 implements TextureView.SurfaceTextureListener {
    public final Function3 a;
    public final MutableState b;
    public final Function0 c;

    public PreviewTextureViewKt.TextureView.1.1.1.1(Function3 function30, MutableState mutableState0, Function0 function00) {
        this.a = function30;
        this.b = mutableState0;
        this.c = function00;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture0, int v, int v1) {
        Intrinsics.checkNotNullParameter(surfaceTexture0, "surface");
        PreviewTextureViewKt.access$TextureView_03bzQGs$lambda$7(this.b, false);
        this.a.invoke(surfaceTexture0, v, v1);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture0) {
        Intrinsics.checkNotNullParameter(surfaceTexture0, "surface");
        this.c.invoke();
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture0, int v, int v1) {
        Intrinsics.checkNotNullParameter(surfaceTexture0, "surface");
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture0) {
        Intrinsics.checkNotNullParameter(surfaceTexture0, "surface");
        PreviewTextureViewKt.access$TextureView_03bzQGs$lambda$7(this.b, true);
    }
}

