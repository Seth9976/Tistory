package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons.Rounded;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001E\u0010\u0006\u001A\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getKeyboardArrowLeft", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "getKeyboardArrowLeft$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "KeyboardArrowLeft", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeyboardArrowLeft.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardArrowLeft.kt\nandroidx/compose/material/icons/rounded/KeyboardArrowLeftKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,54:1\n212#2,12:55\n233#2,18:68\n253#2:105\n174#3:67\n705#4,2:86\n717#4,2:88\n719#4,11:94\n72#5,4:90\n*S KotlinDebug\n*F\n+ 1 KeyboardArrowLeft.kt\nandroidx/compose/material/icons/rounded/KeyboardArrowLeftKt\n*L\n35#1:55,12\n36#1:68,18\n36#1:105\n35#1:67\n36#1:86,2\n36#1:88,2\n36#1:94,11\n36#1:90,4\n*E\n"})
public final class KeyboardArrowLeftKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getKeyboardArrowLeft(@NotNull Rounded icons$Rounded0) {
        ImageVector imageVector0 = KeyboardArrowLeftKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Rounded.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.B(14.71f, 15.88f, 10.83f, 12.0f);
        pathBuilder0.lineToRelative(3.88f, -3.88f);
        pathBuilder0.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder0.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder0.lineTo(8.71f, 11.3f);
        pathBuilder0.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder0.lineToRelative(4.59f, 4.59f);
        pathBuilder0.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder0.curveToRelative(0.38f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        KeyboardArrowLeftKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.KeyboardArrowLeft", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.KeyboardArrowLeft", imports = {"androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft"}))
    public static void getKeyboardArrowLeft$annotations(Rounded icons$Rounded0) {
    }
}

