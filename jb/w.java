package jb;

import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final PickerViewModel w;
    public final Function2 x;
    public final Function2 y;

    public w(PickerViewModel pickerViewModel0, Function2 function20, Function2 function21) {
        this.w = pickerViewModel0;
        this.x = function20;
        this.y = function21;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Video mediaItem$Video0 = ((MediaItem)object0) instanceof Video ? ((Video)(((MediaItem)object0))) : null;
        PickerViewModel pickerViewModel0 = this.w;
        if(mediaItem$Video0 != null) {
            PickerViewModel.access$addSelectedVideoWhenValidate(pickerViewModel0, mediaItem$Video0, this.x, this.y);
        }
        PickerViewModel.access$reloadCurrentFolder(pickerViewModel0);
        return Unit.INSTANCE;
    }
}

