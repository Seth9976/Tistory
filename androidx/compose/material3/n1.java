package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import kotlin.ranges.c;

public final class n1 implements BottomAppBarState {
    public final MutableFloatState a;
    public final MutableFloatState b;
    public final MutableFloatState c;

    public n1(float f, float f1, float f2) {
        this.a = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.b = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.c = PrimitiveSnapshotStateKt.mutableFloatStateOf(f1);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.material3.BottomAppBarState
    public final float getCollapsedFraction() {
        return this.a.getFloatValue() == 0.0f ? 0.0f : this.c.getFloatValue() / this.a.getFloatValue();
    }

    @Override  // androidx.compose.material3.BottomAppBarState
    public final float getContentOffset() {
        return this.b.getFloatValue();
    }

    @Override  // androidx.compose.material3.BottomAppBarState
    public final float getHeightOffset() {
        return this.c.getFloatValue();
    }

    @Override  // androidx.compose.material3.BottomAppBarState
    public final float getHeightOffsetLimit() {
        return this.a.getFloatValue();
    }

    @Override  // androidx.compose.material3.BottomAppBarState
    public final void setContentOffset(float f) {
        this.b.setFloatValue(f);
    }

    @Override  // androidx.compose.material3.BottomAppBarState
    public final void setHeightOffset(float f) {
        float f1 = c.coerceIn(f, this.a.getFloatValue(), 0.0f);
        this.c.setFloatValue(f1);
    }

    @Override  // androidx.compose.material3.BottomAppBarState
    public final void setHeightOffsetLimit(float f) {
        this.a.setFloatValue(f);
    }
}

