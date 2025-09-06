package com.kakao.tistory.presentation.screen.item;

import a5.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u0019\u001A\u0004\b\u001F\u0010\n¨\u0006 "}, d2 = {"Lcom/kakao/tistory/presentation/screen/item/StaticsEntryItem;", "", "", "blogName", "", "id", "title", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/kakao/tistory/presentation/screen/item/StaticsEntryItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getId", "c", "getTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StaticsEntryItem {
    public static final int $stable;
    public final String a;
    public final long b;
    public final String c;

    public StaticsEntryItem(@NotNull String s, long v, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "title");
        super();
        this.a = s;
        this.b = v;
        this.c = s1;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final StaticsEntryItem copy(@NotNull String s, long v, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "title");
        return new StaticsEntryItem(s, v, s1);
    }

    public static StaticsEntryItem copy$default(StaticsEntryItem staticsEntryItem0, String s, long v, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = staticsEntryItem0.a;
        }
        if((v1 & 2) != 0) {
            v = staticsEntryItem0.b;
        }
        if((v1 & 4) != 0) {
            s1 = staticsEntryItem0.c;
        }
        return staticsEntryItem0.copy(s, v, s1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof StaticsEntryItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((StaticsEntryItem)object0).a)) {
            return false;
        }
        return this.b == ((StaticsEntryItem)object0).b ? Intrinsics.areEqual(this.c, ((StaticsEntryItem)object0).c) : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.a;
    }

    public final long getId() {
        return this.b;
    }

    @NotNull
    public final String getTitle() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + a.k(this.b, this.a.hashCode() * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("StaticsEntryItem(blogName=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", id=");
        stringBuilder0.append(this.b);
        return b.q(stringBuilder0, ", title=", this.c, ")");
    }
}

