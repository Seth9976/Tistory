package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000B\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000F\u001A\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u000F\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\b¢\u0006\u0004\b\u0013\u0010\u0003R(\u0010\u0019\u001A\u00020\u00068\u0000@\u0000X\u0080\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u000E\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001D\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u0015\u001A\u0004\b\u001B\u0010\u000E\"\u0004\b\u001C\u0010\u0018\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "<init>", "()V", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "calculateVelocity", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "resetTracking", "c", "J", "getCurrentPointerPositionAccumulator-F1C5BW0$ui_release", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release", "(J)V", "currentPointerPositionAccumulator", "d", "getLastMoveEventTimeStamp$ui_release", "setLastMoveEventTimeStamp$ui_release", "lastMoveEventTimeStamp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,734:1\n42#2,7:735\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n*L\n105#1:735,7\n*E\n"})
public final class VelocityTracker {
    public static final int $stable = 8;
    public final VelocityTracker1D a;
    public final VelocityTracker1D b;
    public long c;
    public long d;

    public VelocityTracker() {
        this.a = new VelocityTracker1D(false, Strategy.Lsq2, 1, null);
        this.b = new VelocityTracker1D(false, Strategy.Lsq2, 1, null);
        this.c = 0L;
    }

    public final void addPosition-Uv8p0NA(long v, long v1) {
        this.a.addDataPoint(v, Offset.getX-impl(v1));
        this.b.addDataPoint(v, Offset.getY-impl(v1));
    }

    // 去混淆评级： 低(20)
    public final long calculateVelocity-9UxMQ8M() {
        return this.calculateVelocity-AH228Gc(0x7F7FFFFF7F7FFFFFL);
    }

    public final long calculateVelocity-AH228Gc(long v) {
        if(Velocity.getX-impl(v) <= 0.0f || Velocity.getY-impl(v) <= 0.0f) {
            InlineClassHelperKt.throwIllegalStateException(("maximumVelocity should be a positive value. You specified=" + Velocity.toString-impl(v)));
        }
        return VelocityKt.Velocity(this.a.calculateVelocity(Velocity.getX-impl(v)), this.b.calculateVelocity(Velocity.getY-impl(v)));
    }

    public final long getCurrentPointerPositionAccumulator-F1C5BW0$ui_release() {
        return this.c;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.d;
    }

    public final void resetTracking() {
        this.a.resetTracking();
        this.b.resetTracking();
        this.d = 0L;
    }

    public final void setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(long v) {
        this.c = v;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long v) {
        this.d = v;
    }
}

