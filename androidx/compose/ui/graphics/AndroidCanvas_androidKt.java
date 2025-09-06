package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0015\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0019\u0010\f\u001A\u00060\u0005j\u0002`\t*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B*\n\u0010\r\"\u00020\u00052\u00020\u0005¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/graphics/Canvas;", "ActualCanvas", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;", "Landroid/graphics/Canvas;", "c", "Canvas", "(Landroid/graphics/Canvas;)Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n1#2:436\n*E\n"})
public final class AndroidCanvas_androidKt {
    public static final Canvas a;

    static {
        AndroidCanvas_androidKt.a = new Canvas();
    }

    @NotNull
    public static final androidx.compose.ui.graphics.Canvas ActualCanvas(@NotNull ImageBitmap imageBitmap0) {
        androidx.compose.ui.graphics.Canvas canvas0 = new AndroidCanvas();
        ((AndroidCanvas)canvas0).setInternalCanvas(new Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap0)));
        return canvas0;
    }

    @NotNull
    public static final androidx.compose.ui.graphics.Canvas Canvas(@NotNull Canvas canvas0) {
        androidx.compose.ui.graphics.Canvas canvas1 = new AndroidCanvas();
        ((AndroidCanvas)canvas1).setInternalCanvas(canvas0);
        return canvas1;
    }

    public static final Canvas access$getEmptyCanvas$p() {
        return AndroidCanvas_androidKt.a;
    }

    @NotNull
    public static final Canvas getNativeCanvas(@NotNull androidx.compose.ui.graphics.Canvas canvas0) {
        Intrinsics.checkNotNull(canvas0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((AndroidCanvas)canvas0).getInternalCanvas();
    }
}

