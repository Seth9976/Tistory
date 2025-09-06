package com.kakao.kphotopicker;

import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final MediaItem w;
    public final PreviewFragment x;

    public h(PreviewFragment previewFragment0, MediaItem mediaItem0) {
        this.w = mediaItem0;
        this.x = previewFragment0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object0).intValue();
        long v1 = ((Number)object1).longValue();
        MediaItem mediaItem0 = this.w;
        PreviewFragment previewFragment0 = this.x;
        if(mediaItem0 instanceof Photo) {
            String s = previewFragment0.getString(v, new Object[]{v1});
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            PreviewFragment.access$showToast(previewFragment0, s);
            return Unit.INSTANCE;
        }
        if(mediaItem0 instanceof Video) {
            String s1 = previewFragment0.getString(v, new Object[]{v1});
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            String s2 = previewFragment0.getString(string.toast_video_size_reach_limited, new Object[]{s1});
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
            PreviewFragment.access$showToast(previewFragment0, s2);
        }
        return Unit.INSTANCE;
    }
}

