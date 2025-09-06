package jb;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.PreviewFragment;
import com.kakao.kphotopicker.databinding.KphotopickerFragmentPhotoPreviewBinding;
import com.kakao.kphotopicker.h;
import com.kakao.kphotopicker.picker.MediaItem;
import j0.t1;
import j2.j;
import kotlin.jvm.internal.Intrinsics;

public final class z implements View.OnClickListener {
    public final int a;
    public final PreviewFragment b;

    public z(PreviewFragment previewFragment0, int v) {
        this.a = v;
        this.b = previewFragment0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v;
        int v1;
        switch(this.a) {
            case 0: {
                PreviewFragment previewFragment1 = this.b;
                Intrinsics.checkNotNullParameter(previewFragment1, "this$0");
                KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding1 = previewFragment1.A;
                if(kphotopickerFragmentPhotoPreviewBinding1 == null) {
                    v1 = 0;
                }
                else {
                    ViewPager viewPager1 = kphotopickerFragmentPhotoPreviewBinding1.previewViewpager;
                    v1 = viewPager1 == null ? 0 : viewPager1.getCurrentItem();
                }
                MediaItem mediaItem1 = previewFragment1.B.getMediaItem(v1);
                if(mediaItem1 != null) {
                    PickerViewModel pickerViewModel4 = previewFragment1.z;
                    PickerViewModel pickerViewModel5 = null;
                    if(pickerViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                        pickerViewModel4 = null;
                    }
                    if(!pickerViewModel4.isSelectedMedia(mediaItem1)) {
                        PickerViewModel pickerViewModel6 = previewFragment1.z;
                        if(pickerViewModel6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                            pickerViewModel6 = null;
                        }
                        if(!pickerViewModel6.allowMediaAdd()) {
                            PickerViewModel pickerViewModel7 = previewFragment1.z;
                            if(pickerViewModel7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                                pickerViewModel7 = null;
                            }
                            if(!pickerViewModel7.isSinglePick()) {
                                PickerViewModel pickerViewModel8 = previewFragment1.z;
                                if(pickerViewModel8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                                }
                                else {
                                    pickerViewModel5 = pickerViewModel8;
                                }
                                pickerViewModel5.requestCountOverMessage(new b0(previewFragment1, 0));
                                return;
                            }
                        }
                    }
                    PickerViewModel pickerViewModel9 = previewFragment1.z;
                    if(pickerViewModel9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                        pickerViewModel9 = null;
                    }
                    pickerViewModel9.requestPhotoEdit(mediaItem1);
                    PickerViewModel pickerViewModel10 = previewFragment1.z;
                    if(pickerViewModel10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    }
                    else {
                        pickerViewModel5 = pickerViewModel10;
                    }
                    pickerViewModel5.clickEvent("preview", "edit-image");
                }
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                this.b.getParentFragmentManager().popBackStack();
                PickerViewModel pickerViewModel11 = this.b.z;
                if(pickerViewModel11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel11 = null;
                }
                pickerViewModel11.clickEvent("preview", "back");
                return;
            }
            case 2: {
                PreviewFragment previewFragment2 = this.b;
                Intrinsics.checkNotNullParameter(previewFragment2, "this$0");
                PickerViewModel pickerViewModel12 = previewFragment2.z;
                PickerViewModel pickerViewModel13 = null;
                if(pickerViewModel12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel12 = null;
                }
                PickerViewModel.requestAttachSelectedMediaList$default(pickerViewModel12, false, 1, null);
                PickerViewModel pickerViewModel14 = previewFragment2.z;
                if(pickerViewModel14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                }
                else {
                    pickerViewModel13 = pickerViewModel14;
                }
                pickerViewModel13.clickEvent("preview", "confirm");
                return;
            }
            default: {
                PreviewFragment previewFragment0 = this.b;
                Intrinsics.checkNotNullParameter(previewFragment0, "this$0");
                KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding0 = previewFragment0.A;
                if(kphotopickerFragmentPhotoPreviewBinding0 == null) {
                    v = 0;
                }
                else {
                    ViewPager viewPager0 = kphotopickerFragmentPhotoPreviewBinding0.previewViewpager;
                    v = viewPager0 == null ? 0 : viewPager0.getCurrentItem();
                }
                MediaItem mediaItem0 = previewFragment0.B.getMediaItem(v);
                if(mediaItem0 != null) {
                    PickerViewModel pickerViewModel0 = previewFragment0.z;
                    PickerViewModel pickerViewModel1 = null;
                    if(pickerViewModel0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                        pickerViewModel0 = null;
                    }
                    if(!pickerViewModel0.isSelectedMedia(mediaItem0)) {
                        PickerViewModel pickerViewModel2 = previewFragment0.z;
                        if(pickerViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                        }
                        else {
                            pickerViewModel1 = pickerViewModel2;
                        }
                        pickerViewModel1.addMediaItem(mediaItem0, new h(previewFragment0, mediaItem0), new j(previewFragment0, 2), new t1(2, previewFragment0, mediaItem0));
                        return;
                    }
                    PickerViewModel pickerViewModel3 = previewFragment0.z;
                    if(pickerViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    }
                    else {
                        pickerViewModel1 = pickerViewModel3;
                    }
                    pickerViewModel1.deleteSelectedMedia(mediaItem0);
                    previewFragment0.i(mediaItem0);
                    previewFragment0.h(false, mediaItem0);
                }
            }
        }
    }
}

