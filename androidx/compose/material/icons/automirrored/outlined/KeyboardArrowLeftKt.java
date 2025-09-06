package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons.AutoMirrored.Outlined;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getKeyboardArrowLeft", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardArrowLeft", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeyboardArrowLeft.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardArrowLeft.kt\nandroidx/compose/material/icons/automirrored/outlined/KeyboardArrowLeftKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,46:1\n223#2:47\n216#2,3:48\n219#2,4:52\n233#2,18:56\n253#2:93\n174#3:51\n705#4,2:74\n717#4,2:76\n719#4,11:82\n72#5,4:78\n*S KotlinDebug\n*F\n+ 1 KeyboardArrowLeft.kt\nandroidx/compose/material/icons/automirrored/outlined/KeyboardArrowLeftKt\n*L\n29#1:47\n29#1:48,3\n29#1:52,4\n31#1:56,18\n31#1:93\n29#1:51\n31#1:74,2\n31#1:76,2\n31#1:82,11\n31#1:78,4\n*E\n"})
public final class KeyboardArrowLeftKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getKeyboardArrowLeft(@NotNull Outlined icons$AutoMirrored$Outlined0) {
        ImageVector imageVector0 = KeyboardArrowLeftKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("AutoMirrored.Outlined.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.B(15.41f, 16.59f, 10.83f, 12.0f);
        pathBuilder0.lineToRelative(4.58f, -4.59f);
        pathBuilder0.lineTo(14.0f, 6.0f);
        pathBuilder0.lineToRelative(-6.0f, 6.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, q.v(pathBuilder0, 6.0f, 6.0f, 1.41f, -1.41f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        KeyboardArrowLeftKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

