package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001A:\u0010\t\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00A2\u0006\u0004\b\t\u0010\n\u001A\u001D\u0010\u000B\u001A\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000\u00A2\u0006\u0004\b\u000B\u0010\f\u001A0\u0010\r\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00A2\u0006\u0004\b\r\u0010\u000E\u001A0\u0010\u000F\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00A2\u0006\u0004\b\u000F\u0010\u000E\u001A0\u0010\u0010\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b\u00A2\u0006\u0004\b\u0010\u0010\u000E\u001A0\u0010\u0011\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00A2\u0006\u0004\b\u0011\u0010\u000E\u001A:\u0010\u0011\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00A2\u0006\u0004\b\u0011\u0010\n\u001A0\u0010\u0012\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00A2\u0006\u0004\b\u0012\u0010\u000E\u001AA\u0010\u0017\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u000E\u001AA\u0010\u0011\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u000E\u001AA\u0010\u0012\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u000E\u001AK\u0010\t\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\n\u001AM\u0010\u001E\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\n\u0010\u001B\u001A\u0006\u0012\u0002\b\u00030\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A5\u0010\"\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001F\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!\u001A3\u0010\u000B\u001A\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020#*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%\u001AA\u0010\r\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\u000E\u001AA\u0010\u000F\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010\u000E\u001AA\u0010)\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010\u000E\u001AA\u0010\u0010\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010\u000E\u001A\"\u0010-\u001A\u00020\u0003*\u00020\u00002\n\u0010\u0015\u001A\u0006\u0012\u0002\b\u00030\u0014H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,\u001A\"\u00102\u001A\u00020/*\u00020\u00002\n\u0010.\u001A\u0006\u0012\u0002\b\u00030\u0014H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101\u001A\u0013\u00104\u001A\u000203*\u00020\u0000H\u0000\u00A2\u0006\u0004\b4\u00105\u001A\u0013\u00107\u001A\u000206*\u00020\u0000H\u0000\u00A2\u0006\u0004\b7\u00108\u001A\u0011\u0010:\u001A\u000209*\u00020\u0000\u00A2\u0006\u0004\b:\u0010;\u001A\u0011\u0010=\u001A\u00020<*\u00020\u0000\u00A2\u0006\u0004\b=\u0010>\u001A\u0011\u0010@\u001A\u00020?*\u00020\u0000\u00A2\u0006\u0004\b@\u0010A\u001A\u0011\u0010C\u001A\u00020B*\u00020\u0000\u00A2\u0006\u0004\bC\u0010D\u001A\u0011\u0010E\u001A\u00020\u0007*\u00020\u0000\u00A2\u0006\u0004\bE\u0010F\u001A\u0015\u0010H\u001A\u0004\u0018\u00010G*\u00020\u0006H\u0000\u00A2\u0006\u0004\bH\u0010I\u001AA\u0010L\u001A\u00020\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00062\f\u0010.\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bJ\u0010K\"\u0018\u0010M\u001A\u00020\u0003*\u00020\u00008@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010N\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006O"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "mask", "", "includeSelf", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Node;", "", "block", "visitAncestors", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "nearestAncestor", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/Modifier$Node;", "visitSubtree", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitChildren", "visitSubtreeIf", "visitLocalDescendants", "visitLocalAncestors", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "visitSelfAndLocalDescendants-6rFNWt0", "visitSelfAndLocalDescendants", "visitLocalDescendants-6rFNWt0", "visitLocalAncestors-6rFNWt0", "visitAncestors-Y-YKmho", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndAncestors", "", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "ancestors", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "visitSubtree-6rFNWt0", "visitChildren-6rFNWt0", "visitSelfAndChildren-6rFNWt0", "visitSelfAndChildren", "visitSubtreeIf-6rFNWt0", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "has", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator", "Landroidx/compose/ui/node/LayoutNode;", "requireLayoutNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/unit/Density;", "requireDensity", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/GraphicsContext;", "requireGraphicsContext", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutDirection", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLayoutCoordinates", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/layout/LayoutCoordinates;", "invalidateSubtree", "(Landroidx/compose/ui/node/DelegatableNode;)V", "Landroidx/compose/ui/node/LayoutModifierNode;", "asLayoutModifierNode", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/node/LayoutModifierNode;", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "dispatchForKind", "isDelegationRoot", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,474:1\n204#1:515\n205#1,10:523\n204#1:547\n205#1,6:555\n432#1,6:561\n442#1,2:568\n444#1,8:573\n452#1,9:584\n461#1,8:596\n212#1,3:604\n193#1,12:607\n205#1,6:626\n432#1,6:632\n442#1,2:639\n444#1,8:644\n452#1,9:655\n461#1,8:667\n212#1,3:675\n197#1:678\n220#1:679\n221#1,4:687\n432#1,6:691\n442#1,2:698\n444#1,8:703\n452#1,9:714\n461#1,8:726\n226#1,3:734\n62#1:737\n63#1,8:739\n432#1,6:747\n442#1,2:754\n444#1,8:759\n452#1,9:770\n461#1,8:782\n72#1,7:790\n62#1,9:797\n432#1,12:806\n444#1,8:821\n452#1,9:832\n461#1,8:844\n72#1,7:852\n62#1:859\n63#1,8:861\n432#1,6:871\n442#1,2:878\n444#1,8:883\n452#1,9:894\n461#1,8:906\n72#1,7:914\n251#1,5:921\n62#1:926\n63#1,8:928\n432#1,6:936\n442#1,2:943\n444#1,8:948\n452#1,9:959\n461#1,8:971\n72#1,7:979\n251#1,5:986\n62#1:991\n63#1,8:993\n432#1,6:1001\n442#1,2:1008\n444#1,8:1013\n452#1,9:1024\n461#1,8:1036\n72#1,7:1044\n104#1:1051\n105#1,15:1059\n432#1,6:1074\n442#1,2:1081\n444#1,8:1086\n452#1,9:1097\n461#1,8:1109\n121#1,8:1117\n137#1:1125\n138#1:1127\n139#1,7:1131\n146#1,9:1139\n432#1,6:1148\n442#1,2:1155\n444#1,17:1160\n461#1,8:1180\n155#1,6:1188\n432#1,6:1194\n442#1,2:1201\n444#1,8:1206\n452#1,9:1217\n461#1,8:1229\n137#1:1237\n138#1:1239\n139#1,7:1243\n146#1,9:1251\n432#1,6:1260\n442#1,2:1267\n444#1,8:1272\n452#1,9:1283\n461#1,8:1295\n155#1,6:1303\n167#1:1309\n168#1:1317\n169#1,12:1321\n432#1,6:1333\n442#1,2:1340\n444#1,8:1345\n452#1,9:1356\n461#1,8:1368\n181#1,8:1376\n1#2:475\n1#2:738\n1#2:860\n1#2:927\n1#2:992\n1#2:1126\n1#2:1238\n42#3,7:476\n42#3,7:483\n42#3,7:505\n42#3,7:516\n42#3,7:533\n42#3,7:540\n42#3,7:548\n42#3,7:619\n42#3,7:680\n42#3,7:1052\n42#3,7:1310\n66#3,9:1384\n66#3,9:1393\n42#3,7:1402\n42#3,7:1410\n492#4,11:490\n48#4:504\n48#4:1138\n48#4:1250\n1208#5:501\n1187#5,2:502\n1208#5:512\n1187#5,2:513\n1208#5:581\n1187#5,2:582\n1208#5:652\n1187#5,2:653\n1208#5:711\n1187#5,2:712\n1208#5:767\n1187#5,2:768\n1208#5:829\n1187#5,2:830\n1208#5:891\n1187#5,2:892\n1208#5:956\n1187#5,2:957\n1208#5:1021\n1187#5,2:1022\n1208#5:1094\n1187#5,2:1095\n1208#5:1128\n1187#5,2:1129\n1208#5:1214\n1187#5,2:1215\n1208#5:1240\n1187#5,2:1241\n1208#5:1280\n1187#5,2:1281\n1208#5:1318\n1187#5,2:1319\n1208#5:1353\n1187#5,2:1354\n1208#5:1426\n1187#5,2:1427\n264#6:567\n264#6:638\n264#6:697\n264#6:753\n264#6:869\n264#6:870\n264#6:877\n264#6:942\n264#6:1007\n264#6:1080\n264#6:1154\n264#6:1200\n264#6:1266\n264#6:1339\n264#6:1418\n264#6:1420\n264#6:1421\n264#6:1425\n245#7,3:570\n248#7,3:593\n245#7,3:641\n248#7,3:664\n245#7,3:700\n248#7,3:723\n245#7,3:756\n248#7,3:779\n245#7,3:818\n248#7,3:841\n245#7,3:880\n248#7,3:903\n245#7,3:945\n248#7,3:968\n245#7,3:1010\n248#7,3:1033\n245#7,3:1083\n248#7,3:1106\n245#7,3:1157\n248#7,3:1177\n245#7,3:1203\n248#7,3:1226\n245#7,3:1269\n248#7,3:1292\n245#7,3:1342\n248#7,3:1365\n245#7,3:1422\n248#7,3:1429\n76#8:1409\n76#8:1417\n76#8:1419\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n193#1:515\n193#1:523,10\n233#1:547\n233#1:555,6\n234#1:561,6\n234#1:568,2\n234#1:573,8\n234#1:584,9\n234#1:596,8\n233#1:604,3\n240#1:607,12\n240#1:626,6\n241#1:632,6\n241#1:639,2\n241#1:644,8\n241#1:655,9\n241#1:667,8\n240#1:675,3\n240#1:678\n247#1:679\n247#1:687,4\n248#1:691,6\n248#1:698,2\n248#1:703,8\n248#1:714,9\n248#1:726,8\n247#1:734,3\n255#1:737\n255#1:739,8\n255#1:747,6\n255#1:754,2\n255#1:759,8\n255#1:770,9\n255#1:782,8\n255#1:790,7\n255#1:797,9\n255#1:806,12\n255#1:821,8\n255#1:832,9\n255#1:844,8\n255#1:852,7\n263#1:859\n263#1:861,8\n266#1:871,6\n266#1:878,2\n266#1:883,8\n266#1:894,9\n266#1:906,8\n263#1:914,7\n275#1:921,5\n275#1:926\n275#1:928,8\n275#1:936,6\n275#1:943,2\n275#1:948,8\n275#1:959,9\n275#1:971,8\n275#1:979,7\n283#1:986,5\n283#1:991\n283#1:993,8\n283#1:1001,6\n283#1:1008,2\n283#1:1013,8\n283#1:1024,9\n283#1:1036,8\n283#1:1044,7\n292#1:1051\n292#1:1059,15\n292#1:1074,6\n292#1:1081,2\n292#1:1086,8\n292#1:1097,9\n292#1:1109,8\n292#1:1117,8\n297#1:1125\n297#1:1127\n297#1:1131,7\n297#1:1139,9\n297#1:1148,6\n297#1:1155,2\n297#1:1160,17\n297#1:1180,8\n297#1:1188,6\n303#1:1194,6\n303#1:1201,2\n303#1:1206,8\n303#1:1217,9\n303#1:1229,8\n304#1:1237\n304#1:1239\n304#1:1243,7\n304#1:1251,9\n304#1:1260,6\n304#1:1267,2\n304#1:1272,8\n304#1:1283,9\n304#1:1295,8\n304#1:1303,6\n310#1:1309\n310#1:1317\n310#1:1321,12\n311#1:1333,6\n311#1:1340,2\n311#1:1345,8\n311#1:1356,9\n311#1:1368,8\n310#1:1376,8\n255#1:738\n263#1:860\n275#1:927\n283#1:992\n297#1:1126\n304#1:1238\n82#1:476,7\n104#1:483,7\n167#1:505,7\n193#1:516,7\n204#1:533,7\n220#1:540,7\n233#1:548,7\n240#1:619,7\n247#1:680,7\n292#1:1052,7\n310#1:1310,7\n331#1:1384,9\n336#1:1393,9\n367#1:1402,7\n371#1:1410,7\n131#1:490,11\n145#1:504\n297#1:1138\n304#1:1250\n138#1:501\n138#1:502,2\n168#1:512\n168#1:513,2\n234#1:581\n234#1:582,2\n241#1:652\n241#1:653,2\n248#1:711\n248#1:712,2\n255#1:767\n255#1:768,2\n255#1:829\n255#1:830,2\n266#1:891\n266#1:892,2\n275#1:956\n275#1:957,2\n283#1:1021\n283#1:1022,2\n292#1:1094\n292#1:1095,2\n297#1:1128\n297#1:1129,2\n303#1:1214\n303#1:1215,2\n304#1:1240\n304#1:1241,2\n304#1:1280\n304#1:1281,2\n310#1:1318\n310#1:1319,2\n311#1:1353\n311#1:1354,2\n451#1:1426\n451#1:1427,2\n234#1:567\n241#1:638\n248#1:697\n255#1:753\n264#1:869\n265#1:870\n266#1:877\n275#1:942\n283#1:1007\n292#1:1080\n297#1:1154\n303#1:1200\n304#1:1266\n311#1:1339\n394#1:1418\n400#1:1420\n437#1:1421\n444#1:1425\n234#1:570,3\n234#1:593,3\n241#1:641,3\n241#1:664,3\n248#1:700,3\n248#1:723,3\n255#1:756,3\n255#1:779,3\n255#1:818,3\n255#1:841,3\n266#1:880,3\n266#1:903,3\n275#1:945,3\n275#1:968,3\n283#1:1010,3\n283#1:1033,3\n292#1:1083,3\n292#1:1106,3\n297#1:1157,3\n297#1:1177,3\n303#1:1203,3\n303#1:1226,3\n304#1:1269,3\n304#1:1292,3\n311#1:1342,3\n311#1:1365,3\n443#1:1422,3\n443#1:1429,3\n370#1:1409\n394#1:1417\n400#1:1419\n*E\n"})
public final class DelegatableNodeKt {
    public static final void access$addLayoutNodeChildren(MutableVector mutableVector0, Node modifier$Node0) {
        MutableVector mutableVector1 = DelegatableNodeKt.requireLayoutNode(modifier$Node0).get_children$ui_release();
        int v = mutableVector1.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = mutableVector1.getContent();
            while(true) {
                mutableVector0.add(((LayoutNode)arr_object[v1]).getNodes$ui_release().getHead$ui_release());
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
    }

    public static final Node access$pop(MutableVector mutableVector0) {
        return mutableVector0 == null || mutableVector0.isEmpty() ? null : ((Node)q.j(mutableVector0, 1));
    }

    public static final List ancestors-64DMado(DelegatableNode delegatableNode0, int v) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        List list0 = null;
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if(list0 == null) {
                                list0 = new ArrayList();
                            }
                            list0.add(modifier$Node1);
                        }
                    }
                    modifier$Node0 = modifier$Node0.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
        return list0;
    }

    @Nullable
    public static final LayoutModifierNode asLayoutModifierNode(@NotNull Node modifier$Node0) {
        if((2 & modifier$Node0.getKindSet$ui_release()) != 0) {
            if(modifier$Node0 instanceof LayoutModifierNode) {
                return (LayoutModifierNode)modifier$Node0;
            }
            if(modifier$Node0 instanceof DelegatingNode) {
                for(Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release(); modifier$Node1 != null; modifier$Node1 = modifier$Node1 instanceof DelegatingNode && (2 & modifier$Node1.getKindSet$ui_release()) != 0 ? ((DelegatingNode)modifier$Node1).getDelegate$ui_release() : modifier$Node1.getChild$ui_release()) {
                    if(modifier$Node1 instanceof LayoutModifierNode) {
                        return (LayoutModifierNode)modifier$Node1;
                    }
                }
            }
        }
        return null;
    }

    public static final void dispatchForKind-6rFNWt0(Node modifier$Node0, int v, Function1 function10) {
        while(modifier$Node0 != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            function10.invoke(modifier$Node0);
            modifier$Node0 = DelegatableNodeKt.access$pop(null);
        }
    }

    public static final boolean has-64DMado(@NotNull DelegatableNode delegatableNode0, int v) {
        return (delegatableNode0.getNode().getAggregateChildKindSet$ui_release() & v) != 0;
    }

    public static final void invalidateSubtree(@NotNull DelegatableNode delegatableNode0) {
        if(delegatableNode0.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(DelegatableNodeKt.requireLayoutNode(delegatableNode0), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(@NotNull DelegatableNode delegatableNode0) {
        return delegatableNode0.getNode() == delegatableNode0;
    }

    @Nullable
    public static final Node nearestAncestor(@NotNull DelegatableNode delegatableNode0, int v) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        return modifier$Node0;
                    }
                    modifier$Node0 = modifier$Node0.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
        return null;
    }

    public static final Object nearestAncestor-64DMado(DelegatableNode delegatableNode0, int v) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        return modifier$Node0;
                    }
                    modifier$Node0 = modifier$Node0.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
        return null;
    }

    @NotNull
    public static final NodeCoordinator requireCoordinator-64DMado(@NotNull DelegatableNode delegatableNode0, int v) {
        NodeCoordinator nodeCoordinator0 = delegatableNode0.getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(nodeCoordinator0);
        if(nodeCoordinator0.getTail() == delegatableNode0 && NodeKindKt.getIncludeSelfInTraversal-H91voCI(v)) {
            nodeCoordinator0 = nodeCoordinator0.getWrapped$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator0);
        }
        return nodeCoordinator0;
    }

    @NotNull
    public static final Density requireDensity(@NotNull DelegatableNode delegatableNode0) {
        return DelegatableNodeKt.requireLayoutNode(delegatableNode0).getDensity();
    }

    @NotNull
    public static final GraphicsContext requireGraphicsContext(@NotNull DelegatableNode delegatableNode0) {
        return DelegatableNodeKt.requireOwner(delegatableNode0).getGraphicsContext();
    }

    @NotNull
    public static final LayoutCoordinates requireLayoutCoordinates(@NotNull DelegatableNode delegatableNode0) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates layoutCoordinates0 = DelegatableNodeKt.requireCoordinator-64DMado(delegatableNode0, 2).getCoordinates();
        if(!layoutCoordinates0.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return layoutCoordinates0;
    }

    @NotNull
    public static final LayoutDirection requireLayoutDirection(@NotNull DelegatableNode delegatableNode0) {
        return DelegatableNodeKt.requireLayoutNode(delegatableNode0).getLayoutDirection();
    }

    @NotNull
    public static final LayoutNode requireLayoutNode(@NotNull DelegatableNode delegatableNode0) {
        NodeCoordinator nodeCoordinator0 = delegatableNode0.getNode().getCoordinator$ui_release();
        if(nodeCoordinator0 == null) {
            throw a.b("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        }
        return nodeCoordinator0.getLayoutNode();
    }

    @NotNull
    public static final Owner requireOwner(@NotNull DelegatableNode delegatableNode0) {
        Owner owner0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0).getOwner$ui_release();
        if(owner0 == null) {
            throw a.b("This node does not have an owner.");
        }
        return owner0;
    }

    public static final void visitAncestors(@NotNull DelegatableNode delegatableNode0, int v, boolean z, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = z ? delegatableNode0.getNode() : delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        function10.invoke(modifier$Node0);
                    }
                    modifier$Node0 = modifier$Node0.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
    }

    public static void visitAncestors$default(DelegatableNode delegatableNode0, int v, boolean z, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = z ? delegatableNode0.getNode() : delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        function10.invoke(modifier$Node0);
                    }
                    modifier$Node0 = modifier$Node0.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
    }

    public static final void visitAncestors-Y-YKmho(DelegatableNode delegatableNode0, int v, boolean z, Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = z ? delegatableNode0.getNode() : delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function10.invoke(modifier$Node1);
                        }
                    }
                    modifier$Node0 = modifier$Node0.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
    }

    public static void visitAncestors-Y-YKmho$default(DelegatableNode delegatableNode0, int v, boolean z, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = z ? delegatableNode0.getNode() : delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function10.invoke(modifier$Node1);
                        }
                    }
                    modifier$Node0 = modifier$Node0.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
    }

    public static final void visitChildren(@NotNull DelegatableNode delegatableNode0, int v, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & v) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & v) != 0) {
                        function10.invoke(modifier$Node1);
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
    }

    public static final void visitChildren-6rFNWt0(DelegatableNode delegatableNode0, int v, Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & v) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & v) != 0) {
                        while(modifier$Node1 != null) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function10.invoke(modifier$Node1);
                            modifier$Node1 = DelegatableNodeKt.access$pop(null);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
    }

    public static final void visitLocalAncestors(@NotNull DelegatableNode delegatableNode0, int v, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for(Node modifier$Node0 = delegatableNode0.getNode().getParent$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
            if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                function10.invoke(modifier$Node0);
            }
        }
    }

    public static final void visitLocalAncestors-6rFNWt0(DelegatableNode delegatableNode0, int v, Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for(Node modifier$Node0 = delegatableNode0.getNode().getParent$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getParent$ui_release()) {
            if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    function10.invoke(modifier$Node1);
                }
            }
        }
    }

    public static final void visitLocalDescendants(@NotNull DelegatableNode delegatableNode0, int v, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode();
        if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) != 0) {
            for(Node modifier$Node1 = modifier$Node0.getChild$ui_release(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.getChild$ui_release()) {
                if((modifier$Node1.getKindSet$ui_release() & v) != 0) {
                    function10.invoke(modifier$Node1);
                }
            }
        }
    }

    public static final void visitLocalDescendants(@NotNull DelegatableNode delegatableNode0, int v, boolean z, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode();
        if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) == 0) {
            return;
        }
        if(!z) {
            modifier$Node0 = modifier$Node0.getChild$ui_release();
        }
        while(modifier$Node0 != null) {
            if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                function10.invoke(modifier$Node0);
            }
            modifier$Node0 = modifier$Node0.getChild$ui_release();
        }
    }

    public static void visitLocalDescendants$default(DelegatableNode delegatableNode0, int v, boolean z, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode();
        if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) == 0) {
            return;
        }
        if(!z) {
            modifier$Node0 = modifier$Node0.getChild$ui_release();
        }
        while(modifier$Node0 != null) {
            if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                function10.invoke(modifier$Node0);
            }
            modifier$Node0 = modifier$Node0.getChild$ui_release();
        }
    }

    public static final void visitLocalDescendants-6rFNWt0(DelegatableNode delegatableNode0, int v, Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode();
        if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) != 0) {
            for(Node modifier$Node1 = modifier$Node0.getChild$ui_release(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.getChild$ui_release()) {
                if((modifier$Node1.getKindSet$ui_release() & v) != 0) {
                    for(Node modifier$Node2 = modifier$Node1; modifier$Node2 != null; modifier$Node2 = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        function10.invoke(modifier$Node2);
                    }
                }
            }
        }
    }

    public static final void visitSelfAndAncestors-5BbP62I(DelegatableNode delegatableNode0, int v, int v1, Function1 function10) {
        Node modifier$Node0 = delegatableNode0.getNode();
        int v2 = v | v1;
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node1 = delegatableNode0.getNode();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & v2) != 0) {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & v2) != 0) {
                        if(modifier$Node1 != modifier$Node0 && (modifier$Node1.getKindSet$ui_release() & v1) != 0) {
                            return;
                        }
                        if((modifier$Node1.getKindSet$ui_release() & v) != 0) {
                            for(Node modifier$Node2 = modifier$Node1; modifier$Node2 != null; modifier$Node2 = DelegatableNodeKt.access$pop(null)) {
                                Intrinsics.reifiedOperationMarker(3, "T");
                                function10.invoke(modifier$Node2);
                            }
                        }
                    }
                    modifier$Node1 = modifier$Node1.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node1 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node1 = null;
        }
    }

    public static final void visitSelfAndChildren-6rFNWt0(DelegatableNode delegatableNode0, int v, Function1 function10) {
        for(Node modifier$Node0 = delegatableNode0.getNode(); modifier$Node0 != null; modifier$Node0 = DelegatableNodeKt.access$pop(null)) {
            Intrinsics.reifiedOperationMarker(3, "T");
            function10.invoke(modifier$Node0);
        }
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node1 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node1 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node1);
        }
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node2 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node2.getAggregateChildKindSet$ui_release() & v) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node2);
            }
            else {
                while(modifier$Node2 != null) {
                    if((modifier$Node2.getKindSet$ui_release() & v) != 0) {
                        while(modifier$Node2 != null) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function10.invoke(modifier$Node2);
                            modifier$Node2 = DelegatableNodeKt.access$pop(null);
                        }
                        break;
                    }
                    modifier$Node2 = modifier$Node2.getChild$ui_release();
                }
            }
        }
    }

    public static final void visitSelfAndLocalDescendants-6rFNWt0(DelegatableNode delegatableNode0, int v, Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode();
        if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) != 0) {
            while(modifier$Node0 != null) {
                if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                    for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        function10.invoke(modifier$Node1);
                    }
                }
                modifier$Node0 = modifier$Node0.getChild$ui_release();
            }
        }
    }

    public static final void visitSubtree(@NotNull DelegatableNode delegatableNode0, int v, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        NestedVectorStack nestedVectorStack0 = new NestedVectorStack();
        while(layoutNode0 != null) {
            if(modifier$Node0 == null) {
                modifier$Node0 = layoutNode0.getNodes$ui_release().getHead$ui_release();
            }
            if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        function10.invoke(modifier$Node0);
                    }
                    modifier$Node0 = modifier$Node0.getChild$ui_release();
                }
            }
            nestedVectorStack0.push(layoutNode0.get_children$ui_release());
            modifier$Node0 = null;
            layoutNode0 = nestedVectorStack0.isNotEmpty() ? ((LayoutNode)nestedVectorStack0.pop()) : null;
        }
    }

    public static final void visitSubtree-6rFNWt0(DelegatableNode delegatableNode0, int v, Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        NestedVectorStack nestedVectorStack0 = new NestedVectorStack();
        while(layoutNode0 != null) {
            if(modifier$Node0 == null) {
                modifier$Node0 = layoutNode0.getNodes$ui_release().getHead$ui_release();
            }
            if((modifier$Node0.getAggregateChildKindSet$ui_release() & v) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & v) != 0) {
                        for(Node modifier$Node1 = modifier$Node0; modifier$Node1 != null; modifier$Node1 = DelegatableNodeKt.access$pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            function10.invoke(modifier$Node1);
                        }
                    }
                    modifier$Node0 = modifier$Node0.getChild$ui_release();
                }
            }
            nestedVectorStack0.push(layoutNode0.get_children$ui_release());
            layoutNode0 = nestedVectorStack0.isNotEmpty() ? ((LayoutNode)nestedVectorStack0.pop()) : null;
            modifier$Node0 = null;
        }
    }

    public static final void visitSubtreeIf(@NotNull DelegatableNode delegatableNode0, int v, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
    label_8:
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & v) != 0) {
                Node modifier$Node2 = modifier$Node1;
                while(modifier$Node2 != null) {
                    if((modifier$Node2.getKindSet$ui_release() & v) != 0 && !((Boolean)function10.invoke(modifier$Node2)).booleanValue()) {
                        continue label_8;
                    }
                    modifier$Node2 = modifier$Node2.getChild$ui_release();
                }
            }
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
        }
    }

    public static final void visitSubtreeIf-6rFNWt0(DelegatableNode delegatableNode0, int v, Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
    label_8:
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & v) != 0) {
                Node modifier$Node2 = modifier$Node1;
                while(modifier$Node2 != null) {
                    if((modifier$Node2.getKindSet$ui_release() & v) != 0) {
                        Node modifier$Node3 = modifier$Node2;
                        while(modifier$Node3 != null) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if(!((Boolean)function10.invoke(modifier$Node3)).booleanValue()) {
                                continue label_8;
                            }
                            modifier$Node3 = DelegatableNodeKt.access$pop(null);
                        }
                    }
                    modifier$Node2 = modifier$Node2.getChild$ui_release();
                }
            }
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
        }
    }
}

