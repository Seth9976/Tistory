package androidx.compose.ui.text.android;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.CharacterIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000F\u0010\u000E\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000E\u0010\fJ\u0010\u0010\u000F\u001A\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\fJ\u000F\u0010\u0010\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/lang/Object;", "Ljava/text/CharacterIterator;", "", "charSequence", "", "start", "end", "<init>", "(Ljava/lang/CharSequence;II)V", "", "first", "()C", "last", "current", "next", "previous", "position", "setIndex", "(I)C", "getBeginIndex", "()I", "getEndIndex", "getIndex", "", "clone", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public static final int $stable = 8;
    public final CharSequence a;
    public final int b;
    public final int c;
    public int d;

    public CharSequenceCharacterIterator(@NotNull CharSequence charSequence0, int v, int v1) {
        this.a = charSequence0;
        this.b = v;
        this.c = v1;
        this.d = v;
    }

    @Override
    @NotNull
    public Object clone() {
        try {
            return super.clone();
        }
        catch(CloneNotSupportedException unused_ex) {
            throw new InternalError();
        }
    }

    @Override
    public char current() {
        return this.d == this.c ? '\uFFFF' : this.a.charAt(this.d);
    }

    @Override
    public char first() {
        this.d = this.b;
        return this.current();
    }

    @Override
    public int getBeginIndex() {
        return this.b;
    }

    @Override
    public int getEndIndex() {
        return this.c;
    }

    @Override
    public int getIndex() {
        return this.d;
    }

    @Override
    public char last() {
        int v = this.c;
        if(this.b == v) {
            this.d = v;
            return '\uFFFF';
        }
        this.d = v - 1;
        return this.a.charAt(v - 1);
    }

    @Override
    public char next() {
        int v = this.d + 1;
        this.d = v;
        int v1 = this.c;
        if(v >= v1) {
            this.d = v1;
            return '\uFFFF';
        }
        return this.a.charAt(v);
    }

    @Override
    public char previous() {
        int v = this.d;
        if(v <= this.b) {
            return '\uFFFF';
        }
        this.d = v - 1;
        return this.a.charAt(v - 1);
    }

    @Override
    public char setIndex(int v) {
        if(v > this.c || this.b > v) {
            throw new IllegalArgumentException("invalid position");
        }
        this.d = v;
        return this.current();
    }
}

