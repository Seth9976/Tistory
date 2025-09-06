package cd;

import android.content.Context;
import com.kakao.sdk.auth.RxLoginClient;
import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.network.RxAuthOperations;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany;
import io.reactivex.internal.operators.maybe.MaybeZipArray;
import io.reactivex.internal.operators.maybe.MaybeZipIterable;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.operators.single.SingleZipIterable;
import j0.b2;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tb.c;

public final class b implements Function {
    public final int a;
    public final Object b;

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                if(((Object[])object0).length != 2) {
                    throw new IllegalArgumentException("Array of size 2 expected but got " + ((Object[])object0).length);
                }
                return ((BiFunction)this.b).apply(((Object[])object0)[0], ((Object[])object0)[1]);
            }
            case 1: {
                if(((Object[])object0).length != 3) {
                    throw new IllegalArgumentException("Array of size 3 expected but got " + ((Object[])object0).length);
                }
                return ((Function3)this.b).apply(((Object[])object0)[0], ((Object[])object0)[1], ((Object[])object0)[2]);
            }
            case 2: {
                if(((Object[])object0).length != 4) {
                    throw new IllegalArgumentException("Array of size 4 expected but got " + ((Object[])object0).length);
                }
                return ((Function4)this.b).apply(((Object[])object0)[0], ((Object[])object0)[1], ((Object[])object0)[2], ((Object[])object0)[3]);
            }
            case 3: {
                if(((Object[])object0).length != 5) {
                    throw new IllegalArgumentException("Array of size 5 expected but got " + ((Object[])object0).length);
                }
                return ((Function5)this.b).apply(((Object[])object0)[0], ((Object[])object0)[1], ((Object[])object0)[2], ((Object[])object0)[3], ((Object[])object0)[4]);
            }
            case 4: {
                if(((Object[])object0).length != 6) {
                    throw new IllegalArgumentException("Array of size 6 expected but got " + ((Object[])object0).length);
                }
                return ((Function6)this.b).apply(((Object[])object0)[0], ((Object[])object0)[1], ((Object[])object0)[2], ((Object[])object0)[3], ((Object[])object0)[4], ((Object[])object0)[5]);
            }
            case 5: {
                if(((Object[])object0).length != 7) {
                    throw new IllegalArgumentException("Array of size 7 expected but got " + ((Object[])object0).length);
                }
                return ((Function7)this.b).apply(((Object[])object0)[0], ((Object[])object0)[1], ((Object[])object0)[2], ((Object[])object0)[3], ((Object[])object0)[4], ((Object[])object0)[5], ((Object[])object0)[6]);
            }
            case 6: {
                if(((Object[])object0).length != 8) {
                    throw new IllegalArgumentException("Array of size 8 expected but got " + ((Object[])object0).length);
                }
                return ((Function8)this.b).apply(((Object[])object0)[0], ((Object[])object0)[1], ((Object[])object0)[2], ((Object[])object0)[3], ((Object[])object0)[4], ((Object[])object0)[5], ((Object[])object0)[6], ((Object[])object0)[7]);
            }
            case 7: {
                if(((Object[])object0).length != 9) {
                    throw new IllegalArgumentException("Array of size 9 expected but got " + ((Object[])object0).length);
                }
                return ((Function9)this.b).apply(((Object[])object0)[0], ((Object[])object0)[1], ((Object[])object0)[2], ((Object[])object0)[3], ((Object[])object0)[4], ((Object[])object0)[5], ((Object[])object0)[6], ((Object[])object0)[7], ((Object[])object0)[8]);
            }
            case 8: {
                return ((Class)this.b).cast(object0);
            }
            case 9: {
                Collections.sort(((List)object0), ((Comparator)this.b));
                return (List)object0;
            }
            case 10: {
                return ObjectHelper.requireNonNull(((SingleZipArray)this.b).b.apply(new Object[]{object0}), "The zipper returned a null value");
            }
            case 11: {
                return ObjectHelper.requireNonNull(((SingleZipIterable)this.b).b.apply(new Object[]{object0}), "The zipper returned a null value");
            }
            case 12: {
                return ((FlowableCombineLatest)this.b).d.apply(new Object[]{object0});
            }
            case 13: {
                return ObjectHelper.requireNonNull(((FlowableWithLatestFromMany)this.b).d.apply(new Object[]{object0}), "The combiner returned a null value");
            }
            case 14: {
                return ObjectHelper.requireNonNull(((MaybeZipArray)this.b).b.apply(new Object[]{object0}), "The zipper returned a null value");
            }
            case 15: {
                return ObjectHelper.requireNonNull(((MaybeZipIterable)this.b).b.apply(new Object[]{object0}), "The zipper returned a null value");
            }
            case 16: {
                return ObjectHelper.requireNonNull(((ObservableWithLatestFromMany)this.b).c.apply(new Object[]{object0}), "The combiner returned a null value");
            }
            case 17: {
                Intrinsics.checkParameterIsNotNull(((AccessTokenResponse)object0), "it");
                return OAuthToken.Companion.fromResponse(((AccessTokenResponse)object0), ((OAuthToken)this.b));
            }
            case 18: {
                Intrinsics.checkParameterIsNotNull(((Flowable)object0), "it");
                return ((tb.b)this.b).a.refreshAccessToken$auth_rx_release(((Flowable)object0));
            }
            case 19: {
                Intrinsics.checkParameterIsNotNull(((Flowable)object0), "it");
                return ((c)this.b).a.refreshAccessToken$auth_rx_release(((Flowable)object0));
            }
            case 20: {
                Intrinsics.checkParameterIsNotNull(((Throwable)object0), "apiError");
                if(((Throwable)object0) instanceof ApiError && ((ApiError)(((Throwable)object0))).getReason() == ApiErrorCause.InsufficientScope && ((ApiError)(((Throwable)object0))).getResponse().getRequiredScopes() != null) {
                    b2 b20 = (b2)this.b;
                    RxLoginClient rxLoginClient0 = RxAuthOperations.access$getLoginClient$p(((RxAuthOperations)b20.x));
                    List list0 = ((ApiError)(((Throwable)object0))).getResponse().getRequiredScopes();
                    if(list0 == null) {
                        Intrinsics.throwNpe();
                    }
                    return rxLoginClient0.loginWithNewScopes(((Context)b20.y), list0).toFlowable();
                }
                return Flowable.error(((Throwable)object0));
            }
            default: {
                Intrinsics.checkParameterIsNotNull(((Throwable)object0), "it");
                RxAuthOperations rxAuthOperations0 = (RxAuthOperations)this.b;
                OAuthToken oAuthToken0 = RxAuthOperations.access$getTokenManagerProvider$p(rxAuthOperations0).getManager().getToken();
                if(oAuthToken0 == null || !(((Throwable)object0) instanceof ApiError) || ((ApiError)(((Throwable)object0))).getReason() != ApiErrorCause.InvalidToken) {
                    throw (Throwable)object0;
                }
                return RxAuthOperations.access$getAuthApiClient$p(rxAuthOperations0).refreshAccessToken(oAuthToken0).toFlowable();
            }
        }
    }
}

