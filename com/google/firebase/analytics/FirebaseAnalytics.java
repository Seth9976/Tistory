package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m8.a;
import m8.b;
import m8.c;

public final class FirebaseAnalytics {
    public static enum ConsentStatus {
        @NonNull
        GRANTED,
        @NonNull
        DENIED;

    }

    public static enum ConsentType {
        @NonNull
        AD_STORAGE,
        @NonNull
        ANALYTICS_STORAGE;

    }

    public static class Event {
        @NonNull
        public static final String ADD_PAYMENT_INFO = "add_payment_info";
        @NonNull
        public static final String ADD_SHIPPING_INFO = "add_shipping_info";
        @NonNull
        public static final String ADD_TO_CART = "add_to_cart";
        @NonNull
        public static final String ADD_TO_WISHLIST = "add_to_wishlist";
        @NonNull
        public static final String AD_IMPRESSION = "ad_impression";
        @NonNull
        public static final String APP_OPEN = "app_open";
        @NonNull
        public static final String BEGIN_CHECKOUT = "begin_checkout";
        @NonNull
        public static final String CAMPAIGN_DETAILS = "campaign_details";
        @NonNull
        public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
        @NonNull
        public static final String GENERATE_LEAD = "generate_lead";
        @NonNull
        public static final String JOIN_GROUP = "join_group";
        @NonNull
        public static final String LEVEL_END = "level_end";
        @NonNull
        public static final String LEVEL_START = "level_start";
        @NonNull
        public static final String LEVEL_UP = "level_up";
        @NonNull
        public static final String LOGIN = "login";
        @NonNull
        public static final String POST_SCORE = "post_score";
        @NonNull
        public static final String PURCHASE = "purchase";
        @NonNull
        public static final String REFUND = "refund";
        @NonNull
        public static final String REMOVE_FROM_CART = "remove_from_cart";
        @NonNull
        public static final String SCREEN_VIEW = "screen_view";
        @NonNull
        public static final String SEARCH = "search";
        @NonNull
        public static final String SELECT_CONTENT = "select_content";
        @NonNull
        public static final String SELECT_ITEM = "select_item";
        @NonNull
        public static final String SELECT_PROMOTION = "select_promotion";
        @NonNull
        public static final String SHARE = "share";
        @NonNull
        public static final String SIGN_UP = "sign_up";
        @NonNull
        public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
        @NonNull
        public static final String TUTORIAL_BEGIN = "tutorial_begin";
        @NonNull
        public static final String TUTORIAL_COMPLETE = "tutorial_complete";
        @NonNull
        public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";
        @NonNull
        public static final String VIEW_CART = "view_cart";
        @NonNull
        public static final String VIEW_ITEM = "view_item";
        @NonNull
        public static final String VIEW_ITEM_LIST = "view_item_list";
        @NonNull
        public static final String VIEW_PROMOTION = "view_promotion";
        @NonNull
        public static final String VIEW_SEARCH_RESULTS = "view_search_results";

    }

    public static class Param {
        @NonNull
        public static final String ACHIEVEMENT_ID = "achievement_id";
        @NonNull
        public static final String ACLID = "aclid";
        @NonNull
        public static final String AD_FORMAT = "ad_format";
        @NonNull
        public static final String AD_PLATFORM = "ad_platform";
        @NonNull
        public static final String AD_SOURCE = "ad_source";
        @NonNull
        public static final String AD_UNIT_NAME = "ad_unit_name";
        @NonNull
        public static final String AFFILIATION = "affiliation";
        @NonNull
        public static final String CAMPAIGN = "campaign";
        @NonNull
        public static final String CHARACTER = "character";
        @NonNull
        public static final String CONTENT = "content";
        @NonNull
        public static final String CONTENT_TYPE = "content_type";
        @NonNull
        public static final String COUPON = "coupon";
        @NonNull
        public static final String CP1 = "cp1";
        @NonNull
        public static final String CREATIVE_NAME = "creative_name";
        @NonNull
        public static final String CREATIVE_SLOT = "creative_slot";
        @NonNull
        public static final String CURRENCY = "currency";
        @NonNull
        public static final String DESTINATION = "destination";
        @NonNull
        public static final String DISCOUNT = "discount";
        @NonNull
        public static final String END_DATE = "end_date";
        @NonNull
        public static final String EXTEND_SESSION = "extend_session";
        @NonNull
        public static final String FLIGHT_NUMBER = "flight_number";
        @NonNull
        public static final String GROUP_ID = "group_id";
        @NonNull
        public static final String INDEX = "index";
        @NonNull
        public static final String ITEMS = "items";
        @NonNull
        public static final String ITEM_BRAND = "item_brand";
        @NonNull
        public static final String ITEM_CATEGORY = "item_category";
        @NonNull
        public static final String ITEM_CATEGORY2 = "item_category2";
        @NonNull
        public static final String ITEM_CATEGORY3 = "item_category3";
        @NonNull
        public static final String ITEM_CATEGORY4 = "item_category4";
        @NonNull
        public static final String ITEM_CATEGORY5 = "item_category5";
        @NonNull
        public static final String ITEM_ID = "item_id";
        @NonNull
        public static final String ITEM_LIST_ID = "item_list_id";
        @NonNull
        public static final String ITEM_LIST_NAME = "item_list_name";
        @NonNull
        public static final String ITEM_NAME = "item_name";
        @NonNull
        public static final String ITEM_VARIANT = "item_variant";
        @NonNull
        public static final String LEVEL = "level";
        @NonNull
        public static final String LEVEL_NAME = "level_name";
        @NonNull
        public static final String LOCATION = "location";
        @NonNull
        public static final String LOCATION_ID = "location_id";
        @NonNull
        public static final String MEDIUM = "medium";
        @NonNull
        public static final String METHOD = "method";
        @NonNull
        public static final String NUMBER_OF_NIGHTS = "number_of_nights";
        @NonNull
        public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";
        @NonNull
        public static final String NUMBER_OF_ROOMS = "number_of_rooms";
        @NonNull
        public static final String ORIGIN = "origin";
        @NonNull
        public static final String PAYMENT_TYPE = "payment_type";
        @NonNull
        public static final String PRICE = "price";
        @NonNull
        public static final String PROMOTION_ID = "promotion_id";
        @NonNull
        public static final String PROMOTION_NAME = "promotion_name";
        @NonNull
        public static final String QUANTITY = "quantity";
        @NonNull
        public static final String SCORE = "score";
        @NonNull
        public static final String SCREEN_CLASS = "screen_class";
        @NonNull
        public static final String SCREEN_NAME = "screen_name";
        @NonNull
        public static final String SEARCH_TERM = "search_term";
        @NonNull
        public static final String SHIPPING = "shipping";
        @NonNull
        public static final String SHIPPING_TIER = "shipping_tier";
        @NonNull
        public static final String SOURCE = "source";
        @NonNull
        public static final String START_DATE = "start_date";
        @NonNull
        public static final String SUCCESS = "success";
        @NonNull
        public static final String TAX = "tax";
        @NonNull
        public static final String TERM = "term";
        @NonNull
        public static final String TRANSACTION_ID = "transaction_id";
        @NonNull
        public static final String TRAVEL_CLASS = "travel_class";
        @NonNull
        public static final String VALUE = "value";
        @NonNull
        public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";

    }

    public static class UserProperty {
        @NonNull
        public static final String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";
        @NonNull
        public static final String SIGN_UP_METHOD = "sign_up_method";

    }

    public final zzef a;
    public a b;
    public static volatile FirebaseAnalytics c;

    public FirebaseAnalytics(zzef zzef0) {
        Preconditions.checkNotNull(zzef0);
        this.a = zzef0;
    }

    public final ExecutorService a() {
        synchronized(FirebaseAnalytics.class) {
            if(this.b == null) {
                this.b = new a(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));  // 初始化器: Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V
            }
            return this.b;
        }
    }

    @NonNull
    public Task getAppInstanceId() {
        try {
            return Tasks.call(this.a(), new b(this, 0));
        }
        catch(RuntimeException runtimeException0) {
            this.a.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(runtimeException0);
        }
    }

    @Keep
    @NonNull
    public String getFirebaseInstanceId() {
        try {
            return (String)Tasks.await(FirebaseInstallations.getInstance().getId(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException executionException0) {
            throw new IllegalStateException(executionException0.getCause());
        }
        catch(TimeoutException unused_ex) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch(InterruptedException interruptedException0) {
            throw new IllegalStateException(interruptedException0);
        }
    }

    @Keep
    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static FirebaseAnalytics getInstance(@NonNull Context context0) {
        if(FirebaseAnalytics.c == null) {
            Class class0 = FirebaseAnalytics.class;
            synchronized(class0) {
                if(FirebaseAnalytics.c == null) {
                    FirebaseAnalytics.c = new FirebaseAnalytics(zzef.zzg(context0, null, null, null, null));
                }
            }
        }
        return FirebaseAnalytics.c;
    }

    @Keep
    @Nullable
    public static zzhy getScionFrontendApiImplementation(Context context0, @Nullable Bundle bundle0) {
        zzef zzef0 = zzef.zzg(context0, null, null, null, bundle0);
        return zzef0 == null ? null : new c(zzef0);
    }

    @NonNull
    public Task getSessionId() {
        try {
            return Tasks.call(this.a(), new b(this, 1));
        }
        catch(RuntimeException runtimeException0) {
            this.a.zzB(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(runtimeException0);
        }
    }

    public void logEvent(@NonNull @Size(max = 40L, min = 1L) String s, @Nullable Bundle bundle0) {
        this.a.zzy(s, bundle0);
    }

    public void resetAnalyticsData() {
        this.a.zzD();
    }

    public void setAnalyticsCollectionEnabled(boolean z) {
        this.a.zzL(Boolean.valueOf(z));
    }

    public void setConsent(@NonNull Map map0) {
        Bundle bundle0 = new Bundle();
        ConsentStatus firebaseAnalytics$ConsentStatus0 = (ConsentStatus)map0.get(ConsentType.AD_STORAGE);
        if(firebaseAnalytics$ConsentStatus0 != null) {
            switch(firebaseAnalytics$ConsentStatus0.ordinal()) {
                case 0: {
                    bundle0.putString("ad_storage", "granted");
                    break;
                }
                case 1: {
                    bundle0.putString("ad_storage", "denied");
                }
            }
        }
        ConsentStatus firebaseAnalytics$ConsentStatus1 = (ConsentStatus)map0.get(ConsentType.ANALYTICS_STORAGE);
        if(firebaseAnalytics$ConsentStatus1 != null) {
            switch(firebaseAnalytics$ConsentStatus1.ordinal()) {
                case 0: {
                    bundle0.putString("analytics_storage", "granted");
                    break;
                }
                case 1: {
                    bundle0.putString("analytics_storage", "denied");
                }
            }
        }
        this.a.zzG(bundle0);
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity0, @Nullable @Size(max = 36L, min = 1L) String s, @Nullable @Size(max = 36L, min = 1L) String s1) {
        this.a.zzH(activity0, s, s1);
    }

    public void setDefaultEventParameters(@Nullable Bundle bundle0) {
        this.a.zzJ(bundle0);
    }

    public void setSessionTimeoutDuration(long v) {
        this.a.zzM(v);
    }

    public void setUserId(@Nullable String s) {
        this.a.zzN(s);
    }

    public void setUserProperty(@NonNull @Size(max = 24L, min = 1L) String s, @Nullable @Size(max = 36L) String s1) {
        this.a.zzO(null, s, s1, false);
    }
}

