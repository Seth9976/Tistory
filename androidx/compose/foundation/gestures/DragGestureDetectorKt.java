package androidx.compose.foundation.gestures;

import aa.e;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.a1;
import z.b1;
import z.b;
import z.c1;
import z.d1;
import z.e1;
import z.k0;
import z.l0;
import z.m0;
import z.n0;
import z.o0;
import z.p0;
import z.p3;
import z.q0;
import z.r0;
import z.s0;
import z.t0;
import z.u0;
import z.v0;
import z.w0;
import z.y0;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AY\u0010\u000E\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u000126\u0010\u000B\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\r\u001A3\u0010\u0014\u001A\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000FH\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A!\u0010\u0017\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u0082\u0001\u0010\u001E\u001A\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000F2\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\n0\u001A2\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\u001A26\u0010\u0010\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\n0\u0003H\u0086@\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001A\u00CD\u0001\u0010\u001E\u001A\u00020\n*\u00020\u001826\u0010\u0019\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\n0\u00032!\u0010\u001B\u001A\u001D\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n0\u000F2\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\u001A2\f\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00110\u001A2\b\u0010#\u001A\u0004\u0018\u00010\"26\u0010\u0010\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\n0\u0003H\u0080@\u00A2\u0006\u0004\b\u001E\u0010$\u001A\u0082\u0001\u0010%\u001A\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000F2\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\n0\u001A2\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\u001A26\u0010\u0010\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\n0\u0003H\u0086@\u00A2\u0006\u0004\b%\u0010\u001F\u001AY\u0010(\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u000126\u0010\u000B\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010\r\u001Aa\u0010-\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010*\u001A\u00020)26\u0010\u000B\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,\u001A3\u0010/\u001A\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000FH\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010\u0013\u001A!\u00101\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u0010\u0016\u001A\u0082\u0001\u00103\u001A\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000F2\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\n0\u001A2\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\u001A26\u00102\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\n0\u0003H\u0086@\u00A2\u0006\u0004\b3\u0010\u001F\u001AY\u00105\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u000126\u0010\u000B\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u0010\r\u001Aa\u00108\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010*\u001A\u00020)26\u00106\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003H\u0080@\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u0010,\u001A3\u0010:\u001A\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000FH\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b9\u0010\u0013\u001A!\u0010<\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b;\u0010\u0016\u001A\u0082\u0001\u0010>\u001A\u00020\n*\u00020\u00182\u0014\b\u0002\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u000F2\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\n0\u001A2\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\u001A26\u0010=\u001A2\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110&\u00A2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\n0\u0003H\u0086@\u00A2\u0006\u0004\b>\u0010\u001F\u001AS\u0010\u0014\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000F2\b\u0010?\u001A\u0004\u0018\u00010\"2\u0012\u0010@\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u000FH\u0080H\u00F8\u0001\u0000\u00A2\u0006\u0004\bA\u0010B\u001A!\u0010D\u001A\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\bC\u0010\u0016\u001A\u001E\u0010H\u001A\u00020&*\u00020E2\u0006\u0010*\u001A\u00020)H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006I"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "", "onTouchSlopReached", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "Lkotlin/Function1;", "onDrag", "", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drag", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "dragAmount", "detectDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialDelta", "shouldAwaitTouchSlop", "Landroidx/compose/foundation/gestures/Orientation;", "orientationLock", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitVerticalPointerSlopOrCancellation", "verticalDrag-jO51t88", "verticalDrag", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalDragOrCancellation", "onVerticalDrag", "detectVerticalDragGestures", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalTouchSlopOrCancellation", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "awaitHorizontalPointerSlopOrCancellation", "horizontalDrag-jO51t88", "horizontalDrag", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalDragOrCancellation", "onHorizontalDrag", "detectHorizontalDragGestures", "orientation", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation-rnUCldI", "awaitLongPressOrCancellation", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,957:1\n750#1,9:958\n759#1,4:976\n763#1,23:987\n706#1,4:1010\n710#1,2:1023\n712#1,8:1032\n750#1,9:1040\n759#1,4:1058\n763#1,23:1069\n750#1,9:1092\n759#1,4:1110\n763#1,23:1121\n664#1,6:1144\n706#1,4:1150\n710#1,2:1163\n712#1,7:1172\n670#1,7:1179\n719#1:1186\n677#1,12:1187\n706#1,4:1199\n710#1,2:1212\n712#1,8:1221\n750#1,9:1229\n759#1,4:1247\n763#1,23:1258\n750#1,9:1281\n759#1,4:1299\n763#1,23:1310\n664#1,6:1333\n706#1,4:1339\n710#1,2:1352\n712#1,7:1361\n670#1,7:1368\n719#1:1375\n677#1,12:1376\n706#1,4:1388\n710#1,2:1401\n712#1,8:1410\n706#1,4:1418\n710#1,2:1431\n712#1,8:1440\n706#1,4:1448\n710#1,2:1461\n712#1,8:1470\n116#2,2:967\n33#2,6:969\n118#2:975\n33#2,6:980\n118#2:986\n116#2,2:1014\n33#2,6:1016\n118#2:1022\n33#2,6:1025\n118#2:1031\n116#2,2:1049\n33#2,6:1051\n118#2:1057\n33#2,6:1062\n118#2:1068\n116#2,2:1101\n33#2,6:1103\n118#2:1109\n33#2,6:1114\n118#2:1120\n116#2,2:1154\n33#2,6:1156\n118#2:1162\n33#2,6:1165\n118#2:1171\n116#2,2:1203\n33#2,6:1205\n118#2:1211\n33#2,6:1214\n118#2:1220\n116#2,2:1238\n33#2,6:1240\n118#2:1246\n33#2,6:1251\n118#2:1257\n116#2,2:1290\n33#2,6:1292\n118#2:1298\n33#2,6:1303\n118#2:1309\n116#2,2:1343\n33#2,6:1345\n118#2:1351\n33#2,6:1354\n118#2:1360\n116#2,2:1392\n33#2,6:1394\n118#2:1400\n33#2,6:1403\n118#2:1409\n116#2,2:1422\n33#2,6:1424\n118#2:1430\n33#2,6:1433\n118#2:1439\n116#2,2:1452\n33#2,6:1454\n118#2:1460\n33#2,6:1463\n118#2:1469\n116#2,2:1478\n33#2,6:1480\n118#2:1486\n116#2,2:1487\n33#2,6:1489\n118#2:1495\n116#2,2:1496\n33#2,6:1498\n118#2:1504\n116#2,2:1505\n33#2,6:1507\n118#2:1513\n116#2,2:1514\n33#2,6:1516\n118#2:1522\n116#2,2:1523\n33#2,6:1525\n118#2:1531\n158#3:1532\n148#3:1533\n77#4:1534\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n78#1:958,9\n78#1:976,4\n78#1:987,23\n142#1:1010,4\n142#1:1023,2\n142#1:1032,8\n369#1:1040,9\n369#1:1058,4\n369#1:1069,23\n380#1:1092,9\n380#1:1110,4\n380#1:1121,23\n406#1:1144,6\n406#1:1150,4\n406#1:1163,2\n406#1:1172,7\n406#1:1179,7\n406#1:1186\n406#1:1187,12\n436#1:1199,4\n436#1:1212,2\n436#1:1221,8\n520#1:1229,9\n520#1:1247,4\n520#1:1258,23\n531#1:1281,9\n531#1:1299,4\n531#1:1310,23\n554#1:1333,6\n554#1:1339,4\n554#1:1352,2\n554#1:1361,7\n554#1:1368,7\n554#1:1375\n554#1:1376,12\n584#1:1388,4\n584#1:1401,2\n584#1:1410,8\n669#1:1418,4\n669#1:1431,2\n669#1:1440,8\n669#1:1448,4\n669#1:1461,2\n669#1:1470,8\n78#1:967,2\n78#1:969,6\n78#1:975\n78#1:980,6\n78#1:986\n142#1:1014,2\n142#1:1016,6\n142#1:1022\n142#1:1025,6\n142#1:1031\n369#1:1049,2\n369#1:1051,6\n369#1:1057\n369#1:1062,6\n369#1:1068\n380#1:1101,2\n380#1:1103,6\n380#1:1109\n380#1:1114,6\n380#1:1120\n406#1:1154,2\n406#1:1156,6\n406#1:1162\n406#1:1165,6\n406#1:1171\n436#1:1203,2\n436#1:1205,6\n436#1:1211\n436#1:1214,6\n436#1:1220\n520#1:1238,2\n520#1:1240,6\n520#1:1246\n520#1:1251,6\n520#1:1257\n531#1:1290,2\n531#1:1292,6\n531#1:1298\n531#1:1303,6\n531#1:1309\n554#1:1343,2\n554#1:1345,6\n554#1:1351\n554#1:1354,6\n554#1:1360\n584#1:1392,2\n584#1:1394,6\n584#1:1400\n584#1:1403,6\n584#1:1409\n669#1:1422,2\n669#1:1424,6\n669#1:1430\n669#1:1433,6\n669#1:1439\n669#1:1452,2\n669#1:1454,6\n669#1:1460\n669#1:1463,6\n669#1:1469\n709#1:1478,2\n709#1:1480,6\n709#1:1486\n711#1:1487,2\n711#1:1489,6\n711#1:1495\n758#1:1496,2\n758#1:1498,6\n758#1:1504\n762#1:1505,2\n762#1:1507,6\n762#1:1513\n884#1:1514,2\n884#1:1516,6\n884#1:1522\n937#1:1523,2\n937#1:1525,6\n937#1:1531\n943#1:1532\n944#1:1533\n945#1:1534\n*E\n"})
public final class DragGestureDetectorKt {
    public static final float a;

    static {
        DragGestureDetectorKt.a = 0.006944f;
    }

    public static final boolean a(PointerEvent pointerEvent0, long v) {
        List list0 = pointerEvent0.getChanges();
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; true; ++v3) {
            Object object0 = null;
            if(v3 >= v1) {
                break;
            }
            Object object1 = list0.get(v3);
            if(PointerId.equals-impl0(((PointerInputChange)object1).getId-J3iCeTQ(), v)) {
                object0 = object1;
                break;
            }
        }
        if(((PointerInputChange)object0) != null && ((PointerInputChange)object0).getPressed()) {
            v2 = 1;
        }
        return 1 ^ v2;
    }

    @Nullable
    public static final Object awaitDragOrCancellation-rnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Continuation continuation0) {
        Object object4;
        Object object2;
        LongRef ref$LongRef2;
        AwaitPointerEventScope awaitPointerEventScope1;
        LongRef ref$LongRef0;
        k0 k00;
        if(continuation0 instanceof k0) {
            k00 = (k0)continuation0;
            int v1 = k00.r;
            if((v1 & 0x80000000) == 0) {
                k00 = new k0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                k00.r = v1 ^ 0x80000000;
            }
        }
        else {
            k00 = new k0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = k00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(k00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    return null;
                }
                ref$LongRef0 = new LongRef();
                ref$LongRef0.element = v;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                goto label_59;
            }
            case 1: {
                LongRef ref$LongRef1 = k00.p;
                AwaitPointerEventScope awaitPointerEventScope2 = k00.o;
                ResultKt.throwOnFailure(object0);
                ref$LongRef2 = ref$LongRef1;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).getChanges();
            int v2 = list0.size();
            int v3 = 0;
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v2) {
                    Object object3 = list0.get(v4);
                    if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef2.element)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                throw new NullPointerException();
            }
            if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                List list1 = ((PointerEvent)object0).getChanges();
                int v5 = list1.size();
                while(true) {
                    object4 = null;
                    if(v3 < v5) {
                        Object object5 = list1.get(v3);
                        if(((PointerInputChange)object5).getPressed()) {
                            object4 = object5;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    ref$LongRef2.element = ((PointerInputChange)object4).getId-J3iCeTQ();
                }
            }
            else if(!PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange0)) {
            }
            else {
                return pointerInputChange0 == null || pointerInputChange0.isConsumed() ? null : pointerInputChange0;
            }
            ref$LongRef0 = ref$LongRef2;
        label_59:
            k00.o = awaitPointerEventScope1;
            k00.p = ref$LongRef0;
            k00.r = 1;
            Object object6 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, k00, 1, null);
            if(object6 == object1) {
                return object1;
            }
            object0 = object6;
            ref$LongRef2 = ref$LongRef0;
        }
    }

    @Nullable
    public static final Object awaitHorizontalDragOrCancellation-rnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Continuation continuation0) {
        Object object4;
        PointerInputChange pointerInputChange0;
        Object object2;
        LongRef ref$LongRef2;
        AwaitPointerEventScope awaitPointerEventScope1;
        LongRef ref$LongRef0;
        l0 l00;
        if(continuation0 instanceof l0) {
            l00 = (l0)continuation0;
            int v1 = l00.r;
            if((v1 & 0x80000000) == 0) {
                l00 = new l0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                l00.r = v1 ^ 0x80000000;
            }
        }
        else {
            l00 = new l0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = l00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    return null;
                }
                ref$LongRef0 = new LongRef();
                ref$LongRef0.element = v;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                goto label_58;
            }
            case 1: {
                LongRef ref$LongRef1 = l00.p;
                AwaitPointerEventScope awaitPointerEventScope2 = l00.o;
                ResultKt.throwOnFailure(object0);
                ref$LongRef2 = ref$LongRef1;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).getChanges();
            int v2 = list0.size();
            int v3 = 0;
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v2) {
                    Object object3 = list0.get(v4);
                    if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef2.element)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                throw new NullPointerException();
            }
            if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                List list1 = ((PointerEvent)object0).getChanges();
                int v5 = list1.size();
                while(true) {
                    object4 = null;
                    if(v3 < v5) {
                        Object object5 = list1.get(v3);
                        if(((PointerInputChange)object5).getPressed()) {
                            object4 = object5;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) == null) {
                    break;
                }
                ref$LongRef2.element = ((PointerInputChange)object4).getId-J3iCeTQ();
            }
            else if(Offset.getX-impl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange0)) != 0.0f) {
                break;
            }
            ref$LongRef0 = ref$LongRef2;
        label_58:
            l00.o = awaitPointerEventScope1;
            l00.p = ref$LongRef0;
            l00.r = 1;
            Object object6 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, l00, 1, null);
            if(object6 == object1) {
                return object1;
            }
            object0 = object6;
            ref$LongRef2 = ref$LongRef0;
        }
        return pointerInputChange0 == null || pointerInputChange0.isConsumed() ? null : pointerInputChange0;
    }

    @Nullable
    public static final Object awaitHorizontalPointerSlopOrCancellation-gDDlDlE(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        float f5;
        Object object4;
        float f4;
        Object object3;
        Function2 function23;
        PointerInputChange pointerInputChange0;
        m0 m01;
        LongRef ref$LongRef2;
        p3 p32;
        float f2;
        AwaitPointerEventScope awaitPointerEventScope1;
        p3 p30;
        Function2 function21;
        LongRef ref$LongRef0;
        float f;
        m0 m00;
        if(continuation0 instanceof m0) {
            m00 = (m0)continuation0;
            int v2 = m00.v;
            if((v2 & 0x80000000) == 0) {
                m00 = new m0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                m00.v = v2 ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = m00.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m00.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Orientation orientation0 = Orientation.Horizontal;
                if(!DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    f = DragGestureDetectorKt.pointerSlop-E8SPZFQ(awaitPointerEventScope0.getViewConfiguration(), v1);
                    ref$LongRef0 = new LongRef();
                    ref$LongRef0.element = v;
                    function21 = function20;
                    p30 = new p3(orientation0);
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    goto label_50;
                }
                return null;
            }
            case 1: {
                float f1 = m00.t;
                p3 p31 = m00.r;
                LongRef ref$LongRef1 = m00.q;
                AwaitPointerEventScope awaitPointerEventScope2 = m00.p;
                Function2 function22 = m00.o;
                ResultKt.throwOnFailure(object0);
                f2 = f1;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                p32 = p31;
                function21 = function22;
                ref$LongRef2 = ref$LongRef1;
                m01 = m00;
                goto label_65;
            }
            case 2: {
                float f3 = m00.t;
                pointerInputChange0 = m00.s;
                p3 p33 = m00.r;
                ref$LongRef0 = m00.q;
                AwaitPointerEventScope awaitPointerEventScope3 = m00.p;
                function23 = m00.o;
                ResultKt.throwOnFailure(object0);
                p30 = p33;
                f = f3;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            if(pointerInputChange0.isConsumed()) {
                return null;
            }
            function21 = function23;
            while(true) {
            label_50:
                m00.o = function21;
                m00.p = awaitPointerEventScope1;
                m00.q = ref$LongRef0;
                m00.r = p30;
                m00.s = null;
                m00.t = f;
                m00.v = 1;
                Object object2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, m00, 1, null);
                if(object2 == object1) {
                    return object1;
                }
                p32 = p30;
                object0 = object2;
                ref$LongRef2 = ref$LongRef0;
                f2 = f;
                m01 = m00;
            label_65:
                List list0 = ((PointerEvent)object0).getChanges();
                int v3 = list0.size();
                int v4 = 0;
                int v5 = 0;
                while(true) {
                    if(v5 < v3) {
                        object3 = list0.get(v5);
                        f4 = f2;
                        if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef2.element)) {
                            break;
                        }
                        else {
                            ++v5;
                            f2 = f4;
                            continue;
                        }
                    }
                    f4 = f2;
                    object3 = null;
                    break;
                }
                if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).isConsumed()) {
                    break alab1;
                }
                if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)object3))) {
                    List list1 = ((PointerEvent)object0).getChanges();
                    int v6 = list1.size();
                    while(true) {
                        object4 = null;
                        if(v4 < v6) {
                            Object object5 = list1.get(v4);
                            if(((PointerInputChange)object5).getPressed()) {
                                object4 = object5;
                            }
                            else {
                                ++v4;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object4) == null) {
                        break alab1;
                    }
                    ref$LongRef2.element = ((PointerInputChange)object4).getId-J3iCeTQ();
                    f5 = f4;
                }
                else {
                    f5 = f4;
                    Offset offset0 = p32.a(((PointerInputChange)object3), f5);
                    if(offset0 == null) {
                        goto label_108;
                    }
                    else {
                        function21.invoke(((PointerInputChange)object3), Boxing.boxFloat(Offset.getX-impl(offset0.unbox-impl())));
                        if(((PointerInputChange)object3).isConsumed()) {
                            return (PointerInputChange)object3;
                        }
                        p32.b();
                    }
                }
                ref$LongRef0 = ref$LongRef2;
                f = f5;
                p30 = p32;
                m00 = m01;
                continue;
            label_108:
                m01.o = function21;
                m01.p = awaitPointerEventScope1;
                m01.q = ref$LongRef2;
                m01.r = p32;
                m01.s = (PointerInputChange)object3;
                m01.t = f5;
                m01.v = 2;
                if(awaitPointerEventScope1.awaitPointerEvent(PointerEventPass.Final, m01) == object1) {
                    return object1;
                }
                function23 = function21;
                pointerInputChange0 = (PointerInputChange)object3;
                ref$LongRef0 = ref$LongRef2;
                f = f5;
                p30 = p32;
                m00 = m01;
                break;
            }
        }
        return null;
    }

    @Nullable
    public static final Object awaitHorizontalTouchSlopOrCancellation-jO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object4;
        n0 n03;
        Object object3;
        Function2 function23;
        PointerInputChange pointerInputChange0;
        LongRef ref$LongRef2;
        p3 p32;
        n0 n02;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope1;
        p3 p30;
        float f1;
        n0 n01;
        Function2 function21;
        LongRef ref$LongRef0;
        n0 n00;
        if(continuation0 instanceof n0) {
            n00 = (n0)continuation0;
            int v1 = n00.v;
            if((v1 & 0x80000000) == 0) {
                n00 = new n0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                n00.v = v1 ^ 0x80000000;
            }
        }
        else {
            n00 = new n0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = n00.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(n00.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Orientation orientation0 = Orientation.Horizontal;
                if(!DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    float f = DragGestureDetectorKt.pointerSlop-E8SPZFQ(awaitPointerEventScope0.getViewConfiguration(), 1);
                    ref$LongRef0 = new LongRef();
                    ref$LongRef0.element = v;
                    function21 = function20;
                    n01 = n00;
                    f1 = f;
                    p30 = new p3(orientation0);
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    goto label_53;
                }
                return null;
            }
            case 1: {
                float f2 = n00.t;
                p3 p31 = n00.r;
                LongRef ref$LongRef1 = n00.q;
                AwaitPointerEventScope awaitPointerEventScope2 = n00.p;
                Function2 function22 = n00.o;
                ResultKt.throwOnFailure(object0);
                f3 = f2;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                n02 = n00;
                p32 = p31;
                function21 = function22;
                ref$LongRef2 = ref$LongRef1;
                goto label_68;
            }
            case 2: {
                float f4 = n00.t;
                pointerInputChange0 = n00.s;
                p3 p33 = n00.r;
                ref$LongRef0 = n00.q;
                AwaitPointerEventScope awaitPointerEventScope3 = n00.p;
                function23 = n00.o;
                ResultKt.throwOnFailure(object0);
                p30 = p33;
                n01 = n00;
                f1 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            if(pointerInputChange0.isConsumed()) {
                return null;
            }
            function21 = function23;
            while(true) {
            label_53:
                n01.o = function21;
                n01.p = awaitPointerEventScope1;
                n01.q = ref$LongRef0;
                n01.r = p30;
                n01.s = null;
                n01.t = f1;
                n01.v = 1;
                Object object2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, n01, 1, null);
                if(object2 == object1) {
                    return object1;
                }
                p32 = p30;
                object0 = object2;
                ref$LongRef2 = ref$LongRef0;
                n02 = n01;
                f3 = f1;
            label_68:
                List list0 = ((PointerEvent)object0).getChanges();
                int v2 = list0.size();
                int v3 = 0;
                int v4 = 0;
                while(true) {
                    if(v4 < v2) {
                        object3 = list0.get(v4);
                        n03 = n02;
                        if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef2.element)) {
                            break;
                        }
                        else {
                            ++v4;
                            n02 = n03;
                            continue;
                        }
                    }
                    n03 = n02;
                    object3 = null;
                    break;
                }
                if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).isConsumed()) {
                    break alab1;
                }
                if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)object3))) {
                    List list1 = ((PointerEvent)object0).getChanges();
                    int v5 = list1.size();
                    while(true) {
                        object4 = null;
                        if(v3 < v5) {
                            Object object5 = list1.get(v3);
                            if(((PointerInputChange)object5).getPressed()) {
                                object4 = object5;
                            }
                            else {
                                ++v3;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object4) == null) {
                        break alab1;
                    }
                    ref$LongRef2.element = ((PointerInputChange)object4).getId-J3iCeTQ();
                }
                else {
                    Offset offset0 = p32.a(((PointerInputChange)object3), f3);
                    if(offset0 == null) {
                        goto label_109;
                    }
                    else {
                        function21.invoke(((PointerInputChange)object3), Boxing.boxFloat(Offset.getX-impl(offset0.unbox-impl())));
                        if(((PointerInputChange)object3).isConsumed()) {
                            return (PointerInputChange)object3;
                        }
                        p32.b();
                    }
                }
                p30 = p32;
                f1 = f3;
                ref$LongRef0 = ref$LongRef2;
                n01 = n03;
                continue;
            label_109:
                n03.o = function21;
                n03.p = awaitPointerEventScope1;
                n03.q = ref$LongRef2;
                n03.r = p32;
                n03.s = (PointerInputChange)object3;
                n03.t = f3;
                n03.v = 2;
                if(awaitPointerEventScope1.awaitPointerEvent(PointerEventPass.Final, n03) == object1) {
                    return object1;
                }
                function23 = function21;
                p30 = p32;
                f1 = f3;
                pointerInputChange0 = (PointerInputChange)object3;
                n01 = n03;
                ref$LongRef0 = ref$LongRef2;
                break;
            }
        }
        return null;
    }

    @Nullable
    public static final Object awaitLongPressOrCancellation-rnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Continuation continuation0) {
        ObjectRef ref$ObjectRef2;
        PointerInputChange pointerInputChange0;
        Object object2;
        o0 o00;
        if(continuation0 instanceof o0) {
            o00 = (o0)continuation0;
            int v1 = o00.r;
            if((v1 & 0x80000000) == 0) {
                o00 = new o0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                o00.r = v1 ^ 0x80000000;
            }
        }
        else {
            o00 = new o0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = o00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    return null;
                }
                List list0 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                int v2 = list0.size();
                for(int v3 = 0; true; ++v3) {
                    object2 = null;
                    if(v3 >= v2) {
                        break;
                    }
                    Object object3 = list0.get(v3);
                    if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), v)) {
                        object2 = object3;
                        break;
                    }
                }
                pointerInputChange0 = (PointerInputChange)object2;
                if(pointerInputChange0 == null) {
                    return null;
                }
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ObjectRef ref$ObjectRef1 = new ObjectRef();
                ref$ObjectRef1.element = pointerInputChange0;
                long v4 = awaitPointerEventScope0.getViewConfiguration().getLongPressTimeoutMillis();
                try {
                    p0 p00 = new p0(ref$ObjectRef1, ref$ObjectRef0, null);
                    o00.o = pointerInputChange0;
                    o00.p = ref$ObjectRef0;
                    o00.r = 1;
                    return awaitPointerEventScope0.withTimeout(v4, p00, o00) == object1 ? object1 : null;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    ref$ObjectRef2 = ref$ObjectRef0;
                    goto label_49;
                }
                return object1;
            }
            case 1: {
                try {
                    ref$ObjectRef2 = o00.p;
                    pointerInputChange0 = o00.o;
                    ResultKt.throwOnFailure(object0);
                    return null;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                }
            label_49:
                PointerInputChange pointerInputChange1 = (PointerInputChange)ref$ObjectRef2.element;
                return pointerInputChange1 == null ? pointerInputChange0 : pointerInputChange1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public static final Object awaitTouchSlopOrCancellation-jO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object4;
        q0 q03;
        Object object3;
        Function2 function23;
        PointerInputChange pointerInputChange0;
        LongRef ref$LongRef3;
        p3 p32;
        q0 q02;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope1;
        p3 p30;
        float f1;
        q0 q01;
        LongRef ref$LongRef1;
        Function2 function21;
        q0 q00;
        if(continuation0 instanceof q0) {
            q00 = (q0)continuation0;
            int v1 = q00.v;
            if((v1 & 0x80000000) == 0) {
                q00 = new q0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                q00.v = v1 ^ 0x80000000;
            }
        }
        else {
            q00 = new q0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = q00.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(q00.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    float f = DragGestureDetectorKt.pointerSlop-E8SPZFQ(awaitPointerEventScope0.getViewConfiguration(), 1);
                    LongRef ref$LongRef0 = new LongRef();
                    ref$LongRef0.element = v;
                    function21 = function20;
                    ref$LongRef1 = ref$LongRef0;
                    q01 = q00;
                    f1 = f;
                    p30 = new p3(null);
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    goto label_53;
                }
                return null;
            }
            case 1: {
                float f2 = q00.t;
                p3 p31 = q00.r;
                LongRef ref$LongRef2 = q00.q;
                AwaitPointerEventScope awaitPointerEventScope2 = q00.p;
                Function2 function22 = q00.o;
                ResultKt.throwOnFailure(object0);
                f3 = f2;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                q02 = q00;
                p32 = p31;
                function21 = function22;
                ref$LongRef3 = ref$LongRef2;
                goto label_68;
            }
            case 2: {
                float f4 = q00.t;
                pointerInputChange0 = q00.s;
                p3 p33 = q00.r;
                ref$LongRef1 = q00.q;
                AwaitPointerEventScope awaitPointerEventScope3 = q00.p;
                function23 = q00.o;
                ResultKt.throwOnFailure(object0);
                p30 = p33;
                q01 = q00;
                f1 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            if(pointerInputChange0.isConsumed()) {
                return null;
            }
            function21 = function23;
            while(true) {
            label_53:
                q01.o = function21;
                q01.p = awaitPointerEventScope1;
                q01.q = ref$LongRef1;
                q01.r = p30;
                q01.s = null;
                q01.t = f1;
                q01.v = 1;
                Object object2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, q01, 1, null);
                if(object2 == object1) {
                    return object1;
                }
                p32 = p30;
                object0 = object2;
                ref$LongRef3 = ref$LongRef1;
                q02 = q01;
                f3 = f1;
            label_68:
                List list0 = ((PointerEvent)object0).getChanges();
                int v2 = list0.size();
                int v3 = 0;
                int v4 = 0;
                while(true) {
                    if(v4 < v2) {
                        object3 = list0.get(v4);
                        q03 = q02;
                        if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef3.element)) {
                            break;
                        }
                        else {
                            ++v4;
                            q02 = q03;
                            continue;
                        }
                    }
                    q03 = q02;
                    object3 = null;
                    break;
                }
                if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).isConsumed()) {
                    break alab1;
                }
                if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)object3))) {
                    List list1 = ((PointerEvent)object0).getChanges();
                    int v5 = list1.size();
                    while(true) {
                        object4 = null;
                        if(v3 < v5) {
                            Object object5 = list1.get(v3);
                            if(((PointerInputChange)object5).getPressed()) {
                                object4 = object5;
                            }
                            else {
                                ++v3;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object4) == null) {
                        break alab1;
                    }
                    ref$LongRef3.element = ((PointerInputChange)object4).getId-J3iCeTQ();
                }
                else {
                    Offset offset0 = p32.a(((PointerInputChange)object3), f3);
                    if(offset0 == null) {
                        goto label_109;
                    }
                    else {
                        function21.invoke(((PointerInputChange)object3), offset0);
                        if(((PointerInputChange)object3).isConsumed()) {
                            return (PointerInputChange)object3;
                        }
                        p32.b();
                    }
                }
                p30 = p32;
                f1 = f3;
                ref$LongRef1 = ref$LongRef3;
                q01 = q03;
                continue;
            label_109:
                q03.o = function21;
                q03.p = awaitPointerEventScope1;
                q03.q = ref$LongRef3;
                q03.r = p32;
                q03.s = (PointerInputChange)object3;
                q03.t = f3;
                q03.v = 2;
                if(awaitPointerEventScope1.awaitPointerEvent(PointerEventPass.Final, q03) == object1) {
                    return object1;
                }
                function23 = function21;
                p30 = p32;
                f1 = f3;
                pointerInputChange0 = (PointerInputChange)object3;
                q01 = q03;
                ref$LongRef1 = ref$LongRef3;
                break;
            }
        }
        return null;
    }

    @Nullable
    public static final Object awaitVerticalDragOrCancellation-rnUCldI(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Continuation continuation0) {
        Object object4;
        PointerInputChange pointerInputChange0;
        Object object2;
        LongRef ref$LongRef2;
        AwaitPointerEventScope awaitPointerEventScope1;
        LongRef ref$LongRef0;
        r0 r00;
        if(continuation0 instanceof r0) {
            r00 = (r0)continuation0;
            int v1 = r00.r;
            if((v1 & 0x80000000) == 0) {
                r00 = new r0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                r00.r = v1 ^ 0x80000000;
            }
        }
        else {
            r00 = new r0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = r00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    return null;
                }
                ref$LongRef0 = new LongRef();
                ref$LongRef0.element = v;
                awaitPointerEventScope1 = awaitPointerEventScope0;
                goto label_58;
            }
            case 1: {
                LongRef ref$LongRef1 = r00.p;
                AwaitPointerEventScope awaitPointerEventScope2 = r00.o;
                ResultKt.throwOnFailure(object0);
                ref$LongRef2 = ref$LongRef1;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).getChanges();
            int v2 = list0.size();
            int v3 = 0;
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v2) {
                    Object object3 = list0.get(v4);
                    if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef2.element)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                throw new NullPointerException();
            }
            if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                List list1 = ((PointerEvent)object0).getChanges();
                int v5 = list1.size();
                while(true) {
                    object4 = null;
                    if(v3 < v5) {
                        Object object5 = list1.get(v3);
                        if(((PointerInputChange)object5).getPressed()) {
                            object4 = object5;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) == null) {
                    break;
                }
                ref$LongRef2.element = ((PointerInputChange)object4).getId-J3iCeTQ();
            }
            else if(Offset.getY-impl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange0)) != 0.0f) {
                break;
            }
            ref$LongRef0 = ref$LongRef2;
        label_58:
            r00.o = awaitPointerEventScope1;
            r00.p = ref$LongRef0;
            r00.r = 1;
            Object object6 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, r00, 1, null);
            if(object6 == object1) {
                return object1;
            }
            object0 = object6;
            ref$LongRef2 = ref$LongRef0;
        }
        return pointerInputChange0 == null || pointerInputChange0.isConsumed() ? null : pointerInputChange0;
    }

    @Nullable
    public static final Object awaitVerticalPointerSlopOrCancellation-gDDlDlE(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        float f5;
        Object object4;
        float f4;
        Object object3;
        Function2 function23;
        PointerInputChange pointerInputChange0;
        s0 s01;
        LongRef ref$LongRef2;
        p3 p32;
        float f2;
        AwaitPointerEventScope awaitPointerEventScope1;
        p3 p30;
        Function2 function21;
        LongRef ref$LongRef0;
        float f;
        s0 s00;
        if(continuation0 instanceof s0) {
            s00 = (s0)continuation0;
            int v2 = s00.v;
            if((v2 & 0x80000000) == 0) {
                s00 = new s0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                s00.v = v2 ^ 0x80000000;
            }
        }
        else {
            s00 = new s0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = s00.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s00.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Orientation orientation0 = Orientation.Vertical;
                if(!DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    f = DragGestureDetectorKt.pointerSlop-E8SPZFQ(awaitPointerEventScope0.getViewConfiguration(), v1);
                    ref$LongRef0 = new LongRef();
                    ref$LongRef0.element = v;
                    function21 = function20;
                    p30 = new p3(orientation0);
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    goto label_50;
                }
                return null;
            }
            case 1: {
                float f1 = s00.t;
                p3 p31 = s00.r;
                LongRef ref$LongRef1 = s00.q;
                AwaitPointerEventScope awaitPointerEventScope2 = s00.p;
                Function2 function22 = s00.o;
                ResultKt.throwOnFailure(object0);
                f2 = f1;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                p32 = p31;
                function21 = function22;
                ref$LongRef2 = ref$LongRef1;
                s01 = s00;
                goto label_65;
            }
            case 2: {
                float f3 = s00.t;
                pointerInputChange0 = s00.s;
                p3 p33 = s00.r;
                ref$LongRef0 = s00.q;
                AwaitPointerEventScope awaitPointerEventScope3 = s00.p;
                function23 = s00.o;
                ResultKt.throwOnFailure(object0);
                p30 = p33;
                f = f3;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            if(pointerInputChange0.isConsumed()) {
                return null;
            }
            function21 = function23;
            while(true) {
            label_50:
                s00.o = function21;
                s00.p = awaitPointerEventScope1;
                s00.q = ref$LongRef0;
                s00.r = p30;
                s00.s = null;
                s00.t = f;
                s00.v = 1;
                Object object2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, s00, 1, null);
                if(object2 == object1) {
                    return object1;
                }
                p32 = p30;
                object0 = object2;
                ref$LongRef2 = ref$LongRef0;
                f2 = f;
                s01 = s00;
            label_65:
                List list0 = ((PointerEvent)object0).getChanges();
                int v3 = list0.size();
                int v4 = 0;
                int v5 = 0;
                while(true) {
                    if(v5 < v3) {
                        object3 = list0.get(v5);
                        f4 = f2;
                        if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef2.element)) {
                            break;
                        }
                        else {
                            ++v5;
                            f2 = f4;
                            continue;
                        }
                    }
                    f4 = f2;
                    object3 = null;
                    break;
                }
                if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).isConsumed()) {
                    break alab1;
                }
                if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)object3))) {
                    List list1 = ((PointerEvent)object0).getChanges();
                    int v6 = list1.size();
                    while(true) {
                        object4 = null;
                        if(v4 < v6) {
                            Object object5 = list1.get(v4);
                            if(((PointerInputChange)object5).getPressed()) {
                                object4 = object5;
                            }
                            else {
                                ++v4;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object4) == null) {
                        break alab1;
                    }
                    ref$LongRef2.element = ((PointerInputChange)object4).getId-J3iCeTQ();
                    f5 = f4;
                }
                else {
                    f5 = f4;
                    Offset offset0 = p32.a(((PointerInputChange)object3), f5);
                    if(offset0 == null) {
                        goto label_108;
                    }
                    else {
                        function21.invoke(((PointerInputChange)object3), Boxing.boxFloat(Offset.getY-impl(offset0.unbox-impl())));
                        if(((PointerInputChange)object3).isConsumed()) {
                            return (PointerInputChange)object3;
                        }
                        p32.b();
                    }
                }
                ref$LongRef0 = ref$LongRef2;
                f = f5;
                p30 = p32;
                s00 = s01;
                continue;
            label_108:
                s01.o = function21;
                s01.p = awaitPointerEventScope1;
                s01.q = ref$LongRef2;
                s01.r = p32;
                s01.s = (PointerInputChange)object3;
                s01.t = f5;
                s01.v = 2;
                if(awaitPointerEventScope1.awaitPointerEvent(PointerEventPass.Final, s01) == object1) {
                    return object1;
                }
                function23 = function21;
                pointerInputChange0 = (PointerInputChange)object3;
                ref$LongRef0 = ref$LongRef2;
                f = f5;
                p30 = p32;
                s00 = s01;
                break;
            }
        }
        return null;
    }

    @Nullable
    public static final Object awaitVerticalTouchSlopOrCancellation-jO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object4;
        t0 t03;
        Object object3;
        Function2 function23;
        PointerInputChange pointerInputChange0;
        LongRef ref$LongRef2;
        p3 p32;
        t0 t02;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope1;
        p3 p30;
        float f1;
        t0 t01;
        Function2 function21;
        LongRef ref$LongRef0;
        t0 t00;
        if(continuation0 instanceof t0) {
            t00 = (t0)continuation0;
            int v1 = t00.v;
            if((v1 & 0x80000000) == 0) {
                t00 = new t0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                t00.v = v1 ^ 0x80000000;
            }
        }
        else {
            t00 = new t0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = t00.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(t00.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Orientation orientation0 = Orientation.Vertical;
                if(!DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v)) {
                    float f = DragGestureDetectorKt.pointerSlop-E8SPZFQ(awaitPointerEventScope0.getViewConfiguration(), 1);
                    ref$LongRef0 = new LongRef();
                    ref$LongRef0.element = v;
                    function21 = function20;
                    t01 = t00;
                    f1 = f;
                    p30 = new p3(orientation0);
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    goto label_53;
                }
                return null;
            }
            case 1: {
                float f2 = t00.t;
                p3 p31 = t00.r;
                LongRef ref$LongRef1 = t00.q;
                AwaitPointerEventScope awaitPointerEventScope2 = t00.p;
                Function2 function22 = t00.o;
                ResultKt.throwOnFailure(object0);
                f3 = f2;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                t02 = t00;
                p32 = p31;
                function21 = function22;
                ref$LongRef2 = ref$LongRef1;
                goto label_68;
            }
            case 2: {
                float f4 = t00.t;
                pointerInputChange0 = t00.s;
                p3 p33 = t00.r;
                ref$LongRef0 = t00.q;
                AwaitPointerEventScope awaitPointerEventScope3 = t00.p;
                function23 = t00.o;
                ResultKt.throwOnFailure(object0);
                p30 = p33;
                t01 = t00;
                f1 = f4;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            if(pointerInputChange0.isConsumed()) {
                return null;
            }
            function21 = function23;
            while(true) {
            label_53:
                t01.o = function21;
                t01.p = awaitPointerEventScope1;
                t01.q = ref$LongRef0;
                t01.r = p30;
                t01.s = null;
                t01.t = f1;
                t01.v = 1;
                Object object2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, t01, 1, null);
                if(object2 == object1) {
                    return object1;
                }
                p32 = p30;
                object0 = object2;
                ref$LongRef2 = ref$LongRef0;
                t02 = t01;
                f3 = f1;
            label_68:
                List list0 = ((PointerEvent)object0).getChanges();
                int v2 = list0.size();
                int v3 = 0;
                int v4 = 0;
                while(true) {
                    if(v4 < v2) {
                        object3 = list0.get(v4);
                        t03 = t02;
                        if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef2.element)) {
                            break;
                        }
                        else {
                            ++v4;
                            t02 = t03;
                            continue;
                        }
                    }
                    t03 = t02;
                    object3 = null;
                    break;
                }
                if(((PointerInputChange)object3) == null || ((PointerInputChange)object3).isConsumed()) {
                    break alab1;
                }
                if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)object3))) {
                    List list1 = ((PointerEvent)object0).getChanges();
                    int v5 = list1.size();
                    while(true) {
                        object4 = null;
                        if(v3 < v5) {
                            Object object5 = list1.get(v3);
                            if(((PointerInputChange)object5).getPressed()) {
                                object4 = object5;
                            }
                            else {
                                ++v3;
                                continue;
                            }
                        }
                        break;
                    }
                    if(((PointerInputChange)object4) == null) {
                        break alab1;
                    }
                    ref$LongRef2.element = ((PointerInputChange)object4).getId-J3iCeTQ();
                }
                else {
                    Offset offset0 = p32.a(((PointerInputChange)object3), f3);
                    if(offset0 == null) {
                        goto label_109;
                    }
                    else {
                        function21.invoke(((PointerInputChange)object3), Boxing.boxFloat(Offset.getY-impl(offset0.unbox-impl())));
                        if(((PointerInputChange)object3).isConsumed()) {
                            return (PointerInputChange)object3;
                        }
                        p32.b();
                    }
                }
                p30 = p32;
                f1 = f3;
                ref$LongRef0 = ref$LongRef2;
                t01 = t03;
                continue;
            label_109:
                t03.o = function21;
                t03.p = awaitPointerEventScope1;
                t03.q = ref$LongRef2;
                t03.r = p32;
                t03.s = (PointerInputChange)object3;
                t03.t = f3;
                t03.v = 2;
                if(awaitPointerEventScope1.awaitPointerEvent(PointerEventPass.Final, t03) == object1) {
                    return object1;
                }
                function23 = function21;
                p30 = p32;
                f1 = f3;
                pointerInputChange0 = (PointerInputChange)object3;
                t01 = t03;
                ref$LongRef0 = ref$LongRef2;
                break;
            }
        }
        return null;
    }

    @Nullable
    public static final Object detectDragGestures(@NotNull PointerInputScope pointerInputScope0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = DragGestureDetectorKt.detectDragGestures(pointerInputScope0, new e(function10, 7), new aa.a(function00, 22), function01, u0.z, null, function20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object detectDragGestures(@NotNull PointerInputScope pointerInputScope0, @NotNull Function2 function20, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Orientation orientation0, @NotNull Function2 function21, @NotNull Continuation continuation0) {
        Object object0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new v0(function01, orientation0, function20, function21, function00, function10, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object detectDragGestures$default(PointerInputScope pointerInputScope0, Function1 function10, Function0 function00, Function0 function01, Function2 function20, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = b.A;
        }
        if((v & 2) != 0) {
            function00 = u0.x;
        }
        if((v & 4) != 0) {
            function01 = u0.y;
        }
        return DragGestureDetectorKt.detectDragGestures(pointerInputScope0, function10, function00, function01, function20, continuation0);
    }

    @Nullable
    public static final Object detectDragGesturesAfterLongPress(@NotNull PointerInputScope pointerInputScope0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new w0(null, function00, function01, function10, function20), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope0, Function1 function10, Function0 function00, Function0 function01, Function2 function20, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = b.B;
        }
        if((v & 2) != 0) {
            function00 = u0.A;
        }
        if((v & 4) != 0) {
            function01 = u0.B;
        }
        return DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope0, function10, function00, function01, function20, continuation0);
    }

    @Nullable
    public static final Object detectHorizontalDragGestures(@NotNull PointerInputScope pointerInputScope0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new y0(null, function00, function01, function10, function20), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope0, Function1 function10, Function0 function00, Function0 function01, Function2 function20, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = b.C;
        }
        if((v & 2) != 0) {
            function00 = u0.C;
        }
        if((v & 4) != 0) {
            function01 = u0.D;
        }
        return DragGestureDetectorKt.detectHorizontalDragGestures(pointerInputScope0, function10, function00, function01, function20, continuation0);
    }

    @Nullable
    public static final Object detectVerticalDragGestures(@NotNull PointerInputScope pointerInputScope0, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new a1(null, function00, function01, function10, function20), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope0, Function1 function10, Function0 function00, Function0 function01, Function2 function20, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = b.D;
        }
        if((v & 2) != 0) {
            function00 = u0.E;
        }
        if((v & 4) != 0) {
            function01 = u0.F;
        }
        return DragGestureDetectorKt.detectVerticalDragGestures(pointerInputScope0, function10, function00, function01, function20, continuation0);
    }

    @Nullable
    public static final Object drag-VnAYq1g(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function1 function10, @Nullable Orientation orientation0, @NotNull Function1 function11, @NotNull Continuation continuation0) {
        float f;
        LongRef ref$LongRef2;
        Object object4;
        Object object2;
        LongRef ref$LongRef1;
        AwaitPointerEventScope awaitPointerEventScope3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1 function13;
        c1 c11;
        Function1 function12;
        Orientation orientation1;
        AwaitPointerEventScope awaitPointerEventScope1;
        long v2;
        c1 c10;
        if(continuation0 instanceof c1) {
            c10 = (c1)continuation0;
            int v1 = c10.v;
            if((v1 & 0x80000000) == 0) {
                c10 = new c1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                c10.v = v1 ^ 0x80000000;
            }
        }
        else {
            c10 = new c1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = c10.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c10.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                v2 = v;
                if(DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v2)) {
                    return null;
                }
                awaitPointerEventScope1 = awaitPointerEventScope0;
                orientation1 = orientation0;
                function12 = function11;
                c11 = c10;
                function13 = function10;
                goto label_87;
            }
            case 1: {
                LongRef ref$LongRef0 = c10.t;
                awaitPointerEventScope2 = c10.s;
                Function1 function14 = c10.r;
                Orientation orientation2 = c10.q;
                Function1 function15 = c10.p;
                awaitPointerEventScope3 = c10.o;
                ResultKt.throwOnFailure(object0);
                c11 = c10;
                function13 = function15;
                ref$LongRef1 = ref$LongRef0;
                orientation1 = orientation2;
                function12 = function14;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            List list0 = ((PointerEvent)object0).getChanges();
            int v3 = list0.size();
            int v4 = 0;
            while(true) {
                object2 = null;
                if(v4 < v3) {
                    Object object3 = list0.get(v4);
                    if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), ref$LongRef1.element)) {
                        object2 = object3;
                    }
                    else {
                        ++v4;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
            if(pointerInputChange0 == null) {
                pointerInputChange0 = null;
            }
            else if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                List list1 = ((PointerEvent)object0).getChanges();
                int v5 = list1.size();
                int v6 = 0;
                while(true) {
                    object4 = null;
                    if(v6 < v5) {
                        Object object5 = list1.get(v6);
                        if(((PointerInputChange)object5).getPressed()) {
                            object4 = object5;
                        }
                        else {
                            ++v6;
                            continue;
                        }
                    }
                    break;
                }
                if(((PointerInputChange)object4) != null) {
                    ref$LongRef1.element = ((PointerInputChange)object4).getId-J3iCeTQ();
                    awaitPointerEventScope1 = awaitPointerEventScope3;
                    ref$LongRef2 = ref$LongRef1;
                    goto label_90;
                }
            }
            else {
                long v7 = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange0);
                if(orientation1 == null) {
                    f = Offset.getDistance-impl(v7);
                }
                else {
                    f = orientation1 == Orientation.Vertical ? Offset.getY-impl(v7) : Offset.getX-impl(v7);
                }
                if(f == 0.0f) {
                    awaitPointerEventScope1 = awaitPointerEventScope3;
                    ref$LongRef2 = ref$LongRef1;
                    goto label_90;
                }
            }
            if(pointerInputChange0 == null) {
                return null;
            }
            if(((Boolean)function12.invoke(pointerInputChange0)).booleanValue()) {
                return null;
            }
            if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                return pointerInputChange0;
            }
            function13.invoke(pointerInputChange0);
            v2 = pointerInputChange0.getId-J3iCeTQ();
            awaitPointerEventScope1 = awaitPointerEventScope3;
        label_87:
            ref$LongRef2 = new LongRef();
            ref$LongRef2.element = v2;
            awaitPointerEventScope2 = awaitPointerEventScope1;
        label_90:
            c11.o = awaitPointerEventScope1;
            c11.p = function13;
            c11.q = orientation1;
            c11.r = function12;
            c11.s = awaitPointerEventScope2;
            c11.t = ref$LongRef2;
            c11.v = 1;
            Object object6 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, c11, 1, null);
            if(object6 == object1) {
                return object1;
            }
            awaitPointerEventScope3 = awaitPointerEventScope1;
            object0 = object6;
            ref$LongRef1 = ref$LongRef2;
        }
    }

    @Nullable
    public static final Object drag-jO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        b1 b10;
        if(continuation0 instanceof b1) {
            b10 = (b1)continuation0;
            int v1 = b10.r;
            if((v1 & 0x80000000) == 0) {
                b10 = new b1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                b10.r = v1 ^ 0x80000000;
            }
        }
        else {
            b10 = new b1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = b10.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_26;
            }
            case 1: {
                Function1 function11 = b10.p;
                AwaitPointerEventScope awaitPointerEventScope1 = b10.o;
                ResultKt.throwOnFailure(object0);
                function10 = function11;
                awaitPointerEventScope0 = awaitPointerEventScope1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(((PointerInputChange)object0) == null) {
                return Boxing.boxBoolean(false);
            }
            if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)object0))) {
                return Boxing.boxBoolean(true);
            }
            function10.invoke(((PointerInputChange)object0));
            v = ((PointerInputChange)object0).getId-J3iCeTQ();
        label_26:
            b10.o = awaitPointerEventScope0;
            b10.p = function10;
            b10.r = 1;
            object0 = DragGestureDetectorKt.awaitDragOrCancellation-rnUCldI(awaitPointerEventScope0, v, b10);
        }
        while(object0 != object1);
        return object1;
    }

    @Nullable
    public static final Object horizontalDrag-jO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        float f;
        Object object3;
        AwaitPointerEventScope awaitPointerEventScope4;
        Object object2;
        Function1 function11;
        AwaitPointerEventScope awaitPointerEventScope1;
        d1 d11;
        Orientation orientation1;
        long v2;
        d1 d10;
        if(continuation0 instanceof d1) {
            d10 = (d1)continuation0;
            int v1 = d10.u;
            if((v1 & 0x80000000) == 0) {
                d10 = new d1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                d10.u = v1 ^ 0x80000000;
            }
        }
        else {
            d10 = new d1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = d10.t;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(d10.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Orientation orientation0 = Orientation.Horizontal;
                v2 = v;
                if(!DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v2)) {
                    orientation1 = orientation0;
                    d11 = d10;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    function11 = function10;
                    goto label_81;
                }
                break;
            }
            case 1: {
                LongRef ref$LongRef0 = d10.s;
                AwaitPointerEventScope awaitPointerEventScope2 = d10.r;
                Orientation orientation2 = d10.q;
                AwaitPointerEventScope awaitPointerEventScope3 = d10.p;
                Function1 function12 = d10.o;
                ResultKt.throwOnFailure(object0);
                d1 d12 = d10;
                function11 = function12;
                while(true) {
                    List list0 = ((PointerEvent)object0).getChanges();
                    int v3 = list0.size();
                    int v4 = 0;
                    while(true) {
                        if(v4 < v3) {
                            object2 = list0.get(v4);
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            if(PointerId.equals-impl0(((PointerInputChange)object2).getId-J3iCeTQ(), ref$LongRef0.element)) {
                                break;
                            }
                            else {
                                ++v4;
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                continue;
                            }
                        }
                        awaitPointerEventScope4 = awaitPointerEventScope2;
                        object2 = null;
                        break;
                    }
                    PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
                    if(pointerInputChange0 == null) {
                        pointerInputChange0 = null;
                    }
                    else if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                        List list1 = ((PointerEvent)object0).getChanges();
                        int v5 = list1.size();
                        int v6 = 0;
                        while(true) {
                            object3 = null;
                            if(v6 < v5) {
                                Object object4 = list1.get(v6);
                                if(((PointerInputChange)object4).getPressed()) {
                                    object3 = object4;
                                }
                                else {
                                    ++v6;
                                    continue;
                                }
                            }
                            break;
                        }
                        if(((PointerInputChange)object3) != null) {
                            ref$LongRef0.element = ((PointerInputChange)object3).getId-J3iCeTQ();
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            awaitPointerEventScope1 = awaitPointerEventScope3;
                            d11 = d12;
                            goto label_86;
                        }
                    }
                    else {
                        long v7 = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange0);
                        if(orientation2 == null) {
                            f = Offset.getDistance-impl(v7);
                        }
                        else {
                            f = orientation2 == Orientation.Vertical ? Offset.getY-impl(v7) : Offset.getX-impl(v7);
                        }
                        if(f == 0.0f) {
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            awaitPointerEventScope1 = awaitPointerEventScope3;
                            d11 = d12;
                            goto label_86;
                        }
                    }
                    if(pointerInputChange0 == null || pointerInputChange0.isConsumed()) {
                        break alab1;
                    }
                    if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                        return pointerInputChange0 == null ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
                    }
                    function11.invoke(pointerInputChange0);
                    awaitPointerEventScope1 = awaitPointerEventScope3;
                    d11 = d12;
                    orientation1 = orientation2;
                    v2 = pointerInputChange0.getId-J3iCeTQ();
                label_81:
                    LongRef ref$LongRef1 = new LongRef();
                    ref$LongRef1.element = v2;
                    awaitPointerEventScope2 = awaitPointerEventScope1;
                    orientation2 = orientation1;
                    ref$LongRef0 = ref$LongRef1;
                label_86:
                    d11.o = function11;
                    d11.p = awaitPointerEventScope1;
                    d11.q = orientation2;
                    d11.r = awaitPointerEventScope2;
                    d11.s = ref$LongRef0;
                    d11.u = 1;
                    Object object5 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, d11, 1, null);
                    if(object5 == object1) {
                        return object1;
                    }
                    awaitPointerEventScope3 = awaitPointerEventScope1;
                    object0 = object5;
                    d12 = d11;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Boxing.boxBoolean(false);
    }

    // 去混淆评级： 低(40)
    public static final float pointerSlop-E8SPZFQ(@NotNull ViewConfiguration viewConfiguration0, int v) {
        return PointerType.equals-impl0(v, 2) ? viewConfiguration0.getTouchSlop() * DragGestureDetectorKt.a : viewConfiguration0.getTouchSlop();
    }

    @Nullable
    public static final Object verticalDrag-jO51t88(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        float f;
        Object object3;
        AwaitPointerEventScope awaitPointerEventScope4;
        Object object2;
        Function1 function11;
        AwaitPointerEventScope awaitPointerEventScope1;
        e1 e11;
        Orientation orientation1;
        long v2;
        e1 e10;
        if(continuation0 instanceof e1) {
            e10 = (e1)continuation0;
            int v1 = e10.u;
            if((v1 & 0x80000000) == 0) {
                e10 = new e1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                e10.u = v1 ^ 0x80000000;
            }
        }
        else {
            e10 = new e1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = e10.t;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(e10.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Orientation orientation0 = Orientation.Vertical;
                v2 = v;
                if(!DragGestureDetectorKt.a(awaitPointerEventScope0.getCurrentEvent(), v2)) {
                    orientation1 = orientation0;
                    e11 = e10;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    function11 = function10;
                    goto label_81;
                }
                break;
            }
            case 1: {
                LongRef ref$LongRef0 = e10.s;
                AwaitPointerEventScope awaitPointerEventScope2 = e10.r;
                Orientation orientation2 = e10.q;
                AwaitPointerEventScope awaitPointerEventScope3 = e10.p;
                Function1 function12 = e10.o;
                ResultKt.throwOnFailure(object0);
                e1 e12 = e10;
                function11 = function12;
                while(true) {
                    List list0 = ((PointerEvent)object0).getChanges();
                    int v3 = list0.size();
                    int v4 = 0;
                    while(true) {
                        if(v4 < v3) {
                            object2 = list0.get(v4);
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            if(PointerId.equals-impl0(((PointerInputChange)object2).getId-J3iCeTQ(), ref$LongRef0.element)) {
                                break;
                            }
                            else {
                                ++v4;
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                continue;
                            }
                        }
                        awaitPointerEventScope4 = awaitPointerEventScope2;
                        object2 = null;
                        break;
                    }
                    PointerInputChange pointerInputChange0 = (PointerInputChange)object2;
                    if(pointerInputChange0 == null) {
                        pointerInputChange0 = null;
                    }
                    else if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                        List list1 = ((PointerEvent)object0).getChanges();
                        int v5 = list1.size();
                        int v6 = 0;
                        while(true) {
                            object3 = null;
                            if(v6 < v5) {
                                Object object4 = list1.get(v6);
                                if(((PointerInputChange)object4).getPressed()) {
                                    object3 = object4;
                                }
                                else {
                                    ++v6;
                                    continue;
                                }
                            }
                            break;
                        }
                        if(((PointerInputChange)object3) != null) {
                            ref$LongRef0.element = ((PointerInputChange)object3).getId-J3iCeTQ();
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            awaitPointerEventScope1 = awaitPointerEventScope3;
                            e11 = e12;
                            goto label_86;
                        }
                    }
                    else {
                        long v7 = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange0);
                        if(orientation2 == null) {
                            f = Offset.getDistance-impl(v7);
                        }
                        else {
                            f = orientation2 == Orientation.Vertical ? Offset.getY-impl(v7) : Offset.getX-impl(v7);
                        }
                        if(f == 0.0f) {
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            awaitPointerEventScope1 = awaitPointerEventScope3;
                            e11 = e12;
                            goto label_86;
                        }
                    }
                    if(pointerInputChange0 == null || pointerInputChange0.isConsumed()) {
                        break alab1;
                    }
                    if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                        return pointerInputChange0 == null ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
                    }
                    function11.invoke(pointerInputChange0);
                    awaitPointerEventScope1 = awaitPointerEventScope3;
                    e11 = e12;
                    orientation1 = orientation2;
                    v2 = pointerInputChange0.getId-J3iCeTQ();
                label_81:
                    LongRef ref$LongRef1 = new LongRef();
                    ref$LongRef1.element = v2;
                    awaitPointerEventScope2 = awaitPointerEventScope1;
                    orientation2 = orientation1;
                    ref$LongRef0 = ref$LongRef1;
                label_86:
                    e11.o = function11;
                    e11.p = awaitPointerEventScope1;
                    e11.q = orientation2;
                    e11.r = awaitPointerEventScope2;
                    e11.s = ref$LongRef0;
                    e11.u = 1;
                    Object object5 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, e11, 1, null);
                    if(object5 == object1) {
                        return object1;
                    }
                    awaitPointerEventScope3 = awaitPointerEventScope1;
                    object0 = object5;
                    e12 = e11;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Boxing.boxBoolean(false);
    }
}

