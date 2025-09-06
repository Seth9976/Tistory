package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle;
import androidx.compose.ui.unit.Constraints;
import com.google.firebase.messaging.o;
import d0.h0;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class e implements PrefetchHandle, PrefetchRequest {
    public final int a;
    public final long b;
    public final PrefetchMetrics c;
    public PrecomposedSlotHandle d;
    public boolean e;
    public boolean f;
    public boolean g;
    public o h;
    public boolean i;
    public final PrefetchHandleProvider j;

    public e(PrefetchHandleProvider prefetchHandleProvider0, int v, long v1, PrefetchMetrics prefetchMetrics0) {
        this.j = prefetchHandleProvider0;
        this.a = v;
        this.b = v1;
        this.c = prefetchMetrics0;
    }

    public final boolean a() {
        if(!this.f) {
            int v = ((LazyLayoutItemProvider)this.j.a.getItemProvider().invoke()).getItemCount();
            return this.a >= 0 && this.a < v;
        }
        return false;
    }

    public final void b() {
        if(!this.a()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if(this.d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        LazyLayoutItemProvider lazyLayoutItemProvider0 = (LazyLayoutItemProvider)this.j.a.getItemProvider().invoke();
        Object object0 = lazyLayoutItemProvider0.getKey(this.a);
        Function2 function20 = this.j.a.getContent(this.a, object0, lazyLayoutItemProvider0.getContentType(this.a));
        this.d = this.j.b.precompose(object0, function20);
    }

    public final void c(long v) {
        if(this.f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if(this.e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.e = true;
        PrecomposedSlotHandle subcomposeLayoutState$PrecomposedSlotHandle0 = this.d;
        if(subcomposeLayoutState$PrecomposedSlotHandle0 == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int v1 = subcomposeLayoutState$PrecomposedSlotHandle0.getPlaceablesCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            subcomposeLayoutState$PrecomposedSlotHandle0.premeasure-0kLqBqw(v2, v);
        }
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle
    public final void cancel() {
        if(!this.f) {
            this.f = true;
            PrecomposedSlotHandle subcomposeLayoutState$PrecomposedSlotHandle0 = this.d;
            if(subcomposeLayoutState$PrecomposedSlotHandle0 != null) {
                subcomposeLayoutState$PrecomposedSlotHandle0.dispose();
            }
            this.d = null;
        }
    }

    public final o d() {
        PrecomposedSlotHandle subcomposeLayoutState$PrecomposedSlotHandle0 = this.d;
        if(subcomposeLayoutState$PrecomposedSlotHandle0 == null) {
            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
        }
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        subcomposeLayoutState$PrecomposedSlotHandle0.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new h0(ref$ObjectRef0));
        List list0 = (List)ref$ObjectRef0.element;
        return list0 == null ? null : new o(this, list0);
    }

    @Override  // androidx.compose.foundation.lazy.layout.PrefetchRequest
    public final boolean execute(PrefetchRequestScope prefetchRequestScope0) {
        if(!this.a()) {
            return false;
        }
        Object object0 = ((LazyLayoutItemProvider)this.j.a.getItemProvider().invoke()).getContentType(this.a);
        PrefetchMetrics prefetchMetrics0 = this.c;
        if(this.d == null) {
            long v = object0 == null || !prefetchMetrics0.getAverageCompositionTimeNanosByContentType().contains(object0) ? prefetchMetrics0.getAverageCompositionTimeNanos() : prefetchMetrics0.getAverageCompositionTimeNanosByContentType().get(object0);
            long v1 = prefetchRequestScope0.availableTimeNanos();
            if(this.i && v1 > 0L || v < v1) {
                long v2 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    this.b();
                }
                catch(Throwable throwable0) {
                    Trace.endSection();
                    throw throwable0;
                }
                Trace.endSection();
                long v3 = System.nanoTime() - v2;
                if(object0 != null) {
                    prefetchMetrics0.getAverageCompositionTimeNanosByContentType().set(object0, PrefetchMetrics.access$calculateAverageTime(prefetchMetrics0, v3, prefetchMetrics0.getAverageCompositionTimeNanosByContentType().getOrDefault(object0, 0L)));
                }
                prefetchMetrics0.c = PrefetchMetrics.access$calculateAverageTime(prefetchMetrics0, v3, prefetchMetrics0.getAverageCompositionTimeNanos());
                goto label_22;
            }
            return true;
        }
    label_22:
        if(!this.i) {
            if(!this.g) {
                if(prefetchRequestScope0.availableTimeNanos() > 0L) {
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.h = this.d();
                        this.g = true;
                    }
                    catch(Throwable throwable1) {
                        Trace.endSection();
                        throw throwable1;
                    }
                    Trace.endSection();
                    goto label_35;
                }
                return true;
            }
        label_35:
            o o0 = this.h;
            if(o0 != null) {
                List[] arr_list = (List[])o0.d;
                int v4 = o0.a;
                List list0 = (List)o0.c;
                if(v4 < list0.size()) {
                    if(((e)o0.e).f) {
                        throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while(o0.a < list0.size()) {
                        try {
                            if(arr_list[o0.a] == null) {
                                if(prefetchRequestScope0.availableTimeNanos() <= 0L) {
                                    goto label_60;
                                }
                                int v5 = o0.a;
                                arr_list[v5] = ((LazyLayoutPrefetchState)list0.get(v5)).collectNestedPrefetchRequests$foundation_release();
                            }
                            List list1 = arr_list[o0.a];
                            Intrinsics.checkNotNull(list1);
                        label_50:
                            if(o0.b >= list1.size()) {
                                o0.b = 0;
                                ++o0.a;
                                continue;
                            }
                            if(!((PrefetchRequest)list1.get(o0.b)).execute(prefetchRequestScope0)) {
                                ++o0.b;
                                goto label_50;
                            }
                        }
                        catch(Throwable throwable2) {
                            Trace.endSection();
                            throw throwable2;
                        }
                    label_60:
                        Trace.endSection();
                        return true;
                    }
                    Trace.endSection();
                }
            }
        }
        if(!this.e) {
            long v6 = this.b;
            if(!Constraints.isZero-impl(v6)) {
                long v7 = object0 == null || !prefetchMetrics0.getAverageMeasureTimeNanosByContentType().contains(object0) ? prefetchMetrics0.getAverageMeasureTimeNanos() : prefetchMetrics0.getAverageMeasureTimeNanosByContentType().get(object0);
                long v8 = prefetchRequestScope0.availableTimeNanos();
                if(this.i && v8 > 0L || v7 < v8) {
                    long v9 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        this.c(v6);
                    }
                    catch(Throwable throwable3) {
                        Trace.endSection();
                        throw throwable3;
                    }
                    Trace.endSection();
                    long v10 = System.nanoTime() - v9;
                    if(object0 != null) {
                        prefetchMetrics0.getAverageMeasureTimeNanosByContentType().set(object0, PrefetchMetrics.access$calculateAverageTime(prefetchMetrics0, v10, prefetchMetrics0.getAverageMeasureTimeNanosByContentType().getOrDefault(object0, 0L)));
                    }
                    prefetchMetrics0.d = PrefetchMetrics.access$calculateAverageTime(prefetchMetrics0, v10, prefetchMetrics0.getAverageMeasureTimeNanos());
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle
    public final void markAsUrgent() {
        this.i = true;
    }

    @Override
    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + Constraints.toString-impl(this.b) + ", isComposed = " + (this.d != null) + ", isMeasured = " + this.e + ", isCanceled = " + this.f + " }";
    }
}

