package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R \u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocal;", "T", "", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getDefaultFactory$ui_release", "()Lkotlin/jvm/functions/Function0;", "defaultFactory", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ModifierLocal {
    public static final int $stable;
    public final Function0 a;

    public ModifierLocal(Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = function00;
    }

    @NotNull
    public final Function0 getDefaultFactory$ui_release() {
        return this.a;
    }
}

