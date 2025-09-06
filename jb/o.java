package jb;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.picker.folder.FolderAdapter;
import com.kakao.kphotopicker.picker.item.PickerAdapter;
import com.kakao.kphotopicker.picker.permission.MediaPermissionActionAdapter;
import com.kakao.kphotopicker.picker.selected.SelectedItemAdapter;
import com.kakao.kphotopicker.widget.dragselection.DragSelectTouchListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final int w;
    public final PickerFragment x;

    public o(PickerFragment pickerFragment0, int v) {
        this.w = v;
        this.x = pickerFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                PickerFragment pickerFragment0 = this.x;
                DragSelectTouchListener dragSelectTouchListener0 = PickerFragment.access$getDragSelectTouchListener(pickerFragment0);
                if(dragSelectTouchListener0 != null && !dragSelectTouchListener0.isNowDragging() == 1) {
                    PickerViewModel pickerViewModel0 = pickerFragment0.A;
                    if(pickerViewModel0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                        pickerViewModel0 = null;
                    }
                    pickerViewModel0.requestCountOverMessage(new n(pickerFragment0, 0));
                }
                return Unit.INSTANCE;
            }
            case 1: {
                PickerFragment pickerFragment1 = this.x;
                PickerViewModel pickerViewModel1 = pickerFragment1.A;
                PickerViewModel pickerViewModel2 = null;
                if(pickerViewModel1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel1 = null;
                }
                if(Intrinsics.areEqual(pickerViewModel1.isShowSelectedView().getValue(), Boolean.TRUE)) {
                    PickerViewModel pickerViewModel3 = pickerFragment1.A;
                    if(pickerViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    }
                    else {
                        pickerViewModel2 = pickerViewModel3;
                    }
                    pickerFragment1.j(true, pickerViewModel2.isSinglePick());
                }
                return Unit.INSTANCE;
            }
            case 2: {
                PickerViewModel pickerViewModel4 = this.x.A;
                if(pickerViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel4 = null;
                }
                return new FolderAdapter(pickerViewModel4);
            }
            case 3: {
                FragmentActivity fragmentActivity0 = this.x.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivity0, "requireActivity(...)");
                return fragmentActivity0;
            }
            case 4: {
                PickerFragment pickerFragment2 = this.x;
                PickerViewModel pickerViewModel5 = pickerFragment2.A;
                if(pickerViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel5 = null;
                }
                return new MediaPermissionActionAdapter(pickerViewModel5.getGalleryType(), new o(pickerFragment2, 3));
            }
            case 5: {
                PickerViewModel pickerViewModel6 = this.x.A;
                if(pickerViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel6 = null;
                }
                return new PickerAdapter(pickerViewModel6);
            }
            default: {
                Context context0 = this.x.requireContext();
                Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
                return new SelectedItemAdapter(context0);
            }
        }
    }
}

