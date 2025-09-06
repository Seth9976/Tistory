package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\u0014\u0010\u0005\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\u0014\u0010\u0006\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,214:1\n135#2:215\n135#2:216\n135#2:217\n135#2:218\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n50#1:215\n75#1:216\n98#1:217\n117#1:218\n*E\n"})
public final class WindowInsetsSizeKt {
    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier windowInsetsBottomHeight(@NotNull Modifier modifier0, @NotNull WindowInsets windowInsets0) {
        return modifier0.then(new a1(windowInsets0, InspectableValueKt.getNoInspectorInfo(), r4.x));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,178:1\n118#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final WindowInsets w;

            public androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.w = windowInsets0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("insetsBottomHeight");
                inspectorInfo0.getProperties().set("insets", this.w);
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier windowInsetsEndWidth(@NotNull Modifier modifier0, @NotNull WindowInsets windowInsets0) {
        return modifier0.then(new d1(windowInsets0, InspectableValueKt.getNoInspectorInfo(), s4.x));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,178:1\n76#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final WindowInsets w;

            public androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.w = windowInsets0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("insetsEndWidth");
                inspectorInfo0.getProperties().set("insets", this.w);
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier windowInsetsStartWidth(@NotNull Modifier modifier0, @NotNull WindowInsets windowInsets0) {
        return modifier0.then(new d1(windowInsets0, InspectableValueKt.getNoInspectorInfo(), s4.y));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,178:1\n51#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final WindowInsets w;

            public androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.w = windowInsets0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("insetsStartWidth");
                inspectorInfo0.getProperties().set("insets", this.w);
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier windowInsetsTopHeight(@NotNull Modifier modifier0, @NotNull WindowInsets windowInsets0) {
        return modifier0.then(new a1(windowInsets0, InspectableValueKt.getNoInspectorInfo(), r4.y));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,178:1\n99#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final WindowInsets w;

            public androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight..inlined.debugInspectorInfo.1(WindowInsets windowInsets0) {
                this.w = windowInsets0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("insetsTopHeight");
                inspectorInfo0.getProperties().set("insets", this.w);
            }
        }

    }
}

