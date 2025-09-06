package com.kakao.kandinsky.core.filter.gl;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B%\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u001B\b\u0016\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\fJ\r\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\r¢\u0006\u0004\b\u0010\u0010\u000FJ\r\u0010\u0011\u001A\u00020\r¢\u0006\u0004\b\u0011\u0010\u000F¨\u0006\u0013"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLArrayBuffer;", "", "", "data", "", "offset", "count", "<init>", "([FII)V", "Ljava/nio/Buffer;", "bufferData", "usage", "(Ljava/nio/Buffer;I)V", "", "bind", "()V", "unBind", "delete", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GLArrayBuffer {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLArrayBuffer$Companion;", "", "", "BYTES_PER_FLOAT", "I", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;

    static {
        GLArrayBuffer.Companion = new Companion(null);
    }

    public GLArrayBuffer(@NotNull Buffer buffer0, int v) {
        Intrinsics.checkNotNullParameter(buffer0, "bufferData");
        super();
        int[] arr_v = new int[1];
        GLES20.glGenBuffers(1, arr_v, 0);
        int v1 = ArraysKt___ArraysKt.first(arr_v);
        this.a = v1;
        if(v1 == 0) {
            throw new RuntimeException("Could not create a new buffer object.");
        }
        this.bind();
        GLES20.glBufferData(0x8892, buffer0.capacity() * 4, buffer0, v);
        this.unBind();
    }

    public GLArrayBuffer(Buffer buffer0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 35044;
        }
        this(buffer0, v);
    }

    public GLArrayBuffer(@NotNull float[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "data");
        FloatBuffer floatBuffer0 = ByteBuffer.allocateDirect(arr_f.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        if(v1 <= 0) {
            v1 = arr_f.length;
        }
        Buffer buffer0 = floatBuffer0.put(arr_f, v, v1).position(0);
        Intrinsics.checkNotNullExpressionValue(buffer0, "position(...)");
        this(buffer0, 0, 2, null);
    }

    public GLArrayBuffer(float[] arr_f, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        this(arr_f, v, v1);
    }

    public final void bind() {
        GLES20.glBindBuffer(0x8892, this.a);
    }

    public final void delete() {
        GLES20.glDeleteBuffers(1, new int[]{this.a}, 0);
    }

    public final void unBind() {
        GLES20.glBindBuffer(0x8892, 0);
    }
}

