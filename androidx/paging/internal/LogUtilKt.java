package androidx.paging.internal;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.paging.LoadStates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY})
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A$\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"appendMediatorStatesIfNotNull", "", "mediatorStates", "Landroidx/paging/LoadStates;", "log", "Lkotlin/Function0;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LogUtilKt {
    @NotNull
    public static final String appendMediatorStatesIfNotNull(@Nullable LoadStates loadStates0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "log");
        String s = (String)function00.invoke();
        if(loadStates0 != null) {
            s = s + "|   mediatorLoadStates: " + loadStates0 + '\n';
        }
        return k.trimMargin$default((s + "|)"), null, 1, null);
    }
}

