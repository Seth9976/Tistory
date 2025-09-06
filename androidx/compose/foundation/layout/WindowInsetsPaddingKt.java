package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u001B\u0010\u0003\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u001B\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001A\u001B\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\b\u001A6\u0010\u000F\u001A\u00020\u0000*\u00020\u00002!\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0004\b\u000F\u0010\u0010\" \u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "windowInsetsPadding", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/ui/Modifier;", "consumeWindowInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "consumedWindowInsets", "", "block", "onConsumedWindowInsetsChanged", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "a", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalConsumedWindowInsets", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalConsumedWindowInsets", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,490:1\n135#2:491\n135#2:492\n135#2:493\n135#2:494\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n57#1:491\n77#1:492\n101#1:493\n121#1:494\n*E\n"})
public final class WindowInsetsPaddingKt {
    public static final ProvidableModifierLocal a;

    static {
        WindowInsetsPaddingKt.a = ModifierLocalKt.modifierLocalOf(o4.w);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier consumeWindowInsets(@NotNull Modifier modifier0, @NotNull PaddingValues paddingValues0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new q4(paddingValues0, 0));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,178:1\n102#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets..inlined.debugInspectorInfo.2 extends Lambda implements Function1 {
            public final PaddingValues w;

            public androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets..inlined.debugInspectorInfo.2(PaddingValues paddingValues0) {
                this.w = paddingValues0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("consumeWindowInsets");
                inspectorInfo0.getProperties().set("paddingValues", this.w);
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier consumeWindowInsets(@NotNull Modifier modifier0, @NotNull WindowInsets windowInsets0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new p4(windowInsets0, 0));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,178:1\n78#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final WindowInsets w;

            public androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.w = windowInsets0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("consumeWindowInsets");
                inspectorInfo0.getProperties().set("insets", this.w);
            }
        }

    }

    @NotNull
    public static final ProvidableModifierLocal getModifierLocalConsumedWindowInsets() {
        return WindowInsetsPaddingKt.a;
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier onConsumedWindowInsetsChanged(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new q4(function10, 1));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,178:1\n122#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPaddingKt.onConsumedWindowInsetsChanged..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final Function1 w;

            public androidx.compose.foundation.layout.WindowInsetsPaddingKt.onConsumedWindowInsetsChanged..inlined.debugInspectorInfo.1(Function1 function10) {
                this.w = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("onConsumedWindowInsetsChanged");
                inspectorInfo0.getProperties().set("block", this.w);
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier windowInsetsPadding(@NotNull Modifier modifier0, @NotNull WindowInsets windowInsets0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new p4(windowInsets0, 1));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,178:1\n58#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final WindowInsets w;

            public androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.w = windowInsets0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("windowInsetsPadding");
                inspectorInfo0.getProperties().set("insets", this.w);
            }
        }

    }
}

