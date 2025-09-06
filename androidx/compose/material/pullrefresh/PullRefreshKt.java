package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import t0.g;
import t0.i;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001Aq\u0010\u0000\u001A\u00020\u0001*\u00020\u00012!\u0010\u0002\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000321\u0010\b\u001A-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000B\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\b\b\u0002\u0010\r\u001A\u00020\u000EH\u0007¢\u0006\u0002\u0010\u000F\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\r\u001A\u00020\u000EH\u0007¨\u0006\u0012"}, d2 = {"pullRefresh", "Landroidx/compose/ui/Modifier;", "onPull", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pullDelta", "onRelease", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", "enabled", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,120:1\n135#2:121\n146#2:122\n135#2:123\n146#2:124\n*S KotlinDebug\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n47#1:121\n47#1:122\n82#1:123\n82#1:124\n*E\n"})
public final class PullRefreshKt {
    public static final Object access$pullRefresh$lambda$1$onRelease(PullRefreshState pullRefreshState0, float f, Continuation continuation0) {
        return Boxing.boxFloat(pullRefreshState0.onRelease$material_release(f));
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefresh(@NotNull Modifier modifier0, @NotNull PullRefreshState pullRefreshState0, boolean z) {
        h h0 = new h(1, pullRefreshState0, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0, 8);
        g g0 = new g(2, pullRefreshState0, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);  // 初始化器: Lkotlin/jvm/internal/AdaptedFunctionReference;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        return InspectableValueKt.inspectableWrapper(modifier0, InspectableValueKt.getNoInspectorInfo(), PullRefreshKt.pullRefresh(Modifier.Companion, h0, g0, z));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n1#1,170:1\n48#2,4:171\n*E\n"})
        public final class androidx.compose.material.pullrefresh.PullRefreshKt.pullRefresh..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final PullRefreshState w;
            public final boolean x;

            public androidx.compose.material.pullrefresh.PullRefreshKt.pullRefresh..inlined.debugInspectorInfo.1(PullRefreshState pullRefreshState0, boolean z) {
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
                inspectorInfo0.setName("pullRefresh");
                inspectorInfo0.getProperties().set("state", this.w);
                inspectorInfo0.getProperties().set("enabled", Boolean.valueOf(this.x));
            }
        }

    }

    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefresh(@NotNull Modifier modifier0, @NotNull Function1 function10, @NotNull Function2 function20, boolean z) {
        i i0 = new i(function10, function20, z);
        return InspectableValueKt.inspectableWrapper(modifier0, InspectableValueKt.getNoInspectorInfo(), NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, i0, null, 2, null));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n1#1,170:1\n83#2,5:171\n*E\n"})
        public final class androidx.compose.material.pullrefresh.PullRefreshKt.pullRefresh..inlined.debugInspectorInfo.2 extends Lambda implements Function1 {
            public final Function1 w;
            public final Function2 x;
            public final boolean y;

            public androidx.compose.material.pullrefresh.PullRefreshKt.pullRefresh..inlined.debugInspectorInfo.2(Function1 function10, Function2 function20, boolean z) {
                this.w = function10;
                this.x = function20;
                this.y = z;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("pullRefresh");
                inspectorInfo0.getProperties().set("onPull", this.w);
                inspectorInfo0.getProperties().set("onRelease", this.x);
                inspectorInfo0.getProperties().set("enabled", Boolean.valueOf(this.y));
            }
        }

    }

    public static Modifier pullRefresh$default(Modifier modifier0, PullRefreshState pullRefreshState0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return PullRefreshKt.pullRefresh(modifier0, pullRefreshState0, z);
    }

    public static Modifier pullRefresh$default(Modifier modifier0, Function1 function10, Function2 function20, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        return PullRefreshKt.pullRefresh(modifier0, function10, function20, z);
    }
}

