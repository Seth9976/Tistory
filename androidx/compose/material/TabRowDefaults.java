package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.pa;
import p0.qa;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000F\bÇ\u0002\u0018\u00002\u00020\u0001J0\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u0011\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001A\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0019\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001A\u0004\b\u0017\u0010\u0018R\u001D\u0010\u001C\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001A\u0010\u0015\u001A\u0004\b\u001B\u0010\u0018R\u001D\u0010\u001F\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001D\u0010\u0015\u001A\u0004\b\u001E\u0010\u0018\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\"²\u0006\f\u0010 \u001A\u00020\u00048\nX\u008A\u0084\u0002²\u0006\f\u0010!\u001A\u00020\u00048\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "thickness", "Landroidx/compose/ui/graphics/Color;", "color", "", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Divider", "height", "Indicator-9IZ8Weo", "Indicator", "Landroidx/compose/material/TabPosition;", "currentTabPosition", "tabIndicatorOffset", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/TabPosition;)Landroidx/compose/ui/Modifier;", "", "DividerOpacity", "F", "a", "getDividerThickness-D9Ej5fM", "()F", "DividerThickness", "b", "getIndicatorHeight-D9Ej5fM", "IndicatorHeight", "c", "getScrollableTabRowPadding-D9Ej5fM", "ScrollableTabRowPadding", "currentTabWidth", "indicatorOffset", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,521:1\n74#2:522\n74#2:523\n135#3:524\n154#4:525\n154#4:526\n154#4:527\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n371#1:522\n388#1:523\n408#1:524\n435#1:525\n440#1:526\n445#1:527\n*E\n"})
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    @NotNull
    public static final TabRowDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        TabRowDefaults.INSTANCE = new TabRowDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        TabRowDefaults.a = 1.0f;
        TabRowDefaults.b = 2.0f;
        TabRowDefaults.c = 52.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Divider-9IZ8Weo(@Nullable Modifier modifier0, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        long v6;
        float f1;
        Modifier modifier1;
        int v5;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x364BC30F);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
            v3 |= ((v2 & 2) != 0 || !composer1.changed(f) ? 16 : 0x20);
        }
        if((v1 & 0x380) == 0) {
            if((v2 & 4) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x100 : 0x80;
            }
            else {
                v4 = v;
                v5 = 0x80;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(this) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) == 0) {
                    f1 = f;
                }
                else {
                    v3 &= 0xFFFFFF8F;
                    f1 = TabRowDefaults.a;
                }
                if((v2 & 4) != 0) {
                    v4 = Color.copy-wmQWz5c$default(((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    v3 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                modifier1 = modifier0;
                f1 = f;
            }
            v6 = v4;
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x364BC30F, v3, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:371)");
            }
            DividerKt.Divider-oMI9zvI(modifier1, v6, f1, 0.0f, composer1, v3 & 14 | v3 >> 3 & 0x70 | v3 << 3 & 0x380, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f1 = f;
            v6 = v4;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pa(this, modifier1, f1, v6, v1, v2, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Indicator-9IZ8Weo(@Nullable Modifier modifier0, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        float f1;
        Modifier modifier1;
        int v5;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(1499002201);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
            v3 |= ((v2 & 2) != 0 || !composer1.changed(f) ? 16 : 0x20);
        }
        if((v1 & 0x380) == 0) {
            if((v2 & 4) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x100 : 0x80;
            }
            else {
                v4 = v;
                v5 = 0x80;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(this) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) == 0) {
                    f1 = f;
                }
                else {
                    v3 &= 0xFFFFFF8F;
                    f1 = TabRowDefaults.b;
                }
                if((v2 & 4) != 0) {
                    v4 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v3 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                modifier1 = modifier0;
                f1 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1499002201, v3, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:388)");
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
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pa(this, modifier1, f1, v4, v1, v2, 1));
        }
    }

    public final float getDividerThickness-D9Ej5fM() {
        return TabRowDefaults.a;
    }

    public final float getIndicatorHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getScrollableTabRowPadding-D9Ej5fM() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @NotNull
    public final Modifier tabIndicatorOffset(@NotNull Modifier modifier0, @NotNull TabPosition tabPosition0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new qa(tabPosition0));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n1#1,170:1\n409#2,3:171\n*E\n"})
        public final class androidx.compose.material.TabRowDefaults.tabIndicatorOffset..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final TabPosition w;

            public androidx.compose.material.TabRowDefaults.tabIndicatorOffset..inlined.debugInspectorInfo.1(TabPosition tabPosition0) {
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

