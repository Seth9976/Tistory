package androidx.collection;

import androidx.annotation.IntRange;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001A\u00020\bH\u0086\b\u00A2\u0006\u0004\b\t\u0010\nJA\u0010\t\u001A\u00020\b2!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00020\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\t\u0010\u0010JA\u0010\u0015\u001A\u00020\u00132!\u0010\u0014\u001A\u001D\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000BH\u0081\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u0017\u001A\u00020\u00132!\u0010\u0014\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00130\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0016JA\u0010\u0018\u001A\u00020\u00022!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00020\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u0003\u001A\u00020\u00022!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00020\u000BH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0003\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001BJA\u0010\u001A\u001A\u00020\u00112!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00020\u000BH\u0087\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001CJ\u0018\u0010\u001D\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\bH\u0086\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJA\u0010&\u001A\u00020%2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010!\u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020\u001F2\b\b\u0002\u0010#\u001A\u00020\u00112\b\b\u0002\u0010$\u001A\u00020\u001FH\u0007\u00A2\u0006\u0004\b&\u0010\'J[\u0010&\u001A\u00020%2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010!\u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020\u001F2\b\b\u0002\u0010#\u001A\u00020\u00112\b\b\u0002\u0010$\u001A\u00020\u001F2\u0014\b\u0004\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001F0\u000BH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010)J\u000F\u0010*\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b*\u0010\u001BJ\u001A\u0010,\u001A\u00020\u00022\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b,\u0010-J\u000F\u0010.\u001A\u00020%H\u0016\u00A2\u0006\u0004\b.\u0010/J\u0018\u00102\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\bH\u0080\b\u00A2\u0006\u0004\b0\u00101R\u001C\u00104\u001A\u0002038\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u00107R\u001C\u00108\u001A\u0002038\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\b8\u00105\u0012\u0004\b9\u00107R\u0016\u0010:\u001A\u00020\u00118\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001A\u00020\u00118\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0006\n\u0004\b<\u0010;R\u0011\u0010>\u001A\u00020\u00118G\u00A2\u0006\u0006\u001A\u0004\b=\u0010\u001BR\u0011\u0010@\u001A\u00020\u00118G\u00A2\u0006\u0006\u001A\u0004\b?\u0010\u001B\u0082\u0001\u0001A\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006B"}, d2 = {"Landroidx/collection/LongSet;", "", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", "", "first", "()J", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Lkotlin/jvm/functions/Function1;)J", "", "index", "", "block", "forEachIndex", "(Lkotlin/jvm/functions/Function1;)V", "forEach", "all", "(Lkotlin/jvm/functions/Function1;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "contains", "(J)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "findElementIndex$collection", "(J)I", "findElementIndex", "", "metadata", "[J", "getMetadata$annotations", "()V", "elements", "getElements$annotations", "_capacity", "I", "_size", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableLongSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,837:1\n262#1,4:838\n232#1,7:842\n243#1,3:850\n246#1,2:854\n266#1,2:856\n249#1,6:858\n268#1:864\n262#1,4:865\n232#1,7:869\n243#1,3:877\n246#1,2:881\n266#1,2:883\n249#1,6:885\n268#1:891\n232#1,7:894\n243#1,3:902\n246#1,9:906\n262#1,4:915\n232#1,7:919\n243#1,3:927\n246#1,2:931\n266#1,2:933\n249#1,6:935\n268#1:941\n262#1,4:942\n232#1,7:946\n243#1,3:954\n246#1,2:958\n266#1,2:960\n249#1,6:962\n268#1:968\n262#1,4:969\n232#1,7:973\n243#1,3:981\n246#1,2:985\n266#1,2:987\n249#1,6:989\n268#1:995\n442#1:996\n443#1:1000\n445#1,2:1002\n447#1,3:1005\n450#1:1011\n451#1:1015\n452#1:1017\n453#1,4:1020\n459#1:1025\n460#1,8:1027\n262#1,4:1035\n232#1,7:1039\n243#1,3:1047\n246#1,2:1051\n266#1,2:1053\n249#1,6:1055\n268#1:1061\n262#1,4:1062\n232#1,7:1066\n243#1,3:1074\n246#1,2:1078\n266#1,2:1080\n249#1,6:1082\n268#1:1088\n262#1,4:1089\n232#1,7:1093\n243#1,3:1101\n246#1,2:1105\n266#1,2:1107\n249#1,6:1109\n268#1:1115\n262#1,4:1116\n232#1,7:1120\n243#1,3:1128\n246#1,2:1132\n266#1,2:1134\n249#1,6:1136\n268#1:1142\n262#1,4:1143\n232#1,7:1147\n243#1,3:1155\n246#1,2:1159\n266#1,2:1161\n249#1,6:1163\n268#1:1169\n365#1,11:1186\n262#1,4:1197\n232#1,7:1201\n243#1,3:1209\n246#1,2:1213\n266#1:1215\n376#1,10:1216\n267#1:1226\n249#1,6:1227\n268#1:1233\n386#1,2:1234\n365#1,11:1236\n262#1,4:1247\n232#1,7:1251\n243#1,3:1259\n246#1,2:1263\n266#1:1265\n376#1,10:1266\n267#1:1276\n249#1,6:1277\n268#1:1283\n386#1,2:1284\n365#1,11:1286\n262#1,4:1297\n232#1,7:1301\n243#1,3:1309\n246#1,2:1313\n266#1:1315\n376#1,10:1316\n267#1:1326\n249#1,6:1327\n268#1:1333\n386#1,2:1334\n365#1,11:1336\n262#1,4:1347\n232#1,7:1351\n243#1,3:1359\n246#1,2:1363\n266#1:1365\n376#1,10:1366\n267#1:1376\n249#1,6:1377\n268#1:1383\n386#1,2:1384\n365#1,11:1386\n262#1,4:1397\n232#1,7:1401\n243#1,3:1409\n246#1,2:1413\n266#1:1415\n376#1,10:1416\n267#1:1426\n249#1,6:1427\n268#1:1433\n386#1,2:1434\n1810#2:849\n1672#2:853\n1810#2:876\n1672#2:880\n1810#2:892\n1672#2:893\n1810#2:901\n1672#2:905\n1810#2:926\n1672#2:930\n1810#2:953\n1672#2:957\n1810#2:980\n1672#2:984\n1603#2:1001\n1599#2:1004\n1779#2,3:1008\n1793#2,3:1012\n1717#2:1016\n1705#2:1018\n1699#2:1019\n1712#2:1024\n1802#2:1026\n1810#2:1046\n1672#2:1050\n1810#2:1073\n1672#2:1077\n1810#2:1100\n1672#2:1104\n1810#2:1127\n1672#2:1131\n1810#2:1154\n1672#2:1158\n1603#2:1173\n1599#2:1174\n1779#2,3:1175\n1793#2,3:1178\n1717#2:1181\n1705#2:1182\n1699#2:1183\n1712#2:1184\n1802#2:1185\n1810#2:1208\n1672#2:1212\n1810#2:1258\n1672#2:1262\n1810#2:1308\n1672#2:1312\n1810#2:1358\n1672#2:1362\n1810#2:1408\n1672#2:1412\n833#3,3:997\n833#3,3:1170\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n*L\n203#1:838,4\n203#1:842,7\n203#1:850,3\n203#1:854,2\n203#1:856,2\n203#1:858,6\n203#1:864\n222#1:865,4\n222#1:869,7\n222#1:877,3\n222#1:881,2\n222#1:883,2\n222#1:885,6\n222#1:891\n265#1:894,7\n265#1:902,3\n265#1:906,9\n277#1:915,4\n277#1:919,7\n277#1:927,3\n277#1:931,2\n277#1:933,2\n277#1:935,6\n277#1:941\n290#1:942,4\n290#1:946,7\n290#1:954,3\n290#1:958,2\n290#1:960,2\n290#1:962,6\n290#1:968\n311#1:969,4\n311#1:973,7\n311#1:981,3\n311#1:985,2\n311#1:987,2\n311#1:989,6\n311#1:995\n322#1:996\n322#1:1000\n322#1:1002,2\n322#1:1005,3\n322#1:1011\n322#1:1015\n322#1:1017\n322#1:1020,4\n322#1:1025\n322#1:1027,8\n342#1:1035,4\n342#1:1039,7\n342#1:1047,3\n342#1:1051,2\n342#1:1053,2\n342#1:1055,6\n342#1:1061\n375#1:1062,4\n375#1:1066,7\n375#1:1074,3\n375#1:1078,2\n375#1:1080,2\n375#1:1082,6\n375#1:1088\n375#1:1089,4\n375#1:1093,7\n375#1:1101,3\n375#1:1105,2\n375#1:1107,2\n375#1:1109,6\n375#1:1115\n396#1:1116,4\n396#1:1120,7\n396#1:1128,3\n396#1:1132,2\n396#1:1134,2\n396#1:1136,6\n396#1:1142\n422#1:1143,4\n422#1:1147,7\n422#1:1155,3\n422#1:1159,2\n422#1:1161,2\n422#1:1163,6\n422#1:1169\n-1#1:1186,11\n-1#1:1197,4\n-1#1:1201,7\n-1#1:1209,3\n-1#1:1213,2\n-1#1:1215\n-1#1:1216,10\n-1#1:1226\n-1#1:1227,6\n-1#1:1233\n-1#1:1234,2\n-1#1:1236,11\n-1#1:1247,4\n-1#1:1251,7\n-1#1:1259,3\n-1#1:1263,2\n-1#1:1265\n-1#1:1266,10\n-1#1:1276\n-1#1:1277,6\n-1#1:1283\n-1#1:1284,2\n-1#1:1286,11\n-1#1:1297,4\n-1#1:1301,7\n-1#1:1309,3\n-1#1:1313,2\n-1#1:1315\n-1#1:1316,10\n-1#1:1326\n-1#1:1327,6\n-1#1:1333\n-1#1:1334,2\n-1#1:1336,11\n-1#1:1347,4\n-1#1:1351,7\n-1#1:1359,3\n-1#1:1363,2\n-1#1:1365\n-1#1:1366,10\n-1#1:1376\n-1#1:1377,6\n-1#1:1383\n-1#1:1384,2\n-1#1:1386,11\n-1#1:1397,4\n-1#1:1401,7\n-1#1:1409,3\n-1#1:1413,2\n-1#1:1415\n-1#1:1416,10\n-1#1:1426\n-1#1:1427,6\n-1#1:1433\n-1#1:1434,2\n203#1:849\n203#1:853\n222#1:876\n222#1:880\n238#1:892\n245#1:893\n265#1:901\n265#1:905\n277#1:926\n277#1:930\n290#1:953\n290#1:957\n311#1:980\n311#1:984\n322#1:1001\n322#1:1004\n322#1:1008,3\n322#1:1012,3\n322#1:1016\n322#1:1018\n322#1:1019\n322#1:1024\n322#1:1026\n342#1:1046\n342#1:1050\n375#1:1073\n375#1:1077\n375#1:1100\n375#1:1104\n396#1:1127\n396#1:1131\n422#1:1154\n422#1:1158\n443#1:1173\n446#1:1174\n449#1:1175,3\n450#1:1178,3\n451#1:1181\n452#1:1182\n452#1:1183\n456#1:1184\n459#1:1185\n-1#1:1208\n-1#1:1212\n-1#1:1258\n-1#1:1262\n-1#1:1308\n-1#1:1312\n-1#1:1358\n-1#1:1362\n-1#1:1408\n-1#1:1412\n322#1:997,3\n442#1:1170,3\n*E\n"})
public abstract class LongSet {
    @JvmField
    public int _capacity;
    @JvmField
    public int _size;
    @JvmField
    @NotNull
    public long[] elements;
    @JvmField
    @NotNull
    public long[] metadata;

    public LongSet(DefaultConstructorMarker defaultConstructorMarker0) {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    public final boolean all(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L && !((Boolean)function10.invoke(((long)arr_v[(v1 << 3) + v4]))).booleanValue()) {
                            return false;
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
        return true;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean any(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L && ((Boolean)function10.invoke(((long)arr_v[(v1 << 3) + v4]))).booleanValue()) {
                            return true;
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
        return false;
    }

    public final boolean contains(long v) {
        int v1 = Long.hashCode(v);
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.metadata[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.elements[v10] == v) {
                    return v10 >= 0;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    @IntRange(from = 0L)
    public final int count() {
        return this._size;
    }

    @IntRange(from = 0L)
    public final int count(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L && ((Boolean)function10.invoke(((long)arr_v[(v1 << 3) + v5]))).booleanValue()) {
                            ++v2;
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
        if(!(object0 instanceof LongSet)) {
            return false;
        }
        if(((LongSet)object0)._size != this._size) {
            return false;
        }
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L && !((LongSet)object0).contains(arr_v[(v1 << 3) + v4])) {
                            return false;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final int findElementIndex$collection(long v) {
        int v1 = Long.hashCode(v);
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this._capacity;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.metadata[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.metadata[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.elements[v10] == v) {
                    return v10;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final long first() {
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            return arr_v[(v1 << 3) + v4];
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
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final long first(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            long v5 = arr_v[(v1 << 3) + v4];
                            if(((Boolean)function10.invoke(v5)).booleanValue()) {
                                return v5;
                            }
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
        throw new NoSuchElementException("Could not find a match");
    }

    public final void forEach(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            function10.invoke(((long)arr_v[(v1 << 3) + v4]));
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

    @PublishedApi
    public final void forEachIndex(@NotNull Function1 function10) {
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

    @IntRange(from = 0L)
    public final int getCapacity() {
        return this._capacity;
    }

    @PublishedApi
    public static void getElements$annotations() {
    }

    @PublishedApi
    public static void getMetadata$annotations() {
    }

    @IntRange(from = 0L)
    public final int getSize() {
        return this._size;
    }

    @Override
    public int hashCode() {
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            v2 = Long.hashCode(arr_v[(v1 << 3) + v5]) + v2;
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
        return LongSet.joinToString$default(this, null, null, null, 0, null, 0x1F, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        return LongSet.joinToString$default(this, charSequence0, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return LongSet.joinToString$default(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return LongSet.joinToString$default(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return LongSet.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3) {
        int v9;
        int v7;
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.r(charSequence2, "postfix", charSequence3, "truncated", charSequence1);
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_35;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        v7 = v2;
                        long v8 = arr_v[(v2 << 3) + v6];
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_42;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(v8);
                        ++v3;
                    }
                    else {
                        v7 = v2;
                    }
                    v4 >>= 8;
                    ++v6;
                    v2 = v7;
                }
                if(v5 == 8) {
                    v9 = v2;
                    goto label_36;
                }
                else {
                    stringBuilder0.append(charSequence2);
                    goto label_42;
                label_35:
                    v9 = v2;
                label_36:
                    if(v9 != v1) {
                        v2 = v9 + 1;
                        continue;
                    }
                    break;
                }
                goto label_42;
            }
        }
        stringBuilder0.append(charSequence2);
    label_42:
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
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_30;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        long v7 = arr_v[(v2 << 3) + v6];
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_36;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function10.invoke(v7)));
                        ++v3;
                    }
                    v4 >>= 8;
                    ++v6;
                }
                if(v5 == 8) {
                label_30:
                    if(v2 != v1) {
                        ++v2;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_36;
            }
        }
        stringBuilder0.append(charSequence2);
    label_36:
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
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_29;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        long v7 = arr_v[(v2 << 3) + v6];
                        if(v3 == v) {
                            stringBuilder0.append("...");
                            goto label_35;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function10.invoke(v7)));
                        ++v3;
                    }
                    v4 >>= 8;
                    ++v6;
                }
                if(v5 == 8) {
                label_29:
                    if(v2 != v1) {
                        ++v2;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_35;
            }
        }
        stringBuilder0.append(charSequence2);
    label_35:
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
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_29;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        long v6 = arr_v[(v1 << 3) + v5];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_35;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function10.invoke(v6)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_29:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_35;
            }
        }
        stringBuilder0.append(charSequence2);
    label_35:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        StringBuilder stringBuilder0 = q.s(charSequence1, "prefix", function10, "transform", charSequence1);
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_28;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((0xFFL & v3) < 0x80L) {
                        long v6 = arr_v[(v1 << 3) + v5];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_34;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function10.invoke(v6)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_28:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_34;
            }
        }
        stringBuilder0.append("");
    label_34:
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
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_29;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        long v6 = arr_v[(v1 << 3) + v5];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_35;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function10.invoke(v6)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_29:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_35;
            }
        }
        stringBuilder0.append("");
    label_35:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "transform");
        StringBuilder stringBuilder0 = new StringBuilder("");
        long[] arr_v = this.elements;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_28;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((0xFFL & v3) < 0x80L) {
                        long v6 = arr_v[(v1 << 3) + v5];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_34;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(((CharSequence)function10.invoke(v6)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_28:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_34;
            }
        }
        stringBuilder0.append("");
    label_34:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String joinToString$default(LongSet longSet0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
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
        return longSet0.joinToString(charSequence0, charSequence5, charSequence4, v, charSequence3);
    }

    public static String joinToString$default(LongSet longSet0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence charSequence4 = (v1 & 1) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence5 = charSequence2;
        }
        CharSequence charSequence7 = (v1 & 16) == 0 ? charSequence3 : "...";
        Intrinsics.checkNotNullParameter(charSequence4, "separator");
        Intrinsics.checkNotNullParameter(charSequence6, "prefix");
        Intrinsics.checkNotNullParameter(charSequence5, "postfix");
        StringBuilder stringBuilder0 = q.s(charSequence7, "truncated", function10, "transform", charSequence6);
        long[] arr_v = longSet0.elements;
        long[] arr_v1 = longSet0.metadata;
        int v2 = arr_v1.length - 2;
        if(v2 >= 0) {
            int v3 = 0;
            int v4 = 0;
            while(true) {
                long v5 = arr_v1[v3];
                if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_46;
                }
                int v6 = 8 - (~(v3 - v2) >>> 0x1F);
                int v7 = 0;
                while(v7 < v6) {
                    if((v5 & 0xFFL) < 0x80L) {
                        long v8 = arr_v[(v3 << 3) + v7];
                        if(v4 == ((v1 & 8) == 0 ? v : -1)) {
                            stringBuilder0.append(charSequence7);
                            goto label_52;
                        }
                        if(v4 != 0) {
                            stringBuilder0.append(charSequence4);
                        }
                        stringBuilder0.append(((CharSequence)function10.invoke(v8)));
                        ++v4;
                    }
                    v5 >>= 8;
                    ++v7;
                }
                if(v6 == 8) {
                label_46:
                    if(v3 != v2) {
                        ++v3;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence5);
                }
                goto label_52;
            }
        }
        stringBuilder0.append(charSequence5);
    label_52:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final boolean none() {
        return this._size == 0;
    }

    @Override
    @NotNull
    public String toString() {
        return LongSet.joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }
}

