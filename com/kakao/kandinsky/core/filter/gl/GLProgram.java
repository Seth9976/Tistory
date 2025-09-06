package com.kakao.kandinsky.core.filter.gl;

import android.opengl.GLES20;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000E\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000E\u0010\rJ\r\u0010\u000F\u001A\u00020\u0007¢\u0006\u0004\b\u000F\u0010\tR\u0017\u0010\u0014\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001A\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLProgram;", "", "", "vertexShaderCode", "fragmentShaderCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "use", "()V", "name", "", "uniformLocation", "(Ljava/lang/String;)I", "attribLocation", "delete", "a", "I", "getId", "()I", "id", "b", "getCacheKey", "cacheKey", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GLProgram {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLProgram$Companion;", "", "", "vs", "fs", "", "cacheKey", "(Ljava/lang/String;Ljava/lang/String;)I", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int cacheKey(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "vs");
            Intrinsics.checkNotNullParameter(s1, "fs");
            return (s + s1).hashCode();
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public boolean c;

    static {
        GLProgram.Companion = new Companion(null);
    }

    public GLProgram(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "vertexShaderCode");
        Intrinsics.checkNotNullParameter(s1, "fragmentShaderCode");
        super();
        Logger logger0 = Logger.INSTANCE;
        logger0.log("glProgram init");
        int v = GLProgram.a(0x8B31, s);
        int v1 = GLProgram.a(0x8B30, s1);
        int v2 = GLES20.glCreateProgram();
        this.a = v2;
        GLES20.glAttachShader(v2, v);
        GLES20.glAttachShader(v2, v1);
        GLES20.glLinkProgram(v2);
        GLES20.glDeleteShader(v);
        GLES20.glDeleteShader(v1);
        int[] arr_v = new int[1];
        GLES20.glGetProgramiv(v2, 0x8B82, arr_v, 0);
        if(ArraysKt___ArraysKt.first(arr_v) != 0) {
            this.c = true;
            this.b = GLProgram.Companion.cacheKey(s, s1);
            return;
        }
        String s2 = GLES20.glGetProgramInfoLog(v2);
        Intrinsics.checkNotNullExpressionValue(s2, "glGetProgramInfoLog(...)");
        logger0.error(s2);
        GLES20.glDeleteProgram(v2);
        throw new RuntimeException("program link fail com.kakao.kandinsky.core.filter.gl.GLProgram");
    }

    public static int a(int v, String s) {
        int v1 = GLES20.glCreateShader(v);
        GLES20.glShaderSource(v1, s);
        GLES20.glCompileShader(v1);
        int[] arr_v = new int[1];
        GLES20.glGetShaderiv(v1, 0x8B81, arr_v, 0);
        if(ArraysKt___ArraysKt.first(arr_v) != 0) {
            return v1;
        }
        String s1 = GLES20.glGetShaderInfoLog(v1);
        Intrinsics.checkNotNullExpressionValue(s1, "glGetShaderInfoLog(...)");
        Logger.INSTANCE.error(s1);
        StringBuilder stringBuilder0 = q.u("Invalid shader ", v1, " ", v, " ");
        stringBuilder0.append(s);
        throw new RuntimeException(stringBuilder0.toString());
    }

    public final int attribLocation(@Nullable String s) {
        return GLES20.glGetAttribLocation(this.a, s);
    }

    public final void delete() {
        if(this.c) {
            GLES20.glDeleteProgram(this.a);
            this.c = false;
        }
    }

    public final int getCacheKey() {
        return this.b;
    }

    public final int getId() {
        return this.a;
    }

    public final int uniformLocation(@Nullable String s) {
        return GLES20.glGetUniformLocation(this.a, s);
    }

    public final void use() {
        GLES20.glUseProgram(this.a);
    }
}

