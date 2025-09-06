package androidx.compose.material.icons.automirrored.filled;

import androidx.compose.material.icons.Icons.AutoMirrored.Filled;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001A\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getArrowBack", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowBack", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nArrowBack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrowBack.kt\nandroidx/compose/material/icons/automirrored/filled/ArrowBackKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,48:1\n223#2:49\n216#2,3:50\n219#2,4:54\n233#2,18:58\n253#2:95\n174#3:53\n705#4,2:76\n717#4,2:78\n719#4,11:84\n72#5,4:80\n*S KotlinDebug\n*F\n+ 1 ArrowBack.kt\nandroidx/compose/material/icons/automirrored/filled/ArrowBackKt\n*L\n29#1:49\n29#1:50,3\n29#1:54,4\n30#1:58,18\n30#1:95\n29#1:53\n30#1:76,2\n30#1:78,2\n30#1:84,11\n30#1:80,4\n*E\n"})
public final class ArrowBackKt {
    public static ImageVector a;

    @NotNull
    public static final ImageVector getArrowBack(@NotNull Filled icons$AutoMirrored$Filled0) {
        ImageVector imageVector0 = ArrowBackKt.a;
        if(imageVector0 != null) {
            Intrinsics.checkNotNull(imageVector0);
            return imageVector0;
        }
        Builder imageVector$Builder0 = new Builder("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 0x60, null);
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        pathBuilder0.moveTo(20.0f, 11.0f);
        pathBuilder0.horizontalLineTo(7.83f);
        pathBuilder0.lineToRelative(5.59f, -5.59f);
        pathBuilder0.lineTo(12.0f, 4.0f);
        pathBuilder0.lineToRelative(-8.0f, 8.0f);
        pathBuilder0.lineToRelative(8.0f, 8.0f);
        pathBuilder0.lineToRelative(1.41f, -1.41f);
        pathBuilder0.lineTo(7.83f, 13.0f);
        pathBuilder0.horizontalLineTo(20.0f);
        pathBuilder0.verticalLineToRelative(-2.0f);
        pathBuilder0.close();
        ImageVector imageVector1 = Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), 0, "", solidColor0, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null).build();
        ArrowBackKt.a = imageVector1;
        Intrinsics.checkNotNull(imageVector1);
        return imageVector1;
    }
}

