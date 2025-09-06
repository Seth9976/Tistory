package androidx.compose.ui.draw;

import androidx.compose.material3.ti;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n1.c;
import n1.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u0013\u001A\u00020\u000E*\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00012\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0016\u001A\u00020\u00152\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001A\u00020\u00152\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0004\b\u0018\u0010\u0017R\"\u0010 \u001A\u00020\u00198\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR$\u0010\'\u001A\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010.\u001A\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00107\u001A\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u0010\u000B\u001A\u0002088F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b9\u0010:R\u0011\u0010\t\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\b;\u0010<R\u0014\u0010\u0007\u001A\u00020=8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b>\u0010?R\u0014\u0010A\u001A\u00020=8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b@\u0010?\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006B"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "obtainGraphicsLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "record-TdoYBX4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "record", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "onDrawBehind", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;", "onDrawWithContent", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "a", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "getCacheParams$ui_release", "()Landroidx/compose/ui/draw/BuildDrawCacheParams;", "setCacheParams$ui_release", "(Landroidx/compose/ui/draw/BuildDrawCacheParams;)V", "cacheParams", "b", "Landroidx/compose/ui/draw/DrawResult;", "getDrawResult$ui_release", "()Landroidx/compose/ui/draw/DrawResult;", "setDrawResult$ui_release", "(Landroidx/compose/ui/draw/DrawResult;)V", "drawResult", "c", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "getContentDrawScope$ui_release", "()Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "setContentDrawScope$ui_release", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "contentDrawScope", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/GraphicsContext;", "d", "Lkotlin/jvm/functions/Function0;", "getGraphicsContextProvider$ui_release", "()Lkotlin/jvm/functions/Function0;", "setGraphicsContextProvider$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "graphicsContextProvider", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "getDensity", "()F", "getFontScale", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
public final class CacheDrawScope implements Density {
    public static final int $stable;
    public BuildDrawCacheParams a;
    public DrawResult b;
    public ContentDrawScope c;
    public Function0 d;

    public CacheDrawScope() {
        this.a = e.a;
    }

    @NotNull
    public final BuildDrawCacheParams getCacheParams$ui_release() {
        return this.a;
    }

    @Nullable
    public final ContentDrawScope getContentDrawScope$ui_release() {
        return this.c;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Nullable
    public final DrawResult getDrawResult$ui_release() {
        return this.b;
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.a.getDensity().getFontScale();
    }

    @Nullable
    public final Function0 getGraphicsContextProvider$ui_release() {
        return this.d;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    public final long getSize-NH-jbRc() {
        return this.a.getSize-NH-jbRc();
    }

    @NotNull
    public final GraphicsLayer obtainGraphicsLayer() {
        Function0 function00 = this.d;
        Intrinsics.checkNotNull(function00);
        return ((GraphicsContext)function00.invoke()).createGraphicsLayer();
    }

    @NotNull
    public final DrawResult onDrawBehind(@NotNull Function1 function10) {
        return this.onDrawWithContent(new ti(function10, 11));
    }

    @NotNull
    public final DrawResult onDrawWithContent(@NotNull Function1 function10) {
        DrawResult drawResult0 = new DrawResult(function10);
        this.b = drawResult0;
        return drawResult0;
    }

    public final void record-TdoYBX4(@NotNull GraphicsLayer graphicsLayer0, @NotNull Density density0, @NotNull LayoutDirection layoutDirection0, long v, @NotNull Function1 function10) {
        graphicsLayer0.record-mL-hObY(density0, layoutDirection0, v, new c(this, density0, layoutDirection0, v, function10));
    }

    public static void record-TdoYBX4$default(CacheDrawScope cacheDrawScope0, GraphicsLayer graphicsLayer0, Density density0, LayoutDirection layoutDirection0, long v, Function1 function10, int v1, Object object0) {
        Density density1 = (v1 & 1) == 0 ? density0 : cacheDrawScope0;
        if((v1 & 2) != 0) {
            layoutDirection0 = cacheDrawScope0.getLayoutDirection();
        }
        if((v1 & 4) != 0) {
            v = IntSizeKt.toIntSize-uvyYCjk(cacheDrawScope0.getSize-NH-jbRc());
        }
        cacheDrawScope0.record-TdoYBX4(graphicsLayer0, density1, layoutDirection0, v, function10);
    }

    public final void setCacheParams$ui_release(@NotNull BuildDrawCacheParams buildDrawCacheParams0) {
        this.a = buildDrawCacheParams0;
    }

    public final void setContentDrawScope$ui_release(@Nullable ContentDrawScope contentDrawScope0) {
        this.c = contentDrawScope0;
    }

    public final void setDrawResult$ui_release(@Nullable DrawResult drawResult0) {
        this.b = drawResult0;
    }

    public final void setGraphicsContextProvider$ui_release(@Nullable Function0 function00) {
        this.d = function00;
    }
}

