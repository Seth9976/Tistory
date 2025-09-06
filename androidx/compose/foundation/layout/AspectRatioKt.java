package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
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

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A \u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"aspectRatio", "Landroidx/compose/ui/Modifier;", "ratio", "", "matchHeightConstraintsFirst", "", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,236:1\n135#2:237\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n63#1:237\n*E\n"})
public final class AspectRatioKt {
    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier aspectRatio(@NotNull Modifier modifier0, @FloatRange(from = 0.0, fromInclusive = false) float f, boolean z) {
        return modifier0.then(new AspectRatioElement(f, z, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n1#1,178:1\n64#2,4:179\n*E\n"})
        public final class androidx.compose.foundation.layout.AspectRatioKt.aspectRatio..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float w;
            public final boolean x;

            public androidx.compose.foundation.layout.AspectRatioKt.aspectRatio..inlined.debugInspectorInfo.1(float f, boolean z) {
                this.w = f;
                this.x = z;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("aspectRatio");
                inspectorInfo0.getProperties().set("ratio", this.w);
                inspectorInfo0.getProperties().set("matchHeightConstraintsFirst", Boolean.valueOf(this.x));
            }
        }

    }

    public static Modifier aspectRatio$default(Modifier modifier0, float f, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return AspectRatioKt.aspectRatio(modifier0, f, z);
    }
}

