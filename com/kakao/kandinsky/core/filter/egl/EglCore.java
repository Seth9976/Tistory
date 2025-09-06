package com.kakao.kandinsky.core.filter.egl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\u001D\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\b2\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0014\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001A\u00020\b2\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\u0016\u0010\u000EJ!\u0010\u0016\u001A\u00020\b2\b\u0010\u0017\u001A\u0004\u0018\u00010\u000B2\b\u0010\u0018\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\u0016\u0010\u0019J\r\u0010\u001A\u001A\u00020\b¢\u0006\u0004\b\u001A\u0010\nJ\u0017\u0010\u001C\u001A\u00020\u001B2\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010 \u001A\u00020\b2\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u001F\u001A\u00020\u001E¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001A\u00020\u001B2\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\"\u0010\u001DJ\u001F\u0010$\u001A\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\u0006\u0010#\u001A\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0015\u0010\'\u001A\u00020&2\u0006\u0010#\u001A\u00020\u0004¢\u0006\u0004\b\'\u0010(¨\u0006*"}, d2 = {"Lcom/kakao/kandinsky/core/filter/egl/EglCore;", "", "Landroid/opengl/EGLContext;", "sharedContext", "", "flags", "<init>", "(Landroid/opengl/EGLContext;I)V", "", "release", "()V", "Landroid/opengl/EGLSurface;", "eglSurface", "releaseSurface", "(Landroid/opengl/EGLSurface;)V", "surface", "createWindowSurface", "(Ljava/lang/Object;)Landroid/opengl/EGLSurface;", "width", "height", "createOffscreenSurface", "(II)Landroid/opengl/EGLSurface;", "makeCurrent", "drawSurface", "readSurface", "(Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;)V", "makeNothingCurrent", "", "swapBuffers", "(Landroid/opengl/EGLSurface;)Z", "", "time", "setPresentationTime", "(Landroid/opengl/EGLSurface;J)V", "isCurrent", "what", "querySurface", "(Landroid/opengl/EGLSurface;I)I", "", "queryString", "(I)Ljava/lang/String;", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EglCore {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000B\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\t¨\u0006\f"}, d2 = {"Lcom/kakao/kandinsky/core/filter/egl/EglCore$Companion;", "", "", "msg", "", "logCurrent", "(Ljava/lang/String;)V", "", "EGL_RECORDABLE_ANDROID", "I", "FLAG_RECORDABLE", "FLAG_TRY_GLES3", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void logCurrent(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "msg");
            EGLDisplay eGLDisplay0 = EGL14.eglGetCurrentDisplay();
            EGLContext eGLContext0 = EGL14.eglGetCurrentContext();
            EGLSurface eGLSurface0 = EGL14.eglGetCurrentSurface(0x3059);
            Logger.INSTANCE.log("Current EGL (" + s + "): display=" + eGLDisplay0 + ", context=" + eGLContext0 + ", surface=" + eGLSurface0);
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int FLAG_RECORDABLE = 1;
    public static final int FLAG_TRY_GLES3 = 2;
    public EGLDisplay a;
    public EGLContext b;
    public EGLConfig c;

    static {
        EglCore.Companion = new Companion(null);
    }

    public EglCore() {
        this(null, 0, 3, null);
    }

    public EglCore(@Nullable EGLContext eGLContext0, int v) {
        Triple triple1;
        EGLConfig eGLConfig0;
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        this.a = eGLDisplay0;
        if(Intrinsics.areEqual(eGLDisplay0, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        Triple triple0 = null;
        int[] arr_v = new int[2];
        if(!EGL14.eglInitialize(this.a, arr_v, 0, arr_v, 1)) {
            throw new RuntimeException("unable to initialize EGL14");
        }
        for(Object object0: CollectionsKt__CollectionsKt.listOfNotNull(new Integer[]{((v & 2) == 0 ? null : 3), 2})) {
            int v1 = ((Number)object0).intValue();
            int[] arr_v1 = {0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3021, 8, 0x3040, (v1 < 3 ? 4 : 68), 0x3038, 0, 0x3038};
            if((v & 1) != 0) {
                arr_v1[10] = 12610;
                arr_v1[11] = 1;
            }
            EGLConfig[] arr_eGLConfig = new EGLConfig[1];
            if(EGL14.eglChooseConfig(this.a, arr_v1, 0, arr_eGLConfig, 0, 1, new int[1], 0)) {
                eGLConfig0 = (EGLConfig)ArraysKt___ArraysKt.first(arr_eGLConfig);
            }
            else {
                Logger.INSTANCE.log("unable to find RGB8888 / " + v1 + " EGLConfig");
                eGLConfig0 = null;
            }
            if(eGLConfig0 != null) {
                EGLContext eGLContext1 = EGL14.eglCreateContext(this.a, eGLConfig0, eGLContext0, new int[]{0x3098, v1, 0x3038}, 0);
                int v2 = EGL14.eglGetError();
                if(v2 == 0x3000) {
                    triple1 = new Triple(eGLConfig0, eGLContext1, v1);
                    goto label_31;
                }
                else {
                    Logger.INSTANCE.error("eglCreateContext: EGL error: 0x" + Integer.toHexString(v2));
                }
            }
            triple1 = null;
        label_31:
            if(triple1 != null) {
                triple0 = triple1;
                break;
            }
            if(false) {
                break;
            }
        }
        if(triple0 == null) {
            throw new RuntimeException("EGLContext create fail");
        }
        EGLContext eGLContext2 = (EGLContext)triple0.component2();
        ((Number)triple0.component3()).intValue();
        this.b = eGLContext2;
        this.c = (EGLConfig)triple0.component1();
        int[] arr_v2 = new int[1];
        EGL14.eglQueryContext(this.a, eGLContext2, 0x3098, arr_v2, 0);
        Logger.INSTANCE.log("EGLContext created, client version " + arr_v2[0]);
    }

    public EglCore(EGLContext eGLContext0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            eGLContext0 = EGL14.EGL_NO_CONTEXT;
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        this(eGLContext0, v);
    }

    public static void a(String s) {
        int v = EGL14.eglGetError();
        if(v != 0x3000) {
            throw new RuntimeException(s + ": EGL error: 0x" + Integer.toHexString(v));
        }
    }

    @NotNull
    public final EGLSurface createOffscreenSurface(int v, int v1) {
        EGLSurface eGLSurface0 = EGL14.eglCreatePbufferSurface(this.a, this.c, new int[]{0x3057, v, 0x3056, v1, 0x3038}, 0);
        EglCore.a("eglCreatePbufferSurface");
        if(eGLSurface0 == null) {
            throw new RuntimeException("surface was null");
        }
        return eGLSurface0;
    }

    @NotNull
    public final EGLSurface createWindowSurface(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "surface");
        if(!(object0 instanceof Surface) && !(object0 instanceof SurfaceTexture)) {
            throw new RuntimeException("invalid surface: " + object0);
        }
        EGLSurface eGLSurface0 = EGL14.eglCreateWindowSurface(this.a, this.c, object0, new int[]{0x3038}, 0);
        EglCore.a("eglCreateWindowSurface");
        if(eGLSurface0 == null) {
            throw new RuntimeException("surface was null");
        }
        return eGLSurface0;
    }

    // 去混淆评级： 低(20)
    public final boolean isCurrent(@Nullable EGLSurface eGLSurface0) {
        return Intrinsics.areEqual(this.b, EGL14.eglGetCurrentContext()) && Intrinsics.areEqual(eGLSurface0, EGL14.eglGetCurrentSurface(0x3059));
    }

    public final void makeCurrent(@Nullable EGLSurface eGLSurface0) {
        if(Intrinsics.areEqual(this.a, EGL14.EGL_NO_DISPLAY)) {
            Logger.INSTANCE.log("NOTE: makeCurrent w/o display");
        }
        if(EGL14.eglMakeCurrent(this.a, eGLSurface0, eGLSurface0, this.b)) {
            return;
        }
        EglCore.a("make current");
        throw new RuntimeException("eglMakeCurrent failed");
    }

    public final void makeCurrent(@Nullable EGLSurface eGLSurface0, @Nullable EGLSurface eGLSurface1) {
        if(Intrinsics.areEqual(this.a, EGL14.EGL_NO_DISPLAY)) {
            Logger.INSTANCE.log("NOTE: makeCurrent w/o display");
        }
        if(!EGL14.eglMakeCurrent(this.a, eGLSurface0, eGLSurface1, this.b)) {
            throw new RuntimeException("eglMakeCurrent(draw,read) failed");
        }
    }

    public final void makeNothingCurrent() {
        if(!EGL14.eglMakeCurrent(this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    @NotNull
    public final String queryString(int v) {
        String s = EGL14.eglQueryString(this.a, v);
        Intrinsics.checkNotNullExpressionValue(s, "eglQueryString(...)");
        return s;
    }

    public final int querySurface(@Nullable EGLSurface eGLSurface0, int v) {
        int[] arr_v = new int[1];
        EGL14.eglQuerySurface(this.a, eGLSurface0, v, arr_v, 0);
        return ArraysKt___ArraysKt.first(arr_v);
    }

    public final void release() {
        if(!Intrinsics.areEqual(this.a, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglMakeCurrent(this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.a, this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.a);
        }
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.c = null;
    }

    public final void releaseSurface(@Nullable EGLSurface eGLSurface0) {
        EGL14.eglDestroySurface(this.a, eGLSurface0);
    }

    public final void setPresentationTime(@Nullable EGLSurface eGLSurface0, long v) {
        EGLExt.eglPresentationTimeANDROID(this.a, eGLSurface0, v);
    }

    public final boolean swapBuffers(@Nullable EGLSurface eGLSurface0) {
        return EGL14.eglSwapBuffers(this.a, eGLSurface0);
    }
}

