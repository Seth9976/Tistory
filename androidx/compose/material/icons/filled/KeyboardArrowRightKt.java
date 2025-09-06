package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons.Filled;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001E\u0010\u0006\u001A\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getKeyboardArrowRight", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "getKeyboardArrowRight$annotations", "(Landroidx/compose/material/icons/Icons$Filled;)V", "KeyboardArrowRight", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeyboardArrowRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardArrowRight.kt\nandroidx/compose/material/icons/filled/KeyboardArrowRightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,51:1\n212#2,12:52\n233#2,18:65\n253#2:102\n174#3:64\n705#4,2:83\n717#4,2:85\n719#4,11:91\n72#5,4:87\n*S KotlinDebug\n*F\n+ 1 KeyboardArrowRight.kt\nandroidx/compose/material/icons/filled/KeyboardArrowRightKt\n*L\n35#1:52,12\n36#1:65,18\n36#1:102\n35#1:64\n36#1:83,2\n36#1:85,2\n36#1:91,11\n36#1:87,4\n*E\n"})
public final class KeyboardArrowRightKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getKeyboardArrowRight(@NotNull Filled icons$Filled0) {
        ImageVector imageVector0 = KeyboardArrowRightKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.B(8.59f, 16.59f, 13.17f, 12.0f);
        pathBuilder0.lineTo(8.59f, 7.41f);
        pathBuilder0.lineTo(10.0f, 6.0f);
        pathBuilder0.lineToRelative(6.0f, 6.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, q.v(pathBuilder0, -6.0f, 6.0f, -1.41f, -1.41f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        KeyboardArrowRightKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Filled.KeyboardArrowRight", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Filled.KeyboardArrowRight", imports = {"androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight"}))
    public static void getKeyboardArrowRight$annotations(Filled icons$Filled0) {
    }
}

