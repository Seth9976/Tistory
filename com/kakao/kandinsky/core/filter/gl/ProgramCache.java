package com.kakao.kandinsky.core.filter.gl;

import com.kakao.kandinsky.utils.Logger;
import j5.a;
import java.util.HashMap;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w9.b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/ProgramCache;", "", "<init>", "()V", "", "vs", "fs", "Lcom/kakao/kandinsky/core/filter/gl/GLProgram;", "getProgram", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/kandinsky/core/filter/gl/GLProgram;", "program", "", "evict", "(Lcom/kakao/kandinsky/core/filter/gl/GLProgram;)V", "release", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nProgramCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgramCache.kt\ncom/kakao/kandinsky/core/filter/gl/ProgramCache\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,53:1\n215#2,2:54\n*S KotlinDebug\n*F\n+ 1 ProgramCache.kt\ncom/kakao/kandinsky/core/filter/gl/ProgramCache\n*L\n43#1:54,2\n*E\n"})
public final class ProgramCache {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/ProgramCache$Companion;", "", "", "MAX_CACHE_SIZE", "I", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final HashMap a;

    static {
        ProgramCache.Companion = new Companion(null);
    }

    public ProgramCache() {
        this.a = new HashMap();
    }

    public final void evict(@NotNull GLProgram gLProgram0) {
        Intrinsics.checkNotNullParameter(gLProgram0, "program");
        int v = gLProgram0.getCacheKey();
        HashMap hashMap0 = this.a;
        Pair pair0 = (Pair)hashMap0.get(v);
        if(pair0 == null) {
            Logger.INSTANCE.error("cache does not contain program");
            return;
        }
        if(!Intrinsics.areEqual(pair0.getSecond(), gLProgram0)) {
            Logger.INSTANCE.error("cache key is same but program instance is not same");
            return;
        }
        if(((Number)pair0.getFirst()).intValue() > 0) {
            hashMap0.put(v, new Pair(((int)(((Number)pair0.getFirst()).intValue() - 1)), pair0.getSecond()));
        }
    }

    @NotNull
    public final GLProgram getProgram(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "vs");
        Intrinsics.checkNotNullParameter(s1, "fs");
        int v = GLProgram.Companion.cacheKey(s, s1);
        HashMap hashMap0 = this.a;
        Pair pair0 = (Pair)hashMap0.get(v);
        if(pair0 == null) {
            pair0 = new Pair(0, new GLProgram(s, s1));
        }
        GLProgram gLProgram0 = (GLProgram)pair0.component2();
        hashMap0.put(v, new Pair(((int)(((Number)pair0.component1()).intValue() + 1)), gLProgram0));
        if(hashMap0.size() > 50) {
            hashMap0.entrySet().removeIf(new a(b.w, 2));
        }
        return gLProgram0;
    }

    public final void release() {
        HashMap hashMap0 = this.a;
        for(Object object0: hashMap0.entrySet()) {
            ((Number)((Map.Entry)object0).getKey()).intValue();
            Pair pair0 = (Pair)((Map.Entry)object0).getValue();
            ((Number)pair0.component1()).intValue();
            ((GLProgram)pair0.component2()).delete();
        }
        hashMap0.clear();
    }
}

