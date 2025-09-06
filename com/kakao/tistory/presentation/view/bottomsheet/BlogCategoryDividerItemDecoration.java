package com.kakao.tistory.presentation.view.bottomsheet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\'\u0010\r\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/graphics/drawable/Drawable;", "getDividerDrawable", "()Landroid/graphics/drawable/Drawable;", "dividerDrawable", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogCategoryDividerItemDecoration extends ItemDecoration {
    public static final int $stable = 8;
    public final Drawable a;

    public BlogCategoryDividerItemDecoration(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = ContextCompat.getDrawable(context0, drawable.divider_gray4_05dp);
    }

    @Nullable
    public final Drawable getDividerDrawable() {
        return this.a;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void onDrawOver(@NotNull Canvas canvas0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            int v = recyclerView0.getPaddingLeft();
            int v1 = recyclerView0.getWidth() - recyclerView0.getPaddingRight();
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            int v2 = recyclerView0.getChildCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = recyclerView0.getChildAt(v3);
                int v4 = recyclerView0.getChildAdapterPosition(view0);
                if(recyclerView$Adapter0 == null || recyclerView$Adapter0.getItemViewType(v4) != 0) {
                    if(recyclerView$Adapter0 != null && recyclerView$Adapter0.getItemViewType(v3) == 2 && v4 + 1 < recyclerView$Adapter0.getItemCount() - 1 && recyclerView$Adapter0.getItemViewType(v4 + 1) != 2) {
                        int v8 = view0.getBottom();
                        ViewGroup.LayoutParams viewGroup$LayoutParams1 = view0.getLayoutParams();
                        Intrinsics.checkNotNull(viewGroup$LayoutParams1, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                        int v9 = v8 + ((LayoutParams)viewGroup$LayoutParams1).bottomMargin;
                        int v10 = drawable0.getIntrinsicHeight();
                        drawable0.setBounds(v, v9 - v10, v1, drawable0.getIntrinsicHeight() + (v9 - v10));
                        drawable0.draw(canvas0);
                    }
                }
                else if(recyclerView$Adapter0.getItemCount() == 1 || v4 < recyclerView$Adapter0.getItemCount() - 1) {
                    int v5 = view0.getBottom();
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    int v6 = v5 + ((LayoutParams)viewGroup$LayoutParams0).bottomMargin;
                    int v7 = drawable0.getIntrinsicHeight();
                    drawable0.setBounds(v, v6 - v7, v1, drawable0.getIntrinsicHeight() + (v6 - v7));
                    drawable0.draw(canvas0);
                }
            }
        }
    }
}

