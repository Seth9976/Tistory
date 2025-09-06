package com.kakao.kandinsky.core.filter.shader;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.util.Size;
import android.util.SizeF;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.gl.TextureMesh;
import com.kakao.kandinsky.core.kdphoto.Mosaic.Type;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0014¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/MosaicShader;", "Lcom/kakao/kandinsky/core/filter/shader/TextureShader;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaic", "Landroid/util/Size;", "originBitmapSize", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Lcom/kakao/kandinsky/core/kdphoto/Mosaic;Landroid/util/Size;)V", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "inputTexture", "", "intensity", "", "bind", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;F)V", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MosaicShader extends TextureShader {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/MosaicShader$Companion;", "", "", "FRAGMENT_SHADER", "Ljava/lang/String;", "UNIFORM_POINTER_ARRAY", "UNIFORM_POSITION", "UNIFORM_RESOLUTION", "UNIFORM_TILE_SIZE_RATIO", "UNIFORM_TYPE_IS_CIRCLE", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Mosaic l;
    public final Size m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public static final String s;

    static {
        MosaicShader.Companion = new Companion(null);
        MosaicShader.s = "precision highp float;\n\nuniform sampler2D texOrigin;\nuniform vec2 points[4];\nuniform vec2 position;\nuniform vec2 resolution;\nuniform vec2 tile_size_ratio;\nuniform int isCircle;\n\nvarying vec2 v_texCoord;\n\nfloat sign(vec2 p1, vec2 p2, vec2 p3) {\n  return (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y);\n}\n\nbool pointInTriangle(vec2 pt, vec2 v1, vec2 v2, vec2 v3){\n  float b1 = sign(pt, v1, v2);\n  float b2 = sign(pt, v2, v3);\n  float b3 = sign(pt, v3, v1);\n\n  bool has_neg = (b1 < 0.0) || (b2 < 0.0) || (b3 < 0.0);\n  bool has_pos = (b1 > 0.0) || (b2 > 0.0) || (b3 > 0.0);\n\n  return !(has_neg && has_pos);\n}\n\nbool isInRectangle(vec2 offset){\n    return pointInTriangle(offset, points[0], points[1], points[2]) \n    || pointInTriangle(offset, points[0], points[2], points[3]);\n}\n\nbool isInCircle(vec2 offset){\n    float width = distance(points[0], points[1]);\n    float radius = width / 2.0;\n    \n    float threshold = 0.1;\n      \n    return distance(offset, position) <= radius + threshold;\n}\n\nvoid main() {\n    bool isInArea = false;\n    if(isCircle == 1) { \n        isInArea = isInCircle(gl_FragCoord.xy);\n    } else {\n        isInArea = isInRectangle(gl_FragCoord.xy); \n    }\n    \n    if (isInArea) {\n        const float samplingSize = 6.0;\n        \n        vec2 tileNumber = floor(v_texCoord.xy * (1.0/tile_size_ratio));\n        \n        vec4 accumulator = vec4(0.0);\n        \n        for (float y = 0.0; y < samplingSize; ++y)\n        {\n            for (float x = 0.0; x < samplingSize; ++x)\n            {\n                vec2 textureCoordinates = (tileNumber + vec2((x + 0.5)/samplingSize, (y + 0.5)/samplingSize)) * tile_size_ratio;\n                textureCoordinates.y = textureCoordinates.y;\n                textureCoordinates = clamp(textureCoordinates, 0.0, 1.0);\n                accumulator += texture2D(texOrigin, textureCoordinates);\n           }\n        }\n        \n        gl_FragColor = accumulator / vec4(samplingSize * samplingSize);\n    } else {\n        gl_FragColor = texture2D(texOrigin, v_texCoord);\n    }\n}";
    }

    public MosaicShader(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull Mosaic mosaic0, @NotNull Size size0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(mosaic0, "mosaic");
        Intrinsics.checkNotNullParameter(size0, "originBitmapSize");
        super(gLResourcesProvider0, new TextureMesh(null, 1, null), "precision highp float;\n\nuniform sampler2D texOrigin;\nuniform vec2 points[4];\nuniform vec2 position;\nuniform vec2 resolution;\nuniform vec2 tile_size_ratio;\nuniform int isCircle;\n\nvarying vec2 v_texCoord;\n\nfloat sign(vec2 p1, vec2 p2, vec2 p3) {\n  return (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y);\n}\n\nbool pointInTriangle(vec2 pt, vec2 v1, vec2 v2, vec2 v3){\n  float b1 = sign(pt, v1, v2);\n  float b2 = sign(pt, v2, v3);\n  float b3 = sign(pt, v3, v1);\n\n  bool has_neg = (b1 < 0.0) || (b2 < 0.0) || (b3 < 0.0);\n  bool has_pos = (b1 > 0.0) || (b2 > 0.0) || (b3 > 0.0);\n\n  return !(has_neg && has_pos);\n}\n\nbool isInRectangle(vec2 offset){\n    return pointInTriangle(offset, points[0], points[1], points[2]) \n    || pointInTriangle(offset, points[0], points[2], points[3]);\n}\n\nbool isInCircle(vec2 offset){\n    float width = distance(points[0], points[1]);\n    float radius = width / 2.0;\n    \n    float threshold = 0.1;\n      \n    return distance(offset, position) <= radius + threshold;\n}\n\nvoid main() {\n    bool isInArea = false;\n    if(isCircle == 1) { \n        isInArea = isInCircle(gl_FragCoord.xy);\n    } else {\n        isInArea = isInRectangle(gl_FragCoord.xy); \n    }\n    \n    if (isInArea) {\n        const float samplingSize = 6.0;\n        \n        vec2 tileNumber = floor(v_texCoord.xy * (1.0/tile_size_ratio));\n        \n        vec4 accumulator = vec4(0.0);\n        \n        for (float y = 0.0; y < samplingSize; ++y)\n        {\n            for (float x = 0.0; x < samplingSize; ++x)\n            {\n                vec2 textureCoordinates = (tileNumber + vec2((x + 0.5)/samplingSize, (y + 0.5)/samplingSize)) * tile_size_ratio;\n                textureCoordinates.y = textureCoordinates.y;\n                textureCoordinates = clamp(textureCoordinates, 0.0, 1.0);\n                accumulator += texture2D(texOrigin, textureCoordinates);\n           }\n        }\n        \n        gl_FragColor = accumulator / vec4(samplingSize * samplingSize);\n    } else {\n        gl_FragColor = texture2D(texOrigin, v_texCoord);\n    }\n}", null, 8, null);
        this.l = mosaic0;
        this.m = size0;
        this.n = this.getProgram().uniformLocation("position");
        this.o = this.getProgram().uniformLocation("resolution");
        this.p = this.getProgram().uniformLocation("points");
        this.q = this.getProgram().uniformLocation("isCircle");
        this.r = this.getProgram().uniformLocation("tile_size_ratio");
    }

    @Override  // com.kakao.kandinsky.core.filter.shader.TextureShader
    public void bind(@NotNull GLTexture gLTexture0, float f) {
        Intrinsics.checkNotNullParameter(gLTexture0, "inputTexture");
        super.bind(gLTexture0, f);
        RectF rectF0 = this.l.getAndroidRect();
        SizeF sizeF0 = this.l.getAndroidBlockSizeRatio();
        Matrix matrix0 = new Matrix();
        float f1 = 1.0f / ((float)this.m.getHeight());
        matrix0.postScale(1.0f / ((float)this.m.getWidth()), f1);
        float[] arr_f = new float[8];
        int v = 0;
        arr_f[0] = rectF0.top;
        arr_f[1] = rectF0.left;
        arr_f[2] = rectF0.top;
        arr_f[3] = rectF0.right;
        arr_f[4] = rectF0.bottom;
        arr_f[5] = rectF0.right;
        arr_f[6] = rectF0.bottom;
        arr_f[7] = rectF0.left;
        Size size0 = gLTexture0.getSize();
        Matrix matrix1 = new Matrix();
        matrix1.postConcat(MatrixValues.toMatrix-impl(this.l.getMatrixValues-pp_Gbr8()));
        matrix1.postConcat(matrix0);
        matrix1.postScale(((float)size0.getWidth()), ((float)size0.getHeight()));
        matrix1.mapPoints(arr_f);
        matrix1.mapRect(rectF0);
        GLES20.glUniform2fv(this.p, 4, arr_f, 0);
        float f2 = rectF0.centerX();
        float f3 = rectF0.centerY();
        GLES20.glUniform2f(this.n, f2, f3);
        float f4 = (float)size0.getWidth();
        float f5 = (float)size0.getHeight();
        GLES20.glUniform2f(this.o, f4, f5);
        float f6 = sizeF0.getWidth();
        float f7 = sizeF0.getHeight();
        GLES20.glUniform2f(this.r, f6, f7);
        if(this.l.getMosaicType() == Type.Circle) {
            v = 1;
        }
        GLES20.glUniform1i(this.q, v);
    }
}

