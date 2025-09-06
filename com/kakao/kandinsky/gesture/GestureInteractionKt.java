package com.kakao.kandinsky.gesture;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import ha.b;
import ha.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003¨\u0006\u0004"}, d2 = {"gesture", "Landroidx/compose/ui/Modifier;", "interaction", "Lcom/kakao/kandinsky/gesture/GestureInteraction;", "gesture_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class GestureInteractionKt {
    @NotNull
    public static final Modifier gesture(@NotNull Modifier modifier0, @NotNull GestureInteraction gestureInteraction0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(gestureInteraction0, "interaction");
        return SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier0, gestureInteraction0, new b(gestureInteraction0, null)), gestureInteraction0, new c(gestureInteraction0, null));
    }
}

