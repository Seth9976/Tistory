package androidx.compose.ui.graphics.layer.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.R.id;
import androidx.compose.ui.graphics.layer.ViewLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\bH\u0014¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0012\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\rH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\b\u0010\u0018\u001A\u0004\u0018\u00010\u00172\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010 \u001A\u00020\r2\u0006\u0010\u001F\u001A\u00020\u001EH\u0014¢\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\'\u0010+\u001A\u00020\r2\u0006\u0010\u001F\u001A\u00020$2\u0006\u0010&\u001A\u00020%2\u0006\u0010(\u001A\u00020\'H\u0000¢\u0006\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "forceLayout", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getChildCount", "()I", "Landroidx/compose/ui/graphics/Canvas;", "Landroid/view/View;", "view", "", "drawingTime", "drawChild$ui_graphics_release", "(Landroidx/compose/ui/graphics/Canvas;Landroid/view/View;J)V", "drawChild", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class DrawChildContainer extends ViewGroup {
    public boolean a;

    public DrawChildContainer(@NotNull Context context0) {
        super(context0);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.setTag(id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(@NotNull Canvas canvas0) {
        int v = super.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type androidx.compose.ui.graphics.layer.ViewLayer");
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

    public final void drawChild$ui_graphics_release(@NotNull androidx.compose.ui.graphics.Canvas canvas0, @NotNull View view0, long v) {
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas0), view0, v);
    }

    @Override  // android.view.View
    public void forceLayout() {
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public int getChildCount() {
        return this.a ? super.getChildCount() : 0;
    }

    @Override  // android.view.ViewGroup
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] arr_v, @Nullable Rect rect0) {
        return null;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }
}

