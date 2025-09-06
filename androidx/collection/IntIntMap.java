package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\u0004J\u0018\u0010\n\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0086\u0002\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\r\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\b\u00A2\u0006\u0004\b\r\u0010\u000EJ)\u0010\u0010\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\b0\u000FH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0018\u001A\u00020\u00162!\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0081\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001C\u001A\u00020\u001626\u0010\u0017\u001A2\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\u00160\u001AH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ6\u0010\u001E\u001A\u00020\u00162!\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00160\u0012H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u0019J6\u0010\u001F\u001A\u00020\u00162!\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020\u00160\u0012H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\u0019J-\u0010!\u001A\u00020\u00022\u0018\u0010 \u001A\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u001AH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"J-\u0010\u0003\u001A\u00020\u00022\u0018\u0010 \u001A\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u001AH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0003\u0010\"J\r\u0010#\u001A\u00020\b\u00A2\u0006\u0004\b#\u0010$J-\u0010#\u001A\u00020\b2\u0018\u0010 \u001A\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u001AH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010%J\u0018\u0010&\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0086\u0002\u00A2\u0006\u0004\b&\u0010\'J\u0015\u0010(\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b(\u0010\'J\u0015\u0010)\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\b\u00A2\u0006\u0004\b)\u0010\'JA\u00101\u001A\u0002002\b\b\u0002\u0010+\u001A\u00020*2\b\b\u0002\u0010,\u001A\u00020*2\b\b\u0002\u0010-\u001A\u00020*2\b\b\u0002\u0010.\u001A\u00020\b2\b\b\u0002\u0010/\u001A\u00020*H\u0007\u00A2\u0006\u0004\b1\u00102J\u007F\u00101\u001A\u0002002\b\b\u0002\u0010+\u001A\u00020*2\b\b\u0002\u0010,\u001A\u00020*2\b\b\u0002\u0010-\u001A\u00020*2\b\b\u0002\u0010.\u001A\u00020\b2\b\b\u0002\u0010/\u001A\u00020*28\b\u0004\u00103\u001A2\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001B\u0012\u0004\u0012\u00020*0\u001AH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u00104J\u000F\u00105\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b5\u0010$J\u001A\u00107\u001A\u00020\u00022\b\u00106\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b7\u00108J\u000F\u00109\u001A\u000200H\u0016\u00A2\u0006\u0004\b9\u0010:J\u0017\u0010;\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0001\u00A2\u0006\u0004\b;\u0010\u000BR\u001C\u0010=\u001A\u00020<8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\b=\u0010>\u0012\u0004\b?\u0010@R\u001C\u0010B\u001A\u00020A8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010@R\u001C\u0010E\u001A\u00020A8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bE\u0010C\u0012\u0004\bF\u0010@R\u001C\u0010G\u001A\u00020\b8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010@R\u001C\u0010J\u001A\u00020\b8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bJ\u0010H\u0012\u0004\bK\u0010@R\u0011\u0010M\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\bL\u0010$R\u0011\u0010O\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\bN\u0010$\u0082\u0001\u0001P\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006Q"}, d2 = {"Landroidx/collection/IntIntMap;", "", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", "", "key", "get", "(I)I", "defaultValue", "getOrDefault", "(II)I", "Lkotlin/Function0;", "getOrElse", "(ILkotlin/jvm/functions/Function0;)I", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "block", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "value", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "forEachKey", "forEachValue", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "contains", "(I)Z", "containsKey", "containsValue", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "findKeyIndex", "", "metadata", "[J", "getMetadata$annotations", "()V", "", "keys", "[I", "getKeys$annotations", "values", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableIntIntMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/IntIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,1031:1\n357#1,6:1034\n367#1,3:1041\n370#1,9:1045\n357#1,6:1054\n367#1,3:1061\n370#1,9:1065\n357#1,6:1074\n367#1,3:1081\n370#1,9:1085\n385#1,4:1094\n357#1,6:1098\n367#1,3:1105\n370#1,2:1109\n389#1,2:1111\n373#1,6:1113\n391#1:1119\n385#1,4:1120\n357#1,6:1124\n367#1,3:1131\n370#1,2:1135\n389#1,2:1137\n373#1,6:1139\n391#1:1145\n385#1,4:1146\n357#1,6:1150\n367#1,3:1157\n370#1,2:1161\n389#1,2:1163\n373#1,6:1165\n391#1:1171\n410#1,3:1172\n357#1,6:1175\n367#1,3:1182\n370#1,2:1186\n413#1,2:1188\n373#1,6:1190\n415#1:1196\n385#1,4:1197\n357#1,6:1201\n367#1,3:1208\n370#1,2:1212\n389#1,2:1214\n373#1,6:1216\n391#1:1222\n385#1,4:1223\n357#1,6:1227\n367#1,3:1234\n370#1,2:1238\n389#1,2:1240\n373#1,6:1242\n391#1:1248\n385#1,4:1249\n357#1,6:1253\n367#1,3:1260\n370#1,2:1264\n389#1,2:1266\n373#1,6:1268\n391#1:1274\n385#1,4:1275\n357#1,6:1279\n367#1,3:1286\n370#1,2:1290\n389#1,2:1292\n373#1,6:1294\n391#1:1300\n385#1,4:1301\n357#1,6:1305\n367#1,3:1312\n370#1,2:1316\n389#1,2:1318\n373#1,6:1320\n391#1:1326\n385#1,4:1327\n357#1,6:1331\n367#1,3:1338\n370#1,2:1342\n389#1,2:1344\n373#1,6:1346\n391#1:1352\n519#1,11:1369\n385#1,4:1380\n357#1,6:1384\n367#1,3:1391\n370#1,2:1395\n389#1:1397\n530#1,10:1398\n390#1:1408\n373#1,6:1409\n391#1:1415\n540#1,2:1416\n519#1,11:1418\n385#1,4:1429\n357#1,6:1433\n367#1,3:1440\n370#1,2:1444\n389#1:1446\n530#1,10:1447\n390#1:1457\n373#1,6:1458\n391#1:1464\n540#1,2:1465\n519#1,11:1467\n385#1,4:1478\n357#1,6:1482\n367#1,3:1489\n370#1,2:1493\n389#1:1495\n530#1,10:1496\n390#1:1506\n373#1,6:1507\n391#1:1513\n540#1,2:1514\n519#1,11:1516\n385#1,4:1527\n357#1,6:1531\n367#1,3:1538\n370#1,2:1542\n389#1:1544\n530#1,10:1545\n390#1:1555\n373#1,6:1556\n391#1:1562\n540#1,2:1563\n519#1,11:1565\n385#1,4:1576\n357#1,6:1580\n367#1,3:1587\n370#1,2:1591\n389#1:1593\n530#1,10:1594\n390#1:1604\n373#1,6:1605\n391#1:1611\n540#1,2:1612\n1810#2:1032\n1672#2:1033\n1810#2:1040\n1672#2:1044\n1810#2:1060\n1672#2:1064\n1810#2:1080\n1672#2:1084\n1810#2:1104\n1672#2:1108\n1810#2:1130\n1672#2:1134\n1810#2:1156\n1672#2:1160\n1810#2:1181\n1672#2:1185\n1810#2:1207\n1672#2:1211\n1810#2:1233\n1672#2:1237\n1810#2:1259\n1672#2:1263\n1810#2:1285\n1672#2:1289\n1810#2:1311\n1672#2:1315\n1810#2:1337\n1672#2:1341\n1603#2:1356\n1599#2:1357\n1779#2,3:1358\n1793#2,3:1361\n1717#2:1364\n1705#2:1365\n1699#2:1366\n1712#2:1367\n1802#2:1368\n1810#2:1390\n1672#2:1394\n1810#2:1439\n1672#2:1443\n1810#2:1488\n1672#2:1492\n1810#2:1537\n1672#2:1541\n1810#2:1586\n1672#2:1590\n833#3,3:1353\n*S KotlinDebug\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/IntIntMap\n*L\n388#1:1034,6\n388#1:1041,3\n388#1:1045,9\n400#1:1054,6\n400#1:1061,3\n400#1:1065,9\n412#1:1074,6\n412#1:1081,3\n412#1:1085,9\n421#1:1094,4\n421#1:1098,6\n421#1:1105,3\n421#1:1109,2\n421#1:1111,2\n421#1:1113,6\n421#1:1119\n431#1:1120,4\n431#1:1124,6\n431#1:1131,3\n431#1:1135,2\n431#1:1137,2\n431#1:1139,6\n431#1:1145\n447#1:1146,4\n447#1:1150,6\n447#1:1157,3\n447#1:1161,2\n447#1:1163,2\n447#1:1165,6\n447#1:1171\n470#1:1172,3\n470#1:1175,6\n470#1:1182,3\n470#1:1186,2\n470#1:1188,2\n470#1:1190,6\n470#1:1196\n494#1:1197,4\n494#1:1201,6\n494#1:1208,3\n494#1:1212,2\n494#1:1214,2\n494#1:1216,6\n494#1:1222\n529#1:1223,4\n529#1:1227,6\n529#1:1234,3\n529#1:1238,2\n529#1:1240,2\n529#1:1242,6\n529#1:1248\n529#1:1249,4\n529#1:1253,6\n529#1:1260,3\n529#1:1264,2\n529#1:1266,2\n529#1:1268,6\n529#1:1274\n550#1:1275,4\n550#1:1279,6\n550#1:1286,3\n550#1:1290,2\n550#1:1292,2\n550#1:1294,6\n550#1:1300\n576#1:1301,4\n576#1:1305,6\n576#1:1312,3\n576#1:1316,2\n576#1:1318,2\n576#1:1320,6\n576#1:1326\n598#1:1327,4\n598#1:1331,6\n598#1:1338,3\n598#1:1342,2\n598#1:1344,2\n598#1:1346,6\n598#1:1352\n-1#1:1369,11\n-1#1:1380,4\n-1#1:1384,6\n-1#1:1391,3\n-1#1:1395,2\n-1#1:1397\n-1#1:1398,10\n-1#1:1408\n-1#1:1409,6\n-1#1:1415\n-1#1:1416,2\n-1#1:1418,11\n-1#1:1429,4\n-1#1:1433,6\n-1#1:1440,3\n-1#1:1444,2\n-1#1:1446\n-1#1:1447,10\n-1#1:1457\n-1#1:1458,6\n-1#1:1464\n-1#1:1465,2\n-1#1:1467,11\n-1#1:1478,4\n-1#1:1482,6\n-1#1:1489,3\n-1#1:1493,2\n-1#1:1495\n-1#1:1496,10\n-1#1:1506\n-1#1:1507,6\n-1#1:1513\n-1#1:1514,2\n-1#1:1516,11\n-1#1:1527,4\n-1#1:1531,6\n-1#1:1538,3\n-1#1:1542,2\n-1#1:1544\n-1#1:1545,10\n-1#1:1555\n-1#1:1556,6\n-1#1:1562\n-1#1:1563,2\n-1#1:1565,11\n-1#1:1576,4\n-1#1:1580,6\n-1#1:1587,3\n-1#1:1591,2\n-1#1:1593\n-1#1:1594,10\n-1#1:1604\n-1#1:1605,6\n-1#1:1611\n-1#1:1612,2\n362#1:1032\n369#1:1033\n388#1:1040\n388#1:1044\n400#1:1060\n400#1:1064\n412#1:1080\n412#1:1084\n421#1:1104\n421#1:1108\n431#1:1130\n431#1:1134\n447#1:1156\n447#1:1160\n470#1:1181\n470#1:1185\n494#1:1207\n494#1:1211\n529#1:1233\n529#1:1237\n529#1:1259\n529#1:1263\n550#1:1285\n550#1:1289\n576#1:1311\n576#1:1315\n598#1:1337\n598#1:1341\n618#1:1356\n621#1:1357\n625#1:1358,3\n626#1:1361,3\n627#1:1364\n628#1:1365\n628#1:1366\n632#1:1367\n635#1:1368\n-1#1:1390\n-1#1:1394\n-1#1:1439\n-1#1:1443\n-1#1:1488\n-1#1:1492\n-1#1:1537\n-1#1:1541\n-1#1:1586\n-1#1:1590\n617#1:1353,3\n*E\n"})
public abstract class IntIntMap {
    @JvmField
    public int _capacity;
    @JvmField
    public int _size;
    @JvmField
    @NotNull
    public int[] keys;
    @JvmField
    @NotNull
    public long[] metadata;
    @JvmField
    @NotNull
    public int[] values;

    public IntIntMap(DefaultConstructorMarker defaultConstructorMarker0) {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = IntSetKt.getEmptyIntArray();
    }

    public final boolean all(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(!((Boolean)function20.invoke(((int)arr_v[v5]), ((int)arr_v1[v5]))).booleanValue()) {
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
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(((Boolean)function20.invoke(((int)arr_v[v5]), ((int)arr_v1[v5]))).booleanValue()) {
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

    public final boolean contains(int v) {
        return this.findKeyIndex(v) >= 0;
    }

    public final boolean containsKey(int v) {
        return this.findKeyIndex(v) >= 0;
    }

    public final boolean containsValue(int v) {
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v2];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L && v == arr_v[(v2 << 3) + v5]) {
                            return true;
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_16;
                    }
                    break;
                }
            label_16:
                if(v2 == v1) {
                    break;
                }
                ++v2;
            }
        }
        return false;
    }

    public final int count() {
        return this.getSize();
    }

    public final int count(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            if(((Boolean)function20.invoke(((int)arr_v[v6]), ((int)arr_v1[v6]))).booleanValue()) {
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
        if(!(object0 instanceof IntIntMap)) {
            return false;
        }
        if(((IntIntMap)object0).getSize() != this.getSize()) {
            return false;
        }
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(arr_v1[v5] != ((IntIntMap)object0).get(arr_v[v5])) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_25;
                    }
                    break;
                }
            label_25:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    @PublishedApi
    public final int findKeyIndex(int v) {
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
                if(this.keys[v9] == v) {
                    return v9;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final void forEach(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            function20.invoke(((int)arr_v[v5]), ((int)arr_v1[v5]));
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
        int[] arr_v = this.keys;
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
                            function10.invoke(((int)arr_v[(v1 << 3) + v4]));
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
        int[] arr_v = this.values;
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
                            function10.invoke(((int)arr_v[(v1 << 3) + v4]));
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

    public final int get(int v) {
        int v1 = this.findKeyIndex(v);
        if(v1 < 0) {
            throw new NoSuchElementException("Cannot find value for key " + v);
        }
        return this.values[v1];
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

    public final int getOrDefault(int v, int v1) {
        int v2 = this.findKeyIndex(v);
        return v2 < 0 ? v1 : this.values[v2];
    }

    public final int getOrElse(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        int v1 = this.findKeyIndex(v);
        return v1 >= 0 ? this.values[v1] : ((Number)function00.invoke()).intValue();
    }

    public final int getSize() {
        return this._size;
    }

    @PublishedApi
    public static void getValues$annotations() {
    }

    public static void get_capacity$collection$annotations() {
    }

    public static void get_size$collection$annotations() {
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            v2 += arr_v1[v6] ^ arr_v[v6];
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
        return IntIntMap.joinToString$default(this, null, null, null, 0, null, 0x1F, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        return IntIntMap.joinToString$default(this, charSequence0, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return IntIntMap.joinToString$default(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return IntIntMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return IntIntMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3) {
        int[] arr_v4;
        int[] arr_v3;
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.r(charSequence2, "postfix", charSequence3, "truncated", charSequence1);
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v1 = arr_v2.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v2[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v4 = arr_v;
                    goto label_40;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        int v8 = arr_v[v7];
                        int v9 = arr_v1[v7];
                        arr_v3 = arr_v;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_47;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(v8);
                        stringBuilder0.append('=');
                        stringBuilder0.append(v9);
                        ++v3;
                    }
                    else {
                        arr_v3 = arr_v;
                    }
                    v4 >>= 8;
                    ++v6;
                    arr_v = arr_v3;
                }
                arr_v4 = arr_v;
                if(v5 == 8) {
                label_40:
                    if(v2 != v1) {
                        ++v2;
                        arr_v = arr_v4;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_47;
            }
        }
        stringBuilder0.append(charSequence2);
    label_47:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        StringBuilder stringBuilder0 = q.t(charSequence3, "truncated", function20, "transform", charSequence1);
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v1 = arr_v2.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v2[v2];
                int v5 = v2;
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_34;
                }
                int v6 = 8 - (~(v5 - v1) >>> 0x1F);
                int v7 = 0;
                while(v7 < v6) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v8 = (v5 << 3) + v7;
                        int v9 = arr_v[v8];
                        int v10 = arr_v1[v8];
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_40;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v9, v10)));
                        ++v3;
                    }
                    v4 >>= 8;
                    ++v7;
                }
                if(v6 == 8) {
                label_34:
                    if(v5 != v1) {
                        v2 = v5 + 1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_40;
            }
        }
        stringBuilder0.append(charSequence2);
    label_40:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.t(charSequence2, "postfix", function20, "transform", charSequence1);
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v1 = arr_v2.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v2[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        int v8 = arr_v[v7];
                        int v9 = arr_v1[v7];
                        if(v3 == v) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v8, v9)));
                        ++v3;
                    }
                    v4 >>= 8;
                    ++v6;
                }
                if(v5 == 8) {
                label_32:
                    if(v2 != v1) {
                        ++v2;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_38;
            }
        }
        stringBuilder0.append(charSequence2);
    label_38:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.t(charSequence2, "postfix", function20, "transform", charSequence1);
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        int v7 = arr_v[v6];
                        int v8 = arr_v1[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v7, v8)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_32:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence2);
                }
                goto label_38;
            }
        }
        stringBuilder0.append(charSequence2);
    label_38:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        StringBuilder stringBuilder0 = q.t(charSequence1, "prefix", function20, "transform", charSequence1);
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_31;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        int v7 = arr_v[v6];
                        int v8 = arr_v1[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_37;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v7, v8)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_31:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_37;
            }
        }
        stringBuilder0.append("");
    label_37:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(function20, "transform");
        StringBuilder stringBuilder0 = new StringBuilder("");
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        int v7 = arr_v[v6];
                        int v8 = arr_v1[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v7, v8)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_32:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_38;
            }
        }
        stringBuilder0.append("");
    label_38:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "transform");
        StringBuilder stringBuilder0 = new StringBuilder("");
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_31;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        int v7 = arr_v[v6];
                        int v8 = arr_v1[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_37;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v7, v8)));
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_31:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("");
                }
                goto label_37;
            }
        }
        stringBuilder0.append("");
    label_37:
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static String joinToString$default(IntIntMap intIntMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
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
        return intIntMap0.joinToString(charSequence0, charSequence5, charSequence4, v, charSequence3);
    }

    public static String joinToString$default(IntIntMap intIntMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function2 function20, int v1, Object object0) {
        long[] arr_v4;
        long[] arr_v3;
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
        StringBuilder stringBuilder0 = q.t(charSequence7, "truncated", function20, "transform", charSequence6);
        int[] arr_v = intIntMap0.keys;
        int[] arr_v1 = intIntMap0.values;
        long[] arr_v2 = intIntMap0.metadata;
        int v2 = arr_v2.length - 2;
        if(v2 >= 0) {
            int v3 = 0;
            int v4 = 0;
            while(true) {
                long v5 = arr_v2[v3];
                int v6 = v3;
                if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v4 = arr_v2;
                    goto label_56;
                }
                int v7 = 8 - (~(v6 - v2) >>> 0x1F);
                int v8 = 0;
                while(v8 < v7) {
                    if((v5 & 0xFFL) < 0x80L) {
                        int v9 = (v6 << 3) + v8;
                        int v10 = arr_v[v9];
                        int v11 = arr_v1[v9];
                        if(v4 == ((v1 & 8) == 0 ? v : -1)) {
                            stringBuilder0.append(charSequence7);
                            goto label_63;
                        }
                        if(v4 != 0) {
                            stringBuilder0.append(charSequence4);
                        }
                        arr_v3 = arr_v2;
                        stringBuilder0.append(((CharSequence)function20.invoke(v10, v11)));
                        ++v4;
                    }
                    else {
                        arr_v3 = arr_v2;
                    }
                    v5 >>= 8;
                    ++v8;
                    arr_v2 = arr_v3;
                }
                arr_v4 = arr_v2;
                if(v7 == 8) {
                label_56:
                    if(v6 != v2) {
                        v3 = v6 + 1;
                        arr_v2 = arr_v4;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append(charSequence5);
                }
                goto label_63;
            }
        }
        stringBuilder0.append(charSequence5);
    label_63:
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
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder("{");
        int[] arr_v = this.keys;
        int[] arr_v1 = this.values;
        long[] arr_v2 = this.metadata;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            int v7 = arr_v[v6];
                            int v8 = arr_v1[v6];
                            stringBuilder0.append(v7);
                            stringBuilder0.append("=");
                            stringBuilder0.append(v8);
                            ++v2;
                            if(v2 < this._size) {
                                stringBuilder0.append(", ");
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_29;
                    }
                    break;
                }
            label_29:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return q.l('}', "s.append(\'}\').toString()", stringBuilder0);
    }
}

