package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0081\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u0013¨\u0006\""}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "id", "<init>", "(J)V", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "oldState", "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "component1", "()J", "copy", "(J)Lkotlinx/coroutines/CoroutineId;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "getId", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@IgnoreJRERequirement
public final class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement {
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key {
        public Key(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Key Key;
    public final long b;

    static {
        CoroutineId.Key = new Key(null);
    }

    public CoroutineId(long v) {
        super(CoroutineId.Key);
        this.b = v;
    }

    public final long component1() {
        return this.b;
    }

    @NotNull
    public final CoroutineId copy(long v) {
        return new CoroutineId(v);
    }

    public static CoroutineId copy$default(CoroutineId coroutineId0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = coroutineId0.b;
        }
        return coroutineId0.copy(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof CoroutineId ? this.b == ((CoroutineId)object0).b : false;
    }

    public final long getId() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override  // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(CoroutineContext coroutineContext0, Object object0) {
        this.restoreThreadContext(coroutineContext0, ((String)object0));
    }

    public void restoreThreadContext(@NotNull CoroutineContext coroutineContext0, @NotNull String s) {
        Thread.currentThread().setName(s);
    }

    @Override
    @NotNull
    public String toString() {
        return "CoroutineId(" + this.b + ')';
    }

    @Override  // kotlinx.coroutines.ThreadContextElement
    public Object updateThreadContext(CoroutineContext coroutineContext0) {
        return this.updateThreadContext(coroutineContext0);
    }

    @NotNull
    public String updateThreadContext(@NotNull CoroutineContext coroutineContext0) {
        String s;
        CoroutineName coroutineName0 = (CoroutineName)coroutineContext0.get(CoroutineName.Key);
        if(coroutineName0 == null) {
            s = "coroutine";
        }
        else {
            s = coroutineName0.getName();
            if(s == null) {
                s = "coroutine";
            }
        }
        boolean z = StringsKt__StringsKt.lastIndexOf$default("jeb-dexdec-sb-st-1511", " @", 0, false, 6, null) >= 0;
        Intrinsics.checkNotNullExpressionValue("jeb-dexdec-sb-st-1511", "this as java.lang.String…ing(startIndex, endIndex)");
        String s1 = "jeb-dexdec-sb-st-1511 @" + s + '#' + this.b;
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder(capacity).…builderAction).toString()");
        Thread.currentThread().setName(s1);
        return "jeb-dexdec-sb-st-1511";
    }
}

