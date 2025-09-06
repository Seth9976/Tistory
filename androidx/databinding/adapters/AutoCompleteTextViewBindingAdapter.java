package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@RestrictTo({Scope.LIBRARY})
@BindingMethods({@BindingMethod(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
public class AutoCompleteTextViewBindingAdapter {
    public interface FixText {
        CharSequence fixText(CharSequence arg1);
    }

    public interface IsValid {
        boolean isValid(CharSequence arg1);
    }

    @BindingAdapter(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void setOnItemSelectedListener(AutoCompleteTextView autoCompleteTextView0, OnItemSelected adapterViewBindingAdapter$OnItemSelected0, OnNothingSelected adapterViewBindingAdapter$OnNothingSelected0) {
        if(adapterViewBindingAdapter$OnItemSelected0 == null && adapterViewBindingAdapter$OnNothingSelected0 == null) {
            autoCompleteTextView0.setOnItemSelectedListener(null);
            return;
        }
        autoCompleteTextView0.setOnItemSelectedListener(new OnItemSelectedComponentListener(adapterViewBindingAdapter$OnItemSelected0, adapterViewBindingAdapter$OnNothingSelected0, null));
    }

    @BindingAdapter(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void setValidator(AutoCompleteTextView autoCompleteTextView0, FixText autoCompleteTextViewBindingAdapter$FixText0, IsValid autoCompleteTextViewBindingAdapter$IsValid0) {
        if(autoCompleteTextViewBindingAdapter$FixText0 == null && autoCompleteTextViewBindingAdapter$IsValid0 == null) {
            autoCompleteTextView0.setValidator(null);
            return;
        }
        autoCompleteTextView0.setValidator(new b(autoCompleteTextViewBindingAdapter$IsValid0, autoCompleteTextViewBindingAdapter$FixText0));
    }
}

