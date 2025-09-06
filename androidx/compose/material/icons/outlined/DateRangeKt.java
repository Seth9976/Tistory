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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getDateRange", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "DateRange", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRange.kt\nandroidx/compose/material/icons/outlined/DateRangeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 DateRange.kt\nandroidx/compose/material/icons/outlined/DateRangeKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"})
public final class DateRangeKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getDateRange(@NotNull Outlined icons$Outlined0) {
        ImageVector imageVector0 = DateRangeKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Outlined.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(7.0f, 11.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        q.x(pathBuilder0, 7.0f, 13.0f, -2.0f);
        pathBuilder0.moveTo(21.0f, 6.0f);
        pathBuilder0.verticalLineToRelative(14.0f);
        pathBuilder0.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder0.lineTo(5.0f, 22.0f);
        pathBuilder0.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder0.lineToRelative(0.01f, -14.0f);
        pathBuilder0.curveToRelative(0.0f, -1.1f, 0.88f, -2.0f, 1.99f, -2.0f);
        pathBuilder0.horizontalLineToRelative(1.0f);
        pathBuilder0.lineTo(6.0f, 2.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(8.0f);
        pathBuilder0.lineTo(16.0f, 2.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(1.0f);
        pathBuilder0.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(5.0f, 8.0f);
        pathBuilder0.horizontalLineToRelative(14.0f);
        pathBuilder0.lineTo(19.0f, 6.0f);
        q.x(pathBuilder0, 5.0f, 6.0f, 2.0f);
        pathBuilder0.moveTo(19.0f, 20.0f);
        pathBuilder0.lineTo(19.0f, 10.0f);
        pathBuilder0.lineTo(5.0f, 10.0f);
        pathBuilder0.verticalLineToRelative(10.0f);
        pathBuilder0.horizontalLineToRelative(14.0f);
        pathBuilder0.close();
        q.y(pathBuilder0, 15.0f, 13.0f, 2.0f, -2.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(11.0f, 13.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        DateRangeKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

