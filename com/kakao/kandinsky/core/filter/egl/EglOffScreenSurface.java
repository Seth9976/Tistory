package com.kakao.kandinsky.core.filter.egl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\u0006\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001A\u0004\b\u000E\u0010\f¨\u0006\u000F"}, d2 = {"Lcom/kakao/kandinsky/core/filter/egl/EglOffScreenSurface;", "Lcom/kakao/kandinsky/core/filter/egl/EglSurfaceBase;", "Lcom/kakao/kandinsky/core/filter/egl/EglCore;", "eglCore", "", "width", "height", "<init>", "(Lcom/kakao/kandinsky/core/filter/egl/EglCore;II)V", "c", "I", "getWidth", "()I", "d", "getHeight", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EglOffScreenSurface extends EglSurfaceBase {
    public final int c;
    public final int d;

    public EglOffScreenSurface(@NotNull EglCore eglCore0, int v, int v1) {
        Intrinsics.checkNotNullParameter(eglCore0, "eglCore");
        super(eglCore0);
        this.c = v;
        this.d = v1;
        this.setEglSurface(eglCore0.createOffscreenSurface(this.getWidth(), this.getHeight()));
    }

    @Override  // com.kakao.kandinsky.core.filter.egl.EglSurfaceBase
    public int getHeight() {
        return this.d;
    }

    @Override  // com.kakao.kandinsky.core.filter.egl.EglSurfaceBase
    public int getWidth() {
        return this.c;
    }
}

