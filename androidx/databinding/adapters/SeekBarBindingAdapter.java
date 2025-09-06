package androidx.databinding.adapters;

import android.widget.SeekBar;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

@RestrictTo({Scope.LIBRARY})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:progress", type = SeekBar.class)})
public class SeekBarBindingAdapter {
    public interface OnProgressChanged {
        void onProgressChanged(SeekBar arg1, int arg2, boolean arg3);
    }

    public interface OnStartTrackingTouch {
        void onStartTrackingTouch(SeekBar arg1);
    }

    public interface OnStopTrackingTouch {
        void onStopTrackingTouch(SeekBar arg1);
    }

    @BindingAdapter(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void setOnSeekBarChangeListener(SeekBar seekBar0, OnStartTrackingTouch seekBarBindingAdapter$OnStartTrackingTouch0, OnStopTrackingTouch seekBarBindingAdapter$OnStopTrackingTouch0, OnProgressChanged seekBarBindingAdapter$OnProgressChanged0, InverseBindingListener inverseBindingListener0) {
        if(seekBarBindingAdapter$OnStartTrackingTouch0 == null && seekBarBindingAdapter$OnStopTrackingTouch0 == null && seekBarBindingAdapter$OnProgressChanged0 == null && inverseBindingListener0 == null) {
            seekBar0.setOnSeekBarChangeListener(null);
            return;
        }
        seekBar0.setOnSeekBarChangeListener(new e(seekBarBindingAdapter$OnProgressChanged0, inverseBindingListener0, seekBarBindingAdapter$OnStartTrackingTouch0, seekBarBindingAdapter$OnStopTrackingTouch0));
    }

    @BindingAdapter({"android:progress"})
    public static void setProgress(SeekBar seekBar0, int v) {
        if(v != seekBar0.getProgress()) {
            seekBar0.setProgress(v);
        }
    }
}

