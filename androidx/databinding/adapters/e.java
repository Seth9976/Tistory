package androidx.databinding.adapters;

import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import androidx.databinding.InverseBindingListener;

public final class e implements SeekBar.OnSeekBarChangeListener {
    public final OnProgressChanged a;
    public final InverseBindingListener b;
    public final OnStartTrackingTouch c;
    public final OnStopTrackingTouch d;

    public e(OnProgressChanged seekBarBindingAdapter$OnProgressChanged0, InverseBindingListener inverseBindingListener0, OnStartTrackingTouch seekBarBindingAdapter$OnStartTrackingTouch0, OnStopTrackingTouch seekBarBindingAdapter$OnStopTrackingTouch0) {
        this.a = seekBarBindingAdapter$OnProgressChanged0;
        this.b = inverseBindingListener0;
        this.c = seekBarBindingAdapter$OnStartTrackingTouch0;
        this.d = seekBarBindingAdapter$OnStopTrackingTouch0;
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
        OnProgressChanged seekBarBindingAdapter$OnProgressChanged0 = this.a;
        if(seekBarBindingAdapter$OnProgressChanged0 != null) {
            seekBarBindingAdapter$OnProgressChanged0.onProgressChanged(seekBar0, v, z);
        }
        InverseBindingListener inverseBindingListener0 = this.b;
        if(inverseBindingListener0 != null) {
            inverseBindingListener0.onChange();
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar0) {
        OnStartTrackingTouch seekBarBindingAdapter$OnStartTrackingTouch0 = this.c;
        if(seekBarBindingAdapter$OnStartTrackingTouch0 != null) {
            seekBarBindingAdapter$OnStartTrackingTouch0.onStartTrackingTouch(seekBar0);
        }
    }

    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar0) {
        OnStopTrackingTouch seekBarBindingAdapter$OnStopTrackingTouch0 = this.d;
        if(seekBarBindingAdapter$OnStopTrackingTouch0 != null) {
            seekBarBindingAdapter$OnStopTrackingTouch0.onStopTrackingTouch(seekBar0);
        }
    }
}

