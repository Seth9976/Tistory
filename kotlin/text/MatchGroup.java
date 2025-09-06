package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001C"}, d2 = {"Lkotlin/text/MatchGroup;", "", "", "value", "Lkotlin/ranges/IntRange;", "range", "<init>", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/ranges/IntRange;", "copy", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)Lkotlin/text/MatchGroup;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "b", "Lkotlin/ranges/IntRange;", "getRange", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MatchGroup {
    public final String a;
    public final IntRange b;

    public MatchGroup(@NotNull String s, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(s, "value");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        super();
        this.a = s;
        this.b = intRange0;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final IntRange component2() {
        return this.b;
    }

    @NotNull
    public final MatchGroup copy(@NotNull String s, @NotNull IntRange intRange0) {
        Intrinsics.checkNotNullParameter(s, "value");
        Intrinsics.checkNotNullParameter(intRange0, "range");
        return new MatchGroup(s, intRange0);
    }

    public static MatchGroup copy$default(MatchGroup matchGroup0, String s, IntRange intRange0, int v, Object object0) {
        if((v & 1) != 0) {
            s = matchGroup0.a;
        }
        if((v & 2) != 0) {
            intRange0 = matchGroup0.b;
        }
        return matchGroup0.copy(s, intRange0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MatchGroup)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((MatchGroup)object0).a) ? Intrinsics.areEqual(this.b, ((MatchGroup)object0).b) : false;
    }

    @NotNull
    public final IntRange getRange() {
        return this.b;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}

