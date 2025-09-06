package jb;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.PickerViewModel;
import kotlin.jvm.internal.Intrinsics;

public final class m implements CompoundButton.OnCheckedChangeListener {
    public final int a;
    public final Object b;

    public m(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        if(this.a != 0) {
            Chip chip0 = (Chip)this.b;
            OnCheckedChangeListener materialCheckable$OnCheckedChangeListener0 = chip0.j;
            if(materialCheckable$OnCheckedChangeListener0 != null) {
                materialCheckable$OnCheckedChangeListener0.onCheckedChanged(chip0, z);
            }
            CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0 = chip0.i;
            if(compoundButton$OnCheckedChangeListener0 != null) {
                compoundButton$OnCheckedChangeListener0.onCheckedChanged(compoundButton0, z);
            }
            return;
        }
        PickerFragment pickerFragment0 = (PickerFragment)this.b;
        Intrinsics.checkNotNullParameter(pickerFragment0, "this$0");
        PickerViewModel pickerViewModel0 = pickerFragment0.A;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        pickerViewModel0.setHasGroupImage(z);
        PickerViewModel pickerViewModel1 = pickerFragment0.A;
        if(pickerViewModel1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel1 = null;
        }
        PickerViewModel.clickEvent$default(pickerViewModel1, (z ? "select-groupimage" : "unselect-groupimage"), null, 2, null);
    }
}

