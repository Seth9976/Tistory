package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R.dimen;
import androidx.recyclerview.R.id;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper extends ItemDecoration implements OnChildAttachStateChangeListener {
    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 0xC0C0C;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 0xFA;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
        static final int RELATIVE_DIR_FLAGS = 0x303030;
        private int mCachedMaxScrollSpeed;
        private static final Interpolator sDragScrollInterpolator;
        private static final Interpolator sDragViewScrollCapInterpolator;

        static {
            Callback.sDragScrollInterpolator = new j0();  // 初始化器: Ljava/lang/Object;-><init>()V
            Callback.sDragViewScrollCapInterpolator = new k0();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public Callback() {
            this.mCachedMaxScrollSpeed = -1;
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0, @NonNull ViewHolder recyclerView$ViewHolder1) [...] // Inlined contents

        @SuppressLint({"UnknownNullness"})
        public ViewHolder chooseDropTarget(@NonNull ViewHolder recyclerView$ViewHolder0, @NonNull List list0, int v, int v1) {
            int v2 = recyclerView$ViewHolder0.itemView.getWidth();
            int v3 = recyclerView$ViewHolder0.itemView.getHeight();
            int v4 = v - recyclerView$ViewHolder0.itemView.getLeft();
            int v5 = v1 - recyclerView$ViewHolder0.itemView.getTop();
            int v6 = list0.size();
            ViewHolder recyclerView$ViewHolder1 = null;
            int v7 = -1;
            for(int v8 = 0; v8 < v6; ++v8) {
                ViewHolder recyclerView$ViewHolder2 = (ViewHolder)list0.get(v8);
                if(v4 > 0) {
                    int v9 = recyclerView$ViewHolder2.itemView.getRight() - (v2 + v);
                    if(v9 < 0 && recyclerView$ViewHolder2.itemView.getRight() > recyclerView$ViewHolder0.itemView.getRight()) {
                        int v10 = Math.abs(v9);
                        if(v10 > v7) {
                            recyclerView$ViewHolder1 = recyclerView$ViewHolder2;
                            v7 = v10;
                        }
                    }
                }
                if(v4 < 0) {
                    int v11 = recyclerView$ViewHolder2.itemView.getLeft() - v;
                    if(v11 > 0 && recyclerView$ViewHolder2.itemView.getLeft() < recyclerView$ViewHolder0.itemView.getLeft()) {
                        int v12 = Math.abs(v11);
                        if(v12 > v7) {
                            recyclerView$ViewHolder1 = recyclerView$ViewHolder2;
                            v7 = v12;
                        }
                    }
                }
                if(v5 < 0) {
                    int v13 = recyclerView$ViewHolder2.itemView.getTop() - v1;
                    if(v13 > 0 && recyclerView$ViewHolder2.itemView.getTop() < recyclerView$ViewHolder0.itemView.getTop()) {
                        int v14 = Math.abs(v13);
                        if(v14 > v7) {
                            recyclerView$ViewHolder1 = recyclerView$ViewHolder2;
                            v7 = v14;
                        }
                    }
                }
                if(v5 > 0) {
                    int v15 = recyclerView$ViewHolder2.itemView.getBottom() - (v3 + v1);
                    if(v15 < 0 && recyclerView$ViewHolder2.itemView.getBottom() > recyclerView$ViewHolder0.itemView.getBottom()) {
                        int v16 = Math.abs(v15);
                        if(v16 > v7) {
                            recyclerView$ViewHolder1 = recyclerView$ViewHolder2;
                            v7 = v16;
                        }
                    }
                }
            }
            return recyclerView$ViewHolder1;
        }

        public void clearView(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            View view0 = recyclerView$ViewHolder0.itemView;
            Object object0 = view0.getTag(id.item_touch_helper_previous_elevation);
            if(object0 instanceof Float) {
                ViewCompat.setElevation(view0, ((float)(((Float)object0))));
            }
            view0.setTag(id.item_touch_helper_previous_elevation, null);
            view0.setTranslationX(0.0f);
            view0.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int v, int v1) {
            if((v & 0x303030) == 0) {
                return v;
            }
            if(v1 == 0) {
                return 0xFFCFCFCF & v | (v & 0x303030) >> 2;
            }
            int v2 = (v & 0x303030) >> 1;
            return 0xFFCFCFCF & v | 0xFFCFCFCF & v2 | (v2 & 0x303030) >> 2;
        }

        public static int convertToRelativeDirection(int v, int v1) {
            if((v & 0xC0C0C) == 0) {
                return v;
            }
            if(v1 == 0) {
                return 0xFFF3F3F3 & v | (v & 0xC0C0C) << 2;
            }
            int v2 = (v & 0xC0C0C) << 1;
            return 0xFFF3F3F3 & v | 0xFFF3F3F3 & v2 | (v2 & 0xC0C0C) << 2;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0) {
            return this.convertToAbsoluteDirection(this.getMovementFlags(recyclerView0, recyclerView$ViewHolder0), ViewCompat.getLayoutDirection(recyclerView0));
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView0, int v, float f, float f1) {
            ItemAnimator recyclerView$ItemAnimator0 = recyclerView0.getItemAnimator();
            if(recyclerView$ItemAnimator0 == null) {
                return v == 8 ? 200L : 0xFAL;
            }
            return v == 8 ? recyclerView$ItemAnimator0.getMoveDuration() : recyclerView$ItemAnimator0.getRemoveDuration();
        }

        public int getBoundingBoxMargin() [...] // Inlined contents

        @NonNull
        public static ItemTouchUIUtil getDefaultUIUtil() {
            return o0.a;
        }

        public float getMoveThreshold(@NonNull ViewHolder recyclerView$ViewHolder0) [...] // Inlined contents

        public abstract int getMovementFlags(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2);

        public float getSwipeEscapeVelocity(float f) [...] // Inlined contents

        public float getSwipeThreshold(@NonNull ViewHolder recyclerView$ViewHolder0) [...] // Inlined contents

        public float getSwipeVelocityThreshold(float f) [...] // Inlined contents

        public boolean hasDragFlag(RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0) {
            return (this.getAbsoluteMovementFlags(recyclerView0, recyclerView$ViewHolder0) & 0xFF0000) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0) {
            return (this.getAbsoluteMovementFlags(recyclerView0, recyclerView$ViewHolder0) & 0xFF00) != 0;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView0, int v, int v1, int v2, long v3) {
            if(this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView0.getResources().getDimensionPixelSize(dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int v4 = this.mCachedMaxScrollSpeed;
            float f = 1.0f;
            int v5 = (int)(Callback.sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, ((float)Math.abs(v1)) * 1.0f / ((float)v))) * ((float)(((int)Math.signum(v1)) * v4)));
            if(v3 <= 2000L) {
                f = ((float)v3) / 2000.0f;
            }
            int v6 = (int)(Callback.sDragScrollInterpolator.getInterpolation(f) * ((float)v5));
            if(v6 == 0) {
                return v1 <= 0 ? -1 : 1;
            }
            return v6;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public static int makeFlag(int v, int v1) [...] // Inlined contents

        public static int makeMovementFlags(int v, int v1) [...] // 潜在的解密器

        public void onChildDraw(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0, float f, float f1, int v, boolean z) {
            View view0 = recyclerView$ViewHolder0.itemView;
            if(z && view0.getTag(id.item_touch_helper_previous_elevation) == null) {
                Float float0 = ViewCompat.getElevation(view0);
                int v1 = recyclerView0.getChildCount();
                float f2 = 0.0f;
                for(int v2 = 0; v2 < v1; ++v2) {
                    View view1 = recyclerView0.getChildAt(v2);
                    if(view1 != view0) {
                        float f3 = ViewCompat.getElevation(view1);
                        if(f3 > f2) {
                            f2 = f3;
                        }
                    }
                }
                ViewCompat.setElevation(view0, f2 + 1.0f);
                view0.setTag(id.item_touch_helper_previous_elevation, float0);
            }
            view0.setTranslationX(f);
            view0.setTranslationY(f1);
        }

        public void onChildDrawOver(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @SuppressLint({"UnknownNullness"}) ViewHolder recyclerView$ViewHolder0, float f, float f1, int v, boolean z) {
        }

        public void onDraw(Canvas canvas0, RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0, List list0, int v, float f, float f1) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                n0 n00 = (n0)list0.get(v2);
                float f2 = n00.a;
                float f3 = n00.c;
                ViewHolder recyclerView$ViewHolder1 = n00.e;
                n00.i = Float.compare(f2, f3) == 0 ? recyclerView$ViewHolder1.itemView.getTranslationX() : (f3 - f2) * n00.m + f2;
                float f4 = n00.b;
                float f5 = n00.d;
                n00.j = f4 == f5 ? recyclerView$ViewHolder1.itemView.getTranslationY() : (f5 - f4) * n00.m + f4;
                int v3 = canvas0.save();
                this.onChildDraw(canvas0, recyclerView0, n00.e, n00.i, n00.j, n00.f, false);
                canvas0.restoreToCount(v3);
            }
            if(recyclerView$ViewHolder0 != null) {
                int v4 = canvas0.save();
                this.onChildDraw(canvas0, recyclerView0, recyclerView$ViewHolder0, f, f1, v, true);
                canvas0.restoreToCount(v4);
            }
        }

        public void onDrawOver(Canvas canvas0, RecyclerView recyclerView0, ViewHolder recyclerView$ViewHolder0, List list0, int v, float f, float f1) {
            int v1 = list0.size();
            boolean z = false;
            for(int v2 = 0; v2 < v1; ++v2) {
                n0 n00 = (n0)list0.get(v2);
                canvas0.restoreToCount(canvas0.save());
            }
            if(recyclerView$ViewHolder0 != null) {
                canvas0.restoreToCount(canvas0.save());
            }
            for(int v3 = v1 - 1; v3 >= 0; --v3) {
                n0 n01 = (n0)list0.get(v3);
                boolean z1 = n01.l;
                if(z1 && !n01.h) {
                    list0.remove(v3);
                }
                else if(!z1) {
                    z = true;
                }
            }
            if(z) {
                recyclerView0.invalidate();
            }
        }

        public abstract boolean onMove(@NonNull RecyclerView arg1, @NonNull ViewHolder arg2, @NonNull ViewHolder arg3);

        public void onMoved(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0, int v, @NonNull ViewHolder recyclerView$ViewHolder1, int v1, int v2, int v3) {
            LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
            if(recyclerView$LayoutManager0 instanceof ViewDropHandler) {
                ((ViewDropHandler)recyclerView$LayoutManager0).prepareForDrop(recyclerView$ViewHolder0.itemView, recyclerView$ViewHolder1.itemView, v2, v3);
                return;
            }
            if(recyclerView$LayoutManager0.canScrollHorizontally()) {
                if(recyclerView$LayoutManager0.getDecoratedLeft(recyclerView$ViewHolder1.itemView) <= recyclerView0.getPaddingLeft()) {
                    recyclerView0.scrollToPosition(v1);
                }
                if(recyclerView$LayoutManager0.getDecoratedRight(recyclerView$ViewHolder1.itemView) >= recyclerView0.getWidth() - recyclerView0.getPaddingRight()) {
                    recyclerView0.scrollToPosition(v1);
                }
            }
            if(recyclerView$LayoutManager0.canScrollVertically()) {
                if(recyclerView$LayoutManager0.getDecoratedTop(recyclerView$ViewHolder1.itemView) <= recyclerView0.getPaddingTop()) {
                    recyclerView0.scrollToPosition(v1);
                }
                if(recyclerView$LayoutManager0.getDecoratedBottom(recyclerView$ViewHolder1.itemView) >= recyclerView0.getHeight() - recyclerView0.getPaddingBottom()) {
                    recyclerView0.scrollToPosition(v1);
                }
            }
        }

        public void onSelectedChanged(@Nullable ViewHolder recyclerView$ViewHolder0, int v) {
        }

        public abstract void onSwiped(@NonNull ViewHolder arg1, int arg2);
    }

    public static abstract class SimpleCallback extends Callback {
        public int a;
        public int b;

        public SimpleCallback(int v, int v1) {
            this.a = v1;
            this.b = v;
        }

        public int getDragDirs(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            return this.b;
        }

        @Override  // androidx.recyclerview.widget.ItemTouchHelper$Callback
        public int getMovementFlags(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            return Callback.makeMovementFlags(this.getDragDirs(recyclerView0, recyclerView$ViewHolder0), this.getSwipeDirs(recyclerView0, recyclerView$ViewHolder0));
        }

        public int getSwipeDirs(@NonNull RecyclerView recyclerView0, @NonNull ViewHolder recyclerView$ViewHolder0) {
            return this.a;
        }

        public void setDefaultDragDirs(int v) {
            this.b = v;
        }

        public void setDefaultSwipeDirs(int v) {
            this.a = v;
        }
    }

    public interface ViewDropHandler {
        void prepareForDrop(@NonNull View arg1, @NonNull View arg2, int arg3, int arg4);
    }

    public int A;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    public final ArrayList B;
    public int C;
    public RecyclerView D;
    public static final int DOWN = 2;
    public final f0 E;
    public static final int END = 0x20;
    public VelocityTracker F;
    public ArrayList G;
    public ArrayList H;
    public View I;
    public GestureDetectorCompat J;
    public l0 K;
    public final g0 L;
    public static final int LEFT = 4;
    public Rect M;
    public long N;
    public static final int RIGHT = 8;
    public static final int START = 16;
    public static final int UP = 1;
    public final ArrayList m;
    public final float[] n;
    public ViewHolder o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public int x;
    public final Callback y;
    public int z;

    public ItemTouchHelper(@NonNull Callback itemTouchHelper$Callback0) {
        this.m = new ArrayList();
        this.n = new float[2];
        this.o = null;
        this.x = -1;
        this.z = 0;
        this.B = new ArrayList();
        this.E = new f0(this);
        this.I = null;
        this.L = new g0(this);
        this.y = itemTouchHelper$Callback0;
    }

    public final int a(ViewHolder recyclerView$ViewHolder0, int v) {
        int v1 = 4;
        if((v & 12) != 0) {
            int v2 = Float.compare(this.t, 0.0f) <= 0 ? 4 : 8;
            VelocityTracker velocityTracker0 = this.F;
            if(velocityTracker0 != null && this.x > -1) {
                velocityTracker0.computeCurrentVelocity(1000, this.s);
                float f = this.F.getXVelocity(this.x);
                float f1 = this.F.getYVelocity(this.x);
                if(f > 0.0f) {
                    v1 = 8;
                }
                float f2 = Math.abs(f);
                if((v1 & v) != 0 && v2 == v1 && f2 >= this.r && f2 > Math.abs(f1)) {
                    return v1;
                }
            }
            float f3 = (float)this.D.getWidth();
            return (v & v2) == 0 || Math.abs(this.t) <= 0.5f * f3 ? 0 : v2;
        }
        return 0;
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView0) {
        RecyclerView recyclerView1 = this.D;
        if(recyclerView1 == recyclerView0) {
            return;
        }
        g0 g00 = this.L;
        if(recyclerView1 != null) {
            recyclerView1.removeItemDecoration(this);
            this.D.removeOnItemTouchListener(g00);
            this.D.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList0 = this.B;
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                n0 n00 = (n0)arrayList0.get(0);
                n00.g.cancel();
                this.y.clearView(this.D, n00.e);
            }
            arrayList0.clear();
            this.I = null;
            VelocityTracker velocityTracker0 = this.F;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.F = null;
            }
            l0 l00 = this.K;
            if(l00 != null) {
                l00.a = false;
                this.K = null;
            }
            if(this.J != null) {
                this.J = null;
            }
        }
        this.D = recyclerView0;
        if(recyclerView0 != null) {
            Resources resources0 = recyclerView0.getResources();
            this.r = resources0.getDimension(dimen.item_touch_helper_swipe_escape_velocity);
            this.s = resources0.getDimension(dimen.item_touch_helper_swipe_escape_max_velocity);
            this.C = ViewConfiguration.get(this.D.getContext()).getScaledTouchSlop();
            this.D.addItemDecoration(this);
            this.D.addOnItemTouchListener(g00);
            this.D.addOnChildAttachStateChangeListener(this);
            this.K = new l0(this);
            this.J = new GestureDetectorCompat(this.D.getContext(), this.K);
        }
    }

    public final void b(MotionEvent motionEvent0, int v, int v1) {
        if(this.o == null && v == 2 && this.z != 2) {
            Callback itemTouchHelper$Callback0 = this.y;
            if(!itemTouchHelper$Callback0.isItemViewSwipeEnabled() || this.D.getScrollState() == 1) {
                return;
            }
            LayoutManager recyclerView$LayoutManager0 = this.D.getLayoutManager();
            int v2 = this.x;
            ViewHolder recyclerView$ViewHolder0 = null;
            if(v2 != -1) {
                int v3 = motionEvent0.findPointerIndex(v2);
                float f = Math.abs(motionEvent0.getX(v3) - this.p);
                float f1 = Math.abs(motionEvent0.getY(v3) - this.q);
                float f2 = (float)this.C;
                if((f >= f2 || f1 >= f2) && (f <= f1 || !recyclerView$LayoutManager0.canScrollHorizontally()) && (f1 <= f || !recyclerView$LayoutManager0.canScrollVertically())) {
                    View view0 = this.e(motionEvent0);
                    if(view0 != null) {
                        recyclerView$ViewHolder0 = this.D.getChildViewHolder(view0);
                    }
                }
            }
            if(recyclerView$ViewHolder0 == null) {
                return;
            }
            int v4 = (itemTouchHelper$Callback0.getAbsoluteMovementFlags(this.D, recyclerView$ViewHolder0) & 0xFF00) >> 8;
            if(v4 == 0) {
                return;
            }
            float f3 = motionEvent0.getX(v1);
            float f4 = motionEvent0.getY(v1);
            float f5 = f3 - this.p;
            float f6 = f4 - this.q;
            float f7 = Math.abs(f5);
            float f8 = Math.abs(f6);
            float f9 = (float)this.C;
            if(f7 < f9 && f8 < f9) {
                return;
            }
            if(Float.compare(f7, f8) > 0) {
                if(f5 < 0.0f && (v4 & 4) == 0) {
                    return;
                }
                if(f5 > 0.0f && (v4 & 8) == 0) {
                    return;
                }
            }
            else {
                if(f6 < 0.0f && (v4 & 1) == 0) {
                    return;
                }
                if(f6 > 0.0f && (v4 & 2) == 0) {
                    return;
                }
            }
            this.u = 0.0f;
            this.t = 0.0f;
            this.x = motionEvent0.getPointerId(0);
            this.j(recyclerView$ViewHolder0, 1);
        }
    }

    public final int c(ViewHolder recyclerView$ViewHolder0, int v) {
        int v1 = 1;
        if((v & 3) != 0) {
            int v2 = Float.compare(this.u, 0.0f) <= 0 ? 1 : 2;
            VelocityTracker velocityTracker0 = this.F;
            if(velocityTracker0 != null && this.x > -1) {
                velocityTracker0.computeCurrentVelocity(1000, this.s);
                float f = this.F.getXVelocity(this.x);
                float f1 = this.F.getYVelocity(this.x);
                if(f1 > 0.0f) {
                    v1 = 2;
                }
                float f2 = Math.abs(f1);
                if((v1 & v) != 0 && v1 == v2 && f2 >= this.r && f2 > Math.abs(f)) {
                    return v1;
                }
            }
            float f3 = (float)this.D.getHeight();
            return (v & v2) == 0 || Math.abs(this.u) <= 0.5f * f3 ? 0 : v2;
        }
        return 0;
    }

    public final void d(ViewHolder recyclerView$ViewHolder0, boolean z) {
        ArrayList arrayList0 = this.B;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            n0 n00 = (n0)arrayList0.get(v);
            if(n00.e == recyclerView$ViewHolder0) {
                n00.k |= z;
                if(!n00.l) {
                    n00.g.cancel();
                }
                arrayList0.remove(v);
                return;
            }
        }
    }

    public final View e(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        ViewHolder recyclerView$ViewHolder0 = this.o;
        if(recyclerView$ViewHolder0 != null) {
            View view0 = recyclerView$ViewHolder0.itemView;
            if(ItemTouchHelper.g(view0, f, f1, this.v + this.t, this.w + this.u)) {
                return view0;
            }
        }
        ArrayList arrayList0 = this.B;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            n0 n00 = (n0)arrayList0.get(v);
            View view1 = n00.e.itemView;
            if(ItemTouchHelper.g(view1, f, f1, n00.i, n00.j)) {
                return view1;
            }
        }
        return this.D.findChildViewUnder(f, f1);
    }

    public final void f(float[] arr_f) {
        arr_f[0] = (this.A & 12) == 0 ? this.o.itemView.getTranslationX() : this.v + this.t - ((float)this.o.itemView.getLeft());
        if((this.A & 3) != 0) {
            arr_f[1] = this.w + this.u - ((float)this.o.itemView.getTop());
            return;
        }
        arr_f[1] = this.o.itemView.getTranslationY();
    }

    public static boolean g(View view0, float f, float f1, float f2, float f3) {
        return f >= f2 && f <= f2 + ((float)view0.getWidth()) && f1 >= f3 && f1 <= f3 + ((float)view0.getHeight());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect0, View view0, RecyclerView recyclerView0, State recyclerView$State0) {
        rect0.setEmpty();
    }

    public final void h(ViewHolder recyclerView$ViewHolder0) {
        int v18;
        int v11;
        int v10;
        if(this.D.isLayoutRequested()) {
            return;
        }
        if(this.z != 2) {
            return;
        }
        Callback itemTouchHelper$Callback0 = this.y;
        int v = (int)(this.v + this.t);
        int v1 = (int)(this.w + this.u);
        if(((float)Math.abs(v1 - recyclerView$ViewHolder0.itemView.getTop())) < ((float)recyclerView$ViewHolder0.itemView.getHeight()) * 0.5f && ((float)Math.abs(v - recyclerView$ViewHolder0.itemView.getLeft())) < ((float)recyclerView$ViewHolder0.itemView.getWidth()) * 0.5f) {
            return;
        }
        ArrayList arrayList0 = this.G;
        if(arrayList0 == null) {
            this.G = new ArrayList();
            this.H = new ArrayList();
        }
        else {
            arrayList0.clear();
            this.H.clear();
        }
        int v2 = Math.round(this.v + this.t);
        int v3 = Math.round(this.w + this.u);
        int v4 = recyclerView$ViewHolder0.itemView.getWidth() + v2;
        int v5 = recyclerView$ViewHolder0.itemView.getHeight() + v3;
        int v6 = (v2 + v4) / 2;
        int v7 = (v3 + v5) / 2;
        LayoutManager recyclerView$LayoutManager0 = this.D.getLayoutManager();
        int v8 = recyclerView$LayoutManager0.getChildCount();
        int v9 = 0;
        while(v9 < v8) {
            View view0 = recyclerView$LayoutManager0.getChildAt(v9);
            if(view0 == recyclerView$ViewHolder0.itemView || (view0.getBottom() < v3 || view0.getTop() > v5 || view0.getRight() < v2 || view0.getLeft() > v4)) {
                v18 = v6;
                v10 = v2;
                v11 = v3;
            }
            else {
                ViewHolder recyclerView$ViewHolder1 = this.D.getChildViewHolder(view0);
                v10 = v2;
                v11 = v3;
                int v12 = view0.getLeft();
                int v13 = Math.abs(v6 - (view0.getRight() + v12) / 2);
                int v14 = view0.getTop();
                int v15 = Math.abs(v7 - (view0.getBottom() + v14) / 2);
                int v16 = v15 * v15 + v13 * v13;
                int v17 = this.G.size();
                v18 = v6;
                int v19 = 0;
                for(int v20 = 0; v20 < v17 && v16 > ((int)(((Integer)this.H.get(v20)))); ++v20) {
                    ++v19;
                }
                this.G.add(v19, recyclerView$ViewHolder1);
                this.H.add(v19, v16);
            }
            ++v9;
            v2 = v10;
            v3 = v11;
            v6 = v18;
        }
        ArrayList arrayList1 = this.G;
        if(arrayList1.size() == 0) {
            return;
        }
        ViewHolder recyclerView$ViewHolder2 = itemTouchHelper$Callback0.chooseDropTarget(recyclerView$ViewHolder0, arrayList1, v, v1);
        if(recyclerView$ViewHolder2 == null) {
            this.G.clear();
            this.H.clear();
            return;
        }
        int v21 = recyclerView$ViewHolder2.getAbsoluteAdapterPosition();
        int v22 = recyclerView$ViewHolder0.getAbsoluteAdapterPosition();
        if(itemTouchHelper$Callback0.onMove(this.D, recyclerView$ViewHolder0, recyclerView$ViewHolder2)) {
            this.y.onMoved(this.D, recyclerView$ViewHolder0, v22, recyclerView$ViewHolder2, v21, v, v1);
        }
    }

    public final void i(View view0) {
        if(view0 == this.I) {
            this.I = null;
        }
    }

    public final void j(ViewHolder recyclerView$ViewHolder0, int v) {
        boolean z;
        Callback itemTouchHelper$Callback1;
        int v7;
        float f1;
        float f;
        int v6;
        int v2;
        if(recyclerView$ViewHolder0 == this.o && v == this.z) {
            return;
        }
        this.N = 0x8000000000000000L;
        int v1 = this.z;
        this.d(recyclerView$ViewHolder0, true);
        this.z = v;
        if(v == 2) {
            if(recyclerView$ViewHolder0 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.I = recyclerView$ViewHolder0.itemView;
        }
        ViewHolder recyclerView$ViewHolder1 = this.o;
        Callback itemTouchHelper$Callback0 = this.y;
        if(recyclerView$ViewHolder1 == null) {
            itemTouchHelper$Callback1 = itemTouchHelper$Callback0;
            z = false;
        }
        else {
            if(recyclerView$ViewHolder1.itemView.getParent() == null) {
                itemTouchHelper$Callback1 = itemTouchHelper$Callback0;
                this.i(recyclerView$ViewHolder1.itemView);
                itemTouchHelper$Callback1.clearView(this.D, recyclerView$ViewHolder1);
                z = false;
            }
            else {
                if(v1 == 2) {
                    v2 = 0;
                }
                else {
                    if(this.z == 2) {
                        v6 = 0;
                    }
                    else {
                        int v3 = itemTouchHelper$Callback0.getMovementFlags(this.D, recyclerView$ViewHolder1);
                        int v4 = (itemTouchHelper$Callback0.convertToAbsoluteDirection(v3, ViewCompat.getLayoutDirection(this.D)) & 0xFF00) >> 8;
                        if(v4 == 0) {
                            v6 = 0;
                        }
                        else {
                            int v5 = (v3 & 0xFF00) >> 8;
                            if(Math.abs(this.t) > Math.abs(this.u)) {
                                v6 = this.a(recyclerView$ViewHolder1, v4);
                                if(v6 <= 0) {
                                    v6 = this.c(recyclerView$ViewHolder1, v4);
                                    if(v6 <= 0) {
                                        v6 = 0;
                                    }
                                }
                                else if((v5 & v6) == 0) {
                                    v6 = Callback.convertToRelativeDirection(v6, ViewCompat.getLayoutDirection(this.D));
                                }
                            }
                            else {
                                v6 = this.c(recyclerView$ViewHolder1, v4);
                                if(v6 <= 0) {
                                    v6 = this.a(recyclerView$ViewHolder1, v4);
                                    if(v6 <= 0) {
                                        v6 = 0;
                                    }
                                    else if((v5 & v6) == 0) {
                                        v6 = Callback.convertToRelativeDirection(v6, ViewCompat.getLayoutDirection(this.D));
                                    }
                                }
                            }
                        }
                    }
                    v2 = v6;
                }
                VelocityTracker velocityTracker0 = this.F;
                if(velocityTracker0 != null) {
                    velocityTracker0.recycle();
                    this.F = null;
                }
                switch(v2) {
                    case 1: 
                    case 2: {
                        f = 0.0f;
                        f1 = Math.signum(this.u) * ((float)this.D.getHeight());
                        break;
                    }
                    case 4: 
                    case 8: {
                        f1 = 0.0f;
                        f = Math.signum(this.t) * ((float)this.D.getWidth());
                        break;
                    }
                    default: {
                        if(v2 == 16 || v2 == 0x20) {
                            f1 = 0.0f;
                            f = Math.signum(this.t) * ((float)this.D.getWidth());
                        }
                        else {
                            f = 0.0f;
                            f1 = 0.0f;
                        }
                    }
                }
                if(v1 == 2) {
                    v7 = 8;
                }
                else {
                    v7 = v2 <= 0 ? 4 : 2;
                }
                this.f(this.n);
                float f2 = this.n[0];
                float f3 = this.n[1];
                itemTouchHelper$Callback1 = itemTouchHelper$Callback0;
                h0 h00 = new h0(this, recyclerView$ViewHolder1, v7, v1, f2, f3, f, f1, v2, recyclerView$ViewHolder1);
                long v8 = itemTouchHelper$Callback1.getAnimationDuration(this.D, v7, f - f2, f1 - f3);
                h00.g.setDuration(v8);
                this.B.add(h00);
                recyclerView$ViewHolder1.setIsRecyclable(false);
                h00.g.start();
                z = true;
            }
            this.o = null;
        }
        if(recyclerView$ViewHolder0 != null) {
            this.A = (itemTouchHelper$Callback1.getAbsoluteMovementFlags(this.D, recyclerView$ViewHolder0) & (1 << v * 8 + 8) - 1) >> this.z * 8;
            this.v = (float)recyclerView$ViewHolder0.itemView.getLeft();
            this.w = (float)recyclerView$ViewHolder0.itemView.getTop();
            this.o = recyclerView$ViewHolder0;
            if(v == 2) {
                recyclerView$ViewHolder0.itemView.performHapticFeedback(0);
            }
        }
        ViewParent viewParent0 = this.D.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(this.o != null);
        }
        if(!z) {
            this.D.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.D.invalidate();
    }

    public final void k(MotionEvent motionEvent0, int v, int v1) {
        float f = motionEvent0.getX(v1);
        float f1 = motionEvent0.getY(v1);
        float f2 = f - this.p;
        this.t = f2;
        this.u = f1 - this.q;
        if((v & 4) == 0) {
            this.t = Math.max(0.0f, f2);
        }
        if((v & 8) == 0) {
            this.t = Math.min(0.0f, this.t);
        }
        if((v & 1) == 0) {
            this.u = Math.max(0.0f, this.u);
        }
        if((v & 2) == 0) {
            this.u = Math.min(0.0f, this.u);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@NonNull View view0) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@NonNull View view0) {
        this.i(view0);
        ViewHolder recyclerView$ViewHolder0 = this.D.getChildViewHolder(view0);
        if(recyclerView$ViewHolder0 == null) {
            return;
        }
        if(this.o != null && recyclerView$ViewHolder0 == this.o) {
            this.j(null, 0);
            return;
        }
        this.d(recyclerView$ViewHolder0, false);
        if(this.m.remove(recyclerView$ViewHolder0.itemView)) {
            this.y.clearView(this.D, recyclerView$ViewHolder0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        float f2;
        float f1;
        if(this.o == null) {
            f2 = 0.0f;
            f1 = 0.0f;
        }
        else {
            this.f(this.n);
            float f = this.n[0];
            f1 = this.n[1];
            f2 = f;
        }
        this.y.onDraw(canvas0, recyclerView0, this.o, this.B, this.z, f2, f1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void onDrawOver(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        float f2;
        float f1;
        if(this.o == null) {
            f2 = 0.0f;
            f1 = 0.0f;
        }
        else {
            this.f(this.n);
            float f = this.n[0];
            f1 = this.n[1];
            f2 = f;
        }
        this.y.onDrawOver(canvas0, recyclerView0, this.o, this.B, this.z, f2, f1);
    }

    public void startDrag(@NonNull ViewHolder recyclerView$ViewHolder0) {
        if(!this.y.hasDragFlag(this.D, recyclerView$ViewHolder0)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if(recyclerView$ViewHolder0.itemView.getParent() != this.D) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker0 = this.F;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
        }
        this.F = VelocityTracker.obtain();
        this.u = 0.0f;
        this.t = 0.0f;
        this.j(recyclerView$ViewHolder0, 2);
    }

    public void startSwipe(@NonNull ViewHolder recyclerView$ViewHolder0) {
        if(!this.y.hasSwipeFlag(this.D, recyclerView$ViewHolder0)) {
            Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
            return;
        }
        if(recyclerView$ViewHolder0.itemView.getParent() != this.D) {
            Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker0 = this.F;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
        }
        this.F = VelocityTracker.obtain();
        this.u = 0.0f;
        this.t = 0.0f;
        this.j(recyclerView$ViewHolder0, 1);
    }
}

