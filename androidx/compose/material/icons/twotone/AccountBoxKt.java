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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getAccountBox", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountBox", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAccountBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBox.kt\nandroidx/compose/material/icons/twotone/AccountBoxKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n233#2,18:180\n253#2:217\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n705#4,2:198\n717#4,2:200\n719#4,11:206\n72#5,4:126\n72#5,4:164\n72#5,4:202\n*S KotlinDebug\n*F\n+ 1 AccountBox.kt\nandroidx/compose/material/icons/twotone/AccountBoxKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n45#1:142,18\n45#1:179\n71#1:180,18\n71#1:217\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n45#1:160,2\n45#1:162,2\n45#1:168,11\n71#1:198,2\n71#1:200,2\n71#1:206,11\n30#1:126,4\n45#1:164,4\n71#1:202,4\n*E\n"})
public final class AccountBoxKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getAccountBox(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = AccountBoxKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.AccountBox", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = a.h(5.0f, 17.860001f);
        pathBuilder0.curveTo(6.8f, 16.09f, 9.27f, 15.0f, 12.0f, 15.0f);
        pathBuilder0.reflectiveCurveToRelative(5.2f, 1.09f, 7.0f, 2.86f);
        pathBuilder0.verticalLineTo(5.0f);
        pathBuilder0.horizontalLineTo(5.0f);
        pathBuilder0.verticalLineTo(17.860001f);
        pathBuilder0.close();
        pathBuilder0.moveTo(12.0f, 6.0f);
        pathBuilder0.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder0.reflectiveCurveTo(13.93f, 13.0f, 12.0f, 13.0f);
        pathBuilder0.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder0.reflectiveCurveTo(10.07f, 6.0f, 12.0f, 6.0f);
        pathBuilder0.close();
        Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = new PathBuilder();
        pathBuilder1.moveTo(19.0f, 3.0f);
        pathBuilder1.horizontalLineTo(5.0f);
        pathBuilder1.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder1.verticalLineToRelative(14.0f);
        pathBuilder1.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder1.horizontalLineToRelative(14.0f);
        pathBuilder1.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder1.verticalLineTo(5.0f);
        pathBuilder1.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(17.0f, 19.0f);
        pathBuilder1.horizontalLineTo(7.0f);
        pathBuilder1.verticalLineToRelative(-0.24f);
        pathBuilder1.curveTo(8.42f, 17.620001f, 10.16f, 17.0f, 12.0f, 17.0f);
        pathBuilder1.reflectiveCurveToRelative(3.58f, 0.62f, 5.0f, 1.76f);
        pathBuilder1.verticalLineTo(19.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(19.0f, 17.860001f);
        pathBuilder1.curveTo(17.200001f, 16.09f, 14.73f, 15.0f, 12.0f, 15.0f);
        pathBuilder1.reflectiveCurveToRelative(-5.2f, 1.09f, -7.0f, 2.86f);
        pathBuilder1.verticalLineTo(5.0f);
        pathBuilder1.horizontalLineToRelative(14.0f);
        pathBuilder1.verticalLineTo(17.860001f);
        pathBuilder1.close();
        Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder1.getNodes(), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor2 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder2 = a.h(12.0f, 13.0f);
        pathBuilder2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder2.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder2.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 8.0f);
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        pathBuilder2.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder2.getNodes(), 0, "", solidColor2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        AccountBoxKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

