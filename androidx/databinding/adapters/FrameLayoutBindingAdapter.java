package androidx.databinding.adapters;

import android.widget.FrameLayout;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:foregroundTint", method = "setForegroundTintList", type = FrameLayout.class)})
public class FrameLayoutBindingAdapter {
}

