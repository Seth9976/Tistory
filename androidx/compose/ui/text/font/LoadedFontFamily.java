package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "typeface", "<init>", "(Landroidx/compose/ui/text/font/Typeface;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "g", "Landroidx/compose/ui/text/font/Typeface;", "getTypeface", "()Landroidx/compose/ui/text/font/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LoadedFontFamily extends FontFamily {
    public static final int $stable;
    public final Typeface g;

    public LoadedFontFamily(@NotNull Typeface typeface0) {
        super(true, null);
        this.g = typeface0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LoadedFontFamily ? Intrinsics.areEqual(this.g, ((LoadedFontFamily)object0).g) : false;
    }

    @NotNull
    public final Typeface getTypeface() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return this.g.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.g + ')';
    }
}

