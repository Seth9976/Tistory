package com.kakao.kemoticon;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final EmoticonKeyboard a;
    public final EmoticonRepository b;
    public final List c;
    public final EmoticonHistory d;

    public a(EmoticonKeyboard emoticonKeyboard0, Function5 function50, Function2 function20, List list0) {
        Intrinsics.checkNotNullParameter(emoticonKeyboard0, "keyboard");
        Intrinsics.checkNotNullParameter(function50, "resourceUrlLookup");
        Intrinsics.checkNotNullParameter(function20, "iconResourceUrlLookup");
        super();
        this.a = emoticonKeyboard0;
        EmoticonRepository emoticonRepository0 = new EmoticonRepository(function50, function20);
        this.b = emoticonRepository0;
        if(list0 == null) {
            list0 = emoticonRepository0.getDefaultPackIds();
        }
        this.c = list0;
        Context context0 = emoticonKeyboard0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        this.d = new EmoticonHistory(context0, emoticonRepository0);
        for(Object object0: list0) {
            String s = (String)object0;
            if(!this.b.getValidPackIds().contains(s)) {
                throw new Exception(s + " is not a valid emoticon pack");
            }
            if(false) {
                break;
            }
        }
    }

    public final boolean a(String s) {
        Intrinsics.checkNotNullParameter(s, "setId");
        return Intrinsics.areEqual(s, ".history") || Intrinsics.areEqual(this.b.getEmoticonPackSizeType(s), "large");
    }

    public final ArrayList b(String s) {
        Intrinsics.checkNotNullParameter(s, "setId");
        if(Intrinsics.areEqual(s, ".history")) {
            Iterable iterable0 = this.d.get();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(this.c.contains(((Emoticon)object0).getPackId())) {
                    arrayList0.add(object0);
                }
            }
            return arrayList0;
        }
        EmoticonRepository emoticonRepository0 = this.b;
        Iterable iterable1 = emoticonRepository0.getEmoticonIds(s);
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
        for(Object object1: iterable1) {
            arrayList1.add(new Emoticon(s, ((String)object1), emoticonRepository0.getEmoticonResourceUrl(s, ((String)object1))));
        }
        return arrayList1;
    }
}

