package androidx.compose.material3.internal;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u001E\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u0017\u001A\u0004\b\u001D\u0010\t¨\u0006\u001F"}, d2 = {"Landroidx/compose/material3/internal/DateInputFormat;", "", "", "patternWithDelimiters", "", "delimiter", "<init>", "(Ljava/lang/String;C)V", "component1", "()Ljava/lang/String;", "component2", "()C", "copy", "(Ljava/lang/String;C)Landroidx/compose/material3/internal/DateInputFormat;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPatternWithDelimiters", "b", "C", "getDelimiter", "c", "getPatternWithoutDelimiters", "patternWithoutDelimiters", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DateInputFormat {
    public static final int $stable;
    public final String a;
    public final char b;
    public final String c;

    public DateInputFormat(@NotNull String s, char c) {
        this.a = s;
        this.b = c;
        this.c = p.replace$default(s, String.valueOf(c), "", false, 4, null);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final char component2() {
        return this.b;
    }

    @NotNull
    public final DateInputFormat copy(@NotNull String s, char c) {
        return new DateInputFormat(s, c);
    }

    public static DateInputFormat copy$default(DateInputFormat dateInputFormat0, String s, char c, int v, Object object0) {
        if((v & 1) != 0) {
            s = dateInputFormat0.a;
        }
        if((v & 2) != 0) {
            c = dateInputFormat0.b;
        }
        return dateInputFormat0.copy(s, c);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DateInputFormat)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((DateInputFormat)object0).a) ? this.b == ((DateInputFormat)object0).b : false;
    }

    public final char getDelimiter() {
        return this.b;
    }

    @NotNull
    public final String getPatternWithDelimiters() {
        return this.a;
    }

    @NotNull
    public final String getPatternWithoutDelimiters() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Character.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}

