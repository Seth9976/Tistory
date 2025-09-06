package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons.Outlined;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getInfo", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Info", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Info.kt\nandroidx/compose/material/icons/outlined/InfoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 Info.kt\nandroidx/compose/material/icons/outlined/InfoKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
public final class InfoKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getInfo(@NotNull Outlined icons$Outlined0) {
        ImageVector imageVector0 = InfoKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(11.0f, 7.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.close();
        q.y(pathBuilder0, 11.0f, 11.0f, 2.0f, 6.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(12.0f, 2.0f);
        pathBuilder0.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder0.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder0.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder0.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(12.0f, 20.0f);
        pathBuilder0.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder0.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder0.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, a.s(pathBuilder0, -3.59f, 8.0f, -8.0f, 8.0f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        InfoKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

