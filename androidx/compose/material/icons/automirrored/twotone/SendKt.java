package androidx.compose.material.icons.automirrored.twotone;

import androidx.compose.material.icons.Icons.AutoMirrored.TwoTone;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSend", "(Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Send", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/automirrored/twotone/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n223#2:66\n216#2,3:67\n219#2,4:71\n233#2,18:75\n253#2:112\n233#2,18:113\n253#2:150\n174#3:70\n705#4,2:93\n717#4,2:95\n719#4,11:101\n705#4,2:131\n717#4,2:133\n719#4,11:139\n72#5,4:97\n72#5,4:135\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/automirrored/twotone/SendKt\n*L\n29#1:66\n29#1:67,3\n29#1:71,4\n30#1:75,18\n30#1:112\n40#1:113,18\n40#1:150\n29#1:70\n30#1:93,2\n30#1:95,2\n30#1:101,11\n40#1:131,2\n40#1:133,2\n40#1:139,11\n30#1:97,4\n40#1:135,4\n*E\n"})
public final class SendKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getSend(@NotNull TwoTone icons$AutoMirrored$TwoTone0) {
        ImageVector imageVector0 = SendKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("AutoMirrored.TwoTone.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = q.g(4.0f, 8.25f, 7.51f, 1.0f);
        pathBuilder0.lineToRelative(-7.5f, -3.22f);
        pathBuilder0.close();
        pathBuilder0.moveTo(4.01f, 17.969999f);
        Builder.addPath-oIyEayM$default(imageVector$Builder0, q.v(pathBuilder0, 7.5f, -3.22f, -7.51f, 1.0f), 0, "", solidColor0, 0.3f, null, 0.3f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
        SolidColor solidColor1 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder1 = q.B(2.01f, 3.0f, 2.0f, 10.0f);
        pathBuilder1.lineToRelative(15.0f, 2.0f);
        pathBuilder1.lineToRelative(-15.0f, 2.0f);
        pathBuilder1.lineToRelative(0.01f, 7.0f);
        pathBuilder1.lineTo(23.0f, 12.0f);
        pathBuilder1.lineTo(2.01f, 3.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(4.0f, 8.25f);
        pathBuilder1.lineTo(4.0f, 6.03f);
        pathBuilder1.lineToRelative(7.51f, 3.22f);
        pathBuilder1.lineToRelative(-7.51f, -1.0f);
        pathBuilder1.close();
        pathBuilder1.moveTo(4.01f, 17.969999f);
        pathBuilder1.verticalLineToRelative(-2.22f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, q.v(pathBuilder1, 7.51f, -1.0f, -7.51f, 3.22f), 0, "", solidColor1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        SendKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

