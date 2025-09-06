package com.kakao.kandinsky.core.filter.shader;

import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.TextureMesh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/TexturePassShader;", "Lcom/kakao/kandinsky/core/filter/shader/TextureShader;", "glResourcesProvider", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "useExternalTexture", "", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Z)V", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TexturePassShader extends TextureShader {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/TexturePassShader$Companion;", "", "", "FRAGMENT_SHADER", "Ljava/lang/String;", "FRAGMENT_SHADER_EXTERNAL", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final String l;
    public static final String m;

    static {
        TexturePassShader.Companion = new Companion(null);
        TexturePassShader.l = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texOrigin;\nvarying vec2 v_texCoord;\nvoid main() {\n    gl_FragColor = texture2D(texOrigin, v_texCoord);\n}";
        TexturePassShader.m = "precision mediump float;\nuniform sampler2D texOrigin;\nvarying  vec2 v_texCoord;\nvoid main() {\n    gl_FragColor = texture2D(texOrigin, v_texCoord);\n}";
    }

    // 去混淆评级： 低(20)
    public TexturePassShader(@NotNull GLResourcesProvider gLResourcesProvider0, boolean z) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        super(gLResourcesProvider0, new TextureMesh(null, 1, null), (z ? "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texOrigin;\nvarying vec2 v_texCoord;\nvoid main() {\n    gl_FragColor = texture2D(texOrigin, v_texCoord);\n}" : "precision mediump float;\nuniform sampler2D texOrigin;\nvarying  vec2 v_texCoord;\nvoid main() {\n    gl_FragColor = texture2D(texOrigin, v_texCoord);\n}"), null, 8, null);
    }

    public TexturePassShader(GLResourcesProvider gLResourcesProvider0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(gLResourcesProvider0, z);
    }
}

