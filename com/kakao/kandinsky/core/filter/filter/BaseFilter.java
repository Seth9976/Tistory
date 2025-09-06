package com.kakao.kandinsky.core.filter.filter;

import android.graphics.Bitmap;
import android.util.Size;
import androidx.annotation.CallSuper;
import com.kakao.kandinsky.core.filter.gl.GLFrameBuffer;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.shader.TextureShader;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\n\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001A\u00020\u00168&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/BaseFilter;", "", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;)V", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "input", "", "intensity", "execute", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;F)Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "Landroid/util/Size;", "inputSize", "calculatorOutputSize", "(Landroid/util/Size;)Landroid/util/Size;", "Landroid/graphics/Bitmap;", "capture", "()Landroid/graphics/Bitmap;", "", "release", "()V", "Lcom/kakao/kandinsky/core/filter/shader/TextureShader;", "getShader", "()Lcom/kakao/kandinsky/core/filter/shader/TextureShader;", "shader", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BaseFilter {
    public final GLResourcesProvider a;
    public final GLFrameBuffer b;

    public BaseFilter(@NotNull GLResourcesProvider gLResourcesProvider0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        super();
        this.a = gLResourcesProvider0;
        this.b = new GLFrameBuffer(null, 1, null);
    }

    @NotNull
    public Size calculatorOutputSize(@NotNull Size size0) {
        Intrinsics.checkNotNullParameter(size0, "inputSize");
        return size0;
    }

    @NotNull
    public final Bitmap capture() {
        return this.b.capture();
    }

    @NotNull
    public final GLTexture execute(@NotNull GLTexture gLTexture0, float f) {
        Intrinsics.checkNotNullParameter(gLTexture0, "input");
        String s = this.getClass().getName();
        Logger.INSTANCE.log("filter execute " + s + " " + gLTexture0.getId());
        Size size0 = this.calculatorOutputSize(gLTexture0.getSize());
        int v = size0.getWidth();
        int v1 = size0.getHeight();
        GLTexture gLTexture1 = this.a.acquireTexture(v, v1);
        this.b.attachTexture(gLTexture1);
        this.b.bind();
        this.getShader().draw(gLTexture0, size0, f);
        return gLTexture1;
    }

    public static GLTexture execute$default(BaseFilter baseFilter0, GLTexture gLTexture0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if((v & 2) != 0) {
            f = 1.0f;
        }
        return baseFilter0.execute(gLTexture0, f);
    }

    @NotNull
    public abstract TextureShader getShader();

    @CallSuper
    public void release() {
        this.getShader().release();
        this.b.delete();
    }
}

