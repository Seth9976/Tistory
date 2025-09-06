package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;

public final class vq implements TimePickerState {
    public boolean a;
    public final MutableState b;
    public final MutableState c;
    public final MutableIntState d;
    public final MutableIntState e;
    public static final TimePickerStateImpl.Companion f;

    static {
        vq.f = new TimePickerStateImpl.Companion(null);
    }

    public vq(int v, int v1, boolean z) {
        if(v < 0 || v >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if(v1 < 0 || v1 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.a = z;
        this.b = SnapshotStateKt.mutableStateOf$default(TimePickerSelectionMode.box-impl(0), null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(v >= 12), null, 2, null);
        this.d = SnapshotIntStateKt.mutableIntStateOf(v % 12);
        this.e = SnapshotIntStateKt.mutableIntStateOf(v1);
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final int getHour() {
        int v = this.d.getIntValue();
        return this.isAfternoon() ? v + 12 : v;
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final int getMinute() {
        return this.e.getIntValue();
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final int getSelection-yecRtBI() {
        return ((TimePickerSelectionMode)this.b.getValue()).unbox-impl();
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final boolean is24hour() {
        return this.a;
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final boolean isAfternoon() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final void set24hour(boolean z) {
        this.a = z;
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final void setAfternoon(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final void setHour(int v) {
        this.setAfternoon(v >= 12);
        this.d.setIntValue(v % 12);
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final void setMinute(int v) {
        this.e.setIntValue(v);
    }

    @Override  // androidx.compose.material3.TimePickerState
    public final void setSelection-6_8s6DQ(int v) {
        TimePickerSelectionMode timePickerSelectionMode0 = TimePickerSelectionMode.box-impl(v);
        this.b.setValue(timePickerSelectionMode0);
    }
}

