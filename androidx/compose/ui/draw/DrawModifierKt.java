package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import n1.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001F\u0010\u0000\u001A\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001A#\u0010\u0007\u001A\u00020\b*\u00020\b2\u0017\u0010\t\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\u0003¢\u0006\u0002\b\u0006\u001A#\u0010\f\u001A\u00020\b*\u00020\b2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001A#\u0010\r\u001A\u00020\b*\u00020\b2\u0017\u0010\t\u001A\u0013\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000B0\u0003¢\u0006\u0002\b\u0006¨\u0006\u000F"}, d2 = {"CacheDrawModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "onBuildDrawCache", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/ExtensionFunctionType;", "drawBehind", "Landroidx/compose/ui/Modifier;", "onDraw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawWithCache", "drawWithContent", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DrawModifierKt {
    @NotNull
    public static final CacheDrawModifierNode CacheDrawModifierNode(@NotNull Function1 function10) {
        return new b(new CacheDrawScope(), function10);
    }

    @NotNull
    public static final Modifier drawBehind(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new DrawBehindElement(function10));
    }

    @NotNull
    public static final Modifier drawWithCache(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new DrawWithCacheElement(function10));
    }

    @NotNull
    public static final Modifier drawWithContent(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new DrawWithContentElement(function10));
    }
}

