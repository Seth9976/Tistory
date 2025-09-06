package androidx.databinding.adapters;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;
import t3.b;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @BindingMethod(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:checked", type = CompoundButton.class)})
public class CompoundButtonBindingAdapter {
    @BindingAdapter({"android:checked"})
    public static void setChecked(CompoundButton compoundButton0, boolean z) {
        if(compoundButton0.isChecked() != z) {
            compoundButton0.setChecked(z);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void setListeners(CompoundButton compoundButton0, CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0, InverseBindingListener inverseBindingListener0) {
        if(inverseBindingListener0 == null) {
            compoundButton0.setOnCheckedChangeListener(compoundButton$OnCheckedChangeListener0);
            return;
        }
        compoundButton0.setOnCheckedChangeListener(new b(compoundButton$OnCheckedChangeListener0, inverseBindingListener0));
    }
}

