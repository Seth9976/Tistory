package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@ExperimentalWindowApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u000B\u001A\u00020\t\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\t¢\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00052\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0007\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001C\u001A\u0004\b \u0010\u001ER\u0017\u0010\b\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001C\u001A\u0004\b\"\u0010\u001ER\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&¨\u0006\'"}, d2 = {"Landroidx/window/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitRule;", "", "Landroidx/window/embedding/SplitPairFilter;", "filters", "", "finishPrimaryWithSecondary", "finishSecondaryWithPrimary", "clearTop", "", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDir", "<init>", "(Ljava/util/Set;ZZZIIFI)V", "filter", "plus$window_release", "(Landroidx/window/embedding/SplitPairFilter;)Landroidx/window/embedding/SplitPairRule;", "plus", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "e", "Z", "getFinishPrimaryWithSecondary", "()Z", "f", "getFinishSecondaryWithPrimary", "g", "getClearTop", "h", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplitPairRule extends SplitRule {
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Set h;

    public SplitPairRule(@NotNull Set set0, boolean z, boolean z1, boolean z2, int v, int v1, float f, int v2) {
        Intrinsics.checkNotNullParameter(set0, "filters");
        super(v, v1, f, v2);
        this.e = z;
        this.f = z1;
        this.g = z2;
        this.h = CollectionsKt___CollectionsKt.toSet(set0);
    }

    public SplitPairRule(Set set0, boolean z, boolean z1, boolean z2, int v, int v1, float f, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(set0, ((v3 & 2) == 0 ? z : false), ((v3 & 4) == 0 ? z1 : true), ((v3 & 8) == 0 ? z2 : false), ((v3 & 16) == 0 ? v : 0), ((v3 & 0x20) == 0 ? v1 : 0), ((v3 & 0x40) == 0 ? f : 0.5f), ((v3 & 0x80) == 0 ? v2 : 3));
    }

    @Override  // androidx.window.embedding.SplitRule
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitPairRule)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((SplitPairRule)object0).h)) {
            return false;
        }
        if(this.e != ((SplitPairRule)object0).e) {
            return false;
        }
        return this.f == ((SplitPairRule)object0).f ? this.g == ((SplitPairRule)object0).g : false;
    }

    public final boolean getClearTop() {
        return this.g;
    }

    @NotNull
    public final Set getFilters() {
        return this.h;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.e;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.f;
    }

    @Override  // androidx.window.embedding.SplitRule
    public int hashCode() {
        return Boolean.hashCode(this.g) + a.e(a.e((this.h.hashCode() + super.hashCode() * 0x1F) * 0x1F, 0x1F, this.e), 0x1F, this.f);
    }

    @NotNull
    public final SplitPairRule plus$window_release(@NotNull SplitPairFilter splitPairFilter0) {
        Intrinsics.checkNotNullParameter(splitPairFilter0, "filter");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        linkedHashSet0.addAll(this.h);
        linkedHashSet0.add(splitPairFilter0);
        return new SplitPairRule(CollectionsKt___CollectionsKt.toSet(linkedHashSet0), this.e, this.f, this.g, this.getMinWidth(), this.getMinSmallestWidth(), this.getSplitRatio(), this.getLayoutDirection());
    }
}

