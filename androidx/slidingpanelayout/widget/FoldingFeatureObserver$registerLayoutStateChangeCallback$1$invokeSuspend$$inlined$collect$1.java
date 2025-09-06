package androidx.slidingpanelayout.widget;

import androidx.window.layout.FoldingFeature;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class FoldingFeatureObserver.registerLayoutStateChangeCallback.1.invokeSuspend..inlined.collect.1 implements FlowCollector {
    public final FoldingFeatureObserver a;

    public FoldingFeatureObserver.registerLayoutStateChangeCallback.1.invokeSuspend..inlined.collect.1(FoldingFeatureObserver foldingFeatureObserver0) {
        this.a = foldingFeatureObserver0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Object object0, @NotNull Continuation continuation0) {
        OnFoldingFeatureChangeListener foldingFeatureObserver$OnFoldingFeatureChangeListener0 = FoldingFeatureObserver.access$getOnFoldingFeatureChangeListener$p(this.a);
        if(foldingFeatureObserver$OnFoldingFeatureChangeListener0 == null) {
            return null == a.getCOROUTINE_SUSPENDED() ? null : Unit.INSTANCE;
        }
        foldingFeatureObserver$OnFoldingFeatureChangeListener0.onFoldingFeatureChange(((FoldingFeature)object0));
        return Unit.INSTANCE;
    }
}

