package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.b;
import x0.c;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001JJ\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0016\u001A\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001D\u0010\u001B\u001A\u00020\u000B8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001D\u0010\u001E\u001A\u00020\u000B8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001C\u0010\u0018\u001A\u0004\b\u001D\u0010\u001AR\u0017\u0010\t\u001A\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0017\u0010\"\u001A\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b!\u0010 \u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;", "", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "", "isRefreshing", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "color", "Landroidx/compose/ui/unit/Dp;", "threshold", "", "Indicator-2poqoh4", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZLandroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;II)V", "Indicator", "Landroidx/compose/ui/graphics/Shape;", "a", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "shape", "b", "F", "getPositionalThreshold-D9Ej5fM", "()F", "PositionalThreshold", "c", "getElevation-D9Ej5fM", "Elevation", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "getIndicatorColor", "indicatorColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,678:1\n71#2:679\n69#2,5:680\n74#2:713\n78#2:717\n78#3,6:685\n85#3,4:700\n89#3,2:710\n93#3:716\n368#4,9:691\n377#4:712\n378#4,2:714\n4032#5,6:704\n148#6:718\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults\n*L\n442#1:679\n442#1:680,5\n442#1:713\n442#1:717\n442#1:685,6\n442#1:700,4\n442#1:710,2\n442#1:716\n442#1:691,9\n442#1:712\n442#1:714,2\n442#1:704,6\n427#1:718\n*E\n"})
public final class PullToRefreshDefaults {
    public static final int $stable;
    @NotNull
    public static final PullToRefreshDefaults INSTANCE;
    public static final RoundedCornerShape a;
    public static final float b;
    public static final float c;

    static {
        PullToRefreshDefaults.INSTANCE = new PullToRefreshDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        PullToRefreshDefaults.a = RoundedCornerShapeKt.getCircleShape();
        PullToRefreshDefaults.b = 80.0f;
        PullToRefreshDefaults.c = 0.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Indicator-2poqoh4(@NotNull PullToRefreshState pullToRefreshState0, boolean z, @Nullable Modifier modifier0, long v, long v1, float f, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        long v10;
        long v9;
        float f1;
        Modifier modifier2;
        int v11;
        float f2;
        int v8;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xBFD04390);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(pullToRefreshState0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x800 : 0x400;
            }
            else {
                v5 = v;
                v6 = 0x400;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x6000) == 0) {
            if((v3 & 16) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x4000 : 0x2000;
            }
            else {
                v7 = v1;
                v8 = 0x2000;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((0x30000 & v2) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(f) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(this) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v4) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                    v5 = PullToRefreshDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v3 & 16) != 0) {
                    v7 = PullToRefreshDefaults.INSTANCE.getIndicatorColor(composer1, 6);
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) == 0) {
                    f2 = f;
                    v11 = v4;
                    modifier2 = modifier3;
                }
                else {
                    v11 = v4 & 0xFFF8FFFF;
                    modifier2 = modifier3;
                    f2 = PullToRefreshDefaults.b;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                f2 = f;
                v11 = v4;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBFD04390, v11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:440)");
            }
            Modifier modifier4 = PullToRefreshKt.pullToRefreshIndicator-wUdLESc$default(modifier2, pullToRefreshState0, z, f2, null, v5, 0.0f, 40, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                a.t(v12, composer1, v12, function20);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            CrossfadeKt.Crossfade(Boolean.valueOf(z), null, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, ComposableLambdaKt.rememberComposableLambda(0xA008A6B, true, new b(v7, pullToRefreshState0), composer1, 54), composer1, v11 >> 3 & 14 | 0x6180, 10);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v10 = v5;
            f1 = f2;
            v9 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            f1 = f;
            v9 = v7;
            v10 = v5;
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(this, pullToRefreshState0, z, modifier1, v10, v9, f1, v2, v3));
        }
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3F8DCE34, v, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:419)");
        }
        long v1 = MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurfaceContainerHigh-0d7_KjU();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getIndicatorColor")
    public final long getIndicatorColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAA16FC74, v, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:423)");
        }
        long v1 = MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getOnSurfaceVariant-0d7_KjU();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getPositionalThreshold-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final Shape getShape() {
        return PullToRefreshDefaults.a;
    }
}

