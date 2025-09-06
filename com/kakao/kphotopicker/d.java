package com.kakao.kphotopicker;

import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final PhotoPickerActivity w;

    public d(PhotoPickerActivity photoPickerActivity0) {
        this.w = photoPickerActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        String s = this.w.getResources().getString(((Number)object0).intValue(), new Object[]{((Number)object1).intValue()});
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.w.getResources().getString(string.toast_video_size_reach_limited, new Object[]{s});
        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        Toast.makeText(this.w, s1, 0).show();
        return Unit.INSTANCE;
    }
}

