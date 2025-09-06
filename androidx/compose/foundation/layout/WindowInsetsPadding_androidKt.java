package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000E\u001A\u0011\u0010\u0001\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0011\u0010\u0003\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0011\u0010\u0004\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001A\u0011\u0010\u0005\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001A\u0011\u0010\u0006\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001A\u0011\u0010\u0007\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001A\u0011\u0010\b\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0002\u001A\u0011\u0010\t\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001A\u0011\u0010\n\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001A\u0011\u0010\u000B\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000B\u0010\u0002\u001A\u0011\u0010\f\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0002\u001A\u0011\u0010\r\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0002¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/Modifier;", "safeDrawingPadding", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "safeGesturesPadding", "safeContentPadding", "systemBarsPadding", "displayCutoutPadding", "statusBarsPadding", "imePadding", "navigationBarsPadding", "captionBarPadding", "waterfallPadding", "systemGesturesPadding", "mandatorySystemGesturesPadding", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,256:1\n249#1,7:258\n249#1,7:266\n249#1,7:274\n249#1,7:282\n249#1,7:290\n249#1,7:298\n249#1,7:306\n249#1,7:314\n249#1,7:322\n249#1,7:330\n249#1,7:338\n249#1,7:346\n135#2:257\n135#2:265\n135#2:273\n135#2:281\n135#2:289\n135#2:297\n135#2:305\n135#2:313\n135#2:321\n135#2:329\n135#2:337\n135#2:345\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n41#1:258,7\n59#1:266,7\n77#1:274,7\n95#1:282,7\n113#1:290,7\n131#1:298,7\n149#1:306,7\n167#1:314,7\n185#1:322,7\n203#1:330,7\n221#1:338,7\n240#1:346,7\n41#1:257\n59#1:265\n77#1:273\n95#1:281\n113#1:289\n131#1:297\n149#1:305\n167#1:313\n185#1:321\n203#1:329\n221#1:337\n240#1:345\n*E\n"})
public final class WindowInsetsPadding_androidKt {
    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier captionBarPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getCaptionBar());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n185#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.captionBarPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.captionBarPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("captionBarPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier displayCutoutPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getDisplayCutout());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n113#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("displayCutoutPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier imePadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getIme());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n149#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("imePadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier mandatorySystemGesturesPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getMandatorySystemGestures());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n240#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.mandatorySystemGesturesPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.mandatorySystemGesturesPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("mandatorySystemGesturesPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier navigationBarsPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getNavigationBars());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n167#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("navigationBarsPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier safeContentPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getSafeContent());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n77#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeContentPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeContentPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("safeContentPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier safeDrawingPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getSafeDrawing());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n41#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeDrawingPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeDrawingPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("safeDrawingPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier safeGesturesPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getSafeGestures());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n59#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeGesturesPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.safeGesturesPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("safeGesturesPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier statusBarsPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getStatusBars());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n131#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("statusBarsPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier systemBarsPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getSystemBars());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n95#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("systemBarsPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier systemGesturesPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getSystemGestures());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n221#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemGesturesPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemGesturesPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("systemGesturesPadding");
            }
        }

    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier waterfallPadding(@NotNull Modifier modifier0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3() {
            {
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0x15733969);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
                }
                WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
                boolean z = composer0.changed(windowInsetsHolder0);
                InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
                if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
                    insetsPaddingModifier0 = new InsetsPaddingModifier(windowInsetsHolder0.getWaterfall());
                    composer0.updateRememberedValue(insetsPaddingModifier0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return insetsPaddingModifier0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n203#2:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.waterfallPadding..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.waterfallPadding..inlined.debugInspectorInfo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("waterfallPadding");
            }
        }

    }
}

