package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001A\u00020\f2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u0003R+\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00068F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00048F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR+\u0010\"\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00048F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u001F\u0010\u0019\u001A\u0004\b \u0010\u001B\"\u0004\b!\u0010\u001D¨\u0006#"}, d2 = {"Landroidx/compose/material3/DrawerPredictiveBackState;", "", "<init>", "()V", "", "progress", "", "swipeEdgeLeft", "isRtl", "maxScaleXDistanceGrow", "maxScaleXDistanceShrink", "maxScaleYDistance", "", "update", "(FZZFFF)V", "clear", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getSwipeEdgeMatchesDrawer", "()Z", "setSwipeEdgeMatchesDrawer", "(Z)V", "swipeEdgeMatchesDrawer", "b", "Landroidx/compose/runtime/MutableFloatState;", "getScaleXDistance", "()F", "setScaleXDistance", "(F)V", "scaleXDistance", "c", "getScaleYDistance", "setScaleYDistance", "scaleYDistance", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerPredictiveBackState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,1161:1\n81#2:1162\n107#2,2:1163\n76#3:1165\n109#3,2:1166\n76#3:1168\n109#3,2:1169\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerPredictiveBackState\n*L\n1045#1:1162\n1045#1:1163,2\n1047#1:1165\n1047#1:1166,2\n1049#1:1168\n1049#1:1169,2\n*E\n"})
public final class DrawerPredictiveBackState {
    public static final int $stable;
    public final MutableState a;
    public final MutableFloatState b;
    public final MutableFloatState c;

    public DrawerPredictiveBackState() {
        this.a = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.b = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.c = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public final void clear() {
        this.setSwipeEdgeMatchesDrawer(true);
        this.setScaleXDistance(0.0f);
        this.setScaleYDistance(0.0f);
    }

    public final float getScaleXDistance() {
        return this.b.getFloatValue();
    }

    public final float getScaleYDistance() {
        return this.c.getFloatValue();
    }

    public final boolean getSwipeEdgeMatchesDrawer() {
        return ((Boolean)this.a.getValue()).booleanValue();
    }

    public final void setScaleXDistance(float f) {
        this.b.setFloatValue(f);
    }

    public final void setScaleYDistance(float f) {
        this.c.setFloatValue(f);
    }

    public final void setSwipeEdgeMatchesDrawer(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void update(float f, boolean z, boolean z1, float f1, float f2, float f3) {
        this.setSwipeEdgeMatchesDrawer(z != z1);
        if(!this.getSwipeEdgeMatchesDrawer()) {
            f1 = f2;
        }
        this.setScaleXDistance(f * f1 + (1.0f - f) * 0.0f);
        this.setScaleYDistance(f * f3 + (1.0f - f) * 0.0f);
    }
}

