package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot.Companion;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0005H\u0086@¢\u0006\u0004\b\b\u0010\u0007J\"\u0010\r\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0086@¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0002\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001C\u0010\u0013\u001A\u00020\u000B8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001C\u0010\u0017\u001A\u00020\u000B8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\"\u0010\u001E\u001A\u00020\u00198\u0016@\u0016X\u0096\u000Fø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u0011\u0010!\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0011\u0010%\u001A\u00020\"8F¢\u0006\u0006\u001A\u0004\b#\u0010$R$\u0010*\u001A\u00020&2\u0006\u0010\'\u001A\u00020&8V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b(\u0010\u001B\"\u0004\b)\u0010\u001DR$\u0010-\u001A\u00020&2\u0006\u0010\'\u001A\u00020&8V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b+\u0010\u001B\"\u0004\b,\u0010\u001D\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material3/AnalogTimePickerState;", "Landroidx/compose/material3/TimePickerState;", "state", "<init>", "(Landroidx/compose/material3/TimePickerState;)V", "", "animateToCurrent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onGestureEnd", "", "angle", "", "animate", "rotateTo", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/compose/material3/TimePickerState;", "getState", "()Landroidx/compose/material3/TimePickerState;", "is24hour", "()Z", "set24hour", "(Z)V", "isAfternoon", "setAfternoon", "Landroidx/compose/material3/TimePickerSelectionMode;", "getSelection-yecRtBI", "()I", "setSelection-6_8s6DQ", "(I)V", "selection", "getCurrentAngle", "()F", "currentAngle", "Landroidx/collection/IntList;", "getClockFaceValues", "()Landroidx/collection/IntList;", "clockFaceValues", "", "value", "getMinute", "setMinute", "minute", "getHour", "setHour", "hour", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/AnalogTimePickerState\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,2008:1\n602#2,8:2009\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/AnalogTimePickerState\n*L\n822#1:2009,8\n*E\n"})
public final class AnalogTimePickerState implements TimePickerState {
    public static final int $stable = 8;
    public final TimePickerState a;
    public float b;
    public float c;
    public Animatable d;
    public final MutatorMutex e;

    public AnalogTimePickerState(@NotNull TimePickerState timePickerState0) {
        this.a = timePickerState0;
        this.b = ((float)(timePickerState0.getHour() % 12)) * 0.523599f - 1.570796f;
        this.c = ((float)timePickerState0.getMinute()) * 0.10472f - 1.570796f;
        this.d = AnimatableKt.Animatable$default(this.b, 0.0f, 2, null);
        this.e = new MutatorMutex();
    }

    public final float a(float f) {
        float f1;
        for(f1 = ((Number)this.d.getValue()).floatValue() - f; Float.compare(f1, 3.141593f) > 0; f1 -= 6.283185f) {
        }
        while(f1 <= -3.141593f) {
            f1 += 6.283185f;
        }
        return ((Number)this.d.getValue()).floatValue() - f1;
    }

    public static final float access$offsetAngle(AnalogTimePickerState analogTimePickerState0, float f) {
        analogTimePickerState0.getClass();
        return f + 1.570796f < 0.0f ? f + 7.853982f : f + 1.570796f;
    }

    public static final int access$toHour(AnalogTimePickerState analogTimePickerState0, float f) {
        analogTimePickerState0.getClass();
        return ((int)((((double)f) + 1.832596) / 0.523599)) % 12;
    }

    public static final int access$toMinute(AnalogTimePickerState analogTimePickerState0, float f) {
        analogTimePickerState0.getClass();
        return ((int)((((double)f) + 1.623156) / 0.10472)) % 60;
    }

    @Nullable
    public final Object animateToCurrent(@NotNull Continuation continuation0) {
        if(TimePickerSelectionMode.equals-impl0(this.getSelection-yecRtBI(), 0) && AnalogTimePickerState.b(((Number)this.d.getTargetValue()).floatValue()) == AnalogTimePickerState.b(this.b) || TimePickerSelectionMode.equals-impl0(this.getSelection-yecRtBI(), 1) && AnalogTimePickerState.b(((Number)this.d.getTargetValue()).floatValue()) == AnalogTimePickerState.b(this.c)) {
            return Unit.INSTANCE;
        }
        o o0 = new o(this, (TimePickerSelectionMode.equals-impl0(this.getSelection-yecRtBI(), 0) ? this.a(this.b) : this.a(this.c)), null);
        Object object0 = this.e.mutate(MutatePriority.PreventUserInput, o0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static float b(float f) {
        double f1 = ((double)f) % 6.283185;
        return (float)(f1 < 0.0 ? f1 + 6.283185 : ((double)f) % 6.283185);
    }

    // 去混淆评级： 低(40)
    @NotNull
    public final IntList getClockFaceValues() {
        return TimePickerSelectionMode.equals-impl0(this.getSelection-yecRtBI(), 1) ? TimePickerKt.access$getMinutes$p() : TimePickerKt.access$getHours$p();
    }

    public final float getCurrentAngle() {
        return ((Number)this.d.getValue()).floatValue();
    }

    @Override  // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.a.getHour();
    }

    @Override  // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.a.getMinute();
    }

    @Override  // androidx.compose.material3.TimePickerState
    public int getSelection-yecRtBI() {
        return this.a.getSelection-yecRtBI();
    }

    @NotNull
    public final TimePickerState getState() {
        return this.a;
    }

    @Override  // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.a.is24hour();
    }

    @Override  // androidx.compose.material3.TimePickerState
    public boolean isAfternoon() {
        return this.a.isAfternoon();
    }

    @Nullable
    public final Object onGestureEnd(@NotNull Continuation continuation0) {
        p p0 = new p(this, this.a((TimePickerSelectionMode.equals-impl0(this.getSelection-yecRtBI(), 0) ? this.b : this.c)), null);
        Object object0 = this.e.mutate(MutatePriority.PreventUserInput, p0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object rotateTo(float f, boolean z, @NotNull Continuation continuation0) {
        q q0 = new q(this, f, z, null);
        Object object0 = this.e.mutate(MutatePriority.UserInput, q0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object rotateTo$default(AnalogTimePickerState analogTimePickerState0, float f, boolean z, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return analogTimePickerState0.rotateTo(f, z, continuation0);
    }

    @Override  // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z) {
        this.a.set24hour(z);
    }

    @Override  // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean z) {
        this.a.setAfternoon(z);
    }

    @Override  // androidx.compose.material3.TimePickerState
    public void setHour(int v) {
        this.b = ((float)(v % 12)) * 0.523599f - 1.570796f;
        this.a.setHour(v);
        if(TimePickerSelectionMode.equals-impl0(this.getSelection-yecRtBI(), 0)) {
            this.d = AnimatableKt.Animatable$default(this.b, 0.0f, 2, null);
        }
    }

    @Override  // androidx.compose.material3.TimePickerState
    public void setMinute(int v) {
        this.c = ((float)v) * 0.10472f - 1.570796f;
        TimePickerState timePickerState0 = this.a;
        timePickerState0.setMinute(v);
        Function1 function10 = null;
        if(TimePickerSelectionMode.equals-impl0(this.getSelection-yecRtBI(), 1)) {
            this.d = AnimatableKt.Animatable$default(this.c, 0.0f, 2, null);
        }
        Companion snapshot$Companion0 = Snapshot.Companion;
        Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
        if(snapshot0 != null) {
            function10 = snapshot0.getReadObserver();
        }
        Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
        try {
            timePickerState0.setMinute(this.getMinute());
        }
        finally {
            snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
        }
    }

    @Override  // androidx.compose.material3.TimePickerState
    public void setSelection-6_8s6DQ(int v) {
        this.a.setSelection-6_8s6DQ(v);
    }
}

