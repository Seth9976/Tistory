package com.kakao.kemoticon;

import android.content.Context;
import android.content.SharedPreferences;
import ib.c;
import ib.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\t¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R4\u0010\u001E\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00182\u000E\u0010\u0019\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188G@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lcom/kakao/kemoticon/EmoticonHistory;", "", "Landroid/content/Context;", "context", "Lcom/kakao/kemoticon/EmoticonRepository;", "repository", "<init>", "(Landroid/content/Context;Lcom/kakao/kemoticon/EmoticonRepository;)V", "", "Lcom/kakao/kemoticon/Emoticon;", "get", "()Ljava/util/List;", "emoticon", "", "push", "(Lcom/kakao/kemoticon/Emoticon;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/kakao/kemoticon/EmoticonRepository;", "getRepository", "()Lcom/kakao/kemoticon/EmoticonRepository;", "Lkotlin/Function0;", "value", "getChangeListener", "()Lkotlin/jvm/functions/Function0;", "setChangeListener", "(Lkotlin/jvm/functions/Function0;)V", "changeListener", "kemoticon_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEmoticonHistory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmoticonHistory.kt\ncom/kakao/kemoticon/EmoticonHistory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n766#2:64\n857#2,2:65\n766#2:67\n857#2,2:68\n1549#2:70\n1620#2,3:71\n*S KotlinDebug\n*F\n+ 1 EmoticonHistory.kt\ncom/kakao/kemoticon/EmoticonHistory\n*L\n32#1:60\n32#1:61,3\n33#1:64\n33#1:65,2\n34#1:67\n34#1:68,2\n35#1:70\n35#1:71,3\n*E\n"})
public final class EmoticonHistory {
    public final Context a;
    public final EmoticonRepository b;
    public Function0 c;

    public EmoticonHistory(@NotNull Context context0, @NotNull EmoticonRepository emoticonRepository0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(emoticonRepository0, "repository");
        super();
        this.a = context0;
        this.b = emoticonRepository0;
        context0.getSharedPreferences("com.kakao.kemoticon", 0).registerOnSharedPreferenceChangeListener(new c(this));
    }

    @NotNull
    public final List get() {
        EmoticonRepository emoticonRepository0;
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("com.kakao.kemoticon", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences0, "<get-preferences>(...)");
        Intrinsics.checkNotNullParameter(sharedPreferences0, "<this>");
        String s = sharedPreferences0.getString("history", null);
        if(s != null) {
            List list0 = StringsKt__StringsKt.split$default(s, new String[]{","}, false, 0, 6, null);
            if(list0 != null) {
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object0: list0) {
                    arrayList0.add(StringsKt__StringsKt.split$default(((String)object0), new char[]{':'}, false, 2, 2, null));
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: arrayList0) {
                    if(((List)object1).size() == 2) {
                        arrayList1.add(object1);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator iterator2 = arrayList1.iterator();
                while(true) {
                    boolean z = iterator2.hasNext();
                    emoticonRepository0 = this.b;
                    if(!z) {
                        break;
                    }
                    Object object2 = iterator2.next();
                    if(emoticonRepository0.getValidPackIds().contains(((List)object2).get(0))) {
                        arrayList2.add(object2);
                    }
                }
                List list1 = new ArrayList(l.collectionSizeOrDefault(arrayList2, 10));
                for(Object object3: arrayList2) {
                    ((ArrayList)list1).add(new Emoticon(((String)((List)object3).get(0)), ((String)((List)object3).get(1)), emoticonRepository0.getEmoticonResourceUrl(((String)((List)object3).get(0)), ((String)((List)object3).get(1)))));
                }
                return list1;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "")
    public final Function0 getChangeListener() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @NotNull
    public final EmoticonRepository getRepository() {
        return this.b;
    }

    public final void push(@NotNull Emoticon emoticon0) {
        Intrinsics.checkNotNullParameter(emoticon0, "emoticon");
        List list0 = CollectionsKt___CollectionsKt.toMutableList(this.get());
        list0.remove(emoticon0);
        list0.add(0, emoticon0);
        List list1 = list0.subList(0, kotlin.ranges.c.coerceAtMost(50, list0.size()));
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("com.kakao.kemoticon", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences0, "<get-preferences>(...)");
        String s = CollectionsKt___CollectionsKt.joinToString$default(list1, ",", null, null, 0, null, d.x, 30, null);
        Intrinsics.checkNotNullParameter(sharedPreferences0, "<this>");
        sharedPreferences0.edit().putString("history", s).apply();
        Function0 function00 = this.c;
        if(function00 != null) {
            function00.invoke();
        }
    }

    public final void setChangeListener(@Nullable Function0 function00) {
        this.c = function00;
    }
}

