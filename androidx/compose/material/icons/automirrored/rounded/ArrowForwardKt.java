package androidx.compose.material.icons.automirrored.rounded;

import androidx.compose.material.icons.Icons.AutoMirrored.Rounded;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getArrowForward", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowForward", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nArrowForward.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrowForward.kt\nandroidx/compose/material/icons/automirrored/rounded/ArrowForwardKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n223#2:54\n216#2,3:55\n219#2,4:59\n233#2,18:63\n253#2:100\n174#3:58\n705#4,2:81\n717#4,2:83\n719#4,11:89\n72#5,4:85\n*S KotlinDebug\n*F\n+ 1 ArrowForward.kt\nandroidx/compose/material/icons/automirrored/rounded/ArrowForwardKt\n*L\n29#1:54\n29#1:55,3\n29#1:59,4\n31#1:63,18\n31#1:100\n29#1:58\n31#1:81,2\n31#1:83,2\n31#1:89,11\n31#1:85,4\n*E\n"})
public final class ArrowForwardKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getArrowForward(@NotNull Rounded icons$AutoMirrored$Rounded0) {
        ImageVector imageVector0 = ArrowForwardKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("AutoMirrored.Rounded.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(5.0f, 13.0f);
        pathBuilder0.horizontalLineToRelative(11.17f);
        pathBuilder0.lineToRelative(-4.88f, 4.88f);
        pathBuilder0.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilder0.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder0.lineToRelative(6.59f, -6.59f);
        pathBuilder0.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder0.lineToRelative(-6.58f, -6.6f);
        pathBuilder0.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder0.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder0.lineTo(16.17f, 11.0f);
        pathBuilder0.horizontalLineTo(5.0f);
        pathBuilder0.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, a.s(pathBuilder0, 0.45f, 1.0f, 1.0f, 1.0f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ArrowForwardKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

