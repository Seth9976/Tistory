package androidx.databinding.adapters;

import android.widget.TabWidget;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:divider", method = "setDividerDrawable", type = TabWidget.class), @BindingMethod(attribute = "android:tabStripEnabled", method = "setStripEnabled", type = TabWidget.class), @BindingMethod(attribute = "android:tabStripLeft", method = "setLeftStripDrawable", type = TabWidget.class), @BindingMethod(attribute = "android:tabStripRight", method = "setRightStripDrawable", type = TabWidget.class)})
public class TabWidgetBindingAdapter {
}

