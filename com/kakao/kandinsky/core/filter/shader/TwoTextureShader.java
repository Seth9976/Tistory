package com.kakao.kandinsky.core.filter.shader;

import android.opengl.GLES20;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.gl.TextureMesh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0014¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0013\u001A\u00020\n8&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/TwoTextureShader;", "Lcom/kakao/kandinsky/core/filter/shader/TextureShader;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "Lcom/kakao/kandinsky/core/filter/gl/TextureMesh;", "mesh", "", "fs", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Lcom/kakao/kandinsky/core/filter/gl/TextureMesh;Ljava/lang/String;)V", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "inputTexture", "", "intensity", "", "bind", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;F)V", "getInputTexture2", "()Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "inputTexture2", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class TwoTextureShader extends TextureShader {
    public final int l;

    public TwoTextureShader(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull TextureMesh textureMesh0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(textureMesh0, "mesh");
        Intrinsics.checkNotNullParameter(s, "fs");
        super(gLResourcesProvider0, textureMesh0, s, null, 8, null);
        this.l = this.getProgram().uniformLocation("inputTexture2");
    }

    @Override  // com.kakao.kandinsky.core.filter.shader.TextureShader
    public void bind(@NotNull GLTexture gLTexture0, float f) {
        Intrinsics.checkNotNullParameter(gLTexture0, "inputTexture");
        super.bind(gLTexture0, f);
        GLES20.glActiveTexture(0x84C1);
        GLES20.glBindTexture(this.getInputTexture2().getTarget(), this.getInputTexture2().getId());
        GLES20.glUniform1i(this.l, 1);
    }

    @NotNull
    public abstract GLTexture getInputTexture2();
}

