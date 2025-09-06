package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\f\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\f\u0010\u000BJ\u0015\u0010\u000E\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u0007¢\u0006\u0004\b\u000E\u0010\u000BJ\r\u0010\u000F\u001A\u00020\t¢\u0006\u0004\b\u000F\u0010\u0003¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "<init>", "()V", "", "isNotEmpty", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "onNodePositioned", "(Landroidx/compose/ui/node/LayoutNode;)V", "remove", "rootNode", "onRootNodePositioned", "dispatch", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,98:1\n1208#2:99\n1187#2,2:100\n728#3,2:102\n728#3,2:104\n523#3:106\n460#3,11:108\n203#4:107\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:99\n26#1:100,2\n32#1:102,2\n42#1:104,2\n61#1:106\n79#1:108,11\n79#1:107\n*E\n"})
public final class OnPositionedDispatcher {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion;", "", "", "MinArraySize", "I", "androidx/compose/ui/node/c0", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableVector a;
    public LayoutNode[] b;

    static {
        OnPositionedDispatcher.Companion = new Companion(null);
        OnPositionedDispatcher.$stable = 8;
    }

    public OnPositionedDispatcher() {
        this.a = new MutableVector(new LayoutNode[16], 0);
    }

    public static void a(LayoutNode layoutNode0) {
        layoutNode0.dispatchOnPositionedCallbacks$ui_release();
        int v = 0;
        layoutNode0.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                OnPositionedDispatcher.a(((LayoutNode)arr_object[v]));
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
    }

    public final void dispatch() {
        MutableVector mutableVector0 = this.a;
        mutableVector0.sortWith(c0.a);
        int v = mutableVector0.getSize();
        LayoutNode[] arr_layoutNode = this.b != null && this.b.length >= v ? this.b : new LayoutNode[Math.max(16, mutableVector0.getSize())];
        this.b = null;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_layoutNode[v1] = mutableVector0.getContent()[v1];
        }
        mutableVector0.clear();
        for(int v2 = v - 1; -1 < v2; --v2) {
            LayoutNode layoutNode0 = arr_layoutNode[v2];
            Intrinsics.checkNotNull(layoutNode0);
            if(layoutNode0.getNeedsOnPositionedDispatch$ui_release()) {
                OnPositionedDispatcher.a(layoutNode0);
            }
        }
        this.b = arr_layoutNode;
    }

    public final boolean isNotEmpty() {
        return this.a.isNotEmpty();
    }

    public final void onNodePositioned(@NotNull LayoutNode layoutNode0) {
        this.a.add(layoutNode0);
        layoutNode0.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(@NotNull LayoutNode layoutNode0) {
        this.a.clear();
        this.a.add(layoutNode0);
        layoutNode0.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void remove(@NotNull LayoutNode layoutNode0) {
        this.a.remove(layoutNode0);
    }
}

