package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A/\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00A2\u0006\u0002\b\u0003H\u0086\b\u00A2\u0006\u0004\b\u0007\u0010\b\u001A\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u000B\u0010\f\u001A\u001E\u0010\u0012\u001A\u00020\u000F*\u00020\r2\u0006\u0010\u000E\u001A\u00020\rH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\u0015\u0010\u0014\u001A\u00020\u000F*\u0004\u0018\u00010\u0013H\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001A\u00020\t8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u001A\"\u0014\u0010\u001B\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u001A\"\u0014\u0010\u001C\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u001A\"\u0014\u0010\u001D\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u001A\"\u0014\u0010\u001E\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u001A\"\u0014\u0010\u001F\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u001A\"\u0014\u0010 \u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b \u0010\u001A\"\u001D\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0014\u0010&\u001A\u00020\t8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b&\u0010\u0017\"\u0014\u0010\'\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\'\u0010\u001A\"\u0014\u0010(\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b(\u0010\u001A\"\u0014\u0010)\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b)\u0010\u001A\"\u0014\u0010*\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b*\u0010\u001A\"\u0014\u0010+\u001A\u00020\u00188\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b+\u0010\u001A\"\u0017\u00101\u001A\u00020,8\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u0017\u00105\u001A\u0002028\u0006\u00A2\u0006\f\n\u0004\b3\u0010.\u001A\u0004\b4\u00100\"\u0017\u00109\u001A\u0002068\u0006\u00A2\u0006\f\n\u0004\b7\u0010.\u001A\u0004\b8\u00100\"\u0017\u0010>\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0017\u0010B\u001A\u00020?8\u0006\u00A2\u0006\f\n\u0004\b@\u0010.\u001A\u0004\bA\u00100\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006C"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "PathData", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "pathStr", "addPathNodes", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/compose/ui/graphics/Color;", "other", "", "rgbEqual--OWjLjI", "(JJ)Z", "rgbEqual", "Landroidx/compose/ui/graphics/ColorFilter;", "tintableWithAlphaMask", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "DefaultGroupName", "Ljava/lang/String;", "", "DefaultRotation", "F", "DefaultPivotX", "DefaultPivotY", "DefaultScaleX", "DefaultScaleY", "DefaultTranslationX", "DefaultTranslationY", "a", "Ljava/util/List;", "getEmptyPath", "()Ljava/util/List;", "EmptyPath", "DefaultPathName", "DefaultStrokeLineWidth", "DefaultStrokeLineMiter", "DefaultTrimPathStart", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/StrokeCap;", "b", "I", "getDefaultStrokeLineCap", "()I", "DefaultStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "c", "getDefaultStrokeLineJoin", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "d", "getDefaultTintBlendMode", "DefaultTintBlendMode", "e", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Landroidx/compose/ui/graphics/PathFillType;", "f", "getDefaultFillType", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class VectorKt {
    @NotNull
    public static final String DefaultGroupName = "";
    @NotNull
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset;
    public static final float DefaultTrimPathStart;
    public static final List a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final int f;

    static {
        VectorKt.a = CollectionsKt__CollectionsKt.emptyList();
        VectorKt.b = 0;
        VectorKt.c = 0;
        VectorKt.d = 5;
        VectorKt.e = 0L;
        VectorKt.f = 0;
    }

    @NotNull
    public static final List PathData(@NotNull Function1 function10) {
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return pathBuilder0.getNodes();
    }

    @NotNull
    public static final List addPathNodes(@Nullable String s) {
        return s == null ? VectorKt.a : new PathParser().parsePathString(s).toNodes();
    }

    public static final int getDefaultFillType() [...] // 潜在的解密器

    public static final int getDefaultStrokeLineCap() [...] // 潜在的解密器

    public static final int getDefaultStrokeLineJoin() [...] // 潜在的解密器

    public static final int getDefaultTintBlendMode() {
        return VectorKt.d;
    }

    public static final long getDefaultTintColor() {
        return VectorKt.e;
    }

    @NotNull
    public static final List getEmptyPath() {
        return VectorKt.a;
    }

    public static final boolean rgbEqual--OWjLjI(long v, long v1) {
        return Color.getRed-impl(v) == Color.getRed-impl(v1) && Color.getGreen-impl(v) == Color.getGreen-impl(v1) && Color.getBlue-impl(v) == Color.getBlue-impl(v1);
    }

    // 去混淆评级： 中等(80)
    public static final boolean tintableWithAlphaMask(@Nullable ColorFilter colorFilter0) {
        return colorFilter0 instanceof BlendModeColorFilter ? BlendMode.equals-impl0(((BlendModeColorFilter)colorFilter0).getBlendMode-0nO6VwU(), 5) || BlendMode.equals-impl0(((BlendModeColorFilter)colorFilter0).getBlendMode-0nO6VwU(), 3) : colorFilter0 == null;
    }
}

