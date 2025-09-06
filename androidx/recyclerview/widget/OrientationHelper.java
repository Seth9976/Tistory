package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class OrientationHelper {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public int a;
    public final Rect b;
    protected final LayoutManager mLayoutManager;

    public OrientationHelper(LayoutManager recyclerView$LayoutManager0) {
        this.a = 0x80000000;
        this.b = new Rect();
        this.mLayoutManager = recyclerView$LayoutManager0;
    }

    public static OrientationHelper createHorizontalHelper(LayoutManager recyclerView$LayoutManager0) {
        return new c1(recyclerView$LayoutManager0);  // 初始化器: Landroidx/recyclerview/widget/OrientationHelper;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
    }

    public static OrientationHelper createOrientationHelper(LayoutManager recyclerView$LayoutManager0, int v) {
        switch(v) {
            case 0: {
                return OrientationHelper.createHorizontalHelper(recyclerView$LayoutManager0);
            }
            case 1: {
                return OrientationHelper.createVerticalHelper(recyclerView$LayoutManager0);
            }
            default: {
                throw new IllegalArgumentException("invalid orientation");
            }
        }
    }

    public static OrientationHelper createVerticalHelper(LayoutManager recyclerView$LayoutManager0) {
        return new d1(recyclerView$LayoutManager0);  // 初始化器: Landroidx/recyclerview/widget/OrientationHelper;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
    }

    public abstract int getDecoratedEnd(View arg1);

    public abstract int getDecoratedMeasurement(View arg1);

    public abstract int getDecoratedMeasurementInOther(View arg1);

    public abstract int getDecoratedStart(View arg1);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public LayoutManager getLayoutManager() {
        return this.mLayoutManager;
    }

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange() {
        return 0x80000000 == this.a ? 0 : this.getTotalSpace() - this.a;
    }

    public abstract int getTransformedEndWithDecoration(View arg1);

    public abstract int getTransformedStartWithDecoration(View arg1);

    public abstract void offsetChild(View arg1, int arg2);

    public abstract void offsetChildren(int arg1);

    public void onLayoutComplete() {
        this.a = this.getTotalSpace();
    }
}

