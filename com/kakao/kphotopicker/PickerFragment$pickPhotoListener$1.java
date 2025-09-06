package com.kakao.kphotopicker;

import android.content.Context;
import android.os.Bundle;
import com.kakao.kphotopicker.picker.MediaItem;
import j.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/kakao/kphotopicker/PickerFragment$pickPhotoListener$1", "Lcom/kakao/kphotopicker/ItemClickListener;", "", "viewId", "position", "", "click", "(II)V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PickerFragment.pickPhotoListener.1 implements ItemClickListener {
    public final PickerFragment a;

    public PickerFragment.pickPhotoListener.1(PickerFragment pickerFragment0) {
        this.a = pickerFragment0;
    }

    @Override  // com.kakao.kphotopicker.ItemClickListener
    public void click(int v, int v1) {
        PickerViewModel pickerViewModel0 = null;
        PickerFragment pickerFragment0 = this.a;
        MediaItem mediaItem0 = PickerFragment.access$getPickerAdapter(pickerFragment0).getItem(v1);
        if(mediaItem0 == null) {
            return;
        }
        if(v == id.layer_index) {
            PickerViewModel pickerViewModel1 = PickerFragment.access$getPickerViewModel$p(pickerFragment0);
            if(pickerViewModel1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                pickerViewModel1 = null;
            }
            boolean z = pickerViewModel1.isSelectedMedia(mediaItem0);
            if(z) {
                PickerViewModel pickerViewModel2 = PickerFragment.access$getPickerViewModel$p(pickerFragment0);
                if(pickerViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                }
                else {
                    pickerViewModel0 = pickerViewModel2;
                }
                pickerViewModel0.deleteSelectedMedia(mediaItem0);
                PickerFragment.access$renderSelectState(pickerFragment0, false);
            }
            else {
                PickerFragment.access$addMedia(pickerFragment0, mediaItem0, new b(pickerFragment0, true, 1));
            }
            PickerFragment.access$clickEvent(pickerFragment0, !z, mediaItem0);
            return;
        }
        PreviewFragment previewFragment0 = new PreviewFragment();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("PREVIEW_PHOTO_INDEX", v1 - 1);
        previewFragment0.setArguments(bundle0);
        Context context0 = pickerFragment0.getContext();
        PhotoPickerActivity photoPickerActivity0 = context0 instanceof PhotoPickerActivity ? ((PhotoPickerActivity)context0) : null;
        if(photoPickerActivity0 != null) {
            photoPickerActivity0.replaceFragment(previewFragment0, true);
        }
        PickerViewModel pickerViewModel3 = PickerFragment.access$getPickerViewModel$p(pickerFragment0);
        if(pickerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel3 = null;
        }
        PickerViewModel.clickEvent$default(pickerViewModel3, "preview", null, 2, null);
    }
}

