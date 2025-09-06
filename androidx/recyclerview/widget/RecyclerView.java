package androidx.recyclerview.widget;

import a5.b;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R.attr;
import androidx.recyclerview.R.dimen;
import androidx.recyclerview.R.styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import jeb.synthetic.FIN;
import kotlin.text.q;
import r0.a;

public class RecyclerView extends ViewGroup implements NestedScrollingChild2, NestedScrollingChild3, ScrollingView {
    public static abstract class Adapter {
        public static enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT;

        }

        private boolean mHasStableIds;
        private final m1 mObservable;
        private StateRestorationPolicy mStateRestorationPolicy;

        public Adapter() {
            this.mObservable = new m1();  // 初始化器: Landroid/database/Observable;-><init>()V
            this.mHasStableIds = false;
            this.mStateRestorationPolicy = StateRestorationPolicy.ALLOW;
        }

        public final void bindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
            boolean z = recyclerView$ViewHolder0.mBindingAdapter == null;
            if(z) {
                recyclerView$ViewHolder0.mPosition = v;
                if(this.hasStableIds()) {
                    recyclerView$ViewHolder0.mItemId = this.getItemId(v);
                }
                recyclerView$ViewHolder0.setFlags(1, 0x207);
                TraceCompat.beginSection("RV OnBindView");
            }
            recyclerView$ViewHolder0.mBindingAdapter = this;
            if(RecyclerView.sDebugAssertionsEnabled) {
                if(recyclerView$ViewHolder0.itemView.getParent() == null && ViewCompat.isAttachedToWindow(recyclerView$ViewHolder0.itemView) != recyclerView$ViewHolder0.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + recyclerView$ViewHolder0.isTmpDetached() + ", attached to window: " + ViewCompat.isAttachedToWindow(recyclerView$ViewHolder0.itemView) + ", holder: " + recyclerView$ViewHolder0);
                }
                if(recyclerView$ViewHolder0.itemView.getParent() == null && ViewCompat.isAttachedToWindow(recyclerView$ViewHolder0.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + recyclerView$ViewHolder0);
                }
            }
            this.onBindViewHolder(recyclerView$ViewHolder0, v, recyclerView$ViewHolder0.getUnmodifiedPayloads());
            if(z) {
                recyclerView$ViewHolder0.clearPayload();
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$ViewHolder0.itemView.getLayoutParams();
                if(viewGroup$LayoutParams0 instanceof LayoutParams) {
                    ((LayoutParams)viewGroup$LayoutParams0).c = true;
                }
                TraceCompat.endSection();
            }
        }

        public boolean canRestoreState() {
            switch(l1.a[this.mStateRestorationPolicy.ordinal()]) {
                case 1: {
                    return false;
                }
                case 2: {
                    return this.getItemCount() > 0;
                }
                default: {
                    return true;
                }
            }
        }

        @NonNull
        public final ViewHolder createViewHolder(@NonNull ViewGroup viewGroup0, int v) {
            try {
                TraceCompat.beginSection("RV CreateView");
                ViewHolder recyclerView$ViewHolder0 = this.onCreateViewHolder(viewGroup0, v);
                if(recyclerView$ViewHolder0.itemView.getParent() == null) {
                    recyclerView$ViewHolder0.mItemViewType = v;
                    return recyclerView$ViewHolder0;
                }
            }
            finally {
                TraceCompat.endSection();
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter recyclerView$Adapter0, @NonNull ViewHolder recyclerView$ViewHolder0, int v) {
            return recyclerView$Adapter0 == this ? v : -1;
        }

        public abstract int getItemCount();

        public long getItemId(int v) {
            return -1L;
        }

        public int getItemViewType(int v) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int v) {
            this.mObservable.d(v, 1, null);
        }

        public final void notifyItemChanged(int v, @Nullable Object object0) {
            this.mObservable.d(v, 1, object0);
        }

        public final void notifyItemInserted(int v) {
            this.mObservable.e(v, 1);
        }

        public final void notifyItemMoved(int v, int v1) {
            this.mObservable.c(v, v1);
        }

        public final void notifyItemRangeChanged(int v, int v1) {
            this.mObservable.d(v, v1, null);
        }

        public final void notifyItemRangeChanged(int v, int v1, @Nullable Object object0) {
            this.mObservable.d(v, v1, object0);
        }

        public final void notifyItemRangeInserted(int v, int v1) {
            this.mObservable.e(v, v1);
        }

        public final void notifyItemRangeRemoved(int v, int v1) {
            this.mObservable.f(v, v1);
        }

        public final void notifyItemRemoved(int v) {
            this.mObservable.f(v, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView0) {
        }

        public abstract void onBindViewHolder(@NonNull ViewHolder arg1, int arg2);

        public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v, @NonNull List list0) {
            this.onBindViewHolder(recyclerView$ViewHolder0, v);
        }

        @NonNull
        public abstract ViewHolder onCreateViewHolder(@NonNull ViewGroup arg1, int arg2);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView0) {
        }

        public boolean onFailedToRecycleView(@NonNull ViewHolder recyclerView$ViewHolder0) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public void onViewDetachedFromWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public void onViewRecycled(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver recyclerView$AdapterDataObserver0) {
            this.mObservable.registerObserver(recyclerView$AdapterDataObserver0);
        }

        public void setHasStableIds(boolean z) {
            if(this.hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0) {
            this.mStateRestorationPolicy = recyclerView$Adapter$StateRestorationPolicy0;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver recyclerView$AdapterDataObserver0) {
            this.mObservable.unregisterObserver(recyclerView$AdapterDataObserver0);
        }
    }

    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }

        public void onItemRangeChanged(int v, int v1) {
        }

        public void onItemRangeChanged(int v, int v1, @Nullable Object object0) {
            this.onItemRangeChanged(v, v1);
        }

        public void onItemRangeInserted(int v, int v1) {
        }

        public void onItemRangeMoved(int v, int v1, int v2) {
        }

        public void onItemRangeRemoved(int v, int v1) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int arg1, int arg2);
    }

    public static class EdgeEffectFactory {
        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        @NonNull
        public EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView0, int v) {
            return new EdgeEffect(recyclerView0.getContext());
        }
    }

    public static abstract class ItemAnimator {
        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        interface ItemAnimatorListener {
            void onAnimationFinished(@NonNull ViewHolder arg1);
        }

        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder recyclerView$ViewHolder0) {
                return this.setFrom(recyclerView$ViewHolder0, 0);
            }

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
                this.left = recyclerView$ViewHolder0.itemView.getLeft();
                this.top = recyclerView$ViewHolder0.itemView.getTop();
                this.right = recyclerView$ViewHolder0.itemView.getRight();
                this.bottom = recyclerView$ViewHolder0.itemView.getBottom();
                return this;
            }
        }

        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 0x1000;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 0x800;
        public static final int FLAG_REMOVED = 8;
        public ItemAnimatorListener a;
        public final ArrayList b;
        public long c;
        public long d;
        public long e;
        public long f;

        public ItemAnimator() {
            this.a = null;
            this.b = new ArrayList();
            this.c = 120L;
            this.d = 120L;
            this.e = 0xFAL;
            this.f = 0xFAL;
        }

        public static int a(ViewHolder recyclerView$ViewHolder0) {
            int v = recyclerView$ViewHolder0.mFlags;
            if(recyclerView$ViewHolder0.isInvalid()) {
                return 4;
            }
            if((v & 4) == 0) {
                int v1 = recyclerView$ViewHolder0.getOldPosition();
                int v2 = recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
                return v1 == -1 || v2 == -1 || v1 == v2 ? v & 14 : v & 14 | 0x800;
            }
            return v & 14;
        }

        public abstract boolean animateAppearance(@NonNull ViewHolder arg1, @Nullable ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);

        public abstract boolean animateChange(@NonNull ViewHolder arg1, @NonNull ViewHolder arg2, @NonNull ItemHolderInfo arg3, @NonNull ItemHolderInfo arg4);

        public abstract boolean animateDisappearance(@NonNull ViewHolder arg1, @NonNull ItemHolderInfo arg2, @Nullable ItemHolderInfo arg3);

        public abstract boolean animatePersistence(@NonNull ViewHolder arg1, @NonNull ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0) {
            return true;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull List list0) {
            return this.canReuseUpdatedViewHolder(recyclerView$ViewHolder0);
        }

        public final void dispatchAnimationFinished(@NonNull ViewHolder recyclerView$ViewHolder0) {
            ItemAnimatorListener recyclerView$ItemAnimator$ItemAnimatorListener0 = this.a;
            if(recyclerView$ItemAnimator$ItemAnimatorListener0 != null) {
                recyclerView$ItemAnimator$ItemAnimatorListener0.onAnimationFinished(recyclerView$ViewHolder0);
            }
        }

        public final void dispatchAnimationStarted(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public final void dispatchAnimationsFinished() {
            ArrayList arrayList0 = this.b;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((ItemAnimatorFinishedListener)arrayList0.get(v1)).onAnimationsFinished();
            }
            arrayList0.clear();
        }

        public abstract void endAnimation(@NonNull ViewHolder arg1);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.c;
        }

        public long getChangeDuration() {
            return this.f;
        }

        public long getMoveDuration() {
            return this.e;
        }

        public long getRemoveDuration() {
            return this.d;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@Nullable ItemAnimatorFinishedListener recyclerView$ItemAnimator$ItemAnimatorFinishedListener0) {
            boolean z = this.isRunning();
            if(recyclerView$ItemAnimator$ItemAnimatorFinishedListener0 != null) {
                if(!z) {
                    recyclerView$ItemAnimator$ItemAnimatorFinishedListener0.onAnimationsFinished();
                    return false;
                }
                this.b.add(recyclerView$ItemAnimator$ItemAnimatorFinishedListener0);
            }
            return z;
        }

        @NonNull
        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public void onAnimationFinished(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        public void onAnimationStarted(@NonNull ViewHolder recyclerView$ViewHolder0) {
        }

        @NonNull
        public ItemHolderInfo recordPostLayoutInformation(@NonNull State recyclerView$State0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            return this.obtainHolderInfo().setFrom(recyclerView$ViewHolder0);
        }

        @NonNull
        public ItemHolderInfo recordPreLayoutInformation(@NonNull State recyclerView$State0, @NonNull ViewHolder recyclerView$ViewHolder0, int v, @NonNull List list0) {
            return this.obtainHolderInfo().setFrom(recyclerView$ViewHolder0);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long v) {
            this.c = v;
        }

        public void setChangeDuration(long v) {
            this.f = v;
        }

        public void setMoveDuration(long v) {
            this.e = v;
        }

        public void setRemoveDuration(long v) {
            this.d = v;
        }
    }

    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect0, int v, @NonNull RecyclerView recyclerView0) {
            rect0.set(0, 0, 0, 0);
        }

        public void getItemOffsets(@NonNull Rect rect0, @NonNull View view0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
            this.getItemOffsets(rect0, ((LayoutParams)view0.getLayoutParams()).getViewLayoutPosition(), recyclerView0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0) {
        }

        public void onDraw(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0) {
        }

        public void onDrawOver(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        }
    }

    public static abstract class LayoutManager {
        public interface LayoutPrefetchRegistry {
            void addPosition(int arg1, int arg2);
        }

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;

        }

        boolean mAutoMeasure;
        j mChildHelper;
        private int mHeight;
        private int mHeightMode;
        h2 mHorizontalBoundCheck;
        private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        @Nullable
        SmoothScroller mSmoothScroller;
        h2 mVerticalBoundCheck;
        private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public LayoutManager() {
            o1 o10 = new o1(this);
            this.mHorizontalBoundCheckCallback = o10;
            p1 p10 = new p1(this);
            this.mVerticalBoundCheckCallback = p10;
            this.mHorizontalBoundCheck = new h2(o10);
            this.mVerticalBoundCheck = new h2(p10);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public final void a(View view0, int v, boolean z) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(z || recyclerView$ViewHolder0.isRemoved()) {
                SimpleArrayMap simpleArrayMap0 = this.mRecyclerView.mViewInfoStore.a;
                i2 i20 = (i2)simpleArrayMap0.get(recyclerView$ViewHolder0);
                if(i20 == null) {
                    i20 = i2.a();
                    simpleArrayMap0.put(recyclerView$ViewHolder0, i20);
                }
                i20.a |= 1;
            }
            else {
                this.mRecyclerView.mViewInfoStore.c(recyclerView$ViewHolder0);
            }
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(recyclerView$ViewHolder0.wasReturnedFromScrap() || recyclerView$ViewHolder0.isScrap()) {
                if(recyclerView$ViewHolder0.isScrap()) {
                    recyclerView$ViewHolder0.unScrap();
                }
                else {
                    recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.a(view0, v, view0.getLayoutParams(), false);
            }
            else if(view0.getParent() == this.mRecyclerView) {
                int v1 = this.mChildHelper.e(view0);
                if(v == -1) {
                    v = this.mChildHelper.c();
                }
                if(v1 == -1) {
                    StringBuilder stringBuilder0 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    stringBuilder0.append(this.mRecyclerView.indexOfChild(view0));
                    throw new IllegalStateException(b.h(this.mRecyclerView, stringBuilder0));
                }
                else if(v1 != v) {
                    this.mRecyclerView.mLayout.moveView(v1, v);
                }
            }
            else {
                j j0 = this.mChildHelper;
                int v2 = v >= 0 ? j0.d(v) : j0.a.a.getChildCount();
                j0.b.e(v2, false);
                j0.a.addView(view0, v2);
                recyclerView$LayoutParams0.c = true;
                if(this.mSmoothScroller != null && this.mSmoothScroller.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view0);
                }
            }
            if(recyclerView$LayoutParams0.d) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + recyclerView$LayoutParams0.a);
                }
                recyclerView$ViewHolder0.itemView.invalidate();
                recyclerView$LayoutParams0.d = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view0) {
            this.addDisappearingView(view0, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view0, int v) {
            this.a(view0, v, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view0) {
            this.addView(view0, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view0, int v) {
            this.a(view0, v, false);
        }

        public void assertInLayoutOrScroll(String s) {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 != null) {
                recyclerView0.assertInLayoutOrScroll(s);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String s) {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 != null) {
                recyclerView0.assertNotInLayoutOrScroll(s);
            }
        }

        public void attachView(@NonNull View view0) {
            this.attachView(view0, -1);
        }

        public void attachView(@NonNull View view0, int v) {
            this.attachView(view0, v, ((LayoutParams)view0.getLayoutParams()));
        }

        public void attachView(@NonNull View view0, int v, LayoutParams recyclerView$LayoutParams0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0.isRemoved()) {
                SimpleArrayMap simpleArrayMap0 = this.mRecyclerView.mViewInfoStore.a;
                i2 i20 = (i2)simpleArrayMap0.get(recyclerView$ViewHolder0);
                if(i20 == null) {
                    i20 = i2.a();
                    simpleArrayMap0.put(recyclerView$ViewHolder0, i20);
                }
                i20.a |= 1;
            }
            else {
                this.mRecyclerView.mViewInfoStore.c(recyclerView$ViewHolder0);
            }
            this.mChildHelper.a(view0, v, recyclerView$LayoutParams0, recyclerView$ViewHolder0.isRemoved());
        }

        public static boolean b(int v, int v1, int v2) {
            int v3 = View.MeasureSpec.getMode(v1);
            int v4 = View.MeasureSpec.getSize(v1);
            if(v2 > 0 && v != v2) {
                return false;
            }
            switch(v3) {
                case 0x80000000: {
                    return v4 >= v;
                }
                case 0: {
                    return true;
                }
                default: {
                    return v3 == 0x40000000 ? v4 == v : false;
                }
            }
        }

        public final void c(Recycler recyclerView$Recycler0, int v, View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0.shouldIgnore()) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "ignoring view " + recyclerView$ViewHolder0);
                }
                return;
            }
            if(recyclerView$ViewHolder0.isInvalid() && !recyclerView$ViewHolder0.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                this.removeViewAt(v);
                recyclerView$Recycler0.h(recyclerView$ViewHolder0);
                return;
            }
            this.detachViewAt(v);
            recyclerView$Recycler0.i(view0);
            this.mRecyclerView.mViewInfoStore.c(recyclerView$ViewHolder0);
        }

        public void calculateItemDecorationsForChild(@NonNull View view0, @NonNull Rect rect0) {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 == null) {
                rect0.set(0, 0, 0, 0);
                return;
            }
            rect0.set(recyclerView0.getItemDecorInsetsForChild(view0));
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams recyclerView$LayoutParams0) {
            return recyclerView$LayoutParams0 != null;
        }

        public static int chooseSize(int v, int v1, int v2) {
            int v3 = View.MeasureSpec.getMode(v);
            int v4 = View.MeasureSpec.getSize(v);
            switch(v3) {
                case 0x80000000: {
                    return Math.min(v4, Math.max(v1, v2));
                }
                case 0x40000000: {
                    return v4;
                }
                default: {
                    return Math.max(v1, v2);
                }
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int v, int v1, State recyclerView$State0, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int v, LayoutPrefetchRegistry recyclerView$LayoutManager$LayoutPrefetchRegistry0) {
        }

        public int computeHorizontalScrollExtent(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull State recyclerView$State0) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull State recyclerView$State0) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recyclerView$Recycler0) {
            for(int v = this.getChildCount() - 1; v >= 0; --v) {
                this.c(recyclerView$Recycler0, v, this.getChildAt(v));
            }
        }

        public void detachAndScrapView(@NonNull View view0, @NonNull Recycler recyclerView$Recycler0) {
            this.c(recyclerView$Recycler0, this.mChildHelper.e(view0), view0);
        }

        public void detachAndScrapViewAt(int v, @NonNull Recycler recyclerView$Recycler0) {
            this.c(recyclerView$Recycler0, v, this.getChildAt(v));
        }

        public void detachView(@NonNull View view0) {
            int v = this.mChildHelper.e(view0);
            if(v >= 0) {
                j j0 = this.mChildHelper;
                int v1 = j0.d(v);
                j0.b.f(v1);
                j0.a.detachViewFromParent(v1);
            }
        }

        public void detachViewAt(int v) {
            this.getChildAt(v);
            j j0 = this.mChildHelper;
            int v1 = j0.d(v);
            j0.b.f(v1);
            j0.a.detachViewFromParent(v1);
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView0) {
            this.mIsAttachedToWindow = true;
            this.onAttachedToWindow(recyclerView0);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
            this.mIsAttachedToWindow = false;
            this.onDetachedFromWindow(recyclerView0, recyclerView$Recycler0);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view0) {
            ItemAnimator recyclerView$ItemAnimator0 = this.mRecyclerView.mItemAnimator;
            if(recyclerView$ItemAnimator0 != null) {
                recyclerView$ItemAnimator0.endAnimation(RecyclerView.getChildViewHolderInt(view0));
            }
        }

        @Nullable
        public View findContainingItemView(@NonNull View view0) {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 == null) {
                return null;
            }
            View view1 = recyclerView0.findContainingItemView(view0);
            if(view1 == null) {
                return null;
            }
            return this.mChildHelper.c.contains(view1) ? null : view1;
        }

        @Nullable
        public View findViewByPosition(int v) {
            int v1 = this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = this.getChildAt(v2);
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                if(recyclerView$ViewHolder0 != null && recyclerView$ViewHolder0.getLayoutPosition() == v && !recyclerView$ViewHolder0.shouldIgnore() && (this.mRecyclerView.mState.isPreLayout() || !recyclerView$ViewHolder0.isRemoved())) {
                    return view0;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context0, AttributeSet attributeSet0) {
            return new LayoutParams(context0, attributeSet0);
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            if(viewGroup$LayoutParams0 instanceof LayoutParams) {
                return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
            }
            return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
        }

        public int getBaseline() [...] // Inlined contents

        public int getBottomDecorationHeight(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).b.bottom;
        }

        @Nullable
        public View getChildAt(int v) {
            return this.mChildHelper == null ? null : this.mChildHelper.b(v);
        }

        public int getChildCount() {
            return this.mChildHelper == null ? 0 : this.mChildHelper.c();
        }

        public static int getChildMeasureSpec(int v, int v1, int v2, int v3, boolean z) {
            int v4 = Math.max(0, v - v2);
            if(z) {
                if(v3 < 0) {
                    return v3 == -1 && (v1 == 0x80000000 || v1 == 0x40000000) ? View.MeasureSpec.makeMeasureSpec(v4, v1) : 0;
                }
            }
            else if(v3 < 0) {
                switch(v3) {
                    case -2: {
                        return v1 == 0x80000000 || v1 == 0x40000000 ? View.MeasureSpec.makeMeasureSpec(v4, 0x80000000) : View.MeasureSpec.makeMeasureSpec(v4, 0);
                    }
                    case -1: {
                        return View.MeasureSpec.makeMeasureSpec(v4, v1);
                    }
                    default: {
                        return 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
        }

        @Deprecated
        public static int getChildMeasureSpec(int v, int v1, int v2, boolean z) {
            int v3 = Math.max(0, v - v1);
            if(z) {
                return v2 < 0 ? 0 : View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
            }
            if(v2 < 0) {
                switch(v2) {
                    case -2: {
                        return View.MeasureSpec.makeMeasureSpec(v3, 0x80000000);
                    }
                    case -1: {
                        return View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
                    }
                    default: {
                        return 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        }

        public boolean getClipToPadding() {
            return this.mRecyclerView != null && this.mRecyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view0) {
            int v = view0.getBottom();
            return this.getBottomDecorationHeight(view0) + v;
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view0, @NonNull Rect rect0) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view0, rect0);
        }

        public int getDecoratedLeft(@NonNull View view0) {
            return view0.getLeft() - this.getLeftDecorationWidth(view0);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view0) {
            Rect rect0 = ((LayoutParams)view0.getLayoutParams()).b;
            return view0.getMeasuredHeight() + rect0.top + rect0.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view0) {
            Rect rect0 = ((LayoutParams)view0.getLayoutParams()).b;
            return view0.getMeasuredWidth() + rect0.left + rect0.right;
        }

        public int getDecoratedRight(@NonNull View view0) {
            int v = view0.getRight();
            return this.getRightDecorationWidth(view0) + v;
        }

        public int getDecoratedTop(@NonNull View view0) {
            return view0.getTop() - this.getTopDecorationHeight(view0);
        }

        @Nullable
        public View getFocusedChild() {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 == null) {
                return null;
            }
            View view0 = recyclerView0.getFocusedChild();
            return view0 == null || this.mChildHelper.c.contains(view0) ? null : view0;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            Adapter recyclerView$Adapter0 = this.mRecyclerView == null ? null : this.mRecyclerView.getAdapter();
            return recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount();
        }

        public int getItemViewType(@NonNull View view0) {
            return RecyclerView.getChildViewHolderInt(view0).getItemViewType();
        }

        public int getLayoutDirection() {
            return ViewCompat.getLayoutDirection(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).b.left;
        }

        @Px
        public int getMinimumHeight() {
            return ViewCompat.getMinimumHeight(this.mRecyclerView);
        }

        @Px
        public int getMinimumWidth() {
            return ViewCompat.getMinimumWidth(this.mRecyclerView);
        }

        @Px
        public int getPaddingBottom() {
            return this.mRecyclerView == null ? 0 : this.mRecyclerView.getPaddingBottom();
        }

        @Px
        public int getPaddingEnd() {
            return this.mRecyclerView == null ? 0 : ViewCompat.getPaddingEnd(this.mRecyclerView);
        }

        @Px
        public int getPaddingLeft() {
            return this.mRecyclerView == null ? 0 : this.mRecyclerView.getPaddingLeft();
        }

        @Px
        public int getPaddingRight() {
            return this.mRecyclerView == null ? 0 : this.mRecyclerView.getPaddingRight();
        }

        @Px
        public int getPaddingStart() {
            return this.mRecyclerView == null ? 0 : ViewCompat.getPaddingStart(this.mRecyclerView);
        }

        @Px
        public int getPaddingTop() {
            return this.mRecyclerView == null ? 0 : this.mRecyclerView.getPaddingTop();
        }

        public int getPosition(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).getViewLayoutPosition();
        }

        public static Properties getProperties(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
            Properties recyclerView$LayoutManager$Properties0 = new Properties();
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RecyclerView, v, v1);
            recyclerView$LayoutManager$Properties0.orientation = typedArray0.getInt(styleable.RecyclerView_android_orientation, 1);
            recyclerView$LayoutManager$Properties0.spanCount = typedArray0.getInt(styleable.RecyclerView_spanCount, 1);
            recyclerView$LayoutManager$Properties0.reverseLayout = typedArray0.getBoolean(styleable.RecyclerView_reverseLayout, false);
            recyclerView$LayoutManager$Properties0.stackFromEnd = typedArray0.getBoolean(styleable.RecyclerView_stackFromEnd, false);
            typedArray0.recycle();
            return recyclerView$LayoutManager$Properties0;
        }

        public int getRightDecorationWidth(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).b.right;
        }

        public int getRowCountForAccessibility(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) [...] // Inlined contents

        public int getTopDecorationHeight(@NonNull View view0) {
            return ((LayoutParams)view0.getLayoutParams()).b.top;
        }

        public void getTransformedBoundingBox(@NonNull View view0, boolean z, @NonNull Rect rect0) {
            if(z) {
                Rect rect1 = ((LayoutParams)view0.getLayoutParams()).b;
                rect0.set(-rect1.left, -rect1.top, view0.getWidth() + rect1.right, view0.getHeight() + rect1.bottom);
            }
            else {
                rect0.set(0, 0, view0.getWidth(), view0.getHeight());
            }
            if(this.mRecyclerView != null) {
                Matrix matrix0 = view0.getMatrix();
                if(matrix0 != null && !matrix0.isIdentity()) {
                    RectF rectF0 = this.mRecyclerView.mTempRectF;
                    rectF0.set(rect0);
                    matrix0.mapRect(rectF0);
                    rect0.set(((int)Math.floor(rectF0.left)), ((int)Math.floor(rectF0.top)), ((int)Math.ceil(rectF0.right)), ((int)Math.ceil(rectF0.bottom)));
                }
            }
            rect0.offset(view0.getLeft(), view0.getTop());
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getChildAt(v1).getLayoutParams();
                if(viewGroup$LayoutParams0.width < 0 && viewGroup$LayoutParams0.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            return this.mRecyclerView != null && this.mRecyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view0) {
            if(view0.getParent() == this.mRecyclerView && this.mRecyclerView.indexOfChild(view0) != -1) {
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                recyclerView$ViewHolder0.addFlags(0x80);
                this.mRecyclerView.mViewInfoStore.d(recyclerView$ViewHolder0);
                return;
            }
            StringBuilder stringBuilder0 = new StringBuilder("View should be fully attached to be ignored");
            throw new IllegalArgumentException(b.h(this.mRecyclerView, stringBuilder0));
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            return this.mRecyclerView != null && this.mRecyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) [...] // Inlined contents

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            return this.mSmoothScroller != null && this.mSmoothScroller.isRunning();
        }

        // 去混淆评级： 低(20)
        public boolean isViewPartiallyVisible(@NonNull View view0, boolean z, boolean z1) {
            boolean z2 = this.mHorizontalBoundCheck.b(view0) && this.mVerticalBoundCheck.b(view0);
            return z ? z2 : !z2;
        }

        public void layoutDecorated(@NonNull View view0, int v, int v1, int v2, int v3) {
            Rect rect0 = ((LayoutParams)view0.getLayoutParams()).b;
            view0.layout(v + rect0.left, v1 + rect0.top, v2 - rect0.right, v3 - rect0.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view0, int v, int v1, int v2, int v3) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            view0.layout(v + recyclerView$LayoutParams0.b.left + recyclerView$LayoutParams0.leftMargin, v1 + recyclerView$LayoutParams0.b.top + recyclerView$LayoutParams0.topMargin, v2 - recyclerView$LayoutParams0.b.right - recyclerView$LayoutParams0.rightMargin, v3 - recyclerView$LayoutParams0.b.bottom - recyclerView$LayoutParams0.bottomMargin);
        }

        public void measureChild(@NonNull View view0, int v, int v1) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Rect rect0 = this.mRecyclerView.getItemDecorInsetsForChild(view0);
            int v2 = rect0.left + rect0.right + v;
            int v3 = rect0.top + rect0.bottom + v1;
            int v4 = this.getPaddingLeft();
            int v5 = LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingRight() + v4 + v2, recyclerView$LayoutParams0.width, this.canScrollHorizontally());
            int v6 = this.getPaddingTop();
            int v7 = LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingBottom() + v6 + v3, recyclerView$LayoutParams0.height, this.canScrollVertically());
            if(this.shouldMeasureChild(view0, v5, v7, recyclerView$LayoutParams0)) {
                view0.measure(v5, v7);
            }
        }

        public void measureChildWithMargins(@NonNull View view0, int v, int v1) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Rect rect0 = this.mRecyclerView.getItemDecorInsetsForChild(view0);
            int v2 = rect0.left + rect0.right + v;
            int v3 = rect0.top + rect0.bottom + v1;
            int v4 = this.getPaddingLeft();
            int v5 = LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), this.getPaddingRight() + v4 + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin + v2, recyclerView$LayoutParams0.width, this.canScrollHorizontally());
            int v6 = this.getPaddingTop();
            int v7 = LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), this.getPaddingBottom() + v6 + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin + v3, recyclerView$LayoutParams0.height, this.canScrollVertically());
            if(this.shouldMeasureChild(view0, v5, v7, recyclerView$LayoutParams0)) {
                view0.measure(v5, v7);
            }
        }

        public void moveView(int v, int v1) {
            View view0 = this.getChildAt(v);
            if(view0 == null) {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + v + this.mRecyclerView.toString());
            }
            this.detachViewAt(v);
            this.attachView(view0, v1);
        }

        public void offsetChildrenHorizontal(@Px int v) {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 != null) {
                recyclerView0.offsetChildrenHorizontal(v);
            }
        }

        public void offsetChildrenVertical(@Px int v) {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 != null) {
                recyclerView0.offsetChildrenVertical(v);
            }
        }

        public void onAdapterChanged(@Nullable Adapter recyclerView$Adapter0, @Nullable Adapter recyclerView$Adapter1) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView0, @NonNull ArrayList arrayList0, int v, int v1) [...] // Inlined contents

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView0) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView0) {
        }

        @SuppressLint({"UnknownNullness"})
        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView0, Recycler recyclerView$Recycler0) {
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view0, int v, @NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent0) {
            this.onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityEvent0);
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityEvent accessibilityEvent0) {
            boolean z = true;
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 != null && accessibilityEvent0 != null) {
                if(!recyclerView0.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent0.setScrollable(z);
                Adapter recyclerView$Adapter0 = this.mRecyclerView.mAdapter;
                if(recyclerView$Adapter0 != null) {
                    accessibilityEvent0.setItemCount(recyclerView$Adapter0.getItemCount());
                }
            }
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            this.onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityNodeInfoCompat0);
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            if(this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat0.addAction(0x2000);
                accessibilityNodeInfoCompat0.setScrollable(true);
            }
            if(this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat0.addAction(0x1000);
                accessibilityNodeInfoCompat0.setScrollable(true);
            }
            accessibilityNodeInfoCompat0.setCollectionInfo(CollectionInfoCompat.obtain(this.getRowCountForAccessibility(recyclerView$Recycler0, recyclerView$State0), this.getColumnCountForAccessibility(recyclerView$Recycler0, recyclerView$State0), false, 0));
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.isRemoved() && !this.mChildHelper.c.contains(recyclerView$ViewHolder0.itemView)) {
                this.onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view0, accessibilityNodeInfoCompat0);
            }
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view0, int v) [...] // Inlined contents

        public void onItemsAdded(@NonNull RecyclerView recyclerView0, int v, int v1) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView0) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView0, int v, int v1, int v2) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView0, int v, int v1) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView0, int v, int v1) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView0, int v, int v1, @Nullable Object object0) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(Recycler recyclerView$Recycler0, State recyclerView$State0) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(State recyclerView$State0) {
        }

        public void onMeasure(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, int v, int v1) {
            this.mRecyclerView.defaultOnMeasure(v, v1);
        }

        // 去混淆评级： 低(20)
        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView0, @NonNull View view0, @Nullable View view1) {
            return this.isSmoothScrolling() || recyclerView0.isComputingLayout();
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0, @NonNull View view0, @Nullable View view1) {
            return this.onRequestChildFocus(recyclerView0, view0, view1);
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable0) {
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int v) {
        }

        public void onSmoothScrollerStopped(SmoothScroller recyclerView$SmoothScroller0) {
            if(this.mSmoothScroller == recyclerView$SmoothScroller0) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int v, @Nullable Bundle bundle0) {
            return this.performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, v, bundle0);
        }

        public boolean performAccessibilityAction(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, int v, @Nullable Bundle bundle0) {
            int v4;
            int v3;
            int v5;
            if(this.mRecyclerView == null) {
                return false;
            }
            int v1 = this.getHeight();
            int v2 = this.getWidth();
            Rect rect0 = new Rect();
            if(this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect0)) {
                v1 = rect0.height();
                v2 = rect0.width();
            }
            switch(v) {
                case 0x1000: {
                    v5 = this.mRecyclerView.canScrollVertically(1) ? v1 - this.getPaddingTop() - this.getPaddingBottom() : 0;
                    if(this.mRecyclerView.canScrollHorizontally(1)) {
                        v4 = v5;
                        v3 = v2 - this.getPaddingLeft() - this.getPaddingRight();
                    }
                    else {
                        v4 = v5;
                        v3 = 0;
                    }
                    break;
                }
                case 0x2000: {
                    v5 = this.mRecyclerView.canScrollVertically(-1) ? -(v1 - this.getPaddingTop() - this.getPaddingBottom()) : 0;
                    if(this.mRecyclerView.canScrollHorizontally(-1)) {
                        v4 = v5;
                        v3 = -(v2 - this.getPaddingLeft() - this.getPaddingRight());
                    }
                    else {
                        v4 = v5;
                        v3 = 0;
                    }
                    break;
                }
                default: {
                    v3 = 0;
                    v4 = 0;
                }
            }
            if(v4 == 0 && v3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(v3, v4, null, 0x80000000, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view0, int v, @Nullable Bundle bundle0) {
            return false;
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recyclerView$Recycler0, @NonNull State recyclerView$State0, @NonNull View view0, int v, @Nullable Bundle bundle0) [...] // Inlined contents

        public void postOnAnimation(Runnable runnable0) {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 != null) {
                ViewCompat.postOnAnimation(recyclerView0, runnable0);
            }
        }

        public void removeAllViews() {
            for(int v = this.getChildCount() - 1; v >= 0; --v) {
                this.mChildHelper.f(v);
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recyclerView$Recycler0) {
            for(int v = this.getChildCount() - 1; v >= 0; --v) {
                if(!RecyclerView.getChildViewHolderInt(this.getChildAt(v)).shouldIgnore()) {
                    this.removeAndRecycleViewAt(v, recyclerView$Recycler0);
                }
            }
        }

        public void removeAndRecycleScrapInt(Recycler recyclerView$Recycler0) {
            ArrayList arrayList0;
            int v = recyclerView$Recycler0.a.size();
            for(int v1 = v - 1; true; --v1) {
                arrayList0 = recyclerView$Recycler0.a;
                if(v1 < 0) {
                    break;
                }
                View view0 = ((ViewHolder)arrayList0.get(v1)).itemView;
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
                if(!recyclerView$ViewHolder0.shouldIgnore()) {
                    recyclerView$ViewHolder0.setIsRecyclable(false);
                    if(recyclerView$ViewHolder0.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view0, false);
                    }
                    ItemAnimator recyclerView$ItemAnimator0 = this.mRecyclerView.mItemAnimator;
                    if(recyclerView$ItemAnimator0 != null) {
                        recyclerView$ItemAnimator0.endAnimation(recyclerView$ViewHolder0);
                    }
                    recyclerView$ViewHolder0.setIsRecyclable(true);
                    ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(view0);
                    recyclerView$ViewHolder1.mScrapContainer = null;
                    recyclerView$ViewHolder1.mInChangeScrap = false;
                    recyclerView$ViewHolder1.clearReturnedFromScrapFlag();
                    recyclerView$Recycler0.h(recyclerView$ViewHolder1);
                }
            }
            arrayList0.clear();
            ArrayList arrayList1 = recyclerView$Recycler0.b;
            if(arrayList1 != null) {
                arrayList1.clear();
            }
            if(v > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view0, @NonNull Recycler recyclerView$Recycler0) {
            this.removeView(view0);
            recyclerView$Recycler0.recycleView(view0);
        }

        public void removeAndRecycleViewAt(int v, @NonNull Recycler recyclerView$Recycler0) {
            View view0 = this.getChildAt(v);
            this.removeViewAt(v);
            recyclerView$Recycler0.recycleView(view0);
        }

        public boolean removeCallbacks(Runnable runnable0) {
            return this.mRecyclerView == null ? false : this.mRecyclerView.removeCallbacks(runnable0);
        }

        public void removeDetachedView(@NonNull View view0) {
            this.mRecyclerView.removeDetachedView(view0, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view0) {
            j j0 = this.mChildHelper;
            j1 j10 = j0.a;
            switch(j0.d) {
                case 1: {
                    throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                }
                case 2: {
                    throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                }
                default: {
                    try {
                        j0.d = 1;
                        j0.e = view0;
                        int v1 = j10.a.indexOfChild(view0);
                        if(v1 >= 0) {
                            if(j0.b.f(v1)) {
                                j0.g(view0);
                            }
                            j10.removeViewAt(v1);
                        }
                    }
                    finally {
                        j0.d = 0;
                        j0.e = null;
                    }
                }
            }
        }

        public void removeViewAt(int v) {
            if(this.getChildAt(v) != null) {
                this.mChildHelper.f(v);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView0, @NonNull View view0, @NonNull Rect rect0, boolean z) {
            return this.requestChildRectangleOnScreen(recyclerView0, view0, rect0, z, false);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView0, @NonNull View view0, @NonNull Rect rect0, boolean z, boolean z1) {
            int v = this.getPaddingLeft();
            int v1 = this.getPaddingTop();
            int v2 = this.getPaddingRight();
            int v3 = this.getPaddingBottom();
            int v4 = view0.getLeft() + rect0.left - view0.getScrollX();
            int v5 = view0.getTop() + rect0.top - view0.getScrollY();
            int v6 = v4 - v;
            int v7 = Math.min(0, v6);
            int v8 = v5 - v1;
            int v9 = Math.min(0, v8);
            int v10 = rect0.width() + v4 - (this.getWidth() - v2);
            int v11 = Math.max(0, v10);
            int v12 = Math.max(0, rect0.height() + v5 - (this.getHeight() - v3));
            if(this.getLayoutDirection() != 1) {
                if(v7 == 0) {
                    v7 = Math.min(v6, v11);
                }
                v11 = v7;
            }
            else if(v11 == 0) {
                v11 = Math.max(v7, v10);
            }
            if(v9 == 0) {
                v9 = Math.min(v8, v12);
            }
            if(z1) {
                View view1 = recyclerView0.getFocusedChild();
                if(view1 == null) {
                    return false;
                }
                int v13 = this.getPaddingLeft();
                int v14 = this.getPaddingTop();
                int v15 = this.getPaddingRight();
                int v16 = this.getPaddingBottom();
                Rect rect1 = this.mRecyclerView.mTempRect;
                this.getDecoratedBoundsWithMargins(view1, rect1);
                if(rect1.left - v11 < this.getWidth() - v15 && rect1.right - v11 > v13 && rect1.top - v9 < this.getHeight() - v16 && rect1.bottom - v9 > v14) {
                    goto label_32;
                }
                return false;
            }
        label_32:
            if(v11 == 0 && v9 == 0) {
                return false;
            }
            if(z) {
                recyclerView0.scrollBy(v11, v9);
                return true;
            }
            recyclerView0.smoothScrollBy(v11, v9);
            return true;
        }

        public void requestLayout() {
            RecyclerView recyclerView0 = this.mRecyclerView;
            if(recyclerView0 != null) {
                recyclerView0.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
            return 0;
        }

        public void scrollToPosition(int v) {
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView0) {
            this.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView0.getWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(recyclerView0.getHeight(), 0x40000000));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if(z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView0 = this.mRecyclerView;
                if(recyclerView0 != null) {
                    recyclerView0.mRecycler.m();
                }
            }
        }

        public void setMeasureSpecs(int v, int v1) {
            this.mWidth = View.MeasureSpec.getSize(v);
            int v2 = View.MeasureSpec.getMode(v);
            this.mWidthMode = v2;
            if(v2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(v1);
            int v3 = View.MeasureSpec.getMode(v1);
            this.mHeightMode = v3;
            if(v3 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(int v, int v1) {
            this.mRecyclerView.setMeasuredDimension(v, v1);
        }

        public void setMeasuredDimension(Rect rect0, int v, int v1) {
            int v2 = rect0.width();
            int v3 = this.getPaddingLeft();
            int v4 = this.getPaddingRight();
            int v5 = rect0.height();
            int v6 = this.getPaddingTop();
            int v7 = this.getPaddingBottom();
            this.setMeasuredDimension(LayoutManager.chooseSize(v, v4 + (v3 + v2), this.getMinimumWidth()), LayoutManager.chooseSize(v1, v7 + (v6 + v5), this.getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int v, int v1) {
            int v2 = this.getChildCount();
            if(v2 == 0) {
                this.mRecyclerView.defaultOnMeasure(v, v1);
                return;
            }
            int v3 = 0x80000000;
            int v4 = 0x7FFFFFFF;
            int v6 = 0x80000000;
            int v7 = 0x7FFFFFFF;
            for(int v5 = 0; v5 < v2; ++v5) {
                View view0 = this.getChildAt(v5);
                Rect rect0 = this.mRecyclerView.mTempRect;
                this.getDecoratedBoundsWithMargins(view0, rect0);
                int v8 = rect0.left;
                if(v8 < v7) {
                    v7 = v8;
                }
                int v9 = rect0.right;
                if(v9 > v3) {
                    v3 = v9;
                }
                int v10 = rect0.top;
                if(v10 < v4) {
                    v4 = v10;
                }
                int v11 = rect0.bottom;
                if(v11 > v6) {
                    v6 = v11;
                }
            }
            this.mRecyclerView.mTempRect.set(v7, v4, v3, v6);
            this.setMeasuredDimension(this.mRecyclerView.mTempRect, v, v1);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView0) {
            if(recyclerView0 == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            }
            else {
                this.mRecyclerView = recyclerView0;
                this.mChildHelper = recyclerView0.mChildHelper;
                this.mWidth = recyclerView0.getWidth();
                this.mHeight = recyclerView0.getHeight();
            }
            this.mWidthMode = 0x40000000;
            this.mHeightMode = 0x40000000;
        }

        // 去混淆评级： 低(40)
        public boolean shouldMeasureChild(View view0, int v, int v1, LayoutParams recyclerView$LayoutParams0) {
            return view0.isLayoutRequested() || !this.mMeasurementCacheEnabled || !LayoutManager.b(view0.getWidth(), v, recyclerView$LayoutParams0.width) || !LayoutManager.b(view0.getHeight(), v1, recyclerView$LayoutParams0.height);
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        // 去混淆评级： 低(30)
        public boolean shouldReMeasureChild(View view0, int v, int v1, LayoutParams recyclerView$LayoutParams0) {
            return !this.mMeasurementCacheEnabled || !LayoutManager.b(view0.getMeasuredWidth(), v, recyclerView$LayoutParams0.width) || !LayoutManager.b(view0.getMeasuredHeight(), v1, recyclerView$LayoutParams0.height);
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView0, State recyclerView$State0, int v) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(SmoothScroller recyclerView$SmoothScroller0) {
            if(this.mSmoothScroller != null && recyclerView$SmoothScroller0 != this.mSmoothScroller && this.mSmoothScroller.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = recyclerView$SmoothScroller0;
            RecyclerView recyclerView0 = this.mRecyclerView;
            recyclerView$SmoothScroller0.getClass();
            recyclerView0.mViewFlinger.g.removeCallbacks(recyclerView0.mViewFlinger);
            recyclerView0.mViewFlinger.c.abortAnimation();
            if(recyclerView$SmoothScroller0.h) {
                Log.w("RecyclerView", "An instance of " + recyclerView$SmoothScroller0.getClass().getSimpleName() + " was started more than once. Each instance of" + recyclerView$SmoothScroller0.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            recyclerView$SmoothScroller0.b = recyclerView0;
            recyclerView$SmoothScroller0.c = this;
            int v = recyclerView$SmoothScroller0.a;
            if(v == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView0.mState.a = v;
            recyclerView$SmoothScroller0.e = true;
            recyclerView$SmoothScroller0.d = true;
            recyclerView$SmoothScroller0.f = recyclerView$SmoothScroller0.findViewByPosition(recyclerView$SmoothScroller0.getTargetPosition());
            recyclerView$SmoothScroller0.onStart();
            recyclerView$SmoothScroller0.b.mViewFlinger.b();
            recyclerView$SmoothScroller0.h = true;
        }

        public void stopIgnoringView(@NonNull View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            recyclerView$ViewHolder0.stopIgnoring();
            recyclerView$ViewHolder0.resetInternal();
            recyclerView$ViewHolder0.addFlags(4);
        }

        public void stopSmoothScroller() {
            SmoothScroller recyclerView$SmoothScroller0 = this.mSmoothScroller;
            if(recyclerView$SmoothScroller0 != null) {
                recyclerView$SmoothScroller0.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public ViewHolder a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public LayoutParams(LayoutParams recyclerView$LayoutParams0) {
            super(recyclerView$LayoutParams0);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.a.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.a.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.a.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.a.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.a.getPosition();
        }

        public boolean isItemChanged() {
            return this.a.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.a.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.a.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.a.needsUpdate();
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@NonNull View arg1);

        void onChildViewDetachedFromWindow(@NonNull View arg1);
    }

    public static abstract class OnFlingListener {
        public abstract boolean onFling(int arg1, int arg2);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@NonNull RecyclerView arg1, @NonNull MotionEvent arg2);

        void onRequestDisallowInterceptTouchEvent(boolean arg1);

        void onTouchEvent(@NonNull RecyclerView arg1, @NonNull MotionEvent arg2);
    }

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView0, int v) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView0, int v, int v1) {
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public static class RecycledViewPool {
        public final SparseArray a;
        public int b;
        public final Set c;

        public RecycledViewPool() {
            this.a = new SparseArray();
            this.b = 0;
            this.c = Collections.newSetFromMap(new IdentityHashMap());
        }

        public final q1 a(int v) {
            SparseArray sparseArray0 = this.a;
            q1 q10 = (q1)sparseArray0.get(v);
            if(q10 == null) {
                q10 = new q1();
                sparseArray0.put(v, q10);
            }
            return q10;
        }

        public void clear() {
            for(int v = 0; true; ++v) {
                SparseArray sparseArray0 = this.a;
                if(v >= sparseArray0.size()) {
                    break;
                }
                q1 q10 = (q1)sparseArray0.valueAt(v);
                for(Object object0: q10.a) {
                    PoolingContainer.callPoolingContainerOnRelease(((ViewHolder)object0).itemView);
                }
                q10.a.clear();
            }
        }

        @Nullable
        public ViewHolder getRecycledView(int v) {
            q1 q10 = (q1)this.a.get(v);
            if(q10 != null) {
                ArrayList arrayList0 = q10.a;
                if(!arrayList0.isEmpty()) {
                    for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                        if(!((ViewHolder)arrayList0.get(v1)).isAttachedToTransitionOverlay()) {
                            return (ViewHolder)arrayList0.remove(v1);
                        }
                    }
                }
            }
            return null;
        }

        public int getRecycledViewCount(int v) {
            return this.a(v).a.size();
        }

        public void putRecycledView(ViewHolder recyclerView$ViewHolder0) {
            int v = recyclerView$ViewHolder0.getItemViewType();
            ArrayList arrayList0 = this.a(v).a;
            if(((q1)this.a.get(v)).b <= arrayList0.size()) {
                PoolingContainer.callPoolingContainerOnRelease(recyclerView$ViewHolder0.itemView);
                return;
            }
            if(RecyclerView.sDebugAssertionsEnabled && arrayList0.contains(recyclerView$ViewHolder0)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            recyclerView$ViewHolder0.resetInternal();
            arrayList0.add(recyclerView$ViewHolder0);
        }

        public void setMaxRecycledViews(int v, int v1) {
            q1 q10 = this.a(v);
            q10.b = v1;
            ArrayList arrayList0 = q10.a;
            while(arrayList0.size() > v1) {
                arrayList0.remove(arrayList0.size() - 1);
            }
        }
    }

    public final class Recycler {
        public final ArrayList a;
        public ArrayList b;
        public final ArrayList c;
        public final List d;
        public int e;
        public int f;
        public RecycledViewPool g;
        public ViewCacheExtension h;
        public final RecyclerView i;

        public Recycler() {
            ArrayList arrayList0 = new ArrayList();
            this.a = arrayList0;
            this.b = null;
            this.c = new ArrayList();
            this.d = Collections.unmodifiableList(arrayList0);
            this.e = 2;
            this.f = 2;
        }

        public final void a(ViewHolder recyclerView$ViewHolder0, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(recyclerView$ViewHolder0);
            View view0 = recyclerView$ViewHolder0.itemView;
            RecyclerView recyclerView0 = RecyclerView.this;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0 = recyclerView0.mAccessibilityDelegate;
            if(recyclerViewAccessibilityDelegate0 != null) {
                AccessibilityDelegateCompat accessibilityDelegateCompat0 = recyclerViewAccessibilityDelegate0.getItemDelegate();
                ViewCompat.setAccessibilityDelegate(view0, (accessibilityDelegateCompat0 instanceof ItemDelegate ? ((AccessibilityDelegateCompat)((ItemDelegate)accessibilityDelegateCompat0).e.remove(view0)) : null));
            }
            if(z) {
                RecyclerListener recyclerView$RecyclerListener0 = recyclerView0.mRecyclerListener;
                if(recyclerView$RecyclerListener0 != null) {
                    recyclerView$RecyclerListener0.onViewRecycled(recyclerView$ViewHolder0);
                }
                int v = recyclerView0.mRecyclerListeners.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((RecyclerListener)recyclerView0.mRecyclerListeners.get(v1)).onViewRecycled(recyclerView$ViewHolder0);
                }
                Adapter recyclerView$Adapter0 = recyclerView0.mAdapter;
                if(recyclerView$Adapter0 != null) {
                    recyclerView$Adapter0.onViewRecycled(recyclerView$ViewHolder0);
                }
                if(recyclerView0.mState != null) {
                    recyclerView0.mViewInfoStore.d(recyclerView$ViewHolder0);
                }
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + recyclerView$ViewHolder0);
                }
            }
            recyclerView$ViewHolder0.mBindingAdapter = null;
            recyclerView$ViewHolder0.mOwnerRecyclerView = null;
            this.b().putRecycledView(recyclerView$ViewHolder0);
        }

        public final RecycledViewPool b() {
            if(this.g == null) {
                this.g = new RecycledViewPool();
                this.d();
            }
            return this.g;
        }

        public void bindViewToPosition(@NonNull View view0, int v) {
            LayoutParams recyclerView$LayoutParams0;
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView$ViewHolder0 == null) {
                throw new IllegalArgumentException(b.h(recyclerView0, new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter")));
            }
            boolean z = false;
            int v1 = recyclerView0.mAdapterHelper.f(v, 0);
            if(v1 >= 0 && v1 < recyclerView0.mAdapter.getItemCount()) {
                this.j(recyclerView$ViewHolder0, v1, v, 0x7FFFFFFFFFFFFFFFL);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$ViewHolder0.itemView.getLayoutParams();
                if(viewGroup$LayoutParams0 == null) {
                    recyclerView$LayoutParams0 = (LayoutParams)recyclerView0.generateDefaultLayoutParams();
                    recyclerView$ViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
                }
                else if(recyclerView0.checkLayoutParams(viewGroup$LayoutParams0)) {
                    recyclerView$LayoutParams0 = (LayoutParams)viewGroup$LayoutParams0;
                }
                else {
                    recyclerView$LayoutParams0 = (LayoutParams)recyclerView0.generateLayoutParams(viewGroup$LayoutParams0);
                    recyclerView$ViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
                }
                recyclerView$LayoutParams0.c = true;
                recyclerView$LayoutParams0.a = recyclerView$ViewHolder0;
                if(recyclerView$ViewHolder0.itemView.getParent() == null) {
                    z = true;
                }
                recyclerView$LayoutParams0.d = z;
                return;
            }
            StringBuilder stringBuilder0 = q.u("Inconsistency detected. Invalid item position ", v, "(offset:", v1, ").state:");
            stringBuilder0.append(recyclerView0.mState.getItemCount());
            stringBuilder0.append(recyclerView0.exceptionLabel());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }

        public static void c(ViewGroup viewGroup0, boolean z) {
            for(int v = viewGroup0.getChildCount() - 1; v >= 0; --v) {
                View view0 = viewGroup0.getChildAt(v);
                if(view0 instanceof ViewGroup) {
                    Recycler.c(((ViewGroup)view0), true);
                }
            }
            if(!z) {
                return;
            }
            if(viewGroup0.getVisibility() == 4) {
                viewGroup0.setVisibility(0);
                viewGroup0.setVisibility(4);
                return;
            }
            int v1 = viewGroup0.getVisibility();
            viewGroup0.setVisibility(4);
            viewGroup0.setVisibility(v1);
        }

        public void clear() {
            this.a.clear();
            this.f();
        }

        public int convertPreLayoutPositionToPostLayout(int v) {
            RecyclerView recyclerView0 = RecyclerView.this;
            if(v >= 0 && v < recyclerView0.mState.getItemCount()) {
                return recyclerView0.mState.isPreLayout() ? recyclerView0.mAdapterHelper.f(v, 0) : v;
            }
            StringBuilder stringBuilder0 = b.s(v, "invalid position ", ". State item count is ");
            stringBuilder0.append(recyclerView0.mState.getItemCount());
            stringBuilder0.append(recyclerView0.exceptionLabel());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }

        public final void d() {
            if(this.g != null) {
                RecyclerView recyclerView0 = RecyclerView.this;
                if(recyclerView0.mAdapter != null && recyclerView0.isAttachedToWindow()) {
                    this.g.c.add(recyclerView0.mAdapter);
                }
            }
        }

        public final void e(Adapter recyclerView$Adapter0, boolean z) {
            RecycledViewPool recyclerView$RecycledViewPool0 = this.g;
            if(recyclerView$RecycledViewPool0 != null) {
                recyclerView$RecycledViewPool0.c.remove(recyclerView$Adapter0);
                if(recyclerView$RecycledViewPool0.c.size() == 0 && !z) {
                    for(int v = 0; true; ++v) {
                        SparseArray sparseArray0 = recyclerView$RecycledViewPool0.a;
                        if(v >= sparseArray0.size()) {
                            break;
                        }
                        ArrayList arrayList0 = ((q1)sparseArray0.get(sparseArray0.keyAt(v))).a;
                        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                            PoolingContainer.callPoolingContainerOnRelease(((ViewHolder)arrayList0.get(v1)).itemView);
                        }
                    }
                }
            }
        }

        public final void f() {
            ArrayList arrayList0 = this.c;
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                this.g(v);
            }
            arrayList0.clear();
            if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                c0 c00 = RecyclerView.this.mPrefetchRegistry;
                int[] arr_v = c00.c;
                if(arr_v != null) {
                    Arrays.fill(arr_v, -1);
                }
                c00.d = 0;
            }
        }

        public final void g(int v) {
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "Recycling cached view at index " + v);
            }
            ArrayList arrayList0 = this.c;
            ViewHolder recyclerView$ViewHolder0 = (ViewHolder)arrayList0.get(v);
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + recyclerView$ViewHolder0);
            }
            this.a(recyclerView$ViewHolder0, true);
            arrayList0.remove(v);
        }

        @NonNull
        public List getScrapList() {
            return this.d;
        }

        @NonNull
        public View getViewForPosition(int v) {
            return this.k(v, 0x7FFFFFFFFFFFFFFFL).itemView;
        }

        public final void h(ViewHolder recyclerView$ViewHolder0) {
            boolean z4;
            boolean z = false;
            boolean z1 = true;
            RecyclerView recyclerView0 = RecyclerView.this;
            if(!recyclerView$ViewHolder0.isScrap() && recyclerView$ViewHolder0.itemView.getParent() == null) {
                if(!recyclerView$ViewHolder0.isTmpDetached()) {
                    if(recyclerView$ViewHolder0.shouldIgnore()) {
                        throw new IllegalArgumentException(b.h(recyclerView0, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                    }
                    boolean z2 = recyclerView$ViewHolder0.doesTransientStatePreventRecycling();
                    boolean z3 = recyclerView0.mAdapter != null && z2 && recyclerView0.mAdapter.onFailedToRecycleView(recyclerView$ViewHolder0);
                    ArrayList arrayList0 = this.c;
                    if(RecyclerView.sDebugAssertionsEnabled && arrayList0.contains(recyclerView$ViewHolder0)) {
                        StringBuilder stringBuilder0 = new StringBuilder("cached view received recycle internal? ");
                        stringBuilder0.append(recyclerView$ViewHolder0);
                        throw new IllegalArgumentException(b.h(recyclerView0, stringBuilder0));
                    }
                    if(z3 || recyclerView$ViewHolder0.isRecyclable()) {
                        if(this.f <= 0 || recyclerView$ViewHolder0.hasAnyOfTheFlags(0x20E)) {
                            z4 = false;
                        }
                        else {
                            int v = arrayList0.size();
                            if(v >= this.f && v > 0) {
                                this.g(0);
                                --v;
                            }
                            if(RecyclerView.ALLOW_THREAD_GAP_WORK && v > 0) {
                                c0 c00 = recyclerView0.mPrefetchRegistry;
                                int v1 = recyclerView$ViewHolder0.mPosition;
                                if(c00.c != null) {
                                    int v2 = c00.d * 2;
                                    int v3 = 0;
                                    while(v3 < v2) {
                                        if(c00.c[v3] == v1) {
                                            goto label_47;
                                        }
                                        v3 += 2;
                                    }
                                }
                                int v4 = v - 1;
                            label_34:
                                while(v4 >= 0) {
                                    int v5 = ((ViewHolder)arrayList0.get(v4)).mPosition;
                                    c0 c01 = recyclerView0.mPrefetchRegistry;
                                    if(c01.c == null) {
                                        break;
                                    }
                                    int v6 = c01.d * 2;
                                    int v7 = 0;
                                    while(true) {
                                        if(v7 >= v6) {
                                            break label_34;
                                        }
                                        if(c01.c[v7] != v5) {
                                            v7 += 2;
                                            continue;
                                        }
                                        --v4;
                                        continue label_34;
                                    }
                                }
                                v = v4 + 1;
                            }
                        label_47:
                            arrayList0.add(v, recyclerView$ViewHolder0);
                            z4 = true;
                        }
                        if(z4) {
                            z1 = false;
                        }
                        else {
                            this.a(recyclerView$ViewHolder0, true);
                        }
                        z = z4;
                    }
                    else {
                        if(RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView0.exceptionLabel());
                        }
                        z1 = false;
                    }
                    recyclerView0.mViewInfoStore.d(recyclerView$ViewHolder0);
                    if(!z && !z1 && z2) {
                        PoolingContainer.callPoolingContainerOnRelease(recyclerView$ViewHolder0.itemView);
                        recyclerView$ViewHolder0.mBindingAdapter = null;
                        recyclerView$ViewHolder0.mOwnerRecyclerView = null;
                    }
                    return;
                }
                StringBuilder stringBuilder1 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                stringBuilder1.append(recyclerView$ViewHolder0);
                throw new IllegalArgumentException(b.h(recyclerView0, stringBuilder1));
            }
            StringBuilder stringBuilder2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            stringBuilder2.append(recyclerView$ViewHolder0.isScrap());
            stringBuilder2.append(" isAttached:");
            if(recyclerView$ViewHolder0.itemView.getParent() != null) {
                z = true;
            }
            stringBuilder2.append(z);
            stringBuilder2.append(recyclerView0.exceptionLabel());
            throw new IllegalArgumentException(stringBuilder2.toString());
        }

        public final void i(View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            RecyclerView recyclerView0 = RecyclerView.this;
            if(!recyclerView$ViewHolder0.hasAnyOfTheFlags(12) && recyclerView$ViewHolder0.isUpdated() && !recyclerView0.canReuseUpdatedViewHolder(recyclerView$ViewHolder0)) {
                if(this.b == null) {
                    this.b = new ArrayList();
                }
                recyclerView$ViewHolder0.setScrapContainer(this, true);
                this.b.add(recyclerView$ViewHolder0);
                return;
            }
            if(recyclerView$ViewHolder0.isInvalid() && !recyclerView$ViewHolder0.isRemoved() && !recyclerView0.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(b.h(recyclerView0, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            recyclerView$ViewHolder0.setScrapContainer(this, false);
            this.a.add(recyclerView$ViewHolder0);
        }

        public final boolean j(ViewHolder recyclerView$ViewHolder0, int v, int v1, long v2) {
            recyclerView$ViewHolder0.mBindingAdapter = null;
            RecyclerView recyclerView0 = RecyclerView.this;
            recyclerView$ViewHolder0.mOwnerRecyclerView = recyclerView0;
            int v3 = recyclerView$ViewHolder0.getItemViewType();
            boolean z = false;
            if(Long.compare(v2, 0x7FFFFFFFFFFFFFFFL) != 0) {
                long v4 = this.g.a(v3).d;
                if(v4 != 0L && v4 + 2396409202500L >= v2) {
                    return false;
                }
            }
            if(recyclerView$ViewHolder0.isTmpDetached()) {
                int v5 = recyclerView0.getChildCount();
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$ViewHolder0.itemView.getLayoutParams();
                recyclerView0.attachViewToParent(recyclerView$ViewHolder0.itemView, v5, viewGroup$LayoutParams0);
                z = true;
            }
            recyclerView0.mAdapter.bindViewHolder(recyclerView$ViewHolder0, v);
            if(z) {
                recyclerView0.detachViewFromParent(recyclerView$ViewHolder0.itemView);
            }
            long v6 = 0xDB0B0L;
            q1 q10 = this.g.a(recyclerView$ViewHolder0.getItemViewType());
            long v7 = q10.d;
            if(v7 != 0L) {
                v6 = 224300L + v7 / 4L * 3L;
            }
            q10.d = v6;
            if(recyclerView0.isAccessibilityEnabled()) {
                View view0 = recyclerView$ViewHolder0.itemView;
                if(ViewCompat.getImportantForAccessibility(view0) == 0) {
                    ViewCompat.setImportantForAccessibility(view0, 1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0 = recyclerView0.mAccessibilityDelegate;
                if(recyclerViewAccessibilityDelegate0 != null) {
                    AccessibilityDelegateCompat accessibilityDelegateCompat0 = recyclerViewAccessibilityDelegate0.getItemDelegate();
                    if(accessibilityDelegateCompat0 instanceof ItemDelegate) {
                        ((ItemDelegate)accessibilityDelegateCompat0).getClass();
                        AccessibilityDelegateCompat accessibilityDelegateCompat1 = ViewCompat.getAccessibilityDelegate(view0);
                        if(accessibilityDelegateCompat1 != null && accessibilityDelegateCompat1 != ((ItemDelegate)accessibilityDelegateCompat0)) {
                            ((ItemDelegate)accessibilityDelegateCompat0).e.put(view0, accessibilityDelegateCompat1);
                        }
                    }
                    ViewCompat.setAccessibilityDelegate(view0, accessibilityDelegateCompat0);
                }
            }
            if(recyclerView0.mState.isPreLayout()) {
                recyclerView$ViewHolder0.mPreLayoutPosition = v1;
            }
            return true;
        }

        public final ViewHolder k(int v, long v1) {
            LayoutParams recyclerView$LayoutParams0;
            boolean z3;
            boolean z2;
            View view0;
            boolean z1;
            ViewHolder recyclerView$ViewHolder0;
            boolean z = false;
            RecyclerView recyclerView0 = RecyclerView.this;
            if(v >= 0 && v < recyclerView0.mState.getItemCount()) {
                if(recyclerView0.mState.isPreLayout()) {
                    ArrayList arrayList0 = this.b;
                    if(arrayList0 != null) {
                        int v2 = arrayList0.size();
                        if(v2 != 0) {
                            int v3 = 0;
                            while(v3 < v2) {
                                recyclerView$ViewHolder0 = (ViewHolder)this.b.get(v3);
                                if(!recyclerView$ViewHolder0.wasReturnedFromScrap() && recyclerView$ViewHolder0.getLayoutPosition() == v) {
                                    recyclerView$ViewHolder0.addFlags(0x20);
                                    goto label_30;
                                }
                                ++v3;
                            }
                            if(recyclerView0.mAdapter.hasStableIds()) {
                                int v4 = recyclerView0.mAdapterHelper.f(v, 0);
                                if(v4 > 0 && v4 < recyclerView0.mAdapter.getItemCount()) {
                                    long v5 = recyclerView0.mAdapter.getItemId(v4);
                                    int v6 = 0;
                                    while(v6 < v2) {
                                        ViewHolder recyclerView$ViewHolder1 = (ViewHolder)this.b.get(v6);
                                        if(!recyclerView$ViewHolder1.wasReturnedFromScrap() && recyclerView$ViewHolder1.getItemId() == v5) {
                                            recyclerView$ViewHolder1.addFlags(0x20);
                                            recyclerView$ViewHolder0 = recyclerView$ViewHolder1;
                                            goto label_30;
                                        }
                                        ++v6;
                                    }
                                }
                            }
                        }
                    }
                    recyclerView$ViewHolder0 = null;
                label_30:
                    z1 = recyclerView$ViewHolder0 == null ? false : true;
                }
                else {
                    z1 = false;
                    recyclerView$ViewHolder0 = null;
                }
                ArrayList arrayList1 = this.c;
                ArrayList arrayList2 = this.a;
                if(recyclerView$ViewHolder0 == null) {
                    int v7 = arrayList2.size();
                    int v8 = 0;
                alab1:
                    while(true) {
                        if(v8 < v7) {
                            ViewHolder recyclerView$ViewHolder2 = (ViewHolder)arrayList2.get(v8);
                            if(!recyclerView$ViewHolder2.wasReturnedFromScrap() && recyclerView$ViewHolder2.getLayoutPosition() == v && !recyclerView$ViewHolder2.isInvalid() && (recyclerView0.mState.h || !recyclerView$ViewHolder2.isRemoved())) {
                                recyclerView$ViewHolder2.addFlags(0x20);
                                recyclerView$ViewHolder0 = recyclerView$ViewHolder2;
                                break;
                            }
                            ++v8;
                            continue;
                        }
                        ArrayList arrayList3 = recyclerView0.mChildHelper.c;
                        int v9 = arrayList3.size();
                        int v10 = 0;
                        while(true) {
                            view0 = null;
                            if(v10 < v9) {
                                view0 = (View)arrayList3.get(v10);
                                ViewHolder recyclerView$ViewHolder3 = RecyclerView.getChildViewHolderInt(view0);
                                if(recyclerView$ViewHolder3.getLayoutPosition() != v || recyclerView$ViewHolder3.isInvalid() || recyclerView$ViewHolder3.isRemoved()) {
                                    ++v10;
                                    continue;
                                }
                            }
                            break;
                        }
                        if(view0 == null) {
                            int v14 = arrayList1.size();
                            int v15 = 0;
                            while(true) {
                                recyclerView$ViewHolder0 = null;
                                if(v15 < v14) {
                                    ViewHolder recyclerView$ViewHolder5 = (ViewHolder)arrayList1.get(v15);
                                    if(!recyclerView$ViewHolder5.isInvalid() && recyclerView$ViewHolder5.getLayoutPosition() == v && !recyclerView$ViewHolder5.isAttachedToTransitionOverlay()) {
                                        arrayList1.remove(v15);
                                        if(RecyclerView.sVerboseLoggingEnabled) {
                                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + v + ") found match in cache: " + recyclerView$ViewHolder5);
                                        }
                                        recyclerView$ViewHolder0 = recyclerView$ViewHolder5;
                                        break alab1;
                                    }
                                    ++v15;
                                    continue;
                                }
                                break alab1;
                            }
                        }
                        else {
                            ViewHolder recyclerView$ViewHolder4 = RecyclerView.getChildViewHolderInt(view0);
                            j j0 = recyclerView0.mChildHelper;
                            int v11 = j0.a.a.indexOfChild(view0);
                            if(v11 < 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view0);
                            }
                            i i0 = j0.b;
                            if(!i0.d(v11)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view0);
                            }
                            i0.a(v11);
                            j0.g(view0);
                            int v12 = recyclerView0.mChildHelper.e(view0);
                            if(v12 != -1) {
                                j j1 = recyclerView0.mChildHelper;
                                int v13 = j1.d(v12);
                                j1.b.f(v13);
                                j1.a.detachViewFromParent(v13);
                                this.i(view0);
                                recyclerView$ViewHolder4.addFlags(0x2020);
                                recyclerView$ViewHolder0 = recyclerView$ViewHolder4;
                                break;
                            }
                            StringBuilder stringBuilder0 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            stringBuilder0.append(recyclerView$ViewHolder4);
                            throw new IllegalStateException(b.h(recyclerView0, stringBuilder0));
                        }
                        goto label_129;
                    }
                    if(recyclerView$ViewHolder0 != null) {
                        if(recyclerView$ViewHolder0.isRemoved()) {
                            if(RecyclerView.sDebugAssertionsEnabled && !recyclerView0.mState.isPreLayout()) {
                                throw new IllegalStateException(b.h(recyclerView0, new StringBuilder("should not receive a removed view unless it is pre layout")));
                            }
                            z2 = recyclerView0.mState.isPreLayout();
                        }
                        else {
                            if(recyclerView$ViewHolder0.mPosition < 0 || recyclerView$ViewHolder0.mPosition >= recyclerView0.mAdapter.getItemCount()) {
                                goto label_126;
                            }
                            if(!recyclerView0.mState.isPreLayout() && recyclerView0.mAdapter.getItemViewType(recyclerView$ViewHolder0.mPosition) != recyclerView$ViewHolder0.getItemViewType()) {
                                z2 = false;
                            }
                            else if(!recyclerView0.mAdapter.hasStableIds() || recyclerView$ViewHolder0.getItemId() == recyclerView0.mAdapter.getItemId(recyclerView$ViewHolder0.mPosition)) {
                                z2 = true;
                            }
                            else {
                                z2 = false;
                            }
                        }
                        if(z2) {
                            z1 = true;
                            goto label_129;
                        label_126:
                            StringBuilder stringBuilder1 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            stringBuilder1.append(recyclerView$ViewHolder0);
                            throw new IndexOutOfBoundsException(b.h(recyclerView0, stringBuilder1));
                        }
                        else {
                            recyclerView$ViewHolder0.addFlags(4);
                            if(recyclerView$ViewHolder0.isScrap()) {
                                recyclerView0.removeDetachedView(recyclerView$ViewHolder0.itemView, false);
                                recyclerView$ViewHolder0.unScrap();
                            }
                            else if(recyclerView$ViewHolder0.wasReturnedFromScrap()) {
                                recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
                            }
                            this.h(recyclerView$ViewHolder0);
                            recyclerView$ViewHolder0 = null;
                        }
                    }
                }
            label_129:
                if(recyclerView$ViewHolder0 == null) {
                    int v16 = recyclerView0.mAdapterHelper.f(v, 0);
                    if(v16 < 0 || v16 >= recyclerView0.mAdapter.getItemCount()) {
                        goto label_210;
                    }
                    int v17 = recyclerView0.mAdapter.getItemViewType(v16);
                    if(recyclerView0.mAdapter.hasStableIds()) {
                        long v18 = recyclerView0.mAdapter.getItemId(v16);
                        int v19 = arrayList2.size() - 1;
                    alab2:
                        while(true) {
                            if(v19 < 0) {
                                for(int v20 = arrayList1.size() - 1; v20 >= 0; --v20) {
                                    recyclerView$ViewHolder0 = (ViewHolder)arrayList1.get(v20);
                                    if(recyclerView$ViewHolder0.getItemId() == v18 && !recyclerView$ViewHolder0.isAttachedToTransitionOverlay()) {
                                        if(v17 == recyclerView$ViewHolder0.getItemViewType()) {
                                            arrayList1.remove(v20);
                                            break alab2;
                                        }
                                        this.g(v20);
                                        break;
                                    }
                                }
                                recyclerView$ViewHolder0 = null;
                                break;
                            }
                            ViewHolder recyclerView$ViewHolder6 = (ViewHolder)arrayList2.get(v19);
                            if(recyclerView$ViewHolder6.getItemId() == v18 && !recyclerView$ViewHolder6.wasReturnedFromScrap()) {
                                if(v17 == recyclerView$ViewHolder6.getItemViewType()) {
                                    recyclerView$ViewHolder6.addFlags(0x20);
                                    if(recyclerView$ViewHolder6.isRemoved() && !recyclerView0.mState.isPreLayout()) {
                                        recyclerView$ViewHolder6.setFlags(2, 14);
                                    }
                                    recyclerView$ViewHolder0 = recyclerView$ViewHolder6;
                                    break;
                                }
                                arrayList2.remove(v19);
                                recyclerView0.removeDetachedView(recyclerView$ViewHolder6.itemView, false);
                                ViewHolder recyclerView$ViewHolder7 = RecyclerView.getChildViewHolderInt(recyclerView$ViewHolder6.itemView);
                                recyclerView$ViewHolder7.mScrapContainer = null;
                                recyclerView$ViewHolder7.mInChangeScrap = false;
                                recyclerView$ViewHolder7.clearReturnedFromScrapFlag();
                                this.h(recyclerView$ViewHolder7);
                            }
                            --v19;
                        }
                        if(recyclerView$ViewHolder0 != null) {
                            recyclerView$ViewHolder0.mPosition = v16;
                            z1 = true;
                        }
                    }
                    if(recyclerView$ViewHolder0 == null) {
                        ViewCacheExtension recyclerView$ViewCacheExtension0 = this.h;
                        if(recyclerView$ViewCacheExtension0 != null) {
                            View view1 = recyclerView$ViewCacheExtension0.getViewForPositionAndType(this, v, v17);
                            if(view1 != null) {
                                recyclerView$ViewHolder0 = recyclerView0.getChildViewHolder(view1);
                                if(recyclerView$ViewHolder0 == null) {
                                    throw new IllegalArgumentException(b.h(recyclerView0, new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                                }
                                if(recyclerView$ViewHolder0.shouldIgnore()) {
                                    throw new IllegalArgumentException(b.h(recyclerView0, new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                                }
                            }
                        }
                    }
                    if(recyclerView$ViewHolder0 == null) {
                        if(RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + v + ") fetching from shared pool");
                        }
                        ViewHolder recyclerView$ViewHolder8 = this.b().getRecycledView(v17);
                        if(recyclerView$ViewHolder8 != null) {
                            recyclerView$ViewHolder8.resetInternal();
                            if(RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view2 = recyclerView$ViewHolder8.itemView;
                                if(view2 instanceof ViewGroup) {
                                    Recycler.c(((ViewGroup)view2), false);
                                }
                            }
                        }
                        recyclerView$ViewHolder0 = recyclerView$ViewHolder8;
                    }
                    if(recyclerView$ViewHolder0 == null) {
                        if(Long.compare(v1, 0x7FFFFFFFFFFFFFFFL) != 0) {
                            long v21 = this.g.a(v17).c;
                            if(v21 != 0L && v21 + 2397307938600L >= v1) {
                                return null;
                            }
                        }
                        recyclerView$ViewHolder0 = recyclerView0.mAdapter.createViewHolder(recyclerView0, v17);
                        if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                            RecyclerView recyclerView1 = RecyclerView.findNestedRecyclerView(recyclerView$ViewHolder0.itemView);
                            if(recyclerView1 != null) {
                                recyclerView$ViewHolder0.mNestedRecyclerView = new WeakReference(recyclerView1);
                            }
                        }
                        long v22 = 560400L;
                        q1 q10 = this.g.a(v17);
                        long v23 = q10.c;
                        if(v23 != 0L) {
                            v22 = 140100L + v23 / 4L * 3L;
                        }
                        q10.c = v22;
                        if(RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            goto label_214;
                        label_210:
                            StringBuilder stringBuilder2 = q.u("Inconsistency detected. Invalid item position ", v, "(offset:", v16, ").state:");
                            stringBuilder2.append(recyclerView0.mState.getItemCount());
                            stringBuilder2.append(recyclerView0.exceptionLabel());
                            throw new IndexOutOfBoundsException(stringBuilder2.toString());
                        }
                    }
                }
            label_214:
                if(z1 && !recyclerView0.mState.isPreLayout() && recyclerView$ViewHolder0.hasAnyOfTheFlags(0x2000)) {
                    recyclerView$ViewHolder0.setFlags(0, 0x2000);
                    if(recyclerView0.mState.k) {
                        int v24 = ItemAnimator.a(recyclerView$ViewHolder0);
                        ItemAnimator recyclerView$ItemAnimator0 = recyclerView0.mItemAnimator;
                        List list0 = recyclerView$ViewHolder0.getUnmodifiedPayloads();
                        recyclerView0.recordAnimationInfoIfBouncedHiddenView(recyclerView$ViewHolder0, recyclerView$ItemAnimator0.recordPreLayoutInformation(recyclerView0.mState, recyclerView$ViewHolder0, v24 | 0x1000, list0));
                    }
                }
                if(recyclerView0.mState.isPreLayout() && recyclerView$ViewHolder0.isBound()) {
                    recyclerView$ViewHolder0.mPreLayoutPosition = v;
                    z3 = false;
                }
                else if(!recyclerView$ViewHolder0.isBound() || recyclerView$ViewHolder0.needsUpdate() || recyclerView$ViewHolder0.isInvalid()) {
                    if(RecyclerView.sDebugAssertionsEnabled && recyclerView$ViewHolder0.isRemoved()) {
                        StringBuilder stringBuilder3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        stringBuilder3.append(recyclerView$ViewHolder0);
                        throw new IllegalStateException(b.h(recyclerView0, stringBuilder3));
                    }
                    z3 = this.j(recyclerView$ViewHolder0, recyclerView0.mAdapterHelper.f(v, 0), v, v1);
                }
                else {
                    z3 = false;
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = recyclerView$ViewHolder0.itemView.getLayoutParams();
                if(viewGroup$LayoutParams0 == null) {
                    recyclerView$LayoutParams0 = (LayoutParams)recyclerView0.generateDefaultLayoutParams();
                    recyclerView$ViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
                }
                else if(recyclerView0.checkLayoutParams(viewGroup$LayoutParams0)) {
                    recyclerView$LayoutParams0 = (LayoutParams)viewGroup$LayoutParams0;
                }
                else {
                    recyclerView$LayoutParams0 = (LayoutParams)recyclerView0.generateLayoutParams(viewGroup$LayoutParams0);
                    recyclerView$ViewHolder0.itemView.setLayoutParams(recyclerView$LayoutParams0);
                }
                recyclerView$LayoutParams0.a = recyclerView$ViewHolder0;
                if(z1 && z3) {
                    z = true;
                }
                recyclerView$LayoutParams0.d = z;
                return recyclerView$ViewHolder0;
            }
            StringBuilder stringBuilder4 = q.u("Invalid item position ", v, "(", v, "). Item count:");
            stringBuilder4.append(recyclerView0.mState.getItemCount());
            stringBuilder4.append(recyclerView0.exceptionLabel());
            throw new IndexOutOfBoundsException(stringBuilder4.toString());
        }

        public final void l(ViewHolder recyclerView$ViewHolder0) {
            if(recyclerView$ViewHolder0.mInChangeScrap) {
                this.b.remove(recyclerView$ViewHolder0);
            }
            else {
                this.a.remove(recyclerView$ViewHolder0);
            }
            recyclerView$ViewHolder0.mScrapContainer = null;
            recyclerView$ViewHolder0.mInChangeScrap = false;
            recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
        }

        public final void m() {
            LayoutManager recyclerView$LayoutManager0 = RecyclerView.this.mLayout;
            this.f = this.e + (recyclerView$LayoutManager0 == null ? 0 : recyclerView$LayoutManager0.mPrefetchMaxCountObserved);
            ArrayList arrayList0 = this.c;
            for(int v = arrayList0.size() - 1; v >= 0 && arrayList0.size() > this.f; --v) {
                this.g(v);
            }
        }

        public void recycleView(@NonNull View view0) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            RecyclerView recyclerView0 = RecyclerView.this;
            if(recyclerView$ViewHolder0.isTmpDetached()) {
                recyclerView0.removeDetachedView(view0, false);
            }
            if(recyclerView$ViewHolder0.isScrap()) {
                recyclerView$ViewHolder0.unScrap();
            }
            else if(recyclerView$ViewHolder0.wasReturnedFromScrap()) {
                recyclerView$ViewHolder0.clearReturnedFromScrapFlag();
            }
            this.h(recyclerView$ViewHolder0);
            if(recyclerView0.mItemAnimator != null && !recyclerView$ViewHolder0.isRecyclable()) {
                recyclerView0.mItemAnimator.endAnimation(recyclerView$ViewHolder0);
            }
        }

        public void setViewCacheSize(int v) {
            this.e = v;
            this.m();
        }
    }

    public interface RecyclerListener {
        void onViewRecycled(@NonNull ViewHolder arg1);
    }

    @RestrictTo({Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public Parcelable b;

        static {
            SavedState.CREATOR = new s1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                classLoader0 = LayoutManager.class.getClassLoader();
            }
            this.b = parcel0.readParcelable(classLoader0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeParcelable(this.b, 0);
        }
    }

    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
            return false;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
        public void onTouchEvent(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
        }
    }

    public static abstract class SmoothScroller {
        public static class Action {
            public static final int UNDEFINED_DURATION = 0x80000000;
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public Action(@Px int v, @Px int v1) {
                this(v, v1, 0x80000000, null);
            }

            public Action(@Px int v, @Px int v1, int v2) {
                this(v, v1, v2, null);
            }

            public Action(@Px int v, @Px int v1, int v2, @Nullable Interpolator interpolator0) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = v;
                this.b = v1;
                this.c = v2;
                this.e = interpolator0;
            }

            public final void a(RecyclerView recyclerView0) {
                int v = this.d;
                if(v >= 0) {
                    this.d = -1;
                    recyclerView0.jumpToPositionForSmoothScroller(v);
                    this.f = false;
                    return;
                }
                if(this.f) {
                    Interpolator interpolator0 = this.e;
                    if(interpolator0 != null && this.c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int v1 = this.c;
                    if(v1 < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    recyclerView0.mViewFlinger.c(this.a, this.b, v1, interpolator0);
                    int v2 = this.g + 1;
                    this.g = v2;
                    if(v2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                    return;
                }
                this.g = 0;
            }

            public int getDuration() {
                return this.c;
            }

            @Px
            public int getDx() {
                return this.a;
            }

            @Px
            public int getDy() {
                return this.b;
            }

            @Nullable
            public Interpolator getInterpolator() {
                return this.e;
            }

            public void jumpTo(int v) {
                this.d = v;
            }

            public void setDuration(int v) {
                this.f = true;
                this.c = v;
            }

            public void setDx(@Px int v) {
                this.f = true;
                this.a = v;
            }

            public void setDy(@Px int v) {
                this.f = true;
                this.b = v;
            }

            public void setInterpolator(@Nullable Interpolator interpolator0) {
                this.f = true;
                this.e = interpolator0;
            }

            public void update(@Px int v, @Px int v1, int v2, @Nullable Interpolator interpolator0) {
                this.a = v;
                this.b = v1;
                this.c = v2;
                this.e = interpolator0;
                this.f = true;
            }
        }

        public interface ScrollVectorProvider {
            @Nullable
            PointF computeScrollVectorForPosition(int arg1);
        }

        public int a;
        public RecyclerView b;
        public LayoutManager c;
        public boolean d;
        public boolean e;
        public View f;
        public final Action g;
        public boolean h;

        public SmoothScroller() {
            this.a = -1;
            this.g = new Action(0, 0);
        }

        public final void a(int v, int v1) {
            RecyclerView recyclerView0 = this.b;
            if(this.a == -1 || recyclerView0 == null) {
                this.stop();
            }
            if(this.d && this.f == null && this.c != null) {
                PointF pointF0 = this.computeScrollVectorForPosition(this.a);
                if(pointF0 != null) {
                    float f = pointF0.x;
                    if(f != 0.0f || pointF0.y != 0.0f) {
                        recyclerView0.scrollStep(((int)Math.signum(f)), ((int)Math.signum(pointF0.y)), null);
                    }
                }
            }
            boolean z = false;
            this.d = false;
            View view0 = this.f;
            Action recyclerView$SmoothScroller$Action0 = this.g;
            if(view0 != null) {
                if(this.getChildPosition(view0) == this.a) {
                    this.onTargetFound(this.f, recyclerView0.mState, recyclerView$SmoothScroller$Action0);
                    recyclerView$SmoothScroller$Action0.a(recyclerView0);
                    this.stop();
                }
                else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if(this.e) {
                this.onSeekTargetStep(v, v1, recyclerView0.mState, recyclerView$SmoothScroller$Action0);
                if(recyclerView$SmoothScroller$Action0.d >= 0) {
                    z = true;
                }
                recyclerView$SmoothScroller$Action0.a(recyclerView0);
                if(z && this.e) {
                    this.d = true;
                    recyclerView0.mViewFlinger.b();
                }
            }
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int v) {
            LayoutManager recyclerView$LayoutManager0 = this.getLayoutManager();
            if(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider)recyclerView$LayoutManager0).computeScrollVectorForPosition(v);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int v) {
            return this.b.mLayout.findViewByPosition(v);
        }

        public int getChildCount() {
            return this.b.mLayout.getChildCount();
        }

        public int getChildPosition(View view0) {
            return this.b.getChildLayoutPosition(view0);
        }

        @Nullable
        public LayoutManager getLayoutManager() {
            return this.c;
        }

        public int getTargetPosition() {
            return this.a;
        }

        @Deprecated
        public void instantScrollToPosition(int v) {
            this.b.scrollToPosition(v);
        }

        public boolean isPendingInitialRun() {
            return this.d;
        }

        public boolean isRunning() {
            return this.e;
        }

        public void normalize(@NonNull PointF pointF0) {
            float f = (float)Math.sqrt(pointF0.y * pointF0.y + pointF0.x * pointF0.x);
            pointF0.x /= f;
            pointF0.y /= f;
        }

        public void onChildAttachedToWindow(View view0) {
            if(this.getChildPosition(view0) == this.getTargetPosition()) {
                this.f = view0;
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        public abstract void onSeekTargetStep(@Px int arg1, @Px int arg2, @NonNull State arg3, @NonNull Action arg4);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View arg1, @NonNull State arg2, @NonNull Action arg3);

        public void setTargetPosition(int v) {
            this.a = v;
        }

        public final void stop() {
            if(!this.e) {
                return;
            }
            this.e = false;
            this.onStop();
            this.b.mState.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            this.c.onSmoothScrollerStopped(this);
            this.c = null;
            this.b = null;
        }
    }

    public static class State {
        public int a;
        public SparseArray b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public int m;
        public long n;
        public int o;
        public int p;
        public int q;

        public State() {
            this.a = -1;
            this.c = 0;
            this.d = 0;
            this.e = 1;
            this.f = 0;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
        }

        public final void a(int v) {
            if((this.e & v) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(v) + " but it is " + Integer.toBinaryString(this.e));
            }
        }

        public boolean didStructureChange() {
            return this.g;
        }

        public Object get(int v) {
            return this.b == null ? null : this.b.get(v);
        }

        // 去混淆评级： 低(20)
        public int getItemCount() {
            return this.h ? this.c - this.d : this.f;
        }

        public int getRemainingScrollHorizontal() {
            return this.p;
        }

        public int getRemainingScrollVertical() {
            return this.q;
        }

        public int getTargetScrollPosition() {
            return this.a;
        }

        public boolean hasTargetScrollPosition() {
            return this.a != -1;
        }

        public boolean isMeasuring() {
            return this.j;
        }

        public boolean isPreLayout() {
            return this.h;
        }

        public void put(int v, Object object0) {
            if(this.b == null) {
                this.b = new SparseArray();
            }
            this.b.put(v, object0);
        }

        public void remove(int v) {
            SparseArray sparseArray0 = this.b;
            if(sparseArray0 == null) {
                return;
            }
            sparseArray0.remove(v);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("State{mTargetPosition=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", mData=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", mItemCount=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", mIsMeasuring=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", mPreviousLayoutItemCount=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", mStructureChanged=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", mInPreLayout=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", mRunSimpleAnimations=");
            stringBuilder0.append(this.k);
            stringBuilder0.append(", mRunPredictiveAnimations=");
            return a.p(stringBuilder0, this.l, '}');
        }

        public boolean willRunPredictiveAnimations() {
            return this.l;
        }

        public boolean willRunSimpleAnimations() {
            return this.k;
        }
    }

    public static abstract class ViewCacheExtension {
        @Nullable
        public abstract View getViewForPositionAndType(@NonNull Recycler arg1, int arg2, int arg3);
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 0x400;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 0x200;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 0x1000;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 0x2000;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 0x80;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 0x800;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 0x20;
        static final int FLAG_TMP_DETACHED = 0x100;
        static final int FLAG_UPDATE = 2;
        private static final List FULLUPDATE_PAYLOADS = null;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @NonNull
        public final View itemView;
        Adapter mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        WeakReference mNestedRecyclerView;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        List mPayloads;
        @VisibleForTesting
        int mPendingAccessibilityState;
        int mPosition;
        int mPreLayoutPosition;
        Recycler mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;
        List mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        static {
            ViewHolder.FULLUPDATE_PAYLOADS = Collections.emptyList();
        }

        public ViewHolder(@NonNull View view0) {
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mItemViewType = -1;
            this.mPreLayoutPosition = -1;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.mPayloads = null;
            this.mUnmodifiedPayloads = null;
            this.mIsRecyclableCount = 0;
            this.mScrapContainer = null;
            this.mInChangeScrap = false;
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            if(view0 == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view0;
        }

        public void addChangePayload(Object object0) {
            if(object0 == null) {
                this.addFlags(0x400);
                return;
            }
            if((0x400 & this.mFlags) == 0) {
                if(this.mPayloads == null) {
                    ArrayList arrayList0 = new ArrayList();
                    this.mPayloads = arrayList0;
                    this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList0);
                }
                this.mPayloads.add(object0);
            }
        }

        public void addFlags(int v) {
            this.mFlags |= v;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List list0 = this.mPayloads;
            if(list0 != null) {
                list0.clear();
            }
            this.mFlags &= 0xFFFFFBFF;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= 0xFFFFFEFF;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int v, int v1, boolean z) {
            this.addFlags(8);
            this.offsetPosition(v1, z);
            this.mPosition = v;
        }

        public final int getAbsoluteAdapterPosition() {
            return this.mOwnerRecyclerView == null ? -1 : this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return this.getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            if(this.mBindingAdapter == null) {
                return -1;
            }
            RecyclerView recyclerView0 = this.mOwnerRecyclerView;
            if(recyclerView0 == null) {
                return -1;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 == null) {
                return -1;
            }
            int v = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this);
            return v == -1 ? -1 : recyclerView$Adapter0.findRelativeAdapterPositionIn(this.mBindingAdapter, this, v);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        public List getUnmodifiedPayloads() {
            return (this.mFlags & 0x400) != 0 || (this.mPayloads == null || this.mPayloads.size() == 0) ? ViewHolder.FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int v) {
            return (v & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 0x200) != 0 || this.isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 0x100) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int v, boolean z) {
            if(this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if(this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if(z) {
                this.mPreLayoutPosition += v;
            }
            this.mPosition += v;
            if(this.itemView.getLayoutParams() != null) {
                ((LayoutParams)this.itemView.getLayoutParams()).c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView0) {
            int v = this.mPendingAccessibilityState;
            this.mWasImportantForAccessibilityBeforeHidden = v == -1 ? ViewCompat.getImportantForAccessibility(this.itemView) : v;
            recyclerView0.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView0) {
            recyclerView0.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if(RecyclerView.sDebugAssertionsEnabled && this.isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if(this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int v, int v1) {
            this.mFlags = v & v1 | this.mFlags & ~v1;
        }

        public final void setIsRecyclable(boolean z) {
            int v = z ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
            this.mIsRecyclableCount = v;
            if(v < 0) {
                this.mIsRecyclableCount = 0;
                if(RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            else if(!z && v == 1) {
                this.mFlags |= 16;
            }
            else if(z && v == 0) {
                this.mFlags &= -17;
            }
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
            }
        }

        public void setScrapContainer(Recycler recyclerView$Recycler0, boolean z) {
            this.mScrapContainer = recyclerView$Recycler0;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 0x80) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= 0xFFFFFF7F;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = b.u((this.getClass().isAnonymousClass() ? "ViewHolder" : this.getClass().getSimpleName()), "{");
            stringBuilder0.append(Integer.toHexString(this.hashCode()));
            stringBuilder0.append(" position=");
            stringBuilder0.append(this.mPosition);
            stringBuilder0.append(" id=");
            stringBuilder0.append(this.mItemId);
            stringBuilder0.append(", oldPos=");
            stringBuilder0.append(this.mOldPosition);
            stringBuilder0.append(", pLpos:");
            stringBuilder0.append(this.mPreLayoutPosition);
            StringBuilder stringBuilder1 = new StringBuilder(stringBuilder0.toString());
            if(this.isScrap()) {
                stringBuilder1.append(" scrap ");
                stringBuilder1.append((this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]"));
            }
            if(this.isInvalid()) {
                stringBuilder1.append(" invalid");
            }
            if(!this.isBound()) {
                stringBuilder1.append(" unbound");
            }
            if(this.needsUpdate()) {
                stringBuilder1.append(" update");
            }
            if(this.isRemoved()) {
                stringBuilder1.append(" removed");
            }
            if(this.shouldIgnore()) {
                stringBuilder1.append(" ignored");
            }
            if(this.isTmpDetached()) {
                stringBuilder1.append(" tmpDetached");
            }
            if(!this.isRecyclable()) {
                stringBuilder1.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if(this.isAdapterPositionUnknown()) {
                stringBuilder1.append(" undefined adapter position");
            }
            if(this.itemView.getParent() == null) {
                stringBuilder1.append(" no parent");
            }
            stringBuilder1.append("}");
            return stringBuilder1.toString();
        }

        public void unScrap() {
            this.mScrapContainer.l(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 0x20) != 0;
        }
    }

    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    static final boolean ALLOW_THREAD_GAP_WORK = false;
    private static final float DECELERATION_RATE = 0.0f;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = 0x7FFFFFFFFFFFFFFFL;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1L;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = false;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = 0x80000000;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    androidx.recyclerview.widget.b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    j mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    @VisibleForTesting
    boolean mFirstLayoutComplete;
    e0 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    @VisibleForTesting
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final r1 mObserver;
    private List mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList mOnItemTouchListeners;
    @VisibleForTesting
    final List mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    c0 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final u1 mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final j2 mViewInfoStore;
    static boolean sDebugAssertionsEnabled = false;
    static final t1 sDefaultEdgeEffectFactory = null;
    static final Interpolator sQuinticInterpolator = null;
    static boolean sVerboseLoggingEnabled = false;

    static {
        RecyclerView.NESTED_SCROLLING_ATTRS = new int[]{0x1010436};
        RecyclerView.DECELERATION_RATE = 2.358202f;
        RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST = false;
        RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
        RecyclerView.POST_UPDATES_ON_ANIMATION = true;
        RecyclerView.ALLOW_THREAD_GAP_WORK = true;
        RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD = false;
        RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        RecyclerView.sQuinticInterpolator = new h1(0);
        RecyclerView.sDefaultEdgeEffectFactory = new t1();  // 初始化器: Landroidx/recyclerview/widget/RecyclerView$EdgeEffectFactory;-><init>()V
    }

    public RecyclerView(@NonNull Context context0) {
        this(context0, null);
    }

    public RecyclerView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.recyclerViewStyle);
    }

    public RecyclerView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        Constructor constructor0;
        Object[] arr_object;
        this.mObserver = new r1(this);
        this.mRecycler = new Recycler(this);
        this.mViewInfoStore = new j2();
        this.mUpdateChildViewsRunnable = new f1(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = RecyclerView.sDefaultEdgeEffectFactory;
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = 1.401298E-45f;
        this.mScaledVerticalScrollFactor = 1.401298E-45f;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new u1(this);
        this.mPrefetchRegistry = RecyclerView.ALLOW_THREAD_GAP_WORK ? new c0() : null;  // 初始化器: Ljava/lang/Object;-><init>()V
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n1(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new g1(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new i1(this);
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.mTouchSlop = viewConfiguration0.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration0, context0);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration0, context0);
        this.mMinFlingVelocity = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration0.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context0.getResources().getDisplayMetrics().density * 51890.199219f;
        this.setWillNotDraw(this.getOverScrollMode() == 2);
        this.mItemAnimator.a = this.mItemAnimatorListener;
        this.initAdapterManager();
        this.mChildHelper = new j(new j1(this));
        if(ViewCompat.getImportantForAutofill(this) == 0) {
            ViewCompat.setImportantForAutofill(this, 8);
        }
        if(ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RecyclerView, v, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context0, styleable.RecyclerView, attributeSet0, typedArray0, v, 0);
        String s = typedArray0.getString(styleable.RecyclerView_layoutManager);
        if(typedArray0.getInt(styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            this.setDescendantFocusability(0x40000);
        }
        this.mClipToPadding = typedArray0.getBoolean(styleable.RecyclerView_android_clipToPadding, true);
        boolean z = typedArray0.getBoolean(styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if(z) {
            this.initFastScroller(((StateListDrawable)typedArray0.getDrawable(styleable.RecyclerView_fastScrollVerticalThumbDrawable)), typedArray0.getDrawable(styleable.RecyclerView_fastScrollVerticalTrackDrawable), ((StateListDrawable)typedArray0.getDrawable(styleable.RecyclerView_fastScrollHorizontalThumbDrawable)), typedArray0.getDrawable(styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArray0.recycle();
        if(s != null) {
            String s1 = s.trim();
            if(!s1.isEmpty()) {
                if(s1.charAt(0) == 46) {
                    s1 = "net.daum.android.tistoryapp" + s1;
                }
                else if(!s1.contains(".")) {
                    s1 = RecyclerView.class.getPackage().getName() + '.' + s1;
                }
                try {
                    Class class0 = Class.forName(s1, false, (this.isInEditMode() ? this.getClass().getClassLoader() : context0.getClassLoader())).asSubclass(LayoutManager.class);
                    try {
                        arr_object = null;
                        constructor0 = class0.getConstructor(RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        arr_object = new Object[]{context0, attributeSet0, v, 0};
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        try {
                            constructor0 = class0.getConstructor(null);
                        }
                        catch(NoSuchMethodException noSuchMethodException1) {
                            noSuchMethodException1.initCause(noSuchMethodException0);
                            throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Error creating LayoutManager " + s1, noSuchMethodException1);
                        }
                    }
                    constructor0.setAccessible(true);
                    this.setLayoutManager(((LayoutManager)constructor0.newInstance(arr_object)));
                    goto label_105;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s1, invocationTargetException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s1, instantiationException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Cannot access non-public constructor " + s1, illegalAccessException0);
                }
                catch(ClassCastException classCastException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Class is not a LayoutManager " + s1, classCastException0);
                }
                throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Unable to find LayoutManager " + s1, classNotFoundException0);
            }
        }
    label_105:
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, RecyclerView.NESTED_SCROLLING_ATTRS, v, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context0, RecyclerView.NESTED_SCROLLING_ATTRS, attributeSet0, typedArray1, v, 0);
        boolean z1 = typedArray1.getBoolean(0, true);
        typedArray1.recycle();
        this.setNestedScrollingEnabled(z1);
        PoolingContainer.setPoolingContainer(this, true);
    }

    public final void a(ViewHolder recyclerView$ViewHolder0) {
        View view0 = recyclerView$ViewHolder0.itemView;
        boolean z = view0.getParent() == this;
        ViewHolder recyclerView$ViewHolder1 = this.getChildViewHolder(view0);
        this.mRecycler.l(recyclerView$ViewHolder1);
        if(recyclerView$ViewHolder0.isTmpDetached()) {
            this.mChildHelper.a(view0, -1, view0.getLayoutParams(), true);
            return;
        }
        if(!z) {
            j j0 = this.mChildHelper;
            int v = j0.a.a.getChildCount();
            j0.b.e(v, true);
            j0.c.add(view0);
            j0.a.onEnteredHiddenState(view0);
            j0.a.addView(view0, v);
            return;
        }
        j j1 = this.mChildHelper;
        int v1 = j1.a.a.indexOfChild(view0);
        if(v1 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view0);
        }
        j1.b.h(v1);
        j1.c.add(view0);
        j1.a.onEnteredHiddenState(view0);
    }

    public void absorbGlows(int v, int v1) {
        if(v < 0) {
            this.ensureLeftGlow();
            if(this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-v);
            }
        }
        else if(v > 0) {
            this.ensureRightGlow();
            if(this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(v);
            }
        }
        if(v1 < 0) {
            this.ensureTopGlow();
            if(this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-v1);
            }
        }
        else if(v1 > 0) {
            this.ensureBottomGlow();
            if(this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(v1);
            }
        }
        if(v != 0 || v1 != 0) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        super.addFocusables(arrayList0, v, v1);
    }

    public void addItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0) {
        this.addItemDecoration(recyclerView$ItemDecoration0, -1);
    }

    public void addItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0, int v) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if(this.mItemDecorations.isEmpty()) {
            this.setWillNotDraw(false);
        }
        if(v < 0) {
            this.mItemDecorations.add(recyclerView$ItemDecoration0);
        }
        else {
            this.mItemDecorations.add(v, recyclerView$ItemDecoration0);
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener recyclerView$OnChildAttachStateChangeListener0) {
        if(this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(recyclerView$OnChildAttachStateChangeListener0);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener recyclerView$OnItemTouchListener0) {
        this.mOnItemTouchListeners.add(recyclerView$OnItemTouchListener0);
    }

    public void addOnScrollListener(@NonNull OnScrollListener recyclerView$OnScrollListener0) {
        if(this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(recyclerView$OnScrollListener0);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerView$RecyclerListener0) {
        Preconditions.checkArgument(recyclerView$RecyclerListener0 != null, "\'listener\' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerView$RecyclerListener0);
    }

    public void animateAppearance(@NonNull ViewHolder recyclerView$ViewHolder0, @Nullable ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        recyclerView$ViewHolder0.setIsRecyclable(false);
        if(this.mItemAnimator.animateAppearance(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
            this.postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, @Nullable ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        this.a(recyclerView$ViewHolder0);
        recyclerView$ViewHolder0.setIsRecyclable(false);
        if(this.mItemAnimator.animateDisappearance(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
            this.postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String s) {
        if(!this.isComputingLayout()) {
            throw s == null ? new IllegalStateException(b.h(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling"))) : new IllegalStateException(b.h(this, b.t(s)));
        }
    }

    public void assertNotInLayoutOrScroll(String s) {
        if(this.isComputingLayout()) {
            throw s == null ? new IllegalStateException(b.h(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling"))) : new IllegalStateException(s);
        }
        if(this.mDispatchScrollCounter > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(b.h(this, new StringBuilder(""))));
        }
    }

    public static int b(int v, EdgeEffect edgeEffect0, EdgeEffect edgeEffect1, int v1) {
        if(v > 0 && edgeEffect0 != null && EdgeEffectCompat.getDistance(edgeEffect0) != 0.0f) {
            int v2 = Math.round(EdgeEffectCompat.onPullDistance(edgeEffect0, ((float)(-v)) * 4.0f / ((float)v1), 0.5f) * (((float)(-v1)) / 4.0f));
            if(v2 != v) {
                edgeEffect0.finish();
            }
            return v - v2;
        }
        if(v < 0 && edgeEffect1 != null && EdgeEffectCompat.getDistance(edgeEffect1) != 0.0f) {
            int v3 = Math.round(EdgeEffectCompat.onPullDistance(edgeEffect1, ((float)v) * 4.0f / ((float)v1), 0.5f) * (((float)v1) / 4.0f));
            if(v3 != v) {
                edgeEffect1.finish();
            }
            return v - v3;
        }
        return v;
    }

    public final void c() {
        int v1;
        boolean z = true;
        this.mState.a(1);
        this.fillRemainingScrollValues(this.mState);
        this.mState.j = false;
        this.startInterceptRequestLayout();
        this.mViewInfoStore.a.clear();
        this.mViewInfoStore.b.clear();
        this.onEnterLayoutOrScroll();
        this.i();
        ViewHolder recyclerView$ViewHolder0 = null;
        View view0 = !this.mPreserveFocusAfterLayout || !this.hasFocus() || this.mAdapter == null ? null : this.getFocusedChild();
        if(view0 != null) {
            recyclerView$ViewHolder0 = this.findContainingViewHolder(view0);
        }
        long v = -1L;
        if(recyclerView$ViewHolder0 == null) {
            this.mState.n = -1L;
            this.mState.m = -1;
            this.mState.o = -1;
        }
        else {
            State recyclerView$State0 = this.mState;
            if(this.mAdapter.hasStableIds()) {
                v = recyclerView$ViewHolder0.getItemId();
            }
            recyclerView$State0.n = v;
            State recyclerView$State1 = this.mState;
            if(this.mDataSetHasChangedAfterLayout) {
                v1 = -1;
            }
            else {
                v1 = recyclerView$ViewHolder0.isRemoved() ? recyclerView$ViewHolder0.mOldPosition : recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
            }
            recyclerView$State1.m = v1;
            State recyclerView$State2 = this.mState;
            View view1 = recyclerView$ViewHolder0.itemView;
            int v2 = view1.getId();
            while(!view1.isFocused() && view1 instanceof ViewGroup && view1.hasFocus()) {
                view1 = ((ViewGroup)view1).getFocusedChild();
                if(view1.getId() != -1) {
                    v2 = view1.getId();
                }
            }
            recyclerView$State2.o = v2;
        }
        State recyclerView$State3 = this.mState;
        if(!recyclerView$State3.k || !this.mItemsChanged) {
            z = false;
        }
        recyclerView$State3.i = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        recyclerView$State3.h = recyclerView$State3.l;
        recyclerView$State3.f = this.mAdapter.getItemCount();
        this.f(this.mMinMaxLayoutPositions);
        if(this.mState.k) {
            int v3 = this.mChildHelper.c();
            for(int v4 = 0; v4 < v3; ++v4) {
                ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.b(v4));
                if(!recyclerView$ViewHolder1.shouldIgnore() && (!recyclerView$ViewHolder1.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator recyclerView$ItemAnimator0 = this.mItemAnimator;
                    int v5 = ItemAnimator.a(recyclerView$ViewHolder1);
                    List list0 = recyclerView$ViewHolder1.getUnmodifiedPayloads();
                    ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0 = recyclerView$ItemAnimator0.recordPreLayoutInformation(this.mState, recyclerView$ViewHolder1, v5, list0);
                    SimpleArrayMap simpleArrayMap0 = this.mViewInfoStore.a;
                    i2 i20 = (i2)simpleArrayMap0.get(recyclerView$ViewHolder1);
                    if(i20 == null) {
                        i20 = i2.a();
                        simpleArrayMap0.put(recyclerView$ViewHolder1, i20);
                    }
                    i20.b = recyclerView$ItemAnimator$ItemHolderInfo0;
                    i20.a |= 4;
                    if(this.mState.i && recyclerView$ViewHolder1.isUpdated() && !recyclerView$ViewHolder1.isRemoved() && !recyclerView$ViewHolder1.shouldIgnore() && !recyclerView$ViewHolder1.isInvalid()) {
                        long v6 = this.getChangedHolderKey(recyclerView$ViewHolder1);
                        this.mViewInfoStore.b.put(v6, recyclerView$ViewHolder1);
                    }
                }
            }
        }
        if(this.mState.l) {
            this.saveOldPositions();
            boolean z1 = this.mState.g;
            this.mState.g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
            this.mState.g = z1;
            for(int v7 = 0; v7 < this.mChildHelper.c(); ++v7) {
                ViewHolder recyclerView$ViewHolder2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.b(v7));
                if(!recyclerView$ViewHolder2.shouldIgnore()) {
                    i2 i21 = (i2)this.mViewInfoStore.a.get(recyclerView$ViewHolder2);
                    if(i21 == null || (i21.a & 4) == 0) {
                        int v8 = ItemAnimator.a(recyclerView$ViewHolder2);
                        boolean z2 = recyclerView$ViewHolder2.hasAnyOfTheFlags(0x2000);
                        if(!z2) {
                            v8 |= 0x1000;
                        }
                        ItemAnimator recyclerView$ItemAnimator1 = this.mItemAnimator;
                        List list1 = recyclerView$ViewHolder2.getUnmodifiedPayloads();
                        ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1 = recyclerView$ItemAnimator1.recordPreLayoutInformation(this.mState, recyclerView$ViewHolder2, v8, list1);
                        if(z2) {
                            this.recordAnimationInfoIfBouncedHiddenView(recyclerView$ViewHolder2, recyclerView$ItemAnimator$ItemHolderInfo1);
                        }
                        else {
                            SimpleArrayMap simpleArrayMap1 = this.mViewInfoStore.a;
                            i2 i22 = (i2)simpleArrayMap1.get(recyclerView$ViewHolder2);
                            if(i22 == null) {
                                i22 = i2.a();
                                simpleArrayMap1.put(recyclerView$ViewHolder2, i22);
                            }
                            i22.a |= 2;
                            i22.b = recyclerView$ItemAnimator$ItemHolderInfo1;
                        }
                    }
                }
            }
        }
        this.clearOldPositions();
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        this.mState.e = 2;
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder recyclerView$ViewHolder0) {
        return this.mItemAnimator == null || this.mItemAnimator.canReuseUpdatedViewHolder(recyclerView$ViewHolder0, recyclerView$ViewHolder0.getUnmodifiedPayloads());
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams && this.mLayout.checkLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder recyclerView$ViewHolder0) {
        WeakReference weakReference0 = recyclerView$ViewHolder0.mNestedRecyclerView;
        if(weakReference0 != null) {
            for(View view0 = (View)weakReference0.get(); view0 != null; view0 = viewParent0 instanceof View ? ((View)viewParent0) : null) {
                if(view0 == recyclerView$ViewHolder0.itemView) {
                    return;
                }
                ViewParent viewParent0 = view0.getParent();
            }
            recyclerView$ViewHolder0.mNestedRecyclerView = null;
        }
    }

    public void clearOldPositions() {
        int v = this.mChildHelper.a.a.getChildCount();
        for(int v2 = 0; v2 < v; ++v2) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v2));
            if(!recyclerView$ViewHolder0.shouldIgnore()) {
                recyclerView$ViewHolder0.clearOldPosition();
            }
        }
        Recycler recyclerView$Recycler0 = this.mRecycler;
        ArrayList arrayList0 = recyclerView$Recycler0.c;
        int v3 = arrayList0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            ((ViewHolder)arrayList0.get(v4)).clearOldPosition();
        }
        ArrayList arrayList1 = recyclerView$Recycler0.a;
        int v5 = arrayList1.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            ((ViewHolder)arrayList1.get(v6)).clearOldPosition();
        }
        ArrayList arrayList2 = recyclerView$Recycler0.b;
        if(arrayList2 != null) {
            int v7 = arrayList2.size();
            for(int v1 = 0; v1 < v7; ++v1) {
                ((ViewHolder)recyclerView$Recycler0.b.get(v1)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list0 = this.mOnChildAttachStateListeners;
        if(list0 != null) {
            list0.clear();
        }
    }

    public void clearOnScrollListeners() {
        List list0 = this.mScrollListeners;
        if(list0 != null) {
            list0.clear();
        }
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeHorizontalScrollExtent() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.canScrollHorizontally() ? this.mLayout.computeHorizontalScrollExtent(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeHorizontalScrollOffset() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.canScrollHorizontally() ? this.mLayout.computeHorizontalScrollOffset(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeHorizontalScrollRange() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.canScrollHorizontally() ? this.mLayout.computeHorizontalScrollRange(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeVerticalScrollExtent() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.canScrollVertically() ? this.mLayout.computeVerticalScrollExtent(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeVerticalScrollOffset() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.canScrollVertically() ? this.mLayout.computeVerticalScrollOffset(this.mState) : 0;
    }

    @Override  // androidx.core.view.ScrollingView, android.view.View
    public int computeVerticalScrollRange() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return 0;
        }
        return recyclerView$LayoutManager0.canScrollVertically() ? this.mLayout.computeVerticalScrollRange(this.mState) : 0;
    }

    public void considerReleasingGlowsOnScroll(int v, int v1) {
        boolean z;
        if(this.mLeftGlow == null || this.mLeftGlow.isFinished() || v <= 0) {
            z = false;
        }
        else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        if(this.mRightGlow != null && !this.mRightGlow.isFinished() && v < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        if(this.mTopGlow != null && !this.mTopGlow.isFinished() && v1 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        if(this.mBottomGlow != null && !this.mBottomGlow.isFinished() && v1 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if(z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public int consumeFlingInHorizontalStretch(int v) {
        return RecyclerView.b(v, this.mLeftGlow, this.mRightGlow, this.getWidth());
    }

    public int consumeFlingInVerticalStretch(int v) {
        return RecyclerView.b(v, this.mTopGlow, this.mBottomGlow, this.getHeight());
    }

    public void consumePendingUpdateOperations() {
        if(this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if(!this.mAdapterHelper.g()) {
                return;
            }
            androidx.recyclerview.widget.b b0 = this.mAdapterHelper;
            if((b0.f & 4) != 0 && (b0.f & 11) == 0) {
                TraceCompat.beginSection("RV PartialInvalidate");
                this.startInterceptRequestLayout();
                this.onEnterLayoutOrScroll();
                this.mAdapterHelper.i();
                if(!this.mLayoutWasDefered) {
                    int v = this.mChildHelper.c();
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= v) {
                            this.mAdapterHelper.b();
                            break;
                        }
                        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.b(v1));
                        if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore() && recyclerView$ViewHolder0.isUpdated()) {
                            this.dispatchLayout();
                            break;
                        }
                    }
                }
                this.stopInterceptRequestLayout(true);
                this.onExitLayoutOrScroll();
                TraceCompat.endSection();
                return;
            }
            if(b0.g()) {
                TraceCompat.beginSection("RV FullInvalidate");
                this.dispatchLayout();
                TraceCompat.endSection();
            }
            return;
        }
        TraceCompat.beginSection("RV FullInvalidate");
        this.dispatchLayout();
        TraceCompat.endSection();
    }

    public final void d() {
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f = this.mAdapter.getItemCount();
        this.mState.d = 0;
        if(this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable0 = this.mPendingSavedState.b;
            if(parcelable0 != null) {
                this.mLayout.onRestoreInstanceState(parcelable0);
            }
            this.mPendingSavedState = null;
        }
        this.mState.h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, this.mState);
        this.mState.g = false;
        this.mState.k = this.mState.k && this.mItemAnimator != null;
        this.mState.e = 4;
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
    }

    public void defaultOnMeasure(int v, int v1) {
        int v2 = this.getPaddingLeft();
        int v3 = LayoutManager.chooseSize(v, this.getPaddingRight() + v2, ViewCompat.getMinimumWidth(this));
        int v4 = this.getPaddingTop();
        this.setMeasuredDimension(v3, LayoutManager.chooseSize(v1, this.getPaddingBottom() + v4, ViewCompat.getMinimumHeight(this)));
    }

    public void dispatchChildAttached(View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        Adapter recyclerView$Adapter0 = this.mAdapter;
        if(recyclerView$Adapter0 != null && recyclerView$ViewHolder0 != null) {
            recyclerView$Adapter0.onViewAttachedToWindow(recyclerView$ViewHolder0);
        }
        List list0 = this.mOnChildAttachStateListeners;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((OnChildAttachStateChangeListener)this.mOnChildAttachStateListeners.get(v)).onChildViewAttachedToWindow(view0);
            }
        }
    }

    public void dispatchChildDetached(View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        Adapter recyclerView$Adapter0 = this.mAdapter;
        if(recyclerView$Adapter0 != null && recyclerView$ViewHolder0 != null) {
            recyclerView$Adapter0.onViewDetachedFromWindow(recyclerView$ViewHolder0);
        }
        List list0 = this.mOnChildAttachStateListeners;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((OnChildAttachStateChangeListener)this.mOnChildAttachStateListeners.get(v)).onChildViewDetachedFromWindow(view0);
            }
        }
    }

    public void dispatchLayout() {
        if(this.mAdapter == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if(this.mLayout == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        int v = 0;
        this.mState.j = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != this.getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != this.getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if(this.mState.e == 1) {
            this.c();
            this.mLayout.setExactMeasureSpecsFrom(this);
            this.d();
        }
        else if(!this.mAdapterHelper.c.isEmpty() && !this.mAdapterHelper.b.isEmpty() || z || this.mLayout.getWidth() != this.getWidth() || this.mLayout.getHeight() != this.getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            this.d();
        }
        else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        this.mState.a(4);
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        this.mState.e = 1;
        View view0 = null;
        if(this.mState.k) {
            for(int v1 = this.mChildHelper.c() - 1; v1 >= 0; --v1) {
                ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.b(v1));
                if(!recyclerView$ViewHolder0.shouldIgnore()) {
                    long v2 = this.getChangedHolderKey(recyclerView$ViewHolder0);
                    ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0 = this.mItemAnimator.recordPostLayoutInformation(this.mState, recyclerView$ViewHolder0);
                    ViewHolder recyclerView$ViewHolder1 = (ViewHolder)this.mViewInfoStore.b.get(v2);
                    if(recyclerView$ViewHolder1 == null || recyclerView$ViewHolder1.shouldIgnore()) {
                        this.mViewInfoStore.a(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
                    }
                    else {
                        i2 i20 = (i2)this.mViewInfoStore.a.get(recyclerView$ViewHolder1);
                        boolean z1 = i20 != null && (i20.a & 1) != 0;
                        i2 i21 = (i2)this.mViewInfoStore.a.get(recyclerView$ViewHolder0);
                        boolean z2 = i21 != null && (i21.a & 1) != 0;
                        if(!z1 || recyclerView$ViewHolder1 != recyclerView$ViewHolder0) {
                            ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1 = this.mViewInfoStore.b(recyclerView$ViewHolder1, 4);
                            this.mViewInfoStore.a(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
                            ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo2 = this.mViewInfoStore.b(recyclerView$ViewHolder0, 8);
                            if(recyclerView$ItemAnimator$ItemHolderInfo1 == null) {
                                int v3 = this.mChildHelper.c();
                                for(int v4 = 0; v4 < v3; ++v4) {
                                    ViewHolder recyclerView$ViewHolder2 = RecyclerView.getChildViewHolderInt(this.mChildHelper.b(v4));
                                    if(recyclerView$ViewHolder2 != recyclerView$ViewHolder0 && this.getChangedHolderKey(recyclerView$ViewHolder2) == v2) {
                                        if(this.mAdapter != null && this.mAdapter.hasStableIds()) {
                                            StringBuilder stringBuilder0 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                            stringBuilder0.append(recyclerView$ViewHolder2);
                                            stringBuilder0.append(" \n View Holder 2:");
                                            stringBuilder0.append(recyclerView$ViewHolder0);
                                            throw new IllegalStateException(b.h(this, stringBuilder0));
                                        }
                                        StringBuilder stringBuilder1 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                        stringBuilder1.append(recyclerView$ViewHolder2);
                                        stringBuilder1.append(" \n View Holder 2:");
                                        stringBuilder1.append(recyclerView$ViewHolder0);
                                        throw new IllegalStateException(b.h(this, stringBuilder1));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + recyclerView$ViewHolder1 + " cannot be found but it is necessary for " + recyclerView$ViewHolder0 + this.exceptionLabel());
                            }
                            else {
                                recyclerView$ViewHolder1.setIsRecyclable(false);
                                if(z1) {
                                    this.a(recyclerView$ViewHolder1);
                                }
                                if(recyclerView$ViewHolder1 != recyclerView$ViewHolder0) {
                                    if(z2) {
                                        this.a(recyclerView$ViewHolder0);
                                    }
                                    recyclerView$ViewHolder1.mShadowedHolder = recyclerView$ViewHolder0;
                                    this.a(recyclerView$ViewHolder1);
                                    this.mRecycler.l(recyclerView$ViewHolder1);
                                    recyclerView$ViewHolder0.setIsRecyclable(false);
                                    recyclerView$ViewHolder0.mShadowingHolder = recyclerView$ViewHolder1;
                                }
                                if(this.mItemAnimator.animateChange(recyclerView$ViewHolder1, recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo1, recyclerView$ItemAnimator$ItemHolderInfo2)) {
                                    this.postAnimationRunner();
                                }
                            }
                        }
                        else {
                            this.mViewInfoStore.a(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0);
                        }
                    }
                }
            }
            ViewInfoStore.ProcessCallback viewInfoStore$ProcessCallback0 = this.mViewInfoProcessCallback;
            SimpleArrayMap simpleArrayMap0 = this.mViewInfoStore.a;
            for(int v5 = simpleArrayMap0.size() - 1; v5 >= 0; --v5) {
                ViewHolder recyclerView$ViewHolder3 = (ViewHolder)simpleArrayMap0.keyAt(v5);
                i2 i22 = (i2)simpleArrayMap0.removeAt(v5);
                int v6 = i22.a;
                if((v6 & 3) == 3) {
                    viewInfoStore$ProcessCallback0.unused(recyclerView$ViewHolder3);
                }
                else if((v6 & 1) != 0) {
                    ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo3 = i22.b;
                    if(recyclerView$ItemAnimator$ItemHolderInfo3 == null) {
                        viewInfoStore$ProcessCallback0.unused(recyclerView$ViewHolder3);
                    }
                    else {
                        viewInfoStore$ProcessCallback0.processDisappeared(recyclerView$ViewHolder3, recyclerView$ItemAnimator$ItemHolderInfo3, i22.c);
                    }
                }
                else if((v6 & 14) == 14) {
                    viewInfoStore$ProcessCallback0.processAppeared(recyclerView$ViewHolder3, i22.b, i22.c);
                }
                else if((v6 & 12) == 12) {
                    viewInfoStore$ProcessCallback0.processPersistent(recyclerView$ViewHolder3, i22.b, i22.c);
                }
                else if((v6 & 4) != 0) {
                    viewInfoStore$ProcessCallback0.processDisappeared(recyclerView$ViewHolder3, i22.b, null);
                }
                else if((v6 & 8) != 0) {
                    viewInfoStore$ProcessCallback0.processAppeared(recyclerView$ViewHolder3, i22.b, i22.c);
                }
                i22.a = 0;
                i22.b = null;
                i22.c = null;
                i2.d.release(i22);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        this.mState.c = this.mState.f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mState.k = false;
        this.mState.l = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList0 = this.mRecycler.b;
        if(arrayList0 != null) {
            arrayList0.clear();
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0.mPrefetchMaxObservedInInitialPrefetch) {
            recyclerView$LayoutManager0.mPrefetchMaxCountObserved = 0;
            recyclerView$LayoutManager0.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        this.mViewInfoStore.a.clear();
        this.mViewInfoStore.b.clear();
        int v7 = this.mMinMaxLayoutPositions[0];
        int v8 = this.mMinMaxLayoutPositions[1];
        this.f(this.mMinMaxLayoutPositions);
        if(this.mMinMaxLayoutPositions[0] != v7 || this.mMinMaxLayoutPositions[1] != v8) {
            this.dispatchOnScrolled(0, 0);
        }
        if(this.mPreserveFocusAfterLayout && this.mAdapter != null && this.hasFocus() && this.getDescendantFocusability() != 0x60000 && (this.getDescendantFocusability() != 0x20000 || !this.isFocused())) {
            if(this.isFocused()) {
            label_151:
                ViewHolder recyclerView$ViewHolder4 = this.mState.n == -1L || !this.mAdapter.hasStableIds() ? null : this.findViewHolderForItemId(this.mState.n);
                if(recyclerView$ViewHolder4 != null && !this.mChildHelper.c.contains(recyclerView$ViewHolder4.itemView) && recyclerView$ViewHolder4.itemView.hasFocusable()) {
                    view0 = recyclerView$ViewHolder4.itemView;
                }
                else if(this.mChildHelper.c() > 0) {
                    State recyclerView$State0 = this.mState;
                    int v9 = recyclerView$State0.m;
                    if(v9 != -1) {
                        v = v9;
                    }
                    int v10 = recyclerView$State0.getItemCount();
                    int v11 = v;
                    while(v11 < v10) {
                        ViewHolder recyclerView$ViewHolder5 = this.findViewHolderForAdapterPosition(v11);
                        if(recyclerView$ViewHolder5 == null) {
                            break;
                        }
                        if(recyclerView$ViewHolder5.itemView.hasFocusable()) {
                            view0 = recyclerView$ViewHolder5.itemView;
                            goto label_179;
                        }
                        ++v11;
                    }
                    for(int v12 = Math.min(v10, v) - 1; v12 >= 0; --v12) {
                        ViewHolder recyclerView$ViewHolder6 = this.findViewHolderForAdapterPosition(v12);
                        if(recyclerView$ViewHolder6 == null) {
                            break;
                        }
                        if(recyclerView$ViewHolder6.itemView.hasFocusable()) {
                            view0 = recyclerView$ViewHolder6.itemView;
                            break;
                        }
                    }
                }
            label_179:
                if(view0 != null) {
                    int v13 = this.mState.o;
                    if(((long)v13) != -1L) {
                        View view2 = view0.findViewById(v13);
                        if(view2 != null && view2.isFocusable()) {
                            view0 = view2;
                        }
                    }
                    view0.requestFocus();
                }
            }
            else {
                View view1 = this.getFocusedChild();
                if(!RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD || view1.getParent() != null && view1.hasFocus()) {
                    if(this.mChildHelper.c.contains(view1)) {
                        goto label_151;
                    }
                }
                else if(this.mChildHelper.c() == 0) {
                    this.requestFocus();
                }
                else {
                    goto label_151;
                }
            }
        }
        this.mState.n = -1L;
        this.mState.m = -1;
        this.mState.o = -1;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.getScrollingChildHelper().dispatchNestedFling(f, f1, z);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.getScrollingChildHelper().dispatchNestedPreFling(f, f1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.getScrollingChildHelper().dispatchNestedPreScroll(v, v1, arr_v, arr_v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1, int v2) {
        return this.getScrollingChildHelper().dispatchNestedPreScroll(v, v1, arr_v, arr_v1, v2);
    }

    @Override  // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v, int v4, @NonNull int[] arr_v1) {
        this.getScrollingChildHelper().dispatchNestedScroll(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.getScrollingChildHelper().dispatchNestedScroll(v, v1, v2, v3, arr_v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v, int v4) {
        return this.getScrollingChildHelper().dispatchNestedScroll(v, v1, v2, v3, arr_v, v4);
    }

    public void dispatchOnScrollStateChanged(int v) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.onScrollStateChanged(v);
        }
        OnScrollListener recyclerView$OnScrollListener0 = this.mScrollListener;
        if(recyclerView$OnScrollListener0 != null) {
            recyclerView$OnScrollListener0.onScrollStateChanged(this, v);
        }
        List list0 = this.mScrollListeners;
        if(list0 != null) {
            for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                ((OnScrollListener)this.mScrollListeners.get(v1)).onScrollStateChanged(this, v);
            }
        }
    }

    public void dispatchOnScrolled(int v, int v1) {
        ++this.mDispatchScrollCounter;
        int v2 = this.getScrollX();
        int v3 = this.getScrollY();
        this.onScrollChanged(v2, v3, v2 - v, v3 - v1);
        OnScrollListener recyclerView$OnScrollListener0 = this.mScrollListener;
        if(recyclerView$OnScrollListener0 != null) {
            recyclerView$OnScrollListener0.onScrolled(this, v, v1);
        }
        List list0 = this.mScrollListeners;
        if(list0 != null) {
            for(int v4 = list0.size() - 1; v4 >= 0; --v4) {
                ((OnScrollListener)this.mScrollListeners.get(v4)).onScrolled(this, v, v1);
            }
        }
        --this.mDispatchScrollCounter;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        for(int v = this.mPendingAccessibilityImportanceChange.size() - 1; v >= 0; --v) {
            ViewHolder recyclerView$ViewHolder0 = (ViewHolder)this.mPendingAccessibilityImportanceChange.get(v);
            if(recyclerView$ViewHolder0.itemView.getParent() == this && !recyclerView$ViewHolder0.shouldIgnore()) {
                int v1 = recyclerView$ViewHolder0.mPendingAccessibilityState;
                if(v1 != -1) {
                    ViewCompat.setImportantForAccessibility(recyclerView$ViewHolder0.itemView, v1);
                    recyclerView$ViewHolder0.mPendingAccessibilityState = -1;
                }
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override  // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        this.onPopulateAccessibilityEvent(accessibilityEvent0);
        return true;
    }

    @Override  // android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        this.dispatchThawSelfOnly(sparseArray0);
    }

    @Override  // android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray sparseArray0) {
        this.dispatchFreezeSelfOnly(sparseArray0);
    }

    @Override  // android.view.View
    public void draw(Canvas canvas0) {
        int v6;
        int v3;
        super.draw(canvas0);
        int v = this.mItemDecorations.size();
        int v1 = 0;
        for(int v2 = 0; true; ++v2) {
            v3 = 1;
            if(v2 >= v) {
                break;
            }
            ((ItemDecoration)this.mItemDecorations.get(v2)).onDrawOver(canvas0, this, this.mState);
        }
        if(this.mLeftGlow == null || this.mLeftGlow.isFinished()) {
            v6 = 0;
        }
        else {
            int v4 = canvas0.save();
            int v5 = this.mClipToPadding ? this.getPaddingBottom() : 0;
            canvas0.rotate(270.0f);
            canvas0.translate(((float)(v5 - this.getHeight())), 0.0f);
            v6 = this.mLeftGlow == null || !this.mLeftGlow.draw(canvas0) ? 0 : 1;
            canvas0.restoreToCount(v4);
        }
        if(this.mTopGlow != null && !this.mTopGlow.isFinished()) {
            int v7 = canvas0.save();
            if(this.mClipToPadding) {
                canvas0.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }
            v6 |= (this.mTopGlow == null || !this.mTopGlow.draw(canvas0) ? 0 : 1);
            canvas0.restoreToCount(v7);
        }
        if(this.mRightGlow != null && !this.mRightGlow.isFinished()) {
            int v8 = canvas0.save();
            int v9 = this.getWidth();
            int v10 = this.mClipToPadding ? this.getPaddingTop() : 0;
            canvas0.rotate(90.0f);
            canvas0.translate(((float)v10), ((float)(-v9)));
            v6 |= (this.mRightGlow == null || !this.mRightGlow.draw(canvas0) ? 0 : 1);
            canvas0.restoreToCount(v8);
        }
        if(this.mBottomGlow != null && !this.mBottomGlow.isFinished()) {
            int v11 = canvas0.save();
            canvas0.rotate(180.0f);
            if(this.mClipToPadding) {
                int v12 = this.getWidth();
                int v13 = this.getPaddingRight();
                int v14 = this.getHeight();
                canvas0.translate(((float)(v13 - v12)), ((float)(this.getPaddingBottom() - v14)));
            }
            else {
                canvas0.translate(((float)(-this.getWidth())), ((float)(-this.getHeight())));
            }
            if(this.mBottomGlow != null && this.mBottomGlow.draw(canvas0)) {
                v1 = 1;
            }
            v6 |= v1;
            canvas0.restoreToCount(v11);
        }
        if(v6 != 0 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            v3 = v6;
        }
        if(v3 != 0) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(Canvas canvas0, View view0, long v) {
        return super.drawChild(canvas0, view0, v);
    }

    public final boolean e(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        int v1 = this.mOnItemTouchListeners.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            OnItemTouchListener recyclerView$OnItemTouchListener0 = (OnItemTouchListener)this.mOnItemTouchListeners.get(v2);
            if(recyclerView$OnItemTouchListener0.onInterceptTouchEvent(this, motionEvent0) && v != 3) {
                this.mInterceptingOnItemTouchListener = recyclerView$OnItemTouchListener0;
                return true;
            }
        }
        return false;
    }

    public void ensureBottomGlow() {
        if(this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.mEdgeEffectFactory.createEdgeEffect(this, 3);
        this.mBottomGlow = edgeEffect0;
        if(this.mClipToPadding) {
            edgeEffect0.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public void ensureLeftGlow() {
        if(this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.mEdgeEffectFactory.createEdgeEffect(this, 0);
        this.mLeftGlow = edgeEffect0;
        if(this.mClipToPadding) {
            edgeEffect0.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    public void ensureRightGlow() {
        if(this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.mEdgeEffectFactory.createEdgeEffect(this, 2);
        this.mRightGlow = edgeEffect0;
        if(this.mClipToPadding) {
            edgeEffect0.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    public void ensureTopGlow() {
        if(this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffect0 = this.mEdgeEffectFactory.createEdgeEffect(this, 1);
        this.mTopGlow = edgeEffect0;
        if(this.mClipToPadding) {
            edgeEffect0.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + this.getContext();
    }

    public final void f(int[] arr_v) {
        int v = this.mChildHelper.c();
        if(v == 0) {
            arr_v[0] = -1;
            arr_v[1] = -1;
            return;
        }
        int v1 = 0x7FFFFFFF;
        int v2 = 0x80000000;
        for(int v3 = 0; v3 < v; ++v3) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.b(v3));
            if(!recyclerView$ViewHolder0.shouldIgnore()) {
                int v4 = recyclerView$ViewHolder0.getLayoutPosition();
                if(v4 < v1) {
                    v1 = v4;
                }
                if(v4 > v2) {
                    v2 = v4;
                }
            }
        }
        arr_v[0] = v1;
        arr_v[1] = v2;
    }

    public final void fillRemainingScrollValues(State recyclerView$State0) {
        if(this.getScrollState() == 2) {
            OverScroller overScroller0 = this.mViewFlinger.c;
            recyclerView$State0.p = overScroller0.getFinalX() - overScroller0.getCurrX();
            recyclerView$State0.q = overScroller0.getFinalY() - overScroller0.getCurrY();
            return;
        }
        recyclerView$State0.p = 0;
        recyclerView$State0.q = 0;
    }

    @Nullable
    public View findChildViewUnder(float f, float f1) {
        for(int v = this.mChildHelper.c() - 1; v >= 0; --v) {
            View view0 = this.mChildHelper.b(v);
            float f2 = view0.getTranslationX();
            float f3 = view0.getTranslationY();
            if(f >= ((float)view0.getLeft()) + f2 && f <= ((float)view0.getRight()) + f2 && f1 >= ((float)view0.getTop()) + f3 && f1 <= ((float)view0.getBottom()) + f3) {
                return view0;
            }
        }
        return null;
    }

    @Nullable
    public View findContainingItemView(@NonNull View view0) {
        ViewParent viewParent0;
        for(viewParent0 = view0.getParent(); viewParent0 != null && viewParent0 != this && viewParent0 instanceof View; viewParent0 = view0.getParent()) {
            view0 = (View)viewParent0;
        }
        return viewParent0 == this ? view0 : null;
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view0) {
        View view1 = this.findContainingItemView(view0);
        return view1 == null ? null : this.getChildViewHolder(view1);
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view0) {
        if(!(view0 instanceof ViewGroup)) {
            return null;
        }
        if(view0 instanceof RecyclerView) {
            return (RecyclerView)view0;
        }
        int v = ((ViewGroup)view0).getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            RecyclerView recyclerView0 = RecyclerView.findNestedRecyclerView(((ViewGroup)view0).getChildAt(v1));
            if(recyclerView0 != null) {
                return recyclerView0;
            }
        }
        return null;
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int v) {
        ViewHolder recyclerView$ViewHolder0 = null;
        if(this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int v1 = this.mChildHelper.a.a.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v2));
            if(recyclerView$ViewHolder1 != null && !recyclerView$ViewHolder1.isRemoved() && this.getAdapterPositionInRecyclerView(recyclerView$ViewHolder1) == v) {
                if(this.mChildHelper.c.contains(recyclerView$ViewHolder1.itemView)) {
                    recyclerView$ViewHolder0 = recyclerView$ViewHolder1;
                    continue;
                }
                return recyclerView$ViewHolder1;
            }
        }
        return recyclerView$ViewHolder0;
    }

    public ViewHolder findViewHolderForItemId(long v) {
        ViewHolder recyclerView$ViewHolder0 = null;
        if(this.mAdapter != null && this.mAdapter.hasStableIds()) {
            int v1 = this.mChildHelper.a.a.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v2));
                if(recyclerView$ViewHolder1 != null && !recyclerView$ViewHolder1.isRemoved() && recyclerView$ViewHolder1.getItemId() == v) {
                    if(this.mChildHelper.c.contains(recyclerView$ViewHolder1.itemView)) {
                        recyclerView$ViewHolder0 = recyclerView$ViewHolder1;
                        continue;
                    }
                    return recyclerView$ViewHolder1;
                }
            }
        }
        return recyclerView$ViewHolder0;
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int v) {
        return this.findViewHolderForPosition(v, false);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int v) {
        return this.findViewHolderForPosition(v, false);
    }

    @Nullable
    public ViewHolder findViewHolderForPosition(int v, boolean z) {
        int v1 = this.mChildHelper.a.a.getChildCount();
        ViewHolder recyclerView$ViewHolder0 = null;
        int v2 = 0;
        while(v2 < v1) {
            ViewHolder recyclerView$ViewHolder1 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v2));
            if(recyclerView$ViewHolder1 != null && !recyclerView$ViewHolder1.isRemoved()) {
                if(z) {
                    if(recyclerView$ViewHolder1.mPosition == v) {
                        goto label_10;
                    }
                    else {
                        goto label_14;
                    }
                    goto label_9;
                }
                else {
                label_9:
                    if(recyclerView$ViewHolder1.getLayoutPosition() == v) {
                    label_10:
                        if(this.mChildHelper.c.contains(recyclerView$ViewHolder1.itemView)) {
                            recyclerView$ViewHolder0 = recyclerView$ViewHolder1;
                            goto label_14;
                        }
                        return recyclerView$ViewHolder1;
                    }
                }
            }
        label_14:
            ++v2;
        }
        return recyclerView$ViewHolder0;
    }

    public boolean fling(int v, int v1) {
        int v3;
        int v2;
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if(this.mLayoutSuppressed) {
            return false;
        }
        boolean z = recyclerView$LayoutManager0.canScrollHorizontally();
        boolean z1 = this.mLayout.canScrollVertically();
        if(!z || Math.abs(v) < this.mMinFlingVelocity) {
            v = 0;
        }
        if(!z1 || Math.abs(v1) < this.mMinFlingVelocity) {
            v1 = 0;
        }
        if(v == 0 && v1 == 0) {
            return false;
        }
        if(v == 0) {
            v2 = 0;
        }
        else if(this.mLeftGlow != null && EdgeEffectCompat.getDistance(this.mLeftGlow) != 0.0f) {
            if(this.o(this.mLeftGlow, -v, this.getWidth())) {
                this.mLeftGlow.onAbsorb(-v);
                v = 0;
            }
            v2 = v;
            v = 0;
        }
        else if(this.mRightGlow == null || EdgeEffectCompat.getDistance(this.mRightGlow) == 0.0f) {
            v2 = 0;
        }
        else {
            if(this.o(this.mRightGlow, v, this.getWidth())) {
                this.mRightGlow.onAbsorb(v);
                v = 0;
            }
            v2 = v;
            v = 0;
        }
        if(v1 == 0) {
            v3 = 0;
            v1 = 0;
        }
        else if(this.mTopGlow != null && EdgeEffectCompat.getDistance(this.mTopGlow) != 0.0f) {
            if(this.o(this.mTopGlow, -v1, this.getHeight())) {
                this.mTopGlow.onAbsorb(-v1);
                v1 = 0;
            }
            v3 = 0;
        }
        else if(this.mBottomGlow == null || EdgeEffectCompat.getDistance(this.mBottomGlow) == 0.0f) {
            v3 = v1;
            v1 = 0;
        }
        else {
            if(this.o(this.mBottomGlow, v1, this.getHeight())) {
                this.mBottomGlow.onAbsorb(v1);
                v1 = 0;
            }
            v3 = 0;
        }
        if(v2 != 0 || v1 != 0) {
            v2 = Math.max(-this.mMaxFlingVelocity, Math.min(v2, this.mMaxFlingVelocity));
            v1 = Math.max(-this.mMaxFlingVelocity, Math.min(v1, this.mMaxFlingVelocity));
            this.mViewFlinger.a(v2, v1);
        }
        if(v == 0 && v3 == 0) {
            return v2 != 0 || v1 != 0;
        }
        if(!this.dispatchNestedPreFling(((float)v), ((float)v3))) {
            boolean z2 = z || z1;
            this.dispatchNestedFling(((float)v), ((float)v3), z2);
            if(this.mOnFlingListener != null && this.mOnFlingListener.onFling(v, v3)) {
                return true;
            }
            if(z2) {
                if(z1) {
                    z |= 2;
                }
                this.startNestedScroll(((int)z), 1);
                this.mViewFlinger.a(Math.max(-this.mMaxFlingVelocity, Math.min(v, this.mMaxFlingVelocity)), Math.max(-this.mMaxFlingVelocity, Math.min(v3, this.mMaxFlingVelocity)));
                return true;
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public View focusSearch(View view0, int v) {
        int v13;
        int v10;
        View view1;
        boolean z1;
        boolean z = this.mAdapter != null && this.mLayout != null && !this.isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder focusFinder0 = FocusFinder.getInstance();
        if(!z || v != 1 && v != 2) {
            View view2 = focusFinder0.findNextFocus(this, view0, v);
            if(view2 != null || !z) {
                view1 = view2;
            }
            else {
                this.consumePendingUpdateOperations();
                if(this.findContainingItemView(view0) == null) {
                    return null;
                }
                this.startInterceptRequestLayout();
                view1 = this.mLayout.onFocusSearchFailed(view0, v, this.mRecycler, this.mState);
                this.stopInterceptRequestLayout(false);
            }
        }
        else {
            if(this.mLayout.canScrollVertically()) {
                int v1 = v == 2 ? 130 : 33;
                z1 = focusFinder0.findNextFocus(this, view0, v1) == null;
                if(RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    v = v1;
                }
            }
            else {
                z1 = false;
            }
            if(!z1 && this.mLayout.canScrollHorizontally()) {
                int v2 = ((this.mLayout.getLayoutDirection() == 1 ? 1 : 0) ^ (v == 2 ? 1 : 0)) == 0 ? 17 : 66;
                z1 = focusFinder0.findNextFocus(this, view0, v2) == null;
                if(RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    v = v2;
                }
            }
            if(z1) {
                this.consumePendingUpdateOperations();
                if(this.findContainingItemView(view0) == null) {
                    return null;
                }
                this.startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view0, v, this.mRecycler, this.mState);
                this.stopInterceptRequestLayout(false);
            }
            view1 = focusFinder0.findNextFocus(this, view0, v);
        }
        if(view1 != null && !view1.hasFocusable()) {
            if(this.getFocusedChild() == null) {
                return super.focusSearch(view0, v);
            }
            this.l(view1, null);
            return view0;
        }
        if(view1 != null && view1 != this && view1 != view0 && this.findContainingItemView(view1) != null) {
            if(view0 != null && this.findContainingItemView(view0) != null) {
                int v3 = view0.getWidth();
                int v4 = view0.getHeight();
                this.mTempRect.set(0, 0, v3, v4);
                int v5 = view1.getWidth();
                int v6 = view1.getHeight();
                this.mTempRect2.set(0, 0, v5, v6);
                this.offsetDescendantRectToMyCoords(view0, this.mTempRect);
                this.offsetDescendantRectToMyCoords(view1, this.mTempRect2);
                int v7 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
                Rect rect0 = this.mTempRect;
                int v8 = rect0.left;
                Rect rect1 = this.mTempRect2;
                int v9 = rect1.left;
                if(v8 >= v9 && rect0.right > v9 || rect0.right >= rect1.right) {
                    v10 = rect0.right <= rect1.right && v8 < rect1.right || v8 <= v9 ? 0 : -1;
                }
                else {
                    v10 = 1;
                }
                int v11 = rect0.top;
                int v12 = rect1.top;
                if(v11 >= v12 && rect0.bottom > v12 || rect0.bottom >= rect1.bottom) {
                    v13 = rect0.bottom <= rect1.bottom && v11 < rect1.bottom || v11 <= v12 ? 0 : -1;
                }
                else {
                    v13 = 1;
                }
                switch(v) {
                    case 1: {
                        return v13 < 0 || v13 == 0 && v10 * v7 < 0 ? view1 : super.focusSearch(view0, 1);
                    }
                    case 2: {
                        return v13 <= 0 && (v13 != 0 || v10 * v7 <= 0) ? super.focusSearch(view0, 2) : view1;
                    }
                    case 17: {
                        return v10 >= 0 ? super.focusSearch(view0, 17) : view1;
                    }
                    case 33: {
                        return v13 >= 0 ? super.focusSearch(view0, 33) : view1;
                    }
                    case 66: {
                        return v10 <= 0 ? super.focusSearch(view0, 66) : view1;
                    }
                    case 130: {
                        return v13 <= 0 ? super.focusSearch(view0, 130) : view1;
                    }
                    default: {
                        StringBuilder stringBuilder0 = new StringBuilder("Invalid direction: ");
                        stringBuilder0.append(v);
                        throw new IllegalArgumentException(b.h(this, stringBuilder0));
                    }
                }
            }
            return view1;
        }
        return super.focusSearch(view0, v);
    }

    public final void g(MotionEvent motionEvent0, int v, int v1) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.mLayoutSuppressed) {
            return;
        }
        int v2 = 0;
        this.mReusableIntPair[0] = 0;
        this.mReusableIntPair[1] = 0;
        boolean z = recyclerView$LayoutManager0.canScrollHorizontally();
        boolean z1 = this.mLayout.canScrollVertically();
        int v3 = z1 ? z | 2 : z;
        float f = motionEvent0 == null ? ((float)this.getHeight()) / 2.0f : motionEvent0.getY();
        float f1 = motionEvent0 == null ? ((float)this.getWidth()) / 2.0f : motionEvent0.getX();
        int v4 = v - this.j(f, v);
        int v5 = v1 - this.k(f1, v1);
        this.startNestedScroll(v3, 1);
        if(this.dispatchNestedPreScroll((z ? v4 : 0), (z1 ? v5 : 0), this.mReusableIntPair, this.mScrollOffset, 1)) {
            v4 -= this.mReusableIntPair[0];
            v5 -= this.mReusableIntPair[1];
        }
        if(z1) {
            v2 = v5;
        }
        this.scrollByInternal((z ? v4 : 0), v2, motionEvent0, 1);
        e0 e00 = this.mGapWorker;
        if(e00 != null && (v4 != 0 || v5 != 0)) {
            e00.a(this, v4, v5);
        }
        this.stopNestedScroll(1);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            throw new IllegalStateException(b.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
        }
        return recyclerView$LayoutManager0.generateDefaultLayoutParams();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            throw new IllegalStateException(b.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
        }
        return recyclerView$LayoutManager0.generateLayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            throw new IllegalStateException(b.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
        }
        return recyclerView$LayoutManager0.generateLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(ViewHolder recyclerView$ViewHolder0) {
        if(!recyclerView$ViewHolder0.hasAnyOfTheFlags(0x20C) && recyclerView$ViewHolder0.isBound()) {
            int v = recyclerView$ViewHolder0.mPosition;
            ArrayList arrayList0 = this.mAdapterHelper.b;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                androidx.recyclerview.widget.a a0 = (androidx.recyclerview.widget.a)arrayList0.get(v2);
                switch(a0.a) {
                    case 1: {
                        if(a0.b <= v) {
                            v += a0.d;
                        }
                        break;
                    }
                    case 2: {
                        int v3 = a0.b;
                        if(v3 <= v) {
                            int v4 = a0.d;
                            if(v3 + v4 > v) {
                                return -1;
                            }
                            v -= v4;
                        }
                        break;
                    }
                    case 8: {
                        int v5 = a0.b;
                        if(v5 == v) {
                            v = a0.d;
                        }
                        else {
                            if(v5 < v) {
                                --v;
                            }
                            if(a0.d <= v) {
                                ++v;
                            }
                        }
                    }
                }
            }
            return v;
        }
        return -1;
    }

    @Override  // android.view.View
    public int getBaseline() {
        return this.mLayout == null ? super.getBaseline() : -1;
    }

    // 去混淆评级： 低(20)
    public long getChangedHolderKey(ViewHolder recyclerView$ViewHolder0) {
        return this.mAdapter.hasStableIds() ? recyclerView$ViewHolder0.getItemId() : ((long)recyclerView$ViewHolder0.mPosition);
    }

    public int getChildAdapterPosition(@NonNull View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        return recyclerView$ViewHolder0 == null ? -1 : recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
    }

    @Override  // android.view.ViewGroup
    public int getChildDrawingOrder(int v, int v1) {
        return this.mChildDrawingOrderCallback == null ? super.getChildDrawingOrder(v, v1) : this.mChildDrawingOrderCallback.onGetChildDrawingOrder(v, v1);
    }

    public long getChildItemId(@NonNull View view0) {
        if(this.mAdapter != null && this.mAdapter.hasStableIds()) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            return recyclerView$ViewHolder0 == null ? -1L : recyclerView$ViewHolder0.getItemId();
        }
        return -1L;
    }

    public int getChildLayoutPosition(@NonNull View view0) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        return recyclerView$ViewHolder0 == null ? -1 : recyclerView$ViewHolder0.getLayoutPosition();
    }

    @Deprecated
    public int getChildPosition(@NonNull View view0) {
        return this.getChildAdapterPosition(view0);
    }

    public ViewHolder getChildViewHolder(@NonNull View view0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 != null && viewParent0 != this) {
            throw new IllegalArgumentException("View " + view0 + " is not a direct child of " + this);
        }
        return RecyclerView.getChildViewHolderInt(view0);
    }

    public static ViewHolder getChildViewHolderInt(View view0) {
        return view0 == null ? null : ((LayoutParams)view0.getLayoutParams()).a;
    }

    @Override  // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view0, @NonNull Rect rect0) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view0, rect0);
    }

    public static void getDecoratedBoundsWithMarginsInt(View view0, Rect rect0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        rect0.set(view0.getLeft() - recyclerView$LayoutParams0.b.left - recyclerView$LayoutParams0.leftMargin, view0.getTop() - recyclerView$LayoutParams0.b.top - recyclerView$LayoutParams0.topMargin, view0.getRight() + recyclerView$LayoutParams0.b.right + recyclerView$LayoutParams0.rightMargin, view0.getBottom() + recyclerView$LayoutParams0.b.bottom + recyclerView$LayoutParams0.bottomMargin);
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view0) {
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        Rect rect0 = recyclerView$LayoutParams0.b;
        if(!recyclerView$LayoutParams0.c) {
            return rect0;
        }
        if(this.mState.isPreLayout() && (recyclerView$LayoutParams0.isItemChanged() || recyclerView$LayoutParams0.isViewInvalid())) {
            return rect0;
        }
        rect0.set(0, 0, 0, 0);
        int v = this.mItemDecorations.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.mTempRect.set(0, 0, 0, 0);
            ((ItemDecoration)this.mItemDecorations.get(v1)).getItemOffsets(this.mTempRect, view0, this, this.mState);
            rect0.left += this.mTempRect.left;
            rect0.top += this.mTempRect.top;
            rect0.right += this.mTempRect.right;
            rect0.bottom += this.mTempRect.bottom;
        }
        recyclerView$LayoutParams0.c = false;
        return rect0;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int v) {
        int v1 = this.getItemDecorationCount();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(v + " is an invalid index for size " + v1);
        }
        return (ItemDecoration)this.mItemDecorations.get(v);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    // 去混淆评级： 低(20)
    public long getNanoTime() [...] // 潜在的解密器

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.b();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if(this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    public final void h(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.mScrollPointerId) {
            int v1 = v == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent0.getPointerId(v1);
            float f = motionEvent0.getX(v1);
            this.mLastTouchX = (int)(f + 0.5f);
            this.mInitialTouchX = (int)(f + 0.5f);
            float f1 = motionEvent0.getY(v1);
            this.mLastTouchY = (int)(f1 + 0.5f);
            this.mInitialTouchY = (int)(f1 + 0.5f);
        }
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().hasNestedScrollingParent();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int v) {
        return this.getScrollingChildHelper().hasNestedScrollingParent(v);
    }

    // 去混淆评级： 低(30)
    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public final void i() {
        boolean z = false;
        if(this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.b b0 = this.mAdapterHelper;
            b0.j(b0.b);
            b0.j(b0.c);
            b0.f = 0;
            if(this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if(this.mItemAnimator == null || !this.mLayout.supportsPredictiveItemAnimations()) {
            this.mAdapterHelper.c();
        }
        else {
            this.mAdapterHelper.i();
        }
        boolean z1 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((this.mDataSetHasChangedAfterLayout || z1 || this.mLayout.mRequestedSimpleAnimations) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds()));
        State recyclerView$State0 = this.mState;
        if(recyclerView$State0.k && z1 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            z = true;
        }
        recyclerView$State0.l = z;
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.b(new k1(this));
    }

    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable0, Drawable drawable0, StateListDrawable stateListDrawable1, Drawable drawable1) {
        if(stateListDrawable0 == null || drawable0 == null || stateListDrawable1 == null || drawable1 == null) {
            throw new IllegalArgumentException(b.h(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources0 = this.getContext().getResources();
        new b0(this, stateListDrawable0, drawable0, stateListDrawable1, drawable1, resources0.getDimensionPixelSize(dimen.fastscroll_default_thickness), resources0.getDimensionPixelSize(dimen.fastscroll_minimum_range), resources0.getDimensionPixelOffset(dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if(this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        return this.mAccessibilityManager != null && this.mAccessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        return this.mItemAnimator != null && this.mItemAnimator.isRunning();
    }

    @Override  // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return this.isLayoutSuppressed();
    }

    @Override  // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().isNestedScrollingEnabled();
    }

    public final int j(float f, int v) {
        float f1 = f / ((float)this.getHeight());
        float f2 = ((float)v) / ((float)this.getWidth());
        float f3 = 0.0f;
        if(this.mLeftGlow != null && EdgeEffectCompat.getDistance(this.mLeftGlow) != 0.0f) {
            if(this.canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            }
            else {
                float f4 = EdgeEffectCompat.onPullDistance(this.mLeftGlow, -f2, 1.0f - f1);
                if(EdgeEffectCompat.getDistance(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f3 = -f4;
            }
            this.invalidate();
            return Math.round(f3 * ((float)this.getWidth()));
        }
        if(this.mRightGlow != null && EdgeEffectCompat.getDistance(this.mRightGlow) != 0.0f) {
            if(this.canScrollHorizontally(1)) {
                this.mRightGlow.onRelease();
            }
            else {
                float f5 = EdgeEffectCompat.onPullDistance(this.mRightGlow, f2, f1);
                if(EdgeEffectCompat.getDistance(this.mRightGlow) == 0.0f) {
                    this.mRightGlow.onRelease();
                }
                f3 = f5;
            }
            this.invalidate();
        }
        return Math.round(f3 * ((float)this.getWidth()));
    }

    public void jumpToPositionForSmoothScroller(int v) {
        if(this.mLayout == null) {
            return;
        }
        this.setScrollState(2);
        this.mLayout.scrollToPosition(v);
        this.awakenScrollBars();
    }

    public final int k(float f, int v) {
        float f1 = f / ((float)this.getWidth());
        float f2 = ((float)v) / ((float)this.getHeight());
        float f3 = 0.0f;
        if(this.mTopGlow != null && EdgeEffectCompat.getDistance(this.mTopGlow) != 0.0f) {
            if(this.canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            }
            else {
                float f4 = EdgeEffectCompat.onPullDistance(this.mTopGlow, -f2, f1);
                if(EdgeEffectCompat.getDistance(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f3 = -f4;
            }
            this.invalidate();
            return Math.round(f3 * ((float)this.getHeight()));
        }
        if(this.mBottomGlow != null && EdgeEffectCompat.getDistance(this.mBottomGlow) != 0.0f) {
            if(this.canScrollVertically(1)) {
                this.mBottomGlow.onRelease();
            }
            else {
                float f5 = EdgeEffectCompat.onPullDistance(this.mBottomGlow, f2, 1.0f - f1);
                if(EdgeEffectCompat.getDistance(this.mBottomGlow) == 0.0f) {
                    this.mBottomGlow.onRelease();
                }
                f3 = f5;
            }
            this.invalidate();
        }
        return Math.round(f3 * ((float)this.getHeight()));
    }

    public final void l(View view0, View view1) {
        View view2 = view1 == null ? view0 : view1;
        int v = view2.getWidth();
        int v1 = view2.getHeight();
        this.mTempRect.set(0, 0, v, v1);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view2.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof LayoutParams && !((LayoutParams)viewGroup$LayoutParams0).c) {
            this.mTempRect.left -= ((LayoutParams)viewGroup$LayoutParams0).b.left;
            this.mTempRect.right += ((LayoutParams)viewGroup$LayoutParams0).b.right;
            this.mTempRect.top -= ((LayoutParams)viewGroup$LayoutParams0).b.top;
            this.mTempRect.bottom += ((LayoutParams)viewGroup$LayoutParams0).b.bottom;
        }
        if(view1 != null) {
            this.offsetDescendantRectToMyCoords(view1, this.mTempRect);
            this.offsetRectIntoDescendantCoords(view0, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view0, this.mTempRect, !this.mFirstLayoutComplete, view1 == null);
    }

    public final void m() {
        VelocityTracker velocityTracker0 = this.mVelocityTracker;
        if(velocityTracker0 != null) {
            velocityTracker0.clear();
        }
        boolean z = false;
        this.stopNestedScroll(0);
        EdgeEffect edgeEffect0 = this.mLeftGlow;
        if(edgeEffect0 != null) {
            edgeEffect0.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect1 = this.mTopGlow;
        if(edgeEffect1 != null) {
            edgeEffect1.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if(edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mBottomGlow;
        if(edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if(z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void markItemDecorInsetsDirty() {
        int v = this.mChildHelper.a.a.getChildCount();
        for(int v2 = 0; v2 < v; ++v2) {
            ((LayoutParams)this.mChildHelper.a.a.getChildAt(v2).getLayoutParams()).c = true;
        }
        ArrayList arrayList0 = this.mRecycler.c;
        int v3 = arrayList0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)((ViewHolder)arrayList0.get(v1)).itemView.getLayoutParams();
            if(recyclerView$LayoutParams0 != null) {
                recyclerView$LayoutParams0.c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int v = this.mChildHelper.a.a.getChildCount();
        for(int v2 = 0; v2 < v; ++v2) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v2));
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore()) {
                recyclerView$ViewHolder0.addFlags(6);
            }
        }
        this.markItemDecorInsetsDirty();
        Recycler recyclerView$Recycler0 = this.mRecycler;
        ArrayList arrayList0 = recyclerView$Recycler0.c;
        int v3 = arrayList0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ViewHolder recyclerView$ViewHolder1 = (ViewHolder)arrayList0.get(v1);
            if(recyclerView$ViewHolder1 != null) {
                recyclerView$ViewHolder1.addFlags(6);
                recyclerView$ViewHolder1.addChangePayload(null);
            }
        }
        Adapter recyclerView$Adapter0 = RecyclerView.this.mAdapter;
        if(recyclerView$Adapter0 == null || !recyclerView$Adapter0.hasStableIds()) {
            recyclerView$Recycler0.f();
        }
    }

    public final void n(Adapter recyclerView$Adapter0, boolean z, boolean z1) {
        Adapter recyclerView$Adapter1 = this.mAdapter;
        if(recyclerView$Adapter1 != null) {
            recyclerView$Adapter1.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if(!z || z1) {
            this.removeAndRecycleViews();
        }
        androidx.recyclerview.widget.b b0 = this.mAdapterHelper;
        b0.j(b0.b);
        b0.j(b0.c);
        b0.f = 0;
        Adapter recyclerView$Adapter2 = this.mAdapter;
        this.mAdapter = recyclerView$Adapter0;
        if(recyclerView$Adapter0 != null) {
            recyclerView$Adapter0.registerAdapterDataObserver(this.mObserver);
            recyclerView$Adapter0.onAttachedToRecyclerView(this);
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.onAdapterChanged(recyclerView$Adapter2, this.mAdapter);
        }
        Recycler recyclerView$Recycler0 = this.mRecycler;
        Adapter recyclerView$Adapter3 = this.mAdapter;
        recyclerView$Recycler0.clear();
        recyclerView$Recycler0.e(recyclerView$Adapter2, true);
        RecycledViewPool recyclerView$RecycledViewPool0 = recyclerView$Recycler0.b();
        if(recyclerView$Adapter2 != null) {
            --recyclerView$RecycledViewPool0.b;
        }
        if(!z && recyclerView$RecycledViewPool0.b == 0) {
            recyclerView$RecycledViewPool0.clear();
        }
        if(recyclerView$Adapter3 == null) {
            recyclerView$RecycledViewPool0.getClass();
        }
        else {
            ++recyclerView$RecycledViewPool0.b;
        }
        recyclerView$Recycler0.d();
        this.mState.g = true;
    }

    public void nestedScrollBy(int v, int v1) {
        this.g(null, v, v1);
    }

    public final boolean o(EdgeEffect edgeEffect0, int v, int v1) {
        if(v > 0) {
            return true;
        }
        float f = EdgeEffectCompat.getDistance(edgeEffect0);
        return ((float)(Math.exp(((double)RecyclerView.DECELERATION_RATE) / (((double)RecyclerView.DECELERATION_RATE) - 1.0) * Math.log(((float)Math.abs(-v)) * 0.35f / (this.mPhysicalCoef * 0.015f))) * ((double)(this.mPhysicalCoef * 0.015f)))) < f * ((float)v1);
    }

    public void offsetChildrenHorizontal(@Px int v) {
        int v1 = this.mChildHelper.c();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.mChildHelper.b(v2).offsetLeftAndRight(v);
        }
    }

    public void offsetChildrenVertical(@Px int v) {
        int v1 = this.mChildHelper.c();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.mChildHelper.b(v2).offsetTopAndBottom(v);
        }
    }

    public void offsetPositionRecordsForInsert(int v, int v1) {
        int v2 = this.mChildHelper.a.a.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v3));
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore() && recyclerView$ViewHolder0.mPosition >= v) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + v3 + " holder " + recyclerView$ViewHolder0 + " now at position " + (recyclerView$ViewHolder0.mPosition + v1));
                }
                recyclerView$ViewHolder0.offsetPosition(v1, false);
                this.mState.g = true;
            }
        }
        ArrayList arrayList0 = this.mRecycler.c;
        int v4 = arrayList0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            ViewHolder recyclerView$ViewHolder1 = (ViewHolder)arrayList0.get(v5);
            if(recyclerView$ViewHolder1 != null && recyclerView$ViewHolder1.mPosition >= v) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + v5 + " holder " + recyclerView$ViewHolder1 + " now at position " + (recyclerView$ViewHolder1.mPosition + v1));
                }
                recyclerView$ViewHolder1.offsetPosition(v1, false);
            }
        }
        this.requestLayout();
    }

    public void offsetPositionRecordsForMove(int v, int v1) {
        int v9;
        int v8;
        int v6;
        int v5;
        int v4;
        int v2 = this.mChildHelper.a.a.getChildCount();
        int v3 = 1;
        if(v < v1) {
            v4 = v;
            v5 = v1;
            v6 = -1;
        }
        else {
            v5 = v;
            v4 = v1;
            v6 = 1;
        }
        for(int v7 = 0; v7 < v2; ++v7) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v7));
            if(recyclerView$ViewHolder0 != null && (recyclerView$ViewHolder0.mPosition >= v4 && recyclerView$ViewHolder0.mPosition <= v5)) {
                if(RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + v7 + " holder " + recyclerView$ViewHolder0);
                }
                if(recyclerView$ViewHolder0.mPosition == v) {
                    recyclerView$ViewHolder0.offsetPosition(v1 - v, false);
                }
                else {
                    recyclerView$ViewHolder0.offsetPosition(v6, false);
                }
                this.mState.g = true;
            }
        }
        Recycler recyclerView$Recycler0 = this.mRecycler;
        recyclerView$Recycler0.getClass();
        if(v < v1) {
            v8 = v1;
            v3 = -1;
            v9 = v;
        }
        else {
            v8 = v;
            v9 = v1;
        }
        ArrayList arrayList0 = recyclerView$Recycler0.c;
        int v10 = arrayList0.size();
        for(int v11 = 0; v11 < v10; ++v11) {
            ViewHolder recyclerView$ViewHolder1 = (ViewHolder)arrayList0.get(v11);
            if(recyclerView$ViewHolder1 != null) {
                int v12 = recyclerView$ViewHolder1.mPosition;
                if(v12 >= v9 && v12 <= v8) {
                    if(v12 == v) {
                        recyclerView$ViewHolder1.offsetPosition(v1 - v, false);
                    }
                    else {
                        recyclerView$ViewHolder1.offsetPosition(v3, false);
                    }
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + v11 + " holder " + recyclerView$ViewHolder1);
                    }
                }
            }
        }
        this.requestLayout();
    }

    public void offsetPositionRecordsForRemove(int v, int v1, boolean z) {
        int v2 = v + v1;
        int v3 = this.mChildHelper.a.a.getChildCount();
        for(int v4 = 0; v4 < v3; ++v4) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v4));
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore()) {
                int v5 = recyclerView$ViewHolder0.mPosition;
                if(v5 >= v2) {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + v4 + " holder " + recyclerView$ViewHolder0 + " now at position " + (recyclerView$ViewHolder0.mPosition - v1));
                    }
                    recyclerView$ViewHolder0.offsetPosition(-v1, z);
                    this.mState.g = true;
                }
                else if(v5 >= v) {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + v4 + " holder " + recyclerView$ViewHolder0 + " now REMOVED");
                    }
                    recyclerView$ViewHolder0.flagRemovedAndOffsetPosition(v - 1, -v1, z);
                    this.mState.g = true;
                }
            }
        }
        Recycler recyclerView$Recycler0 = this.mRecycler;
        ArrayList arrayList0 = recyclerView$Recycler0.c;
        for(int v6 = arrayList0.size() - 1; v6 >= 0; --v6) {
            ViewHolder recyclerView$ViewHolder1 = (ViewHolder)arrayList0.get(v6);
            if(recyclerView$ViewHolder1 != null) {
                int v7 = recyclerView$ViewHolder1.mPosition;
                if(v7 >= v2) {
                    if(RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + v6 + " holder " + recyclerView$ViewHolder1 + " now at position " + (recyclerView$ViewHolder1.mPosition - v1));
                    }
                    recyclerView$ViewHolder1.offsetPosition(-v1, z);
                }
                else if(v7 >= v) {
                    recyclerView$ViewHolder1.addFlags(8);
                    recyclerView$Recycler0.g(v6);
                }
            }
        }
        this.requestLayout();
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if(!this.mFirstLayoutComplete || this.isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        this.mRecycler.d();
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal0 = e0.e;
            e0 e00 = (e0)threadLocal0.get();
            this.mGapWorker = e00;
            if(e00 == null) {
                e0 e01 = new e0();  // 初始化器: Ljava/lang/Object;-><init>()V
                e01.a = new ArrayList();
                e01.d = new ArrayList();
                this.mGapWorker = e01;
                Display display0 = ViewCompat.getDisplay(this);
                if(this.isInEditMode() || display0 == null) {
                    f = 60.0f;
                }
                else {
                    f = display0.getRefreshRate();
                    if(f < 30.0f) {
                        f = 60.0f;
                    }
                }
                e0 e02 = this.mGapWorker;
                e02.c = (long)(1000000000.0f / f);
                threadLocal0.set(e02);
            }
            e0 e03 = this.mGapWorker;
            e03.getClass();
            ArrayList arrayList0 = e03.a;
            if(RecyclerView.sDebugAssertionsEnabled && arrayList0.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList0.add(this);
        }
    }

    public void onChildAttachedToWindow(@NonNull View view0) {
    }

    public void onChildDetachedFromWindow(@NonNull View view0) {
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ItemAnimator recyclerView$ItemAnimator0 = this.mItemAnimator;
        if(recyclerView$ItemAnimator0 != null) {
            recyclerView$ItemAnimator0.endAnimations();
        }
        this.stopScroll();
        this.mIsAttached = false;
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        this.removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while(i2.d.acquire() != null) {
        }
        Recycler recyclerView$Recycler0 = this.mRecycler;
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = recyclerView$Recycler0.c;
            if(v >= arrayList0.size()) {
                break;
            }
            PoolingContainer.callPoolingContainerOnRelease(((ViewHolder)arrayList0.get(v)).itemView);
        }
        recyclerView$Recycler0.e(RecyclerView.this.mAdapter, false);
        PoolingContainer.callPoolingContainerOnReleaseForChildren(this);
        if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
            e0 e00 = this.mGapWorker;
            if(e00 != null) {
                boolean z = e00.a.remove(this);
                if(RecyclerView.sDebugAssertionsEnabled && !z) {
                    throw new IllegalStateException("RecyclerView removal failed!");
                }
                this.mGapWorker = null;
            }
        }
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.mItemDecorations.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ItemDecoration)this.mItemDecorations.get(v1)).onDraw(canvas0, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        ++this.mLayoutOrScrollCounter;
    }

    public void onExitLayoutOrScroll() {
        this.onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int v = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = v;
        if(v < 1) {
            if(RecyclerView.sDebugAssertionsEnabled && v < 0) {
                throw new IllegalStateException(b.h(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if(z) {
                int v1 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if(v1 != 0 && this.isAccessibilityEnabled()) {
                    AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain();
                    accessibilityEvent0.setEventType(0x800);
                    AccessibilityEventCompat.setContentChangeTypes(accessibilityEvent0, v1);
                    this.sendAccessibilityEventUnchecked(accessibilityEvent0);
                }
                this.dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    @Override  // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        float f1;
        float f;
        if(this.mLayout == null) {
            return false;
        }
        if(this.mLayoutSuppressed) {
            return false;
        }
        if(motionEvent0.getAction() == 8) {
            if((motionEvent0.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent0.getAxisValue(9) : 0.0f;
                f1 = this.mLayout.canScrollHorizontally() ? motionEvent0.getAxisValue(10) : 0.0f;
            }
            else if((motionEvent0.getSource() & 0x400000) == 0) {
                f = 0.0f;
                f1 = 0.0f;
            }
            else {
                float f2 = motionEvent0.getAxisValue(26);
                if(this.mLayout.canScrollVertically()) {
                    f = -f2;
                    f1 = 0.0f;
                }
                else if(this.mLayout.canScrollHorizontally()) {
                    f1 = f2;
                    f = 0.0f;
                }
                else {
                    f = 0.0f;
                    f1 = 0.0f;
                }
            }
            if(f != 0.0f || f1 != 0.0f) {
                this.g(motionEvent0, ((int)(f1 * this.mScaledHorizontalScrollFactor)), ((int)(f * this.mScaledVerticalScrollFactor)));
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z3;
        boolean z2;
        if(this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if(this.e(motionEvent0)) {
            this.m();
            this.setScrollState(0);
            return true;
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            return false;
        }
        boolean z = recyclerView$LayoutManager0.canScrollHorizontally();
        boolean z1 = this.mLayout.canScrollVertically();
        if(this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent0);
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        switch(v) {
            case 0: {
                if(this.mIgnoreMotionEventTillDown) {
                    this.mIgnoreMotionEventTillDown = false;
                }
                this.mScrollPointerId = motionEvent0.getPointerId(0);
                float f = motionEvent0.getX();
                this.mLastTouchX = (int)(f + 0.5f);
                this.mInitialTouchX = (int)(f + 0.5f);
                float f1 = motionEvent0.getY();
                this.mLastTouchY = (int)(f1 + 0.5f);
                this.mInitialTouchY = (int)(f1 + 0.5f);
                if(this.mLeftGlow == null || EdgeEffectCompat.getDistance(this.mLeftGlow) == 0.0f || this.canScrollHorizontally(-1)) {
                    z2 = false;
                }
                else {
                    EdgeEffectCompat.onPullDistance(this.mLeftGlow, 0.0f, 1.0f - motionEvent0.getY() / ((float)this.getHeight()));
                    z2 = true;
                }
                if(this.mRightGlow != null && EdgeEffectCompat.getDistance(this.mRightGlow) != 0.0f && !this.canScrollHorizontally(1)) {
                    EdgeEffectCompat.onPullDistance(this.mRightGlow, 0.0f, motionEvent0.getY() / ((float)this.getHeight()));
                    z2 = true;
                }
                if(this.mTopGlow != null && EdgeEffectCompat.getDistance(this.mTopGlow) != 0.0f && !this.canScrollVertically(-1)) {
                    EdgeEffectCompat.onPullDistance(this.mTopGlow, 0.0f, motionEvent0.getX() / ((float)this.getWidth()));
                    z2 = true;
                }
                if(this.mBottomGlow != null && EdgeEffectCompat.getDistance(this.mBottomGlow) != 0.0f && !this.canScrollVertically(1)) {
                    EdgeEffectCompat.onPullDistance(this.mBottomGlow, 0.0f, 1.0f - motionEvent0.getX() / ((float)this.getWidth()));
                    z2 = true;
                }
                if(z2 || this.mScrollState == 2) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    this.setScrollState(1);
                    this.stopNestedScroll(1);
                }
                this.mNestedOffsets[1] = 0;
                this.mNestedOffsets[0] = 0;
                if(z1) {
                    z |= 2;
                }
                this.startNestedScroll(((int)z), 0);
                return this.mScrollState == 1;
            }
            case 1: {
                this.mVelocityTracker.clear();
                this.stopNestedScroll(0);
                return this.mScrollState == 1;
            }
            case 2: {
                int v2 = motionEvent0.findPointerIndex(this.mScrollPointerId);
                if(v2 < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                float f2 = motionEvent0.getX(v2);
                float f3 = motionEvent0.getY(v2);
                if(this.mScrollState != 1) {
                    int v3 = ((int)(f3 + 0.5f)) - this.mInitialTouchY;
                    if(!z || Math.abs(((int)(f2 + 0.5f)) - this.mInitialTouchX) <= this.mTouchSlop) {
                        z3 = false;
                    }
                    else {
                        this.mLastTouchX = (int)(f2 + 0.5f);
                        z3 = true;
                    }
                    if(z1 && Math.abs(v3) > this.mTouchSlop) {
                        this.mLastTouchY = (int)(f3 + 0.5f);
                        z3 = true;
                    }
                    if(z3) {
                        this.setScrollState(1);
                        return this.mScrollState == 1;
                    }
                }
                return this.mScrollState == 1;
            }
            case 3: {
                this.m();
                this.setScrollState(0);
                return this.mScrollState == 1;
            }
            case 5: {
                this.mScrollPointerId = motionEvent0.getPointerId(v1);
                float f4 = motionEvent0.getX(v1);
                this.mLastTouchX = (int)(f4 + 0.5f);
                this.mInitialTouchX = (int)(f4 + 0.5f);
                float f5 = motionEvent0.getY(v1);
                this.mLastTouchY = (int)(f5 + 0.5f);
                this.mInitialTouchY = (int)(f5 + 0.5f);
                return this.mScrollState == 1;
            }
            case 6: {
                this.h(motionEvent0);
                return this.mScrollState == 1;
            }
            default: {
                return this.mScrollState == 1;
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        TraceCompat.beginSection("RV OnLayout");
        this.dispatchLayout();
        TraceCompat.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        boolean z = false;
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            this.defaultOnMeasure(v, v1);
            return;
        }
        if(recyclerView$LayoutManager0.isAutoMeasureEnabled()) {
            int v2 = View.MeasureSpec.getMode(v);
            int v3 = View.MeasureSpec.getMode(v1);
            this.mLayout.onMeasure(this.mRecycler, this.mState, v, v1);
            if(v2 == 0x40000000 && v3 == 0x40000000) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if(!z && this.mAdapter != null) {
                if(this.mState.e == 1) {
                    this.c();
                }
                this.mLayout.setMeasureSpecs(v, v1);
                this.mState.j = true;
                this.d();
                this.mLayout.setMeasuredDimensionFromChildren(v, v1);
                if(this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000));
                    this.mState.j = true;
                    this.d();
                    this.mLayout.setMeasuredDimensionFromChildren(v, v1);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = this.getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = this.getMeasuredHeight();
                return;
            }
            return;
        }
        if(this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, v, v1);
            return;
        }
        if(this.mAdapterUpdateDuringMeasure) {
            this.startInterceptRequestLayout();
            this.onEnterLayoutOrScroll();
            this.i();
            this.onExitLayoutOrScroll();
            State recyclerView$State0 = this.mState;
            if(recyclerView$State0.l) {
                recyclerView$State0.h = true;
            }
            else {
                this.mAdapterHelper.c();
                this.mState.h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            this.stopInterceptRequestLayout(false);
        }
        else if(this.mState.l) {
            this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
            return;
        }
        Adapter recyclerView$Adapter0 = this.mAdapter;
        this.mState.f = recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount();
        this.startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, v, v1);
        this.stopInterceptRequestLayout(false);
        this.mState.h = false;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int v, Rect rect0) {
        return this.isComputingLayout() ? false : super.onRequestFocusInDescendants(v, rect0);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        this.mPendingSavedState = (SavedState)parcelable0;
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.requestLayout();
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        SavedState recyclerView$SavedState0 = this.mPendingSavedState;
        if(recyclerView$SavedState0 != null) {
            parcelable0.b = recyclerView$SavedState0.b;
            return parcelable0;
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            parcelable0.b = recyclerView$LayoutManager0.onSaveInstanceState();
            return parcelable0;
        }
        parcelable0.b = null;
        return parcelable0;
    }

    public void onScrollStateChanged(int v) {
    }

    public void onScrolled(@Px int v, @Px int v1) {
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2 || v1 != v3) {
            this.invalidateGlows();
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z3;
        boolean z;
        if(!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            OnItemTouchListener recyclerView$OnItemTouchListener0 = this.mInterceptingOnItemTouchListener;
            if(recyclerView$OnItemTouchListener0 != null) {
                recyclerView$OnItemTouchListener0.onTouchEvent(this, motionEvent0);
                switch(motionEvent0.getAction()) {
                    case 1: 
                    case 3: {
                        this.mInterceptingOnItemTouchListener = null;
                    }
                }
                z = true;
            }
            else if(motionEvent0.getAction() == 0) {
                z = false;
            }
            else {
                z = this.e(motionEvent0);
            }
            if(z) {
                this.m();
                this.setScrollState(0);
                return true;
            }
            LayoutManager recyclerView$LayoutManager0 = this.mLayout;
            if(recyclerView$LayoutManager0 == null) {
                return false;
            }
            boolean z1 = recyclerView$LayoutManager0.canScrollHorizontally();
            boolean z2 = this.mLayout.canScrollVertically();
            if(this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            int v = motionEvent0.getActionMasked();
            int v1 = motionEvent0.getActionIndex();
            if(v == 0) {
                this.mNestedOffsets[1] = 0;
                this.mNestedOffsets[0] = 0;
            }
            MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
            motionEvent1.offsetLocation(((float)this.mNestedOffsets[0]), ((float)this.mNestedOffsets[1]));
            switch(v) {
                case 0: {
                    this.mScrollPointerId = motionEvent0.getPointerId(0);
                    float f = motionEvent0.getX();
                    this.mLastTouchX = (int)(f + 0.5f);
                    this.mInitialTouchX = (int)(f + 0.5f);
                    float f1 = motionEvent0.getY();
                    this.mLastTouchY = (int)(f1 + 0.5f);
                    this.mInitialTouchY = (int)(f1 + 0.5f);
                    if(z2) {
                        z1 |= 2;
                    }
                    this.startNestedScroll(((int)z1), 0);
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                case 1: {
                    this.mVelocityTracker.addMovement(motionEvent1);
                    this.mVelocityTracker.computeCurrentVelocity(1000, ((float)this.mMaxFlingVelocity));
                    float f2 = z1 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                    float f3 = z2 ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                    if(f2 == 0.0f && f3 == 0.0f || !this.fling(((int)f2), ((int)f3))) {
                        this.setScrollState(0);
                    }
                    this.m();
                    break;
                }
                case 2: {
                    int v2 = motionEvent0.findPointerIndex(this.mScrollPointerId);
                    if(v2 < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    float f4 = motionEvent0.getX(v2);
                    float f5 = motionEvent0.getY(v2);
                    int v3 = this.mLastTouchX - ((int)(f4 + 0.5f));
                    int v4 = this.mLastTouchY - ((int)(f5 + 0.5f));
                    if(this.mScrollState != 1) {
                        if(z1) {
                            v3 = v3 <= 0 ? Math.min(0, v3 + this.mTouchSlop) : Math.max(0, v3 - this.mTouchSlop);
                            z3 = v3 == 0 ? false : true;
                        }
                        else {
                            z3 = false;
                        }
                        if(z2) {
                            v4 = v4 <= 0 ? Math.min(0, v4 + this.mTouchSlop) : Math.max(0, v4 - this.mTouchSlop);
                            if(v4 != 0) {
                                z3 = true;
                            }
                        }
                        if(z3) {
                            this.setScrollState(1);
                        }
                    }
                    if(this.mScrollState == 1) {
                        this.mReusableIntPair[0] = 0;
                        this.mReusableIntPair[1] = 0;
                        int v5 = v3 - this.j(motionEvent0.getY(), v3);
                        int v6 = v4 - this.k(motionEvent0.getX(), v4);
                        if(this.dispatchNestedPreScroll((z1 ? v5 : 0), (z2 ? v6 : 0), this.mReusableIntPair, this.mScrollOffset, 0)) {
                            v5 -= this.mReusableIntPair[0];
                            v6 -= this.mReusableIntPair[1];
                            this.mNestedOffsets[0] += this.mScrollOffset[0];
                            this.mNestedOffsets[1] += this.mScrollOffset[1];
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.mLastTouchX = ((int)(f4 + 0.5f)) - this.mScrollOffset[0];
                        this.mLastTouchY = ((int)(f5 + 0.5f)) - this.mScrollOffset[1];
                        if(this.scrollByInternal((z1 ? v5 : 0), (z2 ? v6 : 0), motionEvent0, 0)) {
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        e0 e00 = this.mGapWorker;
                        if(e00 != null && (v5 != 0 || v6 != 0)) {
                            e00.a(this, v5, v6);
                        }
                    }
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                case 3: {
                    this.m();
                    this.setScrollState(0);
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                case 5: {
                    this.mScrollPointerId = motionEvent0.getPointerId(v1);
                    float f6 = motionEvent0.getX(v1);
                    this.mLastTouchX = (int)(f6 + 0.5f);
                    this.mInitialTouchX = (int)(f6 + 0.5f);
                    float f7 = motionEvent0.getY(v1);
                    this.mLastTouchY = (int)(f7 + 0.5f);
                    this.mInitialTouchY = (int)(f7 + 0.5f);
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                case 6: {
                    this.h(motionEvent0);
                    this.mVelocityTracker.addMovement(motionEvent1);
                    break;
                }
                default: {
                    this.mVelocityTracker.addMovement(motionEvent1);
                }
            }
            motionEvent1.recycle();
            return true;
        }
        return false;
    }

    public void postAnimationRunner() {
        if(!this.mPostedAnimatorRunner && this.mIsAttached) {
            ViewCompat.postOnAnimation(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent |= z;
        this.mDataSetHasChangedAfterLayout = true;
        this.markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0) {
        recyclerView$ViewHolder0.setFlags(0, 0x2000);
        if(this.mState.i && recyclerView$ViewHolder0.isUpdated() && !recyclerView$ViewHolder0.isRemoved() && !recyclerView$ViewHolder0.shouldIgnore()) {
            long v = this.getChangedHolderKey(recyclerView$ViewHolder0);
            this.mViewInfoStore.b.put(v, recyclerView$ViewHolder0);
        }
        SimpleArrayMap simpleArrayMap0 = this.mViewInfoStore.a;
        i2 i20 = (i2)simpleArrayMap0.get(recyclerView$ViewHolder0);
        if(i20 == null) {
            i20 = i2.a();
            simpleArrayMap0.put(recyclerView$ViewHolder0, i20);
        }
        i20.b = recyclerView$ItemAnimator$ItemHolderInfo0;
        i20.a |= 4;
    }

    public void removeAndRecycleViews() {
        ItemAnimator recyclerView$ItemAnimator0 = this.mItemAnimator;
        if(recyclerView$ItemAnimator0 != null) {
            recyclerView$ItemAnimator0.endAnimations();
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.clear();
    }

    public boolean removeAnimatingView(View view0) {
        this.startInterceptRequestLayout();
        j j0 = this.mChildHelper;
        i i0 = j0.b;
        j1 j10 = j0.a;
        int v = j0.d;
        boolean z = true;
        if(v == 1) {
            if(j0.e != view0) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z = false;
        }
        else if(v != 2) {
            int v1 = FIN.finallyOpen$NT();
            j0.d = 2;
            int v2 = j10.a.indexOfChild(view0);
            if(v2 == -1) {
                j0.g(view0);
                goto label_22;
            }
            else if(i0.d(v2)) {
                i0.f(v2);
                j0.g(view0);
                j10.removeViewAt(v2);
            label_22:
                FIN.finallyCodeBegin$NT(v1);
                j0.d = 0;
                FIN.finallyCodeEnd$NT(v1);
            }
            else {
                FIN.finallyExec$NT(v1);
                z = false;
            }
        }
        else {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        if(z) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            this.mRecycler.l(recyclerView$ViewHolder0);
            this.mRecycler.h(recyclerView$ViewHolder0);
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "after removing animated view: " + view0 + ", " + this);
            }
        }
        this.stopInterceptRequestLayout(!z);
        return z;
    }

    @Override  // android.view.ViewGroup
    public void removeDetachedView(View view0, boolean z) {
        ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
        if(recyclerView$ViewHolder0 != null) {
            if(recyclerView$ViewHolder0.isTmpDetached()) {
                recyclerView$ViewHolder0.clearTmpDetachFlag();
                view0.clearAnimation();
                this.dispatchChildDetached(view0);
                super.removeDetachedView(view0, z);
                return;
            }
            if(recyclerView$ViewHolder0.shouldIgnore()) {
                view0.clearAnimation();
                this.dispatchChildDetached(view0);
                super.removeDetachedView(view0, z);
                return;
            }
            StringBuilder stringBuilder0 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
            stringBuilder0.append(recyclerView$ViewHolder0);
            throw new IllegalArgumentException(b.h(this, stringBuilder0));
        }
        if(!RecyclerView.sDebugAssertionsEnabled) {
            view0.clearAnimation();
            this.dispatchChildDetached(view0);
            super.removeDetachedView(view0, z);
            return;
        }
        StringBuilder stringBuilder1 = new StringBuilder("No ViewHolder found for child: ");
        stringBuilder1.append(view0);
        throw new IllegalArgumentException(b.h(this, stringBuilder1));
    }

    public void removeItemDecoration(@NonNull ItemDecoration recyclerView$ItemDecoration0) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(recyclerView$ItemDecoration0);
        if(this.mItemDecorations.isEmpty()) {
            this.setWillNotDraw(this.getOverScrollMode() == 2);
        }
        this.markItemDecorInsetsDirty();
        this.requestLayout();
    }

    public void removeItemDecorationAt(int v) {
        int v1 = this.getItemDecorationCount();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(v + " is an invalid index for size " + v1);
        }
        this.removeItemDecoration(this.getItemDecorationAt(v));
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener recyclerView$OnChildAttachStateChangeListener0) {
        List list0 = this.mOnChildAttachStateListeners;
        if(list0 == null) {
            return;
        }
        list0.remove(recyclerView$OnChildAttachStateChangeListener0);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener recyclerView$OnItemTouchListener0) {
        this.mOnItemTouchListeners.remove(recyclerView$OnItemTouchListener0);
        if(this.mInterceptingOnItemTouchListener == recyclerView$OnItemTouchListener0) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener recyclerView$OnScrollListener0) {
        List list0 = this.mScrollListeners;
        if(list0 != null) {
            list0.remove(recyclerView$OnScrollListener0);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerView$RecyclerListener0) {
        this.mRecyclerListeners.remove(recyclerView$RecyclerListener0);
    }

    public void repositionShadowingViews() {
        int v = this.mChildHelper.c();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.mChildHelper.b(v1);
            ViewHolder recyclerView$ViewHolder0 = this.getChildViewHolder(view0);
            if(recyclerView$ViewHolder0 != null) {
                ViewHolder recyclerView$ViewHolder1 = recyclerView$ViewHolder0.mShadowingHolder;
                if(recyclerView$ViewHolder1 != null) {
                    View view1 = recyclerView$ViewHolder1.itemView;
                    int v2 = view0.getLeft();
                    int v3 = view0.getTop();
                    if(v2 != view1.getLeft() || v3 != view1.getTop()) {
                        view1.layout(v2, v3, view1.getWidth() + v2, view1.getHeight() + v3);
                    }
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void requestChildFocus(View view0, View view1) {
        if(!this.mLayout.onRequestChildFocus(this, this.mState, view0, view1) && view1 != null) {
            this.l(view0, view1);
        }
        super.requestChildFocus(view0, view1);
    }

    @Override  // android.view.ViewGroup
    public boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view0, rect0, z);
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int v = this.mOnItemTouchListeners.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((OnItemTouchListener)this.mOnItemTouchListeners.get(v1)).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
            return;
        }
        this.mLayoutWasDefered = true;
    }

    public void saveOldPositions() {
        int v = this.mChildHelper.a.a.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(this.mChildHelper.a.a.getChildAt(v1));
            if(RecyclerView.sDebugAssertionsEnabled && recyclerView$ViewHolder0.mPosition == -1 && !recyclerView$ViewHolder0.isRemoved()) {
                throw new IllegalStateException(b.h(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if(!recyclerView$ViewHolder0.shouldIgnore()) {
                recyclerView$ViewHolder0.saveOldPosition();
            }
        }
    }

    @Override  // android.view.View
    public void scrollBy(int v, int v1) {
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.mLayoutSuppressed) {
            return;
        }
        boolean z = recyclerView$LayoutManager0.canScrollHorizontally();
        boolean z1 = this.mLayout.canScrollVertically();
        if(z || z1) {
            if(!z) {
                v = 0;
            }
            if(!z1) {
                v1 = 0;
            }
            this.scrollByInternal(v, v1, null, 0);
        }
    }

    public boolean scrollByInternal(int v, int v1, MotionEvent motionEvent0, int v2) {
        boolean z;
        int v8;
        int v7;
        int v6;
        int v5;
        this.consumePendingUpdateOperations();
        if(this.mAdapter == null) {
            v5 = 0;
            v6 = 0;
            v7 = 0;
            v8 = 0;
        }
        else {
            this.mReusableIntPair[0] = 0;
            this.mReusableIntPair[1] = 0;
            this.scrollStep(v, v1, this.mReusableIntPair);
            int v3 = this.mReusableIntPair[0];
            int v4 = v1 - this.mReusableIntPair[1];
            v5 = this.mReusableIntPair[1];
            v6 = v3;
            v7 = v - v3;
            v8 = v4;
        }
        if(!this.mItemDecorations.isEmpty()) {
            this.invalidate();
        }
        this.mReusableIntPair[0] = 0;
        this.mReusableIntPair[1] = 0;
        this.dispatchNestedScroll(v6, v5, v7, v8, this.mScrollOffset, v2, this.mReusableIntPair);
        int v9 = this.mReusableIntPair[0];
        int v10 = this.mReusableIntPair[1];
        int v11 = this.mLastTouchX;
        int v12 = this.mScrollOffset[0];
        this.mLastTouchX = v11 - v12;
        int v13 = this.mLastTouchY;
        int v14 = this.mScrollOffset[1];
        this.mLastTouchY = v13 - v14;
        this.mNestedOffsets[0] += v12;
        this.mNestedOffsets[1] += v14;
        if(this.getOverScrollMode() != 2) {
            if(motionEvent0 != null && !MotionEventCompat.isFromSource(motionEvent0, 0x2002)) {
                float f = motionEvent0.getX();
                float f1 = (float)(v7 - v9);
                float f2 = motionEvent0.getY();
                float f3 = (float)(v8 - v10);
                if(Float.compare(f1, 0.0f) < 0) {
                    this.ensureLeftGlow();
                    EdgeEffectCompat.onPullDistance(this.mLeftGlow, -f1 / ((float)this.getWidth()), 1.0f - f2 / ((float)this.getHeight()));
                    z = true;
                }
                else if(f1 > 0.0f) {
                    this.ensureRightGlow();
                    EdgeEffectCompat.onPullDistance(this.mRightGlow, f1 / ((float)this.getWidth()), f2 / ((float)this.getHeight()));
                    z = true;
                }
                else {
                    z = false;
                }
                if(f3 < 0.0f) {
                    this.ensureTopGlow();
                    EdgeEffectCompat.onPullDistance(this.mTopGlow, -f3 / ((float)this.getHeight()), f / ((float)this.getWidth()));
                    z = true;
                }
                else if(f3 > 0.0f) {
                    this.ensureBottomGlow();
                    EdgeEffectCompat.onPullDistance(this.mBottomGlow, f3 / ((float)this.getHeight()), 1.0f - f / ((float)this.getWidth()));
                    z = true;
                }
                if(z || f1 != 0.0f || f3 != 0.0f) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
            this.considerReleasingGlowsOnScroll(v, v1);
        }
        if(v6 != 0 || v5 != 0) {
            this.dispatchOnScrolled(v6, v5);
        }
        if(!this.awakenScrollBars()) {
            this.invalidate();
        }
        return v9 != 0 || v10 != 0 || v6 != 0 || v5 != 0;
    }

    public void scrollStep(int v, int v1, @Nullable int[] arr_v) {
        this.startInterceptRequestLayout();
        this.onEnterLayoutOrScroll();
        TraceCompat.beginSection("RV Scroll");
        this.fillRemainingScrollValues(this.mState);
        int v2 = v == 0 ? 0 : this.mLayout.scrollHorizontallyBy(v, this.mRecycler, this.mState);
        int v3 = v1 == 0 ? 0 : this.mLayout.scrollVerticallyBy(v1, this.mRecycler, this.mState);
        TraceCompat.endSection();
        this.repositionShadowingViews();
        this.onExitLayoutOrScroll();
        this.stopInterceptRequestLayout(false);
        if(arr_v != null) {
            arr_v[0] = v2;
            arr_v[1] = v3;
        }
    }

    @Override  // android.view.View
    public void scrollTo(int v, int v1) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int v) {
        if(this.mLayoutSuppressed) {
            return;
        }
        this.stopScroll();
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        recyclerView$LayoutManager0.scrollToPosition(v);
        this.awakenScrollBars();
    }

    @Override  // android.view.View
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent0) {
        if(this.shouldDeferAccessibilityEvent(accessibilityEvent0)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent0);
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate0) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate0;
        ViewCompat.setAccessibilityDelegate(this, recyclerViewAccessibilityDelegate0);
    }

    public void setAdapter(@Nullable Adapter recyclerView$Adapter0) {
        this.setLayoutFrozen(false);
        this.n(recyclerView$Adapter0, false, true);
        this.processDataSetCompletelyChanged(false);
        this.requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback recyclerView$ChildDrawingOrderCallback0) {
        if(recyclerView$ChildDrawingOrderCallback0 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = recyclerView$ChildDrawingOrderCallback0;
        this.setChildrenDrawingOrderEnabled(recyclerView$ChildDrawingOrderCallback0 != null);
    }

    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(ViewHolder recyclerView$ViewHolder0, int v) {
        if(this.isComputingLayout()) {
            recyclerView$ViewHolder0.mPendingAccessibilityState = v;
            this.mPendingAccessibilityImportanceChange.add(recyclerView$ViewHolder0);
            return false;
        }
        ViewCompat.setImportantForAccessibility(recyclerView$ViewHolder0.itemView, v);
        return true;
    }

    @Override  // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if(z != this.mClipToPadding) {
            this.invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if(this.mFirstLayoutComplete) {
            this.requestLayout();
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        RecyclerView.sDebugAssertionsEnabled = z;
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory recyclerView$EdgeEffectFactory0) {
        Preconditions.checkNotNull(recyclerView$EdgeEffectFactory0);
        this.mEdgeEffectFactory = recyclerView$EdgeEffectFactory0;
        this.invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator recyclerView$ItemAnimator0) {
        ItemAnimator recyclerView$ItemAnimator1 = this.mItemAnimator;
        if(recyclerView$ItemAnimator1 != null) {
            recyclerView$ItemAnimator1.endAnimations();
            this.mItemAnimator.a = null;
        }
        this.mItemAnimator = recyclerView$ItemAnimator0;
        if(recyclerView$ItemAnimator0 != null) {
            recyclerView$ItemAnimator0.a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int v) {
        this.mRecycler.setViewCacheSize(v);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        this.suppressLayout(z);
    }

    public void setLayoutManager(@Nullable LayoutManager recyclerView$LayoutManager0) {
        j1 j10;
        if(recyclerView$LayoutManager0 == this.mLayout) {
            return;
        }
        this.stopScroll();
        if(this.mLayout == null) {
            this.mRecycler.clear();
        }
        else {
            ItemAnimator recyclerView$ItemAnimator0 = this.mItemAnimator;
            if(recyclerView$ItemAnimator0 != null) {
                recyclerView$ItemAnimator0.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.clear();
            if(this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        }
        j j0 = this.mChildHelper;
        j0.b.g();
        ArrayList arrayList0 = j0.c;
        for(int v = arrayList0.size() - 1; true; --v) {
            j10 = j0.a;
            if(v < 0) {
                break;
            }
            j10.onLeftHiddenState(((View)arrayList0.get(v)));
            arrayList0.remove(v);
        }
        j10.removeAllViews();
        this.mLayout = recyclerView$LayoutManager0;
        if(recyclerView$LayoutManager0 != null) {
            if(recyclerView$LayoutManager0.mRecyclerView != null) {
                goto label_34;
            }
            recyclerView$LayoutManager0.setRecyclerView(this);
            if(this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
                this.mRecycler.m();
                this.requestLayout();
                return;
            label_34:
                StringBuilder stringBuilder0 = new StringBuilder("LayoutManager ");
                stringBuilder0.append(recyclerView$LayoutManager0);
                stringBuilder0.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(b.h(recyclerView$LayoutManager0.mRecyclerView, stringBuilder0));
            }
        }
        this.mRecycler.m();
        this.requestLayout();
    }

    @Override  // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition0) {
        if(layoutTransition0 != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.getScrollingChildHelper().setNestedScrollingEnabled(z);
    }

    public void setOnFlingListener(@Nullable OnFlingListener recyclerView$OnFlingListener0) {
        this.mOnFlingListener = recyclerView$OnFlingListener0;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener recyclerView$OnScrollListener0) {
        this.mScrollListener = recyclerView$OnScrollListener0;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recyclerView$RecycledViewPool0) {
        Recycler recyclerView$Recycler0 = this.mRecycler;
        RecyclerView recyclerView0 = RecyclerView.this;
        recyclerView$Recycler0.e(recyclerView0.mAdapter, false);
        RecycledViewPool recyclerView$RecycledViewPool1 = recyclerView$Recycler0.g;
        if(recyclerView$RecycledViewPool1 != null) {
            --recyclerView$RecycledViewPool1.b;
        }
        recyclerView$Recycler0.g = recyclerView$RecycledViewPool0;
        if(recyclerView$RecycledViewPool0 != null && recyclerView0.getAdapter() != null) {
            ++recyclerView$Recycler0.g.b;
        }
        recyclerView$Recycler0.d();
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerView$RecyclerListener0) {
        this.mRecyclerListener = recyclerView$RecyclerListener0;
    }

    public void setScrollState(int v) {
        if(v == this.mScrollState) {
            return;
        }
        if(RecyclerView.sVerboseLoggingEnabled) {
            StringBuilder stringBuilder0 = b.s(v, "setting scroll state to ", " from ");
            stringBuilder0.append(this.mScrollState);
            Log.d("RecyclerView", stringBuilder0.toString(), new Exception());
        }
        this.mScrollState = v;
        if(v != 2) {
            this.mViewFlinger.g.removeCallbacks(this.mViewFlinger);
            this.mViewFlinger.c.abortAnimation();
            LayoutManager recyclerView$LayoutManager0 = this.mLayout;
            if(recyclerView$LayoutManager0 != null) {
                recyclerView$LayoutManager0.stopSmoothScroller();
            }
        }
        this.dispatchOnScrollStateChanged(v);
    }

    public void setScrollingTouchSlop(int v) {
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                this.mTouchSlop = viewConfiguration0.getScaledPagingTouchSlop();
                return;
            }
            default: {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + v + "; using default value");
                break;
            }
        }
        this.mTouchSlop = viewConfiguration0.getScaledTouchSlop();
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        RecyclerView.sVerboseLoggingEnabled = z;
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension recyclerView$ViewCacheExtension0) {
        this.mRecycler.h = recyclerView$ViewCacheExtension0;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        int v = 0;
        if(this.isComputingLayout()) {
            int v1 = accessibilityEvent0 == null ? 0 : AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent0);
            if(v1 != 0) {
                v = v1;
            }
            this.mEatenAccessibilityChangeFlags |= v;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(@Px int v, @Px int v1) {
        this.smoothScrollBy(v, v1, null);
    }

    public void smoothScrollBy(@Px int v, @Px int v1, @Nullable Interpolator interpolator0) {
        this.smoothScrollBy(v, v1, interpolator0, 0x80000000);
    }

    public void smoothScrollBy(@Px int v, @Px int v1, @Nullable Interpolator interpolator0, int v2) {
        this.smoothScrollBy(v, v1, interpolator0, v2, false);
    }

    public void smoothScrollBy(@Px int v, @Px int v1, @Nullable Interpolator interpolator0, int v2, boolean z) {
        int v3 = 0;
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.mLayoutSuppressed) {
            return;
        }
        if(!recyclerView$LayoutManager0.canScrollHorizontally()) {
            v = 0;
        }
        if(!this.mLayout.canScrollVertically()) {
            v1 = 0;
        }
        if(v != 0 || v1 != 0) {
            if(v2 != 0x80000000 && v2 <= 0) {
                this.scrollBy(v, v1);
                return;
            }
            if(z) {
                if(v != 0) {
                    v3 = 1;
                }
                if(v1 != 0) {
                    v3 |= 2;
                }
                this.startNestedScroll(v3, 1);
            }
            this.mViewFlinger.c(v, v1, v2, interpolator0);
        }
    }

    public void smoothScrollToPosition(int v) {
        if(this.mLayoutSuppressed) {
            return;
        }
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        recyclerView$LayoutManager0.smoothScrollToPosition(this, this.mState, v);
    }

    public void startInterceptRequestLayout() {
        int v = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = v;
        if(v == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int v) {
        return this.getScrollingChildHelper().startNestedScroll(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int v, int v1) {
        return this.getScrollingChildHelper().startNestedScroll(v, v1);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if(this.mInterceptRequestLayoutDepth < 1) {
            if(RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalStateException(b.h(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if(!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if(this.mInterceptRequestLayoutDepth == 1) {
            if(z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                this.dispatchLayout();
            }
            if(!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        --this.mInterceptRequestLayoutDepth;
    }

    @Override  // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.getScrollingChildHelper().stopNestedScroll();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int v) {
        this.getScrollingChildHelper().stopNestedScroll(v);
    }

    public void stopScroll() {
        this.setScrollState(0);
        this.mViewFlinger.g.removeCallbacks(this.mViewFlinger);
        this.mViewFlinger.c.abortAnimation();
        LayoutManager recyclerView$LayoutManager0 = this.mLayout;
        if(recyclerView$LayoutManager0 != null) {
            recyclerView$LayoutManager0.stopSmoothScroller();
        }
    }

    @Override  // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if(z != this.mLayoutSuppressed) {
            this.assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if(!z) {
                this.mLayoutSuppressed = false;
                if(this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    this.requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long v = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            this.stopScroll();
        }
    }

    public void swapAdapter(@Nullable Adapter recyclerView$Adapter0, boolean z) {
        this.setLayoutFrozen(false);
        this.n(recyclerView$Adapter0, true, z);
        this.processDataSetCompletelyChanged(true);
        this.requestLayout();
    }

    public void viewRangeUpdate(int v, int v1, Object object0) {
        int v2 = this.mChildHelper.a.a.getChildCount();
        int v3 = v1 + v;
        for(int v4 = 0; v4 < v2; ++v4) {
            View view0 = this.mChildHelper.a.a.getChildAt(v4);
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(view0);
            if(recyclerView$ViewHolder0 != null && !recyclerView$ViewHolder0.shouldIgnore() && (recyclerView$ViewHolder0.mPosition >= v && recyclerView$ViewHolder0.mPosition < v3)) {
                recyclerView$ViewHolder0.addFlags(2);
                recyclerView$ViewHolder0.addChangePayload(object0);
                ((LayoutParams)view0.getLayoutParams()).c = true;
            }
        }
        Recycler recyclerView$Recycler0 = this.mRecycler;
        ArrayList arrayList0 = recyclerView$Recycler0.c;
        for(int v5 = arrayList0.size() - 1; v5 >= 0; --v5) {
            ViewHolder recyclerView$ViewHolder1 = (ViewHolder)arrayList0.get(v5);
            if(recyclerView$ViewHolder1 != null && (recyclerView$ViewHolder1.mPosition >= v && recyclerView$ViewHolder1.mPosition < v3)) {
                recyclerView$ViewHolder1.addFlags(2);
                recyclerView$Recycler0.g(v5);
            }
        }
    }
}

