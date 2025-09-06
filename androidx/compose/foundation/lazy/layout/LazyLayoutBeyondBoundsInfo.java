package androidx.compose.foundation.lazy.layout;

import a5.b;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "<init>", "()V", "", "start", "end", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "addInterval", "(II)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "interval", "", "removeInterval", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;)V", "", "hasIntervals", "()Z", "getStart", "()I", "getEnd", "Interval", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1208#2:127\n1187#2,2:128\n460#3,11:130\n460#3,11:142\n1#4:141\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:142,11\n*E\n"})
public final class LazyLayoutBeyondBoundsInfo {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\bJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "", "start", "end", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getStart", "b", "getEnd", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class Interval {
        public static final int $stable;
        public final int a;
        public final int b;

        public Interval(int v, int v1) {
            this.a = v;
            this.b = v1;
            if(v < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if(v1 < v) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public final int component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final Interval copy(int v, int v1) {
            return new Interval(v, v1);
        }

        public static Interval copy$default(Interval lazyLayoutBeyondBoundsInfo$Interval0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = lazyLayoutBeyondBoundsInfo$Interval0.a;
            }
            if((v2 & 2) != 0) {
                v1 = lazyLayoutBeyondBoundsInfo$Interval0.b;
            }
            return lazyLayoutBeyondBoundsInfo$Interval0.copy(v, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Interval)) {
                return false;
            }
            return this.a == ((Interval)object0).a ? this.b == ((Interval)object0).b : false;
        }

        public final int getEnd() {
            return this.b;
        }

        public final int getStart() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b + this.a * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Interval(start=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", end=");
            return b.p(stringBuilder0, this.b, ')');
        }
    }

    public static final int $stable;
    public final MutableVector a;

    static {
        LazyLayoutBeyondBoundsInfo.$stable = MutableVector.$stable;
    }

    public LazyLayoutBeyondBoundsInfo() {
        this.a = new MutableVector(new Interval[16], 0);
    }

    @NotNull
    public final Interval addInterval(int v, int v1) {
        Interval lazyLayoutBeyondBoundsInfo$Interval0 = new Interval(v, v1);
        this.a.add(lazyLayoutBeyondBoundsInfo$Interval0);
        return lazyLayoutBeyondBoundsInfo$Interval0;
    }

    public final int getEnd() {
        MutableVector mutableVector0 = this.a;
        int v = ((Interval)mutableVector0.first()).getEnd();
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v2 = 0;
            while(true) {
                Interval lazyLayoutBeyondBoundsInfo$Interval0 = (Interval)arr_object[v2];
                if(lazyLayoutBeyondBoundsInfo$Interval0.getEnd() > v) {
                    v = lazyLayoutBeyondBoundsInfo$Interval0.getEnd();
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        return v;
    }

    public final int getStart() {
        MutableVector mutableVector0 = this.a;
        int v = ((Interval)mutableVector0.first()).getStart();
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v2 = 0;
            while(true) {
                Interval lazyLayoutBeyondBoundsInfo$Interval0 = (Interval)arr_object[v2];
                if(lazyLayoutBeyondBoundsInfo$Interval0.getStart() < v) {
                    v = lazyLayoutBeyondBoundsInfo$Interval0.getStart();
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        if(v < 0) {
            throw new IllegalArgumentException("negative minIndex");
        }
        return v;
    }

    public final boolean hasIntervals() {
        return this.a.isNotEmpty();
    }

    public final void removeInterval(@NotNull Interval lazyLayoutBeyondBoundsInfo$Interval0) {
        this.a.remove(lazyLayoutBeyondBoundsInfo$Interval0);
    }
}

