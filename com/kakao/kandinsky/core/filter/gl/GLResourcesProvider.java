package com.kakao.kandinsky.core.filter.gl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w9.a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001A\u00020\u000B¢\u0006\u0004\b\u0019\u0010\u0003¨\u0006\u001A"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "", "<init>", "()V", "", "vs", "fs", "Lcom/kakao/kandinsky/core/filter/gl/GLProgram;", "getProgram", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/kandinsky/core/filter/gl/GLProgram;", "program", "", "evictProgram", "(Lcom/kakao/kandinsky/core/filter/gl/GLProgram;)V", "", "width", "height", "Lcom/kakao/kandinsky/core/filter/gl/GLBufferTexture;", "acquireTexture", "(II)Lcom/kakao/kandinsky/core/filter/gl/GLBufferTexture;", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "texture", "releaseTexture", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;)V", "retainTexture", "release", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GLResourcesProvider {
    public final ProgramCache a;
    public final TexturePool b;

    public GLResourcesProvider() {
        this.a = new ProgramCache();
        this.b = new TexturePool(a.w);
    }

    @NotNull
    public final GLBufferTexture acquireTexture(int v, int v1) {
        return (GLBufferTexture)this.b.get(v, v1);
    }

    public final void evictProgram(@NotNull GLProgram gLProgram0) {
        Intrinsics.checkNotNullParameter(gLProgram0, "program");
        this.a.evict(gLProgram0);
    }

    @NotNull
    public final GLProgram getProgram(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "vs");
        Intrinsics.checkNotNullParameter(s1, "fs");
        return this.a.getProgram(s, s1);
    }

    public final void release() {
        this.a.release();
        this.b.clear();
    }

    public final void releaseTexture(@NotNull GLTexture gLTexture0) {
        Intrinsics.checkNotNullParameter(gLTexture0, "texture");
        if(gLTexture0 instanceof GLBufferTexture) {
            this.b.release(gLTexture0);
            return;
        }
        gLTexture0.delete();
    }

    public final void retainTexture(@NotNull GLTexture gLTexture0) {
        Intrinsics.checkNotNullParameter(gLTexture0, "texture");
        if(gLTexture0 instanceof GLBufferTexture) {
            this.b.retain(gLTexture0);
        }
    }
}

