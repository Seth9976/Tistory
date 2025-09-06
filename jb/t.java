package jb;

import androidx.lifecycle.FlowLiveDataConversions;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final int w;
    public final PickerViewModel x;

    public t(PickerViewModel pickerViewModel0, int v) {
        this.w = v;
        this.x = pickerViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                if(((MediaItem)object0) != null) {
                    PickerViewModel.addMediaItem$default(this.x, ((MediaItem)object0), null, null, null, 14, null);
                }
                PickerViewModel.access$reloadCurrentFolder(this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                return FlowLiveDataConversions.asLiveData$default(this.x.H0.getMediaListFlow(((Folder)object0)), PickerViewModel.access$cancelPreviousJobAndAssignNewJob(this.x, "medias"), 0L, 2, null);
            }
            default: {
                Intrinsics.checkNotNull(((List)object0));
                this.x.isShowSelectedView().postValue(Boolean.valueOf(!((List)object0).isEmpty()));
                return ((List)object0).size();
            }
        }
    }
}

