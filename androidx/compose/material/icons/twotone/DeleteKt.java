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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getDelete", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Delete", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDelete.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delete.kt\nandroidx/compose/material/icons/twotone/DeleteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n233#2,18:119\n253#2:156\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:103\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 Delete.kt\nandroidx/compose/material/icons/twotone/DeleteKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n37#1:119,18\n37#1:156\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n37#1:137,2\n37#1:139,2\n37#1:145,11\n30#1:103,4\n37#1:141,4\n*E\n"})
public final class DeleteKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getDelete(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = DeleteKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(8.0f, 9.0f);
        pathBuilder0.horizontalLineToRelative(8.0f);
        pathBuilder0.verticalLineToRelative(10.0f);
        pathBuilder0.horizontalLineTo(8.0f);
        pathBuilder0.close();
        Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = new PathBuilder();
        pathBuilder1.moveTo(15.5f, 4.0f);
        pathBuilder1.lineToRelative(-1.0f, -1.0f);
        pathBuilder1.horizontalLineToRelative(-5.0f);
        pathBuilder1.lineToRelative(-1.0f, 1.0f);
        pathBuilder1.horizontalLineTo(5.0f);
        pathBuilder1.verticalLineToRelative(2.0f);
        pathBuilder1.horizontalLineToRelative(14.0f);
        pathBuilder1.verticalLineTo(4.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(6.0f, 19.0f);
        pathBuilder1.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder1.horizontalLineToRelative(8.0f);
        pathBuilder1.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder1.verticalLineTo(7.0f);
        pathBuilder1.horizontalLineTo(6.0f);
        pathBuilder1.verticalLineToRelative(12.0f);
        pathBuilder1.close();
        q.y(pathBuilder1, 8.0f, 9.0f, 8.0f, 10.0f);
        pathBuilder1.horizontalLineTo(8.0f);
        pathBuilder1.verticalLineTo(9.0f);
        pathBuilder1.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder1.getNodes(), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        DeleteKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

