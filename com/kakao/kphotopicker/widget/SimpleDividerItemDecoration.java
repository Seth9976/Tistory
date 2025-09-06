package com.kakao.kphotopicker.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.kphotopicker.R.drawable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\u000E\u001A\u00020\t2\n\b\u0001\u0010\r\u001A\u0004\u0018\u00010\f¢\u0006\u0004\b\u000E\u0010\u000FJ\'\u0010\u0016\u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001C\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u0015\u0010\u001F\u001A\u00020\t2\u0006\u0010\u001E\u001A\u00020\u0004¢\u0006\u0004\b\u001F\u0010\u000B¨\u0006!"}, d2 = {"Lcom/kakao/kphotopicker/widget/SimpleDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", "context", "", "dividerRes", "orientation", "<init>", "(Landroid/content/Context;II)V", "", "setOrientation", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "position", "addIgnorePosition", "Companion", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SimpleDividerItemDecoration extends ItemDecoration {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/kakao/kphotopicker/widget/SimpleDividerItemDecoration$Companion;", "", "", "HORIZONTAL", "I", "getHORIZONTAL", "()I", "VERTICAL", "getVERTICAL", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int getHORIZONTAL() {
            return 0;
        }

        // 去混淆评级： 低(20)
        public final int getVERTICAL() {
            return 1;
        }
    }

    @NotNull
    public static final Companion Companion;
    public Drawable m;
    public final ArrayList n;
    public int o;
    public final Rect p;
    public static final int q;

    static {
        SimpleDividerItemDecoration.Companion = new Companion(null);
        SimpleDividerItemDecoration.q = 1;
    }

    public SimpleDividerItemDecoration(@NotNull Context context0, int v, int v1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.n = new ArrayList();
        this.p = new Rect();
        this.setDrawable(ContextCompat.getDrawable(context0, v));
        this.setOrientation(v1);
    }

    public SimpleDividerItemDecoration(Context context0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            v = drawable.kphotopicker_divider_line_folder;
        }
        if((v2 & 4) != 0) {
            v1 = 1;
        }
        this(context0, v, v1);
    }

    public static final int access$getHORIZONTAL$cp() [...] // Inlined contents

    public static final int access$getVERTICAL$cp() [...] // 潜在的解密器

    public final void addIgnorePosition(int v) {
        this.n.add(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void getItemOffsets(@NotNull Rect rect0, @NotNull View view0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        Intrinsics.checkNotNullParameter(rect0, "outRect");
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        if(this.m != null) {
            Integer integer0 = recyclerView0.indexOfChild(view0);
            if(!this.n.contains(integer0)) {
                if(this.o == SimpleDividerItemDecoration.q) {
                    Drawable drawable0 = this.m;
                    Intrinsics.checkNotNull(drawable0);
                    rect0.set(0, 0, 0, drawable0.getIntrinsicHeight());
                    return;
                }
                Drawable drawable1 = this.m;
                Intrinsics.checkNotNull(drawable1);
                rect0.set(0, 0, drawable1.getIntrinsicWidth(), 0);
                return;
            }
        }
        rect0.set(0, 0, 0, 0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void onDraw(@NotNull Canvas canvas0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
        int v8;
        int v7;
        int v2;
        int v1;
        Intrinsics.checkNotNullParameter(canvas0, "c");
        Intrinsics.checkNotNullParameter(recyclerView0, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
        if(recyclerView0.getLayoutManager() != null && this.m != null) {
            ArrayList arrayList0 = this.n;
            Rect rect0 = this.p;
            int v = 0;
            if(this.o == SimpleDividerItemDecoration.q) {
                canvas0.save();
                if(recyclerView0.getClipToPadding()) {
                    v1 = recyclerView0.getPaddingLeft();
                    v2 = recyclerView0.getWidth() - recyclerView0.getPaddingRight();
                    canvas0.clipRect(v1, recyclerView0.getPaddingTop(), v2, recyclerView0.getHeight() - recyclerView0.getPaddingBottom());
                }
                else {
                    v2 = recyclerView0.getWidth();
                    v1 = 0;
                }
                int v3 = recyclerView0.getChildCount();
                while(v < v3) {
                    View view0 = recyclerView0.getChildAt(v);
                    if(!arrayList0.contains(recyclerView0.getChildAdapterPosition(view0))) {
                        recyclerView0.getDecoratedBoundsWithMargins(view0, rect0);
                        int v4 = rect0.bottom;
                        int v5 = Math.round(view0.getTranslationY());
                        Drawable drawable0 = this.m;
                        Intrinsics.checkNotNull(drawable0);
                        int v6 = drawable0.getIntrinsicHeight();
                        Drawable drawable1 = this.m;
                        Intrinsics.checkNotNull(drawable1);
                        drawable1.setBounds(v1, v5 + v4 - v6, v2, v5 + v4);
                        Drawable drawable2 = this.m;
                        Intrinsics.checkNotNull(drawable2);
                        drawable2.draw(canvas0);
                    }
                    ++v;
                }
                canvas0.restore();
                return;
            }
            canvas0.save();
            if(recyclerView0.getClipToPadding()) {
                v7 = recyclerView0.getPaddingTop();
                v8 = recyclerView0.getHeight() - recyclerView0.getPaddingBottom();
                canvas0.clipRect(recyclerView0.getPaddingLeft(), v7, recyclerView0.getWidth() - recyclerView0.getPaddingRight(), v8);
            }
            else {
                v8 = recyclerView0.getHeight();
                v7 = 0;
            }
            int v9 = recyclerView0.getChildCount();
            while(v < v9) {
                View view1 = recyclerView0.getChildAt(v);
                if(!arrayList0.contains(recyclerView0.getChildAdapterPosition(view1))) {
                    LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                    if(recyclerView$LayoutManager0 != null) {
                        recyclerView$LayoutManager0.getDecoratedBoundsWithMargins(view1, rect0);
                    }
                    int v10 = rect0.right;
                    int v11 = Math.round(view1.getTranslationX());
                    Drawable drawable3 = this.m;
                    Intrinsics.checkNotNull(drawable3);
                    int v12 = drawable3.getIntrinsicWidth();
                    Drawable drawable4 = this.m;
                    Intrinsics.checkNotNull(drawable4);
                    drawable4.setBounds(v11 + v10 - v12, v7, v11 + v10, v8);
                    Drawable drawable5 = this.m;
                    Intrinsics.checkNotNull(drawable5);
                    drawable5.draw(canvas0);
                }
                ++v;
            }
            canvas0.restore();
        }
    }

    public final void setDrawable(@NonNull @Nullable Drawable drawable0) {
        if(drawable0 == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.m = drawable0;
    }

    public final void setOrientation(int v) {
        if(v != 0 && v != SimpleDividerItemDecoration.q) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.o = v;
    }
}

