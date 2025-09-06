package com.kakao.kandinsky.gesture;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001A\u00020\u0003H\u0016J\"\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"Lcom/kakao/kandinsky/gesture/GestureInteraction;", "", "onDrag", "", "pan", "Landroidx/compose/ui/geometry/Offset;", "onDrag-k-4lQ0M", "(J)V", "onFinish", "onZoom", "centroid", "zoom", "", "onZoom-3MmeM6k", "(JF)V", "gesture_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface GestureInteraction {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void onDrag-k-4lQ0M(@NotNull GestureInteraction gestureInteraction0, long v) {
        }

        public static void onFinish(@NotNull GestureInteraction gestureInteraction0) {
        }

        public static void onZoom-3MmeM6k(@NotNull GestureInteraction gestureInteraction0, long v, float f) {
        }
    }

    void onDrag-k-4lQ0M(long arg1);

    void onFinish();

    void onZoom-3MmeM6k(long arg1, float arg2);
}

