package t3;

import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.NumberPicker;
import androidx.databinding.InverseBindingListener;

public final class d implements NumberPicker.OnValueChangeListener {
    public final NumberPicker.OnValueChangeListener a;
    public final InverseBindingListener b;

    public d(NumberPicker.OnValueChangeListener numberPicker$OnValueChangeListener0, InverseBindingListener inverseBindingListener0) {
        this.a = numberPicker$OnValueChangeListener0;
        this.b = inverseBindingListener0;
    }

    @Override  // android.widget.NumberPicker$OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker0, int v, int v1) {
        NumberPicker.OnValueChangeListener numberPicker$OnValueChangeListener0 = this.a;
        if(numberPicker$OnValueChangeListener0 != null) {
            numberPicker$OnValueChangeListener0.onValueChange(numberPicker0, v, v1);
        }
        this.b.onChange();
    }
}

