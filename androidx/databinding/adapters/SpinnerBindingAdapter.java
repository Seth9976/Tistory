package androidx.databinding.adapters;

import android.widget.Spinner;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:popupBackground", method = "setPopupBackgroundDrawable", type = Spinner.class)})
public class SpinnerBindingAdapter {
}

