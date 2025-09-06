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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getHome", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Home", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Home.kt\nandroidx/compose/material/icons/twotone/HomeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n233#2,18:125\n253#2:162\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n705#4,2:143\n717#4,2:145\n719#4,11:151\n72#5,4:109\n72#5,4:147\n*S KotlinDebug\n*F\n+ 1 Home.kt\nandroidx/compose/material/icons/twotone/HomeKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n56#1:125,18\n56#1:162\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n56#1:143,2\n56#1:145,2\n56#1:151,11\n30#1:109,4\n56#1:147,4\n*E\n"})
public final class HomeKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getHome(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = HomeKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(12.0f, 3.0f);
        pathBuilder0.lineTo(2.0f, 12.0f);
        pathBuilder0.horizontalLineToRelative(3.0f);
        pathBuilder0.verticalLineToRelative(8.0f);
        pathBuilder0.horizontalLineToRelative(6.0f);
        pathBuilder0.verticalLineToRelative(-6.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(6.0f);
        pathBuilder0.horizontalLineToRelative(6.0f);
        pathBuilder0.verticalLineToRelative(-8.0f);
        pathBuilder0.horizontalLineToRelative(3.0f);
        pathBuilder0.lineTo(12.0f, 3.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(17.0f, 18.0f);
        pathBuilder0.horizontalLineToRelative(-2.0f);
        pathBuilder0.verticalLineToRelative(-6.0f);
        pathBuilder0.lineTo(9.0f, 12.0f);
        pathBuilder0.verticalLineToRelative(6.0f);
        pathBuilder0.lineTo(7.0f, 18.0f);
        pathBuilder0.verticalLineToRelative(-7.81f);
        pathBuilder0.lineToRelative(5.0f, -4.5f);
        pathBuilder0.lineToRelative(5.0f, 4.5f);
        pathBuilder0.lineTo(17.0f, 18.0f);
        pathBuilder0.close();
        Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = new PathBuilder();
        pathBuilder1.moveTo(7.0f, 10.19f);
        pathBuilder1.verticalLineTo(18.0f);
        pathBuilder1.horizontalLineToRelative(2.0f);
        pathBuilder1.verticalLineToRelative(-6.0f);
        pathBuilder1.horizontalLineToRelative(6.0f);
        pathBuilder1.verticalLineToRelative(6.0f);
        pathBuilder1.horizontalLineToRelative(2.0f);
        pathBuilder1.verticalLineToRelative(-7.81f);
        pathBuilder1.lineToRelative(-5.0f, -4.5f);
        pathBuilder1.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder1.getNodes(), 0, "", solidColor1, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        HomeKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

