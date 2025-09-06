package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A2\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001AF\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,145:1\n148#2:146\n148#2:147\n148#2:148\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n66#1:146\n108#1:147\n105#1:148\n*E\n"})
public final class ShadowKt {
    @Stable
    @NotNull
    public static final Modifier shadow-s4CzXII(@NotNull Modifier modifier0, float f, @NotNull Shape shape0, boolean z, long v, long v1) {
        return Dp.compareTo-0680j_4(f, 0.0f) > 0 || z ? modifier0.then(new ShadowGraphicsLayerElement(f, shape0, z, v, v1, null)) : modifier0;
    }

    public static Modifier shadow-s4CzXII$default(Modifier modifier0, float f, Shape shape0, boolean z, long v, long v1, int v2, Object object0) {
        Shape shape1 = (v2 & 2) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        boolean z1 = false;
        if((v2 & 4) == 0) {
            z1 = z;
        }
        else if(Dp.compareTo-0680j_4(f, 0.0f) > 0) {
            z1 = true;
        }
        long v3 = (v2 & 8) == 0 ? v : 0L;
        return (v2 & 16) == 0 ? ShadowKt.shadow-s4CzXII(modifier0, f, shape1, z1, v3, v1) : ShadowKt.shadow-s4CzXII(modifier0, f, shape1, z1, v3, 0L);
    }

    // 去混淆评级： 低(40)
    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    public static final Modifier shadow-ziNgDLE(Modifier modifier0, float f, Shape shape0, boolean z) {
        return ShadowKt.shadow-s4CzXII(modifier0, f, shape0, z, 0L, 0L);
    }

    public static Modifier shadow-ziNgDLE$default(Modifier modifier0, float f, Shape shape0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            shape0 = RectangleShapeKt.getRectangleShape();
        }
        if((v & 4) != 0) {
            z = false;
            if(Dp.compareTo-0680j_4(f, 0.0f) > 0) {
                z = true;
            }
        }
        return ShadowKt.shadow-ziNgDLE(modifier0, f, shape0, z);
    }
}

