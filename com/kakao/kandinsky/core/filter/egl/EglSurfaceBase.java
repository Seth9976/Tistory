package com.kakao.kandinsky.core.filter.egl;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u0000¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0003\u001A\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R$\u0010\u001F\u001A\u0004\u0018\u00010\u00188\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u0014\u0010#\u001A\u00020 8&X¦\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"R\u0014\u0010%\u001A\u00020 8&X¦\u0004¢\u0006\u0006\u001A\u0004\b$\u0010\"R\u0011\u0010&\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b&\u0010\u000FR\u0011\u0010\'\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\'\u0010\u000F¨\u0006("}, d2 = {"Lcom/kakao/kandinsky/core/filter/egl/EglSurfaceBase;", "", "Lcom/kakao/kandinsky/core/filter/egl/EglCore;", "eglCore", "<init>", "(Lcom/kakao/kandinsky/core/filter/egl/EglCore;)V", "", "release", "()V", "makeCurrent", "readSurface", "makeCurrentReadFrom", "(Lcom/kakao/kandinsky/core/filter/egl/EglSurfaceBase;)V", "", "swapBuffers", "()Z", "", "nsecs", "setPresentationTime", "(J)V", "a", "Lcom/kakao/kandinsky/core/filter/egl/EglCore;", "getEglCore", "()Lcom/kakao/kandinsky/core/filter/egl/EglCore;", "Landroid/opengl/EGLSurface;", "b", "Landroid/opengl/EGLSurface;", "getEglSurface", "()Landroid/opengl/EGLSurface;", "setEglSurface", "(Landroid/opengl/EGLSurface;)V", "eglSurface", "", "getWidth", "()I", "width", "getHeight", "height", "isReleased", "isCurrent", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class EglSurfaceBase {
    public final EglCore a;
    public EGLSurface b;

    public EglSurfaceBase(@NotNull EglCore eglCore0) {
        Intrinsics.checkNotNullParameter(eglCore0, "eglCore");
        super();
        this.a = eglCore0;
        this.b = EGL14.EGL_NO_SURFACE;
    }

    @NotNull
    public final EglCore getEglCore() {
        return this.a;
    }

    @Nullable
    public final EGLSurface getEglSurface() {
        return this.b;
    }

    public abstract int getHeight();

    public abstract int getWidth();

    // 去混淆评级： 低(20)
    public final boolean isCurrent() {
        return !this.isReleased() && this.a.isCurrent(this.b);
    }

    public final boolean isReleased() {
        return Intrinsics.areEqual(this.b, EGL14.EGL_NO_SURFACE);
    }

    public final void makeCurrent() {
        this.a.makeCurrent(this.b);
    }

    public final void makeCurrentReadFrom(@NotNull EglSurfaceBase eglSurfaceBase0) {
        Intrinsics.checkNotNullParameter(eglSurfaceBase0, "readSurface");
        this.a.makeCurrent(this.b, eglSurfaceBase0.b);
    }

    public void release() {
        this.a.releaseSurface(this.b);
        this.b = EGL14.EGL_NO_SURFACE;
    }

    public final void setEglSurface(@Nullable EGLSurface eGLSurface0) {
        this.b = eGLSurface0;
    }

    public final void setPresentationTime(long v) {
        this.a.setPresentationTime(this.b, v);
    }

    public final boolean swapBuffers() {
        boolean z = this.a.swapBuffers(this.b);
        if(!z) {
            Logger.INSTANCE.log("WARNING: swapBuffers() failed");
        }
        return z;
    }
}

