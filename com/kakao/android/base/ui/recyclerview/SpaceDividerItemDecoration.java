package com.kakao.android.base.ui.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0014\u001A\u00020\u00132\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001C\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Lcom/kakao/android/base/ui/recyclerview/SpaceDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "", "spaceDividerSize", "", "addToFirstItem", "firstItemSpaceDividerSize", "lastItemSpaceDividerSize", "isHorizontal", "<init>", "(IZIIZ)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "r", "I", "getAddSpaceToHeaderBottomDp", "()I", "setAddSpaceToHeaderBottomDp", "(I)V", "addSpaceToHeaderBottomDp", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SpaceDividerItemDecoration extends ItemDecoration {
    public final int m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public int r;

    public SpaceDividerItemDecoration(int v, boolean z, int v1, int v2, boolean z1) {
        this.m = v;
        this.n = z;
        this.o = v1;
        this.p = v2;
        this.q = z1;
    }

    public SpaceDividerItemDecoration(int v, boolean z, int v1, int v2, boolean z1, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, ((v3 & 2) == 0 ? z : false), ((v3 & 4) == 0 ? v1 : v), ((v3 & 8) == 0 ? v2 : v), ((v3 & 16) == 0 ? z1 : false));
    }

    public final int getAddSpaceToHeaderBottomDp() {
        return this.r;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void getItemOffsets(@NotNull Rect rect0, @NotNull View view0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        boolean z3;
        Intrinsics.checkNotNullParameter(rect0, "outRect");
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        super.getItemOffsets(rect0, view0, recyclerView0, recyclerView$State0);
        boolean z = this.q;
        boolean z1 = true;
        if(recyclerView0.getAdapter() == null || recyclerView0.getChildAdapterPosition(view0) != 0) {
            z3 = false;
        }
        else {
            int v = this.o;
            boolean z2 = this.n;
            if(!z) {
                if(z2) {
                    rect0.top = v;
                }
            }
            else if(z2) {
                rect0.left = v;
            }
            z3 = true;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 == null || recyclerView0.getChildAdapterPosition(view0) != (recyclerView$Adapter0.getItemCount() == 0 ? 0 : recyclerView$Adapter0.getItemCount() - 1)) {
            z1 = false;
        }
        int v1 = this.m;
        int v2 = this.p;
        if(z) {
            if(!z3) {
                rect0.left = 0;
            }
            rect0.top = 0;
            if(z1) {
                v1 = v2;
            }
            if(z3) {
                v1 += this.r;
            }
            rect0.right = v1;
            rect0.bottom = 0;
            return;
        }
        if(!z3) {
            rect0.top = 0;
        }
        rect0.left = 0;
        rect0.right = 0;
        if(z1) {
            v1 = v2;
        }
        if(z3) {
            v1 += this.r;
        }
        rect0.bottom = v1;
    }

    public final void setAddSpaceToHeaderBottomDp(int v) {
        this.r = v;
    }
}

