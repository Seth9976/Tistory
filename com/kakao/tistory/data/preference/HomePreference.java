package com.kakao.tistory.data.preference;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences.Key;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FB\u0019\b\u0007\u0012\u000E\b\u0001\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/data/preference/HomePreference;", "", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "dataStore", "<init>", "(Landroidx/datastore/core/DataStore;)V", "Lkotlinx/coroutines/flow/Flow;", "", "getCategory", "()Lkotlinx/coroutines/flow/Flow;", "category", "", "setCategory", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePreference.kt\ncom/kakao/tistory/data/preference/HomePreference\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,28:1\n53#2:29\n55#2:33\n50#3:30\n55#3:32\n107#4:31\n*S KotlinDebug\n*F\n+ 1 HomePreference.kt\ncom/kakao/tistory/data/preference/HomePreference\n*L\n21#1:29\n21#1:33\n21#1:30\n21#1:32\n21#1:31\n*E\n"})
public final class HomePreference {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/data/preference/HomePreference$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "KEY_IS_CATEGORY_ID", "Landroidx/datastore/preferences/core/Preferences$Key;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final DataStore a;
    public static final Key b;

    static {
        HomePreference.Companion = new Companion(null);
        HomePreference.b = PreferencesKeys.stringKey("KEY_IS_CATEGORY");
    }

    @Inject
    public HomePreference(@Named("home") @NotNull DataStore dataStore0) {
        Intrinsics.checkNotNullParameter(dataStore0, "dataStore");
        super();
        this.a = dataStore0;
    }

    @NotNull
    public final Flow getCategory() {
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.data.preference.HomePreference.getCategory..inlined.map.1.2 homePreference$getCategory$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.data.preference.HomePreference.getCategory..inlined.map.1.2.1 homePreference$getCategory$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.data.preference.HomePreference.getCategory..inlined.map.1.2.1) {
                            homePreference$getCategory$$inlined$map$1$2$10 = (com.kakao.tistory.data.preference.HomePreference.getCategory..inlined.map.1.2.1)continuation0;
                            int v = homePreference$getCategory$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                homePreference$getCategory$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                homePreference$getCategory$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            homePreference$getCategory$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = homePreference$getCategory$$inlined$map$1$2$10.a;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(homePreference$getCategory$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                Object object3 = ((Preferences)object0).get(HomePreference.b);
                                homePreference$getCategory$$inlined$map$1$2$10.b = 1;
                                return this.a.emit(object3, homePreference$getCategory$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = this.a.collect(homePreference$getCategory$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
    }

    @Nullable
    public final Object setCategory(@NotNull String s, @NotNull Continuation continuation0) {
        c c0 = new c(s, null);
        Object object0 = PreferencesKt.edit(this.a, c0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

