package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DividerItemDecoration extends ItemDecoration {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public Drawable m;
    public int n;
    public final Rect o;
    public static final int[] p;

    static {
        DividerItemDecoration.p = new int[]{0x1010214};
    }

    @SuppressLint({"UnknownNullness"})
    public DividerItemDecoration(Context context0, int v) {
        this.o = new Rect();
        TypedArray typedArray0 = context0.obtainStyledAttributes(DividerItemDecoration.p);
        Drawable drawable0 = typedArray0.getDrawable(0);
        this.m = drawable0;
        if(drawable0 == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArray0.recycle();
        this.setOrientation(v);
    }

    @Nullable
    public Drawable getDrawable() {
        return this.m;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect0, View view0, RecyclerView recyclerView0, State recyclerView$State0) {
        Drawable drawable0 = this.m;
        if(drawable0 == null) {
            rect0.set(0, 0, 0, 0);
            return;
        }
        if(this.n == 1) {
            rect0.set(0, 0, 0, drawable0.getIntrinsicHeight());
            return;
        }
        rect0.set(0, 0, drawable0.getIntrinsicWidth(), 0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        int v8;
        int v7;
        int v2;
        int v1;
        if(recyclerView0.getLayoutManager() != null && this.m != null) {
            Rect rect0 = this.o;
            int v = 0;
            if(this.n == 1) {
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
                    recyclerView0.getDecoratedBoundsWithMargins(view0, rect0);
                    int v4 = rect0.bottom;
                    int v5 = Math.round(view0.getTranslationY());
                    int v6 = this.m.getIntrinsicHeight();
                    this.m.setBounds(v1, v5 + v4 - v6, v2, v5 + v4);
                    this.m.draw(canvas0);
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
                recyclerView0.getLayoutManager().getDecoratedBoundsWithMargins(view1, rect0);
                int v10 = rect0.right;
                int v11 = Math.round(view1.getTranslationX());
                int v12 = this.m.getIntrinsicWidth();
                this.m.setBounds(v11 + v10 - v12, v7, v11 + v10, v8);
                this.m.draw(canvas0);
                ++v;
            }
            canvas0.restore();
        }
    }

    public void setDrawable(@NonNull Drawable drawable0) {
        if(drawable0 == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.m = drawable0;
    }

    public void setOrientation(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.n = v;
    }
}

