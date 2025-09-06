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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getPerson", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Person", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPerson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Person.kt\nandroidx/compose/material/icons/filled/PersonKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,50:1\n212#2,12:51\n233#2,18:64\n253#2:101\n174#3:63\n705#4,2:82\n717#4,2:84\n719#4,11:90\n72#5,4:86\n*S KotlinDebug\n*F\n+ 1 Person.kt\nandroidx/compose/material/icons/filled/PersonKt\n*L\n29#1:51,12\n30#1:64,18\n30#1:101\n29#1:63\n30#1:82,2\n30#1:84,2\n30#1:90,11\n30#1:86,4\n*E\n"})
public final class PersonKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getPerson(@NotNull Filled icons$Filled0) {
        ImageVector imageVector0 = PersonKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = a.h(12.0f, 12.0f);
        pathBuilder0.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder0.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder0.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder0.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(12.0f, 14.0f);
        pathBuilder0.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(16.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        PersonKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

