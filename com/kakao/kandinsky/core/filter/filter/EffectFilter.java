package com.kakao.kandinsky.core.filter.filter;

import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.shader.EffectShader;
import com.kakao.kandinsky.core.filter.shader.TextureShader;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001A\u0010\u0010\u001A\u00020\u000B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/EffectFilter;", "Lcom/kakao/kandinsky/core/filter/filter/BaseFilter;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;)V", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "effect", "", "updateEffect", "(Lcom/kakao/kandinsky/core/kdphoto/Effect;)V", "Lcom/kakao/kandinsky/core/filter/shader/EffectShader;", "c", "Lcom/kakao/kandinsky/core/filter/shader/EffectShader;", "getShader", "()Lcom/kakao/kandinsky/core/filter/shader/EffectShader;", "shader", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EffectFilter extends BaseFilter {
    public final EffectShader c;

    public EffectFilter(@NotNull GLResourcesProvider gLResourcesProvider0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        super(gLResourcesProvider0);
        this.c = new EffectShader(gLResourcesProvider0);
    }

    @NotNull
    public EffectShader getShader() {
        return this.c;
    }

    @Override  // com.kakao.kandinsky.core.filter.filter.BaseFilter
    public TextureShader getShader() {
        return this.getShader();
    }

    public final void updateEffect(@NotNull Effect effect0) {
        Intrinsics.checkNotNullParameter(effect0, "effect");
        Logger.INSTANCE.log("update effect " + effect0);
        this.getShader().setEffect(effect0);
    }
}

