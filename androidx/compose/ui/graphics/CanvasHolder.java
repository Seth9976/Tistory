package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\b¢\u0006\u0004\b\u000B\u0010\fR \u0010\u0013\u001A\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u0012\u0004\b\u0012\u0010\u0003\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/CanvasHolder;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "targetCanvas", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "block", "drawInto", "(Landroid/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/AndroidCanvas;", "a", "Landroidx/compose/ui/graphics/AndroidCanvas;", "getAndroidCanvas", "()Landroidx/compose/ui/graphics/AndroidCanvas;", "getAndroidCanvas$annotations", "androidCanvas", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CanvasHolder {
    public final AndroidCanvas a;

    public CanvasHolder() {
        this.a = new AndroidCanvas();
    }

    public final void drawInto(@NotNull Canvas canvas0, @NotNull Function1 function10) {
        Canvas canvas1 = this.getAndroidCanvas().getInternalCanvas();
        this.getAndroidCanvas().setInternalCanvas(canvas0);
        function10.invoke(this.getAndroidCanvas());
        this.getAndroidCanvas().setInternalCanvas(canvas1);
    }

    @NotNull
    public final AndroidCanvas getAndroidCanvas() {
        return this.a;
    }

    @PublishedApi
    public static void getAndroidCanvas$annotations() {
    }
}

