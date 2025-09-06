package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.g;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001A\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001A\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0003J\u001D\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001A\u00020\u00072\u0006\u0010\u0017\u001A\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001E\u001A\u0004\u0018\u00010\u001A2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u001E\u0010\u001F¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "<init>", "()V", "", "itemIndex", "lane", "", "setLane", "(II)V", "getLane", "(I)I", "targetLane", "", "assignedToLane", "(II)Z", "upperBound", "()I", "lowerBound", "reset", "findPreviousItemIndex", "(II)I", "findNextItemIndex", "requestedIndex", "ensureValidIndex", "(I)V", "", "gaps", "setGaps", "(I[I)V", "getGaps", "(I)[I", "Companion", "e0/g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,208:1\n1#2:209\n388#3,7:210\n388#3,7:217\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:210,7\n187#1:217,7\n*E\n"})
public final class LazyStaggeredGridLaneInfo {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$Companion;", "", "", "FullSpan", "I", "MaxCapacity", "Unset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int FullSpan = -2;
    public static final int Unset = -1;
    public int a;
    public int[] b;
    public final ArrayDeque c;

    static {
        LazyStaggeredGridLaneInfo.Companion = new Companion(null);
        LazyStaggeredGridLaneInfo.$stable = 8;
    }

    public LazyStaggeredGridLaneInfo() {
        this.b = new int[16];
        this.c = new ArrayDeque();
    }

    public final void a(int v, int v1) {
        if(v > 0x20000) {
            throw new IllegalArgumentException(("Requested item capacity " + v + " is larger than max supported: 131072!").toString());
        }
        int[] arr_v = this.b;
        if(arr_v.length < v) {
            int v2;
            for(v2 = arr_v.length; v2 < v; v2 *= 2) {
            }
            this.b = ArraysKt___ArraysJvmKt.copyInto$default(this.b, new int[v2], v1, 0, 0, 12, null);
        }
    }

    public final boolean assignedToLane(int v, int v1) {
        int v2 = this.getLane(v);
        return v2 == v1 || (v2 == -2 || v2 == -1);
    }

    public final void ensureValidIndex(int v) {
        ArrayDeque arrayDeque0;
        int v1 = this.a;
        int v2 = v - v1;
        if(v2 < 0 || v2 >= 0x20000) {
            int v3 = Math.max(v - this.b.length / 2, 0);
            this.a = v3;
            int v4 = v3 - v1;
            if(v4 >= 0) {
                int[] arr_v = this.b;
                if(v4 < arr_v.length) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, 0, v4, arr_v.length);
                }
                ArraysKt___ArraysJvmKt.fill(this.b, 0, Math.max(0, this.b.length - v4), this.b.length);
            }
            else {
                int[] arr_v1 = this.b;
                if(arr_v1.length - v4 < 0x20000) {
                    this.a(arr_v1.length - v4 + 1, -v4);
                }
                else {
                    if(-v4 < arr_v1.length) {
                        ArraysKt___ArraysJvmKt.copyInto(arr_v1, arr_v1, -v4, 0, arr_v1.length - -v4);
                    }
                    ArraysKt___ArraysJvmKt.fill(this.b, 0, 0, Math.min(this.b.length, -v4));
                }
            }
        }
        else {
            this.a(v2 + 1, 0);
        }
        while(true) {
            arrayDeque0 = this.c;
            if(arrayDeque0.isEmpty() || ((g)arrayDeque0.first()).a >= this.lowerBound()) {
                break;
            }
            arrayDeque0.removeFirst();
        }
        while(!arrayDeque0.isEmpty() && ((g)arrayDeque0.last()).a > this.upperBound()) {
            arrayDeque0.removeLast();
        }
    }

    public final int findNextItemIndex(int v, int v1) {
        int v2 = v + 1;
        int v3 = this.upperBound();
        while(v2 < v3) {
            if(this.assignedToLane(v2, v1)) {
                return v2;
            }
            ++v2;
        }
        return this.upperBound();
    }

    public final int findPreviousItemIndex(int v, int v1) {
        for(int v2 = v - 1; -1 < v2; --v2) {
            if(this.assignedToLane(v2, v1)) {
                return v2;
            }
        }
        return -1;
    }

    @Nullable
    public final int[] getGaps(int v) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.getGaps..inlined.binarySearchBy.default.1 lazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$10 = new Function1() {
            public final Comparable w;

            {
                this.w = comparable0;
                super(1);
            }

            @NotNull
            public final Integer invoke(Object object0) {
                return c.compareValues(((g)object0).a, this.w);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(object0);
            }
        };
        int v1 = CollectionsKt__CollectionsKt.binarySearch(this.c, 0, this.c.size(), lazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$10);
        g g0 = (g)CollectionsKt___CollectionsKt.getOrNull(this.c, v1);
        return g0 == null ? null : g0.b;
    }

    public final int getLane(int v) {
        return v < this.lowerBound() || v >= this.upperBound() ? -1 : this.b[v - this.a] - 1;
    }

    public final int lowerBound() {
        return this.a;
    }

    public final void reset() {
        ArraysKt___ArraysJvmKt.fill$default(this.b, 0, 0, 0, 6, null);
        this.c.clear();
    }

    public final void setGaps(int v, @Nullable int[] arr_v) {
        ArrayDeque arrayDeque0 = this.c;
        int v1 = CollectionsKt__CollectionsKt.binarySearch(arrayDeque0, 0, arrayDeque0.size(), new Function1() {
            public final Comparable w;

            {
                this.w = comparable0;
                super(1);
            }

            @NotNull
            public final Integer invoke(Object object0) {
                return c.compareValues(((g)object0).a, this.w);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(object0);
            }
        });
        if(v1 < 0) {
            if(arr_v == null) {
                return;
            }
            arrayDeque0.add(-(v1 + 1), new g(v, arr_v));
            return;
        }
        if(arr_v == null) {
            arrayDeque0.remove(v1);
            return;
        }
        ((g)arrayDeque0.get(v1)).b = arr_v;
    }

    public final void setLane(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported");
        }
        this.ensureValidIndex(v);
        this.b[v - this.a] = v1 + 1;
    }

    public final int upperBound() {
        return this.a + this.b.length;
    }
}

