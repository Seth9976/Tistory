package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.material3.pl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import t0.b;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pullRefreshIndicatorTransform", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "scale", "", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,76:1\n135#2:77\n146#2:78\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n*L\n42#1:77\n42#1:78\n*E\n"})
public final class PullRefreshIndicatorTransformKt {
    // 去混淆评级： 低(30)
    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefreshIndicatorTransform(@NotNull Modifier modifier0, @NotNull PullRefreshState pullRefreshState0, boolean z) {
        return InspectableValueKt.inspectableWrapper(modifier0, InspectableValueKt.getNoInspectorInfo(), GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(Modifier.Companion, b.y), new pl(pullRefreshState0, z)));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n*L\n1#1,170:1\n43#2,4:171\n*E\n"})
        public final class androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final PullRefreshState w;
            public final boolean x;

            public androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform..inlined.debugInspectorInfo.1(PullRefreshState pullRefreshState0, boolean z) {
                this.w = pullRefreshState0;
                this.x = z;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("pullRefreshIndicatorTransform");
                inspectorInfo0.getProperties().set("state", this.w);
                inspectorInfo0.getProperties().set("scale", Boolean.valueOf(this.x));
            }
        }

    }

    public static Modifier pullRefreshIndicatorTransform$default(Modifier modifier0, PullRefreshState pullRefreshState0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform(modifier0, pullRefreshState0, z);
    }
}

