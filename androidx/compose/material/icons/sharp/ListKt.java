package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons.Sharp;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001E\u0010\u0006\u001A\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/icons/Icons$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getList", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "getList$annotations", "(Landroidx/compose/material/icons/Icons$Sharp;)V", "List", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/sharp/ListKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n72#5,4:151\n*S KotlinDebug\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/sharp/ListKt\n*L\n35#1:116,12\n36#1:129,18\n36#1:166\n35#1:128\n36#1:147,2\n36#1:149,2\n36#1:155,11\n36#1:151,4\n*E\n"})
public final class ListKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getList(@NotNull Sharp icons$Sharp0) {
        ImageVector imageVector0 = ListKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Sharp.List", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(3.0f, 13.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        q.x(pathBuilder0, 3.0f, 11.0f, 2.0f);
        q.y(pathBuilder0, 3.0f, 17.0f, 2.0f, -2.0f);
        q.x(pathBuilder0, 3.0f, 15.0f, 2.0f);
        pathBuilder0.moveTo(3.0f, 9.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.lineTo(5.0f, 7.0f);
        q.x(pathBuilder0, 3.0f, 7.0f, 2.0f);
        q.y(pathBuilder0, 7.0f, 13.0f, 14.0f, -2.0f);
        q.x(pathBuilder0, 7.0f, 11.0f, 2.0f);
        q.y(pathBuilder0, 7.0f, 17.0f, 14.0f, -2.0f);
        q.x(pathBuilder0, 7.0f, 15.0f, 2.0f);
        pathBuilder0.moveTo(7.0f, 7.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(14.0f);
        pathBuilder0.lineTo(21.0f, 7.0f);
        pathBuilder0.lineTo(7.0f, 7.0f);
        pathBuilder0.close();
        q.y(pathBuilder0, 3.0f, 13.0f, 2.0f, -2.0f);
        q.x(pathBuilder0, 3.0f, 11.0f, 2.0f);
        q.y(pathBuilder0, 3.0f, 17.0f, 2.0f, -2.0f);
        q.x(pathBuilder0, 3.0f, 15.0f, 2.0f);
        pathBuilder0.moveTo(3.0f, 9.0f);
        pathBuilder0.horizontalLineToRelative(2.0f);
        pathBuilder0.lineTo(5.0f, 7.0f);
        q.x(pathBuilder0, 3.0f, 7.0f, 2.0f);
        q.y(pathBuilder0, 7.0f, 13.0f, 14.0f, -2.0f);
        q.x(pathBuilder0, 7.0f, 11.0f, 2.0f);
        q.y(pathBuilder0, 7.0f, 17.0f, 14.0f, -2.0f);
        q.x(pathBuilder0, 7.0f, 15.0f, 2.0f);
        pathBuilder0.moveTo(7.0f, 7.0f);
        pathBuilder0.verticalLineToRelative(2.0f);
        pathBuilder0.horizontalLineToRelative(14.0f);
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, q.C(pathBuilder0, 21.0f, 7.0f, 7.0f, 7.0f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ListKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Sharp.List", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Sharp.List", imports = {"androidx.compose.material.icons.automirrored.sharp.List"}))
    public static void getList$annotations(Sharp icons$Sharp0) {
    }
}

