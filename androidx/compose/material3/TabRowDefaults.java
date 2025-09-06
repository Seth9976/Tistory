package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.material3.tokens.SecondaryNavigationTabTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001B\b\u00C7\u0002\u0018\u00002\u00020\u0001J0\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\t\u0010\nJD\u0010\u0011\u001A\u00020\b2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J0\u0010\u0013\u001A\u00020\b2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\nJ\u0019\u0010\u0016\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017R\u001D\u0010\u001C\u001A\u00020\u00048\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR \u0010!\u001A\u00020\u00068GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\u001F\u0010 \u001A\u0004\b\u001D\u0010\u001ER \u0010$\u001A\u00020\u00068GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b#\u0010 \u001A\u0004\b\"\u0010\u001ER\u0017\u0010&\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b%\u0010\u001ER\u0017\u0010(\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b\'\u0010\u001ER\u0017\u0010*\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b)\u0010\u001ER\u0017\u0010,\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b+\u0010\u001E\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006/\u00B2\u0006\f\u0010-\u001A\u00020\u00048\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010.\u001A\u00020\u00048\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/material3/TabRowDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "height", "Landroidx/compose/ui/graphics/Color;", "color", "", "Indicator-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Indicator", "width", "Landroidx/compose/ui/graphics/Shape;", "shape", "PrimaryIndicator-10LGxhE", "(Landroidx/compose/ui/Modifier;FFJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "PrimaryIndicator", "SecondaryIndicator-9IZ8Weo", "SecondaryIndicator", "Landroidx/compose/material3/TabPosition;", "currentTabPosition", "tabIndicatorOffset", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TabPosition;)Landroidx/compose/ui/Modifier;", "a", "F", "getScrollableTabRowEdgeStartPadding-D9Ej5fM", "()F", "ScrollableTabRowEdgeStartPadding", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "getContainerColor$annotations", "()V", "containerColor", "getContentColor", "getContentColor$annotations", "contentColor", "getPrimaryContainerColor", "primaryContainerColor", "getSecondaryContainerColor", "secondaryContainerColor", "getPrimaryContentColor", "primaryContentColor", "getSecondaryContentColor", "secondaryContentColor", "currentTabWidth", "indicatorOffset", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1355:1\n148#2:1356\n148#2:1358\n135#3:1357\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n1221#1:1356\n1152#1:1358\n1261#1:1357\n*E\n"})
public final class TabRowDefaults {
    public static final int $stable;
    @NotNull
    public static final TabRowDefaults INSTANCE;
    public static final float a;

    static {
        TabRowDefaults.INSTANCE = new TabRowDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        TabRowDefaults.a = 52.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use SecondaryIndicator instead.", replaceWith = @ReplaceWith(expression = "SecondaryIndicator(modifier, height, color)", imports = {}))
    public final void Indicator-9IZ8Weo(@Nullable Modifier modifier0, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        long v4;
        float f1;
        Modifier modifier1;
        int v5;
        int v3;
        Composer composer1 = composer0.startRestartGroup(1454716052);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= ((v2 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v3 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                f1 = (v2 & 2) == 0 ? f : 0.0f;
                if((v2 & 4) == 0) {
                    v5 = v3;
                    v4 = v;
                }
                else {
                    v5 = v3 & -897;
                    v4 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer1, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                modifier1 = modifier0;
                f1 = f;
                v5 = v3;
                v4 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454716052, v5, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1203)");
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier1, 0.0f, 1, null), f1), v4, null, 2, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f1 = f;
            v4 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ln(this, modifier1, f1, v4, v1, v2, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void PrimaryIndicator-10LGxhE(@Nullable Modifier modifier0, float f, float f1, long v, @Nullable Shape shape0, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        Shape shape1;
        int v5;
        long v4;
        float f3;
        float f2;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x8F037F53);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            f2 = f;
        }
        else if((v1 & 0x30) == 0) {
            f2 = f;
            v3 |= (composer1.changed(f2) ? 0x20 : 16);
        }
        else {
            f2 = f;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            f3 = f1;
        }
        else if((v1 & 0x180) == 0) {
            f3 = f1;
            v3 |= (composer1.changed(f3) ? 0x100 : 0x80);
        }
        else {
            f3 = f1;
        }
        if((v1 & 0xC00) == 0) {
            if((v2 & 8) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x800 : 0x400;
            }
            else {
                v4 = v;
                v5 = 0x400;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            shape1 = shape0;
        }
        else if((v1 & 0x6000) == 0) {
            shape1 = shape0;
            v3 |= (composer1.changed(shape1) ? 0x4000 : 0x2000);
        }
        else {
            shape1 = shape0;
        }
        if((v3 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) != 0) {
                    f2 = 24.0f;
                }
                if((v2 & 4) != 0) {
                    f3 = 0.0f;
                }
                if((v2 & 8) != 0) {
                    v4 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composer1, 6);
                    v3 &= 0xFFFFE3FF;
                }
                if((v2 & 16) != 0) {
                    shape1 = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
                modifier1 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8F037F53, v3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1224)");
            }
            SpacerKt.Spacer(BackgroundKt.background-bw27NRU(SizeKt.requiredWidth-3ABfNKs(SizeKt.requiredHeight-3ABfNKs(modifier1, f3), f2), v4, shape1), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p1(this, modifier1, f2, f3, v4, shape1, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void SecondaryIndicator-9IZ8Weo(@Nullable Modifier modifier0, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        long v4;
        float f1;
        Modifier modifier1;
        int v5;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1498258020);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= ((v2 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v3 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                f1 = (v2 & 2) == 0 ? f : 0.0f;
                if((v2 & 4) == 0) {
                    v5 = v3;
                    v4 = v;
                }
                else {
                    v5 = v3 & -897;
                    v4 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composer1, 6);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                modifier1 = modifier0;
                f1 = f;
                v5 = v3;
                v4 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1498258020, v5, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1246)");
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier1, 0.0f, 1, null), f1), v4, null, 2, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f1 = f;
            v4 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ln(this, modifier1, f1, v4, v1, v2, 1));
        }
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026555673, v, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:1159)");
        }
        long v1 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Deprecated(message = "Use TabRowDefaults.primaryContainerColor instead", replaceWith = @ReplaceWith(expression = "primaryContainerColor", imports = {}))
    public static void getContainerColor$annotations() {
    }

    @Composable
    @JvmName(name = "getContentColor")
    public final long getContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163072359, v, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:1175)");
        }
        long v1 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Deprecated(message = "Use TabRowDefaults.primaryContentColor instead", replaceWith = @ReplaceWith(expression = "primaryContentColor", imports = {}))
    public static void getContentColor$annotations() {
    }

    @Composable
    @JvmName(name = "getPrimaryContainerColor")
    public final long getPrimaryContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2069154037, v, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1163)");
        }
        long v1 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getPrimaryContentColor")
    public final long getPrimaryContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x54106CFB, v, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1179)");
        }
        long v1 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getScrollableTabRowEdgeStartPadding-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getSecondaryContainerColor")
    public final long getSecondaryContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1938007129, v, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1167)");
        }
        long v1 = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getSecondaryContentColor")
    public final long getSecondaryContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x45862617, v, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1183)");
        }
        long v1 = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    // 去混淆评级： 低(30)
    @NotNull
    public final Modifier tabIndicatorOffset(@NotNull Modifier modifier0, @NotNull TabPosition tabPosition0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new mn(tabPosition0));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n1#1,178:1\n1262#2,3:179\n*E\n"})
        public final class androidx.compose.material3.TabRowDefaults.tabIndicatorOffset..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final TabPosition w;

            public androidx.compose.material3.TabRowDefaults.tabIndicatorOffset..inlined.debugInspectorInfo.1(TabPosition tabPosition0) {
                this.w = tabPosition0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("tabIndicatorOffset");
                inspectorInfo0.setValue(this.w);
            }
        }

    }
}

