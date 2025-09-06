package com.kakao.kandinsky.core.filter.gl;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLTools;", "", "", "message", "", "throwFatal", "checkGLError", "(Ljava/lang/String;Z)Z", "checkGLFramebufferError", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GLTools {
    @NotNull
    public static final GLTools INSTANCE;

    static {
        GLTools.INSTANCE = new GLTools();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(String s, String s1, boolean z) {
        String s2 = s1 == null || !p.isBlank(s1) != 1 ? "" : s1 + " \n";
        Logger.INSTANCE.error(s2 + s);
        if(z) {
            throw new RuntimeException(s);
        }
    }

    public final boolean checkGLError(@Nullable String s, boolean z) {
        String s2;
        int v = GLES20.glGetError();
        if(v != 0) {
            String s1 = "0x" + Integer.toHexString(v);
            switch(v) {
                case 0x500: {
                    s2 = "GL_INVALID_ENUM (" + s1 + ")";
                    break;
                }
                case 0x501: {
                    s2 = "GL_INVALID_VALUE (" + s1 + ")";
                    break;
                }
                case 0x502: {
                    s2 = "GL_INVALID_OPERATION (" + s1 + ")";
                    break;
                }
                case 0x505: {
                    s2 = "GL_OUT_OF_MEMORY (" + s1 + ")";
                    break;
                }
                case 0x506: {
                    s2 = "GL_INVALID_FRAMEBUFFER_OPERATION (" + s1 + ")";
                    break;
                }
                default: {
                    s2 = GLUtils.getEGLErrorString(v);
                    Intrinsics.checkNotNullExpressionValue(s2, "getEGLErrorString(...)");
                }
            }
            GLTools.a(("GL error : " + s2), s, z);
        }
        return v != 0;
    }

    public static boolean checkGLError$default(GLTools gLTools0, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            z = false;
        }
        return gLTools0.checkGLError(s, z);
    }

    public final boolean checkGLFramebufferError(@Nullable String s, boolean z) {
        String s2;
        int v = GLES20.glCheckFramebufferStatus(0x8D40);
        if(v != 36053) {
            String s1 = "0x" + Integer.toHexString(v);
            switch(v) {
                case 36054: {
                    s2 = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT (" + s1 + ")";
                    break;
                }
                case 36055: {
                    s2 = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT (" + s1 + ")";
                    break;
                }
                case 36057: {
                    s2 = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS (" + s1 + ")";
                    break;
                }
                case 36061: {
                    s2 = "GL_FRAMEBUFFER_UNSUPPORTED (" + s1 + ")";
                    break;
                }
                default: {
                    s2 = GLUtils.getEGLErrorString(v);
                    Intrinsics.checkNotNullExpressionValue(s2, "getEGLErrorString(...)");
                }
            }
            GLTools.a(("GL Framebuffer error: " + s2), s, z);
        }
        return v != 36053;
    }

    public static boolean checkGLFramebufferError$default(GLTools gLTools0, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return gLTools0.checkGLFramebufferError(s, z);
    }
}

