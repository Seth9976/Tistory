package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons.Rounded;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getPhone", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Phone", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Phone.kt\nandroidx/compose/material/icons/rounded/PhoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n212#2,12:54\n233#2,18:67\n253#2:104\n174#3:66\n705#4,2:85\n717#4,2:87\n719#4,11:93\n72#5,4:89\n*S KotlinDebug\n*F\n+ 1 Phone.kt\nandroidx/compose/material/icons/rounded/PhoneKt\n*L\n29#1:54,12\n30#1:67,18\n30#1:104\n29#1:66\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"})
public final class PhoneKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getPhone(@NotNull Rounded icons$Rounded0) {
        ImageVector imageVector0 = PhoneKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Rounded.Phone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.g(19.23f, 15.26f, -2.54f, -0.29f);
        pathBuilder0.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        pathBuilder0.lineToRelative(-1.84f, 1.84f);
        pathBuilder0.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilder0.lineToRelative(1.85f, -1.85f);
        pathBuilder0.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        pathBuilder0.lineToRelative(-0.29f, -2.52f);
        pathBuilder0.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        pathBuilder0.horizontalLineTo(5.03f);
        pathBuilder0.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        pathBuilder0.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        pathBuilder0.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        pathBuilder0.verticalLineToRelative(-1.73f);
        pathBuilder0.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        PhoneKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

