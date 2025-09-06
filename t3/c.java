package t3;

import android.widget.DatePicker.OnDateChangedListener;
import android.widget.DatePicker;
import androidx.databinding.InverseBindingListener;

public final class c implements DatePicker.OnDateChangedListener {
    public DatePicker.OnDateChangedListener a;
    public InverseBindingListener b;
    public InverseBindingListener c;
    public InverseBindingListener d;

    @Override  // android.widget.DatePicker$OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker0, int v, int v1, int v2) {
        DatePicker.OnDateChangedListener datePicker$OnDateChangedListener0 = this.a;
        if(datePicker$OnDateChangedListener0 != null) {
            datePicker$OnDateChangedListener0.onDateChanged(datePicker0, v, v1, v2);
        }
        InverseBindingListener inverseBindingListener0 = this.b;
        if(inverseBindingListener0 != null) {
            inverseBindingListener0.onChange();
        }
        InverseBindingListener inverseBindingListener1 = this.c;
        if(inverseBindingListener1 != null) {
            inverseBindingListener1.onChange();
        }
        InverseBindingListener inverseBindingListener2 = this.d;
        if(inverseBindingListener2 != null) {
            inverseBindingListener2.onChange();
        }
    }
}

