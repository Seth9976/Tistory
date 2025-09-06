package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import kotlin.Metadata;
import kotlinx.collections.immutable.internal.EndOfChain;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0004\b\u0006\u0010\bB\u001B\b\u0016\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001B\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000E\u0010\fJ\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u000F\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\fR\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001A\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001A\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001C\u001A\u00020\u00198F¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u0011\u0010\u001E\u001A\u00020\u00198F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001B¨\u0006\u001F"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "V", "", "value", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "withValue", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "newPrevious", "withPrevious", "newNext", "withNext", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "getPrevious", "c", "getNext", "", "getHasNext", "()Z", "hasNext", "getHasPrevious", "hasPrevious", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LinkedValue {
    public final Object a;
    public final Object b;
    public final Object c;

    public LinkedValue(Object object0) {
        this(object0, EndOfChain.INSTANCE, EndOfChain.INSTANCE);
    }

    public LinkedValue(Object object0, @Nullable Object object1) {
        this(object0, object1, EndOfChain.INSTANCE);
    }

    public LinkedValue(Object object0, @Nullable Object object1, @Nullable Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
    }

    public final boolean getHasNext() {
        return this.c != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.b != EndOfChain.INSTANCE;
    }

    @Nullable
    public final Object getNext() {
        return this.c;
    }

    @Nullable
    public final Object getPrevious() {
        return this.b;
    }

    public final Object getValue() {
        return this.a;
    }

    @NotNull
    public final LinkedValue withNext(@Nullable Object object0) {
        return new LinkedValue(this.a, this.b, object0);
    }

    @NotNull
    public final LinkedValue withPrevious(@Nullable Object object0) {
        return new LinkedValue(this.a, object0, this.c);
    }

    @NotNull
    public final LinkedValue withValue(Object object0) {
        return new LinkedValue(object0, this.b, this.c);
    }
}

