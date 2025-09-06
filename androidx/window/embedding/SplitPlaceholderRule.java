package androidx.window.embedding;

import android.content.Intent;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\f\u001A\u00020\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u0003H\u0080\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "", "Landroidx/window/embedding/ActivityFilter;", "filters", "Landroid/content/Intent;", "placeholderIntent", "", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDirection", "<init>", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "filter", "plus$window_release", "(Landroidx/window/embedding/ActivityFilter;)Landroidx/window/embedding/SplitPlaceholderRule;", "plus", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "e", "Landroid/content/Intent;", "getPlaceholderIntent", "()Landroid/content/Intent;", "f", "Ljava/util/Set;", "getFilters", "()Ljava/util/Set;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplitPlaceholderRule extends SplitRule {
    public final Intent e;
    public final Set f;

    public SplitPlaceholderRule(@NotNull Set set0, @NotNull Intent intent0, int v, int v1, float f, int v2) {
        Intrinsics.checkNotNullParameter(set0, "filters");
        Intrinsics.checkNotNullParameter(intent0, "placeholderIntent");
        super(v, v1, f, v2);
        this.e = intent0;
        this.f = CollectionsKt___CollectionsKt.toSet(set0);
    }

    public SplitPlaceholderRule(Set set0, Intent intent0, int v, int v1, float f, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(set0, intent0, ((v3 & 4) == 0 ? v : 0), ((v3 & 8) == 0 ? v1 : 0), ((v3 & 16) == 0 ? f : 0.5f), ((v3 & 0x20) == 0 ? v2 : 3));
    }

    @Override  // androidx.window.embedding.SplitRule
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitPlaceholderRule)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((SplitPlaceholderRule)object0).f) ? Intrinsics.areEqual(this.e, ((SplitPlaceholderRule)object0).e) : false;
    }

    @NotNull
    public final Set getFilters() {
        return this.f;
    }

    @NotNull
    public final Intent getPlaceholderIntent() {
        return this.e;
    }

    @Override  // androidx.window.embedding.SplitRule
    public int hashCode() {
        return this.e.hashCode() + (this.f.hashCode() + super.hashCode() * 0x1F) * 0x1F;
    }

    @NotNull
    public final SplitPlaceholderRule plus$window_release(@NotNull ActivityFilter activityFilter0) {
        Intrinsics.checkNotNullParameter(activityFilter0, "filter");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        linkedHashSet0.addAll(this.f);
        linkedHashSet0.add(activityFilter0);
        return new SplitPlaceholderRule(CollectionsKt___CollectionsKt.toSet(linkedHashSet0), this.e, this.getMinWidth(), this.getMinSmallestWidth(), this.getSplitRatio(), this.getLayoutDirection());
    }
}

