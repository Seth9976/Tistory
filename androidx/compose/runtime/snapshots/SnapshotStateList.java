package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.l;
import androidx.room.f;
import i1.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u001D\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001TB\u0007\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0018\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0016\u001A\u00020\u00112\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u0019\u001A\u00020\u0018H\u0096\u0002\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001C\u001A\u00020\u00182\u0006\u0010\u0010\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0002\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001A\u00020\u00182\u0006\u0010\u0010\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b#\u0010\u001DJ\u0015\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00000$H\u0016\u00A2\u0006\u0004\b%\u0010&J\u001D\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u0019\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b%\u0010\'J%\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001A\u00020\u00182\u0006\u0010)\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0017\u0010/\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b/\u0010\u0013J\u001F\u0010/\u001A\u00020\n2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0010\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b/\u00100J%\u00101\u001A\u00020\u00112\u0006\u0010\u0019\u001A\u00020\u00182\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016\u00A2\u0006\u0004\b1\u00102J\u001D\u00101\u001A\u00020\u00112\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016\u00A2\u0006\u0004\b1\u0010\u0017J\u000F\u00103\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b3\u0010\u0007J\u0017\u00104\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b4\u0010\u0013J\u001D\u00105\u001A\u00020\u00112\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016\u00A2\u0006\u0004\b5\u0010\u0017J\u0017\u00106\u001A\u00028\u00002\u0006\u0010\u0019\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b6\u0010\u001BJ\u001D\u00107\u001A\u00020\u00112\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016\u00A2\u0006\u0004\b7\u0010\u0017J \u00108\u001A\u00028\u00002\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0010\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b8\u00109J\u001D\u0010:\u001A\u00020\n2\u0006\u0010(\u001A\u00020\u00182\u0006\u0010)\u001A\u00020\u0018\u00A2\u0006\u0004\b:\u0010;J-\u0010@\u001A\u00020\u00182\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010<\u001A\u00020\u00182\u0006\u0010=\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b>\u0010?R$\u0010F\u001A\u00020\b2\u0006\u0010A\u001A\u00020\b8\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER\u0014\u0010I\u001A\u00020\u00188@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bG\u0010HR \u0010N\u001A\b\u0012\u0004\u0012\u00028\u00000J8@X\u0080\u0004\u00A2\u0006\f\u0012\u0004\bM\u0010\u0007\u001A\u0004\bK\u0010LR\u0014\u0010P\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010HR \u0010S\u001A\b\u0012\u0004\u0012\u00028\u00000\r8AX\u0080\u0004\u00A2\u0006\f\u0012\u0004\bR\u0010\u0007\u001A\u0004\bQ\u0010\u000F\u00A8\u0006U"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "", "toList", "()Ljava/util/List;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "(II)V", "start", "end", "retainAllInRange$runtime_release", "(Ljava/util/Collection;II)I", "retainAllInRange", "<set-?>", "a", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getStructure$runtime_release", "()I", "structure", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "readable", "getSize", "size", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,496:1\n170#1:497\n209#1,10:507\n219#1:518\n170#1:519\n220#1,9:521\n166#1:530\n229#1,7:536\n239#1,6:546\n202#1,17:552\n219#1:570\n170#1:571\n220#1,9:573\n166#1:582\n229#1,7:588\n239#1,6:598\n207#1:604\n209#1,10:605\n219#1:616\n170#1:617\n220#1,9:619\n166#1:628\n229#1,7:634\n239#1,6:644\n166#1:650\n209#1,10:661\n219#1:672\n170#1:673\n220#1,9:675\n166#1:684\n229#1,7:690\n239#1,6:700\n209#1,10:706\n219#1:717\n170#1:718\n220#1,9:720\n166#1:729\n229#1,7:735\n239#1,6:745\n202#1,17:752\n219#1:770\n170#1:771\n220#1,9:773\n166#1:782\n229#1,7:788\n239#1,6:798\n207#1:804\n206#1,13:805\n219#1:819\n170#1:820\n220#1,9:822\n166#1:831\n229#1,7:837\n239#1,6:847\n207#1:853\n175#1,5:854\n180#1:860\n170#1:861\n181#1,7:863\n166#1:870\n188#1,7:876\n197#1,3:886\n175#1,5:889\n180#1:895\n170#1:896\n181#1,7:898\n166#1:905\n188#1,7:911\n197#1,3:921\n170#1:924\n175#1,5:936\n180#1:942\n170#1:943\n181#1,7:945\n166#1:952\n188#1,7:958\n197#1,3:968\n170#1:972\n166#1:974\n213#1,6:985\n219#1:992\n170#1:993\n220#1,9:995\n166#1:1004\n229#1,7:1010\n239#1,6:1020\n213#1,7:1026\n170#1:1033\n220#1,9:1035\n166#1:1044\n229#1,7:1050\n239#1,6:1060\n170#1:1067\n166#1:1069\n170#1:1081\n166#1:1083\n2420#2:498\n2420#2:506\n2420#2:520\n2313#2,2:531\n1843#2:533\n2315#2,2:534\n2317#2,3:543\n2420#2:572\n2313#2,2:583\n1843#2:585\n2315#2,2:586\n2317#2,3:595\n2420#2:618\n2313#2,2:629\n1843#2:631\n2315#2,2:632\n2317#2,3:641\n2313#2,2:651\n1843#2:653\n2315#2,2:655\n2317#2,3:658\n2420#2:674\n2313#2,2:685\n1843#2:687\n2315#2,2:688\n2317#2,3:697\n2420#2:719\n2313#2,2:730\n1843#2:732\n2315#2,2:733\n2317#2,3:742\n2420#2:772\n2313#2,2:783\n1843#2:785\n2315#2,2:786\n2317#2,3:795\n2420#2:821\n2313#2,2:832\n1843#2:834\n2315#2,2:835\n2317#2,3:844\n2420#2:862\n2313#2,2:871\n1843#2:873\n2315#2,2:874\n2317#2,3:883\n2420#2:897\n2313#2,2:906\n1843#2:908\n2315#2,2:909\n2317#2,3:918\n2420#2:925\n2313#2,2:926\n1843#2:928\n2315#2,5:930\n2420#2:935\n2420#2:944\n2313#2,2:953\n1843#2:955\n2315#2,2:956\n2317#2,3:965\n2420#2:973\n2313#2,2:975\n1843#2:977\n2315#2,2:979\n2317#2,3:982\n2420#2:994\n2313#2,2:1005\n1843#2:1007\n2315#2,2:1008\n2317#2,3:1017\n2420#2:1034\n2313#2,2:1045\n1843#2:1047\n2315#2,2:1048\n2317#2,3:1057\n2420#2:1068\n2313#2,2:1070\n1843#2:1072\n2315#2,2:1074\n2317#2,3:1077\n2420#2:1082\n2313#2,2:1084\n1843#2:1086\n2315#2,2:1088\n2317#2,3:1091\n33#3,7:499\n89#4:517\n89#4:569\n89#4:615\n89#4:654\n89#4:657\n89#4:671\n89#4:716\n89#4:769\n89#4:818\n89#4:859\n89#4:894\n89#4:929\n89#4:941\n89#4:971\n89#4:978\n89#4:981\n89#4:991\n89#4:1066\n89#4:1073\n89#4:1076\n89#4:1080\n89#4:1087\n89#4:1090\n1#5:751\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n70#1:497\n117#1:507,10\n117#1:518\n117#1:519\n117#1:521,9\n117#1:530\n117#1:536,7\n117#1:546,6\n118#1:552,17\n118#1:570\n118#1:571\n118#1:573,9\n118#1:582\n118#1:588,7\n118#1:598,6\n118#1:604\n123#1:605,10\n123#1:616\n123#1:617\n123#1:619,9\n123#1:628\n123#1:634,7\n123#1:644,6\n125#1:650\n133#1:661,10\n133#1:672\n133#1:673\n133#1:675,9\n133#1:684\n133#1:690,7\n133#1:700,6\n134#1:706,10\n134#1:717\n134#1:718\n134#1:720,9\n134#1:729\n134#1:735,7\n134#1:745,6\n135#1:752,17\n135#1:770\n135#1:771\n135#1:773,9\n135#1:782\n135#1:788,7\n135#1:798,6\n135#1:804\n138#1:805,13\n138#1:819\n138#1:820\n138#1:822,9\n138#1:831\n138#1:837,7\n138#1:847,6\n138#1:853\n142#1:854,5\n142#1:860\n142#1:861\n142#1:863,7\n142#1:870\n142#1:876,7\n142#1:886,3\n149#1:889,5\n149#1:895\n149#1:896\n149#1:898,7\n149#1:905\n149#1:911,7\n149#1:921,3\n162#1:924\n172#1:936,5\n172#1:942\n172#1:943\n172#1:945,7\n172#1:952\n172#1:958,7\n172#1:968,3\n180#1:972\n187#1:974\n206#1:985,6\n206#1:992\n206#1:993\n206#1:995,9\n206#1:1004\n206#1:1010,7\n206#1:1020,6\n206#1:1026,7\n206#1:1033\n206#1:1035,9\n206#1:1044\n206#1:1050,7\n206#1:1060,6\n219#1:1067\n228#1:1069\n219#1:1081\n228#1:1083\n70#1:498\n113#1:506\n117#1:520\n117#1:531,2\n117#1:533\n117#1:534,2\n117#1:543,3\n118#1:572\n118#1:583,2\n118#1:585\n118#1:586,2\n118#1:595,3\n123#1:618\n123#1:629,2\n123#1:631\n123#1:632,2\n123#1:641,3\n125#1:651,2\n125#1:653\n125#1:655,2\n125#1:658,3\n133#1:674\n133#1:685,2\n133#1:687\n133#1:688,2\n133#1:697,3\n134#1:719\n134#1:730,2\n134#1:732\n134#1:733,2\n134#1:742,3\n135#1:772\n135#1:783,2\n135#1:785\n135#1:786,2\n135#1:795,3\n138#1:821\n138#1:832,2\n138#1:834\n138#1:835,2\n138#1:844,3\n142#1:862\n142#1:871,2\n142#1:873\n142#1:874,2\n142#1:883,3\n149#1:897\n149#1:906,2\n149#1:908\n149#1:909,2\n149#1:918,3\n162#1:925\n166#1:926,2\n166#1:928\n166#1:930,5\n170#1:935\n172#1:944\n172#1:953,2\n172#1:955\n172#1:956,2\n172#1:965,3\n180#1:973\n187#1:975,2\n187#1:977\n187#1:979,2\n187#1:982,3\n206#1:994\n206#1:1005,2\n206#1:1007\n206#1:1008,2\n206#1:1017,3\n206#1:1034\n206#1:1045,2\n206#1:1047\n206#1:1048,2\n206#1:1057,3\n219#1:1068\n228#1:1070,2\n228#1:1072\n228#1:1074,2\n228#1:1077,3\n219#1:1082\n228#1:1084,2\n228#1:1086\n228#1:1088,2\n228#1:1091,3\n107#1:499,7\n117#1:517\n118#1:569\n123#1:615\n125#1:654\n126#1:657\n133#1:671\n134#1:716\n135#1:769\n138#1:818\n142#1:859\n149#1:894\n166#1:929\n172#1:941\n179#1:971\n187#1:978\n188#1:981\n206#1:991\n218#1:1066\n228#1:1073\n229#1:1076\n218#1:1080\n228#1:1087\n229#1:1090\n*E\n"})
public final class SnapshotStateList implements StateObject, List, RandomAccess, KMutableList {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fR(\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u00038\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0006R\"\u0010\u0019\u001A\u00020\u00128\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001D\u001A\u00020\u00128\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u0014\u001A\u0004\b\u001B\u0010\u0016\"\u0004\b\u001C\u0010\u0018¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "list", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "value", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "", "d", "I", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "modification", "e", "getStructuralChange$runtime_release", "setStructuralChange$runtime_release", "structuralChange", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,496:1\n89#2:497\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n85#1:497\n*E\n"})
    public static final class StateListStateRecord extends StateRecord {
        public static final int $stable = 8;
        public PersistentList c;
        public int d;
        public int e;

        public StateListStateRecord(@NotNull PersistentList persistentList0) {
            this.c = persistentList0;
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord stateRecord0) {
            synchronized(SnapshotStateListKt.a) {
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.c = ((StateListStateRecord)stateRecord0).c;
                this.d = ((StateListStateRecord)stateRecord0).d;
                this.e = ((StateListStateRecord)stateRecord0).e;
            }
        }

        @Override  // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateListStateRecord(this.c);
        }

        @NotNull
        public final PersistentList getList$runtime_release() {
            return this.c;
        }

        public final int getModification$runtime_release() {
            return this.d;
        }

        public final int getStructuralChange$runtime_release() {
            return this.e;
        }

        public final void setList$runtime_release(@NotNull PersistentList persistentList0) {
            this.c = persistentList0;
        }

        public final void setModification$runtime_release(int v) {
            this.d = v;
        }

        public final void setStructuralChange$runtime_release(int v) {
            this.e = v;
        }
    }

    public static final int $stable;
    public StateListStateRecord a;

    public SnapshotStateList() {
        PersistentList persistentList0 = ExtensionsKt.persistentListOf();
        StateListStateRecord snapshotStateList$StateListStateRecord0 = new StateListStateRecord(persistentList0);
        if(Snapshot.Companion.isInSnapshot()) {
            StateListStateRecord snapshotStateList$StateListStateRecord1 = new StateListStateRecord(persistentList0);
            snapshotStateList$StateListStateRecord1.setSnapshotId$runtime_release(1);
            snapshotStateList$StateListStateRecord0.setNext$runtime_release(snapshotStateList$StateListStateRecord1);
        }
        this.a = snapshotStateList$StateListStateRecord0;
    }

    public final boolean a(Function1 function10) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        Object object1;
        while(true) {
            synchronized(SnapshotStateListKt.access$getSync$p()) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            Builder persistentList$Builder0 = persistentList0.builder();
            object1 = function10.invoke(persistentList$Builder0);
            PersistentList persistentList1 = persistentList$Builder0.build();
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.access$getSync$p()) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return ((Boolean)object1).booleanValue();
            }
        }
        return ((Boolean)object1).booleanValue();
    }

    @Override
    public void add(int v, Object object0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        do {
            synchronized(SnapshotStateListKt.access$getSync$p()) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v2 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            PersistentList persistentList1 = persistentList0.add(v, object0);
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.access$getSync$p()) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v2) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
        while(!z);
    }

    @Override
    public boolean add(Object object0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        while(true) {
            synchronized(SnapshotStateListKt.access$getSync$p()) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            PersistentList persistentList1 = persistentList0.add(object0);
            boolean z = false;
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.access$getSync$p()) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(int v, @NotNull Collection collection0) {
        return this.a(new f(v, collection0));
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        while(true) {
            synchronized(SnapshotStateListKt.access$getSync$p()) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            PersistentList persistentList1 = persistentList0.addAll(collection0);
            boolean z = false;
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.access$getSync$p()) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Snapshot snapshot0;
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized(SnapshotKt.getLock()) {
            snapshot0 = Snapshot.Companion.getCurrent();
            StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord0), this, snapshot0);
            synchronized(SnapshotStateListKt.access$getSync$p()) {
                snapshotStateList$StateListStateRecord0.setList$runtime_release(ExtensionsKt.persistentListOf());
                snapshotStateList$StateListStateRecord0.setModification$runtime_release(snapshotStateList$StateListStateRecord0.getModification$runtime_release() + 1);
                snapshotStateList$StateListStateRecord0.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord0.getStructuralChange$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(snapshot0, this);
    }

    @Override
    public boolean contains(Object object0) {
        return this.getReadable$runtime_release().getList$runtime_release().contains(object0);
    }

    @Override
    public boolean containsAll(@NotNull Collection collection0) {
        return this.getReadable$runtime_release().getList$runtime_release().containsAll(collection0);
    }

    @Override
    public Object get(int v) {
        return this.getReadable$runtime_release().getList$runtime_release().get(v);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final List getDebuggerDisplayValue() {
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0))).getList$runtime_release();
    }

    public static void getDebuggerDisplayValue$annotations() {
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.a;
    }

    @NotNull
    public final StateListStateRecord getReadable$runtime_release() {
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord)SnapshotKt.readable(((StateListStateRecord)stateRecord0), this);
    }

    public static void getReadable$runtime_release$annotations() {
    }

    public int getSize() {
        return this.getReadable$runtime_release().getList$runtime_release().size();
    }

    public final int getStructure$runtime_release() {
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0))).getStructuralChange$runtime_release();
    }

    @Override
    public int indexOf(Object object0) {
        return this.getReadable$runtime_release().getList$runtime_release().indexOf(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public int lastIndexOf(Object object0) {
        return this.getReadable$runtime_release().getList$runtime_release().lastIndexOf(object0);
    }

    @Override
    @NotNull
    public ListIterator listIterator() {
        return new i1.f(this, 0);
    }

    @Override
    @NotNull
    public ListIterator listIterator(int v) {
        return new i1.f(this, v);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord0) {
        stateRecord0.setNext$runtime_release(this.getFirstStateRecord());
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.a = (StateListStateRecord)stateRecord0;
    }

    @Override
    public final Object remove(int v) {
        return this.removeAt(v);
    }

    @Override
    public boolean remove(Object object0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            PersistentList persistentList1 = persistentList0.remove(object0);
            boolean z = false;
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.a) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v1 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            PersistentList persistentList1 = persistentList0.removeAll(collection0);
            boolean z = false;
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.a) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return true;
            }
        }
        return false;
    }

    public Object removeAt(int v) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        Object object0 = this.get(v);
        do {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v2 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            PersistentList persistentList1 = persistentList0.removeAt(v);
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.a) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v2) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
        while(!z);
        return object0;
    }

    public final void removeRange(int v, int v1) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v3 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            Builder persistentList$Builder0 = persistentList0.builder();
            persistentList$Builder0.subList(v, v1).clear();
            PersistentList persistentList1 = persistentList$Builder0.build();
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.a) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v3) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return;
            }
        }
    }

    @Override
    public boolean retainAll(@NotNull Collection collection0) {
        return this.a(new l(collection0, 4));
    }

    public final int retainAllInRange$runtime_release(@NotNull Collection collection0, int v, int v1) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        int v2 = this.size();
        while(true) {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v4 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            Builder persistentList$Builder0 = persistentList0.builder();
            persistentList$Builder0.subList(v, v1).retainAll(collection0);
            PersistentList persistentList1 = persistentList$Builder0.build();
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.a) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v4) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                        snapshotStateList$StateListStateRecord1.setStructuralChange$runtime_release(snapshotStateList$StateListStateRecord1.getStructuralChange$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
            if(z) {
                return v2 - this.size();
            }
        }
        return v2 - this.size();
    }

    @Override
    public Object set(int v, Object object0) {
        Snapshot snapshot0;
        PersistentList persistentList0;
        boolean z;
        Object object1 = this.get(v);
        do {
            synchronized(SnapshotStateListKt.a) {
                StateRecord stateRecord0 = this.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord snapshotStateList$StateListStateRecord0 = (StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0));
                int v2 = snapshotStateList$StateListStateRecord0.getModification$runtime_release();
                persistentList0 = snapshotStateList$StateListStateRecord0.getList$runtime_release();
            }
            Intrinsics.checkNotNull(persistentList0);
            PersistentList persistentList1 = persistentList0.set(v, object0);
            if(Intrinsics.areEqual(persistentList1, persistentList0)) {
                break;
            }
            StateRecord stateRecord1 = this.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateListStateRecord snapshotStateList$StateListStateRecord1 = (StateListStateRecord)SnapshotKt.writableRecord(((StateListStateRecord)stateRecord1), this, snapshot0);
                synchronized(SnapshotStateListKt.a) {
                    if(snapshotStateList$StateListStateRecord1.getModification$runtime_release() == v2) {
                        snapshotStateList$StateListStateRecord1.setList$runtime_release(persistentList1);
                        z = true;
                        snapshotStateList$StateListStateRecord1.setModification$runtime_release(snapshotStateList$StateListStateRecord1.getModification$runtime_release() + 1);
                    }
                    else {
                        z = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
        while(!z);
        return object1;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    @NotNull
    public List subList(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.size()) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new h(this, v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }

    @NotNull
    public final List toList() {
        return this.getReadable$runtime_release().getList$runtime_release();
    }

    @Override
    @NotNull
    public String toString() {
        StateRecord stateRecord0 = this.getFirstStateRecord();
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord)SnapshotKt.current(((StateListStateRecord)stateRecord0))).getList$runtime_release() + ")@" + this.hashCode();
    }
}

