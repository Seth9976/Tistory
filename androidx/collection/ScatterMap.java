package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001UJ\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\t\u0010\u0006J\u001A\u0010\u000B\u001A\u0004\u0018\u00018\u00012\u0006\u0010\n\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\u00028\u00012\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\r\u001A\u00028\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000FJ)\u0010\u0011\u001A\u00028\u00012\u0006\u0010\n\u001A\u00028\u00002\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u001A\u001A\u00020\u00182!\u0010\u0019\u001A\u001D\u0012\u0013\u0012\u00110\u0014\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0013H\u0081\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJK\u0010\u001E\u001A\u00020\u001826\u0010\u0019\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\u00180\u001CH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ6\u0010 \u001A\u00020\u00182!\u0010\u0019\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00180\u0013H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u001BJ6\u0010!\u001A\u00020\u00182!\u0010\u0019\u001A\u001D\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\u00180\u0013H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\u001BJ-\u0010#\u001A\u00020\u00042\u0018\u0010\"\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u001CH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J-\u0010\u0005\u001A\u00020\u00042\u0018\u0010\"\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u001CH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0005\u0010$J\r\u0010%\u001A\u00020\u0014\u00A2\u0006\u0004\b%\u0010&J-\u0010%\u001A\u00020\u00142\u0018\u0010\"\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u001CH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010\'J\u0018\u0010(\u001A\u00020\u00042\u0006\u0010\n\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b(\u0010)J\u0015\u0010*\u001A\u00020\u00042\u0006\u0010\n\u001A\u00028\u0000\u00A2\u0006\u0004\b*\u0010)J\u0015\u0010+\u001A\u00020\u00042\u0006\u0010\u001D\u001A\u00028\u0001\u00A2\u0006\u0004\b+\u0010)J}\u00104\u001A\u0002032\b\b\u0002\u0010-\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020,2\b\b\u0002\u0010/\u001A\u00020,2\b\b\u0002\u00100\u001A\u00020\u00142\b\b\u0002\u00101\u001A\u00020,2:\b\u0002\u00102\u001A4\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020,\u0018\u00010\u001CH\u0007\u00A2\u0006\u0004\b4\u00105J\u000F\u00106\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b6\u0010&J\u001A\u00108\u001A\u00020\u00042\b\u00107\u001A\u0004\u0018\u00010\u0003H\u0096\u0002\u00A2\u0006\u0004\b8\u0010)J\u000F\u00109\u001A\u000203H\u0016\u00A2\u0006\u0004\b9\u0010:J\u000F\u0010<\u001A\u000203H\u0000\u00A2\u0006\u0004\b;\u0010:J\u0018\u0010?\u001A\u00020\u00142\u0006\u0010\n\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b=\u0010>J\u0019\u0010A\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@\u00A2\u0006\u0004\bA\u0010BR\u001C\u0010D\u001A\u00020C8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bD\u0010E\u0012\u0004\bF\u0010GR$\u0010I\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030H8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010GR$\u0010L\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030H8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bL\u0010J\u0012\u0004\bM\u0010GR\u0016\u0010N\u001A\u00020\u00148\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001A\u00020\u00148\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0006\n\u0004\bP\u0010OR\u0011\u0010R\u001A\u00020\u00148F\u00A2\u0006\u0006\u001A\u0004\bQ\u0010&R\u0011\u0010T\u001A\u00020\u00148F\u00A2\u0006\u0006\u001A\u0004\bS\u0010&\u0082\u0001\u0001V\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006W"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", "block", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "value", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "forEachKey", "forEachValue", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "asDebugString$collection", "asDebugString", "findKeyIndex$collection", "(Ljava/lang/Object;)I", "findKeyIndex", "", "asMap", "()Ljava/util/Map;", "", "metadata", "[J", "getMetadata$annotations", "()V", "", "keys", "[Ljava/lang/Object;", "getKeys$annotations", "values", "getValues$annotations", "_capacity", "I", "_size", "getCapacity", "capacity", "getSize", "size", "MapWrapper", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n633#1:1835\n634#1:1839\n636#1,2:1841\n638#1,4:1844\n642#1:1851\n643#1:1855\n644#1:1857\n645#1,4:1860\n651#1:1865\n652#1,8:1867\n633#1:1875\n634#1:1879\n636#1,2:1881\n638#1,4:1884\n642#1:1891\n643#1:1895\n644#1:1897\n645#1,4:1900\n651#1:1905\n652#1,8:1907\n363#1,6:1917\n373#1,3:1924\n376#1,9:1928\n363#1,6:1937\n373#1,3:1944\n376#1,9:1948\n363#1,6:1957\n373#1,3:1964\n376#1,9:1968\n391#1,4:1977\n363#1,6:1981\n373#1,3:1988\n376#1,2:1992\n396#1,2:1994\n379#1,6:1996\n398#1:2002\n391#1,4:2003\n363#1,6:2007\n373#1,3:2014\n376#1,2:2018\n396#1,2:2020\n379#1,6:2022\n398#1:2028\n391#1,4:2029\n363#1,6:2033\n373#1,3:2040\n376#1,2:2044\n396#1,2:2046\n379#1,6:2048\n398#1:2054\n633#1:2055\n634#1:2059\n636#1,2:2061\n638#1,4:2064\n642#1:2071\n643#1:2075\n644#1:2077\n645#1,4:2080\n651#1:2085\n652#1,8:2087\n633#1:2095\n634#1:2099\n636#1,2:2101\n638#1,4:2104\n642#1:2111\n643#1:2115\n644#1:2117\n645#1,4:2120\n651#1:2125\n652#1,8:2127\n418#1,3:2135\n363#1,6:2138\n373#1,3:2145\n376#1,2:2149\n422#1,2:2151\n379#1,6:2153\n424#1:2159\n391#1,4:2160\n363#1,6:2164\n373#1,3:2171\n376#1,2:2175\n396#1,2:2177\n379#1,6:2179\n398#1:2185\n391#1,4:2186\n363#1,6:2190\n373#1,3:2197\n376#1,2:2201\n396#1,2:2203\n379#1,6:2205\n398#1:2211\n391#1,4:2212\n363#1,6:2216\n373#1,3:2223\n376#1,2:2227\n396#1,2:2229\n379#1,6:2231\n398#1:2237\n391#1,4:2238\n363#1,6:2242\n373#1,3:2249\n376#1,2:2253\n396#1,2:2255\n379#1,6:2257\n398#1:2263\n1589#2,3:1836\n1603#2:1840\n1599#2:1843\n1779#2,3:1848\n1793#2,3:1852\n1717#2:1856\n1705#2:1858\n1699#2:1859\n1712#2:1864\n1802#2:1866\n1589#2,3:1876\n1603#2:1880\n1599#2:1883\n1779#2,3:1888\n1793#2,3:1892\n1717#2:1896\n1705#2:1898\n1699#2:1899\n1712#2:1904\n1802#2:1906\n1810#2:1915\n1672#2:1916\n1810#2:1923\n1672#2:1927\n1810#2:1943\n1672#2:1947\n1810#2:1963\n1672#2:1967\n1810#2:1987\n1672#2:1991\n1810#2:2013\n1672#2:2017\n1810#2:2039\n1672#2:2043\n1589#2,3:2056\n1603#2:2060\n1599#2:2063\n1779#2,3:2068\n1793#2,3:2072\n1717#2:2076\n1705#2:2078\n1699#2:2079\n1712#2:2084\n1802#2:2086\n1589#2,3:2096\n1603#2:2100\n1599#2:2103\n1779#2,3:2108\n1793#2,3:2112\n1717#2:2116\n1705#2:2118\n1699#2:2119\n1712#2:2124\n1802#2:2126\n1810#2:2144\n1672#2:2148\n1810#2:2170\n1672#2:2174\n1810#2:2196\n1672#2:2200\n1810#2:2222\n1672#2:2226\n1810#2:2248\n1672#2:2252\n1645#2:2264\n1589#2,3:2265\n1603#2:2268\n1599#2:2269\n1779#2,3:2270\n1793#2,3:2273\n1717#2:2276\n1705#2:2277\n1699#2:2278\n1712#2:2279\n1802#2:2280\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n330#1:1835\n330#1:1839\n330#1:1841,2\n330#1:1844,4\n330#1:1851\n330#1:1855\n330#1:1857\n330#1:1860,4\n330#1:1865\n330#1:1867,8\n340#1:1875\n340#1:1879\n340#1:1881,2\n340#1:1884,4\n340#1:1891\n340#1:1895\n340#1:1897\n340#1:1900,4\n340#1:1905\n340#1:1907,8\n394#1:1917,6\n394#1:1924,3\n394#1:1928,9\n407#1:1937,6\n407#1:1944,3\n407#1:1948,9\n420#1:1957,6\n420#1:1964,3\n420#1:1968,9\n430#1:1977,4\n430#1:1981,6\n430#1:1988,3\n430#1:1992,2\n430#1:1994,2\n430#1:1996,6\n430#1:2002\n440#1:2003,4\n440#1:2007,6\n440#1:2014,3\n440#1:2018,2\n440#1:2020,2\n440#1:2022,6\n440#1:2028\n456#1:2029,4\n456#1:2033,6\n456#1:2040,3\n456#1:2044,2\n456#1:2046,2\n456#1:2048,6\n456#1:2054\n466#1:2055\n466#1:2059\n466#1:2061,2\n466#1:2064,4\n466#1:2071\n466#1:2075\n466#1:2077\n466#1:2080,4\n466#1:2085\n466#1:2087,8\n472#1:2095\n472#1:2099\n472#1:2101,2\n472#1:2104,4\n472#1:2111\n472#1:2115\n472#1:2117\n472#1:2120,4\n472#1:2125\n472#1:2127,8\n479#1:2135,3\n479#1:2138,6\n479#1:2145,3\n479#1:2149,2\n479#1:2151,2\n479#1:2153,6\n479#1:2159\n506#1:2160,4\n506#1:2164,6\n506#1:2171,3\n506#1:2175,2\n506#1:2177,2\n506#1:2179,6\n506#1:2185\n533#1:2186,4\n533#1:2190,6\n533#1:2197,3\n533#1:2201,2\n533#1:2203,2\n533#1:2205,6\n533#1:2211\n562#1:2212,4\n562#1:2216,6\n562#1:2223,3\n562#1:2227,2\n562#1:2229,2\n562#1:2231,6\n562#1:2237\n588#1:2238,4\n588#1:2242,6\n588#1:2249,3\n588#1:2253,2\n588#1:2255,2\n588#1:2257,6\n588#1:2263\n330#1:1836,3\n330#1:1840\n330#1:1843\n330#1:1848,3\n330#1:1852,3\n330#1:1856\n330#1:1858\n330#1:1859\n330#1:1864\n330#1:1866\n340#1:1876,3\n340#1:1880\n340#1:1883\n340#1:1888,3\n340#1:1892,3\n340#1:1896\n340#1:1898\n340#1:1899\n340#1:1904\n340#1:1906\n368#1:1915\n375#1:1916\n394#1:1923\n394#1:1927\n407#1:1943\n407#1:1947\n420#1:1963\n420#1:1967\n430#1:1987\n430#1:1991\n440#1:2013\n440#1:2017\n456#1:2039\n456#1:2043\n466#1:2056,3\n466#1:2060\n466#1:2063\n466#1:2068,3\n466#1:2072,3\n466#1:2076\n466#1:2078\n466#1:2079\n466#1:2084\n466#1:2086\n472#1:2096,3\n472#1:2100\n472#1:2103\n472#1:2108,3\n472#1:2112,3\n472#1:2116\n472#1:2118\n472#1:2119\n472#1:2124\n472#1:2126\n479#1:2144\n479#1:2148\n506#1:2170\n506#1:2174\n533#1:2196\n533#1:2200\n562#1:2222\n562#1:2226\n588#1:2248\n588#1:2252\n605#1:2264\n633#1:2265,3\n634#1:2268\n637#1:2269\n641#1:2270,3\n642#1:2273,3\n643#1:2276\n644#1:2277\n644#1:2278\n648#1:2279\n651#1:2280\n*E\n"})
public abstract class ScatterMap {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0090\u0004\u0018\u00002\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0018\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001A\u001A\u00020\u0013H\u0016R&\u0010\u0003\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001A\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00010\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u001B"}, d2 = {"Landroidx/collection/ScatterMap$MapWrapper;", "", "(Landroidx/collection/ScatterMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public class MapWrapper implements Map, KMappedMarker {
        public final ScatterMap a;

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object compute(Object object0, BiFunction biFunction0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object computeIfAbsent(Object object0, Function function0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object computeIfPresent(Object object0, BiFunction biFunction0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean containsKey(Object object0) {
            return ScatterMap.this.containsKey(object0);
        }

        @Override
        public boolean containsValue(Object object0) {
            return ScatterMap.this.containsValue(object0);
        }

        @Override
        public final Set entrySet() {
            return this.getEntries();
        }

        @Override
        @Nullable
        public Object get(Object object0) {
            return ScatterMap.this.get(object0);
        }

        @NotNull
        public Set getEntries() {
            return new Object() {
                public final ScatterMap a;

                {
                    this.a = scatterMap0;
                }

                @Override
                public boolean add(Object object0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public boolean add(Map.Entry map$Entry0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean addAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public void clear() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final boolean contains(Object object0) {
                    return object0 instanceof Map.Entry ? this.contains(((Map.Entry)object0)) : false;
                }

                public boolean contains(@NotNull Map.Entry map$Entry0) {
                    Intrinsics.checkNotNullParameter(map$Entry0, "element");
                    Object object0 = map$Entry0.getKey();
                    return Intrinsics.areEqual(this.a.get(object0), map$Entry0.getValue());
                }

                @Override
                public boolean containsAll(@NotNull Collection collection0) {
                    Intrinsics.checkNotNullParameter(collection0, "elements");
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            Object object1 = ((Map.Entry)object0).getKey();
                            if(!Intrinsics.areEqual(this.a.get(object1), ((Map.Entry)object0).getValue())) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return true;
                }

                public int getSize() {
                    return this.a._size;
                }

                @Override
                public boolean isEmpty() {
                    return this.a.isEmpty();
                }

                @Override
                @NotNull
                public Iterator iterator() {
                    return SequencesKt__SequenceBuilderKt.iterator(new c(this.a, null));
                }

                @Override
                public boolean remove(Object object0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean removeAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean retainAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
                    return this.getSize();
                }

                @Override
                public Object[] toArray() {
                    return CollectionToArray.toArray(this);
                }

                @Override
                public Object[] toArray(Object[] arr_object) {
                    Intrinsics.checkNotNullParameter(arr_object, "array");
                    return CollectionToArray.toArray(this, arr_object);
                }
            };
        }

        @NotNull
        public Set getKeys() {
            return new Object() {
                public final ScatterMap a;

                {
                    this.a = scatterMap0;
                }

                @Override
                public boolean add(Object object0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean addAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public void clear() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean contains(Object object0) {
                    return this.a.containsKey(object0);
                }

                @Override
                public boolean containsAll(@NotNull Collection collection0) {
                    Intrinsics.checkNotNullParameter(collection0, "elements");
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            if(!this.a.containsKey(object0)) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return true;
                }

                public int getSize() {
                    return this.a._size;
                }

                @Override
                public boolean isEmpty() {
                    return this.a.isEmpty();
                }

                @Override
                @NotNull
                public Iterator iterator() {
                    return SequencesKt__SequenceBuilderKt.iterator(new d(this.a, null));
                }

                @Override
                public boolean remove(Object object0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean removeAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean retainAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
                    return this.getSize();
                }

                @Override
                public Object[] toArray() {
                    return CollectionToArray.toArray(this);
                }

                @Override
                public Object[] toArray(Object[] arr_object) {
                    Intrinsics.checkNotNullParameter(arr_object, "array");
                    return CollectionToArray.toArray(this, arr_object);
                }
            };
        }

        public int getSize() {
            return ScatterMap.this._size;
        }

        @NotNull
        public Collection getValues() {
            return new Object() {
                public final ScatterMap a;

                {
                    this.a = scatterMap0;
                }

                @Override
                public boolean add(Object object0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean addAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public void clear() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean contains(Object object0) {
                    return this.a.containsValue(object0);
                }

                @Override
                public boolean containsAll(@NotNull Collection collection0) {
                    Intrinsics.checkNotNullParameter(collection0, "elements");
                    if(!collection0.isEmpty()) {
                        for(Object object0: collection0) {
                            if(!this.a.containsValue(object0)) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    return true;
                }

                public int getSize() {
                    return this.a._size;
                }

                @Override
                public boolean isEmpty() {
                    return this.a.isEmpty();
                }

                @Override
                @NotNull
                public Iterator iterator() {
                    return SequencesKt__SequenceBuilderKt.iterator(new e(this.a, null));
                }

                @Override
                public boolean remove(Object object0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean removeAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean removeIf(Predicate predicate0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public boolean retainAll(Collection collection0) {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override
                public final int size() {
                    return this.getSize();
                }

                @Override
                public Object[] toArray() {
                    return CollectionToArray.toArray(this);
                }

                @Override
                public Object[] toArray(Object[] arr_object) {
                    Intrinsics.checkNotNullParameter(arr_object, "array");
                    return CollectionToArray.toArray(this, arr_object);
                }
            };
        }

        @Override
        public boolean isEmpty() {
            return ScatterMap.this.isEmpty();
        }

        @Override
        public final Set keySet() {
            return this.getKeys();
        }

        @Override
        public Object merge(Object object0, Object object1, BiFunction biFunction0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object put(Object object0, Object object1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public void putAll(Map map0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object putIfAbsent(Object object0, Object object1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object remove(Object object0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean remove(Object object0, Object object1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public Object replace(Object object0, Object object1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean replace(Object object0, Object object1, Object object2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public void replaceAll(BiFunction biFunction0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public final int size() {
            return this.getSize();
        }

        @Override
        public final Collection values() {
            return this.getValues();
        }
    }

    @JvmField
    public int _capacity;
    @JvmField
    public int _size;
    @JvmField
    @NotNull
    public Object[] keys;
    @JvmField
    @NotNull
    public long[] metadata;
    @JvmField
    @NotNull
    public Object[] values;

    public ScatterMap(DefaultConstructorMarker defaultConstructorMarker0) {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final boolean all(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(!((Boolean)function20.invoke(arr_object[v5], arr_object1[v5])).booleanValue()) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_20;
                    }
                    break;
                }
            label_20:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean any(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(((Boolean)function20.invoke(arr_object[v5], arr_object1[v5])).booleanValue()) {
                                return true;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_20;
                    }
                    break;
                }
            label_20:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return false;
    }

    @NotNull
    public final String asDebugString$collection() {
        StringBuilder stringBuilder0 = new StringBuilder("{metadata=[");
        int v = this.getCapacity();
        for(int v2 = 0; v2 < v; ++v2) {
            long v3 = this.metadata[v2 >> 3] >> ((v2 & 7) << 3) & 0xFFL;
            if(v3 == 0x80L) {
                stringBuilder0.append("Empty");
            }
            else if(v3 == 0xFEL) {
                stringBuilder0.append("Deleted");
            }
            else {
                stringBuilder0.append(v3);
            }
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("], keys=[");
        for(int v4 = 0; v4 < this.keys.length; ++v4) {
            stringBuilder0.append(this.keys[v4]);
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("], values=[");
        for(int v1 = 0; v1 < this.values.length; ++v1) {
            stringBuilder0.append(this.values[v1]);
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("]}");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @NotNull
    public final Map asMap() {
        return new MapWrapper(this);
    }

    public final boolean contains(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(Intrinsics.areEqual(this.keys[v9], object0)) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean containsKey(Object object0) {
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = this._capacity;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.metadata[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.metadata[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(Intrinsics.areEqual(this.keys[v9], object0)) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final boolean containsValue(Object object0) {
        Object[] arr_object = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L && Intrinsics.areEqual(object0, arr_object[(v1 << 3) + v4])) {
                            return true;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_16;
                    }
                    break;
                }
            label_16:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return false;
    }

    public final int count() {
        return this.getSize();
    }

    public final int count(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            if(((Boolean)function20.invoke(arr_object[v6], arr_object1[v6])).booleanValue()) {
                                ++v2;
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof ScatterMap)) {
            return false;
        }
        if(((ScatterMap)object0).getSize() != this.getSize()) {
            return false;
        }
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object1 = arr_object[v5];
                            Object object2 = arr_object1[v5];
                            if(object2 == null) {
                                if(((ScatterMap)object0).get(object1) != null || !((ScatterMap)object0).containsKey(object1)) {
                                    return false;
                                }
                            }
                            else if(!Intrinsics.areEqual(object2, ((ScatterMap)object0).get(object1))) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_30;
                    }
                    break;
                }
            label_30:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final int findKeyIndex$collection(Object object0) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        for(int v4 = v2 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.metadata[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(Intrinsics.areEqual(this.keys[v10], object0)) {
                    return v10;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v += 8;
        }
    }

    public final void forEach(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            function20.invoke(arr_object[v5], arr_object1[v5]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_19;
                    }
                    break;
                }
            label_19:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @PublishedApi
    public final void forEachIndexed(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            q.w(v1 << 3, v4, function10);
                        }
                        v2 >>= 8;
                    }
                    if(v3 != 8) {
                        return;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
        }
    }

    public final void forEachKey(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        Object[] arr_object = this.keys;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            function10.invoke(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    public final void forEachValue(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        Object[] arr_object = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            function10.invoke(arr_object[(v1 << 3) + v4]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
    }

    @Nullable
    public final Object get(Object object0) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        for(int v4 = v2 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.metadata[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(Intrinsics.areEqual(this.keys[v10], object0)) {
                    return v10 < 0 ? null : this.values[v10];
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                throw new ArrayIndexOutOfBoundsException(-1);
            }
            v += 8;
        }
    }

    public final int getCapacity() {
        return this._capacity;
    }

    @PublishedApi
    public static void getKeys$annotations() {
    }

    @PublishedApi
    public static void getMetadata$annotations() {
    }

    public final Object getOrDefault(Object object0, Object object1) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        for(int v4 = v2 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.metadata[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(Intrinsics.areEqual(this.keys[v10], object0)) {
                    return v10 < 0 ? object1 : this.values[v10];
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                throw new ArrayIndexOutOfBoundsException(-1);
            }
            v += 8;
        }
    }

    public final Object getOrElse(Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object1 = this.get(object0);
        return object1 == null ? function00.invoke() : object1;
    }

    public final int getSize() {
        return this._size;
    }

    @PublishedApi
    public static void getValues$annotations() {
    }

    @Override
    public int hashCode() {
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            Object object0 = arr_object[v6];
                            Object object1 = arr_object1[v6];
                            v2 += (object1 == null ? 0 : object1.hashCode()) ^ (object0 == null ? 0 : object0.hashCode());
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
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
        return ScatterMap.joinToString$default(this, null, null, null, 0, null, null, 0x3F, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        return ScatterMap.joinToString$default(this, charSequence0, null, null, 0, null, null, 62, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return ScatterMap.joinToString$default(this, charSequence0, charSequence1, null, 0, null, null, 60, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return ScatterMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, 0, null, null, 56, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return ScatterMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, null, null, 0x30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        return ScatterMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, charSequence3, null, 0x20, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @Nullable Function2 function20) {
        Object[] arr_object5;
        Object[] arr_object4;
        Object[] arr_object3;
        Object[] arr_object2;
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.r(charSequence2, "postfix", charSequence3, "truncated", charSequence1);
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        long[] arr_v = this.metadata;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v[v2];
                int v5 = v2;
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_object4 = arr_object;
                    arr_object5 = arr_object1;
                    goto label_49;
                }
                int v6 = 8 - (~(v5 - v1) >>> 0x1F);
                int v7 = 0;
                while(v7 < v6) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v8 = (v5 << 3) + v7;
                        Object object0 = arr_object[v8];
                        arr_object2 = arr_object;
                        Object object1 = arr_object1[v8];
                        arr_object3 = arr_object1;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_57;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        if(function20 == null) {
                            stringBuilder0.append(object0);
                            stringBuilder0.append('=');
                            stringBuilder0.append(object1);
                        }
                        else {
                            stringBuilder0.append(((CharSequence)function20.invoke(object0, object1)));
                        }
                        ++v3;
                    }
                    else {
                        arr_object2 = arr_object;
                        arr_object3 = arr_object1;
                    }
                    v4 >>= 8;
                    ++v7;
                    arr_object1 = arr_object3;
                    arr_object = arr_object2;
                }
                arr_object4 = arr_object;
                arr_object5 = arr_object1;
                if(v6 == 8) {
                label_49:
                    if(v5 != v1) {
                        v2 = v5 + 1;
                        arr_object1 = arr_object5;
                        arr_object = arr_object4;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_57;
            }
        }
        stringBuilder0.append(charSequence2);
    label_57:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String joinToString$default(ScatterMap scatterMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function2 function20, int v1, Object object0) {
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
            function20 = null;
        }
        return scatterMap0.joinToString(charSequence0, charSequence5, charSequence4, v, charSequence3, function20);
    }

    public final boolean none() {
        return this._size == 0;
    }

    @Override
    @NotNull
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder("{");
        Object[] arr_object = this.keys;
        Object[] arr_object1 = this.values;
        long[] arr_v = this.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            String s = arr_object[v6];
                            String s1 = arr_object1[v6];
                            if(s == this) {
                                s = "(this)";
                            }
                            stringBuilder0.append(s);
                            stringBuilder0.append("=");
                            if(s1 == this) {
                                s1 = "(this)";
                            }
                            stringBuilder0.append(s1);
                            ++v2;
                            if(v2 < this._size) {
                                stringBuilder0.append(", ");
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_33;
                    }
                    break;
                }
            label_33:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return q.l('}', "s.append(\'}\').toString()", stringBuilder0);
    }
}

