package com.kakao.kphotopicker;

import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001A\u00020\b2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"com/kakao/kphotopicker/PickerFragment$initViews$1$1", "Landroid/view/View$OnKeyListener;", "Landroid/view/View;", "v", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PickerFragment.initViews.1.1 implements View.OnKeyListener {
    public final PickerFragment a;

    public PickerFragment.initViews.1.1(PickerFragment pickerFragment0) {
        this.a = pickerFragment0;
    }

    @Override  // android.view.View$OnKeyListener
    public boolean onKey(@Nullable View view0, int v, @Nullable KeyEvent keyEvent0) {
        if(v == 4) {
            PickerFragment pickerFragment0 = this.a;
            if(PickerFragment.access$getBinding(pickerFragment0).layoutFolder.getVisibility() == 0) {
                PickerFragment.access$toggleLayer(pickerFragment0, true);
                return true;
            }
        }
        return false;
    }
}

