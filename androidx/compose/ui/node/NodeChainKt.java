package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import b2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001A\u001F\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "prev", "next", "", "actionForModifiers", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,843:1\n1188#2:844\n1#3:845\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n824#1:844\n*E\n"})
public final class NodeChainKt {
    public static final NodeChainKt.SentinelHead.1 a;

    static {
        NodeChainKt.SentinelHead.1 nodeChainKt$SentinelHead$10 = new NodeChainKt.SentinelHead.1();  // 初始化器: Landroidx/compose/ui/Modifier$Node;-><init>()V
        nodeChainKt$SentinelHead$10.setAggregateChildKindSet$ui_release(-1);
        NodeChainKt.a = nodeChainKt$SentinelHead$10;
    }

    public static final MutableVector access$fillVector(Modifier modifier0, MutableVector mutableVector0) {
        MutableVector mutableVector1 = new MutableVector(new Modifier[c.coerceAtLeast(mutableVector0.getSize(), 16)], 0);
        mutableVector1.add(modifier0);
        n n0 = null;
        while(mutableVector1.isNotEmpty()) {
            Modifier modifier1 = (Modifier)q.j(mutableVector1, 1);
            if(modifier1 instanceof CombinedModifier) {
                mutableVector1.add(((CombinedModifier)modifier1).getInner$ui_release());
                mutableVector1.add(((CombinedModifier)modifier1).getOuter$ui_release());
            }
            else if(modifier1 instanceof Element) {
                mutableVector0.add(modifier1);
            }
            else {
                if(n0 == null) {
                    n0 = new n(mutableVector0);
                }
                modifier1.all(n0);
            }
        }
        return mutableVector0;
    }

    public static final void access$updateUnsafe(ModifierNodeElement modifierNodeElement0, Node modifier$Node0) {
        Intrinsics.checkNotNull(modifier$Node0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement0.update(modifier$Node0);
    }

    public static final int actionForModifiers(@NotNull Element modifier$Element0, @NotNull Element modifier$Element1) {
        if(Intrinsics.areEqual(modifier$Element0, modifier$Element1)) {
            return 2;
        }
        return Actual_jvmKt.areObjectsOfSameType(modifier$Element0, modifier$Element1) ? 1 : 0;
    }
}

