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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getClear", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Clear", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nClear.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clear.kt\nandroidx/compose/material/icons/outlined/ClearKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,51:1\n212#2,12:52\n233#2,18:65\n253#2:102\n174#3:64\n705#4,2:83\n717#4,2:85\n719#4,11:91\n72#5,4:87\n*S KotlinDebug\n*F\n+ 1 Clear.kt\nandroidx/compose/material/icons/outlined/ClearKt\n*L\n29#1:52,12\n30#1:65,18\n30#1:102\n29#1:64\n30#1:83,2\n30#1:85,2\n30#1:91,11\n30#1:87,4\n*E\n"})
public final class ClearKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getClear(@NotNull Outlined icons$Outlined0) {
        ImageVector imageVector0 = ClearKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Outlined.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.B(19.0f, 6.41f, 17.59f, 5.0f);
        pathBuilder0.lineTo(12.0f, 10.59f);
        pathBuilder0.lineTo(6.41f, 5.0f);
        pathBuilder0.lineTo(5.0f, 6.41f);
        pathBuilder0.lineTo(10.59f, 12.0f);
        pathBuilder0.lineTo(5.0f, 17.59f);
        pathBuilder0.lineTo(6.41f, 19.0f);
        pathBuilder0.lineTo(12.0f, 13.41f);
        pathBuilder0.lineTo(17.59f, 19.0f);
        pathBuilder0.lineTo(19.0f, 17.59f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, q.C(pathBuilder0, 13.41f, 12.0f, 19.0f, 6.41f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ClearKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

