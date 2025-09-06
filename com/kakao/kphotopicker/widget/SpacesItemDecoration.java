package com.kakao.kphotopicker.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J/\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0004¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/kphotopicker/widget/SpacesItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Lcom/kakao/kphotopicker/widget/SpanLookup;", "getSpanLookup", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)Lcom/kakao/kphotopicker/widget/SpanLookup;", "Companion", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SpacesItemDecoration extends ItemDecoration {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kphotopicker/widget/SpacesItemDecoration$Companion;", "", "", "horizontalSpacing", "verticalSpacing", "spanCount", "Lcom/kakao/kphotopicker/widget/SpacesItemDecoration;", "newInstance", "(III)Lcom/kakao/kphotopicker/widget/SpacesItemDecoration;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static boolean a(SpanLookup spanLookup0, int v) {
            int v1 = spanLookup0.getSpanIndex(v);
            return spanLookup0.getSpanSize(v) + v1 == spanLookup0.getSpanCount();
        }

        public static final int access$getItemBottomSpacing(Companion spacesItemDecoration$Companion0, SpanLookup spanLookup0, int v, int v1, int v2) {
            spacesItemDecoration$Companion0.getClass();
            int v3 = v2 - 1;
            int v4 = 0;
            while(true) {
                if(-1 >= v3) {
                    v3 = v4;
                    break;
                }
                if(spanLookup0.getSpanIndex(v3) == 0) {
                    break;
                }
                v4 = v3;
                --v3;
            }
            return v1 >= v3 ? 0 : ((int)(((float)v) * 0.5f));
        }

        public static final int access$getItemTopSpacing(Companion spacesItemDecoration$Companion0, SpanLookup spanLookup0, int v, int v1, int v2, int v3) {
            spacesItemDecoration$Companion0.getClass();
            int v4 = 0;
            int v5 = 0;
            while(true) {
                if(v4 >= v3) {
                    v4 = v5;
                    break;
                }
                int v6 = spanLookup0.getSpanIndex(v4);
                if(spanLookup0.getSpanSize(v4) + v6 - 1 == v2 - 1) {
                    break;
                }
                v5 = v4;
                ++v4;
            }
            return v1 <= v4 ? 0 : ((int)(((float)v) * 0.5f));
        }

        public static final boolean access$itemEndsAtTheRightEdge(Companion spacesItemDecoration$Companion0, SpanLookup spanLookup0, int v) {
            spacesItemDecoration$Companion0.getClass();
            return Companion.a(spanLookup0, v);
        }

        public static final boolean access$itemIsFullSpan(Companion spacesItemDecoration$Companion0, SpanLookup spanLookup0, int v) {
            spacesItemDecoration$Companion0.getClass();
            return spanLookup0.getSpanIndex(v) == 0 && Companion.a(spanLookup0, v);
        }

        public static final boolean access$itemIsNextToAnItemThatEndsOnTheRightEdge(Companion spacesItemDecoration$Companion0, SpanLookup spanLookup0, int v) {
            spacesItemDecoration$Companion0.getClass();
            return !Companion.a(spanLookup0, v) && Companion.a(spanLookup0, v + 1);
        }

        public static final boolean access$itemIsNextToAnItemThatStartsOnTheLeftEdge(Companion spacesItemDecoration$Companion0, SpanLookup spanLookup0, int v) {
            spacesItemDecoration$Companion0.getClass();
            return spanLookup0.getSpanIndex(v) != 0 && spanLookup0.getSpanIndex(v - 1) == 0;
        }

        public static final boolean access$itemStartsAtTheLeftEdge(Companion spacesItemDecoration$Companion0, SpanLookup spanLookup0, int v) {
            spacesItemDecoration$Companion0.getClass();
            return spanLookup0.getSpanIndex(v) == 0;
        }

        @NotNull
        public final SpacesItemDecoration newInstance(int v, int v1, int v2) {
            int v3 = (v2 - 1) * v / v2;
            return new SpacesItemDecoration(((int)(((float)v) * 0.5f)), v3, v - v3, v1, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int m;
    public final int n;
    public final int o;
    public final int p;

    static {
        SpacesItemDecoration.Companion = new Companion(null);
    }

    public SpacesItemDecoration(int v, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.m = v;
        this.n = v1;
        this.o = v2;
        this.p = v3;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void getItemOffsets(@NotNull Rect rect0, @NotNull View view0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        Intrinsics.checkNotNullParameter(rect0, "outRect");
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int v = ((LayoutParams)viewGroup$LayoutParams0).getViewPosition();
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        Intrinsics.checkNotNull(recyclerView$Adapter0);
        int v1 = recyclerView$Adapter0.getItemCount();
        SpanLookup spanLookup0 = this.getSpanLookup(view0, recyclerView0);
        Companion spacesItemDecoration$Companion0 = SpacesItemDecoration.Companion;
        if(Companion.access$itemIsFullSpan(spacesItemDecoration$Companion0, spanLookup0, v)) {
            rect0.left = 0;
            rect0.right = 0;
        }
        else {
            boolean z = Companion.access$itemStartsAtTheLeftEdge(spacesItemDecoration$Companion0, spanLookup0, v);
            int v2 = this.n;
            if(z) {
                rect0.left = 0;
                rect0.right = v2;
            }
            else if(Companion.access$itemEndsAtTheRightEdge(spacesItemDecoration$Companion0, spanLookup0, v)) {
                rect0.left = v2;
                rect0.right = 0;
            }
            else {
                boolean z1 = Companion.access$itemIsNextToAnItemThatStartsOnTheLeftEdge(spacesItemDecoration$Companion0, spanLookup0, v);
                int v3 = this.m;
                int v4 = this.o;
                rect0.left = z1 ? v4 : v3;
                rect0.right = Companion.access$itemIsNextToAnItemThatEndsOnTheRightEdge(spacesItemDecoration$Companion0, spanLookup0, v) ? v4 : v3;
            }
        }
        int v5 = spanLookup0.getSpanCount();
        rect0.top = Companion.access$getItemTopSpacing(spacesItemDecoration$Companion0, spanLookup0, this.p, v, v5, v1);
        rect0.bottom = Companion.access$getItemBottomSpacing(spacesItemDecoration$Companion0, spanLookup0, this.p, v, v1);
    }

    @NotNull
    public final SpanLookup getSpanLookup(@NotNull View view0, @NotNull RecyclerView recyclerView0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
        return recyclerView$LayoutManager0 instanceof GridLayoutManager ? SpanLookupFactory.INSTANCE.gridLayoutSpanLookup(((GridLayoutManager)recyclerView$LayoutManager0)) : SpanLookupFactory.INSTANCE.singleSpan();
    }
}

