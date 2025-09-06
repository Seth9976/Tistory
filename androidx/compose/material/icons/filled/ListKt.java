package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons.Filled;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001E\u0010\u0006\u001A\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getList", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "getList$annotations", "(Landroidx/compose/material/icons/Icons$Filled;)V", "List", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/filled/ListKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/filled/ListKt\n*L\n35#1:80,12\n36#1:93,18\n36#1:130\n35#1:92\n36#1:111,2\n36#1:113,2\n36#1:119,11\n36#1:115,4\n*E\n"})
public final class ListKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getList(@NotNull Filled icons$Filled0) {
        ImageVector imageVector0 = ListKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("Filled.List", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null);
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
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, q.C(pathBuilder0, 21.0f, 7.0f, 7.0f, 7.0f), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ListKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Filled.List", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Filled.List", imports = {"androidx.compose.material.icons.automirrored.filled.List"}))
    public static void getList$annotations(Filled icons$Filled0) {
    }
}

