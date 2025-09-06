package androidx.compose.runtime.changelist;

import a5.b;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00B6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001A\u00020\b2\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0019\u001A\u00020\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\'\u0010\u001D\u001A\u00020\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001F\u0010\u001F\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\u001B2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010\"\u001A\u00020\b2\u0006\u0010!\u001A\u00020\u0017\u00A2\u0006\u0004\b\"\u0010#J\r\u0010$\u001A\u00020\b\u00A2\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001A\u00020\b\u00A2\u0006\u0004\b%\u0010\u0003J\u0017\u0010\'\u001A\u00020\b2\b\u0010&\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\'\u0010(J\r\u0010)\u001A\u00020\b\u00A2\u0006\u0004\b)\u0010\u0003J\u0015\u0010*\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b*\u0010+J\r\u0010,\u001A\u00020\b\u00A2\u0006\u0004\b,\u0010\u0003J\r\u0010-\u001A\u00020\b\u00A2\u0006\u0004\b-\u0010\u0003J\r\u0010.\u001A\u00020\b\u00A2\u0006\u0004\b.\u0010\u0003J\u001D\u00101\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b1\u00102J%\u00101\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u00100\u001A\u00020/2\u0006\u00104\u001A\u000203\u00A2\u0006\u0004\b1\u00105J\u0015\u00107\u001A\u00020\b2\u0006\u00106\u001A\u00020\u0017\u00A2\u0006\u0004\b7\u0010#J)\u0010<\u001A\u00020\b2\u0012\u0010:\u001A\u000E\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b082\u0006\u0010;\u001A\u000209\u00A2\u0006\u0004\b<\u0010=J\u0017\u0010?\u001A\u00020\b2\b\u0010>\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b?\u0010(J@\u0010E\u001A\u00020\b\"\u0004\b\u0000\u0010@\"\u0004\b\u0001\u0010A2\u0006\u0010\u0013\u001A\u00028\u00012\u001D\u0010D\u001A\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0B\u00A2\u0006\u0002\bC\u00A2\u0006\u0004\bE\u0010FJ\u001D\u0010I\u001A\u00020\b2\u0006\u0010G\u001A\u00020\u00172\u0006\u0010H\u001A\u00020\u0017\u00A2\u0006\u0004\bI\u0010JJ%\u0010L\u001A\u00020\b2\u0006\u0010K\u001A\u00020\u00172\u0006\u00100\u001A\u00020\u00172\u0006\u0010!\u001A\u00020\u0017\u00A2\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001A\u00020\b2\u0006\u0010N\u001A\u00020\u0017\u00A2\u0006\u0004\bO\u0010#J\u0015\u0010P\u001A\u00020\b2\u0006\u0010!\u001A\u00020\u0017\u00A2\u0006\u0004\bP\u0010#J\u001D\u0010S\u001A\u00020\b2\u000E\u0010R\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160Q\u00A2\u0006\u0004\bS\u0010TJ\u001B\u0010W\u001A\u00020\b2\f\u0010V\u001A\b\u0012\u0004\u0012\u00020\b0U\u00A2\u0006\u0004\bW\u0010XJ\u001D\u0010[\u001A\u00020\b2\u0006\u0010Z\u001A\u00020Y2\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b[\u0010\\J%\u0010_\u001A\u00020\b2\u000E\u0010R\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160]2\u0006\u0010^\u001A\u00020Y\u00A2\u0006\u0004\b_\u0010`J/\u0010f\u001A\u00020\b2\b\u0010b\u001A\u0004\u0018\u00010a2\u0006\u0010d\u001A\u00020c2\u0006\u00100\u001A\u00020e2\u0006\u0010K\u001A\u00020e\u00A2\u0006\u0004\bf\u0010gJ%\u0010j\u001A\u00020\b2\u0006\u0010;\u001A\u00020h2\u0006\u0010d\u001A\u00020c2\u0006\u0010i\u001A\u00020e\u00A2\u0006\u0004\bj\u0010kJ\r\u0010l\u001A\u00020\b\u00A2\u0006\u0004\bl\u0010\u0003J!\u0010n\u001A\u00020\b2\u0006\u0010m\u001A\u00020\u00002\n\b\u0002\u0010^\u001A\u0004\u0018\u00010Y\u00A2\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001A\u00020p2\u0006\u0010q\u001A\u00020pH\u0016\u00A2\u0006\u0004\br\u0010sR\u0011\u0010v\u001A\u00020\u00178F\u00A2\u0006\u0006\u001A\u0004\bt\u0010u\u00A8\u0006w"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingChanges", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/RememberObserver;", "value", "pushRemember", "(Landroidx/compose/runtime/RememberObserver;)V", "", "", "groupSlotIndex", "pushUpdateValue", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "anchor", "pushUpdateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "pushAppendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "pushTrimValues", "(I)V", "pushResetSlots", "pushDeactivateCurrentGroup", "data", "pushUpdateAuxData", "(Ljava/lang/Object;)V", "pushEnsureRootStarted", "pushEnsureGroupStarted", "(Landroidx/compose/runtime/Anchor;)V", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "from", "pushInsertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "offset", "pushMoveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "pushEndCompositionScope", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "node", "pushUseNode", "T", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "pushUpdateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeFrom", "moveCount", "pushRemoveNode", "(II)V", "to", "pushMoveNode", "(III)V", "distance", "pushAdvanceSlotsBy", "pushUps", "", "nodes", "pushDowns", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "pushSideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "pushDetermineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "effectiveNodeIndex", "pushCopyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "pushCopySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushReleaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "pushEndMovableContentPlacement", "changeList", "pushExecuteOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "", "linePrefix", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 8 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,326:1\n166#2,5:327\n174#2,2:333\n173#2:335\n177#2,25:341\n203#2:367\n166#2,5:368\n174#2,2:375\n173#2:377\n177#2,25:383\n203#2:409\n166#2,5:410\n174#2,2:418\n173#2:420\n177#2,25:426\n203#2:452\n166#2,5:453\n174#2,2:460\n173#2:462\n177#2,25:468\n203#2:494\n166#2,5:495\n174#2,2:501\n173#2:503\n177#2,25:509\n203#2:535\n166#2,5:536\n174#2,2:542\n173#2:544\n177#2,25:550\n203#2:576\n166#2,5:577\n174#2,2:583\n173#2:585\n177#2,25:591\n203#2:617\n166#2,5:618\n174#2,2:625\n173#2:627\n177#2,25:633\n203#2:659\n166#2,5:660\n174#2,2:668\n173#2:670\n177#2,25:676\n203#2:702\n166#2,5:703\n174#2,2:709\n173#2:711\n177#2,25:717\n203#2:743\n166#2,5:744\n174#2,2:751\n173#2:753\n177#2,25:759\n203#2:785\n166#2,5:786\n174#2,2:793\n173#2:795\n177#2,25:801\n203#2:827\n166#2,5:828\n174#2,2:835\n173#2:837\n177#2,25:843\n203#2:869\n166#2,5:870\n174#2,2:878\n173#2:880\n177#2,25:886\n203#2:912\n166#2,5:913\n174#2,2:919\n173#2:921\n177#2,25:927\n203#2:953\n166#2,5:954\n174#2,2:960\n173#2:962\n177#2,25:968\n203#2:994\n166#2,5:995\n174#2,2:1001\n173#2:1003\n177#2,25:1009\n203#2:1035\n166#2,5:1036\n174#2,2:1042\n173#2:1044\n177#2,25:1050\n203#2:1076\n166#2,5:1077\n174#2,2:1084\n173#2:1086\n177#2,25:1092\n203#2:1118\n166#2,5:1119\n174#2,2:1126\n173#2:1128\n177#2,25:1134\n203#2:1160\n166#2,5:1161\n174#2,2:1170\n173#2:1172\n177#2,25:1178\n203#2:1204\n166#2,5:1205\n174#2,2:1213\n173#2:1215\n177#2,25:1221\n203#2:1247\n166#2,5:1248\n174#2,2:1255\n173#2:1257\n177#2,25:1263\n203#2:1289\n152#3:332\n50#4,5:336\n56#4:366\n50#4,5:378\n56#4:408\n50#4,5:421\n56#4:451\n50#4,5:463\n56#4:493\n50#4,5:504\n56#4:534\n50#4,5:545\n56#4:575\n50#4,5:586\n56#4:616\n50#4,5:628\n56#4:658\n50#4,5:671\n56#4:701\n50#4,5:712\n56#4:742\n50#4,5:754\n56#4:784\n50#4,5:796\n56#4:826\n50#4,5:838\n56#4:868\n50#4,5:881\n56#4:911\n50#4,5:922\n56#4:952\n50#4,5:963\n56#4:993\n50#4,5:1004\n56#4:1034\n50#4,5:1045\n56#4:1075\n50#4,5:1087\n56#4:1117\n50#4,5:1129\n56#4:1159\n50#4,5:1173\n56#4:1203\n50#4,5:1216\n56#4:1246\n50#4,5:1258\n56#4:1288\n223#5:373\n224#5:374\n262#6:415\n263#6:416\n264#6:417\n169#7:458\n170#7:459\n193#8:500\n310#9:541\n337#10:582\n501#11:623\n502#11:624\n529#12:665\n530#12:666\n531#12:667\n364#13:708\n401#14:749\n402#14:750\n433#15:791\n434#15:792\n454#16:833\n455#16:834\n477#17:875\n476#17:876\n478#17:877\n116#18:918\n77#19:959\n94#20:1000\n135#21:1041\n646#22:1082\n647#22:1083\n675#23:1124\n674#23:1125\n701#24:1166\n702#24:1167\n704#24:1168\n703#24:1169\n762#25:1210\n763#25:1211\n764#25:1212\n788#26:1253\n789#26:1254\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n84#1:327,5\n84#1:333,2\n84#1:335\n84#1:341,25\n84#1:367\n90#1:368,5\n90#1:375,2\n90#1:377\n90#1:383,25\n90#1:409\n97#1:410,5\n97#1:418,2\n97#1:420\n97#1:426,25\n97#1:452\n105#1:453,5\n105#1:460,2\n105#1:462\n105#1:468,25\n105#1:494\n112#1:495,5\n112#1:501,2\n112#1:503\n112#1:509,25\n112#1:535\n126#1:536,5\n126#1:542,2\n126#1:544\n126#1:550,25\n126#1:576\n136#1:577,5\n136#1:583,2\n136#1:585\n136#1:591,25\n136#1:617\n157#1:618,5\n157#1:625,2\n157#1:627\n157#1:633,25\n157#1:659\n168#1:660,5\n168#1:668,2\n168#1:670\n168#1:676,25\n168#1:702\n178#1:703,5\n178#1:709,2\n178#1:711\n178#1:717,25\n178#1:743\n187#1:744,5\n187#1:751,2\n187#1:753\n187#1:759,25\n187#1:785\n200#1:786,5\n200#1:793,2\n200#1:795\n200#1:801,25\n200#1:827\n208#1:828,5\n208#1:835,2\n208#1:837\n208#1:843,25\n208#1:869\n215#1:870,5\n215#1:878,2\n215#1:880\n215#1:886,25\n215#1:912\n223#1:913,5\n223#1:919,2\n223#1:921\n223#1:927,25\n223#1:953\n229#1:954,5\n229#1:960,2\n229#1:962\n229#1:968,25\n229#1:994\n236#1:995,5\n236#1:1001,2\n236#1:1003\n236#1:1009,25\n236#1:1035\n243#1:1036,5\n243#1:1042,2\n243#1:1044\n243#1:1050,25\n243#1:1076\n252#1:1077,5\n252#1:1084,2\n252#1:1086\n252#1:1092,25\n252#1:1118\n263#1:1119,5\n263#1:1126,2\n263#1:1128\n263#1:1134,25\n263#1:1160\n277#1:1161,5\n277#1:1170,2\n277#1:1172\n277#1:1178,25\n277#1:1204\n291#1:1205,5\n291#1:1213,2\n291#1:1215\n291#1:1221,25\n291#1:1247\n307#1:1248,5\n307#1:1255,2\n307#1:1257\n307#1:1263,25\n307#1:1289\n85#1:332\n84#1:336,5\n84#1:366\n90#1:378,5\n90#1:408\n97#1:421,5\n97#1:451\n105#1:463,5\n105#1:493\n112#1:504,5\n112#1:534\n126#1:545,5\n126#1:575\n136#1:586,5\n136#1:616\n157#1:628,5\n157#1:658\n168#1:671,5\n168#1:701\n178#1:712,5\n178#1:742\n187#1:754,5\n187#1:784\n200#1:796,5\n200#1:826\n208#1:838,5\n208#1:868\n215#1:881,5\n215#1:911\n223#1:922,5\n223#1:952\n229#1:963,5\n229#1:993\n236#1:1004,5\n236#1:1034\n243#1:1045,5\n243#1:1075\n252#1:1087,5\n252#1:1117\n263#1:1129,5\n263#1:1159\n277#1:1173,5\n277#1:1203\n291#1:1216,5\n291#1:1246\n307#1:1258,5\n307#1:1288\n91#1:373\n92#1:374\n98#1:415\n99#1:416\n100#1:417\n106#1:458\n107#1:459\n113#1:500\n127#1:541\n137#1:582\n158#1:623\n159#1:624\n169#1:665\n170#1:666\n171#1:667\n179#1:708\n188#1:749\n189#1:750\n201#1:791\n203#1:792\n209#1:833\n210#1:834\n216#1:875\n217#1:876\n218#1:877\n224#1:918\n230#1:959\n237#1:1000\n244#1:1041\n253#1:1082\n254#1:1083\n264#1:1124\n265#1:1125\n278#1:1166\n279#1:1167\n280#1:1168\n281#1:1169\n292#1:1210\n293#1:1211\n294#1:1212\n308#1:1253\n309#1:1254\n*E\n"})
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    public final Operations a;

    public ChangeList() {
        this.a = new Operations();
    }

    public final void clear() {
        this.a.clear();
    }

    public final void executeAndFlushAllPendingChanges(@NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
        this.a.executeAndFlushAllPendingOperations(applier0, slotWriter0, rememberManager0);
    }

    public final int getSize() {
        return this.a.getSize();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.a.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int v) {
        AdvanceSlotsBy operation$AdvanceSlotsBy0 = AdvanceSlotsBy.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$AdvanceSlotsBy0);
        WriteScope.setInt-A6tL2VI(operations0, 0, v);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$AdvanceSlotsBy0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$AdvanceSlotsBy0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v2 = operation$AdvanceSlotsBy0.getInts();
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                if((1 << v3 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v4 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$AdvanceSlotsBy0.intParamName-w8GmfQM(v3));
                    ++v4;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v5 = operation$AdvanceSlotsBy0.getObjects();
            int v6 = 0;
            for(int v1 = 0; v1 < v5; ++v1) {
                if((1 << v1 & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v4 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$AdvanceSlotsBy0.objectParamName-31yXWZQ(v1));
                    ++v6;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$AdvanceSlotsBy0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v4, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v6, " object arguments (", s1, ").");
        }
    }

    public final void pushAppendValue(@NotNull Anchor anchor0, @Nullable Object object0) {
        AppendValue operation$AppendValue0 = AppendValue.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$AppendValue0);
        WriteScope.setObject-DKhxnng(operations0, 0, anchor0);
        WriteScope.setObject-DKhxnng(operations0, 1, object0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$AppendValue0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$AppendValue0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$AppendValue0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$AppendValue0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$AppendValue0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$AppendValue0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$AppendValue0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushCopyNodesToNewAnchorLocation(@NotNull List list0, @NotNull IntRef intRef0) {
        if(!list0.isEmpty()) {
            CopyNodesToNewAnchorLocation operation$CopyNodesToNewAnchorLocation0 = CopyNodesToNewAnchorLocation.INSTANCE;
            Operations operations0 = this.a;
            operations0.pushOp(operation$CopyNodesToNewAnchorLocation0);
            WriteScope.setObject-DKhxnng(operations0, 1, list0);
            WriteScope.setObject-DKhxnng(operations0, 0, intRef0);
            if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$CopyNodesToNewAnchorLocation0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$CopyNodesToNewAnchorLocation0.getObjects())) {
                StringBuilder stringBuilder0 = new StringBuilder();
                int v1 = operation$CopyNodesToNewAnchorLocation0.getInts();
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                        if(v3 > 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(operation$CopyNodesToNewAnchorLocation0.intParamName-w8GmfQM(v2));
                        ++v3;
                    }
                }
                String s = stringBuilder0.toString();
                StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
                int v4 = operation$CopyNodesToNewAnchorLocation0.getObjects();
                int v5 = 0;
                for(int v = 0; v < v4; ++v) {
                    if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                        if(v3 > 0) {
                            stringBuilder1.append(", ");
                        }
                        stringBuilder1.append(operation$CopyNodesToNewAnchorLocation0.objectParamName-31yXWZQ(v));
                        ++v5;
                    }
                }
                String s1 = stringBuilder1.toString();
                Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
                StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
                stringBuilder2.append(operation$CopyNodesToNewAnchorLocation0);
                stringBuilder2.append(". Not all arguments were provided. Missing ");
                a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
                a.l(stringBuilder2, v5, " object arguments (", s1, ").");
            }
        }
    }

    public final void pushCopySlotTableToAnchorLocation(@Nullable MovableContentState movableContentState0, @NotNull CompositionContext compositionContext0, @NotNull MovableContentStateReference movableContentStateReference0, @NotNull MovableContentStateReference movableContentStateReference1) {
        CopySlotTableToAnchorLocation operation$CopySlotTableToAnchorLocation0 = CopySlotTableToAnchorLocation.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$CopySlotTableToAnchorLocation0);
        WriteScope.setObject-DKhxnng(operations0, 0, movableContentState0);
        WriteScope.setObject-DKhxnng(operations0, 1, compositionContext0);
        WriteScope.setObject-DKhxnng(operations0, 3, movableContentStateReference1);
        WriteScope.setObject-DKhxnng(operations0, 2, movableContentStateReference0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$CopySlotTableToAnchorLocation0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$CopySlotTableToAnchorLocation0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$CopySlotTableToAnchorLocation0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$CopySlotTableToAnchorLocation0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$CopySlotTableToAnchorLocation0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$CopySlotTableToAnchorLocation0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$CopySlotTableToAnchorLocation0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushDeactivateCurrentGroup() {
        this.a.push(DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(@NotNull IntRef intRef0, @NotNull Anchor anchor0) {
        DetermineMovableContentNodeIndex operation$DetermineMovableContentNodeIndex0 = DetermineMovableContentNodeIndex.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$DetermineMovableContentNodeIndex0);
        WriteScope.setObject-DKhxnng(operations0, 0, intRef0);
        WriteScope.setObject-DKhxnng(operations0, 1, anchor0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$DetermineMovableContentNodeIndex0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$DetermineMovableContentNodeIndex0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$DetermineMovableContentNodeIndex0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$DetermineMovableContentNodeIndex0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$DetermineMovableContentNodeIndex0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$DetermineMovableContentNodeIndex0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$DetermineMovableContentNodeIndex0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushDowns(@NotNull Object[] arr_object) {
        if(arr_object.length != 0) {
            Downs operation$Downs0 = Downs.INSTANCE;
            Operations operations0 = this.a;
            operations0.pushOp(operation$Downs0);
            WriteScope.setObject-DKhxnng(operations0, 0, arr_object);
            if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$Downs0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$Downs0.getObjects())) {
                StringBuilder stringBuilder0 = new StringBuilder();
                int v1 = operation$Downs0.getInts();
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                        if(v3 > 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(operation$Downs0.intParamName-w8GmfQM(v2));
                        ++v3;
                    }
                }
                String s = stringBuilder0.toString();
                StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
                int v4 = operation$Downs0.getObjects();
                int v5 = 0;
                for(int v = 0; v < v4; ++v) {
                    if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                        if(v3 > 0) {
                            stringBuilder1.append(", ");
                        }
                        stringBuilder1.append(operation$Downs0.objectParamName-31yXWZQ(v));
                        ++v5;
                    }
                }
                String s1 = stringBuilder1.toString();
                Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
                StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
                stringBuilder2.append(operation$Downs0);
                stringBuilder2.append(". Not all arguments were provided. Missing ");
                a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
                a.l(stringBuilder2, v5, " object arguments (", s1, ").");
            }
        }
    }

    public final void pushEndCompositionScope(@NotNull Function1 function10, @NotNull Composition composition0) {
        EndCompositionScope operation$EndCompositionScope0 = EndCompositionScope.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$EndCompositionScope0);
        WriteScope.setObject-DKhxnng(operations0, 0, function10);
        WriteScope.setObject-DKhxnng(operations0, 1, composition0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$EndCompositionScope0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$EndCompositionScope0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$EndCompositionScope0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$EndCompositionScope0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$EndCompositionScope0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$EndCompositionScope0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$EndCompositionScope0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushEndCurrentGroup() {
        this.a.push(EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.a.push(EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEnsureGroupStarted(@NotNull Anchor anchor0) {
        EnsureGroupStarted operation$EnsureGroupStarted0 = EnsureGroupStarted.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$EnsureGroupStarted0);
        WriteScope.setObject-DKhxnng(operations0, 0, anchor0);
        if(operations0.g != Operations.access$createExpectedArgMask(operations0, operation$EnsureGroupStarted0.getInts()) || operations0.h != Operations.access$createExpectedArgMask(operations0, operation$EnsureGroupStarted0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$EnsureGroupStarted0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & operations0.g) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$EnsureGroupStarted0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$EnsureGroupStarted0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & operations0.h) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$EnsureGroupStarted0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$EnsureGroupStarted0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushEnsureRootStarted() {
        this.a.push(EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(@NotNull ChangeList changeList0, @Nullable IntRef intRef0) {
        if(changeList0.isNotEmpty()) {
            ApplyChangeList operation$ApplyChangeList0 = ApplyChangeList.INSTANCE;
            Operations operations0 = this.a;
            operations0.pushOp(operation$ApplyChangeList0);
            WriteScope.setObject-DKhxnng(operations0, 0, changeList0);
            WriteScope.setObject-DKhxnng(operations0, 1, intRef0);
            if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$ApplyChangeList0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$ApplyChangeList0.getObjects())) {
                StringBuilder stringBuilder0 = new StringBuilder();
                int v1 = operation$ApplyChangeList0.getInts();
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                        if(v3 > 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(operation$ApplyChangeList0.intParamName-w8GmfQM(v2));
                        ++v3;
                    }
                }
                String s = stringBuilder0.toString();
                StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
                int v4 = operation$ApplyChangeList0.getObjects();
                int v5 = 0;
                for(int v = 0; v < v4; ++v) {
                    if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                        if(v3 > 0) {
                            stringBuilder1.append(", ");
                        }
                        stringBuilder1.append(operation$ApplyChangeList0.objectParamName-31yXWZQ(v));
                        ++v5;
                    }
                }
                String s1 = stringBuilder1.toString();
                Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
                StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
                stringBuilder2.append(operation$ApplyChangeList0);
                stringBuilder2.append(". Not all arguments were provided. Missing ");
                a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
                a.l(stringBuilder2, v5, " object arguments (", s1, ").");
            }
        }
    }

    public static void pushExecuteOperationsIn$default(ChangeList changeList0, ChangeList changeList1, IntRef intRef0, int v, Object object0) {
        if((v & 2) != 0) {
            intRef0 = null;
        }
        changeList0.pushExecuteOperationsIn(changeList1, intRef0);
    }

    public final void pushInsertSlots(@NotNull Anchor anchor0, @NotNull SlotTable slotTable0) {
        InsertSlots operation$InsertSlots0 = InsertSlots.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$InsertSlots0);
        WriteScope.setObject-DKhxnng(operations0, 0, anchor0);
        WriteScope.setObject-DKhxnng(operations0, 1, slotTable0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$InsertSlots0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$InsertSlots0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$InsertSlots0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$InsertSlots0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$InsertSlots0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$InsertSlots0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$InsertSlots0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushInsertSlots(@NotNull Anchor anchor0, @NotNull SlotTable slotTable0, @NotNull FixupList fixupList0) {
        InsertSlotsWithFixups operation$InsertSlotsWithFixups0 = InsertSlotsWithFixups.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$InsertSlotsWithFixups0);
        WriteScope.setObject-DKhxnng(operations0, 0, anchor0);
        WriteScope.setObject-DKhxnng(operations0, 1, slotTable0);
        WriteScope.setObject-DKhxnng(operations0, 2, fixupList0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$InsertSlotsWithFixups0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$InsertSlotsWithFixups0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$InsertSlotsWithFixups0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$InsertSlotsWithFixups0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$InsertSlotsWithFixups0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$InsertSlotsWithFixups0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$InsertSlotsWithFixups0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushMoveCurrentGroup(int v) {
        MoveCurrentGroup operation$MoveCurrentGroup0 = MoveCurrentGroup.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$MoveCurrentGroup0);
        WriteScope.setInt-A6tL2VI(operations0, 0, v);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$MoveCurrentGroup0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$MoveCurrentGroup0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v2 = operation$MoveCurrentGroup0.getInts();
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                if((1 << v3 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v4 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$MoveCurrentGroup0.intParamName-w8GmfQM(v3));
                    ++v4;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v5 = operation$MoveCurrentGroup0.getObjects();
            int v6 = 0;
            for(int v1 = 0; v1 < v5; ++v1) {
                if((1 << v1 & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v4 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$MoveCurrentGroup0.objectParamName-31yXWZQ(v1));
                    ++v6;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$MoveCurrentGroup0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v4, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v6, " object arguments (", s1, ").");
        }
    }

    public final void pushMoveNode(int v, int v1, int v2) {
        MoveNode operation$MoveNode0 = MoveNode.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$MoveNode0);
        WriteScope.setInt-A6tL2VI(operations0, 1, v);
        WriteScope.setInt-A6tL2VI(operations0, 0, v1);
        WriteScope.setInt-A6tL2VI(operations0, 2, v2);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$MoveNode0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$MoveNode0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v4 = operation$MoveNode0.getInts();
            int v6 = 0;
            for(int v5 = 0; v5 < v4; ++v5) {
                if((1 << v5 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v6 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$MoveNode0.intParamName-w8GmfQM(v5));
                    ++v6;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v7 = operation$MoveNode0.getObjects();
            int v8 = 0;
            for(int v3 = 0; v3 < v7; ++v3) {
                if((1 << v3 & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v6 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$MoveNode0.objectParamName-31yXWZQ(v3));
                    ++v8;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$MoveNode0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v6, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v8, " object arguments (", s1, ").");
        }
    }

    public final void pushReleaseMovableGroupAtCurrent(@NotNull ControlledComposition controlledComposition0, @NotNull CompositionContext compositionContext0, @NotNull MovableContentStateReference movableContentStateReference0) {
        ReleaseMovableGroupAtCurrent operation$ReleaseMovableGroupAtCurrent0 = ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$ReleaseMovableGroupAtCurrent0);
        WriteScope.setObject-DKhxnng(operations0, 0, controlledComposition0);
        WriteScope.setObject-DKhxnng(operations0, 1, compositionContext0);
        WriteScope.setObject-DKhxnng(operations0, 2, movableContentStateReference0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$ReleaseMovableGroupAtCurrent0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$ReleaseMovableGroupAtCurrent0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$ReleaseMovableGroupAtCurrent0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$ReleaseMovableGroupAtCurrent0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$ReleaseMovableGroupAtCurrent0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$ReleaseMovableGroupAtCurrent0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$ReleaseMovableGroupAtCurrent0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushRemember(@NotNull RememberObserver rememberObserver0) {
        Remember operation$Remember0 = Remember.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$Remember0);
        WriteScope.setObject-DKhxnng(operations0, 0, rememberObserver0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$Remember0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$Remember0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$Remember0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$Remember0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$Remember0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$Remember0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$Remember0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushRemoveCurrentGroup() {
        this.a.push(RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int v, int v1) {
        RemoveNode operation$RemoveNode0 = RemoveNode.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$RemoveNode0);
        WriteScope.setInt-A6tL2VI(operations0, 0, v);
        WriteScope.setInt-A6tL2VI(operations0, 1, v1);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$RemoveNode0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$RemoveNode0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v3 = operation$RemoveNode0.getInts();
            int v5 = 0;
            for(int v4 = 0; v4 < v3; ++v4) {
                if((1 << v4 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v5 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$RemoveNode0.intParamName-w8GmfQM(v4));
                    ++v5;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v6 = operation$RemoveNode0.getObjects();
            int v7 = 0;
            for(int v2 = 0; v2 < v6; ++v2) {
                if((1 << v2 & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v5 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$RemoveNode0.objectParamName-31yXWZQ(v2));
                    ++v7;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$RemoveNode0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v5, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v7, " object arguments (", s1, ").");
        }
    }

    public final void pushResetSlots() {
        this.a.push(ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(@NotNull Function0 function00) {
        SideEffect operation$SideEffect0 = SideEffect.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$SideEffect0);
        WriteScope.setObject-DKhxnng(operations0, 0, function00);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$SideEffect0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$SideEffect0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$SideEffect0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$SideEffect0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$SideEffect0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$SideEffect0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$SideEffect0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.a.push(SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushTrimValues(int v) {
        TrimParentValues operation$TrimParentValues0 = TrimParentValues.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$TrimParentValues0);
        WriteScope.setInt-A6tL2VI(operations0, 0, v);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$TrimParentValues0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$TrimParentValues0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v2 = operation$TrimParentValues0.getInts();
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                if((1 << v3 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v4 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$TrimParentValues0.intParamName-w8GmfQM(v3));
                    ++v4;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v5 = operation$TrimParentValues0.getObjects();
            int v6 = 0;
            for(int v1 = 0; v1 < v5; ++v1) {
                if((1 << v1 & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v4 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$TrimParentValues0.objectParamName-31yXWZQ(v1));
                    ++v6;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$TrimParentValues0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v4, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v6, " object arguments (", s1, ").");
        }
    }

    public final void pushUpdateAnchoredValue(@Nullable Object object0, @NotNull Anchor anchor0, int v) {
        UpdateAnchoredValue operation$UpdateAnchoredValue0 = UpdateAnchoredValue.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$UpdateAnchoredValue0);
        WriteScope.setObject-DKhxnng(operations0, 0, object0);
        WriteScope.setObject-DKhxnng(operations0, 1, anchor0);
        WriteScope.setInt-A6tL2VI(operations0, 0, v);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$UpdateAnchoredValue0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$UpdateAnchoredValue0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v2 = operation$UpdateAnchoredValue0.getInts();
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                if((1 << v3 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v4 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$UpdateAnchoredValue0.intParamName-w8GmfQM(v3));
                    ++v4;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v5 = operation$UpdateAnchoredValue0.getObjects();
            int v6 = 0;
            for(int v1 = 0; v1 < v5; ++v1) {
                if((1 << v1 & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v4 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$UpdateAnchoredValue0.objectParamName-31yXWZQ(v1));
                    ++v6;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$UpdateAnchoredValue0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v4, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v6, " object arguments (", s1, ").");
        }
    }

    public final void pushUpdateAuxData(@Nullable Object object0) {
        UpdateAuxData operation$UpdateAuxData0 = UpdateAuxData.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$UpdateAuxData0);
        WriteScope.setObject-DKhxnng(operations0, 0, object0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$UpdateAuxData0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$UpdateAuxData0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$UpdateAuxData0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$UpdateAuxData0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$UpdateAuxData0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$UpdateAuxData0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$UpdateAuxData0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushUpdateNode(Object object0, @NotNull Function2 function20) {
        UpdateNode operation$UpdateNode0 = UpdateNode.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$UpdateNode0);
        WriteScope.setObject-DKhxnng(operations0, 0, object0);
        Intrinsics.checkNotNull(function20, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        WriteScope.setObject-DKhxnng(operations0, 1, ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2)));
        if(operations0.g != Operations.access$createExpectedArgMask(operations0, operation$UpdateNode0.getInts()) || operations0.h != Operations.access$createExpectedArgMask(operations0, operation$UpdateNode0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$UpdateNode0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & operations0.g) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$UpdateNode0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$UpdateNode0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & operations0.h) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$UpdateNode0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$UpdateNode0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }

    public final void pushUpdateValue(@Nullable Object object0, int v) {
        UpdateValue operation$UpdateValue0 = UpdateValue.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$UpdateValue0);
        WriteScope.setObject-DKhxnng(operations0, 0, object0);
        WriteScope.setInt-A6tL2VI(operations0, 0, v);
        if(operations0.g != Operations.access$createExpectedArgMask(operations0, operation$UpdateValue0.getInts()) || operations0.h != Operations.access$createExpectedArgMask(operations0, operation$UpdateValue0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v2 = operation$UpdateValue0.getInts();
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                if((1 << v3 & operations0.g) != 0) {
                    if(v4 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$UpdateValue0.intParamName-w8GmfQM(v3));
                    ++v4;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v5 = operation$UpdateValue0.getObjects();
            int v6 = 0;
            for(int v1 = 0; v1 < v5; ++v1) {
                if((1 << v1 & operations0.h) != 0) {
                    if(v4 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$UpdateValue0.objectParamName-31yXWZQ(v1));
                    ++v6;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$UpdateValue0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v4, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v6, " object arguments (", s1, ").");
        }
    }

    public final void pushUps(int v) {
        Ups operation$Ups0 = Ups.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$Ups0);
        WriteScope.setInt-A6tL2VI(operations0, 0, v);
        if(operations0.g != Operations.access$createExpectedArgMask(operations0, operation$Ups0.getInts()) || operations0.h != Operations.access$createExpectedArgMask(operations0, operation$Ups0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v2 = operation$Ups0.getInts();
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                if((1 << v3 & operations0.g) != 0) {
                    if(v4 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$Ups0.intParamName-w8GmfQM(v3));
                    ++v4;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v5 = operation$Ups0.getObjects();
            int v6 = 0;
            for(int v1 = 0; v1 < v5; ++v1) {
                if((1 << v1 & operations0.h) != 0) {
                    if(v4 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$Ups0.objectParamName-31yXWZQ(v1));
                    ++v6;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$Ups0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v4, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v6, " object arguments (", s1, ").");
        }
    }

    public final void pushUseNode(@Nullable Object object0) {
        if(object0 instanceof ComposeNodeLifecycleCallback) {
            this.a.push(UseCurrentNode.INSTANCE);
        }
    }

    @Override  // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String s) {
        StringBuilder stringBuilder0 = b.t("ChangeList instance containing ");
        stringBuilder0.append(this.getSize());
        stringBuilder0.append(" operations");
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append(":\n");
            stringBuilder0.append(this.a.toDebugString(s));
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
        return s1;
    }
}

