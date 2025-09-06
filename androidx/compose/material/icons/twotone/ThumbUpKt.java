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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getThumbUp", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbUp", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nThumbUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbUp.kt\nandroidx/compose/material/icons/twotone/ThumbUpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n233#2,18:130\n253#2:167\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n705#4,2:148\n717#4,2:150\n719#4,11:156\n72#5,4:114\n72#5,4:152\n*S KotlinDebug\n*F\n+ 1 ThumbUp.kt\nandroidx/compose/material/icons/twotone/ThumbUpKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n40#1:130,18\n40#1:167\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n40#1:148,2\n40#1:150,2\n40#1:156,11\n30#1:114,4\n40#1:152,4\n*E\n"})
public final class ThumbUpKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getThumbUp(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = ThumbUpKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.ThumbUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(21.0f, 12.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.horizontalLineToRelative(-9.0f);
        pathBuilder0.lineToRelative(1.34f, -5.34f);
        pathBuilder0.lineTo(9.0f, 9.0f);
        pathBuilder0.verticalLineToRelative(10.0f);
        pathBuilder0.horizontalLineToRelative(9.0f);
        pathBuilder0.close();
        Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = new PathBuilder();
        pathBuilder1.moveTo(9.0f, 21.0f);
        pathBuilder1.horizontalLineToRelative(9.0f);
        pathBuilder1.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        pathBuilder1.lineToRelative(3.02f, -7.05f);
        pathBuilder1.curveToRelative(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
        pathBuilder1.verticalLineToRelative(-2.0f);
        pathBuilder1.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder1.horizontalLineToRelative(-6.31f);
        pathBuilder1.lineToRelative(0.95f, -4.57f);
        pathBuilder1.lineToRelative(0.03f, -0.32f);
        pathBuilder1.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        pathBuilder1.lineTo(14.17f, 1.0f);
        pathBuilder1.lineTo(7.58f, 7.59f);
        pathBuilder1.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        pathBuilder1.verticalLineToRelative(10.0f);
        pathBuilder1.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(9.0f, 9.0f);
        pathBuilder1.lineToRelative(4.34f, -4.34f);
        pathBuilder1.lineTo(12.0f, 10.0f);
        pathBuilder1.horizontalLineToRelative(9.0f);
        pathBuilder1.verticalLineToRelative(2.0f);
        pathBuilder1.lineToRelative(-3.0f, 7.0f);
        pathBuilder1.horizontalLineTo(9.0f);
        pathBuilder1.verticalLineTo(9.0f);
        pathBuilder1.close();
        q.y(pathBuilder1, 1.0f, 9.0f, 4.0f, 12.0f);
        pathBuilder1.horizontalLineTo(1.0f);
        pathBuilder1.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder1.getNodes(), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ThumbUpKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

