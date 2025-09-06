package androidx.databinding.adapters;

import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;
import t3.g;

@RestrictTo({Scope.LIBRARY})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
public class RadioGroupBindingAdapter {
    @BindingAdapter({"android:checkedButton"})
    public static void setCheckedButton(RadioGroup radioGroup0, int v) {
        if(v != radioGroup0.getCheckedRadioButtonId()) {
            radioGroup0.check(v);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void setListeners(RadioGroup radioGroup0, RadioGroup.OnCheckedChangeListener radioGroup$OnCheckedChangeListener0, InverseBindingListener inverseBindingListener0) {
        if(inverseBindingListener0 == null) {
            radioGroup0.setOnCheckedChangeListener(radioGroup$OnCheckedChangeListener0);
            return;
        }
        radioGroup0.setOnCheckedChangeListener(new g(radioGroup$OnCheckedChangeListener0, inverseBindingListener0));
    }
}

