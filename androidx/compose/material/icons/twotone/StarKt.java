package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons.TwoTone;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getStar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Star", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Star.kt\nandroidx/compose/material/icons/twotone/StarKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 Star.kt\nandroidx/compose/material/icons/twotone/StarKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n43#1:126,18\n43#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n43#1:144,2\n43#1:146,2\n43#1:152,11\n30#1:110,4\n43#1:148,4\n*E\n"})
public final class StarKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getStar(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = StarKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.g(12.0f, 15.4f, -3.76f, 2.27f);
        pathBuilder0.lineToRelative(1.0f, -4.28f);
        pathBuilder0.lineToRelative(-3.32f, -2.88f);
        pathBuilder0.lineToRelative(4.38f, -0.38f);
        pathBuilder0.lineToRelative(1.7f, -4.03f);
        pathBuilder0.lineToRelative(1.71f, 4.04f);
        pathBuilder0.lineToRelative(4.38f, 0.38f);
        Builder.addPath-oIyEayM$default(imageVector$Builder0, q.v(pathBuilder0, -3.32f, 2.88f, 1.0f, 4.28f), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = q.g(22.0f, 9.24f, -7.19f, -0.62f);
        pathBuilder1.lineTo(12.0f, 2.0f);
        pathBuilder1.lineTo(9.19f, 8.63f);
        pathBuilder1.lineTo(2.0f, 9.24f);
        pathBuilder1.lineToRelative(5.46f, 4.73f);
        pathBuilder1.lineTo(5.82f, 21.0f);
        pathBuilder1.lineTo(12.0f, 17.27f);
        pathBuilder1.lineTo(18.18f, 21.0f);
        pathBuilder1.lineToRelative(-1.63f, -7.03f);
        pathBuilder1.lineTo(22.0f, 9.24f);
        pathBuilder1.close();
        pathBuilder1.moveTo(12.0f, 15.4f);
        pathBuilder1.lineToRelative(-3.76f, 2.27f);
        pathBuilder1.lineToRelative(1.0f, -4.28f);
        pathBuilder1.lineToRelative(-3.32f, -2.88f);
        pathBuilder1.lineToRelative(4.38f, -0.38f);
        pathBuilder1.lineTo(12.0f, 6.1f);
        pathBuilder1.lineToRelative(1.71f, 4.04f);
        pathBuilder1.lineToRelative(4.38f, 0.38f);
        pathBuilder1.lineToRelative(-3.32f, 2.88f);
        pathBuilder1.lineToRelative(1.0f, 4.28f);
        pathBuilder1.lineTo(12.0f, 15.4f);
        pathBuilder1.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder1.getNodes(), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        StarKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

