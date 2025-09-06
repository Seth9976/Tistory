package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000B\u001A\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u000B\u0010\fJ+\u0010\u000B\u001A\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u000B\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R \u0010\u0016\u001A\u00020\u00118\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Center$1", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "arrange", "(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "(Landroidx/compose/ui/unit/Density;I[I[I)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getSpacing-D9Ej5fM", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n148#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n*L\n191#1:716\n*E\n"})
public final class Arrangement.Center.1 implements HorizontalOrVertical {
    public final float a;

    public Arrangement.Center.1() {
        this.a = 0.0f;
    }

    @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal
    public void arrange(@NotNull Density density0, int v, @NotNull int[] arr_v, @NotNull LayoutDirection layoutDirection0, @NotNull int[] arr_v1) {
        if(layoutDirection0 == LayoutDirection.Ltr) {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(v, arr_v, arr_v1, false);
            return;
        }
        Arrangement.INSTANCE.placeCenter$foundation_layout_release(v, arr_v, arr_v1, true);
    }

    @Override  // androidx.compose.foundation.layout.Arrangement$Vertical
    public void arrange(@NotNull Density density0, int v, @NotNull int[] arr_v, @NotNull int[] arr_v1) {
        Arrangement.INSTANCE.placeCenter$foundation_layout_release(v, arr_v, arr_v1, false);
    }

    @Override  // androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical
    public float getSpacing-D9Ej5fM() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "Arrangement#Center";
    }
}

