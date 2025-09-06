package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004Rs\u0010\u0005\u001Ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000B\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\r\u0018\u00010\u0006j\u0004\u0018\u0001`\u0010X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012Ra\u0010\u0013\u001AQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000B\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\u0015X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0012Ra\u0010\u0017\u001AQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\u000F0\u0006j\u0002`\u0018X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0012\u0082\u0001\u0003\u001A\u001B\u001C¨\u0006\u001D"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause;", "", "clauseObject", "getClauseObject", "()Ljava/lang/Object;", "onCancellationConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnCancellationConstructor", "()Lkotlin/jvm/functions/Function3;", "processResFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "getProcessResFunc", "regFunc", "Lkotlinx/coroutines/selects/RegistrationFunction;", "getRegFunc", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlinx/coroutines/selects/SelectClause2;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@InternalCoroutinesApi
public interface SelectClause {
    @NotNull
    Object getClauseObject();

    @Nullable
    Function3 getOnCancellationConstructor();

    @NotNull
    Function3 getProcessResFunc();

    @NotNull
    Function3 getRegFunc();
}

