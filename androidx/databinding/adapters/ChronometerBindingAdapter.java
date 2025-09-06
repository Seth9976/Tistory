package androidx.databinding.adapters;

import android.widget.Chronometer;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:onChronometerTick", method = "setOnChronometerTickListener", type = Chronometer.class)})
public class ChronometerBindingAdapter {
}

