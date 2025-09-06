package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import v0.q;
import zd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001A\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B1\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\u000E\u001A\u00020\rH\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\r2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u001D\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00020\u001C8\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001D\u0010$\u001A\b\u0012\u0004\u0012\u00020\u00020\u001C8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001E\u001A\u0004\b#\u0010 R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001A\u0004\b*\u0010(R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001A\u0004\b,\u0010(R\u0017\u0010\b\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010&\u001A\u0004\b.\u0010(R\u0017\u00101\u001A\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102R\u0011\u00104\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b3\u0010(¨\u00066"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "Landroidx/compose/material3/carousel/KeylineList;", "defaultKeylines", "", "availableSpace", "itemSpacing", "beforeContentPadding", "afterContentPadding", "<init>", "(Landroidx/compose/material3/carousel/KeylineList;FFFF)V", "scrollOffset", "maxScrollOffset", "", "roundToNearestStep", "getKeylineListForScrollOffset$material3_release", "(FFZ)Landroidx/compose/material3/carousel/KeylineList;", "getKeylineListForScrollOffset", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/material3/carousel/KeylineList;", "getDefaultKeylines", "()Landroidx/compose/material3/carousel/KeylineList;", "", "b", "Ljava/util/List;", "getStartKeylineSteps", "()Ljava/util/List;", "startKeylineSteps", "c", "getEndKeylineSteps", "endKeylineSteps", "d", "F", "getAvailableSpace", "()F", "e", "getItemSpacing", "f", "getBeforeContentPadding", "g", "getAfterContentPadding", "l", "Z", "isValid", "()Z", "getItemMainAxisSize", "itemMainAxisSize", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Strategy {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "Landroidx/compose/material3/carousel/Strategy;", "Empty", "Landroidx/compose/material3/carousel/Strategy;", "getEmpty", "()Landroidx/compose/material3/carousel/Strategy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Strategy getEmpty() {
            return Strategy.m;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final KeylineList a;
    public final List b;
    public final List c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final FloatList j;
    public final FloatList k;
    public final boolean l;
    public static final Strategy m;

    static {
        Strategy.Companion = new Companion(null);
        Strategy.$stable = 8;
        Strategy.m = new Strategy(KeylineListKt.emptyKeylineList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Strategy(@NotNull KeylineList keylineList0, float f, float f1, float f2, float f3) {
        this(keylineList0, StrategyKt.access$getStartKeylineSteps(keylineList0, f, f1, f2), StrategyKt.access$getEndKeylineSteps(keylineList0, f, f1, f3), f, f1, f2, f3);
    }

    public Strategy(KeylineList keylineList0, List list0, List list1, float f, float f1, float f2, float f3) {
        this.a = keylineList0;
        this.b = list0;
        this.c = list1;
        this.d = f;
        this.e = f1;
        this.f = f2;
        this.g = f3;
        float f4 = StrategyKt.access$getStartShiftDistance(list0, f2);
        this.h = f4;
        float f5 = StrategyKt.access$getEndShiftDistance(list1, f3);
        this.i = f5;
        boolean z = true;
        this.j = StrategyKt.access$getStepInterpolationPoints(f4, list0, true);
        this.k = StrategyKt.access$getStepInterpolationPoints(f5, list1, false);
        if(keylineList0.isEmpty() || f == 0.0f || this.getItemMainAxisSize() == 0.0f) {
            z = false;
        }
        this.l = z;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Strategy)) {
            return false;
        }
        boolean z = this.l;
        if(!z && !((Strategy)object0).l) {
            return true;
        }
        if(z != ((Strategy)object0).l) {
            return false;
        }
        if(this.d != ((Strategy)object0).d || this.e != ((Strategy)object0).e || this.f != ((Strategy)object0).f || this.g != ((Strategy)object0).g || this.getItemMainAxisSize() != ((Strategy)object0).getItemMainAxisSize() || this.h != ((Strategy)object0).h || this.i != ((Strategy)object0).i || !Intrinsics.areEqual(this.j, ((Strategy)object0).j)) {
            return false;
        }
        return Intrinsics.areEqual(this.k, ((Strategy)object0).k) ? Intrinsics.areEqual(this.a, ((Strategy)object0).a) : false;
    }

    public final float getAfterContentPadding() {
        return this.g;
    }

    public final float getAvailableSpace() {
        return this.d;
    }

    public final float getBeforeContentPadding() {
        return this.f;
    }

    @NotNull
    public final KeylineList getDefaultKeylines() {
        return this.a;
    }

    @NotNull
    public final List getEndKeylineSteps() {
        return this.c;
    }

    public final float getItemMainAxisSize() {
        return this.a.getFirstFocal().getSize();
    }

    public final float getItemSpacing() {
        return this.e;
    }

    @NotNull
    public final KeylineList getKeylineListForScrollOffset$material3_release(float f, float f1, boolean z) {
        List list0;
        FloatList floatList0;
        float f2 = Math.max(0.0f, f);
        float f3 = Math.max(0.0f, f1 - this.i);
        float f4 = this.h;
        if(f4 <= f2 && f2 <= f3) {
            return this.a;
        }
        float f5 = StrategyKt.access$lerp(1.0f, 0.0f, 0.0f, f4, f2);
        if(f2 > f3) {
            f5 = StrategyKt.access$lerp(0.0f, 1.0f, f3, f1, f2);
            floatList0 = this.k;
            list0 = this.c;
        }
        else {
            floatList0 = this.j;
            list0 = this.b;
        }
        q q0 = StrategyKt.access$getShiftPointRange(list0.size(), floatList0, f5);
        if(z) {
            return c.roundToInt(q0.c) == 0 ? ((KeylineList)list0.get(q0.a)) : ((KeylineList)list0.get(q0.b));
        }
        return KeylineListKt.lerp(((KeylineList)list0.get(q0.a)), ((KeylineList)list0.get(q0.b)), q0.c);
    }

    public static KeylineList getKeylineListForScrollOffset$material3_release$default(Strategy strategy0, float f, float f1, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return strategy0.getKeylineListForScrollOffset$material3_release(f, f1, z);
    }

    @NotNull
    public final List getStartKeylineSteps() {
        return this.b;
    }

    @Override
    public int hashCode() {
        if(!this.l) {
            return 0x4D5;
        }
        int v = Float.hashCode(this.getItemMainAxisSize());
        return this.a.hashCode() + (this.k.hashCode() + (this.j.hashCode() + a.b(this.i, a.b(this.h, (v + a.b(this.g, a.b(this.f, a.b(this.e, a.b(this.d, 0x9511, 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F), 0x1F)) * 0x1F) * 0x1F;
    }

    public final boolean isValid() {
        return this.l;
    }
}

