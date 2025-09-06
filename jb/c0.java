package jb;

import android.content.Intent;
import android.net.Uri;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.PreviewFragment;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function1 {
    public final PreviewFragment w;

    public c0(PreviewFragment previewFragment0) {
        this.w = previewFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Video)object0), "it");
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setDataAndType(Uri.parse(((Video)object0).getUri()), "video/*");
        intent0.setFlags(0x20000001);
        this.w.startActivity(intent0);
        PickerViewModel pickerViewModel0 = this.w.z;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        pickerViewModel0.clickEvent("preview", "play-video");
        return Unit.INSTANCE;
    }
}

