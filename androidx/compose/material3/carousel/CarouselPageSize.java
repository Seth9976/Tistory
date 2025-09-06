package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zd.c;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BO\u00126\u0010\t\u001A2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\n\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001A\u00020\u000F*\u00020\u000E2\u0006\u0010\u0006\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/carousel/CarouselPageSize;", "Landroidx/compose/foundation/pager/PageSize;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "availableSpace", "itemSpacing", "Landroidx/compose/material3/carousel/KeylineList;", "keylineList", "beforeContentPadding", "afterContentPadding", "<init>", "(Lkotlin/jvm/functions/Function2;FF)V", "Landroidx/compose/ui/unit/Density;", "", "pageSpacing", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "Landroidx/compose/material3/carousel/Strategy;", "getStrategy", "()Landroidx/compose/material3/carousel/Strategy;", "strategy", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselPageSize\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,693:1\n81#2:694\n107#2,2:695\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselPageSize\n*L\n379#1:694\n379#1:695,2\n*E\n"})
public final class CarouselPageSize implements PageSize {
    public static final int $stable;
    public final Function2 a;
    public final float b;
    public final float c;
    public final MutableState d;

    public CarouselPageSize(@NotNull Function2 function20, float f, float f1) {
        this.a = function20;
        this.b = f;
        this.c = f1;
        this.d = SnapshotStateKt.mutableStateOf$default(Strategy.Companion.getEmpty(), null, 2, null);
    }

    @Override  // androidx.compose.foundation.pager.PageSize
    public int calculateMainAxisPageSize(@NotNull Density density0, int v, int v1) {
        Strategy strategy0 = new Strategy(((KeylineList)this.a.invoke(((float)v), ((float)v1))), ((float)v), ((float)v1), this.b, this.c);
        this.d.setValue(strategy0);
        return this.getStrategy().isValid() ? c.roundToInt(this.getStrategy().getItemMainAxisSize()) : v;
    }

    @NotNull
    public final Strategy getStrategy() {
        return (Strategy)this.d.getValue();
    }
}

