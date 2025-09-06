package com.kakao.kandinsky.core.filter.gl;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.kakao.kandinsky.core.filter.core.RenderTarget;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\u000B\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\bJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\bR\u0017\u0010\u0015\u001A\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0014¨\u0006\u001A"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLFrameBuffer;", "Lcom/kakao/kandinsky/core/filter/core/RenderTarget;", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "glTexture", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;)V", "", "bind", "()V", "unBind", "attachTexture", "detachTexture", "Landroid/graphics/Bitmap;", "capture", "()Landroid/graphics/Bitmap;", "delete", "", "b", "I", "getId", "()I", "id", "getWidth", "width", "getHeight", "height", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GLFrameBuffer implements RenderTarget {
    public GLTexture a;
    public final int b;

    public GLFrameBuffer() {
        this(null, 1, null);
    }

    public GLFrameBuffer(@Nullable GLTexture gLTexture0) {
        this.a = gLTexture0;
        int[] arr_v = new int[1];
        GLES20.glGenFramebuffers(1, arr_v, 0);
        this.b = ArraysKt___ArraysKt.first(arr_v);
        GLTexture gLTexture1 = this.a;
        if(gLTexture1 != null) {
            this.attachTexture(gLTexture1);
        }
    }

    public GLFrameBuffer(GLTexture gLTexture0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            gLTexture0 = null;
        }
        this(gLTexture0);
    }

    public final void attachTexture(@NotNull GLTexture gLTexture0) {
        Intrinsics.checkNotNullParameter(gLTexture0, "glTexture");
        this.a = gLTexture0;
        this.bind();
        GLES20.glFramebufferTexture2D(0x8D40, 0x8CE0, gLTexture0.getTarget(), gLTexture0.getId(), 0);
        GLTools.checkGLFramebufferError$default(GLTools.INSTANCE, "GLFramebuffer::attachTexture", false, 2, null);
        this.unBind();
    }

    @Override  // com.kakao.kandinsky.core.filter.core.RenderTarget
    public void bind() {
        GLES20.glBindFramebuffer(0x8D40, this.b);
        GLES20.glViewport(0, 0, this.getWidth(), this.getHeight());
    }

    @NotNull
    public final Bitmap capture() {
        this.bind();
        int v = this.getWidth();
        int v1 = this.getHeight();
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v * v1 * 4).order(ByteOrder.LITTLE_ENDIAN);
        GLES20.glReadPixels(0, 0, v, v1, 6408, 0x1401, byteBuffer0);
        byteBuffer0.rewind();
        Intrinsics.checkNotNull(byteBuffer0);
        Bitmap bitmap0 = Bitmap.createBitmap(this.getWidth(), this.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap0, "createBitmap(...)");
        bitmap0.copyPixelsFromBuffer(byteBuffer0);
        return bitmap0;
    }

    public final void delete() {
        GLES20.glDeleteFramebuffers(1, new int[]{this.b}, 0);
    }

    public final void detachTexture() {
        GLTexture gLTexture0 = this.a;
        if(gLTexture0 != null) {
            this.bind();
            GLES20.glFramebufferTexture2D(0x8D40, 0x8CE0, gLTexture0.getTarget(), 0, 0);
            GLTools.checkGLFramebufferError$default(GLTools.INSTANCE, "GLFramebuffer::detachTexture", false, 2, null);
            this.unBind();
        }
        this.a = null;
    }

    @Override  // com.kakao.kandinsky.core.filter.core.RenderTarget
    public int getHeight() {
        return this.a == null ? 0 : this.a.getHeight();
    }

    public final int getId() {
        return this.b;
    }

    @Override  // com.kakao.kandinsky.core.filter.core.RenderTarget
    public int getWidth() {
        return this.a == null ? 0 : this.a.getWidth();
    }

    @Override  // com.kakao.kandinsky.core.filter.core.RenderTarget
    public void unBind() {
        GLES20.glBindFramebuffer(0x8D40, 0);
    }
}

