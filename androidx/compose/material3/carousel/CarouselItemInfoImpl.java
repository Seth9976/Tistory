package androidx.compose.material3.carousel;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00048F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR+\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00048F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001A\u0004\b\u000E\u0010\t\"\u0004\b\u000F\u0010\u000BR+\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00048F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001A\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000BR+\u0010\u001C\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00158F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001E\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\tR\u0014\u0010 \u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010\tR\u0014\u0010\"\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\tR\u0014\u0010$\u001A\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b#\u0010\u0019¨\u0006%"}, d2 = {"Landroidx/compose/material3/carousel/CarouselItemInfoImpl;", "Landroidx/compose/material3/carousel/CarouselItemInfo;", "<init>", "()V", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableFloatState;", "getSizeState", "()F", "setSizeState", "(F)V", "sizeState", "b", "getMinSizeState", "setMinSizeState", "minSizeState", "c", "getMaxSizeState", "setMaxSizeState", "maxSizeState", "Landroidx/compose/ui/geometry/Rect;", "d", "Landroidx/compose/runtime/MutableState;", "getMaskRectState", "()Landroidx/compose/ui/geometry/Rect;", "setMaskRectState", "(Landroidx/compose/ui/geometry/Rect;)V", "maskRectState", "getSize", "size", "getMinSize", "minSize", "getMaxSize", "maxSize", "getMaskRect", "maskRect", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCarouselState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselItemInfoImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,163:1\n76#2:164\n109#2,2:165\n76#2:167\n109#2,2:168\n76#2:170\n109#2,2:171\n81#3:173\n107#3,2:174\n*S KotlinDebug\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselItemInfoImpl\n*L\n146#1:164\n146#1:165,2\n147#1:167\n147#1:168,2\n148#1:170\n148#1:171,2\n149#1:173\n149#1:174,2\n*E\n"})
public final class CarouselItemInfoImpl implements CarouselItemInfo {
    public static final int $stable;
    public final MutableFloatState a;
    public final MutableFloatState b;
    public final MutableFloatState c;
    public final MutableState d;

    public CarouselItemInfoImpl() {
        this.a = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.b = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.c = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.d = SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);
    }

    @Override  // androidx.compose.material3.carousel.CarouselItemInfo
    @NotNull
    public Rect getMaskRect() {
        return this.getMaskRectState();
    }

    @NotNull
    public final Rect getMaskRectState() {
        return (Rect)this.d.getValue();
    }

    @Override  // androidx.compose.material3.carousel.CarouselItemInfo
    public float getMaxSize() {
        return this.getMaxSizeState();
    }

    public final float getMaxSizeState() {
        return this.c.getFloatValue();
    }

    @Override  // androidx.compose.material3.carousel.CarouselItemInfo
    public float getMinSize() {
        return this.getMinSizeState();
    }

    public final float getMinSizeState() {
        return this.b.getFloatValue();
    }

    @Override  // androidx.compose.material3.carousel.CarouselItemInfo
    public float getSize() {
        return this.getSizeState();
    }

    public final float getSizeState() {
        return this.a.getFloatValue();
    }

    public final void setMaskRectState(@NotNull Rect rect0) {
        this.d.setValue(rect0);
    }

    public final void setMaxSizeState(float f) {
        this.c.setFloatValue(f);
    }

    public final void setMinSizeState(float f) {
        this.b.setFloatValue(f);
    }

    public final void setSizeState(float f) {
        this.a.setFloatValue(f);
    }
}

