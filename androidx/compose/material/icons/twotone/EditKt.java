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
import r0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getEdit", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Edit", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Edit.kt\nandroidx/compose/material/icons/twotone/EditKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n233#2,18:120\n253#2:157\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n705#4,2:138\n717#4,2:140\n719#4,11:146\n72#5,4:104\n72#5,4:142\n*S KotlinDebug\n*F\n+ 1 Edit.kt\nandroidx/compose/material/icons/twotone/EditKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n38#1:120,18\n38#1:157\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n38#1:138,2\n38#1:140,2\n38#1:146,11\n30#1:104,4\n38#1:142,4\n*E\n"})
public final class EditKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getEdit(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = EditKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(5.0f, 18.08f);
        pathBuilder0.verticalLineTo(19.0f);
        pathBuilder0.horizontalLineToRelative(0.92f);
        Builder.addPath-oIyEayM$default(imageVector$Builder0, q.v(pathBuilder0, 9.06f, -9.06f, -0.92f, -0.92f), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = a.h(20.709999f, 7.04f);
        pathBuilder1.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder1.lineToRelative(-2.34f, -2.34f);
        pathBuilder1.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilder1.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilder1.lineToRelative(-1.83f, 1.83f);
        pathBuilder1.lineToRelative(3.75f, 3.75f);
        pathBuilder1.lineToRelative(1.83f, -1.83f);
        pathBuilder1.close();
        pathBuilder1.moveTo(3.0f, 17.25f);
        pathBuilder1.verticalLineTo(21.0f);
        pathBuilder1.horizontalLineToRelative(3.75f);
        pathBuilder1.lineTo(17.809999f, 9.94f);
        pathBuilder1.lineToRelative(-3.75f, -3.75f);
        pathBuilder1.lineTo(3.0f, 17.25f);
        pathBuilder1.close();
        pathBuilder1.moveTo(5.92f, 19.0f);
        pathBuilder1.horizontalLineTo(5.0f);
        pathBuilder1.verticalLineToRelative(-0.92f);
        pathBuilder1.lineToRelative(9.06f, -9.06f);
        pathBuilder1.lineToRelative(0.92f, 0.92f);
        pathBuilder1.lineTo(5.92f, 19.0f);
        pathBuilder1.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder1.getNodes(), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        EditKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

