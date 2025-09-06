package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons.Rounded;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getFace", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Face", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/rounded/FaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n212#2,12:65\n233#2,18:78\n253#2:115\n174#3:77\n705#4,2:96\n717#4,2:98\n719#4,11:104\n72#5,4:100\n*S KotlinDebug\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/rounded/FaceKt\n*L\n29#1:65,12\n30#1:78,18\n30#1:115\n29#1:77\n30#1:96,2\n30#1:98,2\n30#1:104,11\n30#1:100,4\n*E\n"})
public final class FaceKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getFace(@NotNull Rounded icons$Rounded0) {
        ImageVector imageVector0 = FaceKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Rounded.Face", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = a.h(10.25f, 13.0f);
        pathBuilder0.curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
        pathBuilder0.reflectiveCurveTo(7.75f, 13.69f, 7.75f, 13.0f);
        pathBuilder0.reflectiveCurveTo(8.31f, 11.75f, 9.0f, 11.75f);
        pathBuilder0.reflectiveCurveTo(10.25f, 12.31f, 10.25f, 13.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(15.0f, 11.75f);
        pathBuilder0.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder0.reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f);
        pathBuilder0.reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder0.reflectiveCurveTo(15.69f, 11.75f, 15.0f, 11.75f);
        pathBuilder0.close();
        pathBuilder0.moveTo(22.0f, 12.0f);
        pathBuilder0.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        pathBuilder0.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilder0.reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f);
        pathBuilder0.reflectiveCurveTo(22.0f, 6.48f, 22.0f, 12.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(20.0f, 12.0f);
        pathBuilder0.curveToRelative(0.0f, -0.78f, -0.12f, -1.53f, -0.33f, -2.24f);
        pathBuilder0.curveTo(18.969999f, 9.91f, 18.25f, 10.0f, 17.5f, 10.0f);
        pathBuilder0.curveToRelative(-3.13f, 0.0f, -5.92f, -1.44f, -7.76f, -3.69f);
        pathBuilder0.curveTo(8.69f, 8.87f, 6.6f, 10.88f, 4.0f, 11.86f);
        pathBuilder0.curveTo(4.01f, 11.9f, 4.0f, 11.95f, 4.0f, 12.0f);
        pathBuilder0.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilder0.reflectiveCurveTo(20.0f, 16.41f, 20.0f, 12.0f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        FaceKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

