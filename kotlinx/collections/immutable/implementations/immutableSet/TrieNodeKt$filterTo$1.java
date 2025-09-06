package kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n*L\n1#1,790:1\n*E\n"})
public final class TrieNodeKt.filterTo.1 extends Lambda implements Function1 {
    public static final TrieNodeKt.filterTo.1 INSTANCE;

    static {
        TrieNodeKt.filterTo.1.INSTANCE = new TrieNodeKt.filterTo.1();
    }

    public TrieNodeKt.filterTo.1() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(@Nullable Object object0) {
        return object0 == TrieNode.Companion.getEMPTY$kotlinx_collections_immutable() ? false : true;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

