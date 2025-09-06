package androidx.compose.ui.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u000F\n\u0000\n\u0002\u0010\u001F\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u001C\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001A?\u0010\u0005\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A?\u0010\u0007\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0007\u0010\u0006\u001AE\u0010\n\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\n\u0010\u000B\u001A?\u0010\u000E\u001A\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000F\u001A?\u0010\u0010\u001A\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0010\u0010\u000F\u001AA\u0010\u0011\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A?\u0010\u0014\u001A\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001AK\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001AQ\u0010\u001B\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000E\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001A*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0012\u001A_\u0010\u001F\u001A\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0010\b\u0002\u0010\u001D*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u001C*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001E\u001A\u00028\u00022\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b\u001F\u0010 \u001AA\u0010!\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b!\u0010\u0012\u001AE\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\"\u0010\u0019\u001Ab\u0010(\u001A\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010#\u001A\u00028\u00012\'\u0010\'\u001A#\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b(\u0010)\u001A`\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\'\u0010\u0017\u001A#\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b+\u0010,\u001Ab\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012)\u0010\u0017\u001A%\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b-\u0010,\u001AQ\u0010.\u001A\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000E\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001A*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b.\u0010/\u001AQ\u00100\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b0\u0010,\u001A^\u00102\u001A\u00028\u0000\"\u0004\b\u0000\u00101\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\'\u0010\'\u001A#\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b2\u00103\u001A\u0083\u0001\u00108\u001A\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u00104*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00105\u001A\b\u0012\u0004\u0012\u00028\u00010\u000126\u0010\u0017\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(7\u0012\u0004\u0012\u00028\u00020\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b8\u00109\u001AM\u0010:\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b:\u0010\u0019\u001Ag\u0010B\u001A\u00020A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010<\u001A\u00020;2\b\b\u0002\u0010=\u001A\u00020;2\b\b\u0002\u0010>\u001A\u00020;2\b\b\u0002\u0010?\u001A\u00020\t2\b\b\u0002\u0010@\u001A\u00020;2\u0016\b\u0002\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020;\u0018\u00010\u0002\u00A2\u0006\u0004\bB\u0010C\u001AK\u0010E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010D*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bE\u0010\u0019\u001AQ\u0010F\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000E\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00010\u001A*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bF\u0010\u0012\u001AQ\u0010H\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0017\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010G0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bH\u0010\u0019\u001A)\u0010J\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020I*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u00A2\u0006\u0004\bJ\u0010K\u001A?\u0010L\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bL\u0010\u0012\u00A8\u0006M"}, d2 = {"T", "", "Lkotlin/Function1;", "", "action", "fastForEach", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "fastForEachReversed", "Lkotlin/Function2;", "", "fastForEachIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "", "predicate", "fastAll", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z", "fastAny", "fastFirstOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "selector", "fastSumBy", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)I", "R", "transform", "fastMap", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "fastMaxBy", "", "C", "destination", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastLastOrNull", "fastFilter", "initial", "Lkotlin/ParameterName;", "name", "acc", "operation", "fastFold", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "index", "fastMapIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "fastMapIndexedNotNull", "fastMaxOfOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastZipWithNext", "S", "fastReduce", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "V", "other", "a", "b", "fastZip", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "fastMapNotNull", "", "separator", "prefix", "postfix", "limit", "truncated", "", "fastJoinToString", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "K", "fastDistinctBy", "fastMinByOrNull", "", "fastFlatMap", "", "fastFilterNotNull", "(Ljava/util/List;)Ljava/util/List;", "fastFirst", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n33#1,6:596\n33#1,6:602\n33#1,6:608\n33#1,6:614\n33#1,6:620\n33#1,6:626\n33#1,6:632\n33#1,6:638\n69#1,6:644\n69#1,4:650\n74#1:655\n33#1,6:656\n33#1,6:662\n33#1,6:668\n33#1,6:674\n33#1,6:680\n1#2:654\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:596,6\n102#1:602,6\n117#1:608,6\n134#1:614,6\n153#1:620,6\n201#1:626,6\n237#1:632,6\n258#1:638,6\n279#1:644,6\n300#1:650,4\n300#1:655\n418#1:656,6\n464#1:662,6\n510#1:668,6\n526#1:674,6\n545#1:680,6\n*E\n"})
public final class ListUtilsKt {
    public static final boolean fastAll(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(list0.get(v1))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean fastAny(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(list0.get(v1))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final List fastDistinctBy(@NotNull List list0, @NotNull Function1 function10) {
        HashSet hashSet0 = new HashSet(list0.size());
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(hashSet0.add(function10.invoke(object0))) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @NotNull
    public static final List fastFilter(@NotNull List list0, @NotNull Function1 function10) {
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @NotNull
    public static final List fastFilterNotNull(@NotNull List list0) {
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(object0 != null) {
                list1.add(object0);
            }
        }
        return list1;
    }

    public static final Object fastFirst(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Nullable
    public static final Object fastFirstOrNull(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        return null;
    }

    @NotNull
    public static final List fastFlatMap(@NotNull List list0, @NotNull Function1 function10) {
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o.addAll(list1, ((Iterable)function10.invoke(list0.get(v1))));
        }
        return list1;
    }

    public static final Object fastFold(@NotNull List list0, Object object0, @NotNull Function2 function20) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = function20.invoke(object0, list0.get(v1));
        }
        return object0;
    }

    public static final void fastForEach(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(list0.get(v1));
        }
    }

    public static final void fastForEachIndexed(@NotNull List list0, @NotNull Function2 function20) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(v1, list0.get(v1));
        }
    }

    public static final void fastForEachReversed(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size() - 1;
        if(v >= 0) {
            while(true) {
                function10.invoke(list0.get(v));
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
    }

    @NotNull
    public static final String fastJoinToString(@NotNull List list0, @NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(charSequence1);
        int v1 = list0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            ++v3;
            boolean z = true;
            if(v3 > 1) {
                stringBuilder0.append(charSequence0);
            }
            if(v >= 0 && v3 > v) {
                break;
            }
            if(function10 == null) {
                if(object0 != null) {
                    z = object0 instanceof CharSequence;
                }
                if(z) {
                    stringBuilder0.append(((CharSequence)object0));
                }
                else if(object0 instanceof Character) {
                    stringBuilder0.append(((Character)object0).charValue());
                }
                else {
                    stringBuilder0.append(String.valueOf(object0));
                }
            }
            else {
                stringBuilder0.append(((CharSequence)function10.invoke(object0)));
            }
        }
        if(v >= 0 && v3 > v) {
            stringBuilder0.append(charSequence3);
        }
        stringBuilder0.append(charSequence2);
        return stringBuilder0.toString();
    }

    public static String fastJoinToString$default(List list0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return ListUtilsKt.fastJoinToString(list0, charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    @Nullable
    public static final Object fastLastOrNull(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size() - 1;
        if(v >= 0) {
            while(true) {
                Object object0 = list0.get(v);
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        return null;
    }

    @NotNull
    public static final List fastMap(@NotNull List list0, @NotNull Function1 function10) {
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list1.add(function10.invoke(list0.get(v1)));
        }
        return list1;
    }

    @NotNull
    public static final List fastMapIndexed(@NotNull List list0, @NotNull Function2 function20) {
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list1.add(function20.invoke(v1, list0.get(v1)));
        }
        return list1;
    }

    @NotNull
    public static final List fastMapIndexedNotNull(@NotNull List list0, @NotNull Function2 function20) {
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = function20.invoke(v1, list0.get(v1));
            if(object0 != null) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @NotNull
    public static final List fastMapNotNull(@NotNull List list0, @NotNull Function1 function10) {
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = function10.invoke(list0.get(v1));
            if(object0 != null) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @NotNull
    public static final Collection fastMapTo(@NotNull List list0, @NotNull Collection collection0, @NotNull Function1 function10) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            collection0.add(function10.invoke(list0.get(v1)));
        }
        return collection0;
    }

    @Nullable
    public static final Object fastMaxBy(@NotNull List list0, @NotNull Function1 function10) {
        if(list0.isEmpty()) {
            return null;
        }
        Object object0 = list0.get(0);
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        int v = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = list0.get(v1);
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) < 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @Nullable
    public static final Comparable fastMaxOfOrNull(@NotNull List list0, @NotNull Function1 function10) {
        if(list0.isEmpty()) {
            return null;
        }
        Comparable comparable0 = (Comparable)function10.invoke(list0.get(0));
        int v = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Comparable comparable1 = (Comparable)function10.invoke(list0.get(v1));
                if(comparable1.compareTo(comparable0) > 0) {
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return comparable0;
    }

    @Nullable
    public static final Object fastMinByOrNull(@NotNull List list0, @NotNull Function1 function10) {
        if(list0.isEmpty()) {
            return null;
        }
        Object object0 = list0.get(0);
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        int v = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = list0.get(v1);
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) > 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    public static final Object fastReduce(@NotNull List list0, @NotNull Function2 function20) {
        if(list0.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        Object object0 = CollectionsKt___CollectionsKt.first(list0);
        int v = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                object0 = function20.invoke(object0, list0.get(v1));
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    public static final int fastSumBy(@NotNull List list0, @NotNull Function1 function10) {
        int v = list0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((Number)function10.invoke(list0.get(v1))).intValue();
        }
        return v2;
    }

    @NotNull
    public static final List fastZip(@NotNull List list0, @NotNull List list1, @NotNull Function2 function20) {
        int v = Math.min(list0.size(), list1.size());
        List list2 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            list2.add(function20.invoke(list0.get(v1), list1.get(v1)));
        }
        return list2;
    }

    @NotNull
    public static final List fastZipWithNext(@NotNull List list0, @NotNull Function2 function20) {
        switch(list0.size()) {
            case 0: 
            case 1: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            default: {
                List list1 = new ArrayList();
                int v = 0;
                Object object0 = list0.get(0);
                int v1 = CollectionsKt__CollectionsKt.getLastIndex(list0);
                while(v < v1) {
                    ++v;
                    Object object1 = list0.get(v);
                    list1.add(function20.invoke(object0, object1));
                    object0 = object1;
                }
                return list1;
            }
        }
    }
}

