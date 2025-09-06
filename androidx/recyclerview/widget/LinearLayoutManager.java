package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;

public class LinearLayoutManager extends LayoutManager implements ViewDropHandler, ScrollVectorProvider {
    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public int a;
        public int b;
        public boolean c;

        static {
            SavedState.CREATOR = new s0();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState() {
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState linearLayoutManager$SavedState0) {
            this.a = linearLayoutManager$SavedState0.a;
            this.b = linearLayoutManager$SavedState0.b;
            this.c = linearLayoutManager$SavedState0.c;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeInt(this.b);
            parcel0.writeInt(((int)this.c));
        }
    }

    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = 0x80000000;
    private static final float MAX_SCROLL_FACTOR = 0.333333f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final q0 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private r0 mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context0) {
        this(context0, 1, false);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context0, int v, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new q0();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        this.setOrientation(v);
        this.setReverseLayout(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new q0();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        Properties recyclerView$LayoutManager$Properties0 = LayoutManager.getProperties(context0, attributeSet0, v, v1);
        this.setOrientation(recyclerView$LayoutManager$Properties0.orientation);
        this.setReverseLayout(recyclerView$LayoutManager$Properties0.reverseLayout);
        this.setStackFromEnd(recyclerView$LayoutManager$Properties0.stackFromEnd);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String s) {
        if(this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(s);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull State recyclerView$State0, @NonNull int[] arr_v) {
        int v1;
        int v = this.getExtraLayoutSpace(recyclerView$State0);
        if(this.mLayoutState.f == -1) {
            v1 = 0;
        }
        else {
            v1 = v;
            v = 0;
        }
        arr_v[0] = v;
        arr_v[1] = v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int v, int v1, State recyclerView$State0, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        if(this.mOrientation != 0) {
            v = v1;
        }
        if(this.getChildCount() != 0 && v != 0) {
            this.ensureLayoutState();
            this.o((v <= 0 ? -1 : 1), Math.abs(v), true, recyclerView$State0);
            this.collectPrefetchPositionsForLayoutState(recyclerView$State0, this.mLayoutState, recyclerView$LayoutManager$LayoutPrefetchRegistry0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int v, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        boolean z;
        int v2;
        SavedState linearLayoutManager$SavedState0 = this.mPendingSavedState;
        int v1 = -1;
        if(linearLayoutManager$SavedState0 == null) {
        label_7:
            this.n();
            z = this.mShouldReverseLayout;
            v2 = this.mPendingScrollPosition;
            if(v2 == -1) {
                v2 = z ? v - 1 : 0;
            }
        }
        else {
            v2 = linearLayoutManager$SavedState0.a;
            if(v2 >= 0) {
                z = linearLayoutManager$SavedState0.c;
                goto label_12;
            }
            goto label_7;
        }
    label_12:
        if(!z) {
            v1 = 1;
        }
        for(int v3 = 0; v3 < this.mInitialPrefetchItemCount && v2 >= 0 && v2 < v; ++v3) {
            recyclerView$LayoutManager$LayoutPrefetchRegistry0.addPosition(v2, 0);
            v2 += v1;
        }
    }

    public void collectPrefetchPositionsForLayoutState(State recyclerView$State0, r0 r00, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        int v = r00.d;
        if(v >= 0 && v < recyclerView$State0.getItemCount()) {
            recyclerView$LayoutManager$LayoutPrefetchRegistry0.addPosition(v, Math.max(0, r00.g));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(State recyclerView$State0) {
        return this.d(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(State recyclerView$State0) {
        return this.e(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(State recyclerView$State0) {
        return this.f(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller$ScrollVectorProvider
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int v) {
        if(this.getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int v1 = 1;
        if(v < this.getPosition(this.getChildAt(0))) {
            z = true;
        }
        if(z != this.mShouldReverseLayout) {
            v1 = -1;
        }
        return this.mOrientation == 0 ? new PointF(((float)v1), 0.0f) : new PointF(0.0f, ((float)v1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(State recyclerView$State0) {
        return this.d(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(State recyclerView$State0) {
        return this.e(recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(State recyclerView$State0) {
        return this.f(recyclerView$State0);
    }

    public int convertFocusDirectionToLayoutDirection(int v) {
        switch(v) {
            case 1: {
                if(this.mOrientation == 1) {
                    return -1;
                }
                return this.isLayoutRTL() ? 1 : -1;
            }
            case 2: {
                if(this.mOrientation == 1) {
                    return 1;
                }
                return this.isLayoutRTL() ? -1 : 1;
            }
            case 17: {
                return this.mOrientation == 0 ? -1 : 0x80000000;
            }
            case 33: {
                return this.mOrientation == 1 ? -1 : 0x80000000;
            }
            case 66: {
                return this.mOrientation == 0 ? 1 : 0x80000000;
            }
            case 130: {
                return this.mOrientation == 1 ? 1 : 0x80000000;
            }
            default: {
                return 0x80000000;
            }
        }
    }

    public r0 createLayoutState() {
        r0 r00 = new r0();  // 初始化器: Ljava/lang/Object;-><init>()V
        r00.a = true;
        r00.h = 0;
        r00.i = 0;
        r00.k = null;
        return r00;
    }

    public final int d(State recyclerView$State0) {
        if(this.getChildCount() == 0) {
            return 0;
        }
        this.ensureLayoutState();
        return v1.a(recyclerView$State0, this.mOrientationHelper, this.findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), this.findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(State recyclerView$State0) {
        if(this.getChildCount() == 0) {
            return 0;
        }
        this.ensureLayoutState();
        return v1.b(recyclerView$State0, this.mOrientationHelper, this.findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), this.findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if(this.mLayoutState == null) {
            this.mLayoutState = this.createLayoutState();
        }
    }

    public final int f(State recyclerView$State0) {
        if(this.getChildCount() == 0) {
            return 0;
        }
        this.ensureLayoutState();
        return v1.c(recyclerView$State0, this.mOrientationHelper, this.findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), this.findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(Recycler recyclerView$Recycler0, r0 r00, State recyclerView$State0, boolean z) {
        int v = r00.c;
        int v1 = r00.g;
        if(v1 != 0x80000000) {
            if(v < 0) {
                r00.g = v1 + v;
            }
            this.l(recyclerView$Recycler0, r00);
        }
        int v2 = r00.c + r00.h;
        LayoutChunkResult linearLayoutManager$LayoutChunkResult0 = this.mLayoutChunkResult;
        while((r00.l || v2 > 0) && (r00.d >= 0 && r00.d < recyclerView$State0.getItemCount())) {
            linearLayoutManager$LayoutChunkResult0.mConsumed = 0;
            linearLayoutManager$LayoutChunkResult0.mFinished = false;
            linearLayoutManager$LayoutChunkResult0.mIgnoreConsumed = false;
            linearLayoutManager$LayoutChunkResult0.mFocusable = false;
            this.layoutChunk(recyclerView$Recycler0, recyclerView$State0, r00, linearLayoutManager$LayoutChunkResult0);
            if(linearLayoutManager$LayoutChunkResult0.mFinished) {
                break;
            }
            r00.b = linearLayoutManager$LayoutChunkResult0.mConsumed * r00.f + r00.b;
            if(!linearLayoutManager$LayoutChunkResult0.mIgnoreConsumed || r00.k != null || !recyclerView$State0.isPreLayout()) {
                r00.c -= linearLayoutManager$LayoutChunkResult0.mConsumed;
                v2 -= linearLayoutManager$LayoutChunkResult0.mConsumed;
            }
            int v3 = r00.g;
            if(v3 != 0x80000000) {
                int v4 = v3 + linearLayoutManager$LayoutChunkResult0.mConsumed;
                r00.g = v4;
                int v5 = r00.c;
                if(v5 < 0) {
                    r00.g = v4 + v5;
                }
                this.l(recyclerView$Recycler0, r00);
            }
            if(z && linearLayoutManager$LayoutChunkResult0.mFocusable) {
                break;
            }
        }
        return v - r00.c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View view0 = this.findOneVisibleChild(0, this.getChildCount(), true, false);
        return view0 == null ? -1 : this.getPosition(view0);
    }

    // 去混淆评级： 低(20)
    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z1) {
        return this.mShouldReverseLayout ? this.findOneVisibleChild(0, this.getChildCount(), z, z1) : this.findOneVisibleChild(this.getChildCount() - 1, -1, z, z1);
    }

    // 去混淆评级： 低(20)
    public View findFirstVisibleChildClosestToStart(boolean z, boolean z1) {
        return this.mShouldReverseLayout ? this.findOneVisibleChild(this.getChildCount() - 1, -1, z, z1) : this.findOneVisibleChild(0, this.getChildCount(), z, z1);
    }

    public int findFirstVisibleItemPosition() {
        View view0 = this.findOneVisibleChild(0, this.getChildCount(), false, true);
        return view0 == null ? -1 : this.getPosition(view0);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View view0 = this.findOneVisibleChild(this.getChildCount() - 1, -1, true, false);
        return view0 == null ? -1 : this.getPosition(view0);
    }

    public int findLastVisibleItemPosition() {
        View view0 = this.findOneVisibleChild(this.getChildCount() - 1, -1, false, true);
        return view0 == null ? -1 : this.getPosition(view0);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int v, int v1) {
        this.ensureLayoutState();
        if(v1 > v || v1 < v) {
            if(this.mOrientationHelper.getDecoratedStart(this.getChildAt(v)) < this.mOrientationHelper.getStartAfterPadding()) {
                return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(v, v1, 0x4104, 0x4004) : this.mVerticalBoundCheck.a(v, v1, 0x4104, 0x4004);
            }
            return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(v, v1, 0x1041, 0x1001) : this.mVerticalBoundCheck.a(v, v1, 0x1041, 0x1001);
        }
        return this.getChildAt(v);
    }

    public View findOneVisibleChild(int v, int v1, boolean z, boolean z1) {
        this.ensureLayoutState();
        int v2 = 320;
        int v3 = z ? 0x6003 : 320;
        if(!z1) {
            v2 = 0;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(v, v1, v3, v2) : this.mVerticalBoundCheck.a(v, v1, v3, v2);
    }

    public View findReferenceChild(Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z, boolean z1) {
        int v3;
        int v2;
        int v1;
        this.ensureLayoutState();
        int v = this.getChildCount();
        if(z1) {
            v1 = this.getChildCount() - 1;
            v2 = -1;
            v3 = -1;
        }
        else {
            v2 = v;
            v1 = 0;
            v3 = 1;
        }
        int v4 = recyclerView$State0.getItemCount();
        int v5 = this.mOrientationHelper.getStartAfterPadding();
        int v6 = this.mOrientationHelper.getEndAfterPadding();
        View view0 = null;
        View view1 = null;
        View view2 = null;
        while(v1 != v2) {
            View view3 = this.getChildAt(v1);
            int v7 = this.getPosition(view3);
            int v8 = this.mOrientationHelper.getDecoratedStart(view3);
            int v9 = this.mOrientationHelper.getDecoratedEnd(view3);
            if(v7 >= 0 && v7 < v4) {
                if(!((LayoutParams)view3.getLayoutParams()).isItemRemoved()) {
                    boolean z2 = v9 <= v5 && v8 < v5;
                    boolean z3 = v8 >= v6 && v9 > v6;
                    if(!z2 && !z3) {
                        return view3;
                    }
                    if(!z) {
                        if(z2) {
                            view1 = view3;
                        }
                        else if(view0 == null) {
                            view0 = view3;
                        }
                    }
                    else if(z3) {
                        view1 = view3;
                    }
                    else if(view0 == null) {
                        view0 = view3;
                    }
                }
                else if(view2 == null) {
                    view2 = view3;
                }
            }
            v1 += v3;
        }
        if(view0 == null) {
            return view1 == null ? view2 : view1;
        }
        return view0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int v) {
        int v1 = this.getChildCount();
        if(v1 == 0) {
            return null;
        }
        int v2 = v - this.getPosition(this.getChildAt(0));
        if(v2 >= 0 && v2 < v1) {
            View view0 = this.getChildAt(v2);
            return this.getPosition(view0) == v ? view0 : super.findViewByPosition(v);
        }
        return super.findViewByPosition(v);
    }

    public final int g(int v, Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        int v1 = this.mOrientationHelper.getEndAfterPadding() - v;
        if(v1 > 0) {
            int v2 = this.scrollBy(-v1, recyclerView$Recycler0, recyclerView$State0);
            if(z) {
                int v3 = this.mOrientationHelper.getEndAfterPadding() - (v - v2);
                if(v3 > 0) {
                    this.mOrientationHelper.offsetChildren(v3);
                    return v3 - v2;
                }
            }
            return -v2;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public int getExtraLayoutSpace(State recyclerView$State0) {
        return recyclerView$State0.hasTargetScrollPosition() ? this.mOrientationHelper.getTotalSpace() : 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(int v, Recycler recyclerView$Recycler0, State recyclerView$State0, boolean z) {
        int v1 = v - this.mOrientationHelper.getStartAfterPadding();
        if(v1 > 0) {
            int v2 = -this.scrollBy(v1, recyclerView$Recycler0, recyclerView$State0);
            if(z) {
                int v3 = v + v2 - this.mOrientationHelper.getStartAfterPadding();
                if(v3 > 0) {
                    this.mOrientationHelper.offsetChildren(-v3);
                    return v2 - v3;
                }
            }
            return v2;
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    public final View i() {
        return this.mShouldReverseLayout ? this.getChildAt(0) : this.getChildAt(this.getChildCount() - 1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return this.getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    // 去混淆评级： 低(20)
    public final View j() {
        return this.mShouldReverseLayout ? this.getChildAt(this.getChildCount() - 1) : this.getChildAt(0);
    }

    public final void k() {
        Log.d("LinearLayoutManager", "internal representation of views on the screen");
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            Log.d("LinearLayoutManager", "item " + this.getPosition(view0) + ", coord:" + this.mOrientationHelper.getDecoratedStart(view0));
        }
        Log.d("LinearLayoutManager", "==============");
    }

    public final void l(Recycler recyclerView$Recycler0, r0 r00) {
        if(r00.a && !r00.l) {
            int v = r00.g;
            int v1 = r00.i;
            if(r00.f == -1) {
                int v2 = this.getChildCount();
                if(v >= 0) {
                    int v3 = this.mOrientationHelper.getEnd() - v + v1;
                    if(this.mShouldReverseLayout) {
                        int v4 = 0;
                        while(v4 < v2) {
                            View view0 = this.getChildAt(v4);
                            if(this.mOrientationHelper.getDecoratedStart(view0) >= v3 && this.mOrientationHelper.getTransformedStartWithDecoration(view0) >= v3) {
                                ++v4;
                                continue;
                            }
                            this.m(recyclerView$Recycler0, 0, v4);
                            return;
                        }
                    }
                    else {
                        int v5 = v2 - 1;
                        while(v5 >= 0) {
                            View view1 = this.getChildAt(v5);
                            if(this.mOrientationHelper.getDecoratedStart(view1) >= v3 && this.mOrientationHelper.getTransformedStartWithDecoration(view1) >= v3) {
                                --v5;
                                continue;
                            }
                            this.m(recyclerView$Recycler0, v2 - 1, v5);
                            return;
                        }
                    }
                }
            }
            else if(v >= 0) {
                int v6 = v - v1;
                int v7 = this.getChildCount();
                if(this.mShouldReverseLayout) {
                    int v8 = v7 - 1;
                    while(v8 >= 0) {
                        View view2 = this.getChildAt(v8);
                        if(this.mOrientationHelper.getDecoratedEnd(view2) <= v6 && this.mOrientationHelper.getTransformedEndWithDecoration(view2) <= v6) {
                            --v8;
                            continue;
                        }
                        this.m(recyclerView$Recycler0, v7 - 1, v8);
                        return;
                    }
                }
                else {
                    int v9 = 0;
                    while(v9 < v7) {
                        View view3 = this.getChildAt(v9);
                        if(this.mOrientationHelper.getDecoratedEnd(view3) <= v6 && this.mOrientationHelper.getTransformedEndWithDecoration(view3) <= v6) {
                            ++v9;
                        }
                        else {
                            this.m(recyclerView$Recycler0, 0, v9);
                            if(true) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public void layoutChunk(Recycler recyclerView$Recycler0, State recyclerView$State0, r0 r00, LayoutChunkResult linearLayoutManager$LayoutChunkResult0) {
        int v4;
        int v3;
        int v2;
        int v1;
        int v;
        View view0 = r00.b(recyclerView$Recycler0);
        if(view0 == null) {
            linearLayoutManager$LayoutChunkResult0.mFinished = true;
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(r00.k != null) {
            if(this.mShouldReverseLayout == (r00.f == -1)) {
                this.addDisappearingView(view0);
            }
            else {
                this.addDisappearingView(view0, 0);
            }
        }
        else if(this.mShouldReverseLayout == (r00.f == -1)) {
            this.addView(view0);
        }
        else {
            this.addView(view0, 0);
        }
        this.measureChildWithMargins(view0, 0, 0);
        linearLayoutManager$LayoutChunkResult0.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(view0);
        if(this.mOrientation == 1) {
            if(this.isLayoutRTL()) {
                v = this.getWidth() - this.getPaddingRight();
                v1 = v - this.mOrientationHelper.getDecoratedMeasurementInOther(view0);
            }
            else {
                v1 = this.getPaddingLeft();
                v = this.mOrientationHelper.getDecoratedMeasurementInOther(view0) + v1;
            }
            if(r00.f == -1) {
                v2 = r00.b;
                v3 = v;
                v4 = r00.b - linearLayoutManager$LayoutChunkResult0.mConsumed;
            }
            else {
                v4 = r00.b;
                v3 = v;
                v2 = linearLayoutManager$LayoutChunkResult0.mConsumed + r00.b;
            }
        }
        else {
            int v5 = this.getPaddingTop();
            int v6 = this.mOrientationHelper.getDecoratedMeasurementInOther(view0) + v5;
            if(r00.f == -1) {
                v3 = r00.b;
                v4 = v5;
                v2 = v6;
                v1 = r00.b - linearLayoutManager$LayoutChunkResult0.mConsumed;
            }
            else {
                v4 = v5;
                v3 = linearLayoutManager$LayoutChunkResult0.mConsumed + r00.b;
                v2 = v6;
                v1 = r00.b;
            }
        }
        this.layoutDecoratedWithMargins(view0, v1, v4, v3, v2);
        if(((LayoutParams)viewGroup$LayoutParams0).isItemRemoved() || ((LayoutParams)viewGroup$LayoutParams0).isItemChanged()) {
            linearLayoutManager$LayoutChunkResult0.mIgnoreConsumed = true;
        }
        linearLayoutManager$LayoutChunkResult0.mFocusable = view0.hasFocusable();
    }

    public final void m(Recycler recyclerView$Recycler0, int v, int v1) {
        if(v == v1) {
            return;
        }
        if(v1 > v) {
            for(int v2 = v1 - 1; v2 >= v; --v2) {
                this.removeAndRecycleViewAt(v2, recyclerView$Recycler0);
            }
            return;
        }
        while(v > v1) {
            this.removeAndRecycleViewAt(v, recyclerView$Recycler0);
            --v;
        }
    }

    public final void n() {
        if(this.mOrientation != 1 && this.isLayoutRTL()) {
            this.mShouldReverseLayout = !this.mReverseLayout;
            return;
        }
        this.mShouldReverseLayout = this.mReverseLayout;
    }

    public final void o(int v, int v1, boolean z, State recyclerView$State0) {
        int v7;
        r0 r00 = this.mLayoutState;
        r00.l = this.resolveIsInfinite();
        this.mLayoutState.f = v;
        int[] arr_v = this.mReusableIntPair;
        boolean z1 = false;
        arr_v[0] = 0;
        int v2 = 1;
        arr_v[1] = 0;
        this.calculateExtraLayoutSpace(recyclerView$State0, arr_v);
        int v3 = Math.max(0, this.mReusableIntPair[0]);
        int v4 = Math.max(0, this.mReusableIntPair[1]);
        if(v == 1) {
            z1 = true;
        }
        r0 r01 = this.mLayoutState;
        int v5 = z1 ? v4 : v3;
        r01.h = v5;
        if(!z1) {
            v3 = v4;
        }
        r01.i = v3;
        if(z1) {
            r01.h = this.mOrientationHelper.getEndPadding() + v5;
            View view0 = this.i();
            r0 r02 = this.mLayoutState;
            if(this.mShouldReverseLayout) {
                v2 = -1;
            }
            r02.e = v2;
            int v6 = this.getPosition(view0);
            r0 r03 = this.mLayoutState;
            r02.d = v6 + r03.e;
            r03.b = this.mOrientationHelper.getDecoratedEnd(view0);
            v7 = this.mOrientationHelper.getDecoratedEnd(view0) - this.mOrientationHelper.getEndAfterPadding();
        }
        else {
            View view1 = this.j();
            r0 r04 = this.mLayoutState;
            int v8 = r04.h;
            r04.h = this.mOrientationHelper.getStartAfterPadding() + v8;
            r0 r05 = this.mLayoutState;
            if(!this.mShouldReverseLayout) {
                v2 = -1;
            }
            r05.e = v2;
            int v9 = this.getPosition(view1);
            r0 r06 = this.mLayoutState;
            r05.d = v9 + r06.e;
            r06.b = this.mOrientationHelper.getDecoratedStart(view1);
            v7 = -this.mOrientationHelper.getDecoratedStart(view1) + this.mOrientationHelper.getStartAfterPadding();
        }
        r0 r07 = this.mLayoutState;
        r07.c = v1;
        if(z) {
            r07.c = v1 - v7;
        }
        r07.g = v7;
    }

    public void onAnchorReady(Recycler recyclerView$Recycler0, State recyclerView$State0, q0 q00, int v) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
        super.onDetachedFromWindow(recyclerView0, recyclerView$Recycler0);
        if(this.mRecycleChildrenOnDetach) {
            this.removeAndRecycleAllViews(recyclerView$Recycler0);
            recyclerView$Recycler0.clear();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view0, int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        View view1;
        this.n();
        if(this.getChildCount() == 0) {
            return null;
        }
        int v1 = this.convertFocusDirectionToLayoutDirection(v);
        if(v1 == 0x80000000) {
            return null;
        }
        this.ensureLayoutState();
        this.o(v1, ((int)(((float)this.mOrientationHelper.getTotalSpace()) * 0.333333f)), false, recyclerView$State0);
        this.mLayoutState.g = 0x80000000;
        this.mLayoutState.a = false;
        this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, true);
        if(v1 != -1) {
            view1 = this.mShouldReverseLayout ? this.findOnePartiallyOrCompletelyInvisibleChild(0, this.getChildCount()) : this.findOnePartiallyOrCompletelyInvisibleChild(this.getChildCount() - 1, -1);
        }
        else if(this.mShouldReverseLayout) {
            view1 = this.findOnePartiallyOrCompletelyInvisibleChild(this.getChildCount() - 1, -1);
        }
        else {
            view1 = this.findOnePartiallyOrCompletelyInvisibleChild(0, this.getChildCount());
        }
        View view2 = v1 == -1 ? this.j() : this.i();
        if(view2.hasFocusable()) {
            return view1 == null ? null : view2;
        }
        return view1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        if(this.getChildCount() > 0) {
            accessibilityEvent0.setFromIndex(this.findFirstVisibleItemPosition());
            accessibilityEvent0.setToIndex(this.findLastVisibleItemPosition());
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v32;
        int v31;
        int v30;
        int v23;
        int v20;
        int v18;
        int v17;
        int v6;
        int v = -1;
        if((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && recyclerView$State0.getItemCount() == 0) {
            this.removeAndRecycleAllViews(recyclerView$Recycler0);
            return;
        }
        SavedState linearLayoutManager$SavedState0 = this.mPendingSavedState;
        if(linearLayoutManager$SavedState0 != null) {
            int v1 = linearLayoutManager$SavedState0.a;
            if(v1 >= 0) {
                this.mPendingScrollPosition = v1;
            }
        }
        this.ensureLayoutState();
        this.mLayoutState.a = false;
        this.n();
        View view0 = this.getFocusedChild();
        q0 q00 = this.mAnchorInfo;
        if(!q00.e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            q00.d();
            q0 q01 = this.mAnchorInfo;
            q01.d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if(recyclerView$State0.isPreLayout()) {
            label_70:
                if(this.getChildCount() == 0) {
                    q01.a();
                    q01.b = this.mStackFromEnd ? recyclerView$State0.getItemCount() - 1 : 0;
                }
                else {
                    View view2 = this.getFocusedChild();
                    if(view2 == null) {
                    label_77:
                        boolean z = this.mStackFromEnd;
                        if(this.mLastStackFromEnd == z) {
                            View view3 = this.findReferenceChild(recyclerView$Recycler0, recyclerView$State0, q01.d, z);
                            if(view3 == null) {
                                q01.a();
                                q01.b = this.mStackFromEnd ? recyclerView$State0.getItemCount() - 1 : 0;
                            }
                            else {
                                q01.b(this.getPosition(view3), view3);
                                if(!recyclerView$State0.isPreLayout() && this.supportsPredictiveItemAnimations()) {
                                    int v8 = this.mOrientationHelper.getDecoratedStart(view3);
                                    int v9 = this.mOrientationHelper.getDecoratedEnd(view3);
                                    int v10 = this.mOrientationHelper.getStartAfterPadding();
                                    int v11 = this.mOrientationHelper.getEndAfterPadding();
                                    if(v9 <= v10 && v8 < v10 || v8 >= v11 && v9 > v11) {
                                        if(q01.d) {
                                            v10 = v11;
                                        }
                                        q01.c = v10;
                                    }
                                }
                            }
                        }
                        else {
                            q01.a();
                            q01.b = this.mStackFromEnd ? recyclerView$State0.getItemCount() - 1 : 0;
                        }
                    }
                    else {
                        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view2.getLayoutParams();
                        if(!recyclerView$LayoutParams0.isItemRemoved() && recyclerView$LayoutParams0.getViewLayoutPosition() >= 0 && recyclerView$LayoutParams0.getViewLayoutPosition() < recyclerView$State0.getItemCount()) {
                            q01.c(this.getPosition(view2), view2);
                            goto label_100;
                        }
                        goto label_77;
                    }
                }
            }
            else {
                int v3 = this.mPendingScrollPosition;
                if(v3 == -1) {
                    goto label_70;
                }
                else if(v3 >= 0 && v3 < recyclerView$State0.getItemCount()) {
                    int v4 = this.mPendingScrollPosition;
                    q01.b = v4;
                    SavedState linearLayoutManager$SavedState1 = this.mPendingSavedState;
                    if(linearLayoutManager$SavedState1 != null && linearLayoutManager$SavedState1.a >= 0) {
                        q01.d = linearLayoutManager$SavedState1.c;
                        q01.c = linearLayoutManager$SavedState1.c ? this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.b : this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.b;
                    }
                    else if(this.mPendingScrollPositionOffset == 0x80000000) {
                        View view1 = this.findViewByPosition(v4);
                        if(view1 == null) {
                            if(this.getChildCount() > 0) {
                                int v7 = this.getPosition(this.getChildAt(0));
                                q01.d = this.mPendingScrollPosition < v7 == this.mShouldReverseLayout;
                            }
                            q01.a();
                        }
                        else if(this.mOrientationHelper.getDecoratedMeasurement(view1) > this.mOrientationHelper.getTotalSpace()) {
                            q01.a();
                        }
                        else if(this.mOrientationHelper.getDecoratedStart(view1) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                            q01.c = this.mOrientationHelper.getStartAfterPadding();
                            q01.d = false;
                        }
                        else if(this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view1) < 0) {
                            q01.c = this.mOrientationHelper.getEndAfterPadding();
                            q01.d = true;
                        }
                        else {
                            if(q01.d) {
                                int v5 = this.mOrientationHelper.getDecoratedEnd(view1);
                                v6 = this.mOrientationHelper.getTotalSpaceChange() + v5;
                            }
                            else {
                                v6 = this.mOrientationHelper.getDecoratedStart(view1);
                            }
                            q01.c = v6;
                        }
                    }
                    else {
                        q01.d = this.mShouldReverseLayout;
                        q01.c = this.mShouldReverseLayout ? this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset : this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                    }
                }
                else {
                    this.mPendingScrollPosition = -1;
                    this.mPendingScrollPositionOffset = 0x80000000;
                    goto label_70;
                }
            }
        label_100:
            this.mAnchorInfo.e = true;
        }
        else if(view0 != null && (this.mOrientationHelper.getDecoratedStart(view0) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(view0) <= this.mOrientationHelper.getStartAfterPadding())) {
            int v2 = this.getPosition(view0);
            this.mAnchorInfo.c(v2, view0);
        }
        this.mLayoutState.f = this.mLayoutState.j < 0 ? -1 : 1;
        int[] arr_v = this.mReusableIntPair;
        arr_v[0] = 0;
        arr_v[1] = 0;
        this.calculateExtraLayoutSpace(recyclerView$State0, arr_v);
        int v12 = Math.max(0, this.mReusableIntPair[0]);
        int v13 = this.mOrientationHelper.getStartAfterPadding() + v12;
        int v14 = Math.max(0, this.mReusableIntPair[1]);
        int v15 = this.mOrientationHelper.getEndPadding() + v14;
        if(recyclerView$State0.isPreLayout()) {
            int v16 = this.mPendingScrollPosition;
            if(v16 != -1 && this.mPendingScrollPositionOffset != 0x80000000) {
                View view4 = this.findViewByPosition(v16);
                if(view4 != null) {
                    if(this.mShouldReverseLayout) {
                        v17 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view4);
                        v18 = this.mPendingScrollPositionOffset;
                    }
                    else {
                        v18 = this.mOrientationHelper.getDecoratedStart(view4) - this.mOrientationHelper.getStartAfterPadding();
                        v17 = this.mPendingScrollPositionOffset;
                    }
                    int v19 = v17 - v18;
                    if(v19 > 0) {
                        v13 += v19;
                    }
                    else {
                        v15 -= v19;
                    }
                }
            }
        }
        q0 q02 = this.mAnchorInfo;
        if(!q02.d) {
            if(!this.mShouldReverseLayout) {
                v = 1;
            }
        }
        else if(this.mShouldReverseLayout) {
            v = 1;
        }
        this.onAnchorReady(recyclerView$Recycler0, recyclerView$State0, q02, v);
        this.detachAndScrapAttachedViews(recyclerView$Recycler0);
        r0 r00 = this.mLayoutState;
        r00.l = this.resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.i = 0;
        q0 q03 = this.mAnchorInfo;
        if(q03.d) {
            this.q(q03.b, q03.c);
            this.mLayoutState.h = v13;
            this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false);
            v20 = this.mLayoutState.b;
            int v21 = this.mLayoutState.d;
            int v22 = this.mLayoutState.c;
            if(v22 > 0) {
                v15 += v22;
            }
            this.p(this.mAnchorInfo.b, this.mAnchorInfo.c);
            this.mLayoutState.h = v15;
            this.mLayoutState.d += this.mLayoutState.e;
            this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false);
            v23 = this.mLayoutState.b;
            int v24 = this.mLayoutState.c;
            if(v24 > 0) {
                this.q(v21, v20);
                this.mLayoutState.h = v24;
                this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false);
                v20 = this.mLayoutState.b;
            }
        }
        else {
            this.p(q03.b, q03.c);
            this.mLayoutState.h = v15;
            this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false);
            v23 = this.mLayoutState.b;
            int v25 = this.mLayoutState.d;
            int v26 = this.mLayoutState.c;
            if(v26 > 0) {
                v13 += v26;
            }
            this.q(this.mAnchorInfo.b, this.mAnchorInfo.c);
            this.mLayoutState.h = v13;
            this.mLayoutState.d += this.mLayoutState.e;
            this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false);
            int v27 = this.mLayoutState.b;
            int v28 = this.mLayoutState.c;
            if(v28 > 0) {
                this.p(v25, v23);
                this.mLayoutState.h = v28;
                this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false);
                v23 = this.mLayoutState.b;
            }
            v20 = v27;
        }
        if(this.getChildCount() > 0) {
            if((this.mShouldReverseLayout ^ this.mStackFromEnd) == 0) {
                int v33 = this.h(v20, recyclerView$Recycler0, recyclerView$State0, true);
                v30 = v20 + v33;
                v31 = v23 + v33;
                v32 = this.g(v31, recyclerView$Recycler0, recyclerView$State0, false);
            }
            else {
                int v29 = this.g(v23, recyclerView$Recycler0, recyclerView$State0, true);
                v30 = v20 + v29;
                v31 = v23 + v29;
                v32 = this.h(v30, recyclerView$Recycler0, recyclerView$State0, false);
            }
            v20 = v30 + v32;
            v23 = v31 + v32;
        }
        if(recyclerView$State0.willRunPredictiveAnimations() && this.getChildCount() != 0 && !recyclerView$State0.isPreLayout() && this.supportsPredictiveItemAnimations()) {
            List list0 = recyclerView$Recycler0.getScrapList();
            int v34 = list0.size();
            int v35 = this.getPosition(this.getChildAt(0));
            int v37 = 0;
            int v38 = 0;
            for(int v36 = 0; v36 < v34; ++v36) {
                ViewHolder recyclerView$ViewHolder0 = (ViewHolder)list0.get(v36);
                if(!recyclerView$ViewHolder0.isRemoved()) {
                    if(recyclerView$ViewHolder0.getLayoutPosition() < v35 == this.mShouldReverseLayout) {
                        v38 += this.mOrientationHelper.getDecoratedMeasurement(recyclerView$ViewHolder0.itemView);
                    }
                    else {
                        v37 += this.mOrientationHelper.getDecoratedMeasurement(recyclerView$ViewHolder0.itemView);
                    }
                }
            }
            this.mLayoutState.k = list0;
            if(v37 > 0) {
                this.q(this.getPosition(this.j()), v20);
                this.mLayoutState.h = v37;
                this.mLayoutState.c = 0;
                this.mLayoutState.a(null);
                this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false);
            }
            if(v38 > 0) {
                this.p(this.getPosition(this.i()), v23);
                this.mLayoutState.h = v38;
                this.mLayoutState.c = 0;
                this.mLayoutState.a(null);
                this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false);
            }
            this.mLayoutState.k = null;
        }
        if(recyclerView$State0.isPreLayout()) {
            this.mAnchorInfo.d();
        }
        else {
            this.mOrientationHelper.onLayoutComplete();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(State recyclerView$State0) {
        super.onLayoutCompleted(recyclerView$State0);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = 0x80000000;
        this.mAnchorInfo.d();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.mPendingSavedState = (SavedState)parcelable0;
            if(this.mPendingScrollPosition != -1) {
                ((SavedState)parcelable0).a = -1;
            }
            this.requestLayout();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState linearLayoutManager$SavedState0 = this.mPendingSavedState;
        if(linearLayoutManager$SavedState0 != null) {
            return new SavedState(linearLayoutManager$SavedState0);
        }
        Parcelable parcelable0 = new SavedState();
        if(this.getChildCount() > 0) {
            this.ensureLayoutState();
            int v = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            parcelable0.c = v;
            if(v != 0) {
                View view0 = this.i();
                parcelable0.b = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view0);
                parcelable0.a = this.getPosition(view0);
                return parcelable0;
            }
            View view1 = this.j();
            parcelable0.a = this.getPosition(view1);
            parcelable0.b = this.mOrientationHelper.getDecoratedStart(view1) - this.mOrientationHelper.getStartAfterPadding();
            return parcelable0;
        }
        parcelable0.a = -1;
        return parcelable0;
    }

    public final void p(int v, int v1) {
        r0 r00 = this.mLayoutState;
        r00.c = this.mOrientationHelper.getEndAfterPadding() - v1;
        this.mLayoutState.e = this.mShouldReverseLayout ? -1 : 1;
        this.mLayoutState.d = v;
        this.mLayoutState.f = 1;
        this.mLayoutState.b = v1;
        this.mLayoutState.g = 0x80000000;
    }

    @Override  // androidx.recyclerview.widget.ItemTouchHelper$ViewDropHandler
    public void prepareForDrop(@NonNull View view0, @NonNull View view1, int v, int v1) {
        this.assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        this.ensureLayoutState();
        this.n();
        int v2 = this.getPosition(view0);
        int v3 = this.getPosition(view1);
        int v4 = v2 >= v3 ? -1 : 1;
        if(this.mShouldReverseLayout) {
            if(v4 == 1) {
                int v5 = this.mOrientationHelper.getEndAfterPadding();
                int v6 = this.mOrientationHelper.getDecoratedStart(view1);
                this.scrollToPositionWithOffset(v3, v5 - (this.mOrientationHelper.getDecoratedMeasurement(view0) + v6));
                return;
            }
            this.scrollToPositionWithOffset(v3, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view1));
            return;
        }
        if(v4 == -1) {
            this.scrollToPositionWithOffset(v3, this.mOrientationHelper.getDecoratedStart(view1));
            return;
        }
        this.scrollToPositionWithOffset(v3, this.mOrientationHelper.getDecoratedEnd(view1) - this.mOrientationHelper.getDecoratedMeasurement(view0));
    }

    public final void q(int v, int v1) {
        r0 r00 = this.mLayoutState;
        r00.c = v1 - this.mOrientationHelper.getStartAfterPadding();
        this.mLayoutState.d = v;
        this.mLayoutState.e = this.mShouldReverseLayout ? 1 : -1;
        this.mLayoutState.f = -1;
        this.mLayoutState.b = v1;
        this.mLayoutState.g = 0x80000000;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0;
    }

    public int scrollBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        if(this.getChildCount() != 0 && v != 0) {
            this.ensureLayoutState();
            this.mLayoutState.a = true;
            int v1 = v <= 0 ? -1 : 1;
            int v2 = Math.abs(v);
            this.o(v1, v2, true, recyclerView$State0);
            int v3 = this.mLayoutState.g;
            int v4 = this.fill(recyclerView$Recycler0, this.mLayoutState, recyclerView$State0, false) + v3;
            if(v4 < 0) {
                return 0;
            }
            if(v2 > v4) {
                v = v1 * v4;
            }
            this.mOrientationHelper.offsetChildren(-v);
            this.mLayoutState.j = v;
            return v;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.mOrientation == 1 ? 0 : this.scrollBy(v, recyclerView$Recycler0, recyclerView$State0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public void scrollToPosition(int v) {
        this.mPendingScrollPosition = v;
        this.mPendingScrollPositionOffset = 0x80000000;
        SavedState linearLayoutManager$SavedState0 = this.mPendingSavedState;
        if(linearLayoutManager$SavedState0 != null) {
            linearLayoutManager$SavedState0.a = -1;
        }
        this.requestLayout();
    }

    public void scrollToPositionWithOffset(int v, int v1) {
        this.mPendingScrollPosition = v;
        this.mPendingScrollPositionOffset = v1;
        SavedState linearLayoutManager$SavedState0 = this.mPendingSavedState;
        if(linearLayoutManager$SavedState0 != null) {
            linearLayoutManager$SavedState0.a = -1;
        }
        this.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.mOrientation == 0 ? 0 : this.scrollBy(v, recyclerView$Recycler0, recyclerView$State0);
    }

    public void setInitialPrefetchItemCount(int v) {
        this.mInitialPrefetchItemCount = v;
    }

    public void setOrientation(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation:" + v);
        }
        this.assertNotInLayoutOrScroll(null);
        if(v != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper orientationHelper0 = OrientationHelper.createOrientationHelper(this, v);
            this.mOrientationHelper = orientationHelper0;
            this.mAnchorInfo.a = orientationHelper0;
            this.mOrientation = v;
            this.requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        this.assertNotInLayoutOrScroll(null);
        if(z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        this.requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        this.assertNotInLayoutOrScroll(null);
        if(this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        this.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean shouldMeasureTwice() {
        return this.getHeightMode() != 0x40000000 && this.getWidthMode() != 0x40000000 && this.hasFlexibleChildInBothOrientations();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        LinearSmoothScroller linearSmoothScroller0 = new LinearSmoothScroller(recyclerView0.getContext());
        linearSmoothScroller0.setTargetPosition(v);
        this.startSmoothScroll(linearSmoothScroller0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d("LinearLayoutManager", "validating child count " + this.getChildCount());
        boolean z = true;
        if(this.getChildCount() < 1) {
            return;
        }
        int v = this.getPosition(this.getChildAt(0));
        int v1 = this.mOrientationHelper.getDecoratedStart(this.getChildAt(0));
        if(this.mShouldReverseLayout) {
            int v2 = 1;
            while(v2 < this.getChildCount()) {
                View view0 = this.getChildAt(v2);
                int v3 = this.getPosition(view0);
                int v4 = this.mOrientationHelper.getDecoratedStart(view0);
                if(v3 < v) {
                    this.k();
                    StringBuilder stringBuilder0 = new StringBuilder("detected invalid position. loc invalid? ");
                    if(v4 >= v1) {
                        z = false;
                    }
                    stringBuilder0.append(z);
                    throw new RuntimeException(stringBuilder0.toString());
                }
                if(v4 <= v1) {
                    ++v2;
                    continue;
                }
                this.k();
                throw new RuntimeException("detected invalid location");
            }
        }
        else {
            int v5 = 1;
            while(v5 < this.getChildCount()) {
                View view1 = this.getChildAt(v5);
                int v6 = this.getPosition(view1);
                int v7 = this.mOrientationHelper.getDecoratedStart(view1);
                if(v6 < v) {
                    this.k();
                    StringBuilder stringBuilder1 = new StringBuilder("detected invalid position. loc invalid? ");
                    if(v7 >= v1) {
                        z = false;
                    }
                    stringBuilder1.append(z);
                    throw new RuntimeException(stringBuilder1.toString());
                }
                if(v7 >= v1) {
                    ++v5;
                    continue;
                }
                this.k();
                throw new RuntimeException("detected invalid location");
            }
        }
    }
}

