package jb;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.databinding.KphotopickerFragmentPhotoPickerBinding;
import kotlin.jvm.internal.Intrinsics;

public final class j implements View.OnClickListener {
    public final int a;
    public final PickerFragment b;

    public j(PickerFragment pickerFragment0, int v) {
        this.a = v;
        this.b = pickerFragment0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(this.b, "this$0");
                KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = this.b.z;
                Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
                Intrinsics.checkNotNullExpressionValue(kphotopickerFragmentPhotoPickerBinding0.layoutFolder, "layoutFolder");
                boolean z = kphotopickerFragmentPhotoPickerBinding0.layoutFolder.getVisibility() == 0;
                this.b.k(z);
                PickerViewModel pickerViewModel2 = this.b.A;
                if(pickerViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel2 = null;
                }
                PickerViewModel.clickEvent$default(pickerViewModel2, (z ? "close-folder" : "open-folder"), null, 2, null);
                return;
            }
            case 1: {
                PickerFragment pickerFragment1 = this.b;
                Intrinsics.checkNotNullParameter(pickerFragment1, "this$0");
                PickerViewModel pickerViewModel3 = pickerFragment1.A;
                if(pickerViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel3 = null;
                }
                PickerViewModel.clickEvent$default(pickerViewModel3, "close", null, 2, null);
                FragmentActivity fragmentActivity0 = pickerFragment1.getActivity();
                if(fragmentActivity0 != null) {
                    fragmentActivity0.finish();
                }
                return;
            }
            case 2: {
                PickerFragment pickerFragment2 = this.b;
                Intrinsics.checkNotNullParameter(pickerFragment2, "this$0");
                PickerViewModel pickerViewModel4 = pickerFragment2.A;
                if(pickerViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel4 = null;
                }
                PickerViewModel.requestAttachSelectedMediaList$default(pickerViewModel4, false, 1, null);
                PickerViewModel pickerViewModel5 = pickerFragment2.A;
                if(pickerViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel5 = null;
                }
                PickerViewModel.clickEvent$default(pickerViewModel5, "confirm", null, 2, null);
                return;
            }
            default: {
                PickerFragment pickerFragment0 = this.b;
                Intrinsics.checkNotNullParameter(pickerFragment0, "this$0");
                PickerViewModel pickerViewModel0 = pickerFragment0.A;
                if(pickerViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel0 = null;
                }
                PickerViewModel.requestPhotoEdit$default(pickerViewModel0, null, 1, null);
                PickerViewModel pickerViewModel1 = pickerFragment0.A;
                if(pickerViewModel1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel1 = null;
                }
                PickerViewModel.clickEvent$default(pickerViewModel1, "edit-image", null, 2, null);
            }
        }
    }
}

