package com.kakao.kandinsky.core.filter.egl;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0013\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/core/filter/egl/EglWindowSurface;", "Lcom/kakao/kandinsky/core/filter/egl/EglSurfaceBase;", "Lcom/kakao/kandinsky/core/filter/egl/EglCore;", "eglCore", "Landroid/view/Surface;", "surface", "", "releaseSurface", "<init>", "(Lcom/kakao/kandinsky/core/filter/egl/EglCore;Landroid/view/Surface;Z)V", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "(Lcom/kakao/kandinsky/core/filter/egl/EglCore;Landroid/graphics/SurfaceTexture;)V", "", "release", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EglWindowSurface extends EglSurfaceBase {
    public Surface c;
    public final boolean d;

    public EglWindowSurface(@NotNull EglCore eglCore0, @NotNull SurfaceTexture surfaceTexture0) {
        Intrinsics.checkNotNullParameter(eglCore0, "eglCore");
        Intrinsics.checkNotNullParameter(surfaceTexture0, "surfaceTexture");
        super(eglCore0);
        this.setEglSurface(eglCore0.createWindowSurface(surfaceTexture0));
        this.d = false;
    }

    public EglWindowSurface(@NotNull EglCore eglCore0, @NotNull Surface surface0, boolean z) {
        Intrinsics.checkNotNullParameter(eglCore0, "eglCore");
        Intrinsics.checkNotNullParameter(surface0, "surface");
        super(eglCore0);
        this.setEglSurface(eglCore0.createWindowSurface(surface0));
        this.c = surface0;
        this.d = z;
    }

    @Override  // com.kakao.kandinsky.core.filter.egl.EglSurfaceBase
    public int getHeight() {
        return this.getEglCore().querySurface(this.getEglSurface(), 0x3056);
    }

    @Override  // com.kakao.kandinsky.core.filter.egl.EglSurfaceBase
    public int getWidth() {
        return this.getEglCore().querySurface(this.getEglSurface(), 0x3057);
    }

    @Override  // com.kakao.kandinsky.core.filter.egl.EglSurfaceBase
    public void release() {
        super.release();
        if(this.d) {
            Surface surface0 = this.c;
            if(surface0 != null) {
                surface0.release();
            }
        }
        this.c = null;
    }
}

