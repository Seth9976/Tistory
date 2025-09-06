package androidx.databinding.adapters;

import android.widget.AbsSeekBar;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:thumbTint", method = "setThumbTintList", type = AbsSeekBar.class)})
public class AbsSeekBarBindingAdapter {
}

