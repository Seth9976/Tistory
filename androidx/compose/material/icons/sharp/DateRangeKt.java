package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons.Sharp;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getDateRange", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "DateRange", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRange.kt\nandroidx/compose/material/icons/sharp/DateRangeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n72#5,4:111\n*S KotlinDebug\n*F\n+ 1 DateRange.kt\nandroidx/compose/material/icons/sharp/DateRangeKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n30#1:111,4\n*E\n"})
public final class DateRangeKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getDateRange(@NotNull Sharp icons$Sharp0) {
        ImageVector imageVector0 = DateRangeKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Sharp.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(9.0f, 11.0f);
        pathBuilder0.lineTo(7.0f, 11.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(13.0f, 11.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.close();
        q.y(pathBuilder0, 17.0f, 11.0f, -2.0f, 2.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(21.0f, 4.0f);
        pathBuilder0.horizontalLineToRelative(-3.0f);
        pathBuilder0.lineTo(18.0f, 2.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.lineTo(8.0f, 4.0f);
        pathBuilder0.lineTo(8.0f, 2.0f);
        pathBuilder0.lineTo(6.0f, 2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.lineTo(3.0f, 4.0f);
        pathBuilder0.verticalLineToRelative(18.0f);
        pathBuilder0.horizontalLineToRelative(18.0f);
        pathBuilder0.lineTo(21.0f, 4.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(19.0f, 20.0f);
        pathBuilder0.lineTo(5.0f, 20.0f);
        pathBuilder0.lineTo(5.0f, 9.0f);
        pathBuilder0.horizontalLineToRelative(14.0f);
        pathBuilder0.verticalLineToRelative(11.0f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        DateRangeKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

