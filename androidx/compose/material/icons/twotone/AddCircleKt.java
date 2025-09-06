package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons.TwoTone;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getAddCircle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "AddCircle", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAddCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddCircle.kt\nandroidx/compose/material/icons/twotone/AddCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n233#2,18:136\n253#2:173\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n705#4,2:154\n717#4,2:156\n719#4,11:162\n72#5,4:120\n72#5,4:158\n*S KotlinDebug\n*F\n+ 1 AddCircle.kt\nandroidx/compose/material/icons/twotone/AddCircleKt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n52#1:136,18\n52#1:173\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n52#1:154,2\n52#1:156,2\n52#1:162,11\n30#1:120,4\n52#1:158,4\n*E\n"})
public final class AddCircleKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getAddCircle(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = AddCircleKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.AddCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = a.h(12.0f, 4.0f);
        pathBuilder0.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        pathBuilder0.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilder0.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        pathBuilder0.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(17.0f, 13.0f);
        pathBuilder0.horizontalLineToRelative(-4.0f);
        pathBuilder0.verticalLineToRelative(4.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.verticalLineToRelative(-4.0f);
        pathBuilder0.lineTo(7.0f, 13.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.horizontalLineToRelative(4.0f);
        pathBuilder0.lineTo(11.0f, 7.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(4.0f);
        pathBuilder0.horizontalLineToRelative(4.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.close();
        Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = new PathBuilder();
        pathBuilder1.moveTo(13.0f, 7.0f);
        pathBuilder1.horizontalLineToRelative(-2.0f);
        pathBuilder1.verticalLineToRelative(4.0f);
        pathBuilder1.lineTo(7.0f, 11.0f);
        pathBuilder1.verticalLineToRelative(2.0f);
        pathBuilder1.horizontalLineToRelative(4.0f);
        pathBuilder1.verticalLineToRelative(4.0f);
        pathBuilder1.horizontalLineToRelative(2.0f);
        pathBuilder1.verticalLineToRelative(-4.0f);
        pathBuilder1.horizontalLineToRelative(4.0f);
        pathBuilder1.verticalLineToRelative(-2.0f);
        pathBuilder1.horizontalLineToRelative(-4.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(12.0f, 2.0f);
        pathBuilder1.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder1.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder1.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder1.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(12.0f, 20.0f);
        pathBuilder1.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder1.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder1.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, a.s(pathBuilder1, -3.59f, 8.0f, -8.0f, 8.0f), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        AddCircleKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

