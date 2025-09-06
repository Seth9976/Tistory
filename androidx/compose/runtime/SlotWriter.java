package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b1\b\u0000\u0018\u0000 \u009F\u00012\u00020\u0001:\u0002\u009F\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000E\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0011\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010\nJ\u001D\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0017\u0010\u000FJ\u0017\u0010\u0017\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b\u0017\u0010\u001AJ\u0015\u0010\u001B\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u001B\u0010\fJ\u0015\u0010\u001B\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0015\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u001D\u001A\u00020\b\u00A2\u0006\u0004\b\u001F\u0010 J\r\u0010!\u001A\u00020\u001E\u00A2\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001A\u0004\u0018\u00010\u00012\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b$\u0010%J\u001F\u0010&\u001A\u00020\u001E2\u0006\u0010\u0019\u001A\u00020\u00182\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0015\u0010)\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020\u0006\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001A\u00020\u001E2\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b+\u0010,J\u0017\u0010-\u001A\u00020\u001E2\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b-\u0010,J\r\u0010.\u001A\u00020\u001E\u00A2\u0006\u0004\b.\u0010\"J\u0015\u00101\u001A\u00020\u001E2\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b1\u00102J\u001D\u00104\u001A\u00020\u001E2\u0006\u00103\u001A\u00020\u00062\u0006\u0010#\u001A\u00020/\u00A2\u0006\u0004\b4\u00105J\r\u00106\u001A\u00020\u001E\u00A2\u0006\u0004\b6\u0010\"J\u0017\u00107\u001A\u00020\u001E2\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b7\u0010,J\u001F\u00107\u001A\u00020\u001E2\u0006\u0010\u0019\u001A\u00020\u00182\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b7\u0010\'J\u0017\u00108\u001A\u00020\u001E2\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b8\u0010,J\u0017\u00109\u001A\u00020\u001E2\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b9\u0010,J!\u00109\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b9\u0010:J\u001D\u0010;\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b;\u0010<J)\u00109\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010#\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b9\u0010=J\u000F\u0010>\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b>\u0010?J\u001F\u0010@\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b@\u0010AJ\u001F\u0010@\u001A\u0004\u0018\u00010\u00012\u0006\u0010B\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b@\u0010CJ<\u0010F\u001A\u00020\u001E2\u0006\u0010B\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u00062\u001A\u0010E\u001A\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u001E0DH\u0086\b\u00A2\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001A\u00020\u00062\u0006\u0010B\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\bH\u0010\fJ\u0017\u0010K\u001A\u00020\u00062\u0006\u0010B\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\bJ\u0010\fJ\u0017\u0010M\u001A\u00020\u00062\u0006\u0010B\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\bL\u0010\fJ\u0015\u0010O\u001A\u00020\u001E2\u0006\u0010N\u001A\u00020\u0006\u00A2\u0006\u0004\bO\u0010*J\u0015\u0010P\u001A\u00020\u001E2\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\bP\u0010QJ\r\u0010R\u001A\u00020\u001E\u00A2\u0006\u0004\bR\u0010\"J\r\u0010S\u001A\u00020\u001E\u00A2\u0006\u0004\bS\u0010\"J\r\u0010T\u001A\u00020\u001E\u00A2\u0006\u0004\bT\u0010\"J\r\u0010U\u001A\u00020\u001E\u00A2\u0006\u0004\bU\u0010\"J\u0015\u0010U\u001A\u00020\u001E2\u0006\u00103\u001A\u00020\u0006\u00A2\u0006\u0004\bU\u0010*J\u001F\u0010U\u001A\u00020\u001E2\u0006\u00103\u001A\u00020\u00062\b\u0010V\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\bU\u0010WJ\u001F\u0010Y\u001A\u00020\u001E2\u0006\u00103\u001A\u00020\u00062\b\u0010X\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\bY\u0010WJ)\u0010Y\u001A\u00020\u001E2\u0006\u00103\u001A\u00020\u00062\b\u0010X\u001A\u0004\u0018\u00010\u00012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\bY\u0010ZJ)\u0010\\\u001A\u00020\u001E2\u0006\u00103\u001A\u00020\u00062\b\u0010X\u001A\u0004\u0018\u00010\u00012\b\u0010[\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b\\\u0010ZJ\u001F\u0010\\\u001A\u00020\u001E2\u0006\u00103\u001A\u00020\u00062\b\u0010[\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b\\\u0010WJ\r\u0010]\u001A\u00020\u0006\u00A2\u0006\u0004\b]\u0010^J\u0015\u0010_\u001A\u00020\u001E2\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b_\u0010*J\u0015\u0010_\u001A\u00020\u001E2\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b_\u0010QJ\r\u0010`\u001A\u00020\u0006\u00A2\u0006\u0004\b`\u0010^J\r\u0010a\u001A\u00020\b\u00A2\u0006\u0004\ba\u0010bJ\u0015\u0010d\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010c\u00A2\u0006\u0004\bd\u0010eJR\u0010i\u001A\u00020\u001E2\u0006\u0010\u0014\u001A\u00020\u000628\u0010E\u001A4\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\bf\u0012\b\bg\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\bf\u0012\b\bg\u0012\u0004\b\b(h\u0012\u0004\u0012\u00020\u001E0DH\u0086\b\u00A2\u0006\u0004\bi\u0010jJR\u0010k\u001A\u00020\u001E2\u0006\u0010\u0014\u001A\u00020\u000628\u0010E\u001A4\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\bf\u0012\b\bg\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\bf\u0012\b\bg\u0012\u0004\b\b(h\u0012\u0004\u0012\u00020\u001E0DH\u0086\b\u00A2\u0006\u0004\bk\u0010jJ\u0015\u0010m\u001A\u00020\u001E2\u0006\u0010l\u001A\u00020\u0006\u00A2\u0006\u0004\bm\u0010*J+\u0010p\u001A\b\u0012\u0004\u0012\u00020\u00180o2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010l\u001A\u00020\u00062\u0006\u0010n\u001A\u00020\u0000\u00A2\u0006\u0004\bp\u0010qJ-\u0010s\u001A\b\u0012\u0004\u0012\u00020\u00180o2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010r\u001A\u00020\b\u00A2\u0006\u0004\bs\u0010tJ\r\u0010u\u001A\u00020\u001E\u00A2\u0006\u0004\bu\u0010\"J+\u0010v\u001A\b\u0012\u0004\u0012\u00020\u00180o2\u0006\u0010l\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\bv\u0010wJ\u0017\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0019\u0010xJ\u0017\u0010y\u001A\u00020\u001E2\b\b\u0002\u0010\u0014\u001A\u00020\u0006\u00A2\u0006\u0004\by\u0010*J\u0015\u0010z\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\bz\u0010\u001CJ\u000F\u0010{\u001A\u00020/H\u0016\u00A2\u0006\u0004\b{\u0010|J\u0019\u0010~\u001A\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b}\u0010xJ\r\u0010\u007F\u001A\u00020/\u00A2\u0006\u0004\b\u007F\u0010|J\u0011\u0010\u0081\u0001\u001A\u00020\u001EH\u0000\u00A2\u0006\u0005\b\u0080\u0001\u0010\"J\u0011\u0010\u0083\u0001\u001A\u00020\u001EH\u0000\u00A2\u0006\u0005\b\u0082\u0001\u0010\"R\u001E\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001A\u0006\b\u0086\u0001\u0010\u0087\u0001R)\u0010\u008C\u0001\u001A\u00020\u00062\u0007\u0010\u0088\u0001\u001A\u00020\u00068\u0006@BX\u0086\u000E\u00A2\u0006\u000F\n\u0006\b\u0089\u0001\u0010\u008A\u0001\u001A\u0005\b\u008B\u0001\u0010^R)\u0010\u008F\u0001\u001A\u00020\u00062\u0007\u0010\u0088\u0001\u001A\u00020\u00068\u0006@BX\u0086\u000E\u00A2\u0006\u000F\n\u0006\b\u008D\u0001\u0010\u008A\u0001\u001A\u0005\b\u008E\u0001\u0010^R(\u0010\u001B\u001A\u00020\u00062\u0007\u0010\u0088\u0001\u001A\u00020\u00068\u0006@BX\u0086\u000E\u00A2\u0006\u000F\n\u0006\b\u0090\u0001\u0010\u008A\u0001\u001A\u0005\b\u0091\u0001\u0010^R)\u0010\u0095\u0001\u001A\u00020\b2\u0007\u0010\u0088\u0001\u001A\u00020\b8\u0006@BX\u0086\u000E\u00A2\u0006\u000F\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001A\u0005\b\u0094\u0001\u0010bR\u0013\u0010\u0096\u0001\u001A\u00020\b8F\u00A2\u0006\u0007\u001A\u0005\b\u0096\u0001\u0010bR\u0013\u0010\u0098\u0001\u001A\u00020\u00068F\u00A2\u0006\u0007\u001A\u0005\b\u0097\u0001\u0010^R\u0011\u0010\t\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\b\t\u0010bR\u0013\u0010\u009A\u0001\u001A\u00020\b8F\u00A2\u0006\u0007\u001A\u0005\b\u0099\u0001\u0010bR\u0013\u0010\u009C\u0001\u001A\u00020\b8F\u00A2\u0006\u0007\u001A\u0005\b\u009B\u0001\u0010bR\u0016\u0010\u009E\u0001\u001A\u00020\u00068@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u009D\u0001\u0010^\u00A8\u0006\u00A0\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "index", "", "isNode", "(I)Z", "nodeCount", "(I)I", "groupKey", "groupObjectKey", "(I)Ljava/lang/Object;", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "group", "indexInGroup", "(II)Z", "node", "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "parent", "(Landroidx/compose/runtime/Anchor;)I", "normalClose", "", "close", "(Z)V", "reset", "()V", "value", "update", "(Ljava/lang/Object;)Ljava/lang/Object;", "appendSlot", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "trimTailSlots", "(I)V", "updateAux", "(Ljava/lang/Object;)V", "insertAux", "updateToTableMaps", "", "sourceInformation", "recordGroupSourceInformation", "(Ljava/lang/String;)V", "key", "recordGrouplessCallSourceInformationStart", "(ILjava/lang/String;)V", "recordGrouplessCallSourceInformationEnd", "updateNode", "updateParentNode", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "slotIndexOfGroupSlotIndex", "(II)I", "(IILjava/lang/Object;)Ljava/lang/Object;", "skip", "()Ljava/lang/Object;", "slot", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "groupIndex", "(II)Ljava/lang/Object;", "Lkotlin/Function2;", "block", "forEachTailSlot", "(IILkotlin/jvm/functions/Function2;)V", "slotsStartIndex$runtime_release", "slotsStartIndex", "slotsEndIndex$runtime_release", "slotsEndIndex", "slotsEndAllIndex$runtime_release", "slotsEndAllIndex", "amount", "advanceBy", "seek", "(Landroidx/compose/runtime/Anchor;)V", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", "dataKey", "(ILjava/lang/Object;)V", "objectKey", "startNode", "(ILjava/lang/Object;Ljava/lang/Object;)V", "aux", "startData", "endGroup", "()I", "ensureStarted", "skipGroup", "removeGroup", "()Z", "", "groupSlots", "()Ljava/util/Iterator;", "Lkotlin/ParameterName;", "name", "data", "forEachData", "(ILkotlin/jvm/functions/Function2;)V", "forAllData", "offset", "moveGroup", "writer", "", "moveTo", "(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;", "removeSourceGroup", "moveFrom", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "bashCurrentGroup", "moveIntoGroupFrom", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "(I)Landroidx/compose/runtime/Anchor;", "markGroup", "anchorIndex", "toString", "()Ljava/lang/String;", "tryAnchor$runtime_release", "tryAnchor", "toDebugString", "verifyDataAnchors$runtime_release", "verifyDataAnchors", "verifyParentAnchors$runtime_release", "verifyParentAnchors", "a", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "<set-?>", "s", "I", "getCurrentGroup", "currentGroup", "t", "getCurrentGroupEnd", "currentGroupEnd", "u", "getParent", "v", "Z", "getClosed", "closed", "isGroupEnd", "getSlotsSize", "slotsSize", "getCollectingSourceInformation", "collectingSourceInformation", "getCollectingCalledInformation", "collectingCalledInformation", "getSize$runtime_release", "size", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 8 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4151:1\n4551#2,7:4152\n4551#2,7:4159\n4551#2,7:4166\n4551#2,7:4173\n4551#2,7:4180\n4551#2,7:4201\n4551#2,7:4208\n4551#2,7:4215\n4551#2,7:4229\n4551#2,7:4243\n4551#2,7:4250\n4551#2,7:4257\n4551#2,7:4264\n4551#2,7:4271\n4551#2,7:4278\n4551#2,7:4285\n4551#2,7:4292\n4551#2,7:4299\n4551#2,7:4306\n4551#2,7:4338\n4551#2,7:4345\n4551#2,7:4352\n50#3,7:4187\n50#3,7:4222\n50#3,7:4236\n50#3,7:4365\n50#3,7:4372\n50#3,7:4379\n50#3,7:4386\n50#3,7:4393\n50#3,7:4400\n361#4,7:4194\n174#5,5:4313\n180#5,3:4319\n174#5,5:4322\n180#5,3:4328\n1#6:4318\n1#6:4327\n1#6:4337\n4018#7,6:4331\n33#8,6:4359\n82#8,3:4407\n33#8,4:4410\n85#8,2:4414\n38#8:4416\n87#8:4417\n231#8,3:4418\n64#8,4:4421\n234#8,2:4425\n69#8:4427\n236#8:4428\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1632#1:4152,7\n1655#1:4159,7\n1691#1:4166,7\n1704#1:4173,7\n1707#1:4180,7\n1796#1:4201,7\n1817#1:4208,7\n1903#1:4215,7\n1908#1:4229,7\n1948#1:4243,7\n1959#1:4250,7\n2115#1:4257,7\n2179#1:4264,7\n2184#1:4271,7\n2216#1:4278,7\n2288#1:4285,7\n2289#1:4292,7\n2302#1:4299,7\n2397#1:4306,7\n2962#1:4338,7\n2974#1:4345,7\n3184#1:4352,7\n1717#1:4187,7\n1904#1:4222,7\n1946#1:4236,7\n3376#1:4365,7\n3380#1:4372,7\n3384#1:4379,7\n3400#1:4386,7\n3408#1:4393,7\n3412#1:4400,7\n1759#1:4194,7\n2706#1:4313,5\n2706#1:4319,3\n2747#1:4322,5\n2747#1:4328,3\n2706#1:4318\n2747#1:4327\n2767#1:4331,6\n3285#1:4359,6\n3456#1:4407,3\n3456#1:4410,4\n3456#1:4414,2\n3456#1:4416\n3456#1:4417\n3459#1:4418,3\n3459#1:4421,4\n3459#1:4425,2\n3459#1:4427\n3459#1:4428\n*E\n"})
public final class SlotWriter {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4151:1\n1#2:4152\n33#3,6:4153\n4551#4,7:4159\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2527#1:4153,6\n2583#1:4159,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static List a(SlotWriter slotWriter0, int v, SlotWriter slotWriter1, boolean z, boolean z1, boolean z2) {
            List list0;
            int v16;
            int v15;
            int v1 = slotWriter0.groupSize(v);
            int v2 = v + v1;
            int v3 = SlotWriter.access$dataIndex(slotWriter0, v);
            int v4 = SlotWriter.access$dataIndex(slotWriter0, v2);
            int v5 = v4 - v3;
            boolean z3 = SlotWriter.access$containsAnyGroupMarks(slotWriter0, v);
            slotWriter1.h(v1);
            slotWriter1.i(v5, slotWriter1.getCurrentGroup());
            if(slotWriter0.g < v2) {
                slotWriter0.j(v2);
            }
            if(slotWriter0.k < v4) {
                slotWriter0.k(v4, v2);
            }
            int[] arr_v = slotWriter1.b;
            int v6 = slotWriter1.getCurrentGroup();
            ArraysKt___ArraysJvmKt.copyInto(slotWriter0.b, arr_v, v6 * 5, v * 5, v2 * 5);
            Object[] arr_object = slotWriter1.c;
            int v7 = slotWriter1.i;
            ArraysKt___ArraysJvmKt.copyInto(slotWriter0.c, arr_object, v7, v3, v4);
            int v8 = slotWriter1.getParent();
            SlotTableKt.access$updateParentAnchor(arr_v, v6, v8);
            int v9 = v6 - v;
            int v10 = v6 + v1;
            int v11 = v7 - SlotWriter.access$dataIndex(slotWriter1, arr_v, v6);
            int v12 = slotWriter1.l;
            int v13 = slotWriter1.m;
            int v14 = v6;
            while(true) {
                v15 = 0;
                if(v14 >= v10) {
                    break;
                }
                if(v14 == v6) {
                    v16 = v10;
                }
                else {
                    v16 = v10;
                    SlotTableKt.access$updateParentAnchor(arr_v, v14, SlotTableKt.access$parentAnchor(arr_v, v14) + v9);
                }
                int v17 = SlotWriter.access$dataIndex(slotWriter1, arr_v, v14);
                if(v13 >= v14) {
                    v15 = slotWriter1.k;
                }
                SlotTableKt.access$updateDataAnchor(arr_v, v14, SlotWriter.access$dataIndexToDataAnchor(slotWriter1, v17 + v11, v15, v12, arr_object.length));
                if(v14 == v13) {
                    ++v13;
                }
                ++v14;
                v10 = v16;
            }
            slotWriter1.m = v13;
            int v18 = SlotTableKt.access$locationOf(slotWriter0.d, v, slotWriter0.getSize$runtime_release());
            int v19 = SlotTableKt.access$locationOf(slotWriter0.d, v2, slotWriter0.getSize$runtime_release());
            if(v18 < v19) {
                ArrayList arrayList0 = slotWriter0.d;
                list0 = new ArrayList(v19 - v18);
                for(int v20 = v18; v20 < v19; ++v20) {
                    Anchor anchor0 = (Anchor)arrayList0.get(v20);
                    anchor0.setLocation$runtime_release(anchor0.getLocation$runtime_release() + v9);
                    ((ArrayList)list0).add(anchor0);
                }
                slotWriter1.d.addAll(SlotTableKt.access$locationOf(slotWriter1.d, slotWriter1.getCurrentGroup(), slotWriter1.getSize$runtime_release()), list0);
                arrayList0.subList(v18, v19).clear();
            }
            else {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            if(!list0.isEmpty()) {
                HashMap hashMap0 = slotWriter0.e;
                HashMap hashMap1 = slotWriter1.e;
                if(hashMap0 != null && hashMap1 != null) {
                    int v21 = list0.size();
                    for(int v22 = 0; v22 < v21; ++v22) {
                        Anchor anchor1 = (Anchor)list0.get(v22);
                        GroupSourceInformation groupSourceInformation0 = (GroupSourceInformation)hashMap0.get(anchor1);
                        if(groupSourceInformation0 != null) {
                            hashMap0.remove(anchor1);
                            hashMap1.put(anchor1, groupSourceInformation0);
                        }
                    }
                }
            }
            int v23 = slotWriter1.getParent();
            GroupSourceInformation groupSourceInformation1 = slotWriter1.q(v8);
            int v24 = 1;
            if(groupSourceInformation1 != null) {
                int v25 = v23 + 1;
                int v26 = slotWriter1.getCurrentGroup();
                int v27 = -1;
                while(v25 < v26) {
                    v27 = v25;
                    v25 = SlotTableKt.access$groupSize(slotWriter1.b, v25) + v25;
                }
                groupSourceInformation1.addGroupAfter(slotWriter1, v27, v26);
            }
            int v28 = slotWriter0.parent(v);
            if(z2) {
                if(z) {
                    if(v28 >= 0) {
                        v15 = 1;
                        slotWriter0.startGroup();
                        slotWriter0.advanceBy(v28 - slotWriter0.getCurrentGroup());
                        slotWriter0.startGroup();
                    }
                    slotWriter0.advanceBy(v - slotWriter0.getCurrentGroup());
                    boolean z4 = slotWriter0.removeGroup();
                    if(v15 != 0) {
                        slotWriter0.skipToGroupEnd();
                        slotWriter0.endGroup();
                        slotWriter0.skipToGroupEnd();
                        slotWriter0.endGroup();
                    }
                    v15 = z4;
                }
                else {
                    v15 = slotWriter0.n(v, v1);
                    slotWriter0.o(v3, v5, v - 1);
                }
            }
            if(v15 != 0) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int v29 = slotWriter1.o;
            if(!SlotTableKt.access$isNode(arr_v, v6)) {
                v24 = SlotTableKt.access$nodeCount(arr_v, v6);
            }
            slotWriter1.o = v29 + v24;
            if(z1) {
                slotWriter1.s = v10;
                slotWriter1.i = v7 + v5;
            }
            if(z3) {
                slotWriter1.s(v8);
            }
            return list0;
        }

        public static final List access$moveGroup(Companion slotWriter$Companion0, SlotWriter slotWriter0, int v, SlotWriter slotWriter1, boolean z, boolean z1, boolean z2) {
            slotWriter$Companion0.getClass();
            return Companion.a(slotWriter0, v, slotWriter1, z, z1, z2);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final SlotTable a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public MutableIntObjectMap f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final IntStack p;
    public final IntStack q;
    public final IntStack r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public PrioritySet w;

    static {
        SlotWriter.Companion = new Companion(null);
        SlotWriter.$stable = 8;
    }

    public SlotWriter(@NotNull SlotTable slotTable0) {
        this.a = slotTable0;
        this.b = slotTable0.getGroups();
        this.c = slotTable0.getSlots();
        this.d = slotTable0.getAnchors$runtime_release();
        this.e = slotTable0.getSourceInformationMap$runtime_release();
        this.f = slotTable0.getCalledByMap$runtime_release();
        this.g = slotTable0.getGroupsSize();
        this.h = this.b.length / 5 - slotTable0.getGroupsSize();
        this.k = slotTable0.getSlotsSize();
        this.l = this.c.length - slotTable0.getSlotsSize();
        this.m = slotTable0.getGroupsSize();
        this.p = new IntStack();
        this.q = new IntStack();
        this.r = new IntStack();
        this.t = slotTable0.getGroupsSize();
        this.u = -1;
    }

    public final int a(int v, int[] arr_v) {
        if(v >= this.e()) {
            return this.c.length - this.l;
        }
        int v1 = SlotTableKt.access$dataAnchor(arr_v, v);
        return v1 >= 0 ? v1 : this.c.length - this.l + v1 + 1;
    }

    public static final boolean access$containsAnyGroupMarks(SlotWriter slotWriter0, int v) {
        if(v >= 0) {
            return SlotTableKt.access$containsAnyMark(slotWriter0.b, slotWriter0.f(v));
        }
        slotWriter0.getClass();
        return false;
    }

    public static final int access$dataIndex(SlotWriter slotWriter0, int v) {
        return slotWriter0.a(slotWriter0.f(v), slotWriter0.b);
    }

    public static final int access$dataIndex(SlotWriter slotWriter0, int[] arr_v, int v) {
        return slotWriter0.a(v, arr_v);
    }

    public static final int access$dataIndexToDataAnchor(SlotWriter slotWriter0, int v, int v1, int v2, int v3) {
        slotWriter0.getClass();
        return SlotWriter.c(v, v1, v2, v3);
    }

    public static final int access$slotIndex(SlotWriter slotWriter0, int[] arr_v, int v) {
        return slotWriter0.p(v, arr_v);
    }

    public final void advanceBy(int v) {
        if(v < 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if(this.n > 0) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if(v == 0) {
            return;
        }
        int v1 = this.s + v;
        if(v1 < this.u || v1 > this.t) {
            ComposerKt.composeImmediateRuntimeError(("Cannot seek outside the current group (" + this.u + '-' + this.t + ')'));
        }
        this.s = v1;
        int v2 = this.a(this.f(v1), this.b);
        this.i = v2;
        this.j = v2;
    }

    @NotNull
    public final Anchor anchor(int v) {
        ArrayList arrayList0 = this.d;
        int v1 = SlotTableKt.b(arrayList0, v, this.getSize$runtime_release());
        if(v1 < 0) {
            if(v > this.g) {
                v = -(this.getSize$runtime_release() - v);
            }
            Anchor anchor0 = new Anchor(v);
            arrayList0.add(-(v1 + 1), anchor0);
            return anchor0;
        }
        return (Anchor)arrayList0.get(v1);
    }

    public static Anchor anchor$default(SlotWriter slotWriter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = slotWriter0.s;
        }
        return slotWriter0.anchor(v);
    }

    public final int anchorIndex(@NotNull Anchor anchor0) {
        int v = anchor0.getLocation$runtime_release();
        return v >= 0 ? v : v + this.getSize$runtime_release();
    }

    public final void appendSlot(@NotNull Anchor anchor0, @Nullable Object object0) {
        if(this.n != 0) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int v = this.i;
        int v1 = this.j;
        int v2 = this.anchorIndex(anchor0);
        int v3 = this.a(this.f(v2 + 1), this.b);
        this.i = v3;
        this.j = v3;
        this.i(1, v2);
        if(v >= v3) {
            ++v;
            ++v1;
        }
        this.c[v3] = object0;
        this.i = v;
        this.j = v1;
    }

    public final int b(int v) {
        return v < this.k ? v : v + this.l;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.access$updateGroupKey(this.b, this.s, -3);
    }

    public final void beginInsert() {
        int v = this.n;
        this.n = v + 1;
        if(v == 0) {
            this.q.push(this.e() - this.h - this.t);
        }
    }

    public static int c(int v, int v1, int v2, int v3) {
        return v <= v1 ? v : -(v3 - v2 - v + 1);
    }

    public final void close(boolean z) {
        this.v = true;
        if(z && this.p.isEmpty()) {
            this.j(this.getSize$runtime_release());
            this.k(this.c.length - this.l, this.g);
            ArraysKt___ArraysJvmKt.fill(this.c, null, this.k, this.l + this.k);
            this.m();
        }
        this.a.close$runtime_release(this, this.b, this.g, this.c, this.k, this.d, this.e, this.f);
    }

    public final void d(int v, int v1, int v2) {
        if(v >= this.g) {
            v = -(this.getSize$runtime_release() - v + 2);
        }
        while(v2 < v1) {
            SlotTableKt.access$updateParentAnchor(this.b, this.f(v2), v);
            int v3 = SlotTableKt.access$groupSize(this.b, this.f(v2)) + v2;
            this.d(v2, v3, v2 + 1);
            v2 = v3;
        }
    }

    public final int e() {
        return this.b.length / 5;
    }

    public final int endGroup() {
        int v = 0;
        boolean z = this.n > 0;
        int v1 = this.s;
        int v2 = this.t;
        int v3 = this.u;
        int v4 = this.f(v3);
        int v5 = this.o;
        int v6 = v1 - v3;
        boolean z1 = SlotTableKt.access$isNode(this.b, v4);
        IntStack intStack0 = this.r;
        if(z) {
            SlotTableKt.access$updateGroupSize(this.b, v4, v6);
            SlotTableKt.access$updateNodeCount(this.b, v4, v5);
            this.o = intStack0.pop() + (z1 ? 1 : v5);
            int v7 = this.l(SlotTableKt.access$parentAnchor(this.b, this.f(v3)));
            this.u = v7;
            int v8 = v7 >= 0 ? this.f(v7 + 1) : this.getSize$runtime_release();
            if(v8 >= 0) {
                v = this.a(v8, this.b);
            }
            this.i = v;
            this.j = v;
            return v5;
        }
        if(v1 != v2) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        int v9 = SlotTableKt.access$groupSize(this.b, v4);
        int v10 = SlotTableKt.access$nodeCount(this.b, v4);
        SlotTableKt.access$updateGroupSize(this.b, v4, v6);
        SlotTableKt.access$updateNodeCount(this.b, v4, v5);
        int v11 = this.p.pop();
        this.t = this.e() - this.h - this.q.pop();
        this.u = v11;
        int v12 = this.l(SlotTableKt.access$parentAnchor(this.b, this.f(v3)));
        int v13 = intStack0.pop();
        this.o = v13;
        if(v12 == v11) {
            if(!z1) {
                v = v5 - v10;
            }
            this.o = v13 + v;
            return v5;
        }
        int v14 = v6 - v9;
        int v15 = z1 ? 0 : v5 - v10;
        if(v14 != 0 || v15 != 0) {
            while(v12 != 0 && v12 != v11 && (v15 != 0 || v14 != 0)) {
                int v16 = this.f(v12);
                if(v14 != 0) {
                    int v17 = SlotTableKt.access$groupSize(this.b, v16);
                    SlotTableKt.access$updateGroupSize(this.b, v16, v17 + v14);
                }
                if(v15 != 0) {
                    SlotTableKt.access$updateNodeCount(this.b, v16, SlotTableKt.access$nodeCount(this.b, v16) + v15);
                }
                if(SlotTableKt.access$isNode(this.b, v16)) {
                    v15 = 0;
                }
                v12 = this.l(SlotTableKt.access$parentAnchor(this.b, this.f(v12)));
            }
        }
        this.o += v15;
        return v5;
    }

    public final void endInsert() {
        if(this.n <= 0) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int v = this.n - 1;
        this.n = v;
        if(v == 0) {
            if(this.r.getSize() != this.p.getSize()) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            this.t = this.e() - this.h - this.q.pop();
        }
    }

    public final void ensureStarted(int v) {
        if(this.n > 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int v1 = this.u;
        if(v1 != v) {
            if(v < v1 || v >= this.t) {
                ComposerKt.composeImmediateRuntimeError(("Started group at " + v + " must be a subgroup of the group at " + v1));
            }
            int v2 = this.s;
            int v3 = this.i;
            int v4 = this.j;
            this.s = v;
            this.startGroup();
            this.s = v2;
            this.i = v3;
            this.j = v4;
        }
    }

    public final void ensureStarted(@NotNull Anchor anchor0) {
        this.ensureStarted(anchor0.toIndexFor(this));
    }

    public final int f(int v) {
        return v < this.g ? v : v + this.h;
    }

    public final void forAllData(int v, @NotNull Function2 function20) {
        int v1 = SlotWriter.access$dataIndex(this, this.b, this.f(v));
        int v2 = SlotWriter.access$dataIndex(this, this.b, this.f(this.groupSize(this.getCurrentGroup()) + this.getCurrentGroup()));
        while(v1 < v2) {
            function20.invoke(v1, this.c[this.b(v1)]);
            ++v1;
        }
    }

    public final void forEachData(int v, @NotNull Function2 function20) {
        int v1 = SlotWriter.access$slotIndex(this, this.b, this.f(v));
        int v2 = SlotWriter.access$dataIndex(this, this.b, this.f(v + 1));
        for(int v3 = v1; v3 < v2; ++v3) {
            function20.invoke(((int)(v3 - v1)), this.c[this.b(v3)]);
        }
    }

    public final void forEachTailSlot(int v, int v1, @NotNull Function2 function20) {
        int v2 = this.slotsStartIndex$runtime_release(v);
        int v3 = this.slotsEndIndex$runtime_release(v);
        for(int v4 = Math.max(v2, v3 - v1); v4 < v3; ++v4) {
            function20.invoke(v4, this.c[this.b(v4)]);
        }
    }

    public final GroupSourceInformation g(int v, String s) {
        HashMap hashMap0 = this.e;
        if(hashMap0 != null) {
            Anchor anchor0 = this.anchor(v);
            GroupSourceInformation groupSourceInformation0 = hashMap0.get(anchor0);
            if(groupSourceInformation0 == null) {
                groupSourceInformation0 = new GroupSourceInformation(0, s, 0);
                if(s == null) {
                    int v1 = v + 1;
                    int v2 = this.s;
                    while(v1 < v2) {
                        groupSourceInformation0.reportGroup(this, v1);
                        v1 += SlotTableKt.access$groupSize(this.b, v1);
                    }
                }
                hashMap0.put(anchor0, groupSourceInformation0);
            }
            return groupSourceInformation0;
        }
        return null;
    }

    public final boolean getClosed() {
        return this.v;
    }

    public final boolean getCollectingCalledInformation() {
        return this.f != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.e != null;
    }

    public final int getCurrentGroup() {
        return this.s;
    }

    public final int getCurrentGroupEnd() {
        return this.t;
    }

    public final int getParent() {
        return this.u;
    }

    public final int getSize$runtime_release() {
        return this.e() - this.h;
    }

    public final int getSlotsSize() {
        return this.c.length - this.l;
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.a;
    }

    @Nullable
    public final Object groupAux(int v) {
        int v1 = this.f(v);
        if(SlotTableKt.access$hasAux(this.b, v1)) {
            Object[] arr_object = this.c;
            return arr_object[SlotTableKt.a(SlotTableKt.access$groupInfo(this.b, v1) >> 29) + this.a(v1, this.b)];
        }
        return Composer.Companion.getEmpty();
    }

    public final int groupKey(int v) {
        return SlotTableKt.access$key(this.b, this.f(v));
    }

    @Nullable
    public final Object groupObjectKey(int v) {
        int v1 = this.f(v);
        return SlotTableKt.access$hasObjectKey(this.b, v1) ? this.c[SlotTableKt.access$objectKeyIndex(this.b, v1)] : null;
    }

    public final int groupSize(int v) {
        return SlotTableKt.access$groupSize(this.b, this.f(v));
    }

    @NotNull
    public final Iterator groupSlots() {
        return new Object() {
            public int a;
            public final int b;
            public final SlotWriter c;

            {
                SlotWriter slotWriter0 = this.a(this.f(this.s), this.b);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v = this.a(this.f(this.groupSize(this.s) + this.s), this.b);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.b = v1;
                this.c = slotWriter0;
                this.a = v;
            }

            public final int getCurrent() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a < this.b;
            }

            @Override
            @Nullable
            public Object next() {
                if(this.hasNext()) {
                    int v = this.a;
                    this.a = v + 1;
                    return this.c.c[this.c.b(v)];
                }
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setCurrent(int v) {
                this.a = v;
            }
        };
    }

    public final void h(int v) {
        if(v > 0) {
            int v1 = this.s;
            this.j(v1);
            int v2 = this.g;
            int v3 = this.h;
            int[] arr_v = this.b;
            int v4 = arr_v.length / 5;
            int v5 = v4 - v3;
            int v6 = 0;
            if(v3 < v) {
                int v7 = Math.max(Math.max(v4 * 2, v5 + v), 0x20);
                int[] arr_v1 = new int[v7 * 5];
                int v8 = v7 - v5;
                ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v1, 0, 0, v2 * 5);
                ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v1, (v2 + v8) * 5, (v3 + v2) * 5, v4 * 5);
                this.b = arr_v1;
                v3 = v8;
            }
            int v9 = this.t;
            if(v9 >= v2) {
                this.t = v9 + v;
            }
            int v10 = v2 + v;
            this.g = v10;
            this.h = v3 - v;
            int v11 = v5 <= 0 ? 0 : this.a(this.f(v1 + v), this.b);
            if(this.m >= v2) {
                v6 = this.k;
            }
            int v12 = SlotWriter.c(v11, v6, this.l, this.c.length);
            for(int v13 = v2; v13 < v10; ++v13) {
                SlotTableKt.access$updateDataAnchor(this.b, v13, v12);
            }
            int v14 = this.m;
            if(v14 >= v2) {
                this.m = v14 + v;
            }
        }
    }

    public final void i(int v, int v1) {
        if(v > 0) {
            this.k(this.i, v1);
            int v2 = this.k;
            int v3 = this.l;
            if(v3 < v) {
                Object[] arr_object = this.c;
                int v4 = arr_object.length - v3;
                int v5 = Math.max(Math.max(arr_object.length * 2, v4 + v), 0x20);
                Object[] arr_object1 = new Object[v5];
                for(int v6 = 0; v6 < v5; ++v6) {
                    arr_object1[v6] = null;
                }
                int v7 = v5 - v4;
                ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, 0, 0, v2);
                ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object1, v2 + v7, v3 + v2, arr_object.length);
                this.c = arr_object1;
                v3 = v7;
            }
            int v8 = this.j;
            if(v8 >= v2) {
                this.j = v8 + v;
            }
            this.k = v2 + v;
            this.l = v3 - v;
        }
    }

    public final boolean indexInCurrentGroup(int v) {
        return this.indexInGroup(v, this.s);
    }

    public final boolean indexInGroup(int v, int v1) {
        if(v1 == this.u) {
            return v > v1 && v < this.t;
        }
        IntStack intStack0 = this.p;
        if(v1 > intStack0.peekOr(0)) {
            return v > v1 && v < this.groupSize(v1) + v1;
        }
        int v2 = intStack0.indexOf(v1);
        return v2 >= 0 ? v > v1 && v < this.e() - this.h - this.q.peek(v2) : v > v1 && v < this.groupSize(v1) + v1;
    }

    // 去混淆评级： 低(20)
    public final boolean indexInParent(int v) {
        return v > this.u && v < this.t || this.u == 0 && v == 0;
    }

    public final void insertAux(@Nullable Object object0) {
        if(this.n < 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int v = this.u;
        int v1 = this.f(v);
        if(SlotTableKt.access$hasAux(this.b, v1)) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        this.i(1, v);
        int v2 = SlotTableKt.a(SlotTableKt.access$groupInfo(this.b, v1) >> 29) + this.a(v1, this.b);
        int v3 = this.b(v2);
        int v4 = this.i;
        if(v4 > v2) {
            int v5 = v4 - v2;
            if(v5 >= 3) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if(v5 > 1) {
                this.c[v3 + 2] = this.c[v3 + 1];
            }
            this.c[v3 + 1] = this.c[v3];
        }
        SlotTableKt.access$addAux(this.b, v1);
        this.c[v3] = object0;
        ++this.i;
    }

    public final boolean isGroupEnd() {
        return this.s == this.t;
    }

    public final boolean isNode() {
        return this.s < this.t && SlotTableKt.access$isNode(this.b, this.f(this.s));
    }

    public final boolean isNode(int v) {
        return SlotTableKt.access$isNode(this.b, this.f(v));
    }

    public final void j(int v) {
        int v1 = this.h;
        int v2 = this.g;
        if(v2 != v) {
            if(!this.d.isEmpty()) {
                int v3 = this.e() - this.h;
                if(v2 < v) {
                    for(int v4 = SlotTableKt.access$locationOf(this.d, v2, v3); v4 < this.d.size(); ++v4) {
                        Anchor anchor0 = (Anchor)this.d.get(v4);
                        int v5 = anchor0.getLocation$runtime_release();
                        if(v5 >= 0) {
                            break;
                        }
                        int v6 = v5 + v3;
                        if(v6 >= v) {
                            break;
                        }
                        anchor0.setLocation$runtime_release(v6);
                    }
                }
                else {
                    for(int v7 = SlotTableKt.access$locationOf(this.d, v, v3); v7 < this.d.size(); ++v7) {
                        Anchor anchor1 = (Anchor)this.d.get(v7);
                        int v8 = anchor1.getLocation$runtime_release();
                        if(v8 < 0) {
                            break;
                        }
                        anchor1.setLocation$runtime_release(-(v3 - v8));
                    }
                }
            }
            if(v1 > 0) {
                int[] arr_v = this.b;
                if(v < v2) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, v1 * 5 + v * 5, v * 5, v2 * 5);
                }
                else {
                    ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, v2 * 5, v2 * 5 + v1 * 5, v * 5 + v1 * 5);
                }
            }
            if(v < v2) {
                v2 = v + v1;
            }
            int v9 = this.e();
            ComposerKt.runtimeCheck(v2 < v9);
            while(v2 < v9) {
                int v10 = SlotTableKt.access$parentAnchor(this.b, v2);
                int v11 = this.l(v10);
                if(v11 >= v) {
                    v11 = -(this.getSize$runtime_release() - v11 + 2);
                }
                if(v11 != v10) {
                    SlotTableKt.access$updateParentAnchor(this.b, v2, v11);
                }
                ++v2;
                if(v2 == v) {
                    v2 += v1;
                }
            }
        }
        this.g = v;
    }

    public final void k(int v, int v1) {
        int v2 = this.l;
        int v3 = this.k;
        int v4 = this.m;
        if(v3 != v) {
            Object[] arr_object = this.c;
            if(v < v3) {
                ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v + v2, v, v3);
            }
            else {
                ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v3, v3 + v2, v + v2);
            }
        }
        int v5 = Math.min(v1 + 1, this.getSize$runtime_release());
        if(v4 != v5) {
            int v6 = this.c.length - v2;
            if(v5 < v4) {
                int v7 = this.f(v5);
                int v8 = this.f(v4);
                int v9 = this.g;
                while(v7 < v8) {
                    int v10 = SlotTableKt.access$dataAnchor(this.b, v7);
                    if(v10 < 0) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    SlotTableKt.access$updateDataAnchor(this.b, v7, -(v6 - v10 + 1));
                    ++v7;
                    if(v7 == v9) {
                        v7 += this.h;
                    }
                }
            }
            else {
                int v11 = this.f(v4);
                int v12 = this.f(v5);
                while(v11 < v12) {
                    int v13 = SlotTableKt.access$dataAnchor(this.b, v11);
                    if(v13 >= 0) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    SlotTableKt.access$updateDataAnchor(this.b, v11, v13 + v6 + 1);
                    ++v11;
                    if(v11 == this.g) {
                        v11 += this.h;
                    }
                }
            }
            this.m = v5;
        }
        this.k = v;
    }

    public final int l(int v) {
        return v > -2 ? v : this.getSize$runtime_release() + v + 2;
    }

    public final void m() {
        boolean z;
        PrioritySet prioritySet0 = this.w;
        if(prioritySet0 != null) {
            while(prioritySet0.isNotEmpty()) {
                int v = prioritySet0.takeMax();
                int v1 = this.f(v);
                int v2 = v + 1;
                int v3 = this.groupSize(v);
                while(true) {
                    z = false;
                    if(v2 < v3 + v) {
                        if(SlotTableKt.access$containsAnyMark(this.b, this.f(v2))) {
                            z = true;
                        }
                        else {
                            v2 += this.groupSize(v2);
                            continue;
                        }
                    }
                    break;
                }
                if(SlotTableKt.access$containsMark(this.b, v1) != z) {
                    SlotTableKt.access$updateContainsMark(this.b, v1, z);
                    int v4 = this.parent(v);
                    if(v4 >= 0) {
                        prioritySet0.add(v4);
                    }
                }
            }
        }
    }

    public final void markGroup(int v) {
        int v1 = this.f(v);
        if(!SlotTableKt.access$hasMark(this.b, v1)) {
            SlotTableKt.access$updateMark(this.b, v1, true);
            if(!SlotTableKt.access$containsMark(this.b, v1)) {
                this.s(this.parent(v));
            }
        }
    }

    public static void markGroup$default(SlotWriter slotWriter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = slotWriter0.u;
        }
        slotWriter0.markGroup(v);
    }

    @NotNull
    public final List moveFrom(@NotNull SlotTable slotTable0, int v, boolean z) {
        List list0;
        ComposerKt.runtimeCheck(this.n > 0);
        if(v == 0 && this.s == 0 && this.a.getGroupsSize() == 0 && SlotTableKt.access$groupSize(slotTable0.getGroups(), 0) == slotTable0.getGroupsSize()) {
            int[] arr_v = this.b;
            Object[] arr_object = this.c;
            ArrayList arrayList0 = this.d;
            HashMap hashMap0 = this.e;
            MutableIntObjectMap mutableIntObjectMap0 = this.f;
            int[] arr_v1 = slotTable0.getGroups();
            int v1 = slotTable0.getGroupsSize();
            Object[] arr_object1 = slotTable0.getSlots();
            int v2 = slotTable0.getSlotsSize();
            this.b = arr_v1;
            this.c = arr_object1;
            this.d = slotTable0.getAnchors$runtime_release();
            this.g = v1;
            this.h = arr_v1.length / 5 - v1;
            this.k = v2;
            this.l = arr_object1.length - v2;
            this.m = v1;
            this.e = slotTable0.getSourceInformationMap$runtime_release();
            this.f = slotTable0.getCalledByMap$runtime_release();
            slotTable0.setTo$runtime_release(arr_v, 0, arr_object, 0, arrayList0, hashMap0, mutableIntObjectMap0);
            return this.d;
        }
        SlotWriter slotWriter0 = slotTable0.openWriter();
        try {
            list0 = Companion.access$moveGroup(SlotWriter.Companion, slotWriter0, v, this, true, true, z);
        }
        catch(Throwable throwable0) {
            slotWriter0.close(false);
            throw throwable0;
        }
        slotWriter0.close(true);
        return list0;
    }

    public static List moveFrom$default(SlotWriter slotWriter0, SlotTable slotTable0, int v, boolean z, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z = true;
        }
        return slotWriter0.moveFrom(slotTable0, v, z);
    }

    public final void moveGroup(int v) {
        if(this.n != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if(v < 0) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if(v == 0) {
            return;
        }
        int v1 = this.s;
        int v2 = this.u;
        int v3 = this.t;
        int v4 = v;
        int v5 = v1;
        while(v4 > 0) {
            v5 += SlotTableKt.access$groupSize(this.b, this.f(v5));
            if(v5 > v3) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
            --v4;
        }
        int v6 = SlotTableKt.access$groupSize(this.b, this.f(v5));
        int v7 = this.a(this.f(this.s), this.b);
        int v8 = this.a(this.f(v5), this.b);
        int v9 = v5 + v6;
        int v10 = this.a(this.f(v9), this.b);
        int v11 = v10 - v8;
        this.i(v11, Math.max(this.s - 1, 0));
        this.h(v6);
        int[] arr_v = this.b;
        int v12 = this.f(v9);
        ArraysKt___ArraysJvmKt.copyInto(arr_v, arr_v, this.f(v1) * 5, v12 * 5, v6 * 5 + v12 * 5);
        if(v11 > 0) {
            ArraysKt___ArraysJvmKt.copyInto(this.c, this.c, v7, this.b(v8 + v11), this.b(v10 + v11));
        }
        int v13 = v8 + v11;
        int v14 = this.k;
        int v15 = this.l;
        int v16 = this.m;
        for(int v17 = v1; v17 < v1 + v6; ++v17) {
            int v18 = this.f(v17);
            SlotTableKt.access$updateDataAnchor(arr_v, v18, SlotWriter.c(SlotWriter.c(this.a(v18, arr_v) - (v13 - v7), (v16 >= v18 ? v14 : 0), v15, this.c.length), this.k, this.l, this.c.length));
        }
        int v19 = this.getSize$runtime_release();
        int v20 = SlotTableKt.access$locationOf(this.d, v9, v19);
        ArrayList arrayList0 = new ArrayList();
        if(v20 >= 0) {
            while(v20 < this.d.size()) {
                Anchor anchor0 = (Anchor)this.d.get(v20);
                int v21 = this.anchorIndex(anchor0);
                if(v21 < v9 || v21 >= v9 + v6) {
                    break;
                }
                arrayList0.add(anchor0);
                this.d.remove(v20);
            }
        }
        int v22 = arrayList0.size();
        for(int v23 = 0; v23 < v22; ++v23) {
            Anchor anchor1 = (Anchor)arrayList0.get(v23);
            int v24 = this.anchorIndex(anchor1) + (v1 - v9);
            if(v24 >= this.g) {
                anchor1.setLocation$runtime_release(-(v19 - v24));
            }
            else {
                anchor1.setLocation$runtime_release(v24);
            }
            int v25 = SlotTableKt.access$locationOf(this.d, v24, v19);
            this.d.add(v25, anchor1);
        }
        if(this.n(v9, v6)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        this.d(v2, this.t, v1);
        if(v11 > 0) {
            this.o(v13, v11, v9 - 1);
        }
    }

    @NotNull
    public final List moveIntoGroupFrom(int v, @NotNull SlotTable slotTable0, int v1) {
        List list0;
        ComposerKt.runtimeCheck(this.n <= 0 && this.groupSize(this.s + v) == 1);
        int v2 = this.s;
        int v3 = this.i;
        int v4 = this.j;
        this.advanceBy(v);
        this.startGroup();
        this.beginInsert();
        SlotWriter slotWriter0 = slotTable0.openWriter();
        try {
            SlotWriter.Companion.getClass();
            list0 = Companion.a(slotWriter0, v1, this, false, true, true);
        }
        catch(Throwable throwable0) {
            slotWriter0.close(false);
            throw throwable0;
        }
        slotWriter0.close(true);
        this.endInsert();
        this.endGroup();
        this.s = v2;
        this.i = v3;
        this.j = v4;
        return list0;
    }

    @NotNull
    public final List moveTo(@NotNull Anchor anchor0, int v, @NotNull SlotWriter slotWriter0) {
        boolean z = true;
        ComposerKt.runtimeCheck(slotWriter0.n > 0);
        ComposerKt.runtimeCheck(this.n == 0);
        ComposerKt.runtimeCheck(anchor0.getValid());
        int v1 = this.anchorIndex(anchor0) + v;
        int v2 = this.s;
        ComposerKt.runtimeCheck(v2 <= v1 && v1 < this.t);
        int v3 = this.parent(v1);
        int v4 = this.groupSize(v1);
        int v5 = this.isNode(v1) ? 1 : this.nodeCount(v1);
        SlotWriter.Companion.getClass();
        List list0 = Companion.a(this, v1, slotWriter0, false, false, true);
        this.s(v3);
        boolean z1 = v5 > 0;
        while(v3 >= v2) {
            int v6 = this.f(v3);
            SlotTableKt.access$updateGroupSize(this.b, v6, SlotTableKt.access$groupSize(this.b, v6) - v4);
            if(z1) {
                if(SlotTableKt.access$isNode(this.b, v6)) {
                    z1 = false;
                }
                else {
                    SlotTableKt.access$updateNodeCount(this.b, v6, SlotTableKt.access$nodeCount(this.b, v6) - v5);
                }
            }
            v3 = this.parent(v3);
        }
        if(z1) {
            if(this.o < v5) {
                z = false;
            }
            ComposerKt.runtimeCheck(z);
            this.o -= v5;
        }
        return list0;
    }

    public final boolean n(int v, int v1) {
        boolean z = false;
        if(v1 > 0) {
            ArrayList arrayList0 = this.d;
            this.j(v);
            if(!arrayList0.isEmpty()) {
                HashMap hashMap0 = this.e;
                int v2 = v + v1;
                int v3 = SlotTableKt.access$locationOf(this.d, v2, this.e() - this.h);
                if(v3 >= this.d.size()) {
                    --v3;
                }
                int v4 = v3 + 1;
                int v5 = 0;
                while(v3 >= 0) {
                    Anchor anchor0 = (Anchor)this.d.get(v3);
                    int v6 = this.anchorIndex(anchor0);
                    if(v6 < v) {
                        break;
                    }
                    if(v6 < v2) {
                        anchor0.setLocation$runtime_release(0x80000000);
                        if(hashMap0 != null) {
                            GroupSourceInformation groupSourceInformation0 = (GroupSourceInformation)hashMap0.remove(anchor0);
                        }
                        if(v5 == 0) {
                            v5 = v3 + 1;
                        }
                        v4 = v3;
                    }
                    --v3;
                }
                if(v4 < v5) {
                    z = true;
                    this.d.subList(v4, v5).clear();
                }
            }
            this.g = v;
            this.h += v1;
            int v7 = this.m;
            if(v7 > v) {
                this.m = Math.max(v, v7 - v1);
            }
            int v8 = this.t;
            if(v8 >= this.g) {
                this.t = v8 - v1;
            }
            int v9 = this.u;
            if(v9 >= 0 && SlotTableKt.access$containsMark(this.b, this.f(v9))) {
                this.s(v9);
            }
        }
        return z;
    }

    @Nullable
    public final Object node(int v) {
        int v1 = this.f(v);
        if(SlotTableKt.access$isNode(this.b, v1)) {
            Object[] arr_object = this.c;
            return arr_object[this.b(this.a(v1, this.b))];
        }
        return null;
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor0) {
        return this.node(anchor0.toIndexFor(this));
    }

    public final int nodeCount(int v) {
        return SlotTableKt.access$nodeCount(this.b, this.f(v));
    }

    public final void o(int v, int v1, int v2) {
        if(v1 > 0) {
            int v3 = this.l;
            int v4 = v + v1;
            this.k(v4, v2);
            this.k = v;
            this.l = v3 + v1;
            ArraysKt___ArraysJvmKt.fill(this.c, null, v, v4);
            int v5 = this.j;
            if(v5 >= v) {
                this.j = v5 - v1;
            }
        }
    }

    public final int p(int v, int[] arr_v) {
        if(v >= this.e()) {
            return this.c.length - this.l;
        }
        int v1 = SlotTableKt.access$slotAnchor(arr_v, v);
        return v1 >= 0 ? v1 : this.c.length - this.l + v1 + 1;
    }

    public final int parent(int v) {
        return this.l(SlotTableKt.access$parentAnchor(this.b, this.f(v)));
    }

    // 去混淆评级： 低(20)
    public final int parent(@NotNull Anchor anchor0) {
        return anchor0.getValid() ? this.l(SlotTableKt.access$parentAnchor(this.b, this.f(this.anchorIndex(anchor0)))) : -1;
    }

    public final GroupSourceInformation q(int v) {
        HashMap hashMap0 = this.e;
        if(hashMap0 != null) {
            Anchor anchor0 = this.tryAnchor$runtime_release(v);
            return anchor0 == null ? null : ((GroupSourceInformation)hashMap0.get(anchor0));
        }
        return null;
    }

    public final void r(Object object0, Object object1, boolean z, int v) {
        int v10;
        int v1 = this.u;
        boolean z1 = this.n > 0;
        this.r.push(this.o);
        if(z1) {
            int v2 = this.s;
            int v3 = this.a(this.f(v2), this.b);
            this.h(1);
            this.i = v3;
            this.j = v3;
            int v4 = this.f(v2);
            int v5 = object0 == Composer.Companion.getEmpty() ? 0 : 1;
            int v6 = ((int)z) || object1 == Composer.Companion.getEmpty() ? 0 : 1;
            int v7 = SlotWriter.c(v3, this.k, this.l, this.c.length);
            SlotTableKt.access$initGroup(this.b, v4, v, ((int)z), v5, v6, this.u, (v7 < 0 || this.m >= v2 ? SlotWriter.c(v3, this.k, this.l, this.c.length) : -(this.c.length - this.l - v7 + 1)));
            int v8 = ((int)z) + v5 + v6;
            if(v8 > 0) {
                this.i(v8, v2);
                Object[] arr_object = this.c;
                int v9 = this.i;
                if(((int)z) != 0) {
                    arr_object[v9] = object1;
                    ++v9;
                }
                if(v5 != 0) {
                    arr_object[v9] = object0;
                    ++v9;
                }
                if(v6 != 0) {
                    arr_object[v9] = object1;
                    ++v9;
                }
                this.i = v9;
            }
            this.o = 0;
            v10 = v2 + 1;
            this.u = v2;
            this.s = v10;
            if(v1 >= 0) {
                GroupSourceInformation groupSourceInformation0 = this.q(v1);
                if(groupSourceInformation0 != null) {
                    groupSourceInformation0.reportGroup(this, v2);
                }
            }
        }
        else {
            this.p.push(v1);
            this.q.push(this.e() - this.h - this.t);
            int v11 = this.s;
            int v12 = this.f(v11);
            if(!Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
                if(((int)z)) {
                    this.updateNode(object1);
                }
                else {
                    this.updateAux(object1);
                }
            }
            this.i = this.p(v12, this.b);
            this.j = this.a(this.f(this.s + 1), this.b);
            this.o = SlotTableKt.access$nodeCount(this.b, v12);
            this.u = v11;
            this.s = v11 + 1;
            v10 = v11 + SlotTableKt.access$groupSize(this.b, v12);
        }
        this.t = v10;
    }

    public final void recordGroupSourceInformation(@NotNull String s) {
        if(this.n > 0) {
            this.g(this.u, s);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        if(this.n > 0) {
            GroupSourceInformation groupSourceInformation0 = this.g(this.u, null);
            if(groupSourceInformation0 != null) {
                groupSourceInformation0.endGrouplessCall(this.i - this.slotsStartIndex$runtime_release(this.u));
            }
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int v, @NotNull String s) {
        if(this.n > 0) {
            MutableIntObjectMap mutableIntObjectMap0 = this.f;
            if(mutableIntObjectMap0 != null) {
                SlotTableKt.access$add(mutableIntObjectMap0, v, this.groupKey(this.u));
            }
            GroupSourceInformation groupSourceInformation0 = this.g(this.u, null);
            if(groupSourceInformation0 != null) {
                groupSourceInformation0.startGrouplessCall(v, s, this.i - this.slotsStartIndex$runtime_release(this.u));
            }
        }
    }

    public final boolean removeGroup() {
        if(this.n != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int v = this.s;
        int v1 = this.i;
        int v2 = this.a(this.f(v), this.b);
        int v3 = this.skipGroup();
        GroupSourceInformation groupSourceInformation0 = this.q(this.u);
        if(groupSourceInformation0 != null) {
            Anchor anchor0 = this.tryAnchor$runtime_release(v);
            if(anchor0 != null) {
                groupSourceInformation0.removeAnchor(anchor0);
            }
        }
        PrioritySet prioritySet0 = this.w;
        if(prioritySet0 != null) {
            while(prioritySet0.isNotEmpty() && prioritySet0.peek() >= v) {
                prioritySet0.takeMax();
            }
        }
        boolean z = this.n(v, this.s - v);
        this.o(v2, this.i - v2, v - 1);
        this.s = v;
        this.i = v1;
        this.o -= v3;
        return z;
    }

    public final void reset() {
        if(this.n != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        this.m();
        this.s = 0;
        this.t = this.e() - this.h;
        this.i = 0;
        this.j = 0;
        this.o = 0;
    }

    public final void s(int v) {
        if(v >= 0) {
            PrioritySet prioritySet0 = this.w;
            if(prioritySet0 == null) {
                prioritySet0 = new PrioritySet(null, 1, null);
                this.w = prioritySet0;
            }
            prioritySet0.add(v);
        }
    }

    public final void seek(@NotNull Anchor anchor0) {
        this.advanceBy(anchor0.toIndexFor(this) - this.s);
    }

    @Nullable
    public final Object set(int v, int v1, @Nullable Object object0) {
        int v2 = this.b(this.slotIndexOfGroupSlotIndex(v, v1));
        Object[] arr_object = this.c;
        Object object1 = arr_object[v2];
        arr_object[v2] = object0;
        return object1;
    }

    @Nullable
    public final Object set(int v, @Nullable Object object0) {
        return this.set(this.s, v, object0);
    }

    public final void set(@Nullable Object object0) {
        if(this.i > this.j) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.c[this.b(this.i - 1)] = object0;
    }

    @Nullable
    public final Object skip() {
        if(this.n > 0) {
            this.i(1, this.u);
        }
        int v = this.i;
        this.i = v + 1;
        return this.c[this.b(v)];
    }

    public final int skipGroup() {
        int v = this.f(this.s);
        int v1 = SlotTableKt.access$groupSize(this.b, v) + this.s;
        this.s = v1;
        this.i = this.a(this.f(v1), this.b);
        return SlotTableKt.access$isNode(this.b, v) ? 1 : SlotTableKt.access$nodeCount(this.b, v);
    }

    public final void skipToGroupEnd() {
        this.s = this.t;
        this.i = this.a(this.f(this.t), this.b);
    }

    @Nullable
    public final Object slot(int v, int v1) {
        int v2 = this.p(this.f(v), this.b);
        int v3 = v1 + v2;
        return v2 > v3 || v3 >= this.a(this.f(v + 1), this.b) ? Composer.Companion.getEmpty() : this.c[this.b(v3)];
    }

    @Nullable
    public final Object slot(@NotNull Anchor anchor0, int v) {
        return this.slot(this.anchorIndex(anchor0), v);
    }

    public final int slotIndexOfGroupSlotIndex(int v, int v1) {
        int v2 = this.p(this.f(v), this.b);
        int v3 = v2 + v1;
        if(v3 < v2 || v3 >= this.a(this.f(v + 1), this.b)) {
            ComposerKt.composeImmediateRuntimeError(("Write to an invalid slot index " + v1 + " for group " + v));
        }
        return v3;
    }

    public final int slotsEndAllIndex$runtime_release(int v) {
        return this.a(this.f(this.groupSize(v) + v), this.b);
    }

    public final int slotsEndIndex$runtime_release(int v) {
        return this.a(this.f(v + 1), this.b);
    }

    public final int slotsStartIndex$runtime_release(int v) {
        return this.p(this.f(v), this.b);
    }

    public final void startData(int v, @Nullable Object object0) {
        this.r(Composer.Companion.getEmpty(), object0, false, v);
    }

    public final void startData(int v, @Nullable Object object0, @Nullable Object object1) {
        this.r(object0, object1, false, v);
    }

    public final void startGroup() {
        if(this.n != 0) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        this.r(Composer.Companion.getEmpty(), Composer.Companion.getEmpty(), false, 0);
    }

    public final void startGroup(int v) {
        this.r(Composer.Companion.getEmpty(), Composer.Companion.getEmpty(), false, v);
    }

    public final void startGroup(int v, @Nullable Object object0) {
        this.r(object0, Composer.Companion.getEmpty(), false, v);
    }

    public final void startNode(int v, @Nullable Object object0) {
        this.r(object0, Composer.Companion.getEmpty(), true, v);
    }

    public final void startNode(int v, @Nullable Object object0, @Nullable Object object1) {
        this.r(object0, object1, true, v);
    }

    public final void t(int v, Object object0) {
        int v1 = this.f(v);
        if(v1 >= this.b.length || !SlotTableKt.access$isNode(this.b, v1)) {
            ComposerKt.composeImmediateRuntimeError(("Updating the node of a group at " + v + " that was not created with as a node group"));
        }
        Object[] arr_object = this.c;
        arr_object[this.b(this.a(v1, this.b))] = object0;
    }

    @NotNull
    public final String toDebugString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.toString());
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        stringBuilder0.append("  parent:    " + this.u);
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        stringBuilder0.append("  current:   " + this.s);
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        stringBuilder0.append("  group gap: " + this.g + '-' + (this.g + this.h) + '(' + this.h + ')');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        stringBuilder0.append("  slots gap: " + this.k + '-' + (this.k + this.l) + '(' + this.l + ')');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        stringBuilder0.append("  gap owner: " + this.m);
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(\'\\n\')");
        int v = this.getSize$runtime_release();
        int v1 = 0;
        while(v1 < v) {
            int v2 = this.f(v1);
            stringBuilder0.append("Group(");
            if(v1 < 10) {
                stringBuilder0.append(' ');
            }
            if(v1 < 100) {
                stringBuilder0.append(' ');
            }
            if(v1 < 1000) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append(v1);
            if(v2 != v1) {
                stringBuilder0.append("(");
                stringBuilder0.append(v2);
                stringBuilder0.append(")");
            }
            stringBuilder0.append('#');
            stringBuilder0.append(SlotTableKt.access$groupSize(this.b, v2));
            stringBuilder0.append('^');
            stringBuilder0.append(this.l(SlotTableKt.access$parentAnchor(this.b, v2)));
            stringBuilder0.append(": key=");
            stringBuilder0.append(SlotTableKt.access$key(this.b, v2));
            stringBuilder0.append(", nodes=");
            stringBuilder0.append(SlotTableKt.access$nodeCount(this.b, v2));
            stringBuilder0.append(", dataAnchor=");
            stringBuilder0.append(SlotTableKt.access$dataAnchor(this.b, v2));
            stringBuilder0.append(", parentAnchor=");
            stringBuilder0.append(SlotTableKt.access$parentAnchor(this.b, v2));
            if(SlotTableKt.access$isNode(this.b, v2)) {
                Object[] arr_object = this.c;
                stringBuilder0.append(", node=" + SlotTableKt.access$summarize(String.valueOf(arr_object[this.b(this.a(v2, this.b))]), 10));
            }
            int v3 = this.p(v2, this.b);
            ++v1;
            int v4 = this.a(this.f(v1), this.b);
            if(v4 > v3) {
                stringBuilder0.append(", [");
                for(int v5 = v3; v5 < v4; ++v5) {
                    if(v5 != v3) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(SlotTableKt.access$summarize(String.valueOf(this.c[this.b(v5)]), 10));
                }
                stringBuilder0.append(']');
            }
            stringBuilder0.append(")");
            stringBuilder0.append('\n');
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @Override
    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.s + " end=" + this.t + " size = " + this.getSize$runtime_release() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final void trimTailSlots(int v) {
        boolean z = false;
        ComposerKt.runtimeCheck(v > 0);
        int v1 = this.u;
        int v2 = this.p(this.f(v1), this.b);
        int v3 = this.a(this.f(v1 + 1), this.b) - v;
        if(v3 >= v2) {
            z = true;
        }
        ComposerKt.runtimeCheck(z);
        this.o(v3, v, v1);
        int v4 = this.i;
        if(v4 >= v2) {
            this.i = v4 - v;
        }
    }

    @Nullable
    public final Anchor tryAnchor$runtime_release(int v) {
        return v < 0 || v >= this.getSize$runtime_release() ? null : SlotTableKt.access$find(this.d, v, this.getSize$runtime_release());
    }

    @Nullable
    public final Object update(@Nullable Object object0) {
        Object object1 = this.skip();
        this.set(object0);
        return object1;
    }

    public final void updateAux(@Nullable Object object0) {
        int v = this.f(this.s);
        if(!SlotTableKt.access$hasAux(this.b, v)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        Object[] arr_object = this.c;
        arr_object[this.b(SlotTableKt.a(SlotTableKt.access$groupInfo(this.b, v) >> 29) + this.a(v, this.b))] = object0;
    }

    public final void updateNode(@NotNull Anchor anchor0, @Nullable Object object0) {
        this.t(anchor0.toIndexFor(this), object0);
    }

    public final void updateNode(@Nullable Object object0) {
        this.t(this.s, object0);
    }

    public final void updateParentNode(@Nullable Object object0) {
        this.t(this.u, object0);
    }

    public final void updateToTableMaps() {
        this.e = this.a.getSourceInformationMap$runtime_release();
        this.f = this.a.getCalledByMap$runtime_release();
    }

    public final void verifyDataAnchors$runtime_release() {
        int v = this.m;
        int v1 = this.c.length - this.l;
        int v2 = this.getSize$runtime_release();
        int v3 = 0;
        boolean z = false;
        for(int v4 = 0; v3 < v2; v4 = v7) {
            int v5 = this.f(v3);
            int v6 = SlotTableKt.access$dataAnchor(this.b, v5);
            int v7 = this.a(v5, this.b);
            if(v7 < v4) {
                StringBuilder stringBuilder0 = q.u("Data index out of order at ", v3, ", previous = ", v4, ", current = ");
                stringBuilder0.append(v7);
                PreconditionsKt.throwIllegalStateException(stringBuilder0.toString());
            }
            if(v7 > v1) {
                PreconditionsKt.throwIllegalStateException(("Data index, " + v7 + ", out of bound at " + v3));
            }
            if(v6 < 0 && !z) {
                if(v != v3) {
                    PreconditionsKt.throwIllegalStateException(("Expected the slot gap owner to be " + v + " found gap at " + v3));
                }
                z = true;
            }
            ++v3;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int v = this.g;
        int v1 = this.h;
        int v2 = this.e();
        for(int v3 = 0; v3 < v; ++v3) {
            if(SlotTableKt.access$parentAnchor(this.b, v3) <= -2) {
                PreconditionsKt.throwIllegalStateException(("Expected a start relative anchor at " + v3));
            }
        }
        for(int v4 = v1 + v; v4 < v2; ++v4) {
            int v5 = SlotTableKt.access$parentAnchor(this.b, v4);
            if(this.l(v5) >= v) {
                if(v5 > -2) {
                    PreconditionsKt.throwIllegalStateException(("Expected an end relative anchor at " + v4));
                }
            }
            else if(v5 <= -2) {
                PreconditionsKt.throwIllegalStateException(("Expected a start relative anchor at " + v4));
            }
        }
    }
}

