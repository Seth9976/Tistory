package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h1.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A?\u0010\t\u001A\u00020\b2\u001C\u0010\u0004\u001A\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\"\u001F\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000B8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "SaveableStateRegistry", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalSaveableStateRegistry", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SaveableStateRegistryKt {
    public static final ProvidableCompositionLocal a;

    static {
        SaveableStateRegistryKt.a = CompositionLocalKt.staticCompositionLocalOf(g.y);
    }

    @NotNull
    public static final SaveableStateRegistry SaveableStateRegistry(@Nullable Map map0, @NotNull Function1 function10) {
        return new b(map0, function10);
    }

    public static final boolean access$fastIsBlank(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1 = 0;
        while(v1 < v) {
            if(kotlin.text.b.isWhitespace(charSequence0.charAt(v1))) {
                ++v1;
                continue;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalSaveableStateRegistry() {
        return SaveableStateRegistryKt.a;
    }
}

