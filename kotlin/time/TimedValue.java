package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ*\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\tR\u001A\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u000B\u0082\u0002\u0004\n\u0002\b!¨\u0006 "}, d2 = {"Lkotlin/time/TimedValue;", "T", "", "value", "Lkotlin/time/Duration;", "duration", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/Object;", "component2-UwyO8pc", "()J", "component2", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getValue", "b", "J", "getDuration-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public final class TimedValue {
    public final Object a;
    public final long b;

    public TimedValue(Object object0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = object0;
        this.b = v;
    }

    public final Object component1() {
        return this.a;
    }

    public final long component2-UwyO8pc() {
        return this.b;
    }

    @NotNull
    public final TimedValue copy-RFiDyg4(Object object0, long v) {
        return new TimedValue(object0, v, null);
    }

    public static TimedValue copy-RFiDyg4$default(TimedValue timedValue0, Object object0, long v, int v1, Object object1) {
        if((v1 & 1) != 0) {
            object0 = timedValue0.a;
        }
        if((v1 & 2) != 0) {
            v = timedValue0.b;
        }
        return timedValue0.copy-RFiDyg4(object0, v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TimedValue)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((TimedValue)object0).a) ? Duration.equals-impl0(this.b, ((TimedValue)object0).b) : false;
    }

    public final long getDuration-UwyO8pc() {
        return this.b;
    }

    public final Object getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? Duration.hashCode-impl(this.b) : Duration.hashCode-impl(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + Duration.toString-impl(this.b) + ')';
    }
}

