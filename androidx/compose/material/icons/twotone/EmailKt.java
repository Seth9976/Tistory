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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getEmail", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Email", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEmail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Email.kt\nandroidx/compose/material/icons/twotone/EmailKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n233#2,18:123\n253#2:160\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:107\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 Email.kt\nandroidx/compose/material/icons/twotone/EmailKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n42#1:123,18\n42#1:160\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n42#1:141,2\n42#1:143,2\n42#1:149,11\n30#1:107,4\n42#1:145,4\n*E\n"})
public final class EmailKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getEmail(@NotNull TwoTone icons$TwoTone0) {
        ImageVector imageVector0 = EmailKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("TwoTone.Email", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.g(20.0f, 8.0f, -8.0f, 5.0f);
        pathBuilder0.lineToRelative(-8.0f, -5.0f);
        pathBuilder0.verticalLineToRelative(10.0f);
        pathBuilder0.horizontalLineToRelative(16.0f);
        pathBuilder0.close();
        pathBuilder0.moveTo(20.0f, 6.0f);
        pathBuilder0.lineTo(4.0f, 6.0f);
        pathBuilder0.lineToRelative(8.0f, 4.99f);
        pathBuilder0.close();
        Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = new PathBuilder();
        pathBuilder1.moveTo(4.0f, 20.0f);
        pathBuilder1.horizontalLineToRelative(16.0f);
        pathBuilder1.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder1.verticalLineTo(6.0f);
        pathBuilder1.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder1.horizontalLineTo(4.0f);
        pathBuilder1.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder1.verticalLineToRelative(12.0f);
        pathBuilder1.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(20.0f, 6.0f);
        pathBuilder1.lineToRelative(-8.0f, 4.99f);
        pathBuilder1.lineTo(4.0f, 6.0f);
        pathBuilder1.horizontalLineToRelative(16.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(4.0f, 8.0f);
        pathBuilder1.lineToRelative(8.0f, 5.0f);
        pathBuilder1.lineToRelative(8.0f, -5.0f);
        pathBuilder1.verticalLineToRelative(10.0f);
        pathBuilder1.horizontalLineTo(4.0f);
        pathBuilder1.verticalLineTo(8.0f);
        pathBuilder1.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder1.getNodes(), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        EmailKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

