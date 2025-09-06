package com.kakao.kandinsky.core.filter.gl;

import android.graphics.Bitmap;
import android.opengl.GLUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLBitmapTexture;", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GLBitmapTexture extends GLTexture {
    public GLBitmapTexture(@NotNull Bitmap bitmap0) {
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        super(bitmap0.getWidth(), bitmap0.getHeight(), GLUtils.getInternalFormat(bitmap0), GLUtils.getType(bitmap0), false, 16, null);
        this.bind();
        this.updateTexParameters();
        GLUtils.texImage2D(this.getTarget(), 0, bitmap0, 0);
        this.unBind();
        GLTools.checkGLError$default(GLTools.INSTANCE, null, false, 3, null);
    }
}

