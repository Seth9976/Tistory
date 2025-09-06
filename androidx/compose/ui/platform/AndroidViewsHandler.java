package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\b\n\u0010\u000BJ7\u0010\u0012\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001F\u0010\u0017\u001A\u00020\t2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001E\u001A\u0004\u0018\u00010\u001D2\b\u0010\u001A\u001A\u0004\u0018\u00010\u00192\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001D\u0010$\u001A\u00020\t2\u0006\u0010!\u001A\u00020 2\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b$\u0010%J\u0019\u0010(\u001A\u00020\f2\b\u0010\'\u001A\u0004\u0018\u00010&H\u0016\u00A2\u0006\u0004\b(\u0010)J\u000F\u0010*\u001A\u00020\tH\u0017\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010,\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b,\u0010-J\u0017\u0010.\u001A\u00020\t2\u0006\u0010#\u001A\u00020\"H\u0014\u00A2\u0006\u0004\b.\u0010/R3\u00107\u001A\u001E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020100j\u000E\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000201`28\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R3\u00109\u001A\u001E\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020 00j\u000E\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020 `28\u0006\u00A2\u0006\f\n\u0004\b\u0011\u00104\u001A\u0004\b8\u00106\u00A8\u0006:"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "", "location", "Landroid/graphics/Rect;", "dirty", "", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Ljava/lang/Void;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "Landroid/graphics/Canvas;", "canvas", "drawView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "requestLayout", "()V", "shouldDelayChildPressedState", "()Z", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Ljava/util/HashMap;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", "getLayoutNodeToHolder", "layoutNodeToHolder", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidViewsHandler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n96#2,7:111\n96#2,7:118\n1855#3,2:125\n1855#3,2:127\n*S KotlinDebug\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n*L\n48#1:111,7\n51#1:118,7\n61#1:125,2\n68#1:127,2\n*E\n"})
public final class AndroidViewsHandler extends ViewGroup {
    public static final int $stable = 8;
    public final HashMap a;
    public final HashMap b;

    public AndroidViewsHandler(@NotNull Context context0) {
        super(context0);
        this.setClipChildren(false);
        this.a = new HashMap();
        this.b = new HashMap();
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(@NotNull Canvas canvas0) {
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent0) {
        return true;
    }

    public final void drawView(@NotNull AndroidViewHolder androidViewHolder0, @NotNull Canvas canvas0) {
        androidViewHolder0.draw(canvas0);
    }

    @NotNull
    public final HashMap getHolderToLayoutNode() {
        return this.a;
    }

    @NotNull
    public final HashMap getLayoutNodeToHolder() {
        return this.b;
    }

    @Override  // android.view.ViewGroup
    public ViewParent invalidateChildInParent(int[] arr_v, Rect rect0) {
        return null;
    }

    @Nullable
    public Void invalidateChildInParent(@Nullable int[] arr_v, @Nullable Rect rect0) [...] // Inlined contents

    @Override  // android.view.ViewGroup
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(@NotNull View view0, @NotNull View view1) {
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        for(Object object0: this.a.keySet()) {
            ((AndroidViewHolder)object0).layout(((AndroidViewHolder)object0).getLeft(), ((AndroidViewHolder)object0).getTop(), ((AndroidViewHolder)object0).getRight(), ((AndroidViewHolder)object0).getBottom());
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        if(View.MeasureSpec.getMode(v) != 0x40000000) {
            InlineClassHelperKt.throwIllegalArgumentException("widthMeasureSpec should be EXACTLY");
        }
        if(View.MeasureSpec.getMode(v1) != 0x40000000) {
            InlineClassHelperKt.throwIllegalArgumentException("heightMeasureSpec should be EXACTLY");
        }
        this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
        for(Object object0: this.a.keySet()) {
            ((AndroidViewHolder)object0).remeasure();
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        this.cleanupLayoutState(this);
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            LayoutNode layoutNode0 = (LayoutNode)this.a.get(view0);
            if(view0.isLayoutRequested() && layoutNode0 != null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode0, false, false, false, 7, null);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

