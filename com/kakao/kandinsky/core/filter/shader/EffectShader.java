package com.kakao.kandinsky.core.filter.shader;

import android.opengl.GLES20;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.gl.TextureMesh;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0014¢\u0006\u0004\b\u000B\u0010\fR\"\u0010\u0014\u001A\u00020\r8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/EffectShader;", "Lcom/kakao/kandinsky/core/filter/shader/TextureShader;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;)V", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "inputTexture", "", "intensity", "", "bind", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;F)V", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "q", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "getEffect", "()Lcom/kakao/kandinsky/core/kdphoto/Effect;", "setEffect", "(Lcom/kakao/kandinsky/core/kdphoto/Effect;)V", "effect", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EffectShader extends TextureShader {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/EffectShader$Companion;", "", "", "FRAGMENT_SHADER", "Ljava/lang/String;", "UNIFORM_BRIGHTNESS", "UNIFORM_CONTRAST", "UNIFORM_SATURATION", "UNIFORM_TEMPERATURE", "UNIFORM_VIGNETTE", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public Effect q;
    public static final String r;

    static {
        EffectShader.Companion = new Companion(null);
        EffectShader.r = "precision mediump float;\n\nuniform sampler2D texOrigin;\nuniform float brightness;\nuniform float contrast;\nuniform float saturation;\nuniform float temperature;\nuniform float vignette;\n\nvarying vec2 v_texCoord;\n\nvec3 vec3Pow(float base,vec3 exponent) {\n    return vec3(pow(base, exponent.r), pow(base, exponent.g), pow(base, exponent.b));\n}\nvec3 vec3Pow(vec3 base,float exponent) {\n    return vec3(pow(base.r, exponent), pow(base.g, exponent), pow(base.b, exponent));\n}\n\nvec3 calculatorBrightness(vec3 color, float value) {\n    if (value == 0.0) return color;\n    \n    float max = 0.2;\n    float intensity = value * max;\n    \n    vec3 result = color;\n    if (intensity > 0.01) {\n        result =  color + log(8.0 * intensity + 1.0) * 0.455;\n    } else if (intensity < -0.01) {\n        result = color *  vec3Pow (1.0 + intensity, 1.0 / (5.0 * vec3Pow(color, 5.0)));\n    }\n    \n    return clamp(result, vec3(0.0), vec3(1.0));\n}\n\nfloat calculateContrastValue(float intensity, float color) {    \n    float middle = 0.7373;\n    float high = 0.92;\n    float exponent = 1.0;\n    if (color < middle) exponent = 1.7;\n    \n    float result = (color - middle) * pow(intensity + 1.0, exponent) + middle;\n    return clamp(min(max(high, color), result), 0.0, 1.0);\n}\n\nvec3 calculatorContrast(vec3 color, float value) {\n    if (value == 0.0) return color;\n    \n    float max = 0.2;\n    float intensity = value * max;\n    \n    return vec3(calculateContrastValue(intensity, color.r),\n                calculateContrastValue(intensity, color.g),\n                calculateContrastValue(intensity, color.b));\n}\n\nvec3 calculatorSaturation(vec3 color, float value) {\n    if (value == 0.0) return color;\n    \n    float max = 1.0;\n    float intensity = value * max;\n    \n    float gray = dot(vec3(0.37316710344, 0.6744350783, -0.04760218174), color);\n    \n    return clamp(vec3(mix(color, vec3(gray), -value)), vec3(0.0), vec3(1.0));\n}\n\nvec3 colorTemperatureToRGB(const in float temperature){\n    mat3 m = (temperature <= 6500.0) ?  mat3(vec3(0.0, -2902.2, -8257.8),\n\t                                         vec3(0.0, 1669.6, 2575.3),\n\t                                         vec3(1.0, 1.3, 1.9)) : \n\t \t\t\t\t\t\t\t\t    mat3(vec3(1745.0, 1216.6, -8257.8),\n   \t                                         vec3(-2666.3, -2173.1, 2575.3),\n\t                                         vec3(0.6, 0.7, 1.9)); \n    return mix(\n        clamp(vec3(m[0] / (vec3(clamp(temperature, 1000.0, 40000.0)) + m[1])+ m[2]), vec3(0.0), vec3(1.0)), \n              vec3(1.0), smoothstep(1000.0, 0.0, temperature));\n}\n\nvec3 calculatorTemperature(vec3 color, float value) {\n    if (value == 0.0) return color;\n    \n    float intensity = -value;\n    if (value > 0.0) {\n        intensity *= 1000.0;\n    } else {\n        intensity *= 9000.0;\n    }\n    \n    intensity += 6500.0;\n\n    vec3 outColor = color * colorTemperatureToRGB(intensity);\n    outColor *= dot(color, vec3(0.2126, 0.7152, 0.0722)) / max(dot(outColor, vec3(0.2126, 0.7152, 0.0722)), 1e-5);\n    \n    return clamp(outColor, vec3(0.0), vec3(1.0));\n}\n\n#define inner .5\n#define outer 1.2\nvec3 calculatorVignette(vec3 color, float value, vec2 uv) {\n    if (value == 0.0) return color;\n    \n    vec2 curve = pow(abs(uv * 2.0 - 1.0), vec2(2.0));\n    float edge = pow(length(curve), 0.5);\n    float vignette = 1.0 - value * smoothstep(inner, outer, edge);\n    \n    return clamp(color * vignette, vec3(0.0), vec3(1.0));\n}\n\nvoid main() {\n    vec4 tex = texture2D(texOrigin, v_texCoord);\n    vec3 color = tex.rgb;\n    \n    color = calculatorBrightness(color, brightness);     // 1. \uBC1D\uAE30\n    color = calculatorSaturation(color, saturation);     // 2. \uCC44\uB3C4\n    color = calculatorTemperature(color, temperature);   // 3. \uC0C9\uC628\uB3C4\n    color = calculatorContrast(color, contrast);         // 4. \uB300\uBE44\n    color = calculatorVignette(color, vignette, v_texCoord); // 5. \uBE44\uB124\uD305\n    \n    gl_FragColor = vec4(color, tex.a);\n}";
    }

    public EffectShader(@NotNull GLResourcesProvider gLResourcesProvider0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        super(gLResourcesProvider0, new TextureMesh(null, 1, null), "precision mediump float;\n\nuniform sampler2D texOrigin;\nuniform float brightness;\nuniform float contrast;\nuniform float saturation;\nuniform float temperature;\nuniform float vignette;\n\nvarying vec2 v_texCoord;\n\nvec3 vec3Pow(float base,vec3 exponent) {\n    return vec3(pow(base, exponent.r), pow(base, exponent.g), pow(base, exponent.b));\n}\nvec3 vec3Pow(vec3 base,float exponent) {\n    return vec3(pow(base.r, exponent), pow(base.g, exponent), pow(base.b, exponent));\n}\n\nvec3 calculatorBrightness(vec3 color, float value) {\n    if (value == 0.0) return color;\n    \n    float max = 0.2;\n    float intensity = value * max;\n    \n    vec3 result = color;\n    if (intensity > 0.01) {\n        result =  color + log(8.0 * intensity + 1.0) * 0.455;\n    } else if (intensity < -0.01) {\n        result = color *  vec3Pow (1.0 + intensity, 1.0 / (5.0 * vec3Pow(color, 5.0)));\n    }\n    \n    return clamp(result, vec3(0.0), vec3(1.0));\n}\n\nfloat calculateContrastValue(float intensity, float color) {    \n    float middle = 0.7373;\n    float high = 0.92;\n    float exponent = 1.0;\n    if (color < middle) exponent = 1.7;\n    \n    float result = (color - middle) * pow(intensity + 1.0, exponent) + middle;\n    return clamp(min(max(high, color), result), 0.0, 1.0);\n}\n\nvec3 calculatorContrast(vec3 color, float value) {\n    if (value == 0.0) return color;\n    \n    float max = 0.2;\n    float intensity = value * max;\n    \n    return vec3(calculateContrastValue(intensity, color.r),\n                calculateContrastValue(intensity, color.g),\n                calculateContrastValue(intensity, color.b));\n}\n\nvec3 calculatorSaturation(vec3 color, float value) {\n    if (value == 0.0) return color;\n    \n    float max = 1.0;\n    float intensity = value * max;\n    \n    float gray = dot(vec3(0.37316710344, 0.6744350783, -0.04760218174), color);\n    \n    return clamp(vec3(mix(color, vec3(gray), -value)), vec3(0.0), vec3(1.0));\n}\n\nvec3 colorTemperatureToRGB(const in float temperature){\n    mat3 m = (temperature <= 6500.0) ?  mat3(vec3(0.0, -2902.2, -8257.8),\n\t                                         vec3(0.0, 1669.6, 2575.3),\n\t                                         vec3(1.0, 1.3, 1.9)) : \n\t \t\t\t\t\t\t\t\t    mat3(vec3(1745.0, 1216.6, -8257.8),\n   \t                                         vec3(-2666.3, -2173.1, 2575.3),\n\t                                         vec3(0.6, 0.7, 1.9)); \n    return mix(\n        clamp(vec3(m[0] / (vec3(clamp(temperature, 1000.0, 40000.0)) + m[1])+ m[2]), vec3(0.0), vec3(1.0)), \n              vec3(1.0), smoothstep(1000.0, 0.0, temperature));\n}\n\nvec3 calculatorTemperature(vec3 color, float value) {\n    if (value == 0.0) return color;\n    \n    float intensity = -value;\n    if (value > 0.0) {\n        intensity *= 1000.0;\n    } else {\n        intensity *= 9000.0;\n    }\n    \n    intensity += 6500.0;\n\n    vec3 outColor = color * colorTemperatureToRGB(intensity);\n    outColor *= dot(color, vec3(0.2126, 0.7152, 0.0722)) / max(dot(outColor, vec3(0.2126, 0.7152, 0.0722)), 1e-5);\n    \n    return clamp(outColor, vec3(0.0), vec3(1.0));\n}\n\n#define inner .5\n#define outer 1.2\nvec3 calculatorVignette(vec3 color, float value, vec2 uv) {\n    if (value == 0.0) return color;\n    \n    vec2 curve = pow(abs(uv * 2.0 - 1.0), vec2(2.0));\n    float edge = pow(length(curve), 0.5);\n    float vignette = 1.0 - value * smoothstep(inner, outer, edge);\n    \n    return clamp(color * vignette, vec3(0.0), vec3(1.0));\n}\n\nvoid main() {\n    vec4 tex = texture2D(texOrigin, v_texCoord);\n    vec3 color = tex.rgb;\n    \n    color = calculatorBrightness(color, brightness);     // 1. \uBC1D\uAE30\n    color = calculatorSaturation(color, saturation);     // 2. \uCC44\uB3C4\n    color = calculatorTemperature(color, temperature);   // 3. \uC0C9\uC628\uB3C4\n    color = calculatorContrast(color, contrast);         // 4. \uB300\uBE44\n    color = calculatorVignette(color, vignette, v_texCoord); // 5. \uBE44\uB124\uD305\n    \n    gl_FragColor = vec4(color, tex.a);\n}", null, 8, null);
        this.l = this.getProgram().uniformLocation("brightness");
        this.m = this.getProgram().uniformLocation("contrast");
        this.n = this.getProgram().uniformLocation("saturation");
        this.o = this.getProgram().uniformLocation("temperature");
        this.p = this.getProgram().uniformLocation("vignette");
        this.q = Effect.Companion.getDefault();
    }

    @Override  // com.kakao.kandinsky.core.filter.shader.TextureShader
    public void bind(@NotNull GLTexture gLTexture0, float f) {
        Intrinsics.checkNotNullParameter(gLTexture0, "inputTexture");
        super.bind(gLTexture0, f);
        Logger.INSTANCE.log("bind " + this.q + " " + this.l + ", " + this.m + ", " + this.n + ", " + this.o + ", " + this.p);
        GLES20.glUniform1f(this.l, this.q.getBrightness());
        GLES20.glUniform1f(this.m, this.q.getContrast());
        GLES20.glUniform1f(this.n, this.q.getSaturation());
        GLES20.glUniform1f(this.o, this.q.getTemperature());
        GLES20.glUniform1f(this.p, this.q.getVignette());
    }

    @NotNull
    public final Effect getEffect() {
        return this.q;
    }

    public final void setEffect(@NotNull Effect effect0) {
        Intrinsics.checkNotNullParameter(effect0, "<set-?>");
        this.q = effect0;
    }
}

