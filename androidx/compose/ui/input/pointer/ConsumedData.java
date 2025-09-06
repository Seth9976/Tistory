package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u000E\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR(\u0010\u0004\u001A\u00020\u00028\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b\u000F\u0010\b\u0012\u0004\b\u0012\u0010\u000E\u001A\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/ConsumedData;", "", "", "positionChange", "downChange", "<init>", "(ZZ)V", "a", "Z", "getPositionChange", "()Z", "setPositionChange", "(Z)V", "getPositionChange$annotations", "()V", "b", "getDownChange", "setDownChange", "getDownChange$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ConsumedData {
    public static final int $stable = 8;
    public boolean a;
    public boolean b;

    public ConsumedData() {
        this(false, false, 3, null);
    }

    public ConsumedData(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public ConsumedData(boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        this(z, z1);
    }

    public final boolean getDownChange() {
        return this.b;
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static void getDownChange$annotations() {
    }

    public final boolean getPositionChange() {
        return this.a;
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static void getPositionChange$annotations() {
    }

    public final void setDownChange(boolean z) {
        this.b = z;
    }

    public final void setPositionChange(boolean z) {
        this.a = z;
    }
}

