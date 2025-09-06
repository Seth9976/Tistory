package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u00A8\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012U\u0010\r\u001AQ\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0005j\u0002`\f\u0012U\u0010\u0010\u001AQ\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u000F\u0012i\b\u0002\u0010\u0015\u001Ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000B0\u0012\u0018\u00010\u0005j\u0004\u0018\u0001`\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BRi\u0010\r\u001AQ\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0005j\u0002`\f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FRi\u0010\u0010\u001AQ\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u000F8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b \u0010\u001D\u001A\u0004\b!\u0010\u001FR{\u0010\u0015\u001Ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000B0\u0012\u0018\u00010\u0005j\u0004\u0018\u0001`\u00148\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\"\u0010\u001D\u001A\u0004\b#\u0010\u001F\u00A8\u0006$"}, d2 = {"Lkotlinx/coroutines/selects/SelectClause1Impl;", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "a", "Ljava/lang/Object;", "getClauseObject", "()Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function3;", "getRegFunc", "()Lkotlin/jvm/functions/Function3;", "c", "getProcessResFunc", "d", "getOnCancellationConstructor", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectClause1Impl implements SelectClause1 {
    public final Object a;
    public final Function3 b;
    public final Function3 c;
    public final Function3 d;

    public SelectClause1Impl(@NotNull Object object0, @NotNull Function3 function30, @NotNull Function3 function31, @Nullable Function3 function32) {
        this.a = object0;
        this.b = function30;
        this.c = function31;
        this.d = function32;
    }

    public SelectClause1Impl(Object object0, Function3 function30, Function3 function31, Function3 function32, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            function32 = null;
        }
        this(object0, function30, function31, function32);
    }

    @Override  // kotlinx.coroutines.selects.SelectClause
    @NotNull
    public Object getClauseObject() {
        return this.a;
    }

    @Override  // kotlinx.coroutines.selects.SelectClause
    @Nullable
    public Function3 getOnCancellationConstructor() {
        return this.d;
    }

    @Override  // kotlinx.coroutines.selects.SelectClause
    @NotNull
    public Function3 getProcessResFunc() {
        return this.c;
    }

    @Override  // kotlinx.coroutines.selects.SelectClause
    @NotNull
    public Function3 getRegFunc() {
        return this.b;
    }
}

