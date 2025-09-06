package androidx.compose.ui.focus;

import aa.r;
import android.view.KeyEvent;
import androidx.activity.c0;
import androidx.collection.MutableLongSet;
import androidx.compose.material3.v6;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import o1.e;
import o1.f;
import o1.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u00AC\u0001\u0012\u0018\u0010\u0005\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012:\u0010\u000E\u001A6\u0012\u0015\u0012\u0013\u0018\u00010\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000B\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006\u0012!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0002\u0012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000E\u0010\u0011\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0003\u0012\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001A\u00020\r2\b\u0010\n\u001A\u0004\u0018\u00010\u00072\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001B\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\u00072\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001F\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J2\u0010\u001F\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\r2\u0006\u0010!\u001A\u00020\r2\u0006\u0010\"\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\u0007H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010\'\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\u0007H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J:\u0010-\u001A\u0004\u0018\u00010\r2\u0006\u0010\n\u001A\u00020\u00072\b\u0010(\u001A\u0004\u0018\u00010\u000B2\u0012\u0010*\u001A\u000E\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u0002H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,J(\u00103\u001A\u00020\r2\u0006\u0010/\u001A\u00020.2\f\u00100\u001A\b\u0012\u0004\u0012\u00020\r0\u0003H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u00102J\u001A\u00106\u001A\u00020\r2\u0006\u0010/\u001A\u00020.H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u00105J\u0017\u00109\u001A\u00020\r2\u0006\u00108\u001A\u000207H\u0016\u00A2\u0006\u0004\b9\u0010:J\u0017\u0010<\u001A\u00020\u00042\u0006\u0010;\u001A\u00020)H\u0016\u00A2\u0006\u0004\b<\u0010=J\u0017\u0010<\u001A\u00020\u00042\u0006\u0010;\u001A\u00020>H\u0016\u00A2\u0006\u0004\b<\u0010?J\u0017\u0010<\u001A\u00020\u00042\u0006\u0010;\u001A\u00020@H\u0016\u00A2\u0006\u0004\b<\u0010AJ\u0011\u0010B\u001A\u0004\u0018\u00010\u000BH\u0016\u00A2\u0006\u0004\bB\u0010CR\"\u0010I\u001A\u00020)8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010G\"\u0004\bH\u0010=R\u001A\u0010O\u001A\u00020J8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010NR\u001A\u0010U\u001A\u00020P8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010TR\u0014\u0010Y\u001A\u00020V8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bW\u0010X\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006Z"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusDirection;", "Lkotlin/ParameterName;", "name", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "Landroidx/compose/ui/unit/LayoutDirection;", "onLayoutDirection", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "requestFocusForOwner-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestFocusForOwner", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "takeFocus", "releaseFocus", "()V", "force", "clearFocus", "(Z)V", "refreshFocusEvents", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "moveFocus-3ESFkO8", "(I)Z", "moveFocus", "focusedRect", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "f", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTransactionManager;", "h", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "focusTransactionManager", "Landroidx/compose/ui/Modifier;", "i", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,419:1\n360#1:446\n361#1:463\n363#1:509\n349#1:580\n350#1:652\n351#1:659\n352#1,2:706\n354#1:754\n355#1:761\n360#1:763\n361#1:780\n363#1:826\n349#1:828\n350#1:900\n351#1:907\n352#1,2:954\n354#1:1002\n355#1:1009\n360#1:1011\n361#1:1028\n363#1:1074\n349#1:1076\n350#1:1148\n351#1:1155\n352#1,2:1202\n354#1:1250\n355#1:1257\n59#2,5:420\n64#2,6:428\n43#2,4:434\n47#2,4:441\n1#3:425\n1#3:438\n1#3:449\n1#3:518\n1#3:589\n1#3:766\n1#3:837\n1#3:1014\n1#3:1085\n1#3:1266\n1#3:1429\n1#3:1527\n728#4,2:426\n728#4,2:439\n100#5:445\n100#5:510\n100#5:579\n108#5:762\n108#5:827\n102#5:1010\n102#5:1075\n94#5,7:1488\n94#5:1521\n255#6:447\n62#6:448\n63#6,8:450\n432#6,5:458\n437#6:464\n442#6,2:466\n444#6,8:471\n452#6,9:482\n461#6,8:494\n72#6,7:502\n283#6:511\n251#6,5:512\n62#6:517\n63#6,8:519\n432#6,5:527\n284#6:532\n437#6:533\n442#6,2:535\n444#6,8:540\n452#6,9:551\n461#6,8:563\n72#6,7:571\n286#6:578\n274#6,2:581\n251#6,5:583\n62#6:588\n63#6,8:590\n432#6,5:598\n276#6,3:603\n437#6:606\n442#6,2:608\n444#6,8:613\n452#6,9:624\n461#6,8:636\n72#6,7:644\n279#6:651\n432#6,12:660\n444#6,8:675\n452#6,9:686\n461#6,8:698\n432#6,12:708\n444#6,8:723\n452#6,9:734\n461#6,8:746\n255#6:764\n62#6:765\n63#6,8:767\n432#6,5:775\n437#6:781\n442#6,2:783\n444#6,8:788\n452#6,9:799\n461#6,8:811\n72#6,7:819\n274#6,2:829\n251#6,5:831\n62#6:836\n63#6,8:838\n432#6,5:846\n276#6,3:851\n437#6:854\n442#6,2:856\n444#6,8:861\n452#6,9:872\n461#6,8:884\n72#6,7:892\n279#6:899\n432#6,12:908\n444#6,8:923\n452#6,9:934\n461#6,8:946\n432#6,12:956\n444#6,8:971\n452#6,9:982\n461#6,8:994\n255#6:1012\n62#6:1013\n63#6,8:1015\n432#6,5:1023\n437#6:1029\n442#6,2:1031\n444#6,8:1036\n452#6,9:1047\n461#6,8:1059\n72#6,7:1067\n274#6,2:1077\n251#6,5:1079\n62#6:1084\n63#6,8:1086\n432#6,5:1094\n276#6,3:1099\n437#6:1102\n442#6,2:1104\n444#6,8:1109\n452#6,9:1120\n461#6,8:1132\n72#6,7:1140\n279#6:1147\n432#6,12:1156\n444#6,8:1171\n452#6,9:1182\n461#6,8:1194\n432#6,12:1204\n444#6,8:1219\n452#6,9:1230\n461#6,8:1242\n274#6,2:1258\n251#6,5:1260\n62#6:1265\n63#6,8:1267\n432#6,5:1275\n276#6,3:1280\n437#6:1283\n442#6,2:1285\n444#6,8:1290\n452#6,9:1301\n461#6,8:1313\n72#6,7:1321\n279#6:1328\n432#6,6:1335\n442#6,2:1342\n444#6,8:1347\n452#6,9:1358\n461#6,8:1370\n432#6,6:1378\n442#6,2:1385\n444#6,8:1390\n452#6,9:1401\n461#6,8:1413\n255#6:1427\n62#6:1428\n63#6,8:1430\n432#6,6:1438\n442#6,2:1445\n444#6,8:1450\n452#6,9:1461\n461#6,8:1473\n72#6,7:1481\n193#6,12:1496\n205#6,6:1515\n212#6,3:1523\n197#6:1526\n264#7:465\n264#7:534\n264#7:607\n264#7:782\n264#7:855\n264#7:1030\n264#7:1103\n264#7:1284\n264#7:1341\n264#7:1384\n264#7:1444\n264#7:1522\n245#8,3:468\n248#8,3:491\n245#8,3:537\n248#8,3:560\n245#8,3:610\n248#8,3:633\n245#8,3:672\n248#8,3:695\n245#8,3:720\n248#8,3:743\n245#8,3:785\n248#8,3:808\n245#8,3:858\n248#8,3:881\n245#8,3:920\n248#8,3:943\n245#8,3:968\n248#8,3:991\n245#8,3:1033\n248#8,3:1056\n245#8,3:1106\n248#8,3:1129\n245#8,3:1168\n248#8,3:1191\n245#8,3:1216\n248#8,3:1239\n245#8,3:1287\n248#8,3:1310\n245#8,3:1344\n248#8,3:1367\n245#8,3:1387\n248#8,3:1410\n245#8,3:1447\n248#8,3:1470\n1208#9:479\n1187#9,2:480\n1208#9:548\n1187#9,2:549\n1208#9:621\n1187#9,2:622\n1208#9:683\n1187#9,2:684\n1208#9:731\n1187#9,2:732\n1208#9:796\n1187#9,2:797\n1208#9:869\n1187#9,2:870\n1208#9:931\n1187#9,2:932\n1208#9:979\n1187#9,2:980\n1208#9:1044\n1187#9,2:1045\n1208#9:1117\n1187#9,2:1118\n1208#9:1179\n1187#9,2:1180\n1208#9:1227\n1187#9,2:1228\n1208#9:1298\n1187#9,2:1299\n1208#9:1355\n1187#9,2:1356\n1208#9:1398\n1187#9,2:1399\n1208#9:1458\n1187#9,2:1459\n51#10,6:653\n33#10,6:755\n51#10,6:901\n33#10,6:1003\n51#10,6:1149\n33#10,6:1251\n51#10,6:1329\n33#10,6:1421\n51#11:1495\n42#12,7:1508\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n268#1:446\n268#1:463\n268#1:509\n271#1:580\n271#1:652\n271#1:659\n271#1:706,2\n271#1:754\n271#1:761\n287#1:763\n287#1:780\n287#1:826\n289#1:828\n289#1:900\n289#1:907\n289#1:954,2\n289#1:1002\n289#1:1009\n307#1:1011\n307#1:1028\n307#1:1074\n309#1:1076\n309#1:1148\n309#1:1155\n309#1:1202,2\n309#1:1250\n309#1:1257\n148#1:420,5\n148#1:428,6\n177#1:434,4\n177#1:441,4\n148#1:425\n177#1:438\n268#1:449\n269#1:518\n271#1:589\n287#1:766\n289#1:837\n307#1:1014\n309#1:1085\n349#1:1266\n360#1:1429\n148#1:426,2\n177#1:439,2\n268#1:445\n269#1:510\n272#1:579\n287#1:762\n290#1:827\n307#1:1010\n310#1:1075\n378#1:1488,7\n379#1:1521\n268#1:447\n268#1:448\n268#1:450,8\n268#1:458,5\n268#1:464\n268#1:466,2\n268#1:471,8\n268#1:482,9\n268#1:494,8\n268#1:502,7\n269#1:511\n269#1:512,5\n269#1:517\n269#1:519,8\n269#1:527,5\n269#1:532\n269#1:533\n269#1:535,2\n269#1:540,8\n269#1:551,9\n269#1:563,8\n269#1:571,7\n269#1:578\n271#1:581,2\n271#1:583,5\n271#1:588\n271#1:590,8\n271#1:598,5\n271#1:603,3\n271#1:606\n271#1:608,2\n271#1:613,8\n271#1:624,9\n271#1:636,8\n271#1:644,7\n271#1:651\n271#1:660,12\n271#1:675,8\n271#1:686,9\n271#1:698,8\n271#1:708,12\n271#1:723,8\n271#1:734,9\n271#1:746,8\n287#1:764\n287#1:765\n287#1:767,8\n287#1:775,5\n287#1:781\n287#1:783,2\n287#1:788,8\n287#1:799,9\n287#1:811,8\n287#1:819,7\n289#1:829,2\n289#1:831,5\n289#1:836\n289#1:838,8\n289#1:846,5\n289#1:851,3\n289#1:854\n289#1:856,2\n289#1:861,8\n289#1:872,9\n289#1:884,8\n289#1:892,7\n289#1:899\n289#1:908,12\n289#1:923,8\n289#1:934,9\n289#1:946,8\n289#1:956,12\n289#1:971,8\n289#1:982,9\n289#1:994,8\n307#1:1012\n307#1:1013\n307#1:1015,8\n307#1:1023,5\n307#1:1029\n307#1:1031,2\n307#1:1036,8\n307#1:1047,9\n307#1:1059,8\n307#1:1067,7\n309#1:1077,2\n309#1:1079,5\n309#1:1084\n309#1:1086,8\n309#1:1094,5\n309#1:1099,3\n309#1:1102\n309#1:1104,2\n309#1:1109,8\n309#1:1120,9\n309#1:1132,8\n309#1:1140,7\n309#1:1147\n309#1:1156,12\n309#1:1171,8\n309#1:1182,9\n309#1:1194,8\n309#1:1204,12\n309#1:1219,8\n309#1:1230,9\n309#1:1242,8\n349#1:1258,2\n349#1:1260,5\n349#1:1265\n349#1:1267,8\n349#1:1275,5\n349#1:1280,3\n349#1:1283\n349#1:1285,2\n349#1:1290,8\n349#1:1301,9\n349#1:1313,8\n349#1:1321,7\n349#1:1328\n351#1:1335,6\n351#1:1342,2\n351#1:1347,8\n351#1:1358,9\n351#1:1370,8\n353#1:1378,6\n353#1:1385,2\n353#1:1390,8\n353#1:1401,9\n353#1:1413,8\n360#1:1427\n360#1:1428\n360#1:1430,8\n360#1:1438,6\n360#1:1445,2\n360#1:1450,8\n360#1:1461,9\n360#1:1473,8\n360#1:1481,7\n378#1:1496,12\n378#1:1515,6\n378#1:1523,3\n378#1:1526\n268#1:465\n269#1:534\n271#1:607\n287#1:782\n289#1:855\n307#1:1030\n309#1:1103\n349#1:1284\n351#1:1341\n353#1:1384\n360#1:1444\n379#1:1522\n268#1:468,3\n268#1:491,3\n269#1:537,3\n269#1:560,3\n271#1:610,3\n271#1:633,3\n271#1:672,3\n271#1:695,3\n271#1:720,3\n271#1:743,3\n287#1:785,3\n287#1:808,3\n289#1:858,3\n289#1:881,3\n289#1:920,3\n289#1:943,3\n289#1:968,3\n289#1:991,3\n307#1:1033,3\n307#1:1056,3\n309#1:1106,3\n309#1:1129,3\n309#1:1168,3\n309#1:1191,3\n309#1:1216,3\n309#1:1239,3\n349#1:1287,3\n349#1:1310,3\n351#1:1344,3\n351#1:1367,3\n353#1:1387,3\n353#1:1410,3\n360#1:1447,3\n360#1:1470,3\n268#1:479\n268#1:480,2\n269#1:548\n269#1:549,2\n271#1:621\n271#1:622,2\n271#1:683\n271#1:684,2\n271#1:731\n271#1:732,2\n287#1:796\n287#1:797,2\n289#1:869\n289#1:870,2\n289#1:931\n289#1:932,2\n289#1:979\n289#1:980,2\n307#1:1044\n307#1:1045,2\n309#1:1117\n309#1:1118,2\n309#1:1179\n309#1:1180,2\n309#1:1227\n309#1:1228,2\n349#1:1298\n349#1:1299,2\n351#1:1355\n351#1:1356,2\n353#1:1398\n353#1:1399,2\n360#1:1458\n360#1:1459,2\n271#1:653,6\n271#1:755,6\n289#1:901,6\n289#1:1003,6\n309#1:1149,6\n309#1:1251,6\n350#1:1329,6\n354#1:1421,6\n378#1:1495\n378#1:1508,7\n*E\n"})
public final class FocusOwnerImpl implements FocusOwner {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[CustomDestinationResult.values().length];
            try {
                arr_v[CustomDestinationResult.Redirected.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CustomDestinationResult.Cancelled.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CustomDestinationResult.None.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final Function2 a;
    public final Function1 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public FocusTargetNode f;
    public final FocusInvalidationManager g;
    public final FocusTransactionManager h;
    public final Modifier i;
    public MutableLongSet j;

    public FocusOwnerImpl(@NotNull Function1 function10, @NotNull Function2 function20, @NotNull Function1 function11, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02) {
        this.a = function20;
        this.b = function11;
        this.c = function00;
        this.d = function01;
        this.e = function02;
        this.f = new FocusTargetNode();
        this.g = new FocusInvalidationManager(function10, new c0(0, this, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 11));
        this.h = new FocusTransactionManager();
        this.i = FocusPropertiesKt.focusProperties(Modifier.Companion, f.x).then(new ModifierNodeElement() {
            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public Node create() {
                return this.create();
            }

            @NotNull
            public FocusTargetNode create() {
                return this.b.getRootFocusNode$ui_release();
            }

            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(@Nullable Object object0) {
                return object0 == this;
            }

            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return this.b.getRootFocusNode$ui_release().hashCode();
            }

            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("RootFocusTarget");
            }

            @Override  // androidx.compose.ui.node.ModifierNodeElement
            public void update(Node modifier$Node0) {
            }

            public void update(@NotNull FocusTargetNode focusTargetNode0) {
            }
        });
    }

    public static final void access$invalidateOwnerFocusState(FocusOwnerImpl focusOwnerImpl0) {
        if(focusOwnerImpl0.f.getFocusState() == FocusStateImpl.Inactive) {
            focusOwnerImpl0.c.invoke();
        }
    }

    @Override  // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z) {
        this.clearFocus-I7lrPNg(z, true, true, 8);
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public boolean clearFocus-I7lrPNg(boolean z, boolean z1, boolean z2, int v) {
        FocusTransactionManager focusTransactionManager0;
        boolean z3;
        try {
            focusTransactionManager0 = this.getFocusTransactionManager();
            if(FocusTransactionManager.access$getOngoingTransaction$p(focusTransactionManager0)) {
                FocusTransactionManager.access$cancelTransaction(focusTransactionManager0);
            }
            FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
            e e0 = e.y;
            if(e0 != null) {
                FocusTransactionManager.access$getCancellationListener$p(focusTransactionManager0).add(e0);
            }
            if(z) {
                z3 = FocusTransactionsKt.clearFocus(this.f, true, z1);
            }
            else {
                switch(WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.performCustomClearFocus-Mxy_nc0(this.f, v).ordinal()]) {
                    case 1: 
                    case 2: 
                    case 3: {
                        z3 = false;
                        break;
                    }
                    default: {
                        z3 = FocusTransactionsKt.clearFocus(this.f, false, z1);
                    }
                }
            }
        }
        finally {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
        }
        if(z3 && z2) {
            this.c.invoke();
        }
        return z3;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchInterceptedSoftKeyboardEvent-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        DelegatableNode delegatableNode0;
        Node modifier$Node1;
        if(this.g.hasPendingInvalidation()) {
            throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
        }
        FocusTargetNode focusTargetNode0 = FocusTraversalKt.findActiveFocusNode(this.f);
        if(focusTargetNode0 == null) {
            delegatableNode0 = null;
        }
        else {
            if(!focusTargetNode0.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Node modifier$Node0 = focusTargetNode0.getNode();
            LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
        alab1:
            while(true) {
                modifier$Node1 = null;
                if(layoutNode0 == null) {
                    break;
                }
                if((q.e(layoutNode0) & 0x20000) != 0) {
                    while(modifier$Node0 != null) {
                        if((modifier$Node0.getKindSet$ui_release() & 0x20000) != 0) {
                            MutableVector mutableVector0 = null;
                            modifier$Node1 = modifier$Node0;
                            while(modifier$Node1 != null) {
                                if(modifier$Node1 instanceof SoftKeyboardInterceptionModifierNode) {
                                    break alab1;
                                }
                                if((modifier$Node1.getKindSet$ui_release() & 0x20000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                    Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                    int v = 0;
                                    while(modifier$Node2 != null) {
                                        if((modifier$Node2.getKindSet$ui_release() & 0x20000) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                modifier$Node1 = modifier$Node2;
                                            }
                                            else {
                                                if(mutableVector0 == null) {
                                                    mutableVector0 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node1 != null) {
                                                    mutableVector0.add(modifier$Node1);
                                                    modifier$Node1 = null;
                                                }
                                                mutableVector0.add(modifier$Node2);
                                            }
                                        }
                                        modifier$Node2 = modifier$Node2.getChild$ui_release();
                                    }
                                    if(v != 1) {
                                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                    }
                                }
                                else {
                                    modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                }
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
            delegatableNode0 = (SoftKeyboardInterceptionModifierNode)modifier$Node1;
        }
        if(delegatableNode0 != null) {
            if(!delegatableNode0.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Node modifier$Node3 = delegatableNode0.getNode().getParent$ui_release();
            LayoutNode layoutNode1 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
            List list0 = null;
            while(layoutNode1 != null) {
                if((q.e(layoutNode1) & 0x20000) != 0) {
                    while(modifier$Node3 != null) {
                        if((modifier$Node3.getKindSet$ui_release() & 0x20000) != 0) {
                            Node modifier$Node4 = modifier$Node3;
                            MutableVector mutableVector1 = null;
                            while(modifier$Node4 != null) {
                                if(modifier$Node4 instanceof SoftKeyboardInterceptionModifierNode) {
                                    if(list0 == null) {
                                        list0 = new ArrayList();
                                    }
                                    list0.add(modifier$Node4);
                                }
                                else if((modifier$Node4.getKindSet$ui_release() & 0x20000) != 0 && modifier$Node4 instanceof DelegatingNode) {
                                    Node modifier$Node5 = ((DelegatingNode)modifier$Node4).getDelegate$ui_release();
                                    int v1 = 0;
                                    while(modifier$Node5 != null) {
                                        if((modifier$Node5.getKindSet$ui_release() & 0x20000) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
                                                modifier$Node4 = modifier$Node5;
                                            }
                                            else {
                                                if(mutableVector1 == null) {
                                                    mutableVector1 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node4 != null) {
                                                    mutableVector1.add(modifier$Node4);
                                                    modifier$Node4 = null;
                                                }
                                                mutableVector1.add(modifier$Node5);
                                            }
                                        }
                                        modifier$Node5 = modifier$Node5.getChild$ui_release();
                                    }
                                    if(v1 != 1) {
                                        goto label_85;
                                    }
                                    continue;
                                }
                            label_85:
                                modifier$Node4 = DelegatableNodeKt.access$pop(mutableVector1);
                            }
                        }
                        modifier$Node3 = modifier$Node3.getParent$ui_release();
                    }
                }
                layoutNode1 = layoutNode1.getParent$ui_release();
                if(layoutNode1 != null) {
                    NodeChain nodeChain1 = layoutNode1.getNodes$ui_release();
                    if(nodeChain1 != null) {
                        modifier$Node3 = nodeChain1.getTail$ui_release();
                        continue;
                    }
                }
                modifier$Node3 = null;
            }
            if(list0 != null) {
                int v2 = list0.size() - 1;
                if(v2 >= 0) {
                    while(true) {
                        if(((SoftKeyboardInterceptionModifierNode)list0.get(v2)).onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(keyEvent0)) {
                            return true;
                        }
                        if(v2 - 1 < 0) {
                            break;
                        }
                        --v2;
                    }
                }
            }
            Node modifier$Node6 = delegatableNode0.getNode();
            MutableVector mutableVector2 = null;
            while(modifier$Node6 != null) {
                if(modifier$Node6 instanceof SoftKeyboardInterceptionModifierNode) {
                    if(((SoftKeyboardInterceptionModifierNode)modifier$Node6).onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(keyEvent0)) {
                        return true;
                    }
                }
                else if((modifier$Node6.getKindSet$ui_release() & 0x20000) != 0 && modifier$Node6 instanceof DelegatingNode) {
                    Node modifier$Node7 = ((DelegatingNode)modifier$Node6).getDelegate$ui_release();
                    int v3 = 0;
                    while(modifier$Node7 != null) {
                        if((modifier$Node7.getKindSet$ui_release() & 0x20000) != 0) {
                            ++v3;
                            if(v3 == 1) {
                                modifier$Node6 = modifier$Node7;
                            }
                            else {
                                if(mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Node[16], 0);
                                }
                                if(modifier$Node6 != null) {
                                    mutableVector2.add(modifier$Node6);
                                    modifier$Node6 = null;
                                }
                                mutableVector2.add(modifier$Node7);
                            }
                        }
                        modifier$Node7 = modifier$Node7.getChild$ui_release();
                    }
                    if(v3 != 1) {
                        goto label_129;
                    }
                    continue;
                }
            label_129:
                modifier$Node6 = DelegatableNodeKt.access$pop(mutableVector2);
            }
            Node modifier$Node8 = delegatableNode0.getNode();
            MutableVector mutableVector3 = null;
            while(modifier$Node8 != null) {
                if(modifier$Node8 instanceof SoftKeyboardInterceptionModifierNode) {
                    if(((SoftKeyboardInterceptionModifierNode)modifier$Node8).onInterceptKeyBeforeSoftKeyboard-ZmokQxo(keyEvent0)) {
                        return true;
                    }
                }
                else if((modifier$Node8.getKindSet$ui_release() & 0x20000) != 0 && modifier$Node8 instanceof DelegatingNode) {
                    Node modifier$Node9 = ((DelegatingNode)modifier$Node8).getDelegate$ui_release();
                    int v4 = 0;
                    while(modifier$Node9 != null) {
                        if((modifier$Node9.getKindSet$ui_release() & 0x20000) != 0) {
                            ++v4;
                            if(v4 == 1) {
                                modifier$Node8 = modifier$Node9;
                            }
                            else {
                                if(mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Node[16], 0);
                                }
                                if(modifier$Node8 != null) {
                                    mutableVector3.add(modifier$Node8);
                                    modifier$Node8 = null;
                                }
                                mutableVector3.add(modifier$Node9);
                            }
                        }
                        modifier$Node9 = modifier$Node9.getChild$ui_release();
                    }
                    if(v4 != 1) {
                        goto label_155;
                    }
                    continue;
                }
            label_155:
                modifier$Node8 = DelegatableNodeKt.access$pop(mutableVector3);
            }
            if(list0 != null) {
                int v5 = list0.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    if(((SoftKeyboardInterceptionModifierNode)list0.get(v6)).onInterceptKeyBeforeSoftKeyboard-ZmokQxo(keyEvent0)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchKeyEvent-YhN2O0w(@NotNull KeyEvent keyEvent0, @NotNull Function0 function00) {
        Node modifier$Node6;
        Node modifier$Node3;
        DelegatableNode delegatableNode0;
        if(this.g.hasPendingInvalidation()) {
            throw new IllegalStateException("Dispatching key event while focus system is invalidated.");
        }
        long v = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
        int v1 = KeyEvent_androidKt.getType-ZmokQxo(keyEvent0);
        if(KeyEventType.equals-impl0(v1, 2)) {
            MutableLongSet mutableLongSet0 = this.j;
            if(mutableLongSet0 == null) {
                mutableLongSet0 = new MutableLongSet(3);
                this.j = mutableLongSet0;
            }
            mutableLongSet0.plusAssign(v);
        }
        else if(KeyEventType.equals-impl0(v1, 1)) {
            if(this.j == null || !this.j.contains(v)) {
                return false;
            }
            MutableLongSet mutableLongSet1 = this.j;
            if(mutableLongSet1 != null) {
                mutableLongSet1.remove(v);
            }
        }
        FocusTargetNode focusTargetNode0 = FocusTraversalKt.findActiveFocusNode(this.f);
        if(focusTargetNode0 == null) {
        label_34:
            if(focusTargetNode0 != null) {
                if(!focusTargetNode0.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                Node modifier$Node2 = focusTargetNode0.getNode();
                LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
            alab1:
                while(true) {
                    modifier$Node3 = null;
                    if(layoutNode0 == null) {
                        break;
                    }
                    if((q.e(layoutNode0) & 0x2000) != 0) {
                        while(modifier$Node2 != null) {
                            if((modifier$Node2.getKindSet$ui_release() & 0x2000) != 0) {
                                MutableVector mutableVector0 = null;
                                modifier$Node3 = modifier$Node2;
                                while(modifier$Node3 != null) {
                                    if(modifier$Node3 instanceof KeyInputModifierNode) {
                                        break alab1;
                                    }
                                    if((modifier$Node3.getKindSet$ui_release() & 0x2000) != 0 && modifier$Node3 instanceof DelegatingNode) {
                                        Node modifier$Node4 = ((DelegatingNode)modifier$Node3).getDelegate$ui_release();
                                        int v2 = 0;
                                        while(modifier$Node4 != null) {
                                            if((modifier$Node4.getKindSet$ui_release() & 0x2000) != 0) {
                                                ++v2;
                                                if(v2 == 1) {
                                                    modifier$Node3 = modifier$Node4;
                                                }
                                                else {
                                                    if(mutableVector0 == null) {
                                                        mutableVector0 = new MutableVector(new Node[16], 0);
                                                    }
                                                    if(modifier$Node3 != null) {
                                                        mutableVector0.add(modifier$Node3);
                                                        modifier$Node3 = null;
                                                    }
                                                    mutableVector0.add(modifier$Node4);
                                                }
                                            }
                                            modifier$Node4 = modifier$Node4.getChild$ui_release();
                                        }
                                        if(v2 != 1) {
                                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector0);
                                        }
                                    }
                                    else {
                                        modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector0);
                                    }
                                }
                            }
                            modifier$Node2 = modifier$Node2.getParent$ui_release();
                        }
                    }
                    layoutNode0 = layoutNode0.getParent$ui_release();
                    if(layoutNode0 != null) {
                        NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                        if(nodeChain0 != null) {
                            modifier$Node2 = nodeChain0.getTail$ui_release();
                            continue;
                        }
                    }
                    modifier$Node2 = null;
                }
                if(((KeyInputModifierNode)modifier$Node3) != null) {
                    delegatableNode0 = ((KeyInputModifierNode)modifier$Node3).getNode();
                    goto label_130;
                }
            }
            FocusTargetNode focusTargetNode1 = this.f;
            if(!focusTargetNode1.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Node modifier$Node5 = focusTargetNode1.getNode().getParent$ui_release();
            LayoutNode layoutNode1 = DelegatableNodeKt.requireLayoutNode(focusTargetNode1);
        alab2:
            while(true) {
                modifier$Node6 = null;
                if(layoutNode1 == null) {
                    break;
                }
                if((q.e(layoutNode1) & 0x2000) != 0) {
                    while(modifier$Node5 != null) {
                        if((modifier$Node5.getKindSet$ui_release() & 0x2000) != 0) {
                            MutableVector mutableVector1 = null;
                            modifier$Node6 = modifier$Node5;
                            while(modifier$Node6 != null) {
                                if(modifier$Node6 instanceof KeyInputModifierNode) {
                                    break alab2;
                                }
                                if((modifier$Node6.getKindSet$ui_release() & 0x2000) != 0 && modifier$Node6 instanceof DelegatingNode) {
                                    Node modifier$Node7 = ((DelegatingNode)modifier$Node6).getDelegate$ui_release();
                                    int v3 = 0;
                                    while(modifier$Node7 != null) {
                                        if((modifier$Node7.getKindSet$ui_release() & 0x2000) != 0) {
                                            ++v3;
                                            if(v3 == 1) {
                                                modifier$Node6 = modifier$Node7;
                                            }
                                            else {
                                                if(mutableVector1 == null) {
                                                    mutableVector1 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node6 != null) {
                                                    mutableVector1.add(modifier$Node6);
                                                    modifier$Node6 = null;
                                                }
                                                mutableVector1.add(modifier$Node7);
                                            }
                                        }
                                        modifier$Node7 = modifier$Node7.getChild$ui_release();
                                    }
                                    if(v3 != 1) {
                                        modifier$Node6 = DelegatableNodeKt.access$pop(mutableVector1);
                                    }
                                }
                                else {
                                    modifier$Node6 = DelegatableNodeKt.access$pop(mutableVector1);
                                }
                            }
                        }
                        modifier$Node5 = modifier$Node5.getParent$ui_release();
                    }
                }
                layoutNode1 = layoutNode1.getParent$ui_release();
                if(layoutNode1 != null) {
                    NodeChain nodeChain1 = layoutNode1.getNodes$ui_release();
                    if(nodeChain1 != null) {
                        modifier$Node5 = nodeChain1.getTail$ui_release();
                        continue;
                    }
                }
                modifier$Node5 = null;
            }
            delegatableNode0 = ((KeyInputModifierNode)modifier$Node6) == null ? null : ((KeyInputModifierNode)modifier$Node6).getNode();
        }
        else {
            if(!focusTargetNode0.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Node modifier$Node0 = focusTargetNode0.getNode();
            if((modifier$Node0.getAggregateChildKindSet$ui_release() & 0x2400) == 0) {
                delegatableNode0 = null;
            }
            else {
                Node modifier$Node1 = modifier$Node0.getChild$ui_release();
                delegatableNode0 = null;
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x2400) != 0) {
                        if((0x400 & modifier$Node1.getKindSet$ui_release()) != 0) {
                            break;
                        }
                        delegatableNode0 = modifier$Node1;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
            if(delegatableNode0 == null) {
                goto label_34;
            }
        }
    label_130:
        if(delegatableNode0 != null) {
            if(!delegatableNode0.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Node modifier$Node8 = delegatableNode0.getNode().getParent$ui_release();
            LayoutNode layoutNode2 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
            List list0 = null;
            while(layoutNode2 != null) {
                if((q.e(layoutNode2) & 0x2000) != 0) {
                    while(modifier$Node8 != null) {
                        if((modifier$Node8.getKindSet$ui_release() & 0x2000) != 0) {
                            Node modifier$Node9 = modifier$Node8;
                            MutableVector mutableVector2 = null;
                            while(modifier$Node9 != null) {
                                if(modifier$Node9 instanceof KeyInputModifierNode) {
                                    if(list0 == null) {
                                        list0 = new ArrayList();
                                    }
                                    list0.add(modifier$Node9);
                                }
                                else if((modifier$Node9.getKindSet$ui_release() & 0x2000) != 0 && modifier$Node9 instanceof DelegatingNode) {
                                    Node modifier$Node10 = ((DelegatingNode)modifier$Node9).getDelegate$ui_release();
                                    int v4 = 0;
                                    while(modifier$Node10 != null) {
                                        if((modifier$Node10.getKindSet$ui_release() & 0x2000) != 0) {
                                            ++v4;
                                            if(v4 == 1) {
                                                modifier$Node9 = modifier$Node10;
                                            }
                                            else {
                                                if(mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node9 != null) {
                                                    mutableVector2.add(modifier$Node9);
                                                    modifier$Node9 = null;
                                                }
                                                mutableVector2.add(modifier$Node10);
                                            }
                                        }
                                        modifier$Node10 = modifier$Node10.getChild$ui_release();
                                    }
                                    if(v4 != 1) {
                                        goto label_165;
                                    }
                                    continue;
                                }
                            label_165:
                                modifier$Node9 = DelegatableNodeKt.access$pop(mutableVector2);
                            }
                        }
                        modifier$Node8 = modifier$Node8.getParent$ui_release();
                    }
                }
                layoutNode2 = layoutNode2.getParent$ui_release();
                if(layoutNode2 != null) {
                    NodeChain nodeChain2 = layoutNode2.getNodes$ui_release();
                    if(nodeChain2 != null) {
                        modifier$Node8 = nodeChain2.getTail$ui_release();
                        continue;
                    }
                }
                modifier$Node8 = null;
            }
            if(list0 != null) {
                int v5 = list0.size() - 1;
                if(v5 >= 0) {
                    while(true) {
                        if(((KeyInputModifierNode)list0.get(v5)).onPreKeyEvent-ZmokQxo(keyEvent0)) {
                            return true;
                        }
                        if(v5 - 1 < 0) {
                            break;
                        }
                        --v5;
                    }
                }
            }
            Node modifier$Node11 = delegatableNode0.getNode();
            MutableVector mutableVector3 = null;
            while(modifier$Node11 != null) {
                if(modifier$Node11 instanceof KeyInputModifierNode) {
                    if(((KeyInputModifierNode)modifier$Node11).onPreKeyEvent-ZmokQxo(keyEvent0)) {
                        return true;
                    }
                }
                else if((modifier$Node11.getKindSet$ui_release() & 0x2000) != 0 && modifier$Node11 instanceof DelegatingNode) {
                    Node modifier$Node12 = ((DelegatingNode)modifier$Node11).getDelegate$ui_release();
                    int v6 = 0;
                    while(modifier$Node12 != null) {
                        if((modifier$Node12.getKindSet$ui_release() & 0x2000) != 0) {
                            ++v6;
                            if(v6 == 1) {
                                modifier$Node11 = modifier$Node12;
                            }
                            else {
                                if(mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Node[16], 0);
                                }
                                if(modifier$Node11 != null) {
                                    mutableVector3.add(modifier$Node11);
                                    modifier$Node11 = null;
                                }
                                mutableVector3.add(modifier$Node12);
                            }
                        }
                        modifier$Node12 = modifier$Node12.getChild$ui_release();
                    }
                    if(v6 != 1) {
                        goto label_209;
                    }
                    continue;
                }
            label_209:
                modifier$Node11 = DelegatableNodeKt.access$pop(mutableVector3);
            }
            if(((Boolean)function00.invoke()).booleanValue()) {
                return true;
            }
            Node modifier$Node13 = delegatableNode0.getNode();
            MutableVector mutableVector4 = null;
            while(modifier$Node13 != null) {
                if(modifier$Node13 instanceof KeyInputModifierNode) {
                    if(((KeyInputModifierNode)modifier$Node13).onKeyEvent-ZmokQxo(keyEvent0)) {
                        return true;
                    }
                }
                else if((modifier$Node13.getKindSet$ui_release() & 0x2000) != 0 && modifier$Node13 instanceof DelegatingNode) {
                    Node modifier$Node14 = ((DelegatingNode)modifier$Node13).getDelegate$ui_release();
                    int v7 = 0;
                    while(modifier$Node14 != null) {
                        if((modifier$Node14.getKindSet$ui_release() & 0x2000) != 0) {
                            ++v7;
                            if(v7 == 1) {
                                modifier$Node13 = modifier$Node14;
                            }
                            else {
                                if(mutableVector4 == null) {
                                    mutableVector4 = new MutableVector(new Node[16], 0);
                                }
                                if(modifier$Node13 != null) {
                                    mutableVector4.add(modifier$Node13);
                                    modifier$Node13 = null;
                                }
                                mutableVector4.add(modifier$Node14);
                            }
                        }
                        modifier$Node14 = modifier$Node14.getChild$ui_release();
                    }
                    if(v7 != 1) {
                        goto label_237;
                    }
                    continue;
                }
            label_237:
                modifier$Node13 = DelegatableNodeKt.access$pop(mutableVector4);
            }
            if(list0 != null) {
                int v8 = list0.size();
                for(int v9 = 0; v9 < v8; ++v9) {
                    if(((KeyInputModifierNode)list0.get(v9)).onKeyEvent-ZmokQxo(keyEvent0)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(@NotNull RotaryScrollEvent rotaryScrollEvent0) {
        DelegatableNode delegatableNode0;
        Node modifier$Node1;
        if(this.g.hasPendingInvalidation()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        FocusTargetNode focusTargetNode0 = FocusTraversalKt.findActiveFocusNode(this.f);
        if(focusTargetNode0 == null) {
            delegatableNode0 = null;
        }
        else {
            if(!focusTargetNode0.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Node modifier$Node0 = focusTargetNode0.getNode();
            LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
        alab1:
            while(true) {
                modifier$Node1 = null;
                if(layoutNode0 == null) {
                    break;
                }
                if((q.e(layoutNode0) & 0x4000) != 0) {
                    while(modifier$Node0 != null) {
                        if((modifier$Node0.getKindSet$ui_release() & 0x4000) != 0) {
                            MutableVector mutableVector0 = null;
                            modifier$Node1 = modifier$Node0;
                            while(modifier$Node1 != null) {
                                if(modifier$Node1 instanceof RotaryInputModifierNode) {
                                    break alab1;
                                }
                                if((modifier$Node1.getKindSet$ui_release() & 0x4000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                    Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                    int v = 0;
                                    while(modifier$Node2 != null) {
                                        if((modifier$Node2.getKindSet$ui_release() & 0x4000) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                modifier$Node1 = modifier$Node2;
                                            }
                                            else {
                                                if(mutableVector0 == null) {
                                                    mutableVector0 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node1 != null) {
                                                    mutableVector0.add(modifier$Node1);
                                                    modifier$Node1 = null;
                                                }
                                                mutableVector0.add(modifier$Node2);
                                            }
                                        }
                                        modifier$Node2 = modifier$Node2.getChild$ui_release();
                                    }
                                    if(v != 1) {
                                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                    }
                                }
                                else {
                                    modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                }
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
            delegatableNode0 = (RotaryInputModifierNode)modifier$Node1;
        }
        if(delegatableNode0 != null) {
            if(!delegatableNode0.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Node modifier$Node3 = delegatableNode0.getNode().getParent$ui_release();
            LayoutNode layoutNode1 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
            List list0 = null;
            while(layoutNode1 != null) {
                if((q.e(layoutNode1) & 0x4000) != 0) {
                    while(modifier$Node3 != null) {
                        if((modifier$Node3.getKindSet$ui_release() & 0x4000) != 0) {
                            Node modifier$Node4 = modifier$Node3;
                            MutableVector mutableVector1 = null;
                            while(modifier$Node4 != null) {
                                if(modifier$Node4 instanceof RotaryInputModifierNode) {
                                    if(list0 == null) {
                                        list0 = new ArrayList();
                                    }
                                    list0.add(modifier$Node4);
                                }
                                else if((modifier$Node4.getKindSet$ui_release() & 0x4000) != 0 && modifier$Node4 instanceof DelegatingNode) {
                                    Node modifier$Node5 = ((DelegatingNode)modifier$Node4).getDelegate$ui_release();
                                    int v1 = 0;
                                    while(modifier$Node5 != null) {
                                        if((modifier$Node5.getKindSet$ui_release() & 0x4000) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
                                                modifier$Node4 = modifier$Node5;
                                            }
                                            else {
                                                if(mutableVector1 == null) {
                                                    mutableVector1 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node4 != null) {
                                                    mutableVector1.add(modifier$Node4);
                                                    modifier$Node4 = null;
                                                }
                                                mutableVector1.add(modifier$Node5);
                                            }
                                        }
                                        modifier$Node5 = modifier$Node5.getChild$ui_release();
                                    }
                                    if(v1 != 1) {
                                        goto label_85;
                                    }
                                    continue;
                                }
                            label_85:
                                modifier$Node4 = DelegatableNodeKt.access$pop(mutableVector1);
                            }
                        }
                        modifier$Node3 = modifier$Node3.getParent$ui_release();
                    }
                }
                layoutNode1 = layoutNode1.getParent$ui_release();
                if(layoutNode1 != null) {
                    NodeChain nodeChain1 = layoutNode1.getNodes$ui_release();
                    if(nodeChain1 != null) {
                        modifier$Node3 = nodeChain1.getTail$ui_release();
                        continue;
                    }
                }
                modifier$Node3 = null;
            }
            if(list0 != null) {
                int v2 = list0.size() - 1;
                if(v2 >= 0) {
                    while(true) {
                        if(((RotaryInputModifierNode)list0.get(v2)).onPreRotaryScrollEvent(rotaryScrollEvent0)) {
                            return true;
                        }
                        if(v2 - 1 < 0) {
                            break;
                        }
                        --v2;
                    }
                }
            }
            Node modifier$Node6 = delegatableNode0.getNode();
            MutableVector mutableVector2 = null;
            while(modifier$Node6 != null) {
                if(modifier$Node6 instanceof RotaryInputModifierNode) {
                    if(((RotaryInputModifierNode)modifier$Node6).onPreRotaryScrollEvent(rotaryScrollEvent0)) {
                        return true;
                    }
                }
                else if((modifier$Node6.getKindSet$ui_release() & 0x4000) != 0 && modifier$Node6 instanceof DelegatingNode) {
                    Node modifier$Node7 = ((DelegatingNode)modifier$Node6).getDelegate$ui_release();
                    int v3 = 0;
                    while(modifier$Node7 != null) {
                        if((modifier$Node7.getKindSet$ui_release() & 0x4000) != 0) {
                            ++v3;
                            if(v3 == 1) {
                                modifier$Node6 = modifier$Node7;
                            }
                            else {
                                if(mutableVector2 == null) {
                                    mutableVector2 = new MutableVector(new Node[16], 0);
                                }
                                if(modifier$Node6 != null) {
                                    mutableVector2.add(modifier$Node6);
                                    modifier$Node6 = null;
                                }
                                mutableVector2.add(modifier$Node7);
                            }
                        }
                        modifier$Node7 = modifier$Node7.getChild$ui_release();
                    }
                    if(v3 != 1) {
                        goto label_129;
                    }
                    continue;
                }
            label_129:
                modifier$Node6 = DelegatableNodeKt.access$pop(mutableVector2);
            }
            Node modifier$Node8 = delegatableNode0.getNode();
            MutableVector mutableVector3 = null;
            while(modifier$Node8 != null) {
                if(modifier$Node8 instanceof RotaryInputModifierNode) {
                    if(((RotaryInputModifierNode)modifier$Node8).onRotaryScrollEvent(rotaryScrollEvent0)) {
                        return true;
                    }
                }
                else if((modifier$Node8.getKindSet$ui_release() & 0x4000) != 0 && modifier$Node8 instanceof DelegatingNode) {
                    Node modifier$Node9 = ((DelegatingNode)modifier$Node8).getDelegate$ui_release();
                    int v4 = 0;
                    while(modifier$Node9 != null) {
                        if((modifier$Node9.getKindSet$ui_release() & 0x4000) != 0) {
                            ++v4;
                            if(v4 == 1) {
                                modifier$Node8 = modifier$Node9;
                            }
                            else {
                                if(mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Node[16], 0);
                                }
                                if(modifier$Node8 != null) {
                                    mutableVector3.add(modifier$Node8);
                                    modifier$Node8 = null;
                                }
                                mutableVector3.add(modifier$Node9);
                            }
                        }
                        modifier$Node9 = modifier$Node9.getChild$ui_release();
                    }
                    if(v4 != 1) {
                        goto label_155;
                    }
                    continue;
                }
            label_155:
                modifier$Node8 = DelegatableNodeKt.access$pop(mutableVector3);
            }
            if(list0 != null) {
                int v5 = list0.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    if(((RotaryInputModifierNode)list0.get(v6)).onRotaryScrollEvent(rotaryScrollEvent0)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    @Nullable
    public Boolean focusSearch-ULY8qGw(int v, @Nullable Rect rect0, @NotNull Function1 function10) {
        FocusTargetNode focusTargetNode0 = FocusTraversalKt.findActiveFocusNode(this.f);
        Function0 function00 = this.e;
        if(focusTargetNode0 != null) {
            FocusRequester focusRequester0 = FocusTraversalKt.customFocusSearch--OM-vw8(focusTargetNode0, v, ((LayoutDirection)function00.invoke()));
            Companion focusRequester$Companion0 = FocusRequester.Companion;
            if(Intrinsics.areEqual(focusRequester0, focusRequester$Companion0.getCancel())) {
                return null;
            }
            return Intrinsics.areEqual(focusRequester0, focusRequester$Companion0.getDefault()) ? FocusTraversalKt.focusSearch-0X8WOeE(this.f, v, ((LayoutDirection)function00.invoke()), rect0, new r(focusTargetNode0, this, 14, function10)) : Boolean.valueOf(focusRequester0.findFocusTargetNode$ui_release(function10));
        }
        return FocusTraversalKt.focusSearch-0X8WOeE(this.f, v, ((LayoutDirection)function00.invoke()), rect0, new r(null, this, 14, function10));
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    @Nullable
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNode0 = FocusTraversalKt.findActiveFocusNode(this.f);
        return focusTargetNode0 == null ? null : FocusTraversalKt.focusRect(focusTargetNode0);
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    @NotNull
    public FocusTransactionManager getFocusTransactionManager() {
        return this.h;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    @NotNull
    public Modifier getModifier() {
        return this.i;
    }

    @NotNull
    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.f;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    @NotNull
    public FocusState getRootState() {
        return this.f.getFocusState();
    }

    @Override  // androidx.compose.ui.focus.FocusManager
    public boolean moveFocus-3ESFkO8(int v) {
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = Boolean.FALSE;
        Boolean boolean0 = this.focusSearch-ULY8qGw(v, ((Rect)this.d.invoke()), new g(v, ref$ObjectRef0));
        if(boolean0 != null && ref$ObjectRef0.element != null) {
            if(Intrinsics.areEqual(boolean0, Boolean.TRUE) && Intrinsics.areEqual(ref$ObjectRef0.element, Boolean.TRUE)) {
                return true;
            }
            if(FocusOwnerImplKt.is1dFocusSearch-3ESFkO8(v)) {
                return this.clearFocus-I7lrPNg(false, true, false, v) && this.takeFocus-aToIllA(v, null);
            }
            FocusDirection focusDirection0 = FocusDirection.box-impl(v);
            return ((Boolean)this.b.invoke(focusDirection0)).booleanValue();
        }
        return false;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionManager focusTransactionManager0 = this.getFocusTransactionManager();
        if(FocusTransactionManager.access$getOngoingTransaction$p(focusTransactionManager0)) {
            FocusTransactionsKt.clearFocus(this.f, true, true);
            return;
        }
        try {
            FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
            FocusTransactionsKt.clearFocus(this.f, true, true);
        }
        finally {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
        }
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public boolean requestFocusForOwner-7o62pno(@Nullable FocusDirection focusDirection0, @Nullable Rect rect0) {
        return ((Boolean)this.a.invoke(focusDirection0, rect0)).booleanValue();
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusEventModifierNode focusEventModifierNode0) {
        this.g.scheduleInvalidation(focusEventModifierNode0);
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusPropertiesModifierNode focusPropertiesModifierNode0) {
        this.g.scheduleInvalidation(focusPropertiesModifierNode0);
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(@NotNull FocusTargetNode focusTargetNode0) {
        this.g.scheduleInvalidation(focusTargetNode0);
    }

    public final void setRootFocusNode$ui_release(@NotNull FocusTargetNode focusTargetNode0) {
        this.f = focusTargetNode0;
    }

    @Override  // androidx.compose.ui.focus.FocusOwner
    public boolean takeFocus-aToIllA(int v, @Nullable Rect rect0) {
        Boolean boolean0 = this.focusSearch-ULY8qGw(v, rect0, new v6(v, 9));
        return boolean0 == null ? false : boolean0.booleanValue();
    }
}

