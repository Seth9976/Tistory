package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001A,\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0000¨\u0006\t"}, d2 = {"toCharArray", "", "", "destination", "", "destinationOffset", "", "startIndex", "endIndex", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ToCharArray_androidKt {
    public static final void toCharArray(@NotNull CharSequence charSequence0, @NotNull char[] arr_c, int v, int v1, int v2) {
        if(charSequence0 instanceof TextFieldCharSequence) {
            ((TextFieldCharSequence)charSequence0).toCharArray(arr_c, v, v1, v2);
            return;
        }
        while(v1 < v2) {
            arr_c[v] = charSequence0.charAt(v1);
            ++v1;
            ++v;
        }
    }
}

