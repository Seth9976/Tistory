package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u001B\b\u0007\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CB\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000F\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00028F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER+\u0010\u0013\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00028F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001A\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000ER$\u0010\u0017\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u00028F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000ER\u0011\u0010\u0019\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\fR\u0011\u0010\u001B\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u001A\u0010\f¨\u0006\u001D"}, d2 = {"Landroidx/compose/material3/TopAppBarState;", "", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "<set-?>", "a", "Landroidx/compose/runtime/MutableFloatState;", "getHeightOffsetLimit", "()F", "setHeightOffsetLimit", "(F)V", "heightOffsetLimit", "b", "getContentOffset", "setContentOffset", "contentOffset", "newOffset", "getHeightOffset", "setHeightOffset", "heightOffset", "getCollapsedFraction", "collapsedFraction", "getOverlappedFraction", "overlappedFraction", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,2543:1\n76#2:2544\n109#2,2:2545\n76#2:2547\n109#2,2:2548\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n*L\n1322#1:2544\n1322#1:2545,2\n1347#1:2547\n1347#1:2548,2\n*E\n"})
public final class TopAppBarState {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\u0004\u001A\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/TopAppBarState$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TopAppBarState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return TopAppBarState.d;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableFloatState a;
    public final MutableFloatState b;
    public final MutableFloatState c;
    public static final Saver d;

    static {
        TopAppBarState.Companion = new Companion(null);
        TopAppBarState.d = ListSaverKt.listSaver(u4.P, jq.A);
    }

    public TopAppBarState(float f, float f1, float f2) {
        this.a = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.b = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.c = PrimitiveSnapshotStateKt.mutableFloatStateOf(f1);
    }

    // 去混淆评级： 低(20)
    public final float getCollapsedFraction() {
        return this.getHeightOffsetLimit() == 0.0f ? 0.0f : this.getHeightOffset() / this.getHeightOffsetLimit();
    }

    public final float getContentOffset() {
        return this.b.getFloatValue();
    }

    public final float getHeightOffset() {
        return this.c.getFloatValue();
    }

    public final float getHeightOffsetLimit() {
        return this.a.getFloatValue();
    }

    // 去混淆评级： 低(20)
    public final float getOverlappedFraction() {
        return this.getHeightOffsetLimit() == 0.0f ? 0.0f : 1.0f - c.coerceIn(this.getHeightOffsetLimit() - this.getContentOffset(), this.getHeightOffsetLimit(), 0.0f) / this.getHeightOffsetLimit();
    }

    public final void setContentOffset(float f) {
        this.b.setFloatValue(f);
    }

    public final void setHeightOffset(float f) {
        float f1 = c.coerceIn(f, this.getHeightOffsetLimit(), 0.0f);
        this.c.setFloatValue(f1);
    }

    public final void setHeightOffsetLimit(float f) {
        this.a.setFloatValue(f);
    }
}

