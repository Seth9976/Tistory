package com.kakao.tistory.presentation.view.common.recyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
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
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006\u00A2\u0006\u0004\b\t\u0010\nJ/\u0010\u0014\u001A\u00020\u00132\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u0018\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019R$\u0010!\u001A\u0004\u0018\u00010\u001A8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\"\u0010)\u001A\u00020\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010-\u001A\u00020\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010$\u001A\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001A\u00020\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010$\u001A\u0004\b/\u0010&\"\u0004\b0\u0010(R\"\u00108\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b9\u00103\u001A\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010?\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\"\u0004\bA\u0010BR=\u0010M\u001A\u001D\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(F\u0012\u0004\u0012\u00020\u00060C8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010H\u001A\u0004\bI\u0010J\"\u0004\bK\u0010L\u00A8\u0006N"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/recyclerview/SimpleDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", "context", "", "orientation", "", "addDividerToFirstItem", "isDash", "<init>", "(Landroid/content/Context;IZZ)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Landroid/graphics/drawable/Drawable;", "d", "Landroid/graphics/drawable/Drawable;", "getDividerDrawable", "()Landroid/graphics/drawable/Drawable;", "setDividerDrawable", "(Landroid/graphics/drawable/Drawable;)V", "dividerDrawable", "", "e", "F", "getDashGap", "()F", "setDashGap", "(F)V", "dashGap", "f", "getDashWidth", "setDashWidth", "dashWidth", "g", "getDashSize", "setDashSize", "dashSize", "h", "I", "getDashColor", "()I", "setDashColor", "(I)V", "dashColor", "i", "getAddSpaceToHeaderBottomDp", "setAddSpaceToHeaderBottomDp", "addSpaceToHeaderBottomDp", "j", "Z", "isEmptyListMode", "()Z", "setEmptyListMode", "(Z)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "k", "Lkotlin/jvm/functions/Function1;", "getCheckNeedDivider", "()Lkotlin/jvm/functions/Function1;", "setCheckNeedDivider", "(Lkotlin/jvm/functions/Function1;)V", "checkNeedDivider", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSimpleDividerItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleDividerItemDecoration.kt\ncom/kakao/tistory/presentation/view/common/recyclerview/SimpleDividerItemDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public class SimpleDividerItemDecoration extends ItemDecoration {
    public static final int $stable = 8;
    public final int a;
    public final boolean b;
    public final boolean c;
    public Drawable d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    public boolean j;
    public Function1 k;
    public final Lazy l;

    public SimpleDividerItemDecoration(@NotNull Context context0, int v, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = ContextCompat.getDrawable(context0, drawable.divider_gray4_05dp);
        this.e = 5.0f;
        this.f = 2.0f;
        this.g = 1.0f;
        this.h = ContextCompat.getColor(context0, color.gray4);
        this.k = a.a;
        this.l = c.lazy(new b(this));
    }

    public SimpleDividerItemDecoration(Context context0, int v, boolean z, boolean z1, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 1;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        if((v1 & 8) != 0) {
            z1 = false;
        }
        this(context0, v, z, z1);
    }

    public final int getAddSpaceToHeaderBottomDp() {
        return this.i;
    }

    @NotNull
    public final Function1 getCheckNeedDivider() {
        return this.k;
    }

    public final int getDashColor() {
        return this.h;
    }

    public final float getDashGap() {
        return this.e;
    }

    public final float getDashSize() {
        return this.g;
    }

    public final float getDashWidth() {
        return this.f;
    }

    @Nullable
    public final Drawable getDividerDrawable() {
        return this.d;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void getItemOffsets(@NotNull Rect rect0, @NotNull View view0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        Intrinsics.checkNotNullParameter(rect0, "outRect");
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        super.getItemOffsets(rect0, view0, recyclerView0, recyclerView$State0);
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 != null) {
            if(this.i <= 0) {
                recyclerView$Adapter0 = null;
            }
            if(recyclerView$Adapter0 != null && recyclerView0.getChildAdapterPosition(view0) == 0) {
                if(this.a == 1) {
                    rect0.bottom = this.i;
                    return;
                }
                rect0.right = this.i;
            }
        }
    }

    public final boolean isEmptyListMode() {
        return this.j;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void onDrawOver(@NotNull Canvas canvas0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        int v = 0;
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        if(this.j) {
            return;
        }
        if(this.c) {
            canvas0.save();
            int v1 = recyclerView0.getChildCount();
            while(v < v1) {
                View view0 = recyclerView0.getChildAt(v);
                Integer integer0 = recyclerView0.getChildAdapterPosition(view0);
                if(((Boolean)this.k.invoke(integer0)).booleanValue()) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    LayoutParams recyclerView$LayoutParams0 = (LayoutParams)viewGroup$LayoutParams0;
                    float f = (float)(view0.getBottom() + recyclerView$LayoutParams0.bottomMargin);
                    switch(this.a) {
                        case 0: {
                            float f1 = (float)(view0.getRight() + recyclerView$LayoutParams0.rightMargin);
                            canvas0.drawLine(f1, ((float)(view0.getTop() - recyclerView$LayoutParams0.topMargin)), f1, f, ((Paint)this.l.getValue()));
                            break;
                        }
                        case 1: {
                            canvas0.drawLine(((float)(view0.getLeft() - recyclerView$LayoutParams0.leftMargin)), f, ((float)(view0.getRight() + recyclerView$LayoutParams0.rightMargin)), f, ((Paint)this.l.getValue()));
                        }
                    }
                }
                ++v;
            }
            canvas0.restore();
            return;
        }
        Drawable drawable0 = this.d;
        if(drawable0 != null) {
            int v2 = recyclerView0.getPaddingLeft();
            int v3 = recyclerView0.getWidth();
            int v4 = recyclerView0.getPaddingRight();
            int v5 = recyclerView0.getChildCount();
            while(v < v5) {
                View view1 = recyclerView0.getChildAt(v);
                int v6 = recyclerView0.getChildAdapterPosition(view1);
                if((v6 > 0 || this.b) && ((Boolean)this.k.invoke(v6)).booleanValue()) {
                    int v7 = view1.getBottom();
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = view1.getLayoutParams();
                    Intrinsics.checkNotNull(viewGroup$LayoutParams1, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    int v8 = v7 + ((LayoutParams)viewGroup$LayoutParams1).bottomMargin;
                    int v9 = drawable0.getIntrinsicHeight();
                    drawable0.setBounds(v2, v8 - v9, v3 - v4, drawable0.getIntrinsicHeight() + (v8 - v9));
                    drawable0.draw(canvas0);
                }
                ++v;
            }
        }
    }

    public final void setAddSpaceToHeaderBottomDp(int v) {
        this.i = v;
    }

    public final void setCheckNeedDivider(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.k = function10;
    }

    public final void setDashColor(int v) {
        this.h = v;
    }

    public final void setDashGap(float f) {
        this.e = f;
    }

    public final void setDashSize(float f) {
        this.g = f;
    }

    public final void setDashWidth(float f) {
        this.f = f;
    }

    public final void setDividerDrawable(@Nullable Drawable drawable0) {
        this.d = drawable0;
    }

    public final void setEmptyListMode(boolean z) {
        this.j = z;
    }
}

