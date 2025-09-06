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

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B\u001F\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u00052\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/window/embedding/ActivityRule;", "Landroidx/window/embedding/EmbeddingRule;", "", "Landroidx/window/embedding/ActivityFilter;", "filters", "", "alwaysExpand", "<init>", "(Ljava/util/Set;Z)V", "filter", "plus$window_release", "(Landroidx/window/embedding/ActivityFilter;)Landroidx/window/embedding/ActivityRule;", "plus", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "getAlwaysExpand", "()Z", "b", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ActivityRule extends EmbeddingRule {
    public final boolean a;
    public final Set b;

    public ActivityRule(@NotNull Set set0, boolean z) {
        Intrinsics.checkNotNullParameter(set0, "filters");
        super();
        this.a = z;
        this.b = CollectionsKt___CollectionsKt.toSet(set0);
    }

    public ActivityRule(Set set0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(set0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ActivityRule)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((ActivityRule)object0).b) ? this.a == ((ActivityRule)object0).a : false;
    }

    public final boolean getAlwaysExpand() {
        return this.a;
    }

    @NotNull
    public final Set getFilters() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.a) + this.b.hashCode() * 0x1F;
    }

    @NotNull
    public final ActivityRule plus$window_release(@NotNull ActivityFilter activityFilter0) {
        Intrinsics.checkNotNullParameter(activityFilter0, "filter");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        linkedHashSet0.addAll(this.b);
        linkedHashSet0.add(activityFilter0);
        return new ActivityRule(CollectionsKt___CollectionsKt.toSet(linkedHashSet0), this.a);
    }
}

