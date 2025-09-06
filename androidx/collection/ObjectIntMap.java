package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0007\u0010\u0005J\r\u0010\b\u001A\u00020\u0003\u00A2\u0006\u0004\b\b\u0010\u0005J\u0018\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\n\u00A2\u0006\u0004\b\u000E\u0010\u000FJ)\u0010\u0011\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u00002\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0019\u001A\u00020\u00172!\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\u0081\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJK\u0010\u001D\u001A\u00020\u001726\u0010\u0018\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\u00170\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ6\u0010\u001F\u001A\u00020\u00172!\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\u001AJ6\u0010 \u001A\u00020\u00172!\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u001AJ-\u0010\"\u001A\u00020\u00032\u0018\u0010!\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#J-\u0010\u0004\u001A\u00020\u00032\u0018\u0010!\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010#J\r\u0010$\u001A\u00020\n\u00A2\u0006\u0004\b$\u0010%J-\u0010$\u001A\u00020\n2\u0018\u0010!\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010&J\u0018\u0010\'\u001A\u00020\u00032\u0006\u0010\t\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0004\b\'\u0010(J\u0015\u0010)\u001A\u00020\u00032\u0006\u0010\t\u001A\u00028\u0000\u00A2\u0006\u0004\b)\u0010(J\u0015\u0010*\u001A\u00020\u00032\u0006\u0010\u001C\u001A\u00020\n\u00A2\u0006\u0004\b*\u0010+JA\u00103\u001A\u0002022\b\b\u0002\u0010-\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020,2\b\b\u0002\u0010/\u001A\u00020,2\b\b\u0002\u00100\u001A\u00020\n2\b\b\u0002\u00101\u001A\u00020,H\u0007\u00A2\u0006\u0004\b3\u00104J\u007F\u00103\u001A\u0002022\b\b\u0002\u0010-\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020,2\b\b\u0002\u0010/\u001A\u00020,2\b\b\u0002\u00100\u001A\u00020\n2\b\b\u0002\u00101\u001A\u00020,28\b\u0004\u00105\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020,0\u001BH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00106J\u000F\u00107\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b7\u0010%J\u001A\u00109\u001A\u00020\u00032\b\u00108\u001A\u0004\u0018\u00010\u0002H\u0096\u0002\u00A2\u0006\u0004\b9\u0010(J\u000F\u0010:\u001A\u000202H\u0016\u00A2\u0006\u0004\b:\u0010;J\u0017\u0010<\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000H\u0001\u00A2\u0006\u0004\b<\u0010\fR\u001C\u0010>\u001A\u00020=8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010AR$\u0010C\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020B8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u0010AR\u001C\u0010G\u001A\u00020F8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010AR\u001C\u0010J\u001A\u00020\n8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010AR\u001C\u0010M\u001A\u00020\n8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bM\u0010K\u0012\u0004\bN\u0010AR\u0011\u0010P\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\bO\u0010%R\u0011\u0010R\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\bQ\u0010%\u0082\u0001\u0001S\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006T"}, d2 = {"Landroidx/collection/ObjectIntMap;", "K", "", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", "key", "", "get", "(Ljava/lang/Object;)I", "defaultValue", "getOrDefault", "(Ljava/lang/Object;I)I", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)I", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "block", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "value", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "forEachKey", "forEachValue", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "(I)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "findKeyIndex", "", "metadata", "[J", "getMetadata$annotations", "()V", "", "keys", "[Ljava/lang/Object;", "getKeys$annotations", "", "values", "[I", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableObjectIntMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1058:1\n373#1,6:1061\n383#1,3:1068\n386#1,9:1072\n373#1,6:1081\n383#1,3:1088\n386#1,9:1092\n373#1,6:1101\n383#1,3:1108\n386#1,9:1112\n401#1,4:1121\n373#1,6:1125\n383#1,3:1132\n386#1,2:1136\n406#1,2:1138\n389#1,6:1140\n408#1:1146\n401#1,4:1147\n373#1,6:1151\n383#1,3:1158\n386#1,2:1162\n406#1,2:1164\n389#1,6:1166\n408#1:1172\n401#1,4:1173\n373#1,6:1177\n383#1,3:1184\n386#1,2:1188\n406#1,2:1190\n389#1,6:1192\n408#1:1198\n428#1,3:1199\n373#1,6:1202\n383#1,3:1209\n386#1,2:1213\n431#1,2:1215\n389#1,6:1217\n433#1:1223\n401#1,4:1224\n373#1,6:1228\n383#1,3:1235\n386#1,2:1239\n406#1,2:1241\n389#1,6:1243\n408#1:1249\n401#1,4:1250\n373#1,6:1254\n383#1,3:1261\n386#1,2:1265\n406#1,2:1267\n389#1,6:1269\n408#1:1275\n401#1,4:1276\n373#1,6:1280\n383#1,3:1287\n386#1,2:1291\n406#1,2:1293\n389#1,6:1295\n408#1:1301\n401#1,4:1302\n373#1,6:1306\n383#1,3:1313\n386#1,2:1317\n406#1,2:1319\n389#1,6:1321\n408#1:1327\n401#1,4:1328\n373#1,6:1332\n383#1,3:1339\n386#1,2:1343\n406#1,2:1345\n389#1,6:1347\n408#1:1353\n401#1,4:1354\n373#1,6:1358\n383#1,3:1365\n386#1,2:1369\n406#1,2:1371\n389#1,6:1373\n408#1:1379\n537#1,11:1396\n401#1,4:1407\n373#1,6:1411\n383#1,3:1418\n386#1,2:1422\n406#1:1424\n548#1,10:1425\n407#1:1435\n389#1,6:1436\n408#1:1442\n558#1,2:1443\n537#1,11:1445\n401#1,4:1456\n373#1,6:1460\n383#1,3:1467\n386#1,2:1471\n406#1:1473\n548#1,10:1474\n407#1:1484\n389#1,6:1485\n408#1:1491\n558#1,2:1492\n537#1,11:1494\n401#1,4:1505\n373#1,6:1509\n383#1,3:1516\n386#1,2:1520\n406#1:1522\n548#1,10:1523\n407#1:1533\n389#1,6:1534\n408#1:1540\n558#1,2:1541\n537#1,11:1543\n401#1,4:1554\n373#1,6:1558\n383#1,3:1565\n386#1,2:1569\n406#1:1571\n548#1,10:1572\n407#1:1582\n389#1,6:1583\n408#1:1589\n558#1,2:1590\n537#1,11:1592\n401#1,4:1603\n373#1,6:1607\n383#1,3:1614\n386#1,2:1618\n406#1:1620\n548#1,10:1621\n407#1:1631\n389#1,6:1632\n408#1:1638\n558#1,2:1639\n1810#2:1059\n1672#2:1060\n1810#2:1067\n1672#2:1071\n1810#2:1087\n1672#2:1091\n1810#2:1107\n1672#2:1111\n1810#2:1131\n1672#2:1135\n1810#2:1157\n1672#2:1161\n1810#2:1183\n1672#2:1187\n1810#2:1208\n1672#2:1212\n1810#2:1234\n1672#2:1238\n1810#2:1260\n1672#2:1264\n1810#2:1286\n1672#2:1290\n1810#2:1312\n1672#2:1316\n1810#2:1338\n1672#2:1342\n1810#2:1364\n1672#2:1368\n1589#2,3:1380\n1603#2:1383\n1599#2:1384\n1779#2,3:1385\n1793#2,3:1388\n1717#2:1391\n1705#2:1392\n1699#2:1393\n1712#2:1394\n1802#2:1395\n1810#2:1417\n1672#2:1421\n1810#2:1466\n1672#2:1470\n1810#2:1515\n1672#2:1519\n1810#2:1564\n1672#2:1568\n1810#2:1613\n1672#2:1617\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n404#1:1061,6\n404#1:1068,3\n404#1:1072,9\n417#1:1081,6\n417#1:1088,3\n417#1:1092,9\n430#1:1101,6\n430#1:1108,3\n430#1:1112,9\n439#1:1121,4\n439#1:1125,6\n439#1:1132,3\n439#1:1136,2\n439#1:1138,2\n439#1:1140,6\n439#1:1146\n449#1:1147,4\n449#1:1151,6\n449#1:1158,3\n449#1:1162,2\n449#1:1164,2\n449#1:1166,6\n449#1:1172\n465#1:1173,4\n465#1:1177,6\n465#1:1184,3\n465#1:1188,2\n465#1:1190,2\n465#1:1192,6\n465#1:1198\n488#1:1199,3\n488#1:1202,6\n488#1:1209,3\n488#1:1213,2\n488#1:1215,2\n488#1:1217,6\n488#1:1223\n512#1:1224,4\n512#1:1228,6\n512#1:1235,3\n512#1:1239,2\n512#1:1241,2\n512#1:1243,6\n512#1:1249\n547#1:1250,4\n547#1:1254,6\n547#1:1261,3\n547#1:1265,2\n547#1:1267,2\n547#1:1269,6\n547#1:1275\n547#1:1276,4\n547#1:1280,6\n547#1:1287,3\n547#1:1291,2\n547#1:1293,2\n547#1:1295,6\n547#1:1301\n568#1:1302,4\n568#1:1306,6\n568#1:1313,3\n568#1:1317,2\n568#1:1319,2\n568#1:1321,6\n568#1:1327\n597#1:1328,4\n597#1:1332,6\n597#1:1339,3\n597#1:1343,2\n597#1:1345,2\n597#1:1347,6\n597#1:1353\n619#1:1354,4\n619#1:1358,6\n619#1:1365,3\n619#1:1369,2\n619#1:1371,2\n619#1:1373,6\n619#1:1379\n-1#1:1396,11\n-1#1:1407,4\n-1#1:1411,6\n-1#1:1418,3\n-1#1:1422,2\n-1#1:1424\n-1#1:1425,10\n-1#1:1435\n-1#1:1436,6\n-1#1:1442\n-1#1:1443,2\n-1#1:1445,11\n-1#1:1456,4\n-1#1:1460,6\n-1#1:1467,3\n-1#1:1471,2\n-1#1:1473\n-1#1:1474,10\n-1#1:1484\n-1#1:1485,6\n-1#1:1491\n-1#1:1492,2\n-1#1:1494,11\n-1#1:1505,4\n-1#1:1509,6\n-1#1:1516,3\n-1#1:1520,2\n-1#1:1522\n-1#1:1523,10\n-1#1:1533\n-1#1:1534,6\n-1#1:1540\n-1#1:1541,2\n-1#1:1543,11\n-1#1:1554,4\n-1#1:1558,6\n-1#1:1565,3\n-1#1:1569,2\n-1#1:1571\n-1#1:1572,10\n-1#1:1582\n-1#1:1583,6\n-1#1:1589\n-1#1:1590,2\n-1#1:1592,11\n-1#1:1603,4\n-1#1:1607,6\n-1#1:1614,3\n-1#1:1618,2\n-1#1:1620\n-1#1:1621,10\n-1#1:1631\n-1#1:1632,6\n-1#1:1638\n-1#1:1639,2\n378#1:1059\n385#1:1060\n404#1:1067\n404#1:1071\n417#1:1087\n417#1:1091\n430#1:1107\n430#1:1111\n439#1:1131\n439#1:1135\n449#1:1157\n449#1:1161\n465#1:1183\n465#1:1187\n488#1:1208\n488#1:1212\n512#1:1234\n512#1:1238\n547#1:1260\n547#1:1264\n547#1:1286\n547#1:1290\n568#1:1312\n568#1:1316\n597#1:1338\n597#1:1342\n619#1:1364\n619#1:1368\n638#1:1380,3\n639#1:1383\n642#1:1384\n646#1:1385,3\n647#1:1388,3\n648#1:1391\n649#1:1392\n649#1:1393\n653#1:1394\n656#1:1395\n-1#1:1417\n-1#1:1421\n-1#1:1466\n-1#1:1470\n-1#1:1515\n-1#1:1519\n-1#1:1564\n-1#1:1568\n-1#1:1613\n-1#1:1617\n*E\n"})
public abstract class ObjectIntMap {
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
    public int[] values;

    public ObjectIntMap(DefaultConstructorMarker defaultConstructorMarker0) {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = IntSetKt.getEmptyIntArray();
    }

    public final boolean all(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        Object[] arr_object = this.keys;
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
                            int v5 = (v1 << 3) + v4;
                            if(!((Boolean)function20.invoke(arr_object[v5], ((int)arr_v[v5]))).booleanValue()) {
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
                            int v5 = (v1 << 3) + v4;
                            if(((Boolean)function20.invoke(arr_object[v5], ((int)arr_v[v5]))).booleanValue()) {
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

    public final boolean contains(Object object0) {
        return this.findKeyIndex(object0) >= 0;
    }

    public final boolean containsKey(Object object0) {
        return this.findKeyIndex(object0) >= 0;
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
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
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
                            int v6 = (v1 << 3) + v5;
                            if(((Boolean)function20.invoke(arr_object[v6], ((int)arr_v[v6]))).booleanValue()) {
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
        if(!(object0 instanceof ObjectIntMap)) {
            return false;
        }
        if(((ObjectIntMap)object0).getSize() != this.getSize()) {
            return false;
        }
        Object[] arr_object = this.keys;
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
                            int v5 = (v1 << 3) + v4;
                            if(arr_v[v5] != ((ObjectIntMap)object0).get(arr_object[v5])) {
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
    public final int findKeyIndex(Object object0) {
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
                            int v5 = (v1 << 3) + v4;
                            function20.invoke(arr_object[v5], ((int)arr_v[v5]));
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

    public final int get(Object object0) {
        int v = this.findKeyIndex(object0);
        if(v < 0) {
            throw new NoSuchElementException("There is no key " + object0 + " in the map");
        }
        return this.values[v];
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

    public final int getOrDefault(Object object0, int v) {
        int v1 = this.findKeyIndex(object0);
        return v1 < 0 ? v : this.values[v1];
    }

    public final int getOrElse(Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        int v = this.findKeyIndex(object0);
        return v < 0 ? ((Number)function00.invoke()).intValue() : this.values[v];
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
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
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
                            int v6 = (v1 << 3) + v5;
                            Object object0 = arr_object[v6];
                            v2 += arr_v[v6] ^ (object0 == null ? 0 : object0.hashCode());
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
        return ObjectIntMap.joinToString$default(this, null, null, null, 0, null, 0x1F, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        return ObjectIntMap.joinToString$default(this, charSequence0, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return ObjectIntMap.joinToString$default(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return ObjectIntMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return ObjectIntMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3) {
        Object[] arr_object2;
        Object[] arr_object1;
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.r(charSequence2, "postfix", charSequence3, "truncated", charSequence1);
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_object2 = arr_object;
                    goto label_40;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        Object object0 = arr_object[v7];
                        int v8 = arr_v[v7];
                        arr_object1 = arr_object;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_47;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(object0);
                        stringBuilder0.append('=');
                        stringBuilder0.append(v8);
                        ++v3;
                    }
                    else {
                        arr_object1 = arr_object;
                    }
                    v4 >>= 8;
                    ++v6;
                    arr_object = arr_object1;
                }
                arr_object2 = arr_object;
                if(v5 == 8) {
                label_40:
                    if(v2 != v1) {
                        ++v2;
                        arr_object = arr_object2;
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
        Object[] arr_object2;
        Object[] arr_object1;
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        StringBuilder stringBuilder0 = q.t(charSequence3, "truncated", function20, "transform", charSequence1);
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                int v5 = v2;
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_object2 = arr_object;
                    goto label_40;
                }
                int v6 = 8 - (~(v5 - v1) >>> 0x1F);
                int v7 = 0;
                while(v7 < v6) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v8 = (v5 << 3) + v7;
                        Object object0 = arr_object[v8];
                        int v9 = arr_v[v8];
                        arr_object1 = arr_object;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_47;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(object0, v9)));
                        ++v3;
                    }
                    else {
                        arr_object1 = arr_object;
                    }
                    v4 >>= 8;
                    ++v7;
                    arr_object = arr_object1;
                }
                arr_object2 = arr_object;
                if(v6 == 8) {
                label_40:
                    if(v5 != v1) {
                        v2 = v5 + 1;
                        arr_object = arr_object2;
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
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.t(charSequence2, "postfix", function20, "transform", charSequence1);
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        Object object0 = arr_object[v7];
                        int v8 = arr_v[v7];
                        if(v3 == v) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(object0, v8)));
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
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        Object object0 = arr_object[v6];
                        int v7 = arr_v[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(object0, v7)));
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
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_31;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        Object object0 = arr_object[v6];
                        int v7 = arr_v[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_37;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(object0, v7)));
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
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_32;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        Object object0 = arr_object[v6];
                        int v7 = arr_v[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(object0, v7)));
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
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_31;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((v3 & 0xFFL) < 0x80L) {
                        int v6 = (v1 << 3) + v5;
                        Object object0 = arr_object[v6];
                        int v7 = arr_v[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_37;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(object0, v7)));
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

    public static String joinToString$default(ObjectIntMap objectIntMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
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
        return objectIntMap0.joinToString(charSequence0, charSequence5, charSequence4, v, charSequence3);
    }

    public static String joinToString$default(ObjectIntMap objectIntMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function2 function20, int v1, Object object0) {
        long[] arr_v3;
        long[] arr_v2;
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
        Object[] arr_object = objectIntMap0.keys;
        int[] arr_v = objectIntMap0.values;
        long[] arr_v1 = objectIntMap0.metadata;
        int v2 = arr_v1.length - 2;
        if(v2 >= 0) {
            int v3 = 0;
            int v4 = 0;
            while(true) {
                long v5 = arr_v1[v3];
                int v6 = v3;
                if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v3 = arr_v1;
                    goto label_56;
                }
                int v7 = 8 - (~(v6 - v2) >>> 0x1F);
                int v8 = 0;
                while(v8 < v7) {
                    if((v5 & 0xFFL) < 0x80L) {
                        int v9 = (v6 << 3) + v8;
                        Object object1 = arr_object[v9];
                        int v10 = arr_v[v9];
                        if(v4 == ((v1 & 8) == 0 ? v : -1)) {
                            stringBuilder0.append(charSequence7);
                            goto label_63;
                        }
                        if(v4 != 0) {
                            stringBuilder0.append(charSequence4);
                        }
                        arr_v2 = arr_v1;
                        stringBuilder0.append(((CharSequence)function20.invoke(object1, v10)));
                        ++v4;
                    }
                    else {
                        arr_v2 = arr_v1;
                    }
                    v5 >>= 8;
                    ++v8;
                    arr_v1 = arr_v2;
                }
                arr_v3 = arr_v1;
                if(v7 == 8) {
                label_56:
                    if(v6 != v2) {
                        v3 = v6 + 1;
                        arr_v1 = arr_v3;
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
        Object[] arr_object = this.keys;
        int[] arr_v = this.values;
        long[] arr_v1 = this.metadata;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            String s = arr_object[v6];
                            int v7 = arr_v[v6];
                            if(s == this) {
                                s = "(this)";
                            }
                            stringBuilder0.append(s);
                            stringBuilder0.append("=");
                            stringBuilder0.append(v7);
                            ++v2;
                            if(v2 < this._size) {
                                stringBuilder0.append(", ");
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_31;
                    }
                    break;
                }
            label_31:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return q.l('}', "s.append(\'}\').toString()", stringBuilder0);
    }
}

