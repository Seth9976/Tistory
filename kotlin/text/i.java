package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class i {
    @NotNull
    public static final Appendable append(@NotNull Appendable appendable0, @NotNull CharSequence[] arr_charSequence) {
        Intrinsics.checkNotNullParameter(appendable0, "<this>");
        Intrinsics.checkNotNullParameter(arr_charSequence, "value");
        for(int v = 0; v < arr_charSequence.length; ++v) {
            appendable0.append(arr_charSequence[v]);
        }
        return appendable0;
    }

    public static void appendElement(@NotNull Appendable appendable0, Object object0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(appendable0, "<this>");
        if(function10 != null) {
            appendable0.append(((CharSequence)function10.invoke(object0)));
            return;
        }
        if((object0 == null ? true : object0 instanceof CharSequence)) {
            appendable0.append(((CharSequence)object0));
            return;
        }
        if(object0 instanceof Character) {
            appendable0.append(((Character)object0).charValue());
            return;
        }
        appendable0.append(String.valueOf(object0));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final Appendable appendRange(@NotNull Appendable appendable0, @NotNull CharSequence charSequence0, int v, int v1) {
        Intrinsics.checkNotNullParameter(appendable0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "value");
        Appendable appendable1 = appendable0.append(charSequence0, v, v1);
        Intrinsics.checkNotNull(appendable1, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return appendable1;
    }
}

