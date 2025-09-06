package com.kakao.kandinsky.core.filter.filter;

import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.shader.TexturePassShader;
import com.kakao.kandinsky.core.filter.shader.TextureShader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u000B\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/PassFilter;", "Lcom/kakao/kandinsky/core/filter/filter/BaseFilter;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;)V", "Lcom/kakao/kandinsky/core/filter/shader/TexturePassShader;", "c", "Lcom/kakao/kandinsky/core/filter/shader/TexturePassShader;", "getShader", "()Lcom/kakao/kandinsky/core/filter/shader/TexturePassShader;", "shader", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PassFilter extends BaseFilter {
    public final TexturePassShader c;

    public PassFilter(@NotNull GLResourcesProvider gLResourcesProvider0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        super(gLResourcesProvider0);
        this.c = new TexturePassShader(gLResourcesProvider0, false, 2, null);
    }

    @NotNull
    public TexturePassShader getShader() {
        return this.c;
    }

    @Override  // com.kakao.kandinsky.core.filter.filter.BaseFilter
    public TextureShader getShader() {
        return this.getShader();
    }
}

