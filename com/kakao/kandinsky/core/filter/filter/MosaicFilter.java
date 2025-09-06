package com.kakao.kandinsky.core.filter.filter;

import android.util.Size;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.shader.MosaicShader;
import com.kakao.kandinsky.core.filter.shader.TextureShader;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001A\u0010\u000F\u001A\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/MosaicFilter;", "Lcom/kakao/kandinsky/core/filter/filter/BaseFilter;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "position", "Landroid/util/Size;", "originBitmapSize", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Lcom/kakao/kandinsky/core/kdphoto/Mosaic;Landroid/util/Size;)V", "Lcom/kakao/kandinsky/core/filter/shader/MosaicShader;", "c", "Lcom/kakao/kandinsky/core/filter/shader/MosaicShader;", "getShader", "()Lcom/kakao/kandinsky/core/filter/shader/MosaicShader;", "shader", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MosaicFilter extends BaseFilter {
    public final MosaicShader c;

    public MosaicFilter(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull Mosaic mosaic0, @NotNull Size size0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(mosaic0, "position");
        Intrinsics.checkNotNullParameter(size0, "originBitmapSize");
        super(gLResourcesProvider0);
        this.c = new MosaicShader(gLResourcesProvider0, mosaic0, size0);
    }

    @NotNull
    public MosaicShader getShader() {
        return this.c;
    }

    @Override  // com.kakao.kandinsky.core.filter.filter.BaseFilter
    public TextureShader getShader() {
        return this.getShader();
    }
}

