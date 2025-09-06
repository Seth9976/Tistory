package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A?\u0010\u0005\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A%\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u00A2\u0006\u0004\b\b\u0010\t\u001AE\u0010\f\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\nH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\f\u0010\r\u001AK\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000E*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A?\u0010\u0014\u001A\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001A?\u0010\u0016\u001A\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0015\u001AW\u0010\u001A\u001A\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0019\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001Ai\u0010#\u001A\u00020\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u001E\u001A\u00020\u001C2\b\b\u0002\u0010\u001F\u001A\u00020\u001C2\b\b\u0002\u0010 \u001A\u00020\u000B2\b\b\u0002\u0010!\u001A\u00020\u001C2\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C\u0018\u00010\u0002H\u0000\u00A2\u0006\u0004\b#\u0010$\u001AM\u0010%\u001A\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000E*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b%\u0010\u0011\u001AZ\u0010)\u001A\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\'\u0010\u0013\u001A#\u0012\u0013\u0012\u00110\u000B\u00A2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\nH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0004\b)\u0010*\u00A8\u0006+"}, d2 = {"T", "", "Lkotlin/Function1;", "", "action", "fastForEach", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "fastToSet", "(Ljava/util/List;)Ljava/util/Set;", "Lkotlin/Function2;", "", "fastForEachIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "R", "transform", "fastMap", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "predicate", "fastAny", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z", "fastAll", "K", "keySelector", "", "fastGroupBy", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "", "separator", "prefix", "postfix", "limit", "truncated", "", "fastJoinToString", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "fastMapNotNull", "Lkotlin/ParameterName;", "name", "index", "fastFilterIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n33#1,6:239\n33#1,6:245\n33#1,6:251\n33#1,6:257\n33#1,4:263\n38#1:274\n33#1,4:275\n38#1:280\n64#1,6:281\n361#2,7:267\n1#3:279\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:239,6\n84#1:245,6\n94#1:251,6\n111#1:257,6\n122#1:263,4\n122#1:274\n213#1:275,4\n213#1:280\n233#1:281,6\n124#1:267,7\n*E\n"})
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
    public static final List fastFilterIndexed(@NotNull List list0, @NotNull Function2 function20) {
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(((Boolean)function20.invoke(v1, object0)).booleanValue()) {
                list1.add(object0);
            }
        }
        return list1;
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

    @NotNull
    public static final Map fastGroupBy(@NotNull List list0, @NotNull Function1 function10) {
        Map map0 = new HashMap(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(object0);
        }
        return map0;
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
    public static final Set fastToSet(@NotNull List list0) {
        Set set0 = new HashSet(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((HashSet)set0).add(list0.get(v1));
        }
        return set0;
    }
}

