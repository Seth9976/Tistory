package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/GenericFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "", "name", "fontFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "g", "Ljava/lang/String;", "getName", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class GenericFontFamily extends SystemFontFamily {
    public static final int $stable;
    public final String g;
    public final String h;

    public GenericFontFamily(@NotNull String s, @NotNull String s1) {
        super(null);
        this.g = s;
        this.h = s1;
    }

    @NotNull
    public final String getName() {
        return this.g;
    }

    @Override
    @NotNull
    public String toString() {
        return this.h;
    }
}

