package t3;

import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import androidx.databinding.InverseBindingListener;

public final class g implements RadioGroup.OnCheckedChangeListener {
    public final RadioGroup.OnCheckedChangeListener a;
    public final InverseBindingListener b;

    public g(RadioGroup.OnCheckedChangeListener radioGroup$OnCheckedChangeListener0, InverseBindingListener inverseBindingListener0) {
        this.a = radioGroup$OnCheckedChangeListener0;
        this.b = inverseBindingListener0;
    }

    @Override  // android.widget.RadioGroup$OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup0, int v) {
        RadioGroup.OnCheckedChangeListener radioGroup$OnCheckedChangeListener0 = this.a;
        if(radioGroup$OnCheckedChangeListener0 != null) {
            radioGroup$OnCheckedChangeListener0.onCheckedChanged(radioGroup0, v);
        }
        this.b.onChange();
    }
}

