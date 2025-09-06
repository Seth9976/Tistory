package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import g.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001A\u0004\b\u0012\u0010\f\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"androidx/compose/foundation/gestures/TransformEvent$TransformDelta", "Lg/b;", "", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "<init>", "(FJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "b", "F", "getZoomChange", "()F", "c", "J", "getPanChange-F1C5BW0", "()J", "d", "getRotationChange", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TransformEvent.TransformDelta extends b {
    public static final int $stable;
    public final float b;
    public final long c;
    public final float d;

    public TransformEvent.TransformDelta(float f, long v, float f1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = f;
        this.c = v;
        this.d = f1;
    }

    public final long getPanChange-F1C5BW0() {
        return this.c;
    }

    public final float getRotationChange() {
        return this.d;
    }

    public final float getZoomChange() {
        return this.b;
    }
}

