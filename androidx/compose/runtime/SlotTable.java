package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.h;
import y0.m;
import y0.s0;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010(\n\u0002\b3\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005J9\u0010\r\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00062!\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b\u00A2\u0006\u0004\b\r\u0010\u000EJ9\u0010\u0011\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00062!\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\r\u0010\u0012\u001A\u00020\b\u00A2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u001B\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0015\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001D\u0010!\u001A\u00020\u001D2\u0006\u0010 \u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b!\u0010\"J?\u0010*\u001A\u00020\'2\u0006\u0010\u000B\u001A\u00020\b2&\u0010&\u001A\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%H\u0000\u00A2\u0006\u0004\b(\u0010)J\u008F\u0001\u0010*\u001A\u00020\'2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010,\u001A\u00020+2\u0006\u0010-\u001A\u00020\u00162\u000E\u00100\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001A\u00020\u00162\u0016\u00104\u001A\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`32&\u0010&\u001A\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%2\u000E\u00107\u001A\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0000\u00A2\u0006\u0004\b(\u00108J\u0087\u0001\u0010;\u001A\u00020\'2\u0006\u0010,\u001A\u00020+2\u0006\u0010-\u001A\u00020\u00162\u000E\u00100\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001A\u00020\u00162\u0016\u00104\u001A\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`32&\u0010&\u001A\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%2\u000E\u00107\u001A\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0000\u00A2\u0006\u0004\b9\u0010:J\u001F\u0010A\u001A\n\u0012\u0004\u0012\u00020>\u0018\u00010=2\u0006\u0010<\u001A\u00020\u0016H\u0000\u00A2\u0006\u0004\b?\u0010@J\r\u0010B\u001A\u00020\u001D\u00A2\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001A\u0004\u0018\u00010$2\u0006\u0010D\u001A\u00020\u0016\u00A2\u0006\u0004\bE\u0010FJ\r\u0010G\u001A\u00020\'\u00A2\u0006\u0004\bG\u0010\u0005J\r\u0010H\u001A\u00020\'\u00A2\u0006\u0004\bH\u0010\u0005J\r\u0010I\u001A\u00020\'\u00A2\u0006\u0004\bI\u0010\u0005J\r\u0010K\u001A\u00020J\u00A2\u0006\u0004\bK\u0010LJ\u001F\u0010N\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010/0=2\u0006\u0010D\u001A\u00020\u0016H\u0000\u00A2\u0006\u0004\bM\u0010@J!\u0010R\u001A\u0004\u0018\u00010/2\u0006\u0010D\u001A\u00020\u00162\u0006\u0010O\u001A\u00020\u0016H\u0000\u00A2\u0006\u0004\bP\u0010QJ\u0016\u0010T\u001A\b\u0012\u0004\u0012\u00020\u00030SH\u0096\u0002\u00A2\u0006\u0004\bT\u0010UJ\u0019\u0010W\u001A\u0004\u0018\u00010\u00032\u0006\u0010V\u001A\u00020/H\u0016\u00A2\u0006\u0004\bW\u0010XR$\u0010,\u001A\u00020+2\u0006\u0010Y\u001A\u00020+8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]R$\u0010-\u001A\u00020\u00162\u0006\u0010Y\u001A\u00020\u00168\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aR4\u00100\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u000E\u0010Y\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bb\u0010c\u001A\u0004\bd\u0010eR$\u00101\u001A\u00020\u00162\u0006\u0010Y\u001A\u00020\u00168\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bf\u0010_\u001A\u0004\bg\u0010aR$\u0010\u0010\u001A\u00020\u001D2\u0006\u0010Y\u001A\u00020\u001D8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u0010CR\"\u0010o\u001A\u00020\u00168\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bk\u0010_\u001A\u0004\bl\u0010a\"\u0004\bm\u0010nR2\u00104\u001A\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`38\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bp\u0010q\u001A\u0004\br\u0010s\"\u0004\bt\u0010uRB\u0010&\u001A\"\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020$\u0018\u0001`%8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bv\u0010w\u001A\u0004\bx\u0010y\"\u0004\bz\u0010{R,\u00107\u001A\n\u0012\u0004\u0012\u000206\u0018\u0001058\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0014\n\u0004\b|\u0010}\u001A\u0004\b~\u0010\u007F\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0082\u0001\u001A\u00020\u001D8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0082\u0001\u0010CR\u001D\u0010\u0085\u0001\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0083\u0001\u0010\u0084\u0001\u00A8\u0006\u0086\u0001"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "<init>", "()V", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/ParameterName;", "name", "reader", "block", "read", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "writer", "write", "openReader", "()Landroidx/compose/runtime/SlotReader;", "openWriter", "()Landroidx/compose/runtime/SlotWriter;", "", "index", "Landroidx/compose/runtime/Anchor;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "", "ownsAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "groupIndex", "groupContainsAnchor", "(ILandroidx/compose/runtime/Anchor;)Z", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V", "close", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "setTo", "target", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "containsMark", "()Z", "group", "sourceInformationOf", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "verifyWellFormed", "collectCalledByInformation", "collectSourceInformation", "", "toDebugString", "()Ljava/lang/String;", "slotsOf$runtime_release", "slotsOf", "slotIndex", "slot$runtime_release", "(II)Ljava/lang/Object;", "slot", "", "iterator", "()Ljava/util/Iterator;", "identityToFind", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", "<set-?>", "a", "[I", "getGroups", "()[I", "b", "I", "getGroupsSize", "()I", "c", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "d", "getSlotsSize", "f", "Z", "getWriter$runtime_release", "g", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "version", "h", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "i", "Ljava/util/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "j", "Landroidx/collection/MutableIntObjectMap;", "getCalledByMap$runtime_release", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime_release", "(Landroidx/collection/MutableIntObjectMap;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4151:1\n158#1,8:4237\n174#1,5:4245\n180#1,3:4257\n1#2:4152\n1#2:4256\n4551#3,7:4153\n4551#3,7:4160\n4551#3,7:4167\n4551#3,7:4187\n4551#3,7:4194\n4551#3,7:4208\n4551#3,7:4215\n4551#3,7:4222\n33#4,7:4174\n33#4,7:4201\n33#4,7:4230\n50#4,7:4260\n50#4,7:4267\n33#4,7:4278\n33#4,7:4285\n33#4,7:4293\n33#4,7:4300\n50#4,7:4307\n50#4,7:4314\n50#4,7:4321\n50#4,7:4328\n50#4,7:4335\n50#4,7:4342\n50#4,7:4349\n50#4,7:4356\n50#4,7:4363\n50#4,7:4370\n50#4,7:4377\n33#4,7:4388\n33#4,7:4395\n4018#5,6:4181\n89#6:4229\n33#7,6:4250\n33#7,4:4274\n38#7:4292\n33#7,4:4384\n38#7:4402\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n357#1:4237,8\n394#1:4245,5\n394#1:4257,3\n394#1:4256\n203#1:4153,7\n204#1:4160,7\n220#1:4167,7\n233#1:4187,7\n244#1:4194,7\n264#1:4208,7\n265#1:4215,7\n277#1:4222,7\n221#1:4174,7\n245#1:4201,7\n306#1:4230,7\n513#1:4260,7\n520#1:4267,7\n529#1:4278,7\n532#1:4285,7\n555#1:4293,7\n558#1:4300,7\n451#1:4307,7\n456#1:4314,7\n459#1:4321,7\n465#1:4328,7\n468#1:4335,7\n472#1:4342,7\n478#1:4349,7\n482#1:4356,7\n491#1:4363,7\n496#1:4370,7\n501#1:4377,7\n541#1:4388,7\n544#1:4395,7\n224#1:4181,6\n280#1:4229\n396#1:4250,6\n527#1:4274,4\n527#1:4292\n538#1:4384,4\n538#1:4402\n*E\n"})
public final class SlotTable implements CompositionData, Iterable, KMappedMarker {
    public static final int $stable = 8;
    public int[] a;
    public int b;
    public Object[] c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public ArrayList h;
    public HashMap i;
    public MutableIntObjectMap j;

    public SlotTable() {
        this.a = new int[0];
        this.c = new Object[0];
        this.h = new ArrayList();
    }

    public final int a(StringBuilder stringBuilder0, int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append("Group(");
        stringBuilder0.append(v);
        stringBuilder0.append(")");
        GroupSourceInformation groupSourceInformation0 = this.sourceInformationOf(v);
        if(groupSourceInformation0 != null) {
            String s = groupSourceInformation0.getSourceInformation();
            if(s != null && (p.startsWith$default(s, "C(", false, 2, null) || p.startsWith$default(s, "CC(", false, 2, null))) {
                int v3 = StringsKt__StringsKt.indexOf$default(s, "(", 0, false, 6, null);
                int v4 = StringsKt__StringsKt.indexOf$default(s, ')', 0, false, 6, null);
                stringBuilder0.append(" ");
                String s1 = s.substring(v3 + 1, v4);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                stringBuilder0.append(s1);
                stringBuilder0.append("()");
            }
        }
        stringBuilder0.append(" key=");
        stringBuilder0.append(SlotTableKt.access$key(this.a, v));
        int v5 = SlotTableKt.access$groupSize(this.a, v);
        stringBuilder0.append(", nodes=");
        stringBuilder0.append(SlotTableKt.access$nodeCount(this.a, v));
        stringBuilder0.append(", size=");
        stringBuilder0.append(v5);
        if(SlotTableKt.access$hasMark(this.a, v)) {
            stringBuilder0.append(", mark");
        }
        if(SlotTableKt.access$containsMark(this.a, v)) {
            stringBuilder0.append(", contains mark");
        }
        int v6 = v < this.b ? SlotTableKt.access$dataAnchor(this.a, v) : this.d;
        int v7 = v + 1;
        int v8 = v7 < this.b ? SlotTableKt.access$dataAnchor(this.a, v7) : this.d;
        if(v6 < 0 || v6 > v8 || v8 > this.d) {
            stringBuilder0.append(", *invalid data offsets " + v6 + '-' + v8 + '*');
        }
        else {
            if(SlotTableKt.access$hasObjectKey(this.a, v)) {
                stringBuilder0.append(" objectKey=" + SlotTableKt.access$summarize(String.valueOf(this.c[SlotTableKt.access$objectKeyIndex(this.a, v)]), 10));
            }
            if(SlotTableKt.access$isNode(this.a, v)) {
                stringBuilder0.append(" node=" + SlotTableKt.access$summarize(String.valueOf(this.c[SlotTableKt.access$nodeIndex(this.a, v)]), 10));
            }
            if(SlotTableKt.access$hasAux(this.a, v)) {
                stringBuilder0.append(" aux=" + SlotTableKt.access$summarize(String.valueOf(this.c[SlotTableKt.access$auxIndex(this.a, v)]), 10));
            }
            int v9 = SlotTableKt.access$slotAnchor(this.a, v);
            if(v9 < v8) {
                stringBuilder0.append(", slots=[");
                stringBuilder0.append(v9);
                stringBuilder0.append(": ");
                for(int v10 = v9; v10 < v8; ++v10) {
                    if(v10 != v9) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(SlotTableKt.access$summarize(String.valueOf(this.c[v10]), 10));
                }
                stringBuilder0.append("]");
            }
        }
        stringBuilder0.append('\n');
        while(v7 < v + v5) {
            v7 += this.a(stringBuilder0, v7, v1 + 1);
        }
        return v5;
    }

    @NotNull
    public final Anchor anchor(int v) {
        if(this.f) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        if(v < 0 || v >= this.b) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList arrayList0 = this.h;
        int v1 = SlotTableKt.access$search(arrayList0, v, this.b);
        if(v1 < 0) {
            Anchor anchor0 = new Anchor(v);
            arrayList0.add(-(v1 + 1), anchor0);
            return anchor0;
        }
        return (Anchor)arrayList0.get(v1);
    }

    public final int anchorIndex(@NotNull Anchor anchor0) {
        if(this.f) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if(!anchor0.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor0.getLocation$runtime_release();
    }

    public final RecomposeScopeImpl b(int v) {
        for(int v1 = v; v1 > 0; v1 = SlotTableKt.access$parentAnchor(this.a, v1)) {
            h h0 = new h(this, v1);
            while(h0.hasNext()) {
                Object object0 = h0.next();
                if(object0 instanceof RecomposeScopeImpl) {
                    if(((RecomposeScopeImpl)object0).getUsed() && v1 != v) {
                        return (RecomposeScopeImpl)object0;
                    }
                    ((RecomposeScopeImpl)object0).setForcedRecompose(true);
                }
            }
        }
        return null;
    }

    public static final void c(SlotReader slotReader0, MutableIntSet mutableIntSet0, ArrayList arrayList0, BooleanRef ref$BooleanRef0, SlotTable slotTable0, ArrayList arrayList1) {
        int v = slotReader0.getGroupKey();
        if(mutableIntSet0.contains(v)) {
            if(v != -3) {
                arrayList0.add(SlotReader.anchor$default(slotReader0, 0, 1, null));
            }
            if(ref$BooleanRef0.element) {
                RecomposeScopeImpl recomposeScopeImpl0 = slotTable0.b(slotReader0.getCurrentGroup());
                if(recomposeScopeImpl0 == null) {
                    ref$BooleanRef0.element = false;
                    arrayList1.clear();
                }
                else {
                    arrayList1.add(recomposeScopeImpl0);
                    Anchor anchor0 = recomposeScopeImpl0.getAnchor();
                    if(anchor0 != null && anchor0.getLocation$runtime_release() == slotReader0.getCurrentGroup()) {
                        RecomposeScopeImpl recomposeScopeImpl1 = slotTable0.b(slotReader0.getParent());
                        if(recomposeScopeImpl1 != null) {
                            arrayList1.add(recomposeScopeImpl1);
                        }
                    }
                }
            }
            slotReader0.skipGroup();
            return;
        }
        slotReader0.startGroup();
        while(!slotReader0.isGroupEnd()) {
            SlotTable.c(slotReader0, mutableIntSet0, arrayList0, ref$BooleanRef0, slotTable0, arrayList1);
        }
        slotReader0.endGroup();
    }

    public final void close$runtime_release(@NotNull SlotReader slotReader0, @Nullable HashMap hashMap0) {
        if(slotReader0.getTable$runtime_release() != this || this.e <= 0) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        --this.e;
        if(hashMap0 != null) {
            synchronized(this) {
                HashMap hashMap1 = this.i;
                if(hashMap1 == null) {
                    this.i = hashMap0;
                }
                else {
                    hashMap1.putAll(hashMap0);
                }
            }
        }
    }

    public final void close$runtime_release(@NotNull SlotWriter slotWriter0, @NotNull int[] arr_v, int v, @NotNull Object[] arr_object, int v1, @NotNull ArrayList arrayList0, @Nullable HashMap hashMap0, @Nullable MutableIntObjectMap mutableIntObjectMap0) {
        if(slotWriter0.getTable$runtime_release() != this || !this.f) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.f = false;
        this.setTo$runtime_release(arr_v, v, arr_object, v1, arrayList0, hashMap0, mutableIntObjectMap0);
    }

    public final void collectCalledByInformation() {
        this.j = new MutableIntObjectMap(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.i = new HashMap();
    }

    public final boolean containsMark() {
        return this.b > 0 && SlotTableKt.access$containsMark(this.a, 0);
    }

    public static final int d(IntRef ref$IntRef0, SlotTable slotTable0, int v, int v1) {
        int v2 = ref$IntRef0.element;
        ref$IntRef0.element = v2 + 1;
        int v3 = SlotTableKt.access$parentAnchor(slotTable0.a, v2);
        if(v3 != v) {
            StringBuilder stringBuilder0 = q.u("Invalid parent index detected at ", v2, ", expected parent index to be ", v, " found ");
            stringBuilder0.append(v3);
            PreconditionsKt.throwIllegalStateException(stringBuilder0.toString());
        }
        int v4 = SlotTableKt.access$groupSize(slotTable0.a, v2) + v2;
        if(v4 > slotTable0.b) {
            PreconditionsKt.throwIllegalStateException(("A group extends past the end of the table at " + v2));
        }
        if(v4 > v1) {
            PreconditionsKt.throwIllegalStateException(("A group extends past its parent group at " + v2));
        }
        int v5 = SlotTableKt.access$dataAnchor(slotTable0.a, v2);
        int v6 = v2 < slotTable0.b - 1 ? SlotTableKt.access$dataAnchor(slotTable0.a, v2 + 1) : slotTable0.d;
        if(v6 > slotTable0.c.length) {
            PreconditionsKt.throwIllegalStateException(("Slots for " + v2 + " extend past the end of the slot table"));
        }
        if(v5 > v6) {
            PreconditionsKt.throwIllegalStateException(("Invalid data anchor at " + v2));
        }
        if(SlotTableKt.access$slotAnchor(slotTable0.a, v2) > v6) {
            PreconditionsKt.throwIllegalStateException(("Slots start out of range at " + v2));
        }
        int v7 = SlotTableKt.access$isNode(slotTable0.a, v2);
        int v8 = SlotTableKt.access$hasObjectKey(slotTable0.a, v2);
        if(v6 - v5 < SlotTableKt.access$hasAux(slotTable0.a, v2) + (v8 + v7)) {
            PreconditionsKt.throwIllegalStateException(("Not enough slots added for group " + v2));
        }
        boolean z = SlotTableKt.access$isNode(slotTable0.a, v2);
        if(z && slotTable0.c[SlotTableKt.access$nodeIndex(slotTable0.a, v2)] == null) {
            PreconditionsKt.throwIllegalStateException(("No node recorded for a node group at " + v2));
        }
        int v9;
        for(v9 = 0; ref$IntRef0.element < v4; v9 += SlotTable.d(ref$IntRef0, slotTable0, v2, v4)) {
        }
        int v10 = SlotTableKt.access$nodeCount(slotTable0.a, v2);
        int v11 = SlotTableKt.access$groupSize(slotTable0.a, v2);
        if(v10 != v9) {
            StringBuilder stringBuilder1 = q.u("Incorrect node count detected at ", v2, ", expected ", v10, ", received ");
            stringBuilder1.append(v9);
            PreconditionsKt.throwIllegalStateException(stringBuilder1.toString());
        }
        int v12 = ref$IntRef0.element - v2;
        if(v11 != v12) {
            StringBuilder stringBuilder2 = q.u("Incorrect slot count detected at ", v2, ", expected ", v11, ", received ");
            stringBuilder2.append(v12);
            PreconditionsKt.throwIllegalStateException(stringBuilder2.toString());
        }
        if(SlotTableKt.access$containsAnyMark(slotTable0.a, v2) && v2 > 0 && !SlotTableKt.access$containsMark(slotTable0.a, v)) {
            PreconditionsKt.throwIllegalStateException(("Expected group " + v + " to record it contains a mark because " + v2 + " does"));
        }
        return z ? 1 : v9;
    }

    public static final void e(SlotTable slotTable0, GroupSourceInformation groupSourceInformation0) {
        ArrayList arrayList0 = groupSourceInformation0.getGroups();
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arrayList0.get(v1);
                if(object0 instanceof Anchor) {
                    if(!((Anchor)object0).getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if(!slotTable0.ownsAnchor(((Anchor)object0))) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                }
                else if(object0 instanceof GroupSourceInformation) {
                    SlotTable.e(slotTable0, ((GroupSourceInformation)object0));
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public CompositionGroup find(@NotNull Object object0) {
        return new s0(0, this, this.getVersion$runtime_release()).find(object0);
    }

    @NotNull
    public final ArrayList getAnchors$runtime_release() {
        return this.h;
    }

    @Nullable
    public final MutableIntObjectMap getCalledByMap$runtime_release() {
        return this.j;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable getCompositionGroups() {
        return this;
    }

    @NotNull
    public final int[] getGroups() {
        return this.a;
    }

    public final int getGroupsSize() {
        return this.b;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.c;
    }

    public final int getSlotsSize() {
        return this.d;
    }

    @Nullable
    public final HashMap getSourceInformationMap$runtime_release() {
        return this.i;
    }

    public final int getVersion$runtime_release() {
        return this.g;
    }

    public final boolean getWriter$runtime_release() {
        return this.f;
    }

    public final boolean groupContainsAnchor(int v, @NotNull Anchor anchor0) {
        if(this.f) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if(v < 0 || v >= this.b) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if(this.ownsAnchor(anchor0)) {
            int v1 = SlotTableKt.access$groupSize(this.a, v);
            int v2 = anchor0.getLocation$runtime_release();
            return v <= v2 && v2 < v1 + v;
        }
        return false;
    }

    @Nullable
    public final List invalidateGroupsWithKey$runtime_release(int v) {
        ArrayList arrayList0 = new ArrayList();
        List list0 = new ArrayList();
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        ref$BooleanRef0.element = true;
        MutableIntSet mutableIntSet0 = new MutableIntSet(0, 1, null);
        mutableIntSet0.add(v);
        mutableIntSet0.add(-3);
        MutableIntObjectMap mutableIntObjectMap0 = this.j;
        if(mutableIntObjectMap0 != null) {
            MutableIntSet mutableIntSet1 = (MutableIntSet)mutableIntObjectMap0.get(v);
            if(mutableIntSet1 != null) {
                mutableIntSet0.addAll(mutableIntSet1);
            }
        }
        try(SlotReader slotReader0 = this.openReader()) {
            SlotTable.c(slotReader0, mutableIntSet0, arrayList0, ref$BooleanRef0, this, ((ArrayList)list0));
        }
        SlotWriter slotWriter0 = this.openWriter();
        try {
            slotWriter0.startGroup();
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Anchor anchor0 = (Anchor)arrayList0.get(v2);
                if(anchor0.toIndexFor(slotWriter0) >= slotWriter0.getCurrentGroup()) {
                    slotWriter0.seek(anchor0);
                    slotWriter0.bashCurrentGroup();
                }
            }
            slotWriter0.skipToGroupEnd();
            slotWriter0.endGroup();
        }
        catch(Throwable throwable1) {
            slotWriter0.close(false);
            throw throwable1;
        }
        slotWriter0.close(true);
        return ref$BooleanRef0.element ? list0 : null;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.b == 0;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new m(0, this, this.b);
    }

    @NotNull
    public final SlotReader openReader() {
        if(this.f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        ++this.e;
        return new SlotReader(this);
    }

    @NotNull
    public final SlotWriter openWriter() {
        if(this.f) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if(this.e > 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        ++this.g;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor0) {
        if(anchor0.getValid()) {
            int v = SlotTableKt.access$search(this.h, anchor0.getLocation$runtime_release(), this.b);
            return v >= 0 && Intrinsics.areEqual(this.h.get(v), anchor0);
        }
        return false;
    }

    public final Object read(@NotNull Function1 function10) {
        try(SlotReader slotReader0 = this.openReader()) {
            return function10.invoke(slotReader0);
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList arrayList0) {
        this.h = arrayList0;
    }

    public final void setCalledByMap$runtime_release(@Nullable MutableIntObjectMap mutableIntObjectMap0) {
        this.j = mutableIntObjectMap0;
    }

    public final void setSourceInformationMap$runtime_release(@Nullable HashMap hashMap0) {
        this.i = hashMap0;
    }

    public final void setTo$runtime_release(@NotNull int[] arr_v, int v, @NotNull Object[] arr_object, int v1, @NotNull ArrayList arrayList0, @Nullable HashMap hashMap0, @Nullable MutableIntObjectMap mutableIntObjectMap0) {
        this.a = arr_v;
        this.b = v;
        this.c = arr_object;
        this.d = v1;
        this.h = arrayList0;
        this.i = hashMap0;
        this.j = mutableIntObjectMap0;
    }

    public final void setVersion$runtime_release(int v) {
        this.g = v;
    }

    @Nullable
    public final Object slot$runtime_release(int v, int v1) {
        int v2 = SlotTableKt.access$slotAnchor(this.a, v);
        return v1 < 0 || v1 >= (v + 1 >= this.b ? this.c.length : SlotTableKt.access$dataAnchor(this.a, v + 1)) - v2 ? Composer.Companion.getEmpty() : this.c[v2 + v1];
    }

    @NotNull
    public final List slotsOf$runtime_release(int v) {
        int v2;
        int v1 = SlotTableKt.access$dataAnchor(this.a, v);
        if(v + 1 < this.b) {
            v2 = SlotTableKt.access$dataAnchor(this.a, v + 1);
            return ArraysKt___ArraysKt.toList(this.c).subList(v1, v2);
        }
        v2 = this.c.length;
        return ArraysKt___ArraysKt.toList(this.c).subList(v1, v2);
    }

    @Nullable
    public final GroupSourceInformation sourceInformationOf(int v) {
        HashMap hashMap0 = this.i;
        if(hashMap0 != null) {
            if(this.f) {
                ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
            }
            if(v >= 0) {
                int v1 = this.b;
                if(v < v1) {
                    Anchor anchor0 = SlotTableKt.access$find(this.h, v, v1);
                    return anchor0 == null ? null : ((GroupSourceInformation)hashMap0.get(anchor0));
                }
            }
            return null;
        }
        return null;
    }

    @NotNull
    public final String toDebugString() {
        if(this.f) {
            return this.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.toString());
        stringBuilder0.append('\n');
        int v = this.b;
        if(v > 0) {
            for(int v1 = 0; v1 < v; v1 += this.a(stringBuilder0, v1, 0)) {
            }
        }
        else {
            stringBuilder0.append("<EMPTY>");
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final void verifyWellFormed() {
        IntRef ref$IntRef0 = new IntRef();
        if(this.b > 0) {
            while(true) {
                int v1 = ref$IntRef0.element;
                int v2 = this.b;
                if(v1 >= v2) {
                    break;
                }
                SlotTable.d(ref$IntRef0, this, -1, SlotTableKt.access$groupSize(this.a, v1) + v1);
            }
            if(v1 != v2) {
                PreconditionsKt.throwIllegalStateException(("Incomplete group at root " + ref$IntRef0.element + " expected to be " + this.b));
            }
        }
        for(int v3 = this.d; v3 < this.c.length; ++v3) {
            if(this.c[v3] != null) {
                PreconditionsKt.throwIllegalStateException(("Non null value in the slot gap at index " + v3));
            }
        }
        ArrayList arrayList0 = this.h;
        int v4 = arrayList0.size();
        int v5 = 0;
        for(int v = -1; v5 < v4; v = v6) {
            int v6 = ((Anchor)arrayList0.get(v5)).toIndexFor(this);
            if(v6 < 0 || v6 > this.b) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if(v >= v6) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            ++v5;
        }
        HashMap hashMap0 = this.i;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.entrySet()) {
                Anchor anchor0 = (Anchor)((Map.Entry)object0).getKey();
                GroupSourceInformation groupSourceInformation0 = (GroupSourceInformation)((Map.Entry)object0).getValue();
                if(!anchor0.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if(!this.ownsAnchor(anchor0)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                SlotTable.e(this, groupSourceInformation0);
            }
        }
    }

    public final Object write(@NotNull Function1 function10) {
        Object object0;
        SlotWriter slotWriter0 = this.openWriter();
        try {
            object0 = function10.invoke(slotWriter0);
        }
        catch(Throwable throwable0) {
            slotWriter0.close(false);
            throw throwable0;
        }
        slotWriter0.close(true);
        return object0;
    }
}

