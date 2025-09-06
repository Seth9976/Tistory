package com.kakao.kandinsky.core.filter.gl;

import android.graphics.SurfaceTexture;
import com.kakao.kandinsky.core.filter.egl.EglCore;
import com.kakao.kandinsky.core.filter.egl.EglOffScreenSurface;
import com.kakao.kandinsky.core.filter.egl.EglSurfaceBase;
import com.kakao.kandinsky.core.filter.egl.EglWindowSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000B\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\u0003J\r\u0010\f\u001A\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLContext;", "", "<init>", "()V", "Landroid/graphics/SurfaceTexture;", "surface", "", "setCurrentSurface", "(Landroid/graphics/SurfaceTexture;)V", "resetCurrentSurface", "makeCurrent", "swapBuffer", "delete", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GLContext {
    public final EglCore a;
    public final EglOffScreenSurface b;
    public EglSurfaceBase c;

    public GLContext() {
        EglCore eglCore0 = new EglCore(null, 0, 3, null);
        this.a = eglCore0;
        EglOffScreenSurface eglOffScreenSurface0 = new EglOffScreenSurface(eglCore0, 1, 1);
        this.b = eglOffScreenSurface0;
        this.c = eglOffScreenSurface0;
    }

    public final void delete() {
        EglCore eglCore0 = this.a;
        eglCore0.makeNothingCurrent();
        this.b.release();
        if(!Intrinsics.areEqual(this.b, this.c)) {
            this.c.release();
        }
        eglCore0.release();
    }

    public final void makeCurrent() {
        if(!this.c.isCurrent()) {
            this.c.makeCurrent();
        }
    }

    public final void resetCurrentSurface() {
        this.c = this.b;
    }

    public final void setCurrentSurface(@NotNull SurfaceTexture surfaceTexture0) {
        Intrinsics.checkNotNullParameter(surfaceTexture0, "surface");
        this.c = new EglWindowSurface(this.a, surfaceTexture0);
    }

    public final void swapBuffer() {
        this.c.swapBuffers();
    }
}

