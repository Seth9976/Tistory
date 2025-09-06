package androidx.compose.ui.graphics;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0017\u0010\u000E\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "rememberGraphicsLayer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "GraphicsLayerScope", "()Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "DefaultCameraDistance", "F", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefaultShadowColor", "()J", "DefaultShadowColor", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGraphicsLayerScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerScope.kt\nandroidx/compose/ui/graphics/GraphicsLayerScopeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,464:1\n77#2:465\n1223#3,6:466\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerScope.kt\nandroidx/compose/ui/graphics/GraphicsLayerScopeKt\n*L\n258#1:465\n259#1:466,6\n*E\n"})
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;
    public static final long a;

    static {
        GraphicsLayerScopeKt.a = Color.Companion.getBlack-0d7_KjU();
    }

    @NotNull
    public static final GraphicsLayerScope GraphicsLayerScope() {
        return new ReusableGraphicsLayerScope();
    }

    public static final long getDefaultShadowColor() [...] // 潜在的解密器

    @Composable
    @ComposableOpenTarget(index = -1)
    @NotNull
    public static final GraphicsLayer rememberGraphicsLayer(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(158092365, v, -1, "androidx.compose.ui.graphics.rememberGraphicsLayer (GraphicsLayerScope.kt:256)");
        }
        GraphicsContext graphicsContext0 = (GraphicsContext)composer0.consume(CompositionLocalsKt.getLocalGraphicsContext());
        l l0 = composer0.rememberedValue();
        if(l0 == Composer.Companion.getEmpty()) {
            l0 = new l(graphicsContext0);
            composer0.updateRememberedValue(l0);
        }
        GraphicsLayer graphicsLayer0 = l0.b;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return graphicsLayer0;
    }
}

