package com.kakao.kandinsky.core.filter.gl;

import android.opengl.GLES20;
import android.util.Size;
import com.kakao.kandinsky.core.filter.core.Texture;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 %2\u00020\u0001:\u0001%B1\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0004¢\u0006\u0004\b\u000E\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000BH\u0004¢\u0006\u0004\b\u000F\u0010\rJ\u000F\u0010\u0010\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0010\u0010\rR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0004\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001A\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001A\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001A\u0004\b\u001A\u0010\u0014R\u0017\u0010\u001D\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0012\u001A\u0004\b\u001C\u0010\u0014R\u0017\u0010 \u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u0012\u001A\u0004\b\u001F\u0010\u0014R\u0011\u0010$\u001A\u00020!8F¢\u0006\u0006\u001A\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "Lcom/kakao/kandinsky/core/filter/core/Texture;", "", "width", "height", "format", "type", "", "isOesTexture", "<init>", "(IIIIZ)V", "", "updateTexParameters", "()V", "bind", "unBind", "delete", "a", "I", "getWidth", "()I", "b", "getHeight", "c", "getFormat", "d", "getType", "e", "getId", "id", "f", "getTarget", "target", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "size", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class GLTexture implements Texture {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLTexture$Companion;", "", "", "width", "height", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "create", "(II)Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final GLTexture create(int v, int v1) {
            return new GLBufferTexture(v, v1, null, 0, 0, false, 60, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    static {
        GLTexture.Companion = new Companion(null);
    }

    public GLTexture(int v, int v1, int v2, int v3, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        String s = "texture create " + this.getClass().getSimpleName();
        Logger.INSTANCE.log(s);
        int[] arr_v = new int[1];
        GLES20.glGenTextures(1, arr_v, 0);
        this.e = ArraysKt___ArraysKt.first(arr_v);
        this.f = z ? 0x8D65 : 0xDE1;
    }

    public GLTexture(int v, int v1, int v2, int v3, boolean z, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v4 & 16) != 0) {
            z = false;
        }
        this(v, v1, v2, v3, z);
    }

    public final void bind() {
        GLES20.glBindTexture(this.f, this.e);
    }

    @Override  // com.kakao.kandinsky.core.filter.core.Texture
    public void delete() {
        GLES20.glDeleteTextures(1, new int[]{this.e}, 0);
    }

    public final int getFormat() {
        return this.c;
    }

    @Override  // com.kakao.kandinsky.core.filter.core.Texture
    public int getHeight() {
        return this.b;
    }

    @Override  // com.kakao.kandinsky.core.filter.core.Texture
    public final int getId() {
        return this.e;
    }

    @NotNull
    public final Size getSize() {
        return new Size(this.getWidth(), this.getHeight());
    }

    public final int getTarget() {
        return this.f;
    }

    public final int getType() {
        return this.d;
    }

    @Override  // com.kakao.kandinsky.core.filter.core.Texture
    public int getWidth() {
        return this.a;
    }

    public final void unBind() {
        GLES20.glBindTexture(this.f, 0);
    }

    public final void updateTexParameters() {
        GLES20.glTexParameteri(0xDE1, 0x2801, 0x2601);
        GLES20.glTexParameteri(0xDE1, 0x2800, 0x2601);
        GLES20.glTexParameteri(0xDE1, 0x2802, 0x812F);
        GLES20.glTexParameteri(0xDE1, 0x2803, 0x812F);
    }
}

