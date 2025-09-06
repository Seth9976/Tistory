package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0098\u0001\u0010\u0018\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A\u008D\u0001\u0010$\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0019\u001A\u00020\u00052\b\b\u0002\u0010\u001A\u001A\u00020\u00052\b\b\u0002\u0010\u001B\u001A\u00020\u00052\b\b\u0002\u0010\u001C\u001A\u00020\u00052\b\b\u0002\u0010\u001D\u001A\u00020\u00052\b\b\u0002\u0010\u001E\u001A\u00020\u00052\b\b\u0002\u0010\u001F\u001A\u00020\u00052\u000E\b\u0002\u0010\"\u001A\b\u0012\u0004\u0012\u00020!0 2\u0017\u0010#\u001A\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "name", "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "pathBuilder", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "path", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "block", "group", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,783:1\n72#2,4:784\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n722#1:784,4\n*E\n"})
public final class ImageVectorKt {
    public static final Object access$peek(ArrayList arrayList0) {
        return arrayList0.get(arrayList0.size() - 1);
    }

    public static final Object access$pop(ArrayList arrayList0) {
        return arrayList0.remove(arrayList0.size() - 1);
    }

    public static final boolean access$push(ArrayList arrayList0, Object object0) {
        return arrayList0.add(object0);
    }

    @NotNull
    public static final Builder group(@NotNull Builder imageVector$Builder0, @NotNull String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @NotNull List list0, @NotNull Function1 function10) {
        imageVector$Builder0.addGroup(s, f, f1, f2, f3, f4, f5, f6, list0);
        function10.invoke(imageVector$Builder0);
        imageVector$Builder0.clearGroup();
        return imageVector$Builder0;
    }

    public static Builder group$default(Builder imageVector$Builder0, String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, Function1 function10, int v, Object object0) {
        imageVector$Builder0.addGroup(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? f : 0.0f), ((v & 4) == 0 ? f1 : 0.0f), ((v & 8) == 0 ? f2 : 0.0f), ((v & 16) == 0 ? f3 : 1.0f), ((v & 0x20) == 0 ? f4 : 1.0f), ((v & 0x40) == 0 ? f5 : 0.0f), ((v & 0x80) == 0 ? f6 : 0.0f), ((v & 0x100) == 0 ? list0 : VectorKt.getEmptyPath()));
        function10.invoke(imageVector$Builder0);
        imageVector$Builder0.clearGroup();
        return imageVector$Builder0;
    }

    @NotNull
    public static final Builder path-R_LF-3I(@NotNull Builder imageVector$Builder0, @NotNull String s, @Nullable Brush brush0, float f, @Nullable Brush brush1, float f1, float f2, int v, int v1, float f3, int v2, @NotNull Function1 function10) {
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), v2, s, brush0, f, brush1, f1, f2, v, v1, f3, 0.0f, 0.0f, 0.0f, 0x3800, null);
    }

    // 去混淆评级： 低(20)
    public static Builder path-R_LF-3I$default(Builder imageVector$Builder0, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v, int v1, float f3, int v2, Function1 function10, int v3, Object object0) {
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return Builder.addPath-oIyEayM$default(imageVector$Builder0, pathBuilder0.getNodes(), ((v3 & 0x200) == 0 ? v2 : 0), ((v3 & 1) == 0 ? s : ""), ((v3 & 2) == 0 ? brush0 : null), ((v3 & 4) == 0 ? f : 1.0f), ((v3 & 8) == 0 ? brush1 : null), ((v3 & 16) == 0 ? f1 : 1.0f), ((v3 & 0x20) == 0 ? f2 : 0.0f), ((v3 & 0x40) == 0 ? v : 0), ((v3 & 0x80) == 0 ? v1 : 0), ((v3 & 0x100) == 0 ? f3 : 4.0f), 0.0f, 0.0f, 0.0f, 0x3800, null);
    }
}

