package com.kakao.kemoticon;

import ib.g;
import ib.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001:\u0002 !B¶\u0001\u0012u\u0010\r\u001Aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\u0002\u00126\u0010\u0010\u001A2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u00030\u000E¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\u001B\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001AJ\u001D\u0010\u001B\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0004\b\u001B\u0010\u001CJ\u001D\u0010\u001D\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0004\b\u001D\u0010\u001CJ\u001D\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u000B¢\u0006\u0004\b\u001E\u0010\u001F¨\u0006\""}, d2 = {"Lcom/kakao/kemoticon/EmoticonRepository;", "", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "packId", "id", "", "size", "ext", "", "isThumbnail", "resourceUrlLookup", "Lkotlin/Function2;", "isActive", "iconResourceUrlLookup", "<init>", "(Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function2;)V", "", "getDefaultPackIds", "()Ljava/util/List;", "getValidPackIds", "getEmoticonIds", "(Ljava/lang/String;)Ljava/util/List;", "getEmoticonPackSizeType", "(Ljava/lang/String;)Ljava/lang/String;", "getEmoticonResourceUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getEmoticonThumbnailUrl", "getEmoticonIconUri", "(Ljava/lang/String;Z)Ljava/lang/String;", "ib/g", "ib/h", "kemoticon_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEmoticonRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmoticonRepository.kt\ncom/kakao/kemoticon/EmoticonRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1549#2:92\n1620#2,3:93\n1549#2:96\n1620#2,3:97\n*S KotlinDebug\n*F\n+ 1 EmoticonRepository.kt\ncom/kakao/kemoticon/EmoticonRepository\n*L\n12#1:92\n12#1:93,3\n13#1:96\n13#1:97,3\n*E\n"})
public final class EmoticonRepository {
    public final Function5 a;
    public final Function2 b;

    public EmoticonRepository(@NotNull Function5 function50, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function50, "resourceUrlLookup");
        Intrinsics.checkNotNullParameter(function20, "iconResourceUrlLookup");
        super();
        this.a = function50;
        this.b = function20;
    }

    @NotNull
    public final List getDefaultPackIds() {
        Iterable iterable0 = h.f.defaults();
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(((h)object0).a);
        }
        return list0;
    }

    @NotNull
    public final String getEmoticonIconUri(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "packId");
        return (String)this.b.invoke(s, Boolean.valueOf(z));
    }

    @NotNull
    public final List getEmoticonIds(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "packId");
        int v = h.f.idOf(s).d;
        return v > 0 ? new g(v) : CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final String getEmoticonPackSizeType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "packId");
        return h.f.idOf(s).e;
    }

    @NotNull
    public final String getEmoticonResourceUrl(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "packId");
        Intrinsics.checkNotNullParameter(s1, "id");
        h h0 = h.f.idOf(s);
        return (String)this.a.invoke(s, s1, h0.c, h0.b, Boolean.FALSE);
    }

    @NotNull
    public final String getEmoticonThumbnailUrl(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "packId");
        Intrinsics.checkNotNullParameter(s1, "id");
        Integer integer0 = h.f.idOf(s).c;
        return (String)this.a.invoke(s, s1, integer0, "png", Boolean.TRUE);
    }

    @NotNull
    public final List getValidPackIds() {
        List list0 = new ArrayList(l.collectionSizeOrDefault(h.l, 10));
        for(Object object0: h.l) {
            list0.add(((h)object0).a);
        }
        return list0;
    }
}

