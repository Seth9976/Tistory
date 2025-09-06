package com.kakao.kandinsky.designsystem.util;

import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A2\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003\u001A\u001E\u0010\u0007\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\u0003\u001A\u0012\u0010\n\u001A\u00020\u0001*\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0001\u001A\"\u0010\r\u001A\u00020\u000E*\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u0012\u001A\n\u0010\u0013\u001A\u00020\u0001*\u00020\u0014¨\u0006\u0015"}, d2 = {"add", "Landroidx/compose/ui/geometry/Rect;", "left", "", "top", "right", "bottom", "inflate", "horizontal", "vertical", "mapRect", "Landroid/graphics/Matrix;", "rect", "setRectToRect", "", "src", "dst", "stf", "Landroid/graphics/Matrix$ScaleToFit;", "toComposeRect", "Landroid/graphics/RectF;", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class RectExtensionKt {
    @NotNull
    public static final Rect add(@NotNull Rect rect0, @NotNull Number number0, @NotNull Number number1, @NotNull Number number2, @NotNull Number number3) {
        Intrinsics.checkNotNullParameter(rect0, "<this>");
        Intrinsics.checkNotNullParameter(number0, "left");
        Intrinsics.checkNotNullParameter(number1, "top");
        Intrinsics.checkNotNullParameter(number2, "right");
        Intrinsics.checkNotNullParameter(number3, "bottom");
        return new Rect(number0.floatValue() + rect0.getLeft(), number1.floatValue() + rect0.getTop(), number2.floatValue() + rect0.getRight(), number3.floatValue() + rect0.getBottom());
    }

    public static Rect add$default(Rect rect0, Number number0, Number number1, Number number2, Number number3, int v, Object object0) {
        if((v & 1) != 0) {
            number0 = 0;
        }
        if((v & 2) != 0) {
            number1 = 0;
        }
        if((v & 4) != 0) {
            number2 = 0;
        }
        if((v & 8) != 0) {
            number3 = 0;
        }
        return RectExtensionKt.add(rect0, number0, number1, number2, number3);
    }

    @NotNull
    public static final Rect inflate(@NotNull Rect rect0, @NotNull Number number0, @NotNull Number number1) {
        Intrinsics.checkNotNullParameter(rect0, "<this>");
        Intrinsics.checkNotNullParameter(number0, "horizontal");
        Intrinsics.checkNotNullParameter(number1, "vertical");
        return new Rect(rect0.getLeft() - number0.floatValue(), rect0.getTop() - number1.floatValue(), number0.floatValue() + rect0.getRight(), number1.floatValue() + rect0.getBottom());
    }

    public static Rect inflate$default(Rect rect0, Number number0, Number number1, int v, Object object0) {
        if((v & 1) != 0) {
            number0 = 0;
        }
        if((v & 2) != 0) {
            number1 = 0;
        }
        return RectExtensionKt.inflate(rect0, number0, number1);
    }

    @NotNull
    public static final Rect mapRect(@NotNull Matrix matrix0, @NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        Intrinsics.checkNotNullParameter(rect0, "rect");
        RectF rectF0 = RectHelper_androidKt.toAndroidRectF(rect0);
        matrix0.mapRect(rectF0);
        return RectExtensionKt.toComposeRect(rectF0);
    }

    public static final boolean setRectToRect(@NotNull Matrix matrix0, @NotNull Rect rect0, @NotNull Rect rect1, @NotNull Matrix.ScaleToFit matrix$ScaleToFit0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        Intrinsics.checkNotNullParameter(rect0, "src");
        Intrinsics.checkNotNullParameter(rect1, "dst");
        Intrinsics.checkNotNullParameter(matrix$ScaleToFit0, "stf");
        return matrix0.setRectToRect(RectHelper_androidKt.toAndroidRectF(rect0), RectHelper_androidKt.toAndroidRectF(rect1), matrix$ScaleToFit0);
    }

    @NotNull
    public static final Rect toComposeRect(@NotNull RectF rectF0) {
        Intrinsics.checkNotNullParameter(rectF0, "<this>");
        return new Rect(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
    }
}

