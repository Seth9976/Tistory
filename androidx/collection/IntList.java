package androidx.collection;

import a5.b;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0004JA\u0010\u0005\u001A\u00020\u00022!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0005\u0010\fJA\u0010\r\u001A\u00020\u00022!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000E\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0007H\u0086\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0013\u001A\u00020\u00072!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0013\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0014JA\u0010\u0016\u001A\u00020\u00072!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0015Jd\u0010\u001C\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001A\u00028\u000026\u0010\u001B\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b\u001C\u0010\u001DJy\u0010 \u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001A\u00028\u00002K\u0010\u001B\u001AG\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u001EH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b \u0010!Jd\u0010\"\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001A\u00028\u000026\u0010\u001B\u001A2\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b\"\u0010\u001DJy\u0010#\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001A\u00028\u00002K\u0010\u001B\u001AG\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001F\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00028\u00000\u001EH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b#\u0010!JA\u0010&\u001A\u00020$2!\u0010%\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020$0\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b&\u0010\'JV\u0010(\u001A\u00020$26\u0010%\u001A2\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001F\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020$0\u0019H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b(\u0010)JA\u0010*\u001A\u00020$2!\u0010%\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020$0\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b*\u0010\'JV\u0010+\u001A\u00020$26\u0010%\u001A2\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001F\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020$0\u0019H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b+\u0010)J\u001A\u0010,\u001A\u00020\u00072\b\b\u0001\u0010\u001F\u001A\u00020\u0007H\u0086\u0002\u00A2\u0006\u0004\b,\u0010-J\u0017\u0010.\u001A\u00020\u00072\b\b\u0001\u0010\u001F\u001A\u00020\u0007\u00A2\u0006\u0004\b.\u0010-J@\u00100\u001A\u00020\u00072\b\b\u0001\u0010\u001F\u001A\u00020\u00072!\u0010/\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001F\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101J\u0015\u00102\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u0007\u00A2\u0006\u0004\b2\u0010-JA\u00103\u001A\u00020\u00072!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b3\u0010\u0015JA\u00104\u001A\u00020\u00072!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b4\u0010\u0015J\r\u00105\u001A\u00020\u0002\u00A2\u0006\u0004\b5\u0010\u0004J\r\u00106\u001A\u00020\u0002\u00A2\u0006\u0004\b6\u0010\u0004J\r\u00107\u001A\u00020\u0007\u00A2\u0006\u0004\b7\u0010\u0014JA\u00107\u001A\u00020\u00072!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b7\u0010\u0015J\u0015\u00108\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u0007\u00A2\u0006\u0004\b8\u0010-JA\u0010@\u001A\u00020?2\b\b\u0002\u0010:\u001A\u0002092\b\b\u0002\u0010;\u001A\u0002092\b\b\u0002\u0010<\u001A\u0002092\b\b\u0002\u0010=\u001A\u00020\u00072\b\b\u0002\u0010>\u001A\u000209H\u0007\u00A2\u0006\u0004\b@\u0010AJ[\u0010@\u001A\u00020?2\b\b\u0002\u0010:\u001A\u0002092\b\b\u0002\u0010;\u001A\u0002092\b\b\u0002\u0010<\u001A\u0002092\b\b\u0002\u0010=\u001A\u00020\u00072\b\b\u0002\u0010>\u001A\u0002092\u0014\b\u0004\u0010B\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002090\u0006H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010CJ\u000F\u0010D\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\bD\u0010\u0014J\u001A\u0010F\u001A\u00020\u00022\b\u0010E\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\bF\u0010GJ\u000F\u0010H\u001A\u00020?H\u0016\u00A2\u0006\u0004\bH\u0010IR\u001C\u0010K\u001A\u00020J8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u0010NR\u001C\u0010O\u001A\u00020\u00078\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bO\u0010P\u0012\u0004\bQ\u0010NR\u0011\u0010S\u001A\u00020\u00078G\u00A2\u0006\u0006\u001A\u0004\bR\u0010\u0014R\u0012\u0010U\u001A\u00020\u00078\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\bT\u0010\u0014R\u0012\u0010Y\u001A\u00020V8\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\bW\u0010X\u0082\u0001\u0001Z\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006["}, d2 = {"Landroidx/collection/IntList;", "", "", "none", "()Z", "any", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Lkotlin/jvm/functions/Function1;)Z", "reversedAny", "contains", "(I)Z", "elements", "containsAll", "(Landroidx/collection/IntList;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "first", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)I", "elementAt", "defaultValue", "elementAtOrElse", "(ILkotlin/jvm/functions/Function1;)I", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[I", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "Landroidx/collection/MutableIntList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
public abstract class IntList {
    @JvmField
    public int _size;
    @JvmField
    @NotNull
    public int[] content;

    public IntList(int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.content = v == 0 ? IntSetKt.getEmptyIntArray() : new int[v];
    }

    public final boolean any() {
        return this.isNotEmpty();
    }

    public final boolean any(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((int)arr_v[v1]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(int v) {
        int[] arr_v = this.content;
        int v1 = this._size;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(arr_v[v2] == v) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull IntList intList0) {
        Intrinsics.checkNotNullParameter(intList0, "elements");
        IntRange intRange0 = c.until(0, intList0._size);
        int v = intRange0.getFirst();
        int v1 = intRange0.getLast();
        if(v <= v1) {
            while(true) {
                if(!this.contains(intList0.get(v))) {
                    return false;
                }
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final int count(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int[] arr_v = this.content;
        int v = this._size;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((int)arr_v[v1]))).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    public final int elementAt(@androidx.annotation.IntRange(from = 0L) int v) {
        if(v >= 0 && v < this._size) {
            return this.content[v];
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final int elementAtOrElse(@androidx.annotation.IntRange(from = 0L) int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "defaultValue");
        return v < 0 || v >= this._size ? ((Number)function10.invoke(v)).intValue() : this.content[v];
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 instanceof IntList) {
            int v = this._size;
            if(((IntList)object0)._size == v) {
                int[] arr_v = this.content;
                int[] arr_v1 = ((IntList)object0).content;
                IntRange intRange0 = c.until(0, v);
                int v1 = intRange0.getFirst();
                int v2 = intRange0.getLast();
                if(v1 <= v2) {
                    while(true) {
                        if(arr_v[v1] != arr_v1[v1]) {
                            return false;
                        }
                        if(v1 == v2) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int first() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final int first(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = arr_v[v1];
            if(((Boolean)function10.invoke(v2)).booleanValue()) {
                return v2;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final Object fold(Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = function20.invoke(object0, ((int)arr_v[v1]));
        }
        return object0;
    }

    public final Object foldIndexed(Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "operation");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = function30.invoke(v1, object0, ((int)arr_v[v1]));
        }
        return object0;
    }

    public final Object foldRight(Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        int[] arr_v = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            object0 = function20.invoke(((int)arr_v[v]), object0);
        }
        return object0;
    }

    public final Object foldRightIndexed(Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "operation");
        int[] arr_v = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            object0 = function30.invoke(v, ((int)arr_v[v]), object0);
        }
        return object0;
    }

    public final void forEach(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(((int)arr_v[v1]));
        }
    }

    public final void forEachIndexed(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(v1, ((int)arr_v[v1]));
        }
    }

    public final void forEachReversed(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        int[] arr_v = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            function10.invoke(((int)arr_v[v]));
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        int[] arr_v = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            function20.invoke(v, ((int)arr_v[v]));
        }
    }

    public final int get(@androidx.annotation.IntRange(from = 0L) int v) {
        if(v >= 0 && v < this._size) {
            return this.content[v];
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @PublishedApi
    public static void getContent$annotations() {
    }

    @NotNull
    public final IntRange getIndices() {
        return c.until(0, this._size);
    }

    @androidx.annotation.IntRange(from = -1L)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @androidx.annotation.IntRange(from = 0L)
    public final int getSize() {
        return this._size;
    }

    @PublishedApi
    public static void get_size$annotations() {
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.content;
        int v = this._size;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1] * 0x1F;
        }
        return v2;
    }

    public final int indexOf(int v) {
        int[] arr_v = this.content;
        int v1 = this._size;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v == arr_v[v2]) {
                return v2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(((int)arr_v[v1]))).booleanValue()) {
                return v1;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int[] arr_v = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return v;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return IntList.joinToString$default(this, null, null, null, 0, null, 0x1F, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        return IntList.joinToString$default(this, charSequence0, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return IntList.joinToString$default(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return IntList.joinToString$default(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return IntList.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.r(charSequence2, "postfix", charSequence3, "truncated", charSequence1);
        int[] arr_v = this.content;
        int v1 = this._size;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            int v3 = arr_v[v2];
            if(v2 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(v3);
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        StringBuilder stringBuilder0 = q.s(charSequence3, "truncated", function10, "transform", charSequence1);
        int[] arr_v = this.content;
        int v1 = this._size;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            int v3 = arr_v[v2];
            if(v2 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v3)));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.s(charSequence2, "postfix", function10, "transform", charSequence1);
        int[] arr_v = this.content;
        int v1 = this._size;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            int v3 = arr_v[v2];
            if(v2 == v) {
                stringBuilder0.append("...");
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v3)));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.s(charSequence2, "postfix", function10, "transform", charSequence1);
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append(charSequence2);
                break;
            }
            int v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v2)));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        StringBuilder stringBuilder0 = q.s(charSequence1, "prefix", function10, "transform", charSequence1);
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            int v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v2)));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder("");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            int v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v2)));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder("");
        int[] arr_v = this.content;
        int v = this._size;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                stringBuilder0.append("");
                break;
            }
            int v2 = arr_v[v1];
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v2)));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String joinToString$default(IntList intList0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 8) != 0) {
            v = -1;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        return intList0.joinToString(charSequence0, charSequence5, charSequence4, v, charSequence3);
    }

    public static String joinToString$default(IntList intList0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        if((v1 & 2) != 0) {
            charSequence1 = "";
        }
        if((v1 & 4) != 0) {
            charSequence2 = "";
        }
        if((v1 & 8) != 0) {
            v = -1;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        StringBuilder stringBuilder0 = q.s(charSequence3, "truncated", function10, "transform", charSequence1);
        int[] arr_v = intList0.content;
        int v2 = intList0._size;
        for(int v3 = 0; true; ++v3) {
            if(v3 >= v2) {
                stringBuilder0.append(charSequence2);
                break;
            }
            int v4 = arr_v[v3];
            if(v3 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v3 != 0) {
                stringBuilder0.append(charSequence0);
            }
            stringBuilder0.append(((CharSequence)function10.invoke(v4)));
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final int last() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int last(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int[] arr_v = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            int v1 = arr_v[v];
            if(((Boolean)function10.invoke(v1)).booleanValue()) {
                return v1;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final int lastIndexOf(int v) {
        int[] arr_v = this.content;
        for(int v1 = this._size - 1; -1 < v1; --v1) {
            if(arr_v[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    public final boolean none() {
        return this.isEmpty();
    }

    public final boolean reversedAny(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int[] arr_v = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(((int)arr_v[v]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override
    @NotNull
    public String toString() {
        return IntList.joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }
}

