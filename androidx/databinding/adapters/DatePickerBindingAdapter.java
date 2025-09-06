package androidx.databinding.adapters;

import android.widget.DatePicker.OnDateChangedListener;
import android.widget.DatePicker;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;
import androidx.databinding.library.baseAdapters.R.id;
import t3.c;

@RestrictTo({Scope.LIBRARY})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:year", type = DatePicker.class), @InverseBindingMethod(attribute = "android:month", type = DatePicker.class), @InverseBindingMethod(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
public class DatePickerBindingAdapter {
    @BindingAdapter(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void setListeners(DatePicker datePicker0, int v, int v1, int v2, DatePicker.OnDateChangedListener datePicker$OnDateChangedListener0, InverseBindingListener inverseBindingListener0, InverseBindingListener inverseBindingListener1, InverseBindingListener inverseBindingListener2) {
        if(v == 0) {
            v = datePicker0.getYear();
        }
        if(v2 == 0) {
            v2 = datePicker0.getDayOfMonth();
        }
        if(inverseBindingListener0 == null && inverseBindingListener1 == null && inverseBindingListener2 == null) {
            datePicker0.init(v, v1, v2, datePicker$OnDateChangedListener0);
            return;
        }
        c c0 = (c)ListenerUtil.getListener(datePicker0, id.onDateChanged);
        if(c0 == null) {
            c0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
            ListenerUtil.trackListener(datePicker0, c0, id.onDateChanged);
        }
        c0.a = datePicker$OnDateChangedListener0;
        c0.b = inverseBindingListener0;
        c0.c = inverseBindingListener1;
        c0.d = inverseBindingListener2;
        datePicker0.init(v, v1, v2, c0);
    }
}

