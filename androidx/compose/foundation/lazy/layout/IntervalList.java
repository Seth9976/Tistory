package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0010J6\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u00042\u0018\u0010\u000B\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\b0\fH&J\u0017\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000F\u001A\u00020\u0004H¦\u0002R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", "T", "", "size", "", "getSize", "()I", "forEach", "", "fromIndex", "toIndex", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "get", "index", "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface IntervalList {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001A\u0004\b\u000E\u0010\fR\u0017\u0010\u0006\u001A\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "T", "", "", "startIndex", "size", "value", "<init>", "(IILjava/lang/Object;)V", "a", "I", "getStartIndex", "()I", "b", "getSize", "c", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
    public static final class Interval {
        public static final int $stable;
        public final int a;
        public final int b;
        public final Object c;

        public Interval(int v, int v1, Object object0) {
            this.a = v;
            this.b = v1;
            this.c = object0;
            if(v < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + v).toString());
            }
            if(v1 <= 0) {
                throw new IllegalArgumentException(("size should be >0, but was " + v1).toString());
            }
        }

        public final int getSize() {
            return this.b;
        }

        public final int getStartIndex() {
            return this.a;
        }

        public final Object getValue() {
            return this.c;
        }
    }

    void forEach(int arg1, int arg2, @NotNull Function1 arg3);

    static void forEach$default(IntervalList intervalList0, int v, int v1, Function1 function10, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = intervalList0.getSize() - 1;
        }
        intervalList0.forEach(v, v1, function10);
    }

    @NotNull
    Interval get(int arg1);

    int getSize();
}

