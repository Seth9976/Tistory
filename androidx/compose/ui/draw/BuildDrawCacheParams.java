package androidx.compose.ui.draw;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\u00020\u000BX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/draw/BuildDrawCacheParams;", "", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface BuildDrawCacheParams {
    @NotNull
    Density getDensity();

    @NotNull
    LayoutDirection getLayoutDirection();

    long getSize-NH-jbRc();
}

