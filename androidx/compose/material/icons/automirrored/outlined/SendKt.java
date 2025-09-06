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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSend", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Send", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/automirrored/outlined/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n223#2:54\n216#2,3:55\n219#2,4:59\n233#2,18:63\n253#2:100\n174#3:58\n705#4,2:81\n717#4,2:83\n719#4,11:89\n72#5,4:85\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/automirrored/outlined/SendKt\n*L\n29#1:54\n29#1:55,3\n29#1:59,4\n30#1:63,18\n30#1:100\n29#1:58\n30#1:81,2\n30#1:83,2\n30#1:89,11\n30#1:85,4\n*E\n"})
public final class SendKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getSend(@NotNull Outlined icons$AutoMirrored$Outlined0) {
        ImageVector imageVector0 = SendKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("AutoMirrored.Outlined.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.g(4.01f, 6.03f, 7.51f, 3.22f);
        pathBuilder0.lineToRelative(-7.52f, -1.0f);
        pathBuilder0.lineToRelative(0.01f, -2.22f);
        pathBuilder0.moveToRelative(7.5f, 8.72f);
        pathBuilder0.lineTo(4.0f, 17.969999f);
        pathBuilder0.verticalLineToRelative(-2.22f);
        pathBuilder0.lineToRelative(7.51f, -1.0f);
        pathBuilder0.moveTo(2.01f, 3.0f);
        pathBuilder0.lineTo(2.0f, 10.0f);
        pathBuilder0.lineToRelative(15.0f, 2.0f);
        pathBuilder0.lineToRelative(-15.0f, 2.0f);
        pathBuilder0.lineToRelative(0.01f, 7.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, q.C(pathBuilder0, 23.0f, 12.0f, 2.01f, 3.0f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        SendKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

