package com.kakao.kandinsky.core.filter.shader;

import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.gl.TextureMesh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/LookupShader;", "Lcom/kakao/kandinsky/core/filter/shader/TwoTextureShader;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "inputTexture2", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Lcom/kakao/kandinsky/core/filter/gl/GLTexture;)V", "m", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "getInputTexture2", "()Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LookupShader extends TwoTextureShader {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/LookupShader$Companion;", "", "", "FSH", "Ljava/lang/String;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final GLTexture m;
    public static final String n;

    static {
        LookupShader.Companion = new Companion(null);
        LookupShader.n = "precision mediump float;\n\nuniform sampler2D texOrigin;\nuniform sampler2D inputTexture2;\nuniform float intensity;\n\nvarying vec2 v_texCoord;\n\nvoid main() {\n    vec4 color = texture2D(texOrigin, v_texCoord);\n    highp float blueColor = color.b * 63.0;\n    highp vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n\n    highp vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * color.r);\n    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * color.g);\n\n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * color.r);\n    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * color.g);\n\n    lowp vec4 newColor1 = texture2D(inputTexture2, texPos1);\n    lowp vec4 newColor2 = texture2D(inputTexture2, texPos2);\n\n    lowp vec4 resultColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(color, resultColor, intensity);\n}";
    }

    public LookupShader(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull GLTexture gLTexture0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(gLTexture0, "inputTexture2");
        super(gLResourcesProvider0, new TextureMesh(null, 1, null), "precision mediump float;\n\nuniform sampler2D texOrigin;\nuniform sampler2D inputTexture2;\nuniform float intensity;\n\nvarying vec2 v_texCoord;\n\nvoid main() {\n    vec4 color = texture2D(texOrigin, v_texCoord);\n    highp float blueColor = color.b * 63.0;\n    highp vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n\n    highp vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * color.r);\n    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * color.g);\n\n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * color.r);\n    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * color.g);\n\n    lowp vec4 newColor1 = texture2D(inputTexture2, texPos1);\n    lowp vec4 newColor2 = texture2D(inputTexture2, texPos2);\n\n    lowp vec4 resultColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(color, resultColor, intensity);\n}");
        this.m = gLTexture0;
    }

    @Override  // com.kakao.kandinsky.core.filter.shader.TwoTextureShader
    @NotNull
    public GLTexture getInputTexture2() {
        return this.m;
    }
}

