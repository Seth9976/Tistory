package com.kakao.kandinsky.selector;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ.\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u001A\u0010\u0015\u001A\u00020\u00062\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u0007\u0010\u000F¨\u0006\u001F"}, d2 = {"Lcom/kakao/kandinsky/selector/SelectorImageDate;", "", "", "index", "", "uri", "", "isEdited", "<init>", "(ILjava/lang/String;Z)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(ILjava/lang/String;Z)Lcom/kakao/kandinsky/selector/SelectorImageDate;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "b", "Ljava/lang/String;", "getUri", "c", "Z", "selector_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SelectorImageDate {
    public static final int $stable;
    public final int a;
    public final String b;
    public final boolean c;

    public SelectorImageDate(int v, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "uri");
        super();
        this.a = v;
        this.b = s;
        this.c = z;
    }

    public SelectorImageDate(int v, String s, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        this(v, s, z);
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    @NotNull
    public final SelectorImageDate copy(int v, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "uri");
        return new SelectorImageDate(v, s, z);
    }

    public static SelectorImageDate copy$default(SelectorImageDate selectorImageDate0, int v, String s, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = selectorImageDate0.a;
        }
        if((v1 & 2) != 0) {
            s = selectorImageDate0.b;
        }
        if((v1 & 4) != 0) {
            z = selectorImageDate0.c;
        }
        return selectorImageDate0.copy(v, s, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SelectorImageDate)) {
            return false;
        }
        if(this.a != ((SelectorImageDate)object0).a) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((SelectorImageDate)object0).b) ? this.c == ((SelectorImageDate)object0).c : false;
    }

    public final int getIndex() {
        return this.a;
    }

    @NotNull
    public final String getUri() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.c) + q.c(this.a * 0x1F, 0x1F, this.b);
    }

    public final boolean isEdited() {
        return this.c;
    }

    @Override
    @NotNull
    public String toString() {
        return "SelectorImageDate(index=" + this.a + ", uri=" + this.b + ", isEdited=" + this.c + ")";
    }
}

