package com.kakao.tistory.data.preference;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences.Key;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u000E\b\u0001\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BH\u0086@¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000EH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/data/preference/BlogPreference;", "", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "dataStore", "<init>", "(Landroidx/datastore/core/DataStore;)V", "Lkotlinx/coroutines/flow/Flow;", "", "getIsFirstOpen", "()Lkotlinx/coroutines/flow/Flow;", "", "setIsOpened", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "blogName", "challengeCode", "getIsShowChallengeAuth", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "setIsShowChallengeAuth", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogPreference.kt\ncom/kakao/tistory/data/preference/BlogPreference\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,49:1\n53#2:50\n55#2:54\n53#2:55\n55#2:59\n50#3:51\n55#3:53\n50#3:56\n55#3:58\n107#4:52\n107#4:57\n*S KotlinDebug\n*F\n+ 1 BlogPreference.kt\ncom/kakao/tistory/data/preference/BlogPreference\n*L\n23#1:50\n23#1:54\n34#1:55\n34#1:59\n23#1:51\n23#1:53\n34#1:56\n34#1:58\n23#1:52\n34#1:57\n*E\n"})
public final class BlogPreference {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/data/preference/BlogPreference$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "KEY_IS_FIRST_OPEN", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "", "KEY_IS_SHOW_AUTH", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final DataStore a;
    public static final Key b;
    public static final Key c;

    static {
        BlogPreference.Companion = new Companion(null);
        BlogPreference.b = PreferencesKeys.booleanKey("KEY_IS_FIRST_OPEN");
        BlogPreference.c = PreferencesKeys.stringSetKey("KEY_IS_SHOW_AUTH");
    }

    @Inject
    public BlogPreference(@Named("Blog") @NotNull DataStore dataStore0) {
        Intrinsics.checkNotNullParameter(dataStore0, "dataStore");
        super();
        this.a = dataStore0;
    }

    public static String a(String s, String s1) {
        return s + "-" + s1;
    }

    public static final String access$getShowChallengeAutKey(BlogPreference blogPreference0, String s, String s1) {
        blogPreference0.getClass();
        return BlogPreference.a(s, s1);
    }

    @NotNull
    public final Flow getIsFirstOpen() {
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.data.preference.BlogPreference.getIsFirstOpen..inlined.map.1.2 blogPreference$getIsFirstOpen$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.data.preference.BlogPreference.getIsFirstOpen..inlined.map.1.2.1 blogPreference$getIsFirstOpen$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.data.preference.BlogPreference.getIsFirstOpen..inlined.map.1.2.1) {
                            blogPreference$getIsFirstOpen$$inlined$map$1$2$10 = (com.kakao.tistory.data.preference.BlogPreference.getIsFirstOpen..inlined.map.1.2.1)continuation0;
                            int v = blogPreference$getIsFirstOpen$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                blogPreference$getIsFirstOpen$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                blogPreference$getIsFirstOpen$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            blogPreference$getIsFirstOpen$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object a;
                                public int b;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.a = object0;
                                    this.b |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = blogPreference$getIsFirstOpen$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(blogPreference$getIsFirstOpen$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                Boolean boolean0 = (Boolean)((Preferences)object0).get(BlogPreference.b);
                                blogPreference$getIsFirstOpen$$inlined$map$1$2$10.b = 1;
                                return this.a.emit(Boxing.boxBoolean((boolean0 == null ? true : boolean0.booleanValue())), blogPreference$getIsFirstOpen$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.a.collect(blogPreference$getIsFirstOpen$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    public final Flow getIsShowChallengeAuth(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "challengeCode");
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.data.preference.BlogPreference.getIsShowChallengeAuth..inlined.map.1.2 blogPreference$getIsShowChallengeAuth$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.data.preference.BlogPreference.getIsShowChallengeAuth..inlined.map.1.2.1 blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.data.preference.BlogPreference.getIsShowChallengeAuth..inlined.map.1.2.1) {
                            blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10 = (com.kakao.tistory.data.preference.BlogPreference.getIsShowChallengeAuth..inlined.map.1.2.1)continuation0;
                            int v = blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object a;
                                public int b;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.a = object0;
                                    this.b |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                Set set0 = (Set)((Preferences)object0).get(BlogPreference.c);
                                boolean z = set0 == null ? false : set0.contains(this.b);
                                blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10.b = 1;
                                return this.b.emit(Boxing.boxBoolean(z), blogPreference$getIsShowChallengeAuth$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = BlogPreference.a(s, s1).collect(blogPreference$getIsShowChallengeAuth$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
    }

    @Nullable
    public final Object setIsOpened(@NotNull Continuation continuation0) {
        com.kakao.tistory.data.preference.a a0 = new com.kakao.tistory.data.preference.a(null);
        Object object0 = PreferencesKt.edit(this.a, a0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object setIsShowChallengeAuth(@NotNull String s, @NotNull String s1, @NotNull Continuation continuation0) {
        b b0 = new b(this, s, s1, null);
        Object object0 = PreferencesKt.edit(this.a, b0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

