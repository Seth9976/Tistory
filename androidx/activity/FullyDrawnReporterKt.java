package androidx.activity;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001A0\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u001C\u0010\u0003\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086H¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"reportWhenComplete", "", "Landroidx/activity/FullyDrawnReporter;", "reporter", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FullyDrawnReporterKt {
    @Nullable
    public static final Object reportWhenComplete(@NotNull FullyDrawnReporter fullyDrawnReporter0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        v v0;
        if(continuation0 instanceof v) {
            v0 = (v)continuation0;
            int v1 = v0.q;
            if((v1 & 0x80000000) == 0) {
                v0 = new v(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                v0.q = v1 ^ 0x80000000;
            }
        }
        else {
            v0 = new v(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = v0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(v0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                fullyDrawnReporter0.addReporter();
                if(fullyDrawnReporter0.isFullyDrawnReported()) {
                    return Unit.INSTANCE;
                }
                try {
                    v0.o = fullyDrawnReporter0;
                    v0.q = 1;
                    if(function10.invoke(v0) == object1) {
                        return object1;
                    label_21:
                        fullyDrawnReporter0 = v0.o;
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    fullyDrawnReporter0.removeReporter();
                    throw throwable0;
                }
            }
            case 1: {
                goto label_21;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        fullyDrawnReporter0.removeReporter();
        return Unit.INSTANCE;
    }
}

