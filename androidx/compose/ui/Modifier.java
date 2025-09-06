package androidx.compose.ui;

import androidx.compose.foundation.layout.b4;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J\u001C\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001C\u0010\u0007\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J5\u0010\b\u001A\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001A\u0002H\t2\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ5\u0010\u000E\u001A\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001A\u0002H\t2\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "Companion", "Element", "Node", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Modifier {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\u0007\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00028\u00002\u0018\u0010\u0006\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00028\u00002\u0018\u0010\u0006\u001A\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001A\u00020\u000B2\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000B0\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ#\u0010\u000F\u001A\u00020\u000B2\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000B0\nH\u0016¢\u0006\u0004\b\u000F\u0010\u000EJ\u0018\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "other", "then", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion implements Modifier {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.compose.ui.Modifier
        public boolean all(@NotNull Function1 function10) {
            return true;
        }

        @Override  // androidx.compose.ui.Modifier
        public boolean any(@NotNull Function1 function10) {
            return false;
        }

        @Override  // androidx.compose.ui.Modifier
        public Object foldIn(Object object0, @NotNull Function2 function20) {
            return object0;
        }

        @Override  // androidx.compose.ui.Modifier
        public Object foldOut(Object object0, @NotNull Function2 function20) {
            return object0;
        }

        @Override  // androidx.compose.ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier modifier0) [...] // Inlined contents

        @Override
        @NotNull
        public String toString() {
            return "Modifier";
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Modifier then(@NotNull Modifier modifier0, @NotNull Modifier modifier1) {
            return modifier0.super.then(modifier1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001C\u0010\u0006\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J5\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001A\u0002H\b2\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b0\u000BH\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001A\u0002H\b2\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u000BH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "all", "", "predicate", "Lkotlin/Function1;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Element extends Modifier {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.Modifier.Element.DefaultImpls {
            @Deprecated
            public static boolean all(@NotNull Element modifier$Element0, @NotNull Function1 function10) {
                return modifier$Element0.super.all(function10);
            }

            @Deprecated
            public static boolean any(@NotNull Element modifier$Element0, @NotNull Function1 function10) {
                return modifier$Element0.super.any(function10);
            }

            @Deprecated
            public static Object foldIn(@NotNull Element modifier$Element0, Object object0, @NotNull Function2 function20) {
                return modifier$Element0.super.foldIn(object0, function20);
            }

            @Deprecated
            public static Object foldOut(@NotNull Element modifier$Element0, Object object0, @NotNull Function2 function20) {
                return modifier$Element0.super.foldOut(object0, function20);
            }

            @Deprecated
            @NotNull
            public static Modifier then(@NotNull Element modifier$Element0, @NotNull Modifier modifier0) {
                return modifier$Element0.super.then(modifier0);
            }
        }

        @Override  // androidx.compose.ui.Modifier
        default boolean all(@NotNull Function1 function10) {
            return ((Boolean)function10.invoke(this)).booleanValue();
        }

        @Override  // androidx.compose.ui.Modifier
        default boolean any(@NotNull Function1 function10) {
            return ((Boolean)function10.invoke(this)).booleanValue();
        }

        @Override  // androidx.compose.ui.Modifier
        default Object foldIn(Object object0, @NotNull Function2 function20) {
            return function20.invoke(object0, this);
        }

        @Override  // androidx.compose.ui.Modifier
        default Object foldOut(Object object0, @NotNull Function2 function20) {
            return function20.invoke(this, object0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\b\'\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0010\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000F\u001A\u00020\f2\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\nH\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0011\u001A\u00020\u0006H\u0010\u00A2\u0006\u0004\b\u0010\u0010\u0003J\u000F\u0010\u0013\u001A\u00020\u0006H\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0003J\u000F\u0010\u0015\u001A\u00020\u0006H\u0010\u00A2\u0006\u0004\b\u0014\u0010\u0003J\u000F\u0010\u0017\u001A\u00020\u0006H\u0010\u00A2\u0006\u0004\b\u0016\u0010\u0003J\u000F\u0010\u0019\u001A\u00020\u0006H\u0010\u00A2\u0006\u0004\b\u0018\u0010\u0003J\u000F\u0010\u001A\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u0003J\u000F\u0010\u001B\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u0003J\u000F\u0010\u001C\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u0003J\u001D\u0010\u001F\u001A\u00020\u00062\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00060\u001DH\u0007\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010$\u001A\u00020\u00062\u0006\u0010!\u001A\u00020\u0000H\u0010\u00A2\u0006\u0004\b\"\u0010#R*\u0010+\u001A\u00020\u00002\u0006\u0010%\u001A\u00020\u00008\u0006@BX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b&\u0010\'\u0012\u0004\b*\u0010\u0003\u001A\u0004\b(\u0010)R\"\u00103\u001A\u00020,8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001A\u00020,8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b4\u0010.\u001A\u0004\b5\u00100\"\u0004\b6\u00102R$\u0010;\u001A\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b8\u0010\'\u001A\u0004\b9\u0010)\"\u0004\b:\u0010#R$\u0010?\u001A\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b<\u0010\'\u001A\u0004\b=\u0010)\"\u0004\b>\u0010#R$\u0010G\u001A\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\u0010%\u001A\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\"\u0010R\u001A\u00020\f8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bL\u0010M\u001A\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001A\u00020\f8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bS\u0010M\u001A\u0004\bT\u0010O\"\u0004\bU\u0010QR$\u0010X\u001A\u00020\f2\u0006\u0010%\u001A\u00020\f8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bW\u0010M\u001A\u0004\bX\u0010OR\u0011\u0010\\\u001A\u00020Y8F\u00A2\u0006\u0006\u001A\u0004\bZ\u0010[R\u001A\u0010_\u001A\u00020\f8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\b^\u0010\u0003\u001A\u0004\b]\u0010O\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006`"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "Landroidx/compose/ui/node/NodeKind;", "kind", "", "isKind-H91voCI$ui_release", "(I)Z", "isKind", "markAsAttached$ui_release", "markAsAttached", "runAttachLifecycle$ui_release", "runAttachLifecycle", "runDetachLifecycle$ui_release", "runDetachLifecycle", "markAsDetached$ui_release", "markAsDetached", "reset$ui_release", "reset", "onAttach", "onDetach", "onReset", "Lkotlin/Function0;", "effect", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", "owner", "setAsDelegateTo$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "setAsDelegateTo", "<set-?>", "a", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "getNode$annotations", "node", "", "c", "I", "getKindSet$ui_release", "()I", "setKindSet$ui_release", "(I)V", "kindSet", "d", "getAggregateChildKindSet$ui_release", "setAggregateChildKindSet$ui_release", "aggregateChildKindSet", "e", "getParent$ui_release", "setParent$ui_release", "parent", "f", "getChild$ui_release", "setChild$ui_release", "child", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "g", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "ownerScope", "h", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "i", "Z", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "j", "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "updatedNodeAwaitingAttachForInvalidation", "m", "isAttached", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "getShouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,429:1\n42#2,7:430\n42#2,7:437\n42#2,7:444\n42#2,7:451\n42#2,7:458\n42#2,7:465\n42#2,7:472\n42#2,7:479\n42#2,7:486\n42#2,7:493\n42#2,7:500\n*S KotlinDebug\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n267#1:430,7\n268#1:437,7\n276#1:444,7\n279#1:451,7\n288#1:458,7\n289#1:465,7\n292#1:472,7\n301#1:479,7\n302#1:486,7\n305#1:493,7\n317#1:500,7\n*E\n"})
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        public Node a;
        public CoroutineScope b;
        public int c;
        public int d;
        public Node e;
        public Node f;
        public ObserverNodeOwnerScope g;
        public NodeCoordinator h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;

        public Node() {
            this.a = this;
            this.d = -1;
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.d;
        }

        @Nullable
        public final Node getChild$ui_release() {
            return this.f;
        }

        @Nullable
        public final NodeCoordinator getCoordinator$ui_release() {
            return this.h;
        }

        @NotNull
        public final CoroutineScope getCoroutineScope() {
            CoroutineScope coroutineScope0 = this.b;
            if(coroutineScope0 == null) {
                coroutineScope0 = CoroutineScopeKt.CoroutineScope(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(JobKt.Job(((Job)DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(Job.Key)))));
                this.b = coroutineScope0;
            }
            return coroutineScope0;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.i;
        }

        public final int getKindSet$ui_release() {
            return this.c;
        }

        @Override  // androidx.compose.ui.node.DelegatableNode
        @NotNull
        public final Node getNode() {
            return this.a;
        }

        public static void getNode$annotations() {
        }

        @Nullable
        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.g;
        }

        @Nullable
        public final Node getParent$ui_release() {
            return this.e;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public static void getShouldAutoInvalidate$annotations() {
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.j;
        }

        public final boolean isAttached() {
            return this.m;
        }

        public final boolean isKind-H91voCI$ui_release(int v) {
            return (v & this.getKindSet$ui_release()) != 0;
        }

        public void markAsAttached$ui_release() {
            if(this.m) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if(this.h == null) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.m = true;
            this.k = true;
        }

        public void markAsDetached$ui_release() {
            if(!this.m) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if(this.k) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if(this.l) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.m = false;
            CoroutineScope coroutineScope0 = this.b;
            if(coroutineScope0 != null) {
                CoroutineScopeKt.cancel(coroutineScope0, new b4("The Modifier.Node was detached", 1));
                this.b = null;
            }
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui_release() {
            if(!this.m) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            this.onReset();
        }

        public void runAttachLifecycle$ui_release() {
            if(!this.m) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if(!this.k) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.k = false;
            this.onAttach();
            this.l = true;
        }

        public void runDetachLifecycle$ui_release() {
            if(!this.m) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if(this.h == null) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if(!this.l) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.l = false;
            this.onDetach();
        }

        public final void setAggregateChildKindSet$ui_release(int v) {
            this.d = v;
        }

        public void setAsDelegateTo$ui_release(@NotNull Node modifier$Node0) {
            this.a = modifier$Node0;
        }

        public final void setChild$ui_release(@Nullable Node modifier$Node0) {
            this.f = modifier$Node0;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.i = z;
        }

        public final void setKindSet$ui_release(int v) {
            this.c = v;
        }

        public final void setOwnerScope$ui_release(@Nullable ObserverNodeOwnerScope observerNodeOwnerScope0) {
            this.g = observerNodeOwnerScope0;
        }

        public final void setParent$ui_release(@Nullable Node modifier$Node0) {
            this.e = modifier$Node0;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.j = z;
        }

        @ExperimentalComposeUiApi
        public final void sideEffect(@NotNull Function0 function00) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(function00);
        }

        public void updateCoordinator$ui_release(@Nullable NodeCoordinator nodeCoordinator0) {
            this.h = nodeCoordinator0;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        Modifier.Companion = Companion.a;
    }

    boolean all(@NotNull Function1 arg1);

    boolean any(@NotNull Function1 arg1);

    Object foldIn(Object arg1, @NotNull Function2 arg2);

    Object foldOut(Object arg1, @NotNull Function2 arg2);

    @NotNull
    default Modifier then(@NotNull Modifier modifier0) {
        return modifier0 == Modifier.Companion ? this : new CombinedModifier(this, modifier0);
    }
}

