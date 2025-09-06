package androidx.compose.foundation.lazy.layout;

import a5.b;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001D\u0010\t\u001A\u00020\b2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0010\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u00052\u0006\u0010\f\u001A\u00020\u00052\u0018\u0010\u000F\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000E\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001E\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0006\u0010\u0012\u001A\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0015\u001A\u00020\u00058\u0016@RX\u0096\u000E¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "<init>", "()V", "", "size", "value", "", "addInterval", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "block", "forEach", "(IILkotlin/jvm/functions/Function1;)V", "index", "get", "(I)Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "<set-?>", "b", "I", "getSize", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n1208#2:223\n1187#2,2:224\n523#3:226\n523#3:227\n523#3:228\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n104#1:223\n104#1:224,2\n156#1:226\n158#1:227\n175#1:228\n*E\n"})
public final class MutableIntervalList implements IntervalList {
    public static final int $stable = 8;
    public final MutableVector a;
    public int b;
    public Interval c;

    public MutableIntervalList() {
        this.a = new MutableVector(new Interval[16], 0);
    }

    public final void a(int v) {
        if(v >= 0 && v < this.getSize()) {
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", ", size ");
        stringBuilder0.append(this.getSize());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final void addInterval(int v, Object object0) {
        if(v < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + v).toString());
        }
        if(v == 0) {
            return;
        }
        Interval intervalList$Interval0 = new Interval(this.getSize(), v, object0);
        this.b = this.getSize() + v;
        this.a.add(intervalList$Interval0);
    }

    @Override  // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int v, int v1, @NotNull Function1 function10) {
        this.a(v);
        this.a(v1);
        if(v1 < v) {
            throw new IllegalArgumentException(("toIndex (" + v1 + ") should be not smaller than fromIndex (" + v + ')').toString());
        }
        MutableVector mutableVector0 = this.a;
        int v2 = IntervalListKt.access$binarySearch(mutableVector0, v);
        int v3 = ((Interval)mutableVector0.getContent()[v2]).getStartIndex();
        while(v3 <= v1) {
            Interval intervalList$Interval0 = (Interval)mutableVector0.getContent()[v2];
            function10.invoke(intervalList$Interval0);
            v3 += intervalList$Interval0.getSize();
            ++v2;
        }
    }

    @Override  // androidx.compose.foundation.lazy.layout.IntervalList
    @NotNull
    public Interval get(int v) {
        this.a(v);
        Interval intervalList$Interval0 = this.c;
        if(intervalList$Interval0 == null || (v >= intervalList$Interval0.getSize() + intervalList$Interval0.getStartIndex() || intervalList$Interval0.getStartIndex() > v)) {
            intervalList$Interval0 = (Interval)this.a.getContent()[IntervalListKt.access$binarySearch(this.a, v)];
            this.c = intervalList$Interval0;
        }
        return intervalList$Interval0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.b;
    }
}

