package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u00B5\u0001\u0012\u001B\b\u0002\u0010\u0006\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u0005\u0012\u001B\b\u0002\u0010\u0007\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u0005\u0012\u001B\b\u0002\u0010\b\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u0005\u0012\u001B\b\u0002\u0010\t\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u0005\u0012\u001B\b\u0002\u0010\n\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u0005\u0012\u001B\b\u0002\u0010\u000B\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0006\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0019\u0010\u0016\u001A\u0004\b\u001A\u0010\u0018R*\u0010\b\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u00058\u0006\u00A2\u0006\f\n\u0004\b\u001B\u0010\u0016\u001A\u0004\b\u001C\u0010\u0018R*\u0010\t\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u00058\u0006\u00A2\u0006\f\n\u0004\b\u001D\u0010\u0016\u001A\u0004\b\u001E\u0010\u0018R*\u0010\n\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u00058\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010\u0016\u001A\u0004\b \u0010\u0018R*\u0010\u000B\u001A\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u00A2\u0006\u0002\b\u00058\u0006\u00A2\u0006\f\n\u0004\b!\u0010\u0016\u001A\u0004\b\"\u0010\u0018\u00A8\u0006$"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "", "Lkotlin/ExtensionFunctionType;", "onDone", "onGo", "onNext", "onPrevious", "onSearch", "onSend", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lkotlin/jvm/functions/Function1;", "getOnDone", "()Lkotlin/jvm/functions/Function1;", "b", "getOnGo", "c", "getOnNext", "d", "getOnPrevious", "e", "getOnSearch", "f", "getOnSend", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KeyboardActions {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActions$Companion;", "", "Landroidx/compose/foundation/text/KeyboardActions;", "Default", "Landroidx/compose/foundation/text/KeyboardActions;", "getDefault", "()Landroidx/compose/foundation/text/KeyboardActions;", "getDefault$annotations", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KeyboardActions getDefault() {
            return KeyboardActions.g;
        }

        @Stable
        public static void getDefault$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public static final KeyboardActions g;

    static {
        KeyboardActions.Companion = new Companion(null);
        KeyboardActions.g = new KeyboardActions(null, null, null, null, null, null, 0x3F, null);
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 0x3F, null);
    }

    public KeyboardActions(@Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function1 function12, @Nullable Function1 function13, @Nullable Function1 function14, @Nullable Function1 function15) {
        this.a = function10;
        this.b = function11;
        this.c = function12;
        this.d = function13;
        this.e = function14;
        this.f = function15;
    }

    public KeyboardActions(Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? function10 : null), ((v & 2) == 0 ? function11 : null), ((v & 4) == 0 ? function12 : null), ((v & 8) == 0 ? function13 : null), ((v & 16) == 0 ? function14 : null), ((v & 0x20) == 0 ? function15 : null));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof KeyboardActions ? this.a == ((KeyboardActions)object0).a && this.b == ((KeyboardActions)object0).b && this.c == ((KeyboardActions)object0).c && this.d == ((KeyboardActions)object0).d && this.e == ((KeyboardActions)object0).e && this.f == ((KeyboardActions)object0).f : false;
    }

    @Nullable
    public final Function1 getOnDone() {
        return this.a;
    }

    @Nullable
    public final Function1 getOnGo() {
        return this.b;
    }

    @Nullable
    public final Function1 getOnNext() {
        return this.c;
    }

    @Nullable
    public final Function1 getOnPrevious() {
        return this.d;
    }

    @Nullable
    public final Function1 getOnSearch() {
        return this.e;
    }

    @Nullable
    public final Function1 getOnSend() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        Function1 function10 = this.f;
        if(function10 != null) {
            v = function10.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }
}

