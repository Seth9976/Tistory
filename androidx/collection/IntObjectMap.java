package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0007\u0010\u0005J\r\u0010\b\u001A\u00020\u0003\u00A2\u0006\u0004\b\b\u0010\u0005J\u001A\u0010\u000B\u001A\u0004\u0018\u00018\u00002\u0006\u0010\n\u001A\u00020\tH\u0086\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\u00028\u00002\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\r\u001A\u00028\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ)\u0010\u0011\u001A\u00028\u00002\u0006\u0010\n\u001A\u00020\t2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0019\u001A\u00020\u00172!\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\u0081\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJK\u0010\u001D\u001A\u00020\u001726\u0010\u0018\u001A2\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\u00170\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ6\u0010\u001F\u001A\u00020\u00172!\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\u001AJ6\u0010 \u001A\u00020\u00172!\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u001AJ-\u0010\"\u001A\u00020\u00032\u0018\u0010!\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#J-\u0010\u0004\u001A\u00020\u00032\u0018\u0010!\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010#J\r\u0010$\u001A\u00020\t\u00A2\u0006\u0004\b$\u0010%J-\u0010$\u001A\u00020\t2\u0018\u0010!\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001BH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010&J\u0018\u0010\'\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\tH\u0086\u0002\u00A2\u0006\u0004\b\'\u0010(J\u0015\u0010)\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b)\u0010(J\u0015\u0010*\u001A\u00020\u00032\u0006\u0010\u001C\u001A\u00028\u0000\u00A2\u0006\u0004\b*\u0010+JA\u00103\u001A\u0002022\b\b\u0002\u0010-\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020,2\b\b\u0002\u0010/\u001A\u00020,2\b\b\u0002\u00100\u001A\u00020\t2\b\b\u0002\u00101\u001A\u00020,H\u0007\u00A2\u0006\u0004\b3\u00104J\u007F\u00103\u001A\u0002022\b\b\u0002\u0010-\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020,2\b\b\u0002\u0010/\u001A\u00020,2\b\b\u0002\u00100\u001A\u00020\t2\b\b\u0002\u00101\u001A\u00020,28\b\u0004\u00105\u001A2\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020,0\u001BH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00106J\u000F\u00107\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b7\u0010%J\u001A\u00109\u001A\u00020\u00032\b\u00108\u001A\u0004\u0018\u00010\u0002H\u0096\u0002\u00A2\u0006\u0004\b9\u0010+J\u000F\u0010:\u001A\u000202H\u0016\u00A2\u0006\u0004\b:\u0010;J\u0018\u0010>\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH\u0080\b\u00A2\u0006\u0004\b<\u0010=R\u001C\u0010@\u001A\u00020?8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\b@\u0010A\u0012\u0004\bB\u0010CR\u001C\u0010E\u001A\u00020D8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bE\u0010F\u0012\u0004\bG\u0010CR$\u0010I\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020H8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010CR\u001C\u0010L\u001A\u00020\t8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bL\u0010M\u0012\u0004\bN\u0010CR\u001C\u0010O\u001A\u00020\t8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bO\u0010M\u0012\u0004\bP\u0010CR\u0011\u0010R\u001A\u00020\t8F\u00A2\u0006\u0006\u001A\u0004\bQ\u0010%R\u0011\u0010T\u001A\u00020\t8F\u00A2\u0006\u0006\u001A\u0004\bS\u0010%\u0082\u0001\u0001U\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006V"}, d2 = {"Landroidx/collection/IntObjectMap;", "V", "", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", "", "key", "get", "(I)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "block", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "value", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "forEachKey", "forEachValue", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "contains", "(I)Z", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "findKeyIndex$collection", "(I)I", "findKeyIndex", "", "metadata", "[J", "getMetadata$annotations", "()V", "", "keys", "[I", "getKeys$annotations", "", "values", "[Ljava/lang/Object;", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableIntObjectMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 2 IntSet.kt\nandroidx/collection/IntSetKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1018:1\n619#1:1019\n620#1:1023\n622#1,2:1025\n624#1,4:1028\n628#1:1035\n629#1:1039\n630#1:1041\n631#1,4:1044\n637#1:1049\n638#1,8:1051\n619#1:1059\n620#1:1063\n622#1,2:1065\n624#1,4:1068\n628#1:1075\n629#1:1079\n630#1:1081\n631#1,4:1084\n637#1:1089\n638#1,8:1091\n354#1,6:1101\n364#1,3:1108\n367#1,9:1112\n354#1,6:1121\n364#1,3:1128\n367#1,9:1132\n354#1,6:1141\n364#1,3:1148\n367#1,9:1152\n382#1,4:1161\n354#1,6:1165\n364#1,3:1172\n367#1,2:1176\n387#1,2:1178\n370#1,6:1180\n389#1:1186\n382#1,4:1187\n354#1,6:1191\n364#1,3:1198\n367#1,2:1202\n387#1,2:1204\n370#1,6:1206\n389#1:1212\n382#1,4:1213\n354#1,6:1217\n364#1,3:1224\n367#1,2:1228\n387#1,2:1230\n370#1,6:1232\n389#1:1238\n619#1:1239\n620#1:1243\n622#1,2:1245\n624#1,4:1248\n628#1:1255\n629#1:1259\n630#1:1261\n631#1,4:1264\n637#1:1269\n638#1,8:1271\n619#1:1279\n620#1:1283\n622#1,2:1285\n624#1,4:1288\n628#1:1295\n629#1:1299\n630#1:1301\n631#1,4:1304\n637#1:1309\n638#1,8:1311\n408#1,3:1319\n354#1,6:1322\n364#1,3:1329\n367#1,2:1333\n412#1,2:1335\n370#1,6:1337\n414#1:1343\n382#1,4:1344\n354#1,6:1348\n364#1,3:1355\n367#1,2:1359\n387#1,2:1361\n370#1,6:1363\n389#1:1369\n382#1,4:1370\n354#1,6:1374\n364#1,3:1381\n367#1,2:1385\n387#1,2:1387\n370#1,6:1389\n389#1:1395\n382#1,4:1396\n354#1,6:1400\n364#1,3:1407\n367#1,2:1411\n387#1,2:1413\n370#1,6:1415\n389#1:1421\n382#1,4:1422\n354#1,6:1426\n364#1,3:1433\n367#1,2:1437\n387#1,2:1439\n370#1,6:1441\n389#1:1447\n382#1,4:1448\n354#1,6:1452\n364#1,3:1459\n367#1,2:1463\n387#1,2:1465\n370#1,6:1467\n389#1:1473\n382#1,4:1474\n354#1,6:1478\n364#1,3:1485\n367#1,2:1489\n387#1,2:1491\n370#1,6:1493\n389#1:1499\n518#1,11:1516\n382#1,4:1527\n354#1,6:1531\n364#1,3:1538\n367#1,2:1542\n387#1:1544\n529#1,10:1545\n388#1:1555\n370#1,6:1556\n389#1:1562\n539#1,2:1563\n518#1,11:1565\n382#1,4:1576\n354#1,6:1580\n364#1,3:1587\n367#1,2:1591\n387#1:1593\n529#1,10:1594\n388#1:1604\n370#1,6:1605\n389#1:1611\n539#1,2:1612\n518#1,11:1614\n382#1,4:1625\n354#1,6:1629\n364#1,3:1636\n367#1,2:1640\n387#1:1642\n529#1,10:1643\n388#1:1653\n370#1,6:1654\n389#1:1660\n539#1,2:1661\n518#1,11:1663\n382#1,4:1674\n354#1,6:1678\n364#1,3:1685\n367#1,2:1689\n387#1:1691\n529#1,10:1692\n388#1:1702\n370#1,6:1703\n389#1:1709\n539#1,2:1710\n518#1,11:1712\n382#1,4:1723\n354#1,6:1727\n364#1,3:1734\n367#1,2:1738\n387#1:1740\n529#1,10:1741\n388#1:1751\n370#1,6:1752\n389#1:1758\n539#1,2:1759\n833#2,3:1020\n833#2,3:1060\n833#2,3:1240\n833#2,3:1280\n833#2,3:1500\n1603#3:1024\n1599#3:1027\n1779#3,3:1032\n1793#3,3:1036\n1717#3:1040\n1705#3:1042\n1699#3:1043\n1712#3:1048\n1802#3:1050\n1603#3:1064\n1599#3:1067\n1779#3,3:1072\n1793#3,3:1076\n1717#3:1080\n1705#3:1082\n1699#3:1083\n1712#3:1088\n1802#3:1090\n1810#3:1099\n1672#3:1100\n1810#3:1107\n1672#3:1111\n1810#3:1127\n1672#3:1131\n1810#3:1147\n1672#3:1151\n1810#3:1171\n1672#3:1175\n1810#3:1197\n1672#3:1201\n1810#3:1223\n1672#3:1227\n1603#3:1244\n1599#3:1247\n1779#3,3:1252\n1793#3,3:1256\n1717#3:1260\n1705#3:1262\n1699#3:1263\n1712#3:1268\n1802#3:1270\n1603#3:1284\n1599#3:1287\n1779#3,3:1292\n1793#3,3:1296\n1717#3:1300\n1705#3:1302\n1699#3:1303\n1712#3:1308\n1802#3:1310\n1810#3:1328\n1672#3:1332\n1810#3:1354\n1672#3:1358\n1810#3:1380\n1672#3:1384\n1810#3:1406\n1672#3:1410\n1810#3:1432\n1672#3:1436\n1810#3:1458\n1672#3:1462\n1810#3:1484\n1672#3:1488\n1603#3:1503\n1599#3:1504\n1779#3,3:1505\n1793#3,3:1508\n1717#3:1511\n1705#3:1512\n1699#3:1513\n1712#3:1514\n1802#3:1515\n1810#3:1537\n1672#3:1541\n1810#3:1586\n1672#3:1590\n1810#3:1635\n1672#3:1639\n1810#3:1684\n1672#3:1688\n1810#3:1733\n1672#3:1737\n*S KotlinDebug\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n321#1:1019\n321#1:1023\n321#1:1025,2\n321#1:1028,4\n321#1:1035\n321#1:1039\n321#1:1041\n321#1:1044,4\n321#1:1049\n321#1:1051,8\n331#1:1059\n331#1:1063\n331#1:1065,2\n331#1:1068,4\n331#1:1075\n331#1:1079\n331#1:1081\n331#1:1084,4\n331#1:1089\n331#1:1091,8\n385#1:1101,6\n385#1:1108,3\n385#1:1112,9\n398#1:1121,6\n398#1:1128,3\n398#1:1132,9\n410#1:1141,6\n410#1:1148,3\n410#1:1152,9\n420#1:1161,4\n420#1:1165,6\n420#1:1172,3\n420#1:1176,2\n420#1:1178,2\n420#1:1180,6\n420#1:1186\n430#1:1187,4\n430#1:1191,6\n430#1:1198,3\n430#1:1202,2\n430#1:1204,2\n430#1:1206,6\n430#1:1212\n446#1:1213,4\n446#1:1217,6\n446#1:1224,3\n446#1:1228,2\n446#1:1230,2\n446#1:1232,6\n446#1:1238\n456#1:1239\n456#1:1243\n456#1:1245,2\n456#1:1248,4\n456#1:1255\n456#1:1259\n456#1:1261\n456#1:1264,4\n456#1:1269\n456#1:1271,8\n462#1:1279\n462#1:1283\n462#1:1285,2\n462#1:1288,4\n462#1:1295\n462#1:1299\n462#1:1301\n462#1:1304,4\n462#1:1309\n462#1:1311,8\n469#1:1319,3\n469#1:1322,6\n469#1:1329,3\n469#1:1333,2\n469#1:1335,2\n469#1:1337,6\n469#1:1343\n493#1:1344,4\n493#1:1348,6\n493#1:1355,3\n493#1:1359,2\n493#1:1361,2\n493#1:1363,6\n493#1:1369\n528#1:1370,4\n528#1:1374,6\n528#1:1381,3\n528#1:1385,2\n528#1:1387,2\n528#1:1389,6\n528#1:1395\n528#1:1396,4\n528#1:1400,6\n528#1:1407,3\n528#1:1411,2\n528#1:1413,2\n528#1:1415,6\n528#1:1421\n549#1:1422,4\n549#1:1426,6\n549#1:1433,3\n549#1:1437,2\n549#1:1439,2\n549#1:1441,6\n549#1:1447\n575#1:1448,4\n575#1:1452,6\n575#1:1459,3\n575#1:1463,2\n575#1:1465,2\n575#1:1467,6\n575#1:1473\n601#1:1474,4\n601#1:1478,6\n601#1:1485,3\n601#1:1489,2\n601#1:1491,2\n601#1:1493,6\n601#1:1499\n-1#1:1516,11\n-1#1:1527,4\n-1#1:1531,6\n-1#1:1538,3\n-1#1:1542,2\n-1#1:1544\n-1#1:1545,10\n-1#1:1555\n-1#1:1556,6\n-1#1:1562\n-1#1:1563,2\n-1#1:1565,11\n-1#1:1576,4\n-1#1:1580,6\n-1#1:1587,3\n-1#1:1591,2\n-1#1:1593\n-1#1:1594,10\n-1#1:1604\n-1#1:1605,6\n-1#1:1611\n-1#1:1612,2\n-1#1:1614,11\n-1#1:1625,4\n-1#1:1629,6\n-1#1:1636,3\n-1#1:1640,2\n-1#1:1642\n-1#1:1643,10\n-1#1:1653\n-1#1:1654,6\n-1#1:1660\n-1#1:1661,2\n-1#1:1663,11\n-1#1:1674,4\n-1#1:1678,6\n-1#1:1685,3\n-1#1:1689,2\n-1#1:1691\n-1#1:1692,10\n-1#1:1702\n-1#1:1703,6\n-1#1:1709\n-1#1:1710,2\n-1#1:1712,11\n-1#1:1723,4\n-1#1:1727,6\n-1#1:1734,3\n-1#1:1738,2\n-1#1:1740\n-1#1:1741,10\n-1#1:1751\n-1#1:1752,6\n-1#1:1758\n-1#1:1759,2\n321#1:1020,3\n331#1:1060,3\n456#1:1240,3\n462#1:1280,3\n619#1:1500,3\n321#1:1024\n321#1:1027\n321#1:1032,3\n321#1:1036,3\n321#1:1040\n321#1:1042\n321#1:1043\n321#1:1048\n321#1:1050\n331#1:1064\n331#1:1067\n331#1:1072,3\n331#1:1076,3\n331#1:1080\n331#1:1082\n331#1:1083\n331#1:1088\n331#1:1090\n359#1:1099\n366#1:1100\n385#1:1107\n385#1:1111\n398#1:1127\n398#1:1131\n410#1:1147\n410#1:1151\n420#1:1171\n420#1:1175\n430#1:1197\n430#1:1201\n446#1:1223\n446#1:1227\n456#1:1244\n456#1:1247\n456#1:1252,3\n456#1:1256,3\n456#1:1260\n456#1:1262\n456#1:1263\n456#1:1268\n456#1:1270\n462#1:1284\n462#1:1287\n462#1:1292,3\n462#1:1296,3\n462#1:1300\n462#1:1302\n462#1:1303\n462#1:1308\n462#1:1310\n469#1:1328\n469#1:1332\n493#1:1354\n493#1:1358\n528#1:1380\n528#1:1384\n528#1:1406\n528#1:1410\n549#1:1432\n549#1:1436\n575#1:1458\n575#1:1462\n601#1:1484\n601#1:1488\n620#1:1503\n623#1:1504\n627#1:1505,3\n628#1:1508,3\n629#1:1511\n630#1:1512\n630#1:1513\n634#1:1514\n637#1:1515\n-1#1:1537\n-1#1:1541\n-1#1:1586\n-1#1:1590\n-1#1:1635\n-1#1:1639\n-1#1:1684\n-1#1:1688\n-1#1:1733\n-1#1:1737\n*E\n"})
public abstract class IntObjectMap {
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
    public Object[] values;

    public IntObjectMap(DefaultConstructorMarker defaultConstructorMarker0) {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final boolean all(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int[] arr_v = this.keys;
        Object[] arr_object = this.values;
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
                            if(!((Boolean)function20.invoke(((int)arr_v[v5]), arr_object[v5])).booleanValue()) {
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
        Object[] arr_object = this.values;
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
                            if(((Boolean)function20.invoke(((int)arr_v[v5]), arr_object[v5])).booleanValue()) {
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

    public final boolean containsKey(int v) {
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
        int[] arr_v = this.keys;
        Object[] arr_object = this.values;
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
                            if(((Boolean)function20.invoke(((int)arr_v[v6]), arr_object[v6])).booleanValue()) {
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
        if(!(object0 instanceof IntObjectMap)) {
            return false;
        }
        if(((IntObjectMap)object0).getSize() != this.getSize()) {
            return false;
        }
        int[] arr_v = this.keys;
        Object[] arr_object = this.values;
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
                            int v6 = arr_v[v5];
                            Object object1 = arr_object[v5];
                            if(object1 == null) {
                                if(((IntObjectMap)object0).get(v6) != null || !((IntObjectMap)object0).containsKey(v6)) {
                                    return false;
                                }
                            }
                            else if(!Intrinsics.areEqual(object1, ((IntObjectMap)object0).get(v6))) {
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

    public final int findKeyIndex$collection(int v) {
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
        Object[] arr_object = this.values;
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
                            function20.invoke(((int)arr_v[v5]), arr_object[v5]);
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
    public final Object get(int v) {
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
                    return v9 < 0 ? null : this.values[v9];
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                throw new ArrayIndexOutOfBoundsException(-1);
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
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

    public final Object getOrDefault(int v, Object object0) {
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
                    return v9 < 0 ? object0 : this.values[v9];
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                throw new ArrayIndexOutOfBoundsException(-1);
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final Object getOrElse(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object0 = this.get(v);
        return object0 == null ? function00.invoke() : object0;
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
        Object[] arr_object = this.values;
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
                            int v7 = arr_v[v6];
                            Object object0 = arr_object[v6];
                            v2 += (object0 == null ? 0 : object0.hashCode()) ^ v7;
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
        return IntObjectMap.joinToString$default(this, null, null, null, 0, null, 0x1F, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        return IntObjectMap.joinToString$default(this, charSequence0, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        return IntObjectMap.joinToString$default(this, charSequence0, charSequence1, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return IntObjectMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        return IntObjectMap.joinToString$default(this, charSequence0, charSequence1, charSequence2, v, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence0, @NotNull CharSequence charSequence1, @NotNull CharSequence charSequence2, int v, @NotNull CharSequence charSequence3) {
        int[] arr_v3;
        int[] arr_v2;
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        StringBuilder stringBuilder0 = q.r(charSequence2, "postfix", charSequence3, "truncated", charSequence1);
        int[] arr_v = this.keys;
        Object[] arr_object = this.values;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v3 = arr_v;
                    goto label_40;
                }
                int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                int v6 = 0;
                while(v6 < v5) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v7 = (v2 << 3) + v6;
                        int v8 = arr_v[v7];
                        Object object0 = arr_object[v7];
                        arr_v2 = arr_v;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_47;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(v8);
                        stringBuilder0.append('=');
                        stringBuilder0.append(object0);
                        ++v3;
                    }
                    else {
                        arr_v2 = arr_v;
                    }
                    v4 >>= 8;
                    ++v6;
                    arr_v = arr_v2;
                }
                arr_v3 = arr_v;
                if(v5 == 8) {
                label_40:
                    if(v2 != v1) {
                        ++v2;
                        arr_v = arr_v3;
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
        int[] arr_v3;
        int[] arr_v2;
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        StringBuilder stringBuilder0 = q.t(charSequence3, "truncated", function20, "transform", charSequence1);
        int[] arr_v = this.keys;
        Object[] arr_object = this.values;
        long[] arr_v1 = this.metadata;
        int v1 = arr_v1.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                long v4 = arr_v1[v2];
                int v5 = v2;
                if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                    arr_v3 = arr_v;
                    goto label_40;
                }
                int v6 = 8 - (~(v5 - v1) >>> 0x1F);
                int v7 = 0;
                while(v7 < v6) {
                    if((v4 & 0xFFL) < 0x80L) {
                        int v8 = (v5 << 3) + v7;
                        int v9 = arr_v[v8];
                        Object object0 = arr_object[v8];
                        arr_v2 = arr_v;
                        if(v3 == v) {
                            stringBuilder0.append(charSequence3);
                            goto label_47;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v9, object0)));
                        ++v3;
                    }
                    else {
                        arr_v2 = arr_v;
                    }
                    v4 >>= 8;
                    ++v7;
                    arr_v = arr_v2;
                }
                arr_v3 = arr_v;
                if(v6 == 8) {
                label_40:
                    if(v5 != v1) {
                        v2 = v5 + 1;
                        arr_v = arr_v3;
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
        int[] arr_v = this.keys;
        Object[] arr_object = this.values;
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
                        int v8 = arr_v[v7];
                        Object object0 = arr_object[v7];
                        if(v3 == v) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v3 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v8, object0)));
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
        Object[] arr_object = this.values;
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
                        int v7 = arr_v[v6];
                        Object object0 = arr_object[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v7, object0)));
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
        Object[] arr_object = this.values;
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
                        int v7 = arr_v[v6];
                        Object object0 = arr_object[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_37;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v7, object0)));
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
        Object[] arr_object = this.values;
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
                        int v7 = arr_v[v6];
                        Object object0 = arr_object[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_38;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(charSequence0);
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v7, object0)));
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
        Object[] arr_object = this.values;
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
                        int v7 = arr_v[v6];
                        Object object0 = arr_object[v6];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_37;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(((CharSequence)function20.invoke(v7, object0)));
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

    public static String joinToString$default(IntObjectMap intObjectMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, int v1, Object object0) {
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
        return intObjectMap0.joinToString(charSequence0, charSequence5, charSequence4, v, charSequence3);
    }

    public static String joinToString$default(IntObjectMap intObjectMap0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function2 function20, int v1, Object object0) {
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
        int[] arr_v = intObjectMap0.keys;
        Object[] arr_object = intObjectMap0.values;
        long[] arr_v1 = intObjectMap0.metadata;
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
                        int v10 = arr_v[v9];
                        Object object1 = arr_object[v9];
                        if(v4 == ((v1 & 8) == 0 ? v : -1)) {
                            stringBuilder0.append(charSequence7);
                            goto label_63;
                        }
                        if(v4 != 0) {
                            stringBuilder0.append(charSequence4);
                        }
                        arr_v2 = arr_v1;
                        stringBuilder0.append(((CharSequence)function20.invoke(v10, object1)));
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
        int[] arr_v = this.keys;
        Object[] arr_object = this.values;
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
                            int v7 = arr_v[v6];
                            String s = arr_object[v6];
                            stringBuilder0.append(v7);
                            stringBuilder0.append("=");
                            if(s == this) {
                                s = "(this)";
                            }
                            stringBuilder0.append(s);
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

