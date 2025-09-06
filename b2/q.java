package b2;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.OwnerScope;
import kotlin.jvm.internal.Intrinsics;

public final class q implements OwnerScope {
    public final MeasureResult a;
    public final LookaheadCapablePlaceable b;

    public q(MeasureResult measureResult0, LookaheadCapablePlaceable lookaheadCapablePlaceable0) {
        this.a = measureResult0;
        this.b = lookaheadCapablePlaceable0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((q)object0).a) ? Intrinsics.areEqual(this.b, ((q)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return this.b.getCoordinates().isAttached();
    }

    @Override
    public final String toString() {
        return "PlaceableResult(result=" + this.a + ", placeable=" + this.b + ')';
    }
}

