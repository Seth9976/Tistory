package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u00D1\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012U\u0010\f\u001AQ\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000B\u0012i\b\u0002\u0010\u0011\u001Ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\n0\u000E\u0018\u00010\u0004j\u0004\u0018\u0001`\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017Ri\u0010\f\u001AQ\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000B8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR{\u0010\u0011\u001Ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\n0\u000E\u0018\u00010\u0004j\u0004\u0018\u0001`\u00108\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u001C\u0010\u0019\u001A\u0004\b\u001D\u0010\u001BRi\u0010\"\u001AQ\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001E\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004j\u0002`\u001F8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b \u0010\u0019\u001A\u0004\b!\u0010\u001B\u00A8\u0006#"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause0Impl;", "Lkotlinx/coroutines/selects/SelectClause0;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "a", "Ljava/lang/Object;", "getClauseObject", "()Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function3;", "getRegFunc", "()Lkotlin/jvm/functions/Function3;", "c", "getOnCancellationConstructor", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "d", "getProcessResFunc", "processResFunc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectClause0Impl implements SelectClause0 {
    public final Object a;
    public final Function3 b;
    public final Function3 c;
    public final Function3 d;

    public SelectClause0Impl(@NotNull Object object0, @NotNull Function3 function30, @Nullable Function3 function31) {
        this.a = object0;
        this.b = function30;
        this.c = function31;
        this.d = SelectKt.access$getDUMMY_PROCESS_RESULT_FUNCTION$p();
    }

    public SelectClause0Impl(Object object0, Function3 function30, Function3 function31, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            function31 = null;
        }
        this(object0, function30, function31);
    }

    @Override  // kotlinx.coroutines.selects.SelectClause
    @NotNull
    public Object getClauseObject() {
        return this.a;
    }

    @Override  // kotlinx.coroutines.selects.SelectClause
    @Nullable
    public Function3 getOnCancellationConstructor() {
        return this.c;
    }

    @Override  // kotlinx.coroutines.selects.SelectClause
    @NotNull
    public Function3 getProcessResFunc() {
        return this.d;
    }

    @Override  // kotlinx.coroutines.selects.SelectClause
    @NotNull
    public Function3 getRegFunc() {
        return this.b;
    }
}

