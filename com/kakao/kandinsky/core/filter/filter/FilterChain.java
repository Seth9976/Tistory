package com.kakao.kandinsky.core.filter.filter;

import android.graphics.Bitmap;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.gl.GLTools;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u0004\u0018\u00010\u000F¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R%\u0010\u001B\u001A\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000F0\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/FilterChain;", "", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "", "Lcom/kakao/kandinsky/core/filter/filter/BaseFilter;", "filterList", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Ljava/util/List;)V", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "inputTexture", "", "intensity", "execute", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;F)Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "Landroid/graphics/Bitmap;", "capture", "()Landroid/graphics/Bitmap;", "", "delete", "()V", "", "", "c", "Ljava/util/Map;", "getStepCaptureList", "()Ljava/util/Map;", "stepCaptureList", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFilterChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterChain.kt\ncom/kakao/kandinsky/core/filter/filter/FilterChain\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1864#2,3:42\n1855#2,2:45\n*S KotlinDebug\n*F\n+ 1 FilterChain.kt\ncom/kakao/kandinsky/core/filter/filter/FilterChain\n*L\n18#1:42,3\n35#1:45,2\n*E\n"})
public final class FilterChain {
    public final GLResourcesProvider a;
    public final List b;
    public final LinkedHashMap c;

    public FilterChain(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(list0, "filterList");
        super();
        this.a = gLResourcesProvider0;
        this.b = list0;
        this.c = new LinkedHashMap();
    }

    @Nullable
    public final Bitmap capture() {
        BaseFilter baseFilter0 = (BaseFilter)CollectionsKt___CollectionsKt.lastOrNull(this.b);
        return baseFilter0 == null ? null : baseFilter0.capture();
    }

    public final void delete() {
        for(Object object0: this.b) {
            ((BaseFilter)object0).release();
        }
        GLTools.checkGLError$default(GLTools.INSTANCE, "chain release", false, 2, null);
    }

    @NotNull
    public final GLTexture execute(@NotNull GLTexture gLTexture0, float f) {
        Intrinsics.checkNotNullParameter(gLTexture0, "inputTexture");
        int v = 0;
        GLTexture gLTexture1 = gLTexture0;
        for(Object object0: this.b) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            GLTexture gLTexture2 = ((BaseFilter)object0).execute(gLTexture1, f);
            if(!Intrinsics.areEqual(gLTexture1, gLTexture0)) {
                this.a.releaseTexture(gLTexture1);
            }
            GLTools.INSTANCE.checkGLError("filter(" + ((BaseFilter)object0) + ") execute", true);
            gLTexture1 = gLTexture2;
            ++v;
        }
        return gLTexture1;
    }

    @NotNull
    public final Map getStepCaptureList() {
        return this.c;
    }
}

