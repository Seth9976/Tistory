package androidx.databinding.adapters;

import android.widget.LinearLayout;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:divider", method = "setDividerDrawable", type = LinearLayout.class), @BindingMethod(attribute = "android:measureWithLargestChild", method = "setMeasureWithLargestChildEnabled", type = LinearLayout.class)})
public class LinearLayoutBindingAdapter {
}

