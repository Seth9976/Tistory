package androidx.room.util;

import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001A\u0016\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B\u001A\u0018\u0010\f\u001A\u0004\u0018\u00010\u00022\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\u000E\u001A\u0006\u0010\u000F\u001A\u00020\t\u001A\u0018\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\u0002\" \u0010\u0000\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0005\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u0011"}, d2 = {"EMPTY_STRING_ARRAY", "", "", "getEMPTY_STRING_ARRAY$annotations", "()V", "[Ljava/lang/String;", "appendPlaceholders", "", "builder", "Ljava/lang/StringBuilder;", "count", "", "joinIntoString", "input", "", "newStringBuilder", "splitToIntList", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "StringUtil")
@SourceDebugExtension({"SMAP\nStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1603#2,9:87\n1855#2:96\n1856#2:98\n1612#2:99\n1#3:97\n*S KotlinDebug\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n*L\n66#1:87,9\n66#1:96\n66#1:98\n66#1:99\n66#1:97\n*E\n"})
public final class StringUtil {
    @JvmField
    @NotNull
    public static final String[] EMPTY_STRING_ARRAY;

    static {
        StringUtil.EMPTY_STRING_ARRAY = new String[0];
    }

    public static final void appendPlaceholders(@NotNull StringBuilder stringBuilder0, int v) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "builder");
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("?");
            if(v1 < v - 1) {
                stringBuilder0.append(",");
            }
        }
    }

    public static void getEMPTY_STRING_ARRAY$annotations() {
    }

    @Nullable
    public static final String joinIntoString(@Nullable List list0) {
        return list0 == null ? null : CollectionsKt___CollectionsKt.joinToString$default(list0, ",", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    @Nullable
    public static final List splitToIntList(@Nullable String s) {
        Integer integer0;
        if(s != null) {
            List list0 = StringsKt__StringsKt.split$default(s, new char[]{','}, false, 0, 6, null);
            if(list0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    String s1 = (String)object0;
                    try {
                        integer0 = Integer.parseInt(s1);
                    }
                    catch(NumberFormatException numberFormatException0) {
                        Log.e("ROOM", "Malformed integer list", numberFormatException0);
                        integer0 = null;
                    }
                    if(integer0 != null) {
                        arrayList0.add(integer0);
                    }
                }
                return arrayList0;
            }
        }
        return null;
    }
}

