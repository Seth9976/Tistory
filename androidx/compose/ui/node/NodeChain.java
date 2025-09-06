package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ModifierInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001:\u0002XYB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u000B\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0000\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\fH\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0013\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001A\u00020\b\u00A2\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001A\u00020\b\u00A2\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001A\u00020\b\u00A2\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0012J\u000F\u0010\u001E\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u001D\u0010\u0012J?\u0010\'\u001A\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001F\u0018\u00012\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0\"H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J=\u0010*\u001A\u00020\b\"\u0006\b\u0000\u0010\u001F\u0018\u00012\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\"H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)J,\u0010*\u001A\u00020\b2\u0006\u0010,\u001A\u00020+2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b\u00A2\u0006\u0004\b.\u0010)J$\u0010*\u001A\u00020\b2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b\u00A2\u0006\u0004\b.\u0010/J$\u00101\u001A\u00020\b2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b\u00A2\u0006\u0004\b0\u0010/J=\u00103\u001A\u00020\b\"\u0006\b\u0000\u0010\u001F\u0018\u00012\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000 2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\"H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u0010)J,\u00103\u001A\u00020\b2\u0006\u0010,\u001A\u00020+2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b\u00A2\u0006\u0004\b4\u0010)J$\u00103\u001A\u00020\b2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\"H\u0080\b\u00A2\u0006\u0004\b4\u0010/J+\u00107\u001A\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001F\u0018\u00012\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000 H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106J+\u00109\u001A\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001F\u0018\u00012\f\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000 H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b8\u00106J\u001E\u0010<\u001A\u00020#2\n\u0010!\u001A\u0006\u0012\u0002\b\u00030 H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u0010;J\u0017\u0010<\u001A\u00020#2\u0006\u0010,\u001A\u00020+H\u0000\u00A2\u0006\u0004\b=\u0010;J\u000F\u0010?\u001A\u00020>H\u0016\u00A2\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u001A\u0010J\u001A\u00020E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR$\u0010Q\u001A\u00020K2\u0006\u0010L\u001A\u00020K8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010PR\u001A\u00107\u001A\u00020-8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\bT\u0010UR$\u00109\u001A\u00020-2\u0006\u0010L\u001A\u00020-8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bV\u0010S\u001A\u0004\bW\u0010U\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006Z"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/node/NodeChain$Logger;", "logger", "", "useLogger$ui_release", "(Landroidx/compose/ui/node/NodeChain$Logger;)V", "useLogger", "Landroidx/compose/ui/Modifier;", "m", "updateFrom$ui_release", "(Landroidx/compose/ui/Modifier;)V", "updateFrom", "resetState$ui_release", "()V", "resetState", "syncCoordinators", "markAsAttached", "runAttachLifecycle", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "()Ljava/util/List;", "markAsDetached$ui_release", "markAsDetached", "runDetachLifecycle$ui_release", "runDetachLifecycle", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "Lkotlin/Function1;", "", "block", "firstFromHead-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstFromHead", "headToTail-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "headToTail", "", "mask", "Landroidx/compose/ui/Modifier$Node;", "headToTail$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "headToTailExclusive$ui_release", "headToTailExclusive", "tailToHead-aLcG6gQ$ui_release", "tailToHead", "tailToHead$ui_release", "tail-H91voCI$ui_release", "(I)Ljava/lang/Object;", "tail", "head-H91voCI$ui_release", "head", "has-H91voCI$ui_release", "(I)Z", "has", "has$ui_release", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "b", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", "c", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "d", "Landroidx/compose/ui/Modifier$Node;", "getTail$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "e", "getHead$ui_release", "androidx/compose/ui/node/x", "Logger", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,843:1\n751#1,6:911\n720#1,6:917\n720#1,6:923\n728#1,3:930\n731#1,3:936\n751#1,6:939\n751#1,6:945\n697#1,8:967\n720#1,3:975\n705#1,2:978\n698#1:980\n699#1,11:1024\n723#1,3:1035\n710#1:1038\n700#1:1039\n703#1,2:1040\n720#1,3:1042\n705#1,2:1045\n708#1,2:1090\n723#1,3:1092\n710#1:1095\n720#1,6:1096\n742#1,12:1102\n754#1,3:1157\n748#1:1160\n751#1,6:1161\n736#1,18:1167\n754#1,3:1228\n748#1:1231\n739#1:1232\n697#1,8:1233\n720#1,3:1241\n705#1,2:1244\n698#1:1246\n699#1,11:1290\n723#1,3:1301\n710#1:1304\n700#1:1305\n728#1,6:1306\n42#2,7:844\n42#2,7:851\n42#2,7:858\n66#2,9:868\n66#2,9:879\n66#2,9:888\n66#2,9:898\n42#2,7:953\n42#2,7:960\n1208#3:865\n1187#3,2:866\n1187#3,2:908\n1188#3:929\n1208#3:1001\n1187#3,2:1002\n1208#3:1067\n1187#3,2:1068\n1208#3:1134\n1187#3,2:1135\n1208#3:1205\n1187#3,2:1206\n1208#3:1267\n1187#3,2:1268\n523#4:877\n523#4:878\n523#4:897\n523#4:907\n523#4:933\n728#4,2:934\n1#5:910\n76#6:951\n264#7:952\n264#7:987\n264#7:1053\n264#7:1120\n264#7:1191\n264#7:1253\n432#8,6:981\n442#8,2:988\n444#8,8:993\n452#8,9:1004\n461#8,8:1016\n432#8,6:1047\n442#8,2:1054\n444#8,8:1059\n452#8,9:1070\n461#8,8:1082\n432#8,6:1114\n442#8,2:1121\n444#8,8:1126\n452#8,9:1137\n461#8,8:1149\n432#8,6:1185\n442#8,2:1192\n444#8,8:1197\n452#8,9:1208\n461#8,8:1220\n432#8,6:1247\n442#8,2:1254\n444#8,8:1259\n452#8,9:1270\n461#8,8:1282\n245#9,3:990\n248#9,3:1013\n245#9,3:1056\n248#9,3:1079\n245#9,3:1123\n248#9,3:1146\n245#9,3:1194\n248#9,3:1217\n245#9,3:1256\n248#9,3:1279\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n222#1:911,6\n282#1:917,6\n292#1:923,6\n318#1:930,3\n318#1:936,3\n352#1:939,6\n358#1:945,6\n690#1:967,8\n690#1:975,3\n690#1:978,2\n690#1:980\n690#1:1024,11\n690#1:1035,3\n690#1:1038\n690#1:1039\n697#1:1040,2\n697#1:1042,3\n697#1:1045,2\n697#1:1090,2\n697#1:1092,3\n697#1:1095\n704#1:1096,6\n736#1:1102,12\n736#1:1157,3\n736#1:1160\n743#1:1161,6\n759#1:1167,18\n759#1:1228,3\n759#1:1231\n759#1:1232\n766#1:1233,8\n766#1:1241,3\n766#1:1244,2\n766#1:1246\n766#1:1290,11\n766#1:1301,3\n766#1:1304\n766#1:1305\n782#1:1306,6\n65#1:844,7\n73#1:851,7\n81#1:858,7\n127#1:868,9\n157#1:879,9\n158#1:888,9\n187#1:898,9\n584#1:953,7\n624#1:960,7\n117#1:865\n117#1:866,2\n199#1:908,2\n316#1:929\n690#1:1001\n690#1:1002,2\n698#1:1067\n698#1:1068,2\n737#1:1134\n737#1:1135,2\n759#1:1205\n759#1:1206,2\n766#1:1267\n766#1:1268,2\n128#1:877\n129#1:878\n179#1:897\n191#1:907\n346#1:933\n346#1:934,2\n400#1:951\n400#1:952\n690#1:987\n698#1:1053\n737#1:1120\n759#1:1191\n766#1:1253\n690#1:981,6\n690#1:988,2\n690#1:993,8\n690#1:1004,9\n690#1:1016,8\n698#1:1047,6\n698#1:1054,2\n698#1:1059,8\n698#1:1070,9\n698#1:1082,8\n737#1:1114,6\n737#1:1121,2\n737#1:1126,8\n737#1:1137,9\n737#1:1149,8\n759#1:1185,6\n759#1:1192,2\n759#1:1197,8\n759#1:1208,9\n759#1:1220,8\n766#1:1247,6\n766#1:1254,2\n766#1:1259,8\n766#1:1270,9\n766#1:1282,8\n690#1:990,3\n690#1:1013,3\n698#1:1056,3\n698#1:1079,3\n737#1:1123,3\n737#1:1146,3\n759#1:1194,3\n759#1:1217,3\n766#1:1256,3\n766#1:1279,3\n*E\n"})
public final class NodeChain {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\nH&J0\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\nH&J \u0010\u0011\u001A\u00020\u00032\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\nH&J0\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\nH&J0\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "linearDiffAborted", "", "index", "", "prev", "Landroidx/compose/ui/Modifier$Element;", "next", "node", "Landroidx/compose/ui/Modifier$Node;", "nodeInserted", "atIndex", "newIndex", "element", "child", "inserted", "nodeRemoved", "oldIndex", "nodeReused", "nodeUpdated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Logger {
        void linearDiffAborted(int arg1, @NotNull Element arg2, @NotNull Element arg3, @NotNull Node arg4);

        void nodeInserted(int arg1, int arg2, @NotNull Element arg3, @NotNull Node arg4, @NotNull Node arg5);

        void nodeRemoved(int arg1, @NotNull Element arg2, @NotNull Node arg3);

        void nodeReused(int arg1, int arg2, @NotNull Element arg3, @NotNull Element arg4, @NotNull Node arg5);

        void nodeUpdated(int arg1, int arg2, @NotNull Element arg3, @NotNull Element arg4, @NotNull Node arg5);
    }

    public static final int $stable = 8;
    public final LayoutNode a;
    public final InnerNodeCoordinator b;
    public NodeCoordinator c;
    public final TailModifierNode d;
    public Node e;
    public MutableVector f;
    public MutableVector g;
    public x h;
    public Logger i;

    public NodeChain(@NotNull LayoutNode layoutNode0) {
        this.a = layoutNode0;
        InnerNodeCoordinator innerNodeCoordinator0 = new InnerNodeCoordinator(layoutNode0);
        this.b = innerNodeCoordinator0;
        this.c = innerNodeCoordinator0;
        TailModifierNode tailModifierNode0 = innerNodeCoordinator0.getTail();
        this.d = tailModifierNode0;
        this.e = tailModifierNode0;
    }

    public static Node a(Element modifier$Element0, Node modifier$Node0) {
        Node modifier$Node1;
        if(modifier$Element0 instanceof ModifierNodeElement) {
            modifier$Node1 = ((ModifierNodeElement)modifier$Element0).create();
            modifier$Node1.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(modifier$Node1));
        }
        else {
            modifier$Node1 = new BackwardsCompatNode(modifier$Element0);
        }
        if(modifier$Node1.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        modifier$Node1.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        Node modifier$Node2 = modifier$Node0.getChild$ui_release();
        if(modifier$Node2 != null) {
            modifier$Node2.setParent$ui_release(modifier$Node1);
            modifier$Node1.setChild$ui_release(modifier$Node2);
        }
        modifier$Node0.setChild$ui_release(modifier$Node1);
        modifier$Node1.setParent$ui_release(modifier$Node0);
        return modifier$Node1;
    }

    public static final Node access$createAndInsertNodeAsChild(NodeChain nodeChain0, Element modifier$Element0, Node modifier$Node0) {
        nodeChain0.getClass();
        return NodeChain.a(modifier$Element0, modifier$Node0);
    }

    public static final Node access$detachAndRemoveNode(NodeChain nodeChain0, Node modifier$Node0) {
        nodeChain0.getClass();
        return NodeChain.b(modifier$Node0);
    }

    public static final int access$getAggregateChildKindSet(NodeChain nodeChain0) {
        return nodeChain0.e.getAggregateChildKindSet$ui_release();
    }

    public static final void access$propagateCoordinator(NodeChain nodeChain0, Node modifier$Node0, NodeCoordinator nodeCoordinator0) {
        nodeChain0.getClass();
        for(Node modifier$Node1 = modifier$Node0.getParent$ui_release(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.getParent$ui_release()) {
            if(modifier$Node1 == NodeChainKt.access$getSentinelHead$p()) {
                LayoutNode layoutNode0 = nodeChain0.a.getParent$ui_release();
                nodeCoordinator0.setWrappedBy$ui_release((layoutNode0 == null ? null : layoutNode0.getInnerCoordinator$ui_release()));
                nodeChain0.c = nodeCoordinator0;
                return;
            }
            if((2 & modifier$Node1.getKindSet$ui_release()) != 0) {
                break;
            }
            modifier$Node1.updateCoordinator$ui_release(nodeCoordinator0);
        }
    }

    public static final void access$updateNode(NodeChain nodeChain0, Element modifier$Element0, Element modifier$Element1, Node modifier$Node0) {
        nodeChain0.getClass();
        NodeChain.d(modifier$Element0, modifier$Element1, modifier$Node0);
    }

    public static Node b(Node modifier$Node0) {
        if(modifier$Node0.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(modifier$Node0);
            modifier$Node0.runDetachLifecycle$ui_release();
            modifier$Node0.markAsDetached$ui_release();
        }
        Node modifier$Node1 = modifier$Node0.getChild$ui_release();
        Node modifier$Node2 = modifier$Node0.getParent$ui_release();
        if(modifier$Node1 != null) {
            modifier$Node1.setParent$ui_release(modifier$Node2);
            modifier$Node0.setChild$ui_release(null);
        }
        if(modifier$Node2 != null) {
            modifier$Node2.setChild$ui_release(modifier$Node1);
            modifier$Node0.setParent$ui_release(null);
        }
        Intrinsics.checkNotNull(modifier$Node2);
        return modifier$Node2;
    }

    public final void c(int v, MutableVector mutableVector0, MutableVector mutableVector1, Node modifier$Node0, boolean z) {
        x x0 = this.h;
        if(x0 == null) {
            x0 = new x(this, modifier$Node0, v, mutableVector0, mutableVector1, z);
            this.h = x0;
        }
        else {
            x0.a = modifier$Node0;
            x0.b = v;
            x0.c = mutableVector0;
            x0.d = mutableVector1;
            x0.e = z;
        }
        MyersDiffKt.executeDiff(mutableVector0.getSize() - v, mutableVector1.getSize() - v, x0);
        Node modifier$Node1 = this.d.getParent$ui_release();
        int v1 = 0;
        while(modifier$Node1 != null && modifier$Node1 != NodeChainKt.access$getSentinelHead$p()) {
            v1 |= modifier$Node1.getKindSet$ui_release();
            modifier$Node1.setAggregateChildKindSet$ui_release(v1);
            modifier$Node1 = modifier$Node1.getParent$ui_release();
        }
    }

    public static void d(Element modifier$Element0, Element modifier$Element1, Node modifier$Node0) {
        if(modifier$Element0 instanceof ModifierNodeElement && modifier$Element1 instanceof ModifierNodeElement) {
            NodeChainKt.access$updateUnsafe(((ModifierNodeElement)modifier$Element1), modifier$Node0);
            if(modifier$Node0.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(modifier$Node0);
                return;
            }
            modifier$Node0.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
            return;
        }
        if(!(modifier$Node0 instanceof BackwardsCompatNode)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((BackwardsCompatNode)modifier$Node0).setElement(modifier$Element1);
        if(modifier$Node0.isAttached()) {
            NodeKindKt.autoInvalidateUpdatedNode(modifier$Node0);
            return;
        }
        modifier$Node0.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
    }

    public final Object firstFromHead-aLcG6gQ$ui_release(int v, Function1 function10) {
        if((NodeChain.access$getAggregateChildKindSet(this) & v) != 0) {
            for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
                if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                    for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        if(((Boolean)function10.invoke(modifier$Node1)).booleanValue()) {
                            return modifier$Node1;
                        }
                    }
                }
                if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Node getHead$ui_release() {
        return this.e;
    }

    @NotNull
    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.b;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.a;
    }

    @NotNull
    public final List getModifierInfo() {
        MutableVector mutableVector0 = this.f;
        if(mutableVector0 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        MutableVector mutableVector1 = new MutableVector(new ModifierInfo[mutableVector0.getSize()], 0);
        Node modifier$Node0 = this.getHead$ui_release();
        for(int v = 0; modifier$Node0 != null && modifier$Node0 != this.getTail$ui_release(); ++v) {
            NodeCoordinator nodeCoordinator0 = modifier$Node0.getCoordinator$ui_release();
            if(nodeCoordinator0 == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            OwnedLayer ownedLayer0 = nodeCoordinator0.getLayer();
            OwnedLayer ownedLayer1 = this.b.getLayer();
            Node modifier$Node1 = modifier$Node0.getChild$ui_release();
            if(modifier$Node1 != this.d || modifier$Node0.getCoordinator$ui_release() == modifier$Node1.getCoordinator$ui_release()) {
                ownedLayer1 = null;
            }
            if(ownedLayer0 == null) {
                ownedLayer0 = ownedLayer1;
            }
            mutableVector1.add(new ModifierInfo(((Modifier)mutableVector0.getContent()[v]), nodeCoordinator0, ownedLayer0));
            modifier$Node0 = modifier$Node0.getChild$ui_release();
        }
        return mutableVector1.asMutableList();
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.c;
    }

    @NotNull
    public final Node getTail$ui_release() {
        return this.d;
    }

    public final boolean has$ui_release(int v) {
        return (v & this.e.getAggregateChildKindSet$ui_release()) != 0;
    }

    public final boolean has-H91voCI$ui_release(int v) {
        return (v & this.e.getAggregateChildKindSet$ui_release()) != 0;
    }

    public final Object head-H91voCI$ui_release(int v) {
        if((NodeChain.access$getAggregateChildKindSet(this) & v) != 0) {
            for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
                if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    return modifier$Node0;
                }
                if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int v, @NotNull Function1 function10) {
        if((NodeChain.access$getAggregateChildKindSet(this) & v) == 0) {
            return;
        }
        for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                function10.invoke(modifier$Node0);
            }
            if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) == 0) {
                return;
            }
        }
    }

    public final void headToTail$ui_release(@NotNull Function1 function10) {
        for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            function10.invoke(modifier$Node0);
        }
    }

    public final void headToTail-aLcG6gQ$ui_release(int v, Function1 function10) {
        if((NodeChain.access$getAggregateChildKindSet(this) & v) != 0) {
            for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
                if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                    for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        function10.invoke(modifier$Node1);
                    }
                }
                if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) == 0) {
                    break;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(@NotNull Function1 function10) {
        for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null && modifier$Node0 != this.getTail$ui_release(); modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            function10.invoke(modifier$Node0);
        }
    }

    public final void markAsAttached() {
        for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            modifier$Node0.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for(Node modifier$Node0 = this.getTail$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
            if(modifier$Node0.isAttached()) {
                modifier$Node0.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        for(Node modifier$Node0 = this.getTail$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
            if(modifier$Node0.isAttached()) {
                modifier$Node0.reset$ui_release();
            }
        }
        this.runDetachLifecycle$ui_release();
        this.markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            modifier$Node0.runAttachLifecycle$ui_release();
            if(modifier$Node0.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateInsertedNode(modifier$Node0);
            }
            if(modifier$Node0.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateUpdatedNode(modifier$Node0);
            }
            modifier$Node0.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            modifier$Node0.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for(Node modifier$Node0 = this.getTail$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
            if(modifier$Node0.isAttached()) {
                modifier$Node0.runDetachLifecycle$ui_release();
            }
        }
    }

    public final void syncCoordinators() {
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator0;
        LayoutNode layoutNode0;
        Node modifier$Node0 = this.d.getParent$ui_release();
        InnerNodeCoordinator innerNodeCoordinator0 = this.b;
        while(true) {
            layoutNode0 = this.a;
            if(modifier$Node0 == null) {
                break;
            }
            LayoutModifierNode layoutModifierNode0 = DelegatableNodeKt.asLayoutModifierNode(modifier$Node0);
            if(layoutModifierNode0 == null) {
                modifier$Node0.updateCoordinator$ui_release(innerNodeCoordinator0);
            }
            else {
                if(modifier$Node0.getCoordinator$ui_release() == null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator1 = new LayoutModifierNodeCoordinator(layoutNode0, layoutModifierNode0);
                    modifier$Node0.updateCoordinator$ui_release(layoutModifierNodeCoordinator1);
                    layoutModifierNodeCoordinator0 = layoutModifierNodeCoordinator1;
                }
                else {
                    NodeCoordinator nodeCoordinator0 = modifier$Node0.getCoordinator$ui_release();
                    Intrinsics.checkNotNull(nodeCoordinator0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator0 = (LayoutModifierNodeCoordinator)nodeCoordinator0;
                    layoutModifierNodeCoordinator0.setLayoutModifierNode$ui_release(layoutModifierNode0);
                    if(layoutModifierNodeCoordinator0.getLayoutModifierNode() != modifier$Node0) {
                        layoutModifierNodeCoordinator0.onLayoutModifierNodeChanged();
                    }
                }
                innerNodeCoordinator0.setWrappedBy$ui_release(layoutModifierNodeCoordinator0);
                layoutModifierNodeCoordinator0.setWrapped$ui_release(innerNodeCoordinator0);
                innerNodeCoordinator0 = layoutModifierNodeCoordinator0;
            }
            modifier$Node0 = modifier$Node0.getParent$ui_release();
        }
        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
        innerNodeCoordinator0.setWrappedBy$ui_release((layoutNode1 == null ? null : layoutNode1.getInnerCoordinator$ui_release()));
        this.c = innerNodeCoordinator0;
    }

    public final Object tail-H91voCI$ui_release(int v) {
        if((NodeChain.access$getAggregateChildKindSet(this) & v) != 0) {
            for(Node modifier$Node0 = this.getTail$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
                if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    return modifier$Node0;
                }
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int v, @NotNull Function1 function10) {
        if((NodeChain.access$getAggregateChildKindSet(this) & v) == 0) {
            return;
        }
        for(Node modifier$Node0 = this.getTail$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
            if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                function10.invoke(modifier$Node0);
            }
        }
    }

    public final void tailToHead$ui_release(@NotNull Function1 function10) {
        for(Node modifier$Node0 = this.getTail$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
            function10.invoke(modifier$Node0);
        }
    }

    public final void tailToHead-aLcG6gQ$ui_release(int v, Function1 function10) {
        if((NodeChain.access$getAggregateChildKindSet(this) & v) != 0) {
            for(Node modifier$Node0 = this.getTail$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
                if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                    for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        function10.invoke(modifier$Node1);
                    }
                }
            }
        }
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        TailModifierNode tailModifierNode0 = this.d;
        if(this.e == tailModifierNode0) {
            stringBuilder0.append("]");
        }
        else {
            for(Node modifier$Node0 = this.getHead$ui_release(); modifier$Node0 != null && modifier$Node0 != this.getTail$ui_release(); modifier$Node0 = modifier$Node0.getChild$ui_release()) {
                stringBuilder0.append(String.valueOf(modifier$Node0));
                if(modifier$Node0.getChild$ui_release() == tailModifierNode0) {
                    stringBuilder0.append("]");
                    break;
                }
                stringBuilder0.append(",");
            }
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final void updateFrom$ui_release(@NotNull Modifier modifier0) {
        if(this.e == NodeChainKt.a) {
            InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        Node modifier$Node0 = this.e;
        modifier$Node0.setParent$ui_release(NodeChainKt.a);
        NodeChainKt.a.setChild$ui_release(modifier$Node0);
        NodeChainKt.SentinelHead.1 nodeChainKt$SentinelHead$10 = NodeChainKt.a;
        MutableVector mutableVector0 = this.f;
        int v = 0;
        int v1 = mutableVector0 == null ? 0 : mutableVector0.getSize();
        MutableVector mutableVector1 = NodeChainKt.access$fillVector(modifier0, (this.g == null ? new MutableVector(new Element[16], 0) : this.g));
        Node modifier$Node1 = this.d;
        LayoutNode layoutNode0 = this.a;
        if(mutableVector1.getSize() == v1) {
            Node modifier$Node2 = nodeChainKt$SentinelHead$10.getChild$ui_release();
            int v2 = 0;
        label_15:
            while(modifier$Node2 != null && v2 < v1) {
                if(mutableVector0 == null) {
                    throw a.b("expected prior modifier list to be non-empty");
                }
                Element modifier$Element0 = (Element)mutableVector0.getContent()[v2];
                Element modifier$Element1 = (Element)mutableVector1.getContent()[v2];
                int v3 = NodeChainKt.actionForModifiers(modifier$Element0, modifier$Element1);
                switch(v3) {
                    case 0: {
                        Logger nodeChain$Logger1 = this.i;
                        if(nodeChain$Logger1 != null) {
                            nodeChain$Logger1.linearDiffAborted(v2, modifier$Element0, modifier$Element1, modifier$Node2);
                        }
                        modifier$Node2 = modifier$Node2.getParent$ui_release();
                        break label_15;
                    }
                    case 1: {
                        NodeChain.d(modifier$Element0, modifier$Element1, modifier$Node2);
                        Logger nodeChain$Logger2 = this.i;
                        if(nodeChain$Logger2 != null) {
                            nodeChain$Logger2.nodeUpdated(v2, v2, modifier$Element0, modifier$Element1, modifier$Node2);
                        }
                        break;
                    }
                    default: {
                        if(v3 == 2) {
                            Logger nodeChain$Logger0 = this.i;
                            if(nodeChain$Logger0 != null) {
                                nodeChain$Logger0.nodeReused(v2, v2, modifier$Element0, modifier$Element1, modifier$Node2);
                            }
                        }
                    }
                }
                modifier$Node2 = modifier$Node2.getChild$ui_release();
                ++v2;
            }
            if(v2 < v1) {
                if(mutableVector0 == null) {
                    throw a.b("expected prior modifier list to be non-empty");
                }
                if(modifier$Node2 == null) {
                    throw a.b("structuralUpdate requires a non-null tail");
                }
                this.c(v2, mutableVector0, mutableVector1, modifier$Node2, !layoutNode0.getApplyingModifierOnAttach$ui_release());
                v = 1;
            }
        }
        else if(layoutNode0.getApplyingModifierOnAttach$ui_release() && v1 == 0) {
            int v4 = 0;
            for(Node modifier$Node3 = nodeChainKt$SentinelHead$10; v4 < mutableVector1.getSize(); modifier$Node3 = modifier$Node4) {
                Element modifier$Element2 = (Element)mutableVector1.getContent()[v4];
                Node modifier$Node4 = NodeChain.a(modifier$Element2, modifier$Node3);
                Logger nodeChain$Logger3 = this.i;
                if(nodeChain$Logger3 != null) {
                    nodeChain$Logger3.nodeInserted(0, v4, modifier$Element2, modifier$Node3, modifier$Node4);
                }
                ++v4;
            }
            for(Node modifier$Node5 = modifier$Node1.getParent$ui_release(); modifier$Node5 != null && modifier$Node5 != NodeChainKt.a; modifier$Node5 = modifier$Node5.getParent$ui_release()) {
                v |= modifier$Node5.getKindSet$ui_release();
                modifier$Node5.setAggregateChildKindSet$ui_release(v);
            }
            v = 1;
        }
        else if(mutableVector1.getSize() == 0) {
            if(mutableVector0 == null) {
                throw a.b("expected prior modifier list to be non-empty");
            }
            Node modifier$Node6 = nodeChainKt$SentinelHead$10.getChild$ui_release();
            for(int v5 = 0; modifier$Node6 != null && v5 < mutableVector0.getSize(); ++v5) {
                Logger nodeChain$Logger4 = this.i;
                if(nodeChain$Logger4 != null) {
                    nodeChain$Logger4.nodeRemoved(v5, ((Element)mutableVector0.getContent()[v5]), modifier$Node6);
                }
                modifier$Node6 = NodeChain.b(modifier$Node6).getChild$ui_release();
            }
            LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
            NodeCoordinator nodeCoordinator0 = layoutNode1 == null ? null : layoutNode1.getInnerCoordinator$ui_release();
            this.b.setWrappedBy$ui_release(nodeCoordinator0);
            this.c = this.b;
        }
        else {
            if(mutableVector0 == null) {
                mutableVector0 = new MutableVector(new Element[16], 0);
            }
            this.c(0, mutableVector0, mutableVector1, nodeChainKt$SentinelHead$10, !layoutNode0.getApplyingModifierOnAttach$ui_release());
            v = 1;
        }
        this.f = mutableVector1;
        if(mutableVector0 == null) {
            mutableVector0 = null;
        }
        else {
            mutableVector0.clear();
        }
        this.g = mutableVector0;
        if(nodeChainKt$SentinelHead$10 != NodeChainKt.a) {
            InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        Node modifier$Node7 = NodeChainKt.a.getChild$ui_release();
        if(modifier$Node7 != null) {
            modifier$Node1 = modifier$Node7;
        }
        modifier$Node1.setParent$ui_release(null);
        NodeChainKt.a.setChild$ui_release(null);
        NodeChainKt.a.setAggregateChildKindSet$ui_release(-1);
        NodeChainKt.a.updateCoordinator$ui_release(null);
        if(modifier$Node1 == NodeChainKt.a) {
            InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        this.e = modifier$Node1;
        if(v != 0) {
            this.syncCoordinators();
        }
    }

    public final void useLogger$ui_release(@Nullable Logger nodeChain$Logger0) {
        this.i = nodeChain$Logger0;
    }
}

