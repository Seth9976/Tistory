package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000E\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000BR\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\rR\u001A\u0010#\u001A\u00020\u00138\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u0015R\u001D\u0010&\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\u001E\u001A\u0004\b%\u0010\rR\u0017\u0010+\u001A\u00020\u00178\u0006¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;", "", "Lkotlin/Function0;", "", "onClickMore", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntryItem;", "list", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "()Ljava/util/List;", "copy", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnClickMore", "b", "Ljava/util/List;", "getList", "c", "I", "getMaxCount", "maxCount", "d", "getVisibleList", "visibleList", "e", "Z", "getShowMore", "()Z", "showMore", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainTopEntry {
    public static final int $stable;
    public final Function0 a;
    public final List b;
    public final int c;
    public final List d;
    public final boolean e;

    public BlogMainTopEntry() {
        this(null, null, 3, null);
    }

    public BlogMainTopEntry(@NotNull Function0 function00, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(function00, "onClickMore");
        Intrinsics.checkNotNullParameter(list0, "list");
        super();
        this.a = function00;
        this.b = list0;
        this.c = 3;
        this.d = CollectionsKt___CollectionsKt.take(list0, 3);
        this.e = list0.size() > 3;
    }

    public BlogMainTopEntry(Function0 function00, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            function00 = o0.a;
        }
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(function00, list0);
    }

    @NotNull
    public final Function0 component1() {
        return this.a;
    }

    @NotNull
    public final List component2() {
        return this.b;
    }

    @NotNull
    public final BlogMainTopEntry copy(@NotNull Function0 function00, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(function00, "onClickMore");
        Intrinsics.checkNotNullParameter(list0, "list");
        return new BlogMainTopEntry(function00, list0);
    }

    public static BlogMainTopEntry copy$default(BlogMainTopEntry blogMainTopEntry0, Function0 function00, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = blogMainTopEntry0.a;
        }
        if((v & 2) != 0) {
            list0 = blogMainTopEntry0.b;
        }
        return blogMainTopEntry0.copy(function00, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogMainTopEntry)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((BlogMainTopEntry)object0).a) ? Intrinsics.areEqual(this.b, ((BlogMainTopEntry)object0).b) : false;
    }

    @NotNull
    public final List getList() {
        return this.b;
    }

    public final int getMaxCount() {
        return this.c;
    }

    @NotNull
    public final Function0 getOnClickMore() {
        return this.a;
    }

    public final boolean getShowMore() {
        return this.e;
    }

    @NotNull
    public final List getVisibleList() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogMainTopEntry(onClickMore=" + this.a + ", list=" + this.b + ")";
    }
}

