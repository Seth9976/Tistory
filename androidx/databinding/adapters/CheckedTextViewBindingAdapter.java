package androidx.databinding.adapters;

import android.widget.CheckedTextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:checkMark", method = "setCheckMarkDrawable", type = CheckedTextView.class), @BindingMethod(attribute = "android:checkMarkTint", method = "setCheckMarkTintList", type = CheckedTextView.class)})
public class CheckedTextViewBindingAdapter {
}

