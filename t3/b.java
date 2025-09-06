package t3;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import androidx.databinding.InverseBindingListener;

public final class b implements CompoundButton.OnCheckedChangeListener {
    public final CompoundButton.OnCheckedChangeListener a;
    public final InverseBindingListener b;

    public b(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0, InverseBindingListener inverseBindingListener0) {
        this.a = compoundButton$OnCheckedChangeListener0;
        this.b = inverseBindingListener0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0 = this.a;
        if(compoundButton$OnCheckedChangeListener0 != null) {
            compoundButton$OnCheckedChangeListener0.onCheckedChanged(compoundButton0, z);
        }
        this.b.onChange();
    }
}

