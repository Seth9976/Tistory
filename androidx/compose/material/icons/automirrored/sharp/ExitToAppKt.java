package androidx.compose.material.icons.automirrored.sharp;

import androidx.compose.material.icons.Icons.AutoMirrored.Sharp;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$AutoMirrored$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getExitToApp", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ExitToApp", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExitToApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExitToApp.kt\nandroidx/compose/material/icons/automirrored/sharp/ExitToAppKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n223#2:63\n216#2,3:64\n219#2,4:68\n233#2,18:72\n253#2:109\n174#3:67\n705#4,2:90\n717#4,2:92\n719#4,11:98\n72#5,4:94\n*S KotlinDebug\n*F\n+ 1 ExitToApp.kt\nandroidx/compose/material/icons/automirrored/sharp/ExitToAppKt\n*L\n29#1:63\n29#1:64,3\n29#1:68,4\n30#1:72,18\n30#1:109\n29#1:67\n30#1:90,2\n30#1:92,2\n30#1:98,11\n30#1:94,4\n*E\n"})
public final class ExitToAppKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getExitToApp(@NotNull Sharp icons$AutoMirrored$Sharp0) {
        ImageVector imageVector0 = ExitToAppKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("AutoMirrored.Sharp.ExitToApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.B(10.09f, 15.59f, 11.5f, 17.0f);
        pathBuilder0.lineToRelative(5.0f, -5.0f);
        pathBuilder0.lineToRelative(-5.0f, -5.0f);
        pathBuilder0.lineToRelative(-1.41f, 1.41f);
        pathBuilder0.lineTo(12.67f, 11.0f);
        pathBuilder0.horizontalLineTo(3.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(9.67f);
        pathBuilder0.lineToRelative(-2.58f, 2.59f);
        pathBuilder0.close();
        pathBuilder0.moveTo(21.0f, 3.0f);
        pathBuilder0.horizontalLineTo(3.0f);
        pathBuilder0.verticalLineToRelative(6.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineTo(5.0f);
        pathBuilder0.horizontalLineToRelative(14.0f);
        pathBuilder0.verticalLineToRelative(14.0f);
        pathBuilder0.horizontalLineTo(5.0f);
        pathBuilder0.verticalLineToRelative(-4.0f);
        pathBuilder0.horizontalLineTo(3.0f);
        pathBuilder0.verticalLineToRelative(6.0f);
        pathBuilder0.horizontalLineToRelative(18.0f);
        pathBuilder0.verticalLineTo(3.0f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ExitToAppKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

