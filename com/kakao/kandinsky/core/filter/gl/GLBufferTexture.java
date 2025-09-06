package com.kakao.kandinsky.core.filter.gl;

import android.opengl.GLES20;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0003\u0012\b\b\u0002\u0010\b\u001A\u00020\u0003\u0012\b\b\u0002\u0010\t\u001A\u00020\n¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLBufferTexture;", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "width", "", "height", "buffer", "Ljava/nio/Buffer;", "format", "type", "isOesTexture", "", "(IILjava/nio/Buffer;IIZ)V", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GLBufferTexture extends GLTexture {
    public GLBufferTexture(int v, int v1, @Nullable Buffer buffer0, int v2, int v3, boolean z) {
        super(v, v1, v2, v3, z);
        this.bind();
        this.updateTexParameters();
        if(!z && v > 0 && v1 > 0) {
            GLES20.glTexImage2D(this.getTarget(), 0, v2, v, v1, 0, v2, v3, buffer0);
        }
        this.unBind();
    }

    public GLBufferTexture(int v, int v1, Buffer buffer0, int v2, int v3, boolean z, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v4 & 4) != 0) {
            buffer0 = null;
        }
        if((v4 & 8) != 0) {
            v2 = 6408;
        }
        if((v4 & 16) != 0) {
            v3 = 0x1401;
        }
        if((v4 & 0x20) != 0) {
            z = false;
        }
        this(v, v1, buffer0, v2, v3, z);
    }
}

