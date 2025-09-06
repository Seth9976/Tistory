package androidx.compose.material.icons;

import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A*\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000BH\u0087\b\u001A4\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\f\u001A\u00020\r2\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000BH\u0086\b\u001AN\u0010\u000E\u001A\u00020\n*\u00020\n2\b\b\u0002\u0010\u000F\u001A\u00020\u00012\b\b\u0002\u0010\u0010\u001A\u00020\u00012\b\b\u0002\u0010\u0011\u001A\u00020\u00122\u0017\u0010\u0013\u001A\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\t¢\u0006\u0002\b\u000BH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0016\u0010\u0000\u001A\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"MaterialIconDimension", "", "getMaterialIconDimension$annotations", "()V", "materialIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "name", "", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Lkotlin/ExtensionFunctionType;", "autoMirror", "", "materialPath", "fillAlpha", "strokeAlpha", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "materialPath-YwgOQQI", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;FFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 4 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,258:1\n223#1:259\n216#1,3:260\n219#1,4:264\n174#2:263\n174#2:268\n174#2:269\n174#2:270\n174#2:271\n705#3,2:272\n717#3,2:274\n719#3,11:280\n717#3,13:291\n72#4,4:276\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n*L\n201#1:259\n201#1:260,3\n201#1:264,4\n201#1:263\n218#1:268\n219#1:269\n218#1:270\n219#1:271\n242#1:272,2\n242#1:274,2\n242#1:280,11\n242#1:291,13\n242#1:276,4\n*E\n"})
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    @PublishedApi
    public static void getMaterialIconDimension$annotations() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with autoMirror instead.")
    public static final ImageVector materialIcon(String s, Function1 function10) {
        return ((Builder)function10.invoke(new Builder(s, 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null))).build();
    }

    @NotNull
    public static final ImageVector materialIcon(@NotNull String s, boolean z, @NotNull Function1 function10) {
        return ((Builder)function10.invoke(new Builder(s, 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, z, 0x60, null))).build();
    }

    public static ImageVector materialIcon$default(String s, boolean z, Function1 function10, int v, Object object0) {
        return (v & 2) == 0 ? ((Builder)function10.invoke(new Builder(s, 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, z, 0x60, null))).build() : ((Builder)function10.invoke(new Builder(s, 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60, null))).build();
    }

    @NotNull
    public static final Builder materialPath-YwgOQQI(@NotNull Builder imageVector$Builder0, float f, float f1, int v, @NotNull Function1 function10) {
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), v, "", solidColor0, f, null, f1, 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
    }

    // 去混淆评级： 低(20)
    public static Builder materialPath-YwgOQQI$default(Builder imageVector$Builder0, float f, float f1, int v, Function1 function10, int v1, Object object0) {
        SolidColor solidColor0 = new SolidColor(0xFF00000000000000L, null);
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), ((v1 & 4) == 0 ? v : 0), "", solidColor0, ((v1 & 1) == 0 ? f : 1.0f), null, ((v1 & 2) == 0 ? f1 : 1.0f), 1.0f, 0, 2, 1.0f, 0.0f, 0.0f, 0.0f, 0x3800, null);
    }
}

