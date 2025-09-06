package androidx.collection;

import a5.b;
import androidx.annotation.IntRange;
import java.util.List;
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
import kotlin.ranges.c;
import kotlin.text.q;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001C\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0006\u0010\u0005JA\u0010\u0006\u001A\u00020\u00032!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0006\u0010\fJA\u0010\r\u001A\u00020\u00032!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000E\u001A\u00020\u00032\u0006\u0010\n\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001B\u0010\u0012\u001A\u00020\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001B\u0010\u0012\u001A\u00020\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014\u00A2\u0006\u0004\b\u0012\u0010\u0015J\u001B\u0010\u0012\u001A\u00020\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0017J\u001B\u0010\u0012\u001A\u00020\u00032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0018J\r\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001A\u0010\u001BJA\u0010\u001A\u001A\u00020\u00192!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001CJ\r\u0010\u001D\u001A\u00028\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJA\u0010\u001D\u001A\u00028\u00002!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001FJ\u0012\u0010 \u001A\u0004\u0018\u00018\u0000H\u0086\b\u00A2\u0006\u0004\b \u0010\u001EJC\u0010 \u001A\u0004\u0018\u00018\u00002!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b \u0010\u001FJd\u0010&\u001A\u00028\u0001\"\u0004\b\u0001\u0010!2\u0006\u0010\"\u001A\u00028\u000126\u0010%\u001A2\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010#H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b&\u0010\'Jy\u0010*\u001A\u00028\u0001\"\u0004\b\u0001\u0010!2\u0006\u0010\"\u001A\u00028\u00012K\u0010%\u001AG\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010(H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b*\u0010+Jd\u0010,\u001A\u00028\u0001\"\u0004\b\u0001\u0010!2\u0006\u0010\"\u001A\u00028\u000126\u0010%\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\u0004\u0012\u00028\u00010#H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b,\u0010\'Jy\u0010-\u001A\u00028\u0001\"\u0004\b\u0001\u0010!2\u0006\u0010\"\u001A\u00028\u00012K\u0010%\u001AG\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\u0004\u0012\u00028\u00010(H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0004\b-\u0010+JA\u00100\u001A\u00020.2!\u0010/\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020.0\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b0\u00101JV\u00102\u001A\u00020.26\u0010/\u001A2\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020.0#H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b2\u00103JA\u00104\u001A\u00020.2!\u0010/\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020.0\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b4\u00101JV\u00105\u001A\u00020.26\u0010/\u001A2\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020.0#H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b5\u00103J\u001A\u00106\u001A\u00028\u00002\b\b\u0001\u0010)\u001A\u00020\u0019H\u0086\u0002\u00A2\u0006\u0004\b6\u00107J\u0017\u00108\u001A\u00028\u00002\b\b\u0001\u0010)\u001A\u00020\u0019\u00A2\u0006\u0004\b8\u00107J@\u0010:\u001A\u00028\u00002\b\b\u0001\u0010)\u001A\u00020\u00192!\u00109\u001A\u001D\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b()\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u0010;J\u0015\u0010<\u001A\u00020\u00192\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b<\u0010=JA\u0010>\u001A\u00020\u00192!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b>\u0010\u001CJA\u0010?\u001A\u00020\u00192!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b?\u0010\u001CJ\r\u0010@\u001A\u00020\u0003\u00A2\u0006\u0004\b@\u0010\u0005J\r\u0010A\u001A\u00020\u0003\u00A2\u0006\u0004\bA\u0010\u0005J\r\u0010B\u001A\u00028\u0000\u00A2\u0006\u0004\bB\u0010\u001EJA\u0010B\u001A\u00028\u00002!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bB\u0010\u001FJ\u0012\u0010C\u001A\u0004\u0018\u00018\u0000H\u0086\b\u00A2\u0006\u0004\bC\u0010\u001EJC\u0010C\u001A\u0004\u0018\u00018\u00002!\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\bC\u0010\u001FJ\u0015\u0010D\u001A\u00020\u00192\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\bD\u0010=JY\u0010M\u001A\u00020L2\b\b\u0002\u0010F\u001A\u00020E2\b\b\u0002\u0010G\u001A\u00020E2\b\b\u0002\u0010H\u001A\u00020E2\b\b\u0002\u0010I\u001A\u00020\u00192\b\b\u0002\u0010J\u001A\u00020E2\u0016\b\u0002\u0010K\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020E\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H&\u00A2\u0006\u0004\bO\u0010PJ\u000F\u0010Q\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\bQ\u0010\u001BJ\u001A\u0010S\u001A\u00020\u00032\b\u0010R\u001A\u0004\u0018\u00010\u0002H\u0096\u0002\u00A2\u0006\u0004\bS\u0010\u000FJ\u000F\u0010T\u001A\u00020LH\u0016\u00A2\u0006\u0004\bT\u0010UR$\u0010V\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010YR\u001C\u0010Z\u001A\u00020\u00198\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010YR\u0011\u0010^\u001A\u00020\u00198G\u00A2\u0006\u0006\u001A\u0004\b]\u0010\u001BR\u0012\u0010`\u001A\u00020\u00198\u00C7\u0002\u00A2\u0006\u0006\u001A\u0004\b_\u0010\u001BR\u0012\u0010d\u001A\u00020a8\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\bb\u0010c\u0082\u0001\u0001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006f"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "", "none", "()Z", "any", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Lkotlin/jvm/functions/Function1;)Z", "reversedAny", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "([Ljava/lang/Object;)Z", "", "(Ljava/util/List;)Z", "", "(Ljava/lang/Iterable;)Z", "(Landroidx/collection/ObjectList;)Z", "", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "elementAt", "defaultValue", "elementAtOrElse", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastOrNull", "lastIndexOf", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "asList", "()Ljava/util/List;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "content", "[Ljava/lang/Object;", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "Landroidx/collection/MutableObjectList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
public abstract class ObjectList {
    @JvmField
    public int _size;
    @JvmField
    @NotNull
    public Object[] content;

    public ObjectList(int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.content = v == 0 ? ObjectListKt.a : new Object[v];
    }

    public final boolean any() {
        return this.isNotEmpty();
    }

    public final boolean any(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public abstract List asList();

    public final boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    public final boolean containsAll(@NotNull ObjectList objectList0) {
        Intrinsics.checkNotNullParameter(objectList0, "elements");
        Object[] arr_object = objectList0.content;
        int v = objectList0._size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.contains(arr_object[v1])) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        for(Object object0: iterable0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean containsAll(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.contains(list0.get(v1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        for(int v = 0; v < arr_object.length; ++v) {
            if(!this.contains(arr_object[v])) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final int count(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        int v = this._size;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                ++v2;
            }
        }
        return v2;
    }

    public final Object elementAt(@IntRange(from = 0L) int v) {
        if(v >= 0 && v < this._size) {
            return this.content[v];
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " must be in 0..");
        stringBuilder0.append(this._size - 1);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final Object elementAtOrElse(@IntRange(from = 0L) int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "defaultValue");
        return v < 0 || v >= this._size ? function10.invoke(v) : this.content[v];
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 instanceof ObjectList) {
            int v = this._size;
            if(((ObjectList)object0)._size == v) {
                Object[] arr_object = this.content;
                Object[] arr_object1 = ((ObjectList)object0).content;
                kotlin.ranges.IntRange intRange0 = c.until(0, v);
                int v1 = intRange0.getFirst();
                int v2 = intRange0.getLast();
                if(v1 <= v2) {
                    while(true) {
                        if(!Intrinsics.areEqual(arr_object[v1], arr_object1[v1])) {
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

    public final Object first() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.content[0];
    }

    public final Object first(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object firstOrNull() {
        return this.isEmpty() ? null : this.get(0);
    }

    @Nullable
    public final Object firstOrNull(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        return null;
    }

    public final Object fold(Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        Object[] arr_object = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = function20.invoke(object0, arr_object[v1]);
        }
        return object0;
    }

    public final Object foldIndexed(Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "operation");
        Object[] arr_object = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = function30.invoke(v1, object0, arr_object[v1]);
        }
        return object0;
    }

    public final Object foldRight(Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        Object[] arr_object = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            object0 = function20.invoke(arr_object[v], object0);
        }
        return object0;
    }

    public final Object foldRightIndexed(Object object0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "operation");
        Object[] arr_object = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            object0 = function30.invoke(v, arr_object[v], object0);
        }
        return object0;
    }

    public final void forEach(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        Object[] arr_object = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(arr_object[v1]);
        }
    }

    public final void forEachIndexed(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        Object[] arr_object = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            function20.invoke(v1, arr_object[v1]);
        }
    }

    public final void forEachReversed(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        Object[] arr_object = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            function10.invoke(arr_object[v]);
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        Object[] arr_object = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            function20.invoke(v, arr_object[v]);
        }
    }

    public final Object get(@IntRange(from = 0L) int v) {
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
    public final kotlin.ranges.IntRange getIndices() {
        return c.until(0, this._size);
    }

    @IntRange(from = -1L)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0L)
    public final int getSize() {
        return this._size;
    }

    @PublishedApi
    public static void get_size$annotations() {
    }

    @Override
    public int hashCode() {
        Object[] arr_object = this.content;
        int v = this._size;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            v2 += (object0 == null ? 0 : object0.hashCode()) * 0x1F;
        }
        return v2;
    }

    public final int indexOf(Object object0) {
        int v = 0;
        if(object0 == null) {
            Object[] arr_object = this.content;
            int v1 = this._size;
            while(v < v1) {
                if(arr_object[v] == null) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        Object[] arr_object1 = this.content;
        int v2 = this._size;
        while(v < v2) {
            if(object0.equals(arr_object1[v])) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        int v = this._size;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                return v1;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
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
        return ObjectList.joinToString$default(this, null, null, null, 0, null, null, 0x3F, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        return ObjectList.joinToString$default(this, charSequence0, null, null, 0, null, null, 62, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return ObjectList.joinToString$default(this, charSequence0, charSequence1, null, 0, null, null, 60, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return ObjectList.joinToString$default(this, charSequence0, charSequence1, charSequence2, 0, null, null, 56, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return ObjectList.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, null, null, 0x30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        return ObjectList.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, charSequence3, null, 0x20, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.r(charSequence2, "postfix", charSequence3, "truncated", charSequence1);
        Object[] arr_object = this.content;
        int v1 = this._size;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                stringBuilder0.append(charSequence2);
                break;
            }
            Object object0 = arr_object[v2];
            if(v2 == v) {
                stringBuilder0.append(charSequence3);
                break;
            }
            if(v2 != 0) {
                stringBuilder0.append(charSequence0);
            }
            if(function10 == null) {
                stringBuilder0.append(object0);
            }
            else {
                stringBuilder0.append(((CharSequence)function10.invoke(object0)));
            }
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String joinToString$default(ObjectList objectList0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return objectList0.joinToString(charSequence0, charSequence5, charSequence4, v, charSequence3, function10);
    }

    public final Object last() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final Object last(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final int lastIndexOf(Object object0) {
        if(object0 == null) {
            Object[] arr_object = this.content;
            for(int v = this._size - 1; -1 < v; --v) {
                if(arr_object[v] == null) {
                    return v;
                }
            }
            return -1;
        }
        Object[] arr_object1 = this.content;
        for(int v1 = this._size - 1; -1 < v1; --v1) {
            if(object0.equals(arr_object1[v1])) {
                return v1;
            }
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object lastOrNull() {
        return this.isEmpty() ? null : this.content[this._size - 1];
    }

    @Nullable
    public final Object lastOrNull(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            Object object0 = arr_object[v];
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                return object0;
            }
        }
        return null;
    }

    public final boolean none() {
        return this.isEmpty();
    }

    public final boolean reversedAny(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.content;
        for(int v = this._size - 1; -1 < v; --v) {
            if(((Boolean)function10.invoke(arr_object[v])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override
    @NotNull
    public String toString() {
        return ObjectList.joinToString$default(this, null, "[", "]", 0, null, new b0(this, 23), 25, null);
    }
}

