package com.kakao.kandinsky.core.filter.shader;

import android.opengl.GLES20;
import android.util.Size;
import com.kakao.kandinsky.core.filter.gl.GLProgram;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.gl.TextureMesh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\t\b\u0010\u0018\u0000 &2\u00020\u0001:\u0001&B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\'\u0010\u0012\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0012\u0010\u0013J\u001F\u0010\u0014\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000FH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u001D\u001A\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\"\u0010%\u001A\u00020\u001E8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006\'"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/TextureShader;", "", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "Lcom/kakao/kandinsky/core/filter/gl/TextureMesh;", "mesh", "", "fs", "vs", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Lcom/kakao/kandinsky/core/filter/gl/TextureMesh;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "inputTexture", "Landroid/util/Size;", "outputSize", "", "intensity", "", "draw", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;Landroid/util/Size;F)V", "bind", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;F)V", "release", "()V", "Lcom/kakao/kandinsky/core/filter/gl/GLProgram;", "c", "Lcom/kakao/kandinsky/core/filter/gl/GLProgram;", "getProgram", "()Lcom/kakao/kandinsky/core/filter/gl/GLProgram;", "program", "", "i", "[F", "getMvpMatrix", "()[F", "setMvpMatrix", "([F)V", "mvpMatrix", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class TextureShader {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000B\u001A\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/TextureShader$Companion;", "", "", "VERTEX_SHADER_CODE", "Ljava/lang/String;", "getVERTEX_SHADER_CODE", "()Ljava/lang/String;", "", "IDENTITY_MATRIX", "[F", "", "NAME_NOT_FOUND", "I", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final String getVERTEX_SHADER_CODE() {
            return "attribute vec4 a_position;\nattribute vec2 a_texCoord;\nvarying vec2 v_texCoord;\nuniform mat4 u_mvpMatrix;\nvoid main() {\n    gl_Position = u_mvpMatrix * a_position; \n    v_texCoord = a_texCoord;\n}";
        }
    }

    @NotNull
    public static final Companion Companion;
    public final GLResourcesProvider a;
    public final TextureMesh b;
    public final GLProgram c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public float[] i;
    public static final float[] j;
    public static final String k;

    static {
        TextureShader.Companion = new Companion(null);
        TextureShader.j = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        TextureShader.k = "attribute vec4 a_position;\nattribute vec2 a_texCoord;\nvarying vec2 v_texCoord;\nuniform mat4 u_mvpMatrix;\nvoid main() {\n    gl_Position = u_mvpMatrix * a_position; \n    v_texCoord = a_texCoord;\n}";
    }

    public TextureShader(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull TextureMesh textureMesh0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(textureMesh0, "mesh");
        Intrinsics.checkNotNullParameter(s, "fs");
        Intrinsics.checkNotNullParameter(s1, "vs");
        super();
        this.a = gLResourcesProvider0;
        this.b = textureMesh0;
        GLProgram gLProgram0 = gLResourcesProvider0.getProgram(s1, s);
        this.c = gLProgram0;
        this.d = gLProgram0.attribLocation("a_position");
        this.e = gLProgram0.attribLocation("a_texCoord");
        this.f = gLProgram0.uniformLocation("u_mvpMatrix");
        this.g = gLProgram0.uniformLocation("texOrigin");
        this.h = gLProgram0.uniformLocation("intensity");
        this.i = TextureShader.j;
    }

    public TextureShader(GLResourcesProvider gLResourcesProvider0, TextureMesh textureMesh0, String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            s1 = "attribute vec4 a_position;\nattribute vec2 a_texCoord;\nvarying vec2 v_texCoord;\nuniform mat4 u_mvpMatrix;\nvoid main() {\n    gl_Position = u_mvpMatrix * a_position; \n    v_texCoord = a_texCoord;\n}";
        }
        this(gLResourcesProvider0, textureMesh0, s, s1);
    }

    // 去混淆评级： 低(20)
    public static final String access$getVERTEX_SHADER_CODE$cp() [...] // 潜在的解密器

    public void bind(@NotNull GLTexture gLTexture0, float f) {
        Intrinsics.checkNotNullParameter(gLTexture0, "inputTexture");
        int v = this.f;
        if(v != -1) {
            GLES20.glUniformMatrix4fv(v, 1, false, this.i, 0);
        }
        int v1 = this.g;
        if(v1 != -1) {
            GLES20.glActiveTexture(0x84C0);
            GLES20.glBindTexture(gLTexture0.getTarget(), gLTexture0.getId());
            GLES20.glUniform1i(v1, 0);
        }
        int v2 = this.h;
        if(v2 != -1) {
            GLES20.glUniform1f(v2, f);
        }
    }

    public final void draw(@NotNull GLTexture gLTexture0, @NotNull Size size0, float f) {
        Intrinsics.checkNotNullParameter(gLTexture0, "inputTexture");
        Intrinsics.checkNotNullParameter(size0, "outputSize");
        GLES20.glViewport(0, 0, size0.getWidth(), size0.getHeight());
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(0x4000);
        this.c.use();
        this.bind(gLTexture0, f);
        this.b.draw(this.d, this.e);
        GLES20.glUseProgram(0);
    }

    public static void draw$default(TextureShader textureShader0, GLTexture gLTexture0, Size size0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
        }
        if((v & 4) != 0) {
            f = 1.0f;
        }
        textureShader0.draw(gLTexture0, size0, f);
    }

    @NotNull
    public final float[] getMvpMatrix() {
        return this.i;
    }

    @NotNull
    public final GLProgram getProgram() {
        return this.c;
    }

    public final void release() {
        this.a.evictProgram(this.c);
        this.b.release();
    }

    public final void setMvpMatrix(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "<set-?>");
        this.i = arr_f;
    }
}

