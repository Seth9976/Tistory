package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\r\u001A\u0004\u0018\u00010\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000ER#\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/autofill/AutofillTree;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "", "plusAssign", "(Landroidx/compose/ui/autofill/AutofillNode;)V", "", "id", "", "value", "performAutofill", "(ILjava/lang/String;)Lkotlin/Unit;", "", "a", "Ljava/util/Map;", "getChildren", "()Ljava/util/Map;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AutofillTree {
    public static final int $stable = 8;
    public final LinkedHashMap a;

    public AutofillTree() {
        this.a = new LinkedHashMap();
    }

    @NotNull
    public final Map getChildren() {
        return this.a;
    }

    @Nullable
    public final Unit performAutofill(int v, @NotNull String s) {
        AutofillNode autofillNode0 = (AutofillNode)this.a.get(v);
        if(autofillNode0 != null) {
            Function1 function10 = autofillNode0.getOnFill();
            if(function10 != null) {
                function10.invoke(s);
                return Unit.INSTANCE;
            }
        }
        return null;
    }

    public final void plusAssign(@NotNull AutofillNode autofillNode0) {
        this.a.put(autofillNode0.getId(), autofillNode0);
    }
}

