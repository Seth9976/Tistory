package com.kakao.kandinsky.core.filter.gl;

import android.opengl.GLES20;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000E2\u00020\u0001:\u0001\u000EB\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/TextureMesh;", "", "", "vertices", "<init>", "([F)V", "", "positionLocation", "texCoordLocation", "", "draw", "(II)V", "release", "()V", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TextureMesh {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000BR\u0014\u0010\r\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000BR\u0014\u0010\u000E\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000E\u0010\u000BR\u0014\u0010\u000F\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u000B¨\u0006\u0010"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/TextureMesh$Companion;", "", "", "VERTICES", "[F", "getVERTICES", "()[F", "FLIPPED_VERTICES", "getFLIPPED_VERTICES", "", "FLOAT_SIZE", "I", "POSITION_COMPONENT_COUNT", "STRIDE", "TEXCOORD_COMPONENT_COUNT", "TEXCOORD_OFFSET", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final float[] getFLIPPED_VERTICES() {
            return TextureMesh.c;
        }

        @NotNull
        public final float[] getVERTICES() {
            return TextureMesh.b;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final GLArrayBuffer a;
    public static final float[] b;
    public static final float[] c;

    static {
        TextureMesh.Companion = new Companion(null);
        TextureMesh.b = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
        TextureMesh.c = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    }

    public TextureMesh() {
        this(null, 1, null);
    }

    public TextureMesh(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "vertices");
        super();
        this.a = new GLArrayBuffer(arr_f, 0, 0, 6, null);
    }

    public TextureMesh(float[] arr_f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            arr_f = TextureMesh.b;
        }
        this(arr_f);
    }

    public final void draw(int v, int v1) {
        this.a.bind();
        GLES20.glEnableVertexAttribArray(v);
        GLES20.glVertexAttribPointer(v, 2, 0x1406, false, 16, 0);
        GLES20.glEnableVertexAttribArray(v1);
        GLES20.glVertexAttribPointer(v1, 2, 0x1406, false, 16, 8);
        GLES20.glDrawArrays(5, 0, 4);
        this.a.unBind();
    }

    public final void release() {
        this.a.delete();
    }
}

