package kotlinx.coroutines.selects;

import bg.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AG\u0010\u0006\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001F\b\u0004\u0010\u0005\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00A2\u0006\u0002\b\u0004H\u0086H\u00F8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0004\b\u0006\u0010\u0007\"\u001A\u0010\r\u001A\u00020\b8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f*\u00C2\u0001\b\u0007\u0010\u0017\"[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00010\u000E2[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00010\u000EB\u0002\b\u0016*\u00A6\u0001\b\u0007\u0010\u001A\"M\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000E2M\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000EB\u0002\b\u0016*\u00A6\u0001\b\u0007\u0010\u001B\"M\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000E2M\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0012\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000EB\u0002\b\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006\u001C"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "select", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "f", "Lkotlinx/coroutines/internal/Symbol;", "getPARAM_CLAUSE_0", "()Lkotlinx/coroutines/internal/Symbol;", "PARAM_CLAUSE_0", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "", "param", "internalResult", "", "Lkotlinx/coroutines/InternalCoroutinesApi;", "OnCancellationConstructor", "clauseObject", "clauseResult", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SelectKt {
    public static final e a;
    public static final Symbol b;
    public static final Symbol c;
    public static final Symbol d;
    public static final Symbol e;
    public static final Symbol f;

    static {
        SelectKt.a = e.w;
        SelectKt.b = new Symbol("STATE_REG");
        SelectKt.c = new Symbol("STATE_COMPLETED");
        SelectKt.d = new Symbol("STATE_CANCELLED");
        SelectKt.e = new Symbol("NO_RESULT");
        SelectKt.f = new Symbol("PARAM_CLAUSE_0");
    }

    @InternalCoroutinesApi
    public static void OnCancellationConstructor$annotations() {
    }

    @InternalCoroutinesApi
    public static void ProcessResultFunction$annotations() {
    }

    @InternalCoroutinesApi
    public static void RegistrationFunction$annotations() {
    }

    public static final TrySelectDetailedResult access$TrySelectDetailedResult(int v) {
        switch(v) {
            case 0: {
                return TrySelectDetailedResult.SUCCESSFUL;
            }
            case 1: {
                return TrySelectDetailedResult.REREGISTER;
            }
            case 2: {
                return TrySelectDetailedResult.CANCELLED;
            }
            case 3: {
                return TrySelectDetailedResult.ALREADY_SELECTED;
            }
            default: {
                throw new IllegalStateException(("Unexpected internal result: " + v).toString());
            }
        }
    }

    public static final Function3 access$getDUMMY_PROCESS_RESULT_FUNCTION$p() {
        return SelectKt.a;
    }

    public static final Symbol access$getSTATE_CANCELLED$p() {
        return SelectKt.d;
    }

    public static final Symbol access$getSTATE_COMPLETED$p() {
        return SelectKt.c;
    }

    public static final Symbol access$getSTATE_REG$p() {
        return SelectKt.b;
    }

    public static final boolean access$tryResume(CancellableContinuation cancellableContinuation0, Function1 function10) {
        Object object0 = cancellableContinuation0.tryResume(Unit.INSTANCE, null, function10);
        if(object0 == null) {
            return false;
        }
        cancellableContinuation0.completeResume(object0);
        return true;
    }

    @NotNull
    public static final Symbol getPARAM_CLAUSE_0() {
        return SelectKt.f;
    }

    @Nullable
    public static final Object select(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        SelectImplementation selectImplementation0 = new SelectImplementation(continuation0.getContext());
        function10.invoke(selectImplementation0);
        return selectImplementation0.doSelect(continuation0);
    }
}

