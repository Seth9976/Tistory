package com.kakao.keditor.plugin.itemspec.paragraph.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.keditor.R.drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0002J(\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u0016H\u0016J \u0010\u0017\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u0016H\u0016R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001A\u0004\u0018\u00010\nX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/overlay/HorizontalDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "spanCount", "", "(Landroid/content/Context;I)V", "mBounds", "Landroid/graphics/Rect;", "mDivider", "Landroid/graphics/drawable/Drawable;", "drawLine", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDrawOver", "c", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HorizontalDividerItemDecoration extends ItemDecoration {
    @NotNull
    private final Rect mBounds;
    @Nullable
    private Drawable mDivider;
    private final int spanCount;

    public HorizontalDividerItemDecoration(@NotNull Context context0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.spanCount = v;
        this.mDivider = context0.getDrawable(drawable.ke_shape_line_divider);
        this.mBounds = new Rect();
    }

    private final void drawLine(Canvas canvas0, RecyclerView recyclerView0) {
        int v = recyclerView0.getChildCount();
        int v1 = v % this.spanCount == 0 ? this.spanCount : v % this.spanCount;
        for(int v2 = 0; v2 < v - v1; ++v2) {
            View view0 = recyclerView0.getChildAt(v2);
            LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
            if(recyclerView$LayoutManager0 != null) {
                recyclerView$LayoutManager0.getDecoratedBoundsWithMargins(view0, this.mBounds);
            }
            int v3 = this.mBounds.bottom;
            int v4 = c.roundToInt(view0.getTranslationY()) + v3;
            int v5 = this.mDivider == null ? 0 : this.mDivider.getIntrinsicHeight();
            int v6 = this.mBounds.left;
            int v7 = this.mBounds.right;
            Drawable drawable0 = this.mDivider;
            if(drawable0 != null) {
                drawable0.setBounds(v6, v4 - v5, v7, v4);
            }
            Drawable drawable1 = this.mDivider;
            if(drawable1 != null) {
                drawable1.draw(canvas0);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void getItemOffsets(@NotNull Rect rect0, @NotNull View view0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        Intrinsics.checkNotNullParameter(rect0, "outRect");
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        rect0.set(0, 0, 0, (this.mDivider == null ? 0 : this.mDivider.getIntrinsicHeight()));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void onDrawOver(@NotNull Canvas canvas0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        Intrinsics.checkNotNullParameter(canvas0, "c");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        this.drawLine(canvas0, recyclerView0);
    }
}

