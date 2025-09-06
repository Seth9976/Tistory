package androidx.databinding.adapters;

import android.widget.TimePicker.OnTimeChangedListener;
import android.widget.TimePicker;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;
import t3.j;

@RestrictTo({Scope.LIBRARY})
public class TimePickerBindingAdapter {
    @InverseBindingAdapter(attribute = "android:hour")
    public static int getHour(TimePicker timePicker0) {
        return timePicker0.getHour();
    }

    @InverseBindingAdapter(attribute = "android:minute")
    public static int getMinute(TimePicker timePicker0) {
        return timePicker0.getMinute();
    }

    @BindingAdapter({"android:hour"})
    public static void setHour(TimePicker timePicker0, int v) {
        if(timePicker0.getHour() != v) {
            timePicker0.setHour(v);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void setListeners(TimePicker timePicker0, TimePicker.OnTimeChangedListener timePicker$OnTimeChangedListener0, InverseBindingListener inverseBindingListener0, InverseBindingListener inverseBindingListener1) {
        if(inverseBindingListener0 == null && inverseBindingListener1 == null) {
            timePicker0.setOnTimeChangedListener(timePicker$OnTimeChangedListener0);
            return;
        }
        timePicker0.setOnTimeChangedListener(new j(timePicker$OnTimeChangedListener0, inverseBindingListener0, inverseBindingListener1));
    }

    @BindingAdapter({"android:minute"})
    public static void setMinute(TimePicker timePicker0, int v) {
        if(timePicker0.getMinute() != v) {
            timePicker0.setMinute(v);
        }
    }
}

