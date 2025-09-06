package androidx.compose.material.icons.automirrored.filled;

import androidx.compose.material.icons.Icons.AutoMirrored.Filled;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getArrowForward", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowForward", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nArrowForward.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrowForward.kt\nandroidx/compose/material/icons/automirrored/filled/ArrowForwardKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,47:1\n223#2:48\n216#2,3:49\n219#2,4:53\n233#2,18:57\n253#2:94\n174#3:52\n705#4,2:75\n717#4,2:77\n719#4,11:83\n72#5,4:79\n*S KotlinDebug\n*F\n+ 1 ArrowForward.kt\nandroidx/compose/material/icons/automirrored/filled/ArrowForwardKt\n*L\n29#1:48\n29#1:49,3\n29#1:53,4\n30#1:57,18\n30#1:94\n29#1:52\n30#1:75,2\n30#1:77,2\n30#1:83,11\n30#1:79,4\n*E\n"})
public final class ArrowForwardKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getArrowForward(@NotNull Filled icons$AutoMirrored$Filled0) {
        ImageVector imageVector0 = ArrowForwardKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("AutoMirrored.Filled.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.g(12.0f, 4.0f, -1.41f, 1.41f);
        pathBuilder0.lineTo(16.17f, 11.0f);
        pathBuilder0.horizontalLineTo(4.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(12.17f);
        pathBuilder0.lineToRelative(-5.58f, 5.59f);
        pathBuilder0.lineTo(12.0f, 20.0f);
        pathBuilder0.lineToRelative(8.0f, -8.0f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ArrowForwardKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

