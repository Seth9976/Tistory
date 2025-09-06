package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import d0.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001A\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "<init>", "()V", "", "waitForFirstLayout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAwaitFirstLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    public static final int $stable;
    public boolean a;
    public SafeContinuation b;

    @Override  // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        if(!this.a) {
            this.a = true;
            SafeContinuation safeContinuation0 = this.b;
            if(safeContinuation0 != null) {
                safeContinuation0.resumeWith(Unit.INSTANCE);
            }
            this.b = null;
        }
    }

    @Nullable
    public final Object waitForFirstLayout(@NotNull Continuation continuation0) {
        SafeContinuation safeContinuation2;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.r;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.r = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!this.a) {
                    SafeContinuation safeContinuation0 = this.b;
                    a0.o = safeContinuation0;
                    a0.r = 1;
                    SafeContinuation safeContinuation1 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(a0));
                    this.b = safeContinuation1;
                    Object object2 = safeContinuation1.getOrThrow();
                    if(object2 == qd.a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(a0);
                    }
                    if(object2 == object1) {
                        return object1;
                    }
                    safeContinuation2 = safeContinuation0;
                    goto label_29;
                }
                break;
            }
            case 1: {
                safeContinuation2 = a0.o;
                ResultKt.throwOnFailure(object0);
            label_29:
                if(safeContinuation2 != null) {
                    safeContinuation2.resumeWith(Unit.INSTANCE);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

