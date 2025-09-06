package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import n1.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A(\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A0\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,154:1\n148#2:155\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:155\n*E\n"})
public final class BlurKt {
    // 去混淆评级： 低(23)
    @Stable
    @NotNull
    public static final Modifier blur-1fqS-gw(@NotNull Modifier modifier0, float f, float f1, @NotNull Shape shape0) {
        if(shape0 != null) {
            return GraphicsLayerModifierKt.graphicsLayer(modifier0, new a(f, f1, 0, shape0, true));
        }
        return Dp.compareTo-0680j_4(f, 0.0f) <= 0 || Dp.compareTo-0680j_4(f1, 0.0f) <= 0 ? modifier0 : GraphicsLayerModifierKt.graphicsLayer(modifier0, new a(f, f1, 3, null, false));
    }

    public static Modifier blur-1fqS-gw$default(Modifier modifier0, float f, float f1, BlurredEdgeTreatment blurredEdgeTreatment0, int v, Object object0) {
        if((v & 4) != 0) {
            blurredEdgeTreatment0 = BlurredEdgeTreatment.box-impl(BlurredEdgeTreatment.Companion.getRectangle---Goahg());
        }
        return BlurKt.blur-1fqS-gw(modifier0, f, f1, blurredEdgeTreatment0.unbox-impl());
    }

    @Stable
    @NotNull
    public static final Modifier blur-F8QBwvs(@NotNull Modifier modifier0, float f, @NotNull Shape shape0) {
        return BlurKt.blur-1fqS-gw(modifier0, f, f, shape0);
    }

    public static Modifier blur-F8QBwvs$default(Modifier modifier0, float f, BlurredEdgeTreatment blurredEdgeTreatment0, int v, Object object0) {
        if((v & 2) != 0) {
            blurredEdgeTreatment0 = BlurredEdgeTreatment.box-impl(BlurredEdgeTreatment.Companion.getRectangle---Goahg());
        }
        return BlurKt.blur-F8QBwvs(modifier0, f, blurredEdgeTreatment0.unbox-impl());
    }
}

