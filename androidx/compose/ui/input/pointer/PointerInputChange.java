package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000E\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\u0006\u0012\u0006\u0010\u000E\u001A\u00020\b\u0012\u0006\u0010\u000F\u001A\u00020\b\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010\u0014B]\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\u0006\u0012\u0006\u0010\u000E\u001A\u00020\b\u0012\u0006\u0010\u000F\u001A\u00020\b\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010\u0015BS\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\u0006\u0012\u0006\u0010\u000E\u001A\u00020\b\u0012\u0006\u0010\u0017\u001A\u00020\u0016\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0013\u0010\u0018Bw\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\u0006\u0012\u0006\u0010\u000E\u001A\u00020\b\u0012\u0006\u0010\u000F\u001A\u00020\b\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u0019\u0012\u0006\u0010\u0012\u001A\u00020\u0006\u0012\u0006\u0010\u001C\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010\u001DJ\r\u0010\u001F\u001A\u00020\u001E\u00A2\u0006\u0004\b\u001F\u0010 Jl\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u00042\b\b\u0002\u0010\"\u001A\u00020\u00062\b\b\u0002\u0010#\u001A\u00020\b2\b\b\u0002\u0010$\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0011\u001A\u00020\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&Jj\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u00042\b\b\u0002\u0010\"\u001A\u00020\u00062\b\b\u0002\u0010#\u001A\u00020\b2\b\b\u0002\u0010$\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u0006\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)Jt\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u00042\b\b\u0002\u0010\"\u001A\u00020\u00062\b\b\u0002\u0010#\u001A\u00020\b2\b\b\u0002\u0010$\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\b2\u0006\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u0006H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+Jt\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u00042\b\b\u0002\u0010\"\u001A\u00020\u00062\b\b\u0002\u0010#\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010$\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u0006\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-Jz\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u00042\b\b\u0002\u0010\"\u001A\u00020\u00062\b\b\u0002\u0010#\u001A\u00020\b2\b\b\u0002\u0010$\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\b\b\u0002\u0010\u0012\u001A\u00020\u0006H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/J\u0086\u0001\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010!\u001A\u00020\u00042\b\b\u0002\u0010\"\u001A\u00020\u00062\b\b\u0002\u0010#\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010$\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\b\b\u0002\u0010\u0012\u001A\u00020\u0006H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101J\u000F\u00103\u001A\u000202H\u0016\u00A2\u0006\u0004\b3\u00104R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b9\u00106\u001A\u0004\b:\u00108R\u001D\u0010\u0007\u001A\u00020\u00068\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b;\u00106\u001A\u0004\b<\u00108R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u0017\u0010\f\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bE\u00106\u001A\u0004\bF\u00108R\u001D\u0010\r\u001A\u00020\u00068\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bG\u00106\u001A\u0004\bH\u00108R\u0017\u0010\u000E\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bI\u0010>\u001A\u0004\bJ\u0010@R\u001D\u0010\u0011\u001A\u00020\u00108\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010NR\u001D\u0010\u0012\u001A\u00020\u00068\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bO\u00106\u001A\u0004\bP\u00108R(\u0010\u001C\u001A\u00020\u00068\u0000@\u0000X\u0080\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bQ\u00106\u001A\u0004\bR\u00108\"\u0004\bS\u0010TR*\u0010\u0017\u001A\u00020\u00162\u0006\u0010U\u001A\u00020\u00168\u0006@BX\u0087\u000E\u00A2\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010 \u001A\u0004\bX\u0010YR \u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00198GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b]\u0010 \u001A\u0004\b[\u0010\\R\u0017\u0010^\u001A\u00020\b8F\u00A2\u0006\f\u0012\u0004\b_\u0010 \u001A\u0004\b^\u0010@\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006`"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/pointer/ConsumedData;", "consumed", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "consume", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-Tn9QgHE", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "toString", "()Ljava/lang/String;", "a", "J", "getId-J3iCeTQ", "()J", "b", "getUptimeMillis", "c", "getPosition-F1C5BW0", "d", "Z", "getPressed", "()Z", "e", "F", "getPressure", "()F", "f", "getPreviousUptimeMillis", "g", "getPreviousPosition-F1C5BW0", "h", "getPreviousPressed", "i", "I", "getType-T8wyACA", "()I", "j", "getScrollDelta-F1C5BW0", "l", "getOriginalEventPosition-F1C5BW0$ui_release", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "<set-?>", "m", "Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed$annotations", "getHistorical", "()Ljava/util/List;", "getHistorical$annotations", "isConsumed", "isConsumed$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PointerInputChange {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final List k;
    public long l;
    public ConsumedData m;

    // 去混淆评级： 低(20)
    public PointerInputChange(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, long v6, int v7, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, z, f, v3, v4, z1, z2, ((v7 & 0x200) == 0 ? v5 : 1), ((v7 & 0x400) == 0 ? v6 : 0L), null);
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, long v6, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = z;
        this.e = f;
        this.f = v3;
        this.g = v4;
        this.h = z1;
        this.i = v5;
        this.j = v6;
        this.l = 0L;
        this.m = new ConsumedData(z2, z2);
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, boolean z2, int v5, List list0, long v6, long v7, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, z, f, v3, v4, z1, z2, v5, v6, null);
        this.k = list0;
        this.l = v7;
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, int v6, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, z, v3, v4, z1, consumedData0, ((v6 & 0x100) == 0 ? v5 : 1), null);
    }

    // 去混淆评级： 低(20)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, z, 1.0f, v3, v4, z1, consumedData0.getDownChange() || consumedData0.getPositionChange(), v5, 0L, null);
    }

    // 去混淆评级： 低(20)
    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, boolean z2, int v5, long v6, int v7, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, z, v3, v4, z1, z2, ((v7 & 0x100) == 0 ? v5 : 1), ((v7 & 0x200) == 0 ? v6 : 0L), null);
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, boolean z2, int v5, long v6, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, z, 1.0f, v3, v4, z1, z2, v5, v6, null);
    }

    public final void consume() {
        this.m.setDownChange(true);
        this.m.setPositionChange(true);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @ReplaceWith(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @NotNull
    public final PointerInputChange copy-0GkPj7c(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, @NotNull ConsumedData consumedData0, int v5, long v6) {
        List list0 = this.getHistorical();
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, this.e, v3, v4, z1, consumedData0.getDownChange() || consumedData0.getPositionChange(), v5, list0, v6, this.l, null);
        this.m = consumedData0;
        return pointerInputChange0;
    }

    public static PointerInputChange copy-0GkPj7c$default(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        long v11 = (v7 & 16) == 0 ? v3 : pointerInputChange0.f;
        long v12 = (v7 & 0x20) == 0 ? v4 : pointerInputChange0.g;
        boolean z3 = (v7 & 0x40) == 0 ? z1 : pointerInputChange0.h;
        int v13 = (v7 & 0x100) == 0 ? v5 : pointerInputChange0.i;
        return (v7 & 0x200) == 0 ? pointerInputChange0.copy-0GkPj7c(v8, v9, v10, z2, v11, v12, z3, consumedData0, v13, v6) : pointerInputChange0.copy-0GkPj7c(v8, v9, v10, z2, v11, v12, z3, consumedData0, v13, pointerInputChange0.j);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    public final PointerInputChange copy-Ezr-O64(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5) {
        List list0 = this.getHistorical();
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, this.e, v3, v4, z1, consumedData0.getDownChange() || consumedData0.getPositionChange(), v5, list0, this.j, this.l, null);
        this.m = consumedData0;
        return pointerInputChange0;
    }

    public static PointerInputChange copy-Ezr-O64$default(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, int v6, Object object0) {
        long v7 = (v6 & 1) == 0 ? v : pointerInputChange0.a;
        long v8 = (v6 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v9 = (v6 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v6 & 8) == 0 ? z : pointerInputChange0.d;
        long v10 = (v6 & 16) == 0 ? v3 : pointerInputChange0.f;
        long v11 = (v6 & 0x20) == 0 ? v4 : pointerInputChange0.g;
        boolean z3 = (v6 & 0x40) == 0 ? z1 : pointerInputChange0.h;
        ConsumedData consumedData1 = (v6 & 0x80) == 0 ? consumedData0 : pointerInputChange0.m;
        return (v6 & 0x100) == 0 ? pointerInputChange0.copy-Ezr-O64(v7, v8, v9, z2, v10, v11, z3, consumedData1, v5) : pointerInputChange0.copy-Ezr-O64(v7, v8, v9, z2, v10, v11, z3, consumedData1, pointerInputChange0.i);
    }

    @NotNull
    public final PointerInputChange copy-JKmWfYY(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, int v5, long v6) {
        List list0 = this.getHistorical();
        return this.copy-wbzehF4(v, v1, v2, z, this.e, v3, v4, z1, v5, list0, v6);
    }

    public static PointerInputChange copy-JKmWfYY$default(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, int v5, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        long v11 = (v7 & 16) == 0 ? v3 : pointerInputChange0.f;
        long v12 = (v7 & 0x20) == 0 ? v4 : pointerInputChange0.g;
        boolean z3 = (v7 & 0x40) == 0 ? z1 : pointerInputChange0.h;
        int v13 = (v7 & 0x80) == 0 ? v5 : pointerInputChange0.i;
        return (v7 & 0x100) == 0 ? pointerInputChange0.copy-JKmWfYY(v8, v9, v10, z2, v11, v12, z3, v13, v6) : pointerInputChange0.copy-JKmWfYY(v8, v9, v10, z2, v11, v12, z3, v13, pointerInputChange0.j);
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final PointerInputChange copy-OHpmEuE(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, int v5, @NotNull List list0, long v6) {
        return this.copy-wbzehF4(v, v1, v2, z, this.e, v3, v4, z1, v5, list0, v6);
    }

    public static PointerInputChange copy-OHpmEuE$default(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, int v5, List list0, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        long v11 = (v7 & 16) == 0 ? v3 : pointerInputChange0.f;
        long v12 = (v7 & 0x20) == 0 ? v4 : pointerInputChange0.g;
        boolean z3 = (v7 & 0x40) == 0 ? z1 : pointerInputChange0.h;
        int v13 = (v7 & 0x80) == 0 ? v5 : pointerInputChange0.i;
        return (v7 & 0x200) == 0 ? pointerInputChange0.copy-OHpmEuE(v8, v9, v10, z2, v11, v12, z3, v13, list0, v6) : pointerInputChange0.copy-OHpmEuE(v8, v9, v10, z2, v11, v12, z3, v13, list0, pointerInputChange0.j);
    }

    @NotNull
    public final PointerInputChange copy-Tn9QgHE(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, int v5, long v6) {
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, f, v3, v4, z1, false, v5, this.getHistorical(), v6, this.l, null);
        pointerInputChange0.m = this.m;
        return pointerInputChange0;
    }

    public static PointerInputChange copy-Tn9QgHE$default(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, int v5, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        float f1 = (v7 & 16) == 0 ? f : pointerInputChange0.e;
        long v11 = (v7 & 0x20) == 0 ? v3 : pointerInputChange0.f;
        long v12 = (v7 & 0x40) == 0 ? v4 : pointerInputChange0.g;
        boolean z3 = (v7 & 0x80) == 0 ? z1 : pointerInputChange0.h;
        int v13 = (v7 & 0x100) == 0 ? v5 : pointerInputChange0.i;
        return (v7 & 0x200) == 0 ? pointerInputChange0.copy-Tn9QgHE(v8, v9, v10, z2, f1, v11, v12, z3, v13, v6) : pointerInputChange0.copy-Tn9QgHE(v8, v9, v10, z2, f1, v11, v12, z3, v13, pointerInputChange0.j);
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final PointerInputChange copy-wbzehF4(long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, int v5, @NotNull List list0, long v6) {
        PointerInputChange pointerInputChange0 = new PointerInputChange(v, v1, v2, z, f, v3, v4, z1, false, v5, list0, v6, this.l, null);
        pointerInputChange0.m = this.m;
        return pointerInputChange0;
    }

    public static PointerInputChange copy-wbzehF4$default(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, float f, long v3, long v4, boolean z1, int v5, List list0, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputChange0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputChange0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputChange0.c;
        boolean z2 = (v7 & 8) == 0 ? z : pointerInputChange0.d;
        float f1 = (v7 & 16) == 0 ? f : pointerInputChange0.e;
        long v11 = (v7 & 0x20) == 0 ? v3 : pointerInputChange0.f;
        long v12 = (v7 & 0x40) == 0 ? v4 : pointerInputChange0.g;
        boolean z3 = (v7 & 0x80) == 0 ? z1 : pointerInputChange0.h;
        int v13 = (v7 & 0x100) == 0 ? v5 : pointerInputChange0.i;
        List list1 = (v7 & 0x200) == 0 ? list0 : pointerInputChange0.getHistorical();
        return (v7 & 0x400) == 0 ? pointerInputChange0.copy-wbzehF4(v8, v9, v10, z2, f1, v11, v12, z3, v13, list1, v6) : pointerInputChange0.copy-wbzehF4(v8, v9, v10, z2, f1, v11, v12, z3, v13, list1, pointerInputChange0.j);
    }

    @NotNull
    public final ConsumedData getConsumed() {
        return this.m;
    }

    @Deprecated(message = "use isConsumed and consume() pair of methods instead")
    public static void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final List getHistorical() {
        return this.k == null ? CollectionsKt__CollectionsKt.emptyList() : this.k;
    }

    @ExperimentalComposeUiApi
    public static void getHistorical$annotations() {
    }

    public final long getId-J3iCeTQ() {
        return this.a;
    }

    public final long getOriginalEventPosition-F1C5BW0$ui_release() {
        return this.l;
    }

    public final long getPosition-F1C5BW0() {
        return this.c;
    }

    public final boolean getPressed() {
        return this.d;
    }

    public final float getPressure() {
        return this.e;
    }

    public final long getPreviousPosition-F1C5BW0() {
        return this.g;
    }

    public final boolean getPreviousPressed() {
        return this.h;
    }

    public final long getPreviousUptimeMillis() {
        return this.f;
    }

    public final long getScrollDelta-F1C5BW0() {
        return this.j;
    }

    public final int getType-T8wyACA() {
        return this.i;
    }

    public final long getUptimeMillis() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    public final boolean isConsumed() {
        return this.m.getDownChange() || this.m.getPositionChange();
    }

    public static void isConsumed$annotations() {
    }

    public final void setOriginalEventPosition-k-4lQ0M$ui_release(long v) {
        this.l = v;
    }

    @Override
    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + PointerId.toString-impl(this.a) + ", uptimeMillis=" + this.b + ", position=" + Offset.toString-impl(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + Offset.toString-impl(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + this.isConsumed() + ", type=" + PointerType.toString-impl(this.i) + ", historical=" + this.getHistorical() + ",scrollDelta=" + Offset.toString-impl(this.j) + ')';
    }
}

