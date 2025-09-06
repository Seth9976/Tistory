package com.kakao.kphotopicker;

import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final MediaItem w;
    public final PickerFragment x;

    public f(MediaItem mediaItem0, PickerFragment pickerFragment0) {
        this.w = mediaItem0;
        this.x = pickerFragment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object0).intValue();
        long v1 = ((Number)object1).longValue();
        MediaItem mediaItem0 = this.w;
        PickerFragment pickerFragment0 = this.x;
        if(mediaItem0 instanceof Photo) {
            String s = pickerFragment0.getString(v, new Object[]{v1});
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            PickerFragment.access$showToast(pickerFragment0, s);
            return Unit.INSTANCE;
        }
        if(mediaItem0 instanceof Video) {
            String s1 = pickerFragment0.getString(v, new Object[]{v1});
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            String s2 = pickerFragment0.getString(string.toast_video_size_reach_limited, new Object[]{s1});
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
            PickerFragment.access$showToast(pickerFragment0, s2);
        }
        return Unit.INSTANCE;
    }
}

