package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons.Filled;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getShoppingCart", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ShoppingCart", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nShoppingCart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingCart.kt\nandroidx/compose/material/icons/filled/ShoppingCartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 ShoppingCart.kt\nandroidx/compose/material/icons/filled/ShoppingCartKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"})
public final class ShoppingCartKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getShoppingCart(@NotNull Filled icons$Filled0) {
        ImageVector imageVector0 = ShoppingCartKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Filled.ShoppingCart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = a.h(7.0f, 18.0f);
        pathBuilder0.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder0.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilder0.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder0.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(1.0f, 2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.lineToRelative(3.6f, 7.59f);
        pathBuilder0.lineToRelative(-1.35f, 2.45f);
        pathBuilder0.curveToRelative(-0.16f, 0.28f, -0.25f, 0.61f, -0.25f, 0.96f);
        pathBuilder0.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder0.horizontalLineToRelative(12.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.lineTo(7.42f, 15.0f);
        pathBuilder0.curveToRelative(-0.14f, 0.0f, -0.25f, -0.11f, -0.25f, -0.25f);
        pathBuilder0.lineToRelative(0.03f, -0.12f);
        pathBuilder0.lineToRelative(0.9f, -1.63f);
        pathBuilder0.horizontalLineToRelative(7.45f);
        pathBuilder0.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilder0.lineToRelative(3.58f, -6.49f);
        pathBuilder0.curveToRelative(0.08f, -0.14f, 0.12f, -0.31f, 0.12f, -0.48f);
        pathBuilder0.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder0.lineTo(5.21f, 4.0f);
        pathBuilder0.lineToRelative(-0.94f, -2.0f);
        pathBuilder0.lineTo(1.0f, 2.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(17.0f, 18.0f);
        pathBuilder0.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder0.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilder0.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, a.s(pathBuilder0, -0.9f, -2.0f, -2.0f, -2.0f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ShoppingCartKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

