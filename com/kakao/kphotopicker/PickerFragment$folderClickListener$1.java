package com.kakao.kphotopicker;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/kakao/kphotopicker/PickerFragment$folderClickListener$1", "Lcom/kakao/kphotopicker/ItemClickListener;", "", "viewId", "position", "", "click", "(II)V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PickerFragment.folderClickListener.1 implements ItemClickListener {
    public final PickerFragment a;

    public PickerFragment.folderClickListener.1(PickerFragment pickerFragment0) {
        this.a = pickerFragment0;
    }

    @Override  // com.kakao.kphotopicker.ItemClickListener
    public void click(int v, int v1) {
        PickerFragment pickerFragment0 = this.a;
        PickerViewModel pickerViewModel0 = PickerFragment.access$getPickerViewModel$p(pickerFragment0);
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        pickerViewModel0.changeFolder(PickerFragment.access$getFolderAdapter(pickerFragment0).getFolder(v1));
    }
}

