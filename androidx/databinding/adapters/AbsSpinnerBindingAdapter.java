package androidx.databinding.adapters;

import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import java.util.List;
import t3.f;

@RestrictTo({Scope.LIBRARY})
public class AbsSpinnerBindingAdapter {
    @BindingAdapter({"android:entries"})
    public static void setEntries(AbsSpinner absSpinner0, List list0) {
        if(list0 != null) {
            SpinnerAdapter spinnerAdapter0 = absSpinner0.getAdapter();
            if(spinnerAdapter0 instanceof f) {
                ((f)spinnerAdapter0).b(list0);
                return;
            }
            absSpinner0.setAdapter(new f(absSpinner0.getContext(), list0));
            return;
        }
        absSpinner0.setAdapter(null);
    }

    @BindingAdapter({"android:entries"})
    public static void setEntries(AbsSpinner absSpinner0, CharSequence[] arr_charSequence) {
        if(arr_charSequence != null) {
            SpinnerAdapter spinnerAdapter0 = absSpinner0.getAdapter();
            if(spinnerAdapter0 != null && spinnerAdapter0.getCount() == arr_charSequence.length) {
                int v = 0;
                while(v < arr_charSequence.length) {
                    if(!arr_charSequence[v].equals(spinnerAdapter0.getItem(v))) {
                        goto label_9;
                    }
                    ++v;
                }
                return;
            }
        label_9:
            ArrayAdapter arrayAdapter0 = new ArrayAdapter(absSpinner0.getContext(), 0x1090008, arr_charSequence);
            arrayAdapter0.setDropDownViewResource(0x1090009);
            absSpinner0.setAdapter(arrayAdapter0);
            return;
        }
        absSpinner0.setAdapter(null);
    }
}

