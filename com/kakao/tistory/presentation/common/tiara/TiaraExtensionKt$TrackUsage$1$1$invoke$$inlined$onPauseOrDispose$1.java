package com.kakao.tistory.presentation.common.tiara;

import androidx.compose.runtime.State;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import com.kakao.tiara.data.Usage.Builder;
import com.kakao.tiara.data.Usage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/lifecycle/compose/LifecycleResumePauseEffectScope$onPauseOrDispose$1", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "runPauseOrOnDisposeEffect", "", "lifecycle-runtime-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleResumePauseEffectScope$onPauseOrDispose$1\n+ 2 TiaraExtension.kt\ncom/kakao/tistory/presentation/common/tiara/TiaraExtensionKt$TrackUsage$1$1\n*L\n1#1,747:1\n35#2,18:748\n*E\n"})
public final class TiaraExtensionKt.TrackUsage.1.1.invoke..inlined.onPauseOrDispose.1 implements LifecyclePauseOrDisposeEffectResult {
    public final LongRef a;
    public final String b;
    public final String c;
    public final String d;
    public final State e;

    public TiaraExtensionKt.TrackUsage.1.1.invoke..inlined.onPauseOrDispose.1(LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope0, LongRef ref$LongRef0, String s, String s1, String s2, State state0) {
        this.a = ref$LongRef0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = state0;
        super();
    }

    @Override  // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
    public void runPauseOrOnDisposeEffect() {
        if(this.a.element != 0L) {
            long v = System.currentTimeMillis() - this.a.element;
            this.a.element = 0L;
            Usage usage0 = new Builder().duration(String.valueOf(v)).build();
            Intrinsics.checkNotNullExpressionValue(usage0, "build(...)");
            Map map0 = TiaraExtensionKt.access$TrackUsage$lambda$0(this.e);
            TistoryTiara.trackUsage$default(TistoryTiara.INSTANCE, this.b, this.c, this.d, usage0, null, map0, 16, null);
        }
    }
}

