package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0019\u001A\u0004\b\u001C\u0010\n¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "startAffinity", "endAffinity", "<init>", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "affinity", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "component1", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "component2", "copy", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "getStartAffinity", "b", "getEndAffinity", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionWedgeAffinity {
    public static final int $stable;
    public final WedgeAffinity a;
    public final WedgeAffinity b;

    public SelectionWedgeAffinity(@NotNull WedgeAffinity wedgeAffinity0) {
        this(wedgeAffinity0, wedgeAffinity0);
    }

    public SelectionWedgeAffinity(@NotNull WedgeAffinity wedgeAffinity0, @NotNull WedgeAffinity wedgeAffinity1) {
        this.a = wedgeAffinity0;
        this.b = wedgeAffinity1;
    }

    @NotNull
    public final WedgeAffinity component1() {
        return this.a;
    }

    @NotNull
    public final WedgeAffinity component2() {
        return this.b;
    }

    @NotNull
    public final SelectionWedgeAffinity copy(@NotNull WedgeAffinity wedgeAffinity0, @NotNull WedgeAffinity wedgeAffinity1) {
        return new SelectionWedgeAffinity(wedgeAffinity0, wedgeAffinity1);
    }

    public static SelectionWedgeAffinity copy$default(SelectionWedgeAffinity selectionWedgeAffinity0, WedgeAffinity wedgeAffinity0, WedgeAffinity wedgeAffinity1, int v, Object object0) {
        if((v & 1) != 0) {
            wedgeAffinity0 = selectionWedgeAffinity0.a;
        }
        if((v & 2) != 0) {
            wedgeAffinity1 = selectionWedgeAffinity0.b;
        }
        return selectionWedgeAffinity0.copy(wedgeAffinity0, wedgeAffinity1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SelectionWedgeAffinity)) {
            return false;
        }
        return this.a == ((SelectionWedgeAffinity)object0).a ? this.b == ((SelectionWedgeAffinity)object0).b : false;
    }

    @NotNull
    public final WedgeAffinity getEndAffinity() {
        return this.b;
    }

    @NotNull
    public final WedgeAffinity getStartAffinity() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.a + ", endAffinity=" + this.b + ')';
    }
}

