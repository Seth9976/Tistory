package androidx.compose.ui.input.pointer;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\b\b\u0002\u0010\u000F\u001A\u00020\t\u0012\u000E\b\u0002\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0018J\u0016\u0010\u001C\u001A\u00020\u0006H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0018J\u0016\u0010\u001E\u001A\u00020\u0006H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0018J\u0010\u0010\u001F\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0016\u0010%\u001A\u00020\rH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010&\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010 J\u0016\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0016\u0010*\u001A\u00020\u0006H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010\u0018J\u0016\u0010,\u001A\u00020\u0006H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b+\u0010\u0018J\u0087\u0001\u0010/\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\t2\u000E\b\u0002\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00062\b\b\u0002\u0010\u0014\u001A\u00020\u0006H\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b-\u0010.J\u0010\u00101\u001A\u000200H\u00D6\u0001\u00A2\u0006\u0004\b1\u00102J\u0010\u00104\u001A\u000203H\u00D6\u0001\u00A2\u0006\u0004\b4\u0010$J\u001A\u00106\u001A\u00020\t2\b\u00105\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b6\u00107R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u0018R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b;\u00109\u001A\u0004\b<\u0010\u0018R\u001D\u0010\u0007\u001A\u00020\u00068\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b=\u00109\u001A\u0004\b>\u0010\u0018R\u001D\u0010\b\u001A\u00020\u00068\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b?\u00109\u001A\u0004\b@\u0010\u0018R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010 R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010\"R\u001D\u0010\u000E\u001A\u00020\r8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010$R\u0017\u0010\u000F\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bJ\u0010B\u001A\u0004\bK\u0010 R\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010(R\u001D\u0010\u0013\u001A\u00020\u00068\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bO\u00109\u001A\u0004\bP\u0010\u0018R\u001D\u0010\u0014\u001A\u00020\u00068\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bQ\u00109\u001A\u0004\bR\u0010\u0018\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006S"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptime", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", "position", "", "down", "", "pressure", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "activeHover", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-J3iCeTQ", "()J", "component1", "component2", "component3-F1C5BW0", "component3", "component4-F1C5BW0", "component4", "component5", "()Z", "component6", "()F", "component7-T8wyACA", "()I", "component7", "component8", "component9", "()Ljava/util/List;", "component10-F1C5BW0", "component10", "component11-F1C5BW0", "component11", "copy-rc8HELY", "(JJJJZFIZLjava/util/List;JJ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId-J3iCeTQ", "b", "getUptime", "c", "getPositionOnScreen-F1C5BW0", "d", "getPosition-F1C5BW0", "e", "Z", "getDown", "f", "F", "getPressure", "g", "I", "getType-T8wyACA", "h", "getActiveHover", "i", "Ljava/util/List;", "getHistorical", "j", "getScrollDelta-F1C5BW0", "k", "getOriginalEventPosition-F1C5BW0", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PointerInputEventData {
    public static final int $stable = 8;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final long k;

    public PointerInputEventData(long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, List list0, long v5, long v6, int v7, DefaultConstructorMarker defaultConstructorMarker0) {
        List list1 = (v7 & 0x100) == 0 ? list0 : new ArrayList();
        this(v, v1, v2, v3, z, f, v4, ((v7 & 0x80) == 0 ? z1 : false), list1, ((v7 & 0x200) == 0 ? v5 : 0L), ((v7 & 0x400) == 0 ? v6 : 0L), null);
    }

    public PointerInputEventData(long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, List list0, long v5, long v6, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = z;
        this.f = f;
        this.g = v4;
        this.h = z1;
        this.i = list0;
        this.j = v5;
        this.k = v6;
    }

    public final long component1-J3iCeTQ() {
        return this.a;
    }

    public final long component10-F1C5BW0() {
        return this.j;
    }

    public final long component11-F1C5BW0() {
        return this.k;
    }

    public final long component2() {
        return this.b;
    }

    public final long component3-F1C5BW0() {
        return this.c;
    }

    public final long component4-F1C5BW0() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final float component6() {
        return this.f;
    }

    public final int component7-T8wyACA() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    @NotNull
    public final List component9() {
        return this.i;
    }

    @NotNull
    public final PointerInputEventData copy-rc8HELY(long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, @NotNull List list0, long v5, long v6) {
        return new PointerInputEventData(v, v1, v2, v3, z, f, v4, z1, list0, v5, v6, null);
    }

    public static PointerInputEventData copy-rc8HELY$default(PointerInputEventData pointerInputEventData0, long v, long v1, long v2, long v3, boolean z, float f, int v4, boolean z1, List list0, long v5, long v6, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : pointerInputEventData0.a;
        long v9 = (v7 & 2) == 0 ? v1 : pointerInputEventData0.b;
        long v10 = (v7 & 4) == 0 ? v2 : pointerInputEventData0.c;
        long v11 = (v7 & 8) == 0 ? v3 : pointerInputEventData0.d;
        boolean z2 = (v7 & 16) == 0 ? z : pointerInputEventData0.e;
        float f1 = (v7 & 0x20) == 0 ? f : pointerInputEventData0.f;
        int v12 = (v7 & 0x40) == 0 ? v4 : pointerInputEventData0.g;
        boolean z3 = (v7 & 0x80) == 0 ? z1 : pointerInputEventData0.h;
        List list1 = (v7 & 0x100) == 0 ? list0 : pointerInputEventData0.i;
        long v13 = (v7 & 0x200) == 0 ? v5 : pointerInputEventData0.j;
        return (v7 & 0x400) == 0 ? pointerInputEventData0.copy-rc8HELY(v8, v9, v10, v11, z2, f1, v12, z3, list1, v13, v6) : pointerInputEventData0.copy-rc8HELY(v8, v9, v10, v11, z2, f1, v12, z3, list1, v13, pointerInputEventData0.k);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PointerInputEventData)) {
            return false;
        }
        if(!PointerId.equals-impl0(this.a, ((PointerInputEventData)object0).a)) {
            return false;
        }
        if(this.b != ((PointerInputEventData)object0).b) {
            return false;
        }
        if(!Offset.equals-impl0(this.c, ((PointerInputEventData)object0).c)) {
            return false;
        }
        if(!Offset.equals-impl0(this.d, ((PointerInputEventData)object0).d)) {
            return false;
        }
        if(this.e != ((PointerInputEventData)object0).e) {
            return false;
        }
        if(Float.compare(this.f, ((PointerInputEventData)object0).f) != 0) {
            return false;
        }
        if(!PointerType.equals-impl0(this.g, ((PointerInputEventData)object0).g)) {
            return false;
        }
        if(this.h != ((PointerInputEventData)object0).h) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((PointerInputEventData)object0).i)) {
            return false;
        }
        return Offset.equals-impl0(this.j, ((PointerInputEventData)object0).j) ? Offset.equals-impl0(this.k, ((PointerInputEventData)object0).k) : false;
    }

    public final boolean getActiveHover() {
        return this.h;
    }

    public final boolean getDown() {
        return this.e;
    }

    @NotNull
    public final List getHistorical() {
        return this.i;
    }

    public final long getId-J3iCeTQ() {
        return this.a;
    }

    public final long getOriginalEventPosition-F1C5BW0() {
        return this.k;
    }

    public final long getPosition-F1C5BW0() {
        return this.d;
    }

    public final long getPositionOnScreen-F1C5BW0() {
        return this.c;
    }

    public final float getPressure() {
        return this.f;
    }

    public final long getScrollDelta-F1C5BW0() {
        return this.j;
    }

    public final int getType-T8wyACA() {
        return this.g;
    }

    public final long getUptime() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Offset.hashCode-impl(this.k) + (Offset.hashCode-impl(this.j) + b.c(this.i, a.e((PointerType.hashCode-impl(this.g) + a.b(this.f, a.e((Offset.hashCode-impl(this.d) + (Offset.hashCode-impl(this.c) + wb.a.k(this.b, PointerId.hashCode-impl(this.a) * 0x1F, 0x1F)) * 0x1F) * 0x1F, 0x1F, this.e), 0x1F)) * 0x1F, 0x1F, this.h), 0x1F)) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + PointerId.toString-impl(this.a) + ", uptime=" + this.b + ", positionOnScreen=" + Offset.toString-impl(this.c) + ", position=" + Offset.toString-impl(this.d) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + PointerType.toString-impl(this.g) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + Offset.toString-impl(this.j) + ", originalEventPosition=" + Offset.toString-impl(this.k) + ')';
    }
}

