package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons.Outlined;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSearch", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Search", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Search.kt\nandroidx/compose/material/icons/outlined/SearchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,57:1\n212#2,12:58\n233#2,18:71\n253#2:108\n174#3:70\n705#4,2:89\n717#4,2:91\n719#4,11:97\n72#5,4:93\n*S KotlinDebug\n*F\n+ 1 Search.kt\nandroidx/compose/material/icons/outlined/SearchKt\n*L\n29#1:58,12\n30#1:71,18\n30#1:108\n29#1:70\n30#1:89,2\n30#1:91,2\n30#1:97,11\n30#1:93,4\n*E\n"})
public final class SearchKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getSearch(@NotNull Outlined icons$Outlined0) {
        ImageVector imageVector0 = SearchKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Outlined.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(15.5f, 14.0f);
        pathBuilder0.horizontalLineToRelative(-0.79f);
        pathBuilder0.lineToRelative(-0.28f, -0.27f);
        pathBuilder0.curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        pathBuilder0.curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        pathBuilder0.reflectiveCurveTo(3.0f, 5.91f, 3.0f, 9.5f);
        pathBuilder0.reflectiveCurveTo(5.91f, 16.0f, 9.5f, 16.0f);
        pathBuilder0.curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        pathBuilder0.lineToRelative(0.27f, 0.28f);
        pathBuilder0.verticalLineToRelative(0.79f);
        pathBuilder0.lineToRelative(5.0f, 4.99f);
        pathBuilder0.lineTo(20.49f, 19.0f);
        pathBuilder0.lineToRelative(-4.99f, -5.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(9.5f, 14.0f);
        pathBuilder0.curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        pathBuilder0.reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f);
        pathBuilder0.reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f);
        pathBuilder0.reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        SearchKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

