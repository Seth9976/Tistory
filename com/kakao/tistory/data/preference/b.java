package com.kakao.tistory.data.preference;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences.Key;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class b extends SuspendLambda implements Function2 {
    public Object a;
    public final BlogPreference b;
    public final String c;
    public final String d;

    public b(BlogPreference blogPreference0, String s, String s1, Continuation continuation0) {
        this.b = blogPreference0;
        this.c = s;
        this.d = s1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b(this.b, this.c, this.d, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((MutablePreferences)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Set set1;
        ResultKt.throwOnFailure(object0);
        MutablePreferences mutablePreferences0 = (MutablePreferences)this.a;
        String s = BlogPreference.access$getShowChallengeAutKey(this.b, this.c, this.d);
        Key preferences$Key0 = BlogPreference.c;
        Set set0 = (Set)mutablePreferences0.get(BlogPreference.c);
        if(set0 == null) {
            set1 = e0.setOf(s);
        }
        else {
            set1 = CollectionsKt___CollectionsKt.toMutableSet(set0);
            if(set1 == null) {
                set1 = e0.setOf(s);
            }
            else {
                set1.add(s);
            }
        }
        mutablePreferences0.set(preferences$Key0, set1);
        return Unit.INSTANCE;
    }
}

