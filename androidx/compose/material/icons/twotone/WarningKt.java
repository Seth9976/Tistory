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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getWarning", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Warning", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWarning.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Warning.kt\nandroidx/compose/material/icons/twotone/WarningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n233#2,18:128\n253#2:165\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n705#4,2:146\n717#4,2:148\n719#4,11:154\n72#5,4:112\n72#5,4:150\n*S KotlinDebug\n*F\n+ 1 Warning.kt\nandroidx/compose/material/icons/twotone/WarningKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n49#1:128,18\n49#1:165\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n49#1:146,2\n49#1:148,2\n49#1:154,11\n30#1:112,4\n49#1:150,4\n*E\n"})
public final class WarningKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getWarning(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = WarningKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(4.47f, 19.0f);
        pathBuilder0.horizontalLineToRelative(15.06f);
        pathBuilder0.lineTo(12.0f, 5.99f);
        pathBuilder0.lineTo(4.47f, 19.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(13.0f, 18.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.close();
        q.y(pathBuilder0, 13.0f, 14.0f, -2.0f, -4.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(4.0f);
        pathBuilder0.close();
        Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = new PathBuilder();
        pathBuilder1.moveTo(1.0f, 21.0f);
        pathBuilder1.horizontalLineToRelative(22.0f);
        pathBuilder1.lineTo(12.0f, 2.0f);
        pathBuilder1.lineTo(1.0f, 21.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(4.47f, 19.0f);
        pathBuilder1.lineTo(12.0f, 5.99f);
        pathBuilder1.lineTo(19.530001f, 19.0f);
        pathBuilder1.lineTo(4.47f, 19.0f);
        pathBuilder1.close();
        q.y(pathBuilder1, 11.0f, 16.0f, 2.0f, 2.0f);
        pathBuilder1.horizontalLineToRelative(-2.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(11.0f, 10.0f);
        pathBuilder1.horizontalLineToRelative(2.0f);
        pathBuilder1.verticalLineToRelative(4.0f);
        pathBuilder1.horizontalLineToRelative(-2.0f);
        pathBuilder1.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder1.getNodes(), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        WarningKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

