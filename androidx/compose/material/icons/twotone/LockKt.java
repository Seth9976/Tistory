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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getLock", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Lock", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lock.kt\nandroidx/compose/material/icons/twotone/LockKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n72#5,4:121\n72#5,4:159\n*S KotlinDebug\n*F\n+ 1 Lock.kt\nandroidx/compose/material/icons/twotone/LockKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n44#1:137,18\n44#1:174\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n44#1:155,2\n44#1:157,2\n44#1:163,11\n30#1:121,4\n44#1:159,4\n*E\n"})
public final class LockKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getLock(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = LockKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(6.0f, 20.0f);
        pathBuilder0.horizontalLineToRelative(12.0f);
        pathBuilder0.lineTo(18.0f, 10.0f);
        q.x(pathBuilder0, 6.0f, 10.0f, 10.0f);
        pathBuilder0.moveTo(12.0f, 13.0f);
        pathBuilder0.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder0.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder0.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        Builder.addPath-oIyEayM$default(imageVector$Builder0, a.s(pathBuilder0, 0.9f, -2.0f, 2.0f, -2.0f), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = new PathBuilder();
        pathBuilder1.moveTo(18.0f, 8.0f);
        pathBuilder1.horizontalLineToRelative(-1.0f);
        pathBuilder1.lineTo(17.0f, 6.0f);
        pathBuilder1.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder1.reflectiveCurveTo(7.0f, 3.24f, 7.0f, 6.0f);
        pathBuilder1.verticalLineToRelative(2.0f);
        pathBuilder1.lineTo(6.0f, 8.0f);
        pathBuilder1.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder1.verticalLineToRelative(10.0f);
        pathBuilder1.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder1.horizontalLineToRelative(12.0f);
        pathBuilder1.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder1.lineTo(20.0f, 10.0f);
        pathBuilder1.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(9.0f, 6.0f);
        pathBuilder1.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder1.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder1.verticalLineToRelative(2.0f);
        pathBuilder1.lineTo(9.0f, 8.0f);
        pathBuilder1.lineTo(9.0f, 6.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(18.0f, 20.0f);
        pathBuilder1.lineTo(6.0f, 20.0f);
        pathBuilder1.lineTo(6.0f, 10.0f);
        pathBuilder1.horizontalLineToRelative(12.0f);
        pathBuilder1.verticalLineToRelative(10.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(12.0f, 17.0f);
        pathBuilder1.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder1.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder1.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, a.s(pathBuilder1, 0.9f, 2.0f, 2.0f, 2.0f), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        LockKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

