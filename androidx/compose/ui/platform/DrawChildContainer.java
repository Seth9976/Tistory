package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.R.id;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\bH\u0014¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\r2\u0006\u0010\u0017\u001A\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\bH\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\'\u0010#\u001A\u00020\r2\u0006\u0010\u0017\u001A\u00020\u001C2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010 \u001A\u00020\u001FH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getChildCount", "()I", "Landroidx/compose/ui/graphics/Canvas;", "Landroid/view/View;", "view", "", "drawingTime", "drawChild$ui_release", "(Landroidx/compose/ui/graphics/Canvas;Landroid/view/View;J)V", "drawChild", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class DrawChildContainer extends ViewGroup {
    public static final int $stable = 8;
    public boolean a;

    public DrawChildContainer(@NotNull Context context0) {
        super(context0);
        this.setClipChildren(false);
        this.setTag(id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(@NotNull Canvas canvas0) {
        int v = super.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if(((ViewLayer)view0).isInvalidated()) {
                try {
                    this.a = true;
                    super.dispatchDraw(canvas0);
                    this.a = false;
                    return;
                }
                catch(Throwable throwable0) {
                    this.a = false;
                    throw throwable0;
                }
            }
        }
    }

    public final void drawChild$ui_release(@NotNull androidx.compose.ui.graphics.Canvas canvas0, @NotNull View view0, long v) {
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas0), view0, v);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public int getChildCount() {
        return this.a ? super.getChildCount() : 0;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}

