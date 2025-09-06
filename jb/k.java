package jb;

import androidx.lifecycle.Observer;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.picker.selected.SelectedItemAdapter;
import com.kakao.kphotopicker.widget.dragselection.DragSelectTouchListener;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class k implements Observer {
    public final int a;
    public final PickerFragment b;
    public final PickerViewModel c;

    public k(PickerFragment pickerFragment0, PickerViewModel pickerViewModel0, int v) {
        this.a = v;
        this.b = pickerFragment0;
        this.c = pickerViewModel0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "this$0");
            Intrinsics.checkNotNullParameter(this.c, "$this_with");
            SelectedItemAdapter selectedItemAdapter0 = (SelectedItemAdapter)this.b.D.getValue();
            Intrinsics.checkNotNull(((List)object0));
            selectedItemAdapter0.setData(((List)object0));
            boolean z = this.b.checkIsEnableGroupImage();
            this.c.setHasGroupImage(z);
            return;
        }
        PickerFragment pickerFragment0 = this.b;
        Intrinsics.checkNotNullParameter(pickerFragment0, "this$0");
        PickerViewModel pickerViewModel0 = this.c;
        Intrinsics.checkNotNullParameter(pickerViewModel0, "$this_with");
        DragSelectTouchListener dragSelectTouchListener0 = (DragSelectTouchListener)pickerFragment0.G.getValue();
        if(dragSelectTouchListener0 != null && !dragSelectTouchListener0.isNowDragging() == 1) {
            Intrinsics.checkNotNull(((Boolean)object0));
            pickerFragment0.j(((Boolean)object0).booleanValue(), pickerViewModel0.isSinglePick());
        }
    }
}

