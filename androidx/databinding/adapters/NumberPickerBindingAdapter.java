package androidx.databinding.adapters;

import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.NumberPicker;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;
import t3.d;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @BindingMethod(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:value", type = NumberPicker.class)})
public class NumberPickerBindingAdapter {
    @BindingAdapter(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void setListeners(NumberPicker numberPicker0, NumberPicker.OnValueChangeListener numberPicker$OnValueChangeListener0, InverseBindingListener inverseBindingListener0) {
        if(inverseBindingListener0 == null) {
            numberPicker0.setOnValueChangedListener(numberPicker$OnValueChangeListener0);
            return;
        }
        numberPicker0.setOnValueChangedListener(new d(numberPicker$OnValueChangeListener0, inverseBindingListener0));
    }

    @BindingAdapter({"android:value"})
    public static void setValue(NumberPicker numberPicker0, int v) {
        if(numberPicker0.getValue() != v) {
            numberPicker0.setValue(v);
        }
    }
}

