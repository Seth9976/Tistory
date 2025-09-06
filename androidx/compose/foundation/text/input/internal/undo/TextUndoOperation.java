package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u00010BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001A\u0004\b\u0019\u0010\u0017R\u001D\u0010\b\u001A\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u001D\u0010\t\u001A\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001E\u0010\u001B\u001A\u0004\b\u001F\u0010\u001DR\u0017\u0010\u000B\u001A\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010\u001B\u001A\u0004\b!\u0010\u001DR\u0017\u0010\r\u001A\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0017\u0010+\u001A\u00020&8\u0006¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u0011\u0010/\u001A\u00020,8F¢\u0006\u0006\u001A\u0004\b-\u0010.\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "", "index", "", "preText", "postText", "Landroidx/compose/ui/text/TextRange;", "preSelection", "postSelection", "", "timeInMillis", "", "canMerge", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "I", "getIndex", "()I", "b", "Ljava/lang/String;", "getPreText", "()Ljava/lang/String;", "c", "getPostText", "d", "J", "getPreSelection-d9O1mEE", "()J", "e", "getPostSelection-d9O1mEE", "f", "getTimeInMillis", "g", "Z", "getCanMerge", "()Z", "Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "h", "Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "getTextEditType", "()Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "textEditType", "Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "getDeletionType", "()Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "deletionType", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextUndoOperation {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return TextUndoOperation.i;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final TextEditType h;
    public static final TextUndoOperation.Companion.Saver.1 i;

    static {
        TextUndoOperation.Companion = new Companion(null);
        TextUndoOperation.i = new TextUndoOperation.Companion.Saver.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public TextUndoOperation(int v, String s, String s1, long v1, long v2, long v3, boolean z, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, s, s1, v1, v2, ((v4 & 0x20) == 0 ? v3 : 1757116920702L), ((v4 & 0x40) == 0 ? z : true), null);
    }

    public TextUndoOperation(int v, String s, String s1, long v1, long v2, long v3, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        TextEditType textEditType0;
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = z;
        if(s.length() == 0 && s1.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if(s.length() != 0 || s1.length() <= 0) {
            textEditType0 = s.length() <= 0 || s1.length() != 0 ? TextEditType.Replace : TextEditType.Delete;
        }
        else {
            textEditType0 = TextEditType.Insert;
        }
        this.h = textEditType0;
    }

    public final boolean getCanMerge() {
        return this.g;
    }

    @NotNull
    public final TextDeleteType getDeletionType() {
        if(this.h != TextEditType.Delete) {
            return TextDeleteType.NotByUser;
        }
        long v = this.e;
        if(!TextRange.getCollapsed-impl(v)) {
            return TextDeleteType.NotByUser;
        }
        long v1 = this.d;
        if(TextRange.getCollapsed-impl(v1)) {
            return TextRange.getStart-impl(v1) <= TextRange.getStart-impl(v) ? TextDeleteType.End : TextDeleteType.Start;
        }
        return TextRange.getStart-impl(v1) != TextRange.getStart-impl(v) || TextRange.getStart-impl(v1) != this.a ? TextDeleteType.NotByUser : TextDeleteType.Inner;
    }

    public final int getIndex() {
        return this.a;
    }

    public final long getPostSelection-d9O1mEE() {
        return this.e;
    }

    @NotNull
    public final String getPostText() {
        return this.c;
    }

    public final long getPreSelection-d9O1mEE() {
        return this.d;
    }

    @NotNull
    public final String getPreText() {
        return this.b;
    }

    @NotNull
    public final TextEditType getTextEditType() {
        return this.h;
    }

    public final long getTimeInMillis() {
        return this.f;
    }
}

