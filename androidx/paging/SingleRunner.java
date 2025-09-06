package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.e2;
import s4.h2;
import s4.i2;
import s4.j2;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000E2\u00020\u0001:\u0003\u000F\u000E\u0010B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u001C\u0010\u000B\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/paging/SingleRunner;", "", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", "", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "runInIsolation", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "s4/e2", "s4/h2", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SingleRunner {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/SingleRunner$Companion;", "", "", "DEFAULT_PRIORITY", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final int DEFAULT_PRIORITY;
    public final h2 a;

    static {
        SingleRunner.Companion = new Companion(null);
    }

    public SingleRunner() {
        this(false, 1, null);
    }

    public SingleRunner(boolean z) {
        this.a = new h2(this, z);
    }

    public SingleRunner(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    @Nullable
    public final Object runInIsolation(int v, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        SingleRunner singleRunner0;
        i2 i20;
        if(continuation0 instanceof i2) {
            i20 = (i2)continuation0;
            int v1 = i20.r;
            if((v1 & 0x80000000) == 0) {
                i20 = new i2(this, continuation0);
            }
            else {
                i20.r = v1 ^ 0x80000000;
            }
        }
        else {
            i20 = new i2(this, continuation0);
        }
        Object object0 = i20.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i20.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    j2 j20 = new j2(this, v, function10, null);
                    i20.o = this;
                    i20.r = 1;
                    return CoroutineScopeKt.coroutineScope(j20, i20) == object1 ? object1 : Unit.INSTANCE;
                }
                catch(e2 e20) {
                    singleRunner0 = this;
                }
            label_26:
                if(e20.a != singleRunner0) {
                    throw e20;
                }
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    singleRunner0 = i20.o;
                    ResultKt.throwOnFailure(object0);
                    return Unit.INSTANCE;
                }
                catch(e2 e20) {
                    goto label_26;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static Object runInIsolation$default(SingleRunner singleRunner0, int v, Function1 function10, Continuation continuation0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return singleRunner0.runInIsolation(v, function10, continuation0);
    }
}

