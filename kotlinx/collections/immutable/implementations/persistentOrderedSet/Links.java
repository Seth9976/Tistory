package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import kotlin.Metadata;
import kotlinx.collections.immutable.internal.EndOfChain;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001B\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\t\u001A\u00020\u00002\b\u0010\b\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001A\u00020\u00002\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000E\u001A\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0016\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001A\u00020\u00138F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "newNext", "withNext", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "newPrevious", "withPrevious", "a", "Ljava/lang/Object;", "getPrevious", "()Ljava/lang/Object;", "b", "getNext", "", "getHasNext", "()Z", "hasNext", "getHasPrevious", "hasPrevious", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Links {
    public final Object a;
    public final Object b;

    public Links() {
        this(EndOfChain.INSTANCE, EndOfChain.INSTANCE);
    }

    public Links(@Nullable Object object0) {
        this(object0, EndOfChain.INSTANCE);
    }

    public Links(@Nullable Object object0, @Nullable Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public final boolean getHasNext() {
        return this.b != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.a != EndOfChain.INSTANCE;
    }

    @Nullable
    public final Object getNext() {
        return this.b;
    }

    @Nullable
    public final Object getPrevious() {
        return this.a;
    }

    @NotNull
    public final Links withNext(@Nullable Object object0) {
        return new Links(this.a, object0);
    }

    @NotNull
    public final Links withPrevious(@Nullable Object object0) {
        return new Links(object0, this.b);
    }
}

