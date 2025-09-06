package com.kakao.kemoticon;

import ib.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/kakao/kemoticon/EmoticonRepository$Pack$Companion", "", "", "Lib/h;", "defaults", "()Ljava/util/List;", "", "id", "idOf", "(Ljava/lang/String;)Lib/h;", "kemoticon_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEmoticonRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmoticonRepository.kt\ncom/kakao/kemoticon/EmoticonRepository$Pack$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class EmoticonRepository.Pack.Companion {
    public EmoticonRepository.Pack.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public final List defaults() {
        return CollectionsKt__CollectionsKt.listOf(new h[]{h.g, h.h, h.i, h.j});
    }

    @NotNull
    public final h idOf(@NotNull String s) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(s, "id");
        for(Object object1: h.l) {
            if(Intrinsics.areEqual(((h)object1).a, s)) {
                object0 = object1;
                break;
            }
        }
        if(((h)object0) == null) {
            throw new Exception("Not found Emoticon ID");
        }
        return (h)object0;
    }
}

