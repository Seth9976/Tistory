package jb;

import android.content.Context;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.g;
import com.kakao.kphotopicker.widget.dragselection.DragSelectTouchListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final PickerFragment w;

    public p(PickerFragment pickerFragment0) {
        this.w = pickerFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PickerFragment pickerFragment0 = this.w;
        Context context0 = pickerFragment0.getContext();
        if(context0 != null) {
            g g0 = new g(context0, pickerFragment0);
            return DragSelectTouchListener.Companion.create(pickerFragment0, g0);
        }
        return null;
    }
}

