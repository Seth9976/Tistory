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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\u0014\u0010\u0005\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007\u001A\u0014\u0010\u0006\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"height", "Landroidx/compose/ui/Modifier;", "intrinsicSize", "Landroidx/compose/foundation/layout/IntrinsicSize;", "requiredHeight", "requiredWidth", "width", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntrinsic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,285:1\n135#2:286\n135#2:287\n135#2:288\n135#2:289\n*S KotlinDebug\n*F\n+ 1 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n52#1:286\n76#1:287\n98#1:288\n120#1:289\n*E\n"})
public final class IntrinsicKt {
    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier height(@NotNull Modifier modifier0, @NotNull IntrinsicSize intrinsicSize0) {
        return modifier0.then(new IntrinsicHeightElement(intrinsicSize0, true, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n1#1,178:1\n77#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.IntrinsicKt.height..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final IntrinsicSize w;

            public androidx.compose.foundation.layout.IntrinsicKt.height..inlined.debugInspectorInfo.1(IntrinsicSize intrinsicSize0) {
                this.w = intrinsicSize0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("height");
                inspectorInfo0.getProperties().set("intrinsicSize", this.w);
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredHeight(@NotNull Modifier modifier0, @NotNull IntrinsicSize intrinsicSize0) {
        return modifier0.then(new IntrinsicHeightElement(intrinsicSize0, false, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n1#1,178:1\n121#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.IntrinsicKt.requiredHeight..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final IntrinsicSize w;

            public androidx.compose.foundation.layout.IntrinsicKt.requiredHeight..inlined.debugInspectorInfo.1(IntrinsicSize intrinsicSize0) {
                this.w = intrinsicSize0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredHeight");
                inspectorInfo0.getProperties().set("intrinsicSize", this.w);
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier requiredWidth(@NotNull Modifier modifier0, @NotNull IntrinsicSize intrinsicSize0) {
        return modifier0.then(new IntrinsicWidthElement(intrinsicSize0, false, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n1#1,178:1\n99#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.IntrinsicKt.requiredWidth..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final IntrinsicSize w;

            public androidx.compose.foundation.layout.IntrinsicKt.requiredWidth..inlined.debugInspectorInfo.1(IntrinsicSize intrinsicSize0) {
                this.w = intrinsicSize0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("requiredWidth");
                inspectorInfo0.getProperties().set("intrinsicSize", this.w);
            }
        }

    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier width(@NotNull Modifier modifier0, @NotNull IntrinsicSize intrinsicSize0) {
        return modifier0.then(new IntrinsicWidthElement(intrinsicSize0, true, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n1#1,178:1\n53#2,3:179\n*E\n"})
        public final class androidx.compose.foundation.layout.IntrinsicKt.width..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final IntrinsicSize w;

            public androidx.compose.foundation.layout.IntrinsicKt.width..inlined.debugInspectorInfo.1(IntrinsicSize intrinsicSize0) {
                this.w = intrinsicSize0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("width");
                inspectorInfo0.getProperties().set("intrinsicSize", this.w);
            }
        }

    }
}

