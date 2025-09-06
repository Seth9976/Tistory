package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000E\u001A\u0004\b\u0012\u0010\u0010R*\u0010\b\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u00048\u0000@BX\u0080\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u000E\u001A\u0004\b\u0015\u0010\u0010\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/HistoricalChange;", "", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "originalEventPosition", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "a", "J", "getUptimeMillis", "()J", "b", "getPosition-F1C5BW0", "<set-?>", "c", "getOriginalEventPosition-F1C5BW0$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HistoricalChange {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;

    public HistoricalChange(long v, long v1, long v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, null);
        this.c = v2;
    }

    public HistoricalChange(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = 0L;
    }

    public final long getOriginalEventPosition-F1C5BW0$ui_release() {
        return this.c;
    }

    public final long getPosition-F1C5BW0() {
        return this.b;
    }

    public final long getUptimeMillis() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + Offset.toString-impl(this.b) + ')';
    }
}

