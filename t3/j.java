package t3;

import android.widget.TimePicker.OnTimeChangedListener;
import android.widget.TimePicker;
import androidx.databinding.InverseBindingListener;

public final class j implements TimePicker.OnTimeChangedListener {
    public final TimePicker.OnTimeChangedListener a;
    public final InverseBindingListener b;
    public final InverseBindingListener c;

    public j(TimePicker.OnTimeChangedListener timePicker$OnTimeChangedListener0, InverseBindingListener inverseBindingListener0, InverseBindingListener inverseBindingListener1) {
        this.a = timePicker$OnTimeChangedListener0;
        this.b = inverseBindingListener0;
        this.c = inverseBindingListener1;
    }

    @Override  // android.widget.TimePicker$OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker0, int v, int v1) {
        TimePicker.OnTimeChangedListener timePicker$OnTimeChangedListener0 = this.a;
        if(timePicker$OnTimeChangedListener0 != null) {
            timePicker$OnTimeChangedListener0.onTimeChanged(timePicker0, v, v1);
        }
        InverseBindingListener inverseBindingListener0 = this.b;
        if(inverseBindingListener0 != null) {
            inverseBindingListener0.onChange();
        }
        InverseBindingListener inverseBindingListener1 = this.c;
        if(inverseBindingListener1 != null) {
            inverseBindingListener1.onChange();
        }
    }
}

