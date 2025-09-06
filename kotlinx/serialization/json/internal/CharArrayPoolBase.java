package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\u0006H\u0004¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "", "<init>", "()V", "", "size", "", "take", "(I)[C", "array", "", "releaseImpl", "([C)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public class CharArrayPoolBase {
    public final ArrayDeque a;
    public int b;

    public CharArrayPoolBase() {
        this.a = new ArrayDeque();
    }

    public final void releaseImpl(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "array");
        synchronized(this) {
            if(this.b + arr_c.length < 0x200000) {
                this.b += arr_c.length;
                this.a.addLast(arr_c);
            }
        }
    }

    @NotNull
    public final char[] take(int v) {
        char[] arr_c;
        synchronized(this) {
            arr_c = (char[])this.a.removeLastOrNull();
            if(arr_c == null) {
                arr_c = null;
            }
            else {
                this.b -= arr_c.length;
            }
        }
        return arr_c == null ? new char[v] : arr_c;
    }
}

