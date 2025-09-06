package com.kakao.kandinsky.core.filter.io;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.shader.TexturePassShader;
import com.kakao.kandinsky.core.filter.shader.TextureShader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fR\"\u0010\u0014\u001A\u00020\r8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/kakao/kandinsky/core/filter/io/SurfaceOutput;", "", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;)V", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "input", "", "execute", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;)V", "delete", "()V", "Landroid/util/Size;", "b", "Landroid/util/Size;", "getOutputSize", "()Landroid/util/Size;", "setOutputSize", "(Landroid/util/Size;)V", "outputSize", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SurfaceOutput {
    public final TexturePassShader a;
    public Size b;

    public SurfaceOutput(@NotNull GLResourcesProvider gLResourcesProvider0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        super();
        this.a = new TexturePassShader(gLResourcesProvider0, false, 2, null);
        this.b = new Size(0, 0);
    }

    public final void delete() {
        this.a.release();
    }

    public final void execute(@NotNull GLTexture gLTexture0) {
        Intrinsics.checkNotNullParameter(gLTexture0, "input");
        if(this.b.getWidth() <= 0 && this.b.getHeight() <= 0) {
            throw new RuntimeException("invalid surfaceOutput.outputSize " + this.b);
        }
        gLTexture0.getSize();
        float[] arr_f = new float[16];
        Matrix.setIdentityM(arr_f, 0);
        Matrix.scaleM(arr_f, 0, 1.0f, -1.0f, 1.0f);
        this.a.setMvpMatrix(arr_f);
        GLES20.glBindFramebuffer(0x8D40, 0);
        TextureShader.draw$default(this.a, gLTexture0, this.b, 0.0f, 4, null);
    }

    @NotNull
    public final Size getOutputSize() {
        return this.b;
    }

    public final void setOutputSize(@NotNull Size size0) {
        Intrinsics.checkNotNullParameter(size0, "<set-?>");
        this.b = size0;
    }
}

