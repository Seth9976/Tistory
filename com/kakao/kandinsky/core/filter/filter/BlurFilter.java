package com.kakao.kandinsky.core.filter.filter;

import android.util.Size;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.shader.BlurShader;
import com.kakao.kandinsky.core.filter.shader.TextureShader;
import com.kakao.kandinsky.core.kdphoto.Blur;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BR\u001A\u0010\u0011\u001A\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/BlurFilter;", "Lcom/kakao/kandinsky/core/filter/filter/BaseFilter;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "blur", "Landroid/util/Size;", "originBitmapSize", "", "index", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Lcom/kakao/kandinsky/core/kdphoto/Blur;Landroid/util/Size;I)V", "Lcom/kakao/kandinsky/core/filter/shader/BlurShader;", "c", "Lcom/kakao/kandinsky/core/filter/shader/BlurShader;", "getShader", "()Lcom/kakao/kandinsky/core/filter/shader/BlurShader;", "shader", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlurFilter extends BaseFilter {
    public final BlurShader c;

    public BlurFilter(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull Blur blur0, @NotNull Size size0, int v) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(blur0, "blur");
        Intrinsics.checkNotNullParameter(size0, "originBitmapSize");
        super(gLResourcesProvider0);
        this.c = new BlurShader(gLResourcesProvider0, blur0, size0, v);
    }

    @NotNull
    public BlurShader getShader() {
        return this.c;
    }

    @Override  // com.kakao.kandinsky.core.filter.filter.BaseFilter
    public TextureShader getShader() {
        return this.getShader();
    }
}

