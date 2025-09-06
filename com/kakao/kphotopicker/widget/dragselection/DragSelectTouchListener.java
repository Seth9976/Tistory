package com.kakao.kphotopicker.widget.dragselection;

import android.os.Handler;
import android.view.MotionEvent;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\u0018\u0000 :2\u00020\u0001:\u0001:J!\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\f\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0017¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001A\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001E\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u0015\u001A\u0004\b\u001C\u0010\u0017\"\u0004\b\u001D\u0010\u0019R\"\u0010\"\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010\u0015\u001A\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019RE\u0010.\u001A%\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u000E\u0018\u00010#j\u0004\u0018\u0001`\'8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R0\u00107\u001A\u0010\u0012\u0004\u0012\u00020\u000E\u0018\u00010/j\u0004\u0018\u0001`08\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\u0011\u00108\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/kakao/kphotopicker/widget/dragselection/DragSelectTouchListener;", "Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;", "", "active", "", "initialSelection", "setIsActive", "(ZLjava/lang/Integer;)Z", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", "disallow", "onRequestDisallowInterceptTouchEvent", "(Z)V", "c", "I", "getHotspotHeight", "()I", "setHotspotHeight", "(I)V", "hotspotHeight", "d", "getHotspotOffsetTop", "setHotspotOffsetTop", "hotspotOffsetTop", "e", "getHotspotOffsetBottom", "setHotspotOffsetBottom", "hotspotOffsetBottom", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "scrolling", "Lcom/kakao/kphotopicker/widget/dragselection/AutoScrollListener;", "f", "Lkotlin/jvm/functions/Function1;", "getAutoScrollListener", "()Lkotlin/jvm/functions/Function1;", "setAutoScrollListener", "(Lkotlin/jvm/functions/Function1;)V", "autoScrollListener", "Lkotlin/Function0;", "Lcom/kakao/kphotopicker/widget/dragselection/DragEndListener;", "g", "Lkotlin/jvm/functions/Function0;", "getDragEndListener", "()Lkotlin/jvm/functions/Function0;", "setDragEndListener", "(Lkotlin/jvm/functions/Function0;)V", "dragEndListener", "isNowDragging", "()Z", "Companion", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DragSelectTouchListener implements OnItemTouchListener {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J2\u0010\t\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u001B\b\u0002\u0010\b\u001A\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001A\u00020\u000B8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/kphotopicker/widget/dragselection/DragSelectTouchListener$Companion;", "", "Lcom/kakao/kphotopicker/widget/dragselection/DragSelectReceiver;", "receiver", "Lkotlin/Function1;", "Lcom/kakao/kphotopicker/widget/dragselection/DragSelectTouchListener;", "", "Lkotlin/ExtensionFunctionType;", "config", "create", "(Lcom/kakao/kphotopicker/widget/dragselection/DragSelectReceiver;Lkotlin/jvm/functions/Function1;)Lcom/kakao/kphotopicker/widget/dragselection/DragSelectTouchListener;", "", "AUTO_SCROLL_DELAY", "I", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final DragSelectTouchListener create(@NotNull DragSelectReceiver dragSelectReceiver0, @Nullable Function1 function10) {
            Intrinsics.checkNotNullParameter(dragSelectReceiver0, "receiver");
            DragSelectTouchListener dragSelectTouchListener0 = new DragSelectTouchListener(dragSelectReceiver0, null);
            if(function10 != null) {
                function10.invoke(dragSelectTouchListener0);
            }
            return dragSelectTouchListener0;
        }

        public static DragSelectTouchListener create$default(Companion dragSelectTouchListener$Companion0, DragSelectReceiver dragSelectReceiver0, Function1 function10, int v, Object object0) {
            if((v & 2) != 0) {
                function10 = null;
            }
            return dragSelectTouchListener$Companion0.create(dragSelectReceiver0, function10);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final DragSelectReceiver a;
    public final DragSelectTouchListener.autoScrollRunnable.1 b;
    public int c;
    public int d;
    public int e;
    public Function1 f;
    public Function0 g;
    public RecyclerView h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public boolean r;

    static {
        DragSelectTouchListener.Companion = new Companion(null);
    }

    public DragSelectTouchListener(DragSelectReceiver dragSelectReceiver0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = dragSelectReceiver0;
        this.b = new DragSelectTouchListener.autoScrollRunnable.1(this);
        this.i = -1;
    }

    public final void a(boolean z) {
        if(this.r == z) {
            return;
        }
        this.r = z;
        Function1 function10 = this.f;
        if(function10 != null) {
            function10.invoke(Boolean.valueOf(z));
        }
    }

    public static final Handler access$getAutoScrollHandler(DragSelectTouchListener dragSelectTouchListener0) {
        return dragSelectTouchListener0.h == null ? null : dragSelectTouchListener0.h.getHandler();
    }

    public static final int access$getAutoScrollVelocity$p(DragSelectTouchListener dragSelectTouchListener0) {
        return dragSelectTouchListener0.q;
    }

    public static final RecyclerView access$getRecyclerView$p(DragSelectTouchListener dragSelectTouchListener0) {
        return dragSelectTouchListener0.h;
    }

    @Nullable
    public final Function1 getAutoScrollListener() {
        return this.f;
    }

    @Nullable
    public final Function0 getDragEndListener() {
        return this.g;
    }

    public final int getHotspotHeight() {
        return this.c;
    }

    public final int getHotspotOffsetBottom() {
        return this.e;
    }

    public final int getHotspotOffsetTop() {
        return this.d;
    }

    public final boolean isNowDragging() {
        return this.k;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean onInterceptTouchEvent(@NotNull RecyclerView recyclerView0, @NotNull MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(recyclerView0, "view");
        Intrinsics.checkNotNullParameter(motionEvent0, "event");
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        boolean z = recyclerView$Adapter0 == null ? true : ExtensionsKt.isEmpty(recyclerView$Adapter0);
        if(!this.k || z) {
            return false;
        }
        this.h = recyclerView0;
        int v = this.c;
        if(v > -1) {
            this.n = this.d + v;
            this.o = recyclerView0.getMeasuredHeight() - this.c - this.e;
        }
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onTouchEvent(@NotNull RecyclerView recyclerView0, @NotNull MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(recyclerView0, "view");
        Intrinsics.checkNotNullParameter(motionEvent0, "event");
        int v = motionEvent0.getAction();
        int v1 = ExtensionsKt.getItemPosition(recyclerView0, motionEvent0);
        float f = motionEvent0.getY();
        DragSelectTouchListener.autoScrollRunnable.1 dragSelectTouchListener$autoScrollRunnable$10 = this.b;
        Handler handler0 = null;
        switch(v) {
            case 1: {
                this.k = false;
                Function0 function00 = this.g;
                if(function00 != null) {
                    function00.invoke();
                }
                this.p = false;
                RecyclerView recyclerView1 = this.h;
                if(recyclerView1 != null) {
                    handler0 = recyclerView1.getHandler();
                }
                if(handler0 != null) {
                    handler0.removeCallbacks(dragSelectTouchListener$autoScrollRunnable$10);
                }
                this.a(false);
                return;
            }
            case 2: {
                if(this.c > -1) {
                    if(f <= ((float)this.n)) {
                        if(!this.p) {
                            this.p = true;
                            Handler handler1 = this.h == null ? null : this.h.getHandler();
                            if(handler1 != null) {
                                handler1.removeCallbacks(dragSelectTouchListener$autoScrollRunnable$10);
                            }
                            RecyclerView recyclerView2 = this.h;
                            if(recyclerView2 != null) {
                                handler0 = recyclerView2.getHandler();
                            }
                            if(handler0 != null) {
                                handler0.post(dragSelectTouchListener$autoScrollRunnable$10);
                            }
                            this.a(true);
                        }
                        this.q = ((int)(f - ((float)this.n))) / 2;
                    }
                    else if(f >= ((float)this.o)) {
                        if(!this.p) {
                            this.p = true;
                            Handler handler2 = this.h == null ? null : this.h.getHandler();
                            if(handler2 != null) {
                                handler2.removeCallbacks(dragSelectTouchListener$autoScrollRunnable$10);
                            }
                            RecyclerView recyclerView3 = this.h;
                            if(recyclerView3 != null) {
                                handler0 = recyclerView3.getHandler();
                            }
                            if(handler0 != null) {
                                handler0.post(dragSelectTouchListener$autoScrollRunnable$10);
                            }
                            this.a(true);
                        }
                        this.q = ((int)(f - ((float)this.o))) / 2;
                    }
                    else if(this.p) {
                        this.p = false;
                        RecyclerView recyclerView4 = this.h;
                        if(recyclerView4 != null) {
                            handler0 = recyclerView4.getHandler();
                        }
                        if(handler0 != null) {
                            handler0.removeCallbacks(dragSelectTouchListener$autoScrollRunnable$10);
                        }
                        this.a(false);
                    }
                }
                if(v1 != -1 && this.i != v1) {
                    this.i = v1;
                    if(this.l == -1) {
                        this.l = v1;
                    }
                    if(this.m == -1) {
                        this.m = v1;
                    }
                    if(v1 > this.m) {
                        this.m = v1;
                    }
                    if(v1 < this.l) {
                        this.l = v1;
                    }
                    int v2 = this.j;
                    int v3 = this.l;
                    int v4 = this.m;
                    DragSelectReceiver dragSelectReceiver0 = this.a;
                    if(v2 != v1) {
                        if(v1 < v2) {
                            if(v1 <= v2) {
                                for(int v5 = v2; true; --v5) {
                                    dragSelectReceiver0.setSelected(v5, true);
                                    if(v5 == v1) {
                                        break;
                                    }
                                }
                            }
                            if(v3 > -1 && v3 < v1) {
                                while(v3 < v1) {
                                    if(v3 != v2) {
                                        dragSelectReceiver0.setSelected(v3, false);
                                    }
                                    ++v3;
                                }
                            }
                            if(v4 > -1) {
                                int v6 = v2 + 1;
                                if(v6 <= v4) {
                                    while(true) {
                                        dragSelectReceiver0.setSelected(v6, false);
                                        if(v6 == v4) {
                                            break;
                                        }
                                        ++v6;
                                    }
                                }
                            }
                        }
                        else {
                            if(v2 <= v1) {
                                for(int v7 = v2; true; ++v7) {
                                    dragSelectReceiver0.setSelected(v7, true);
                                    if(v7 == v1) {
                                        break;
                                    }
                                }
                            }
                            if(v4 > -1 && v4 > v1) {
                                int v8 = v1 + 1;
                                if(v8 <= v4) {
                                    while(true) {
                                        if(v8 != v2) {
                                            dragSelectReceiver0.setSelected(v8, false);
                                        }
                                        if(v8 == v4) {
                                            break;
                                        }
                                        ++v8;
                                    }
                                }
                            }
                            if(v3 > -1) {
                                while(v3 < v2) {
                                    dragSelectReceiver0.setSelected(v3, false);
                                    ++v3;
                                }
                            }
                        }
                    }
                    else if(v3 <= v4) {
                        while(true) {
                            if(v3 != v2) {
                                dragSelectReceiver0.setSelected(v3, false);
                            }
                            if(v3 == v4) {
                                break;
                            }
                            ++v3;
                        }
                    }
                    int v9 = this.i;
                    if(this.j == v9) {
                        this.l = v9;
                        this.m = v9;
                    }
                }
            }
        }
    }

    public final void setAutoScrollListener(@Nullable Function1 function10) {
        this.f = function10;
    }

    public final void setDragEndListener(@Nullable Function0 function00) {
        this.g = function00;
    }

    public final void setHotspotHeight(int v) {
        this.c = v;
    }

    public final void setHotspotOffsetBottom(int v) {
        this.e = v;
    }

    public final void setHotspotOffsetTop(int v) {
        this.d = v;
    }

    public final boolean setIsActive(boolean z, @Nullable Integer integer0) {
        if(z && this.k) {
            return false;
        }
        this.i = -1;
        this.l = -1;
        this.m = -1;
        Handler handler0 = this.h == null ? null : this.h.getHandler();
        if(handler0 != null) {
            handler0.removeCallbacks(this.b);
        }
        this.a(false);
        this.p = false;
        if(z && integer0 != null) {
            DragSelectReceiver dragSelectReceiver0 = this.a;
            if(!dragSelectReceiver0.isIndexSelectable(((int)integer0))) {
                this.k = false;
                this.j = -1;
                return false;
            }
            dragSelectReceiver0.setSelected(((int)integer0), true);
            this.k = true;
            this.j = (int)integer0;
            this.i = (int)integer0;
            return true;
        }
        this.j = -1;
        return false;
    }

    public static boolean setIsActive$default(DragSelectTouchListener dragSelectTouchListener0, boolean z, Integer integer0, int v, Object object0) {
        if((v & 2) != 0) {
            integer0 = null;
        }
        return dragSelectTouchListener0.setIsActive(z, integer0);
    }
}

