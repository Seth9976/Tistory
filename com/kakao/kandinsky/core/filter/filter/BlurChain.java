package com.kakao.kandinsky.core.filter.filter;

import android.graphics.Bitmap;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.gl.GLTools;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u0004\u0018\u00010\r¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/BlurChain;", "", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "", "Lcom/kakao/kandinsky/core/filter/filter/BlurFilter;", "blurList", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Ljava/util/List;)V", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "inputTexture", "execute", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;)Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "Landroid/graphics/Bitmap;", "capture", "()Landroid/graphics/Bitmap;", "", "delete", "()V", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlurChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlurChain.kt\ncom/kakao/kandinsky/core/filter/filter/BlurChain\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1855#2,2:41\n1855#2,2:43\n*S KotlinDebug\n*F\n+ 1 BlurChain.kt\ncom/kakao/kandinsky/core/filter/filter/BlurChain\n*L\n16#1:41,2\n34#1:43,2\n*E\n"})
public final class BlurChain {
    public final GLResourcesProvider a;
    public final List b;

    public BlurChain(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(list0, "blurList");
        super();
        this.a = gLResourcesProvider0;
        this.b = list0;
    }

    @Nullable
    public final Bitmap capture() {
        BlurFilter blurFilter0 = (BlurFilter)CollectionsKt___CollectionsKt.lastOrNull(this.b);
        return blurFilter0 == null ? null : blurFilter0.capture();
    }

    public final void delete() {
        for(Object object0: this.b) {
            ((BlurFilter)object0).release();
        }
        GLTools.checkGLError$default(GLTools.INSTANCE, "blur chain release", false, 2, null);
    }

    @NotNull
    public final GLTexture execute(@NotNull GLTexture gLTexture0) {
        Intrinsics.checkNotNullParameter(gLTexture0, "inputTexture");
        GLTexture gLTexture1 = gLTexture0;
        for(Object object0: this.b) {
            GLTexture gLTexture2 = BaseFilter.execute$default(((BlurFilter)object0), gLTexture1, 0.0f, 2, null);
            if(!Intrinsics.areEqual(gLTexture1, gLTexture0)) {
                this.a.releaseTexture(gLTexture1);
            }
            GLTools.INSTANCE.checkGLError("blur(" + ((BlurFilter)object0) + ") execute", true);
            gLTexture1 = gLTexture2;
        }
        return gLTexture1;
    }
}

