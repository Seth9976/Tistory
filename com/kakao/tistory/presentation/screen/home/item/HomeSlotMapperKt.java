package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.domain.home.entity.HomeSlot.Banner;
import com.kakao.tistory.domain.home.entity.HomeSlot.Position;
import com.kakao.tistory.domain.home.entity.HomeSlot;
import com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry;
import com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry;
import com.kakao.tistory.domain.home.entity.HomeSlotContent.TodayType;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u009B\u0001\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000E\u0010\u000F\u001Ae\u0010\u000E\u001A\u00020\u0013*\u00020\u00102\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0010\b\u0002\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0000¢\u0006\u0004\b\u000E\u0010\u0014¨\u0006\u0015"}, d2 = {"", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "Lkotlin/Function1;", "", "", "onClickBlog", "Lkotlin/Function2;", "", "onClickEntry", "onClickUrl", "onClickFollow", "onClickUnFollow", "onClickCategoryGroup", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "toUiState", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$CategoryGroup;", "prevCategoryGroupList", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeSlotMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotMapper.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,491:1\n485#1:492\n486#1:503\n487#1:507\n489#1:508\n490#1:522\n491#1:526\n485#1:527\n486#1:538\n487#1:542\n489#1:544\n490#1:558\n491#1:562\n485#1:564\n486#1:575\n487#1:579\n489#1:580\n490#1:594\n491#1:598\n489#1:599\n490#1:613\n491#1:617\n489#1:618\n490#1:632\n491#1:636\n489#1:637\n490#1:651\n491#1:655\n489#1:657\n490#1:671\n491#1:675\n489#1:676\n490#1:690\n491#1:694\n1603#2,9:493\n1855#2:502\n1856#2:505\n1612#2:506\n1569#2,11:509\n1864#2,2:520\n1866#2:524\n1580#2:525\n1603#2,9:528\n1855#2:537\n1856#2:540\n1612#2:541\n1569#2,11:545\n1864#2,2:556\n1866#2:560\n1580#2:561\n1054#2:563\n1603#2,9:565\n1855#2:574\n1856#2:577\n1612#2:578\n1569#2,11:581\n1864#2,2:592\n1866#2:596\n1580#2:597\n1569#2,11:600\n1864#2,2:611\n1866#2:615\n1580#2:616\n1569#2,11:619\n1864#2,2:630\n1866#2:634\n1580#2:635\n1569#2,11:638\n1864#2,2:649\n1866#2:653\n1580#2:654\n1569#2,11:658\n1864#2,2:669\n1866#2:673\n1580#2:674\n1569#2,11:677\n1864#2,2:688\n1866#2:692\n1580#2:693\n1603#2,9:695\n1855#2:704\n1856#2:707\n1612#2:708\n1569#2,11:709\n1864#2,2:720\n1866#2:724\n1580#2:725\n1#3:504\n1#3:523\n1#3:539\n1#3:543\n1#3:559\n1#3:576\n1#3:595\n1#3:614\n1#3:633\n1#3:652\n1#3:656\n1#3:672\n1#3:691\n1#3:705\n1#3:706\n1#3:722\n1#3:723\n*S KotlinDebug\n*F\n+ 1 HomeSlotMapper.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotMapperKt\n*L\n20#1:492\n20#1:503\n20#1:507\n43#1:508\n43#1:522\n43#1:526\n110#1:527\n110#1:538\n110#1:542\n174#1:544\n174#1:558\n174#1:562\n199#1:564\n199#1:575\n199#1:579\n264#1:580\n264#1:594\n264#1:598\n298#1:599\n298#1:613\n298#1:617\n337#1:618\n337#1:632\n337#1:636\n368#1:637\n368#1:651\n368#1:655\n405#1:657\n405#1:671\n405#1:675\n451#1:676\n451#1:690\n451#1:694\n20#1:493,9\n20#1:502\n20#1:505\n20#1:506\n43#1:509,11\n43#1:520,2\n43#1:524\n43#1:525\n110#1:528,9\n110#1:537\n110#1:540\n110#1:541\n174#1:545,11\n174#1:556,2\n174#1:560\n174#1:561\n198#1:563\n199#1:565,9\n199#1:574\n199#1:577\n199#1:578\n264#1:581,11\n264#1:592,2\n264#1:596\n264#1:597\n298#1:600,11\n298#1:611,2\n298#1:615\n298#1:616\n337#1:619,11\n337#1:630,2\n337#1:634\n337#1:635\n368#1:638,11\n368#1:649,2\n368#1:653\n368#1:654\n405#1:658,11\n405#1:669,2\n405#1:673\n405#1:674\n451#1:677,11\n451#1:688,2\n451#1:692\n451#1:693\n485#1:695,9\n485#1:704\n485#1:707\n485#1:708\n489#1:709,11\n489#1:720,2\n489#1:724\n489#1:725\n20#1:504\n43#1:523\n110#1:539\n174#1:559\n199#1:576\n264#1:595\n298#1:614\n337#1:633\n368#1:652\n405#1:672\n451#1:691\n485#1:706\n489#1:723\n*E\n"})
public final class HomeSlotMapperKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[TodayType.values().length];
            try {
                arr_v[TodayType.NOTIFICATION.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TodayType.ENTRY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TodayType.EVENT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TodayType.UNKNOWN.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Best a(com.kakao.tistory.domain.home.entity.HomeSlot.Best homeSlot$Best0, Function1 function10, Function2 function20) {
        Object object1;
        String s = homeSlot$Best0.getSlotType();
        Position homeSlot$Position0 = homeSlot$Best0.getPosition();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: homeSlot$Best0.getContents()) {
            try {
                object1 = Result.constructor-impl(HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlotContent.Best)object0), function10, function20));
            }
            catch(Throwable throwable0) {
                object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
        }
        return new Best(s, homeSlot$Position0, arrayList0);
    }

    // 去混淆评级： 低(24)
    public static final CategoryGroup a(com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup homeSlot$CategoryGroup0, Function1 function10) {
        Pair pair0;
        switch("") {
            case "BOOK_CREATION": {
                pair0 = TuplesKt.to(drawable.ic_slot_category6, drawable.ic_slot_category6_selected);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
            case "CAREER_SELF_IMPROVEMENT": {
                pair0 = TuplesKt.to(drawable.ic_slot_category4, drawable.ic_slot_category4_selected);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
            case "ENTERTAINMENT": {
                pair0 = TuplesKt.to(drawable.ic_slot_category7, drawable.ic_slot_category7_selected);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
            case "FAMILY_LOVE": {
                pair0 = TuplesKt.to(drawable.ic_slot_category3, drawable.ic_slot_category3_selected);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
            case "HOBBY_HEALTH": {
                pair0 = TuplesKt.to(drawable.ic_slot_category8, drawable.ic_slot_category8_selected);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
            case "LIVING_STYLE": {
                pair0 = TuplesKt.to(drawable.ic_slot_category2, drawable.ic_slot_category2_selected);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
            case "NEWS_EXPERT": {
                pair0 = TuplesKt.to(drawable.ic_slot_category5, drawable.ic_slot_category5_selected);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
            case "TRAVEL_RESTAURANT": {
                pair0 = TuplesKt.to(drawable.ic_slot_category1, drawable.ic_slot_category1_selected);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
            default: {
                pair0 = TuplesKt.to(null, null);
                return new CategoryGroup("", "", ((Integer)pair0.component1()), ((Integer)pair0.component2()), new c(homeSlot$CategoryGroup0, function10));
            }
        }
    }

    public static final Creator a(com.kakao.tistory.domain.home.entity.HomeSlot.Creator homeSlot$Creator0, Function1 function10, Function2 function20, Function1 function11, Function1 function12, Function1 function13) {
        Object object1;
        String s = homeSlot$Creator0.getSlotType();
        Position homeSlot$Position0 = homeSlot$Creator0.getPosition();
        String s1 = homeSlot$Creator0.getTitle();
        String s2 = homeSlot$Creator0.getEmojiUrl();
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        for(Object object0: homeSlot$Creator0.getContents()) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            try {
                object1 = Result.constructor-impl(HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator)object0), v / 2, v % 2, function10, function20, function11, function12));
            }
            catch(Throwable throwable0) {
                object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
            ++v;
        }
        return new Creator(s, homeSlot$Position0, s1, s2, function13, arrayList0, d.a, 0, 0x80, null);
    }

    public static final Focus a(com.kakao.tistory.domain.home.entity.HomeSlot.Focus homeSlot$Focus0, Function1 function10, Function2 function20) {
        Object object1;
        String s = homeSlot$Focus0.getSlotType();
        Position homeSlot$Position0 = homeSlot$Focus0.getPosition();
        String s1 = homeSlot$Focus0.getTitle();
        String s2 = homeSlot$Focus0.getDescription();
        String s3 = s2 == null || !p.isBlank(s2) != 1 ? null : s2;
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        for(Object object0: homeSlot$Focus0.getContents()) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            try {
                object1 = Result.constructor-impl(HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus)object0), function10, new o(homeSlot$Focus0, v, ((com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus)object0), function20)));
            }
            catch(Throwable throwable0) {
                object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
            ++v;
        }
        return new Focus(s, homeSlot$Position0, s1, s3, arrayList0);
    }

    public static final Subscription a(com.kakao.tistory.domain.home.entity.HomeSlot.Subscription homeSlot$Subscription0, Function1 function10, Function2 function20, Function1 function11, Function1 function12) {
        Object object1;
        String s = homeSlot$Subscription0.getSlotType();
        Position homeSlot$Position0 = homeSlot$Subscription0.getPosition();
        String s1 = homeSlot$Subscription0.getTitle();
        String s2 = homeSlot$Subscription0.getEmojiUrl();
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        for(Object object0: homeSlot$Subscription0.getContents()) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            try {
                object1 = Result.constructor-impl(HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription)object0), v, function10, function20, function11, function12));
            }
            catch(Throwable throwable0) {
                object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
            ++v;
        }
        return new Subscription(s, homeSlot$Position0, s1, s2, arrayList0, j.a, 0, 0x40, null);
    }

    public static final Tip a(com.kakao.tistory.domain.home.entity.HomeSlot.Tip homeSlot$Tip0, Function1 function10, Function2 function20) {
        Object object1;
        String s = homeSlot$Tip0.getSlotType();
        Position homeSlot$Position0 = homeSlot$Tip0.getPosition();
        String s1 = homeSlot$Tip0.getTitle();
        String s2 = homeSlot$Tip0.getEmojiUrl();
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        for(Object object0: homeSlot$Tip0.getContents()) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            try {
                object1 = Result.constructor-impl(HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip)object0), function10, new q(v, ((com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip)object0), function20)));
            }
            catch(Throwable throwable0) {
                object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
            ++v;
        }
        return new Tip(s, homeSlot$Position0, s1, s2, arrayList0);
    }

    public static final Today a(com.kakao.tistory.domain.home.entity.HomeSlot.Today homeSlot$Today0, Function1 function10, Function1 function11) {
        Object object1;
        String s = homeSlot$Today0.getSlotType();
        Position homeSlot$Position0 = homeSlot$Today0.getPosition();
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        for(Object object0: homeSlot$Today0.getContents()) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            try {
                object1 = Result.constructor-impl(HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlotContent.Today)object0), new i(v, ((com.kakao.tistory.domain.home.entity.HomeSlotContent.Today)object0), function11), function10));
            }
            catch(Throwable throwable0) {
                object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
            ++v;
        }
        return new Today(s, homeSlot$Position0, arrayList0);
    }

    // 去混淆评级： 低(20)
    public static final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Best a(com.kakao.tistory.domain.home.entity.HomeSlotContent.Best homeSlotContent$Best0, Function1 function10, Function2 function20) {
        long v = homeSlotContent$Best0.getId();
        int v1 = homeSlotContent$Best0.getRank();
        Thumbnail thumbnail0 = homeSlotContent$Best0.getBlogImage();
        ThumbnailUiState thumbnailUiState0 = thumbnail0 == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(thumbnail0);
        t t0 = new t(function10, homeSlotContent$Best0);
        Thumbnail thumbnail1 = homeSlotContent$Best0.getThumbnail();
        return thumbnail1 == null ? new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Best("/" + v, v1, "", thumbnailUiState0, t0, "", null, new u(homeSlotContent$Best0, function20), homeSlotContent$Best0.getLikeCount(), homeSlotContent$Best0.getCommentCount(), "") : new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Best("/" + v, v1, "", thumbnailUiState0, t0, "", ThumbnailUiStateKt.toItem(thumbnail1), new u(homeSlotContent$Best0, function20), homeSlotContent$Best0.getLikeCount(), homeSlotContent$Best0.getCommentCount(), "");
    }

    // 去混淆评级： 中等(66)
    public static final Category a(com.kakao.tistory.domain.home.entity.HomeSlotContent.Category homeSlotContent$Category0, Function1 function10, w w0) {
        long v = homeSlotContent$Category0.getId();
        Thumbnail thumbnail0 = homeSlotContent$Category0.getBlogImage();
        return thumbnail0 == null ? new Category("/" + v, "", null, new b(function10, homeSlotContent$Category0), "", "", ThumbnailUiStateKt.toItem(homeSlotContent$Category0.getThumbnail()), w0, homeSlotContent$Category0.getLikeCount(), homeSlotContent$Category0.getCommentCount(), "") : new Category("/" + v, "", ThumbnailUiStateKt.toBlogThumbnailItem(thumbnail0), new b(function10, homeSlotContent$Category0), "", "", ThumbnailUiStateKt.toItem(homeSlotContent$Category0.getThumbnail()), w0, homeSlotContent$Category0.getLikeCount(), homeSlotContent$Category0.getCommentCount(), "");
    }

    public static final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator a(com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator homeSlotContent$Creator0, int v, int v1, Function1 function10, Function2 function20, Function1 function11, Function1 function12) {
        Object object1;
        int v2 = homeSlotContent$Creator0.getFollowerCount();
        boolean z = homeSlotContent$Creator0.isFollowing();
        List list0 = CollectionsKt___CollectionsKt.take(homeSlotContent$Creator0.getList(), 2);
        ArrayList arrayList0 = new ArrayList();
        int v3 = 0;
        for(Object object0: list0) {
            if(v3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            try {
                e e0 = new e(v1, v3, ((CreatorEntry)object0), homeSlotContent$Creator0, v, function20);
                object1 = Result.constructor-impl(new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.CreatorEntry("", ThumbnailUiStateKt.toItem(((CreatorEntry)object0).getThumbnail()), ((CreatorEntry)object0).isNew(), e0));
            }
            catch(Throwable throwable0) {
                object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
            ++v3;
        }
        return new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator("", "", null, new f(function10, homeSlotContent$Creator0), "", z, new g(function11, homeSlotContent$Creator0), new h(function12, homeSlotContent$Creator0), "", v2, arrayList0, 4, null);
    }

    // 去混淆评级： 低(23)
    public static final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus a(com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus homeSlotContent$Focus0, Function1 function10, o o0) {
        long v = homeSlotContent$Focus0.getId();
        Thumbnail thumbnail0 = homeSlotContent$Focus0.getBlogImage();
        ThumbnailUiState thumbnailUiState0 = thumbnail0 == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(thumbnail0);
        com.kakao.tistory.presentation.screen.home.item.p p0 = new com.kakao.tistory.presentation.screen.home.item.p(function10, homeSlotContent$Focus0);
        Thumbnail thumbnail1 = homeSlotContent$Focus0.getThumbnail();
        return thumbnail1 == null ? new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus("/" + v, "", thumbnailUiState0, p0, "", null, o0, homeSlotContent$Focus0.getLikeCount(), homeSlotContent$Focus0.getCommentCount(), "") : new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus("/" + v, "", thumbnailUiState0, p0, "", ThumbnailUiStateKt.toItem(thumbnail1), o0, homeSlotContent$Focus0.getLikeCount(), homeSlotContent$Focus0.getCommentCount(), "");
    }

    public static final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription a(com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription homeSlotContent$Subscription0, int v, Function1 function10, Function2 function20, Function1 function11, Function1 function12) {
        Object object1;
        String s = homeSlotContent$Subscription0.getBlogName();
        String s1 = homeSlotContent$Subscription0.getBlogTitle();
        Thumbnail thumbnail0 = homeSlotContent$Subscription0.getBlogImage();
        ThumbnailUiState thumbnailUiState0 = thumbnail0 == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(thumbnail0);
        String s2 = homeSlotContent$Subscription0.getBlogDescription();
        String s3 = homeSlotContent$Subscription0.getStoryCreatorLabel();
        int v1 = homeSlotContent$Subscription0.getFollowerCount();
        int v2 = homeSlotContent$Subscription0.getFollowerIncreaseCount();
        String s4 = homeSlotContent$Subscription0.getBlogName();
        ArrayList arrayList0 = new ArrayList();
        int v3 = 0;
        for(Object object0: homeSlotContent$Subscription0.getList()) {
            if(v3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            try {
                k k0 = new k(v3, ((SubscriptionEntry)object0), homeSlotContent$Subscription0, v, function20);
                object1 = Result.constructor-impl(new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.SubscriptionEntry("", ThumbnailUiStateKt.toItem(((SubscriptionEntry)object0).getThumbnail()), ((SubscriptionEntry)object0).isNew(), k0));
            }
            catch(Throwable throwable0) {
                object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            if(object1 != null) {
                arrayList0.add(object1);
            }
            ++v3;
        }
        return new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription(s, s1, thumbnailUiState0, new l(homeSlotContent$Subscription0, v, function10), s2, s3, v1, v2, false, new m(function11, homeSlotContent$Subscription0), new n(function12, homeSlotContent$Subscription0), s4, arrayList0, 0x100, null);
    }

    // 去混淆评级： 中等(100)
    public static final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip a(com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip homeSlotContent$Tip0, Function1 function10, q q0) {
        return new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip("/" + homeSlotContent$Tip0.getId(), "", null, new r(function10, homeSlotContent$Tip0), "", ThumbnailUiStateKt.toThumbnailItem(""), q0, 4, null);
    }

    public static final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Today a(com.kakao.tistory.domain.home.entity.HomeSlotContent.Today homeSlotContent$Today0, i i0, Function1 function10) {
        com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Today homeSlotUiStateContent$Today0 = null;
        int v = WhenMappings.$EnumSwitchMapping$0[homeSlotContent$Today0.getType().ordinal()];
        if(v != 1) {
            switch(v) {
                case 2: {
                    String s = homeSlotContent$Today0.getImage().getLarge();
                    String s1 = homeSlotContent$Today0.getBoxTitle();
                    String s2 = homeSlotContent$Today0.getTitle();
                    String s3 = s2 == null ? "" : s2;
                    Thumbnail thumbnail0 = homeSlotContent$Today0.getBlogImage();
                    if(thumbnail0 != null) {
                        homeSlotUiStateContent$Today0 = ThumbnailUiStateKt.toBlogThumbnailItem(thumbnail0);
                    }
                    String s4 = homeSlotContent$Today0.getBlogTitle();
                    return s4 == null ? new TodayEntry("", 0, s, s1, s3, false, i0, ((ThumbnailUiState)homeSlotUiStateContent$Today0), "", new s(homeSlotContent$Today0, function10), null, 0L, 3106, null) : new TodayEntry("", 0, s, s1, s3, false, i0, ((ThumbnailUiState)homeSlotUiStateContent$Today0), s4, new s(homeSlotContent$Today0, function10), null, 0L, 3106, null);
                }
                case 3: {
                    return new TodayEvent("", 0, homeSlotContent$Today0.getImage().getOrigin(), homeSlotContent$Today0.getBoxTitle(), i0, homeSlotContent$Today0.isLight(), homeSlotContent$Today0.getTitle(), homeSlotContent$Today0.getSubTitle(), 2, null);
                }
                case 4: {
                    return null;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return new TodayNotification("", 0, homeSlotContent$Today0.getImage().getOrigin(), homeSlotContent$Today0.getBoxTitle(), i0, homeSlotContent$Today0.isLight(), homeSlotContent$Today0.getTitle(), homeSlotContent$Today0.getSubTitle(), 2, null);
    }

    @NotNull
    public static final com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category toUiState(@NotNull com.kakao.tistory.domain.home.entity.HomeSlot.Category homeSlot$Category0, @NotNull Function1 function10, @NotNull Function2 function20, @NotNull Function1 function11, @Nullable List list0) {
        Object object5;
        Object object3;
        Object object0 = null;
        Intrinsics.checkNotNullParameter(homeSlot$Category0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onClickBlog");
        Intrinsics.checkNotNullParameter(function20, "onClickEntry");
        Intrinsics.checkNotNullParameter(function11, "onClickCategoryGroup");
        for(Object object1: homeSlot$Category0.getCategoryGroups()) {
            if(Intrinsics.areEqual("", homeSlot$Category0.getActiveCategoryGroup())) {
                object0 = object1;
                break;
            }
        }
        com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup homeSlot$CategoryGroup0 = (com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup)object0;
        if(homeSlot$CategoryGroup0 == null) {
            homeSlot$CategoryGroup0 = (com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup)CollectionsKt___CollectionsKt.firstOrNull(homeSlot$Category0.getCategoryGroups());
        }
        String s = homeSlot$CategoryGroup0 == null ? null : "";
        if(s == null) {
            s = "";
        }
        String s1 = homeSlot$Category0.getSlotType();
        Position homeSlot$Position0 = homeSlot$Category0.getPosition();
        String s2 = homeSlot$Category0.getTitle();
        String s3 = homeSlot$Category0.getEmojiUrl();
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        for(Object object2: homeSlot$Category0.getContents()) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            try {
                object3 = Result.constructor-impl(HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlotContent.Category)object2), function10, new w(s, v, ((com.kakao.tistory.domain.home.entity.HomeSlotContent.Category)object2), function20)));
            }
            catch(Throwable throwable0) {
                object3 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(object3);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(object3)) {
                object3 = null;
            }
            if(object3 != null) {
                arrayList0.add(object3);
            }
            ++v;
        }
        String s4 = homeSlot$Category0.getActiveCategoryGroup();
        if(list0 == null) {
            List list1 = CollectionsKt___CollectionsKt.sortedWith(homeSlot$Category0.getCategoryGroups(), new Comparator() {
                // 去混淆评级： 低(40)
                @Override
                public final int compare(Object object0, Object object1) {
                    return pd.c.compareValues(Boolean.valueOf(Intrinsics.areEqual("", homeSlot$Category0.getActiveCategoryGroup())), Boolean.valueOf(Intrinsics.areEqual("", homeSlot$Category0.getActiveCategoryGroup())));
                }
            });
            ArrayList arrayList1 = new ArrayList();
            for(Object object4: list1) {
                try {
                    object5 = Result.constructor-impl(HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup)object4), function11));
                }
                catch(Throwable throwable2) {
                    object5 = Result.constructor-impl(ResultKt.createFailure(throwable2));
                }
                CrashlyticsUtils crashlyticsUtils1 = CrashlyticsUtils.INSTANCE;
                Throwable throwable3 = Result.exceptionOrNull-impl(object5);
                if(throwable3 != null) {
                    crashlyticsUtils1.logException(throwable3);
                }
                if(Result.isFailure-impl(object5)) {
                    object5 = null;
                }
                if(object5 != null) {
                    arrayList1.add(object5);
                }
            }
            return new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category(s1, homeSlot$Position0, s2, s3, false, arrayList0, s4, arrayList1, new a(s), 16, null);
        }
        return new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category(s1, homeSlot$Position0, s2, s3, false, arrayList0, s4, list0, new a(s), 16, null);
    }

    @NotNull
    public static final List toUiState(@NotNull List list0, @NotNull Function1 function10, @NotNull Function2 function20, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14) {
        Today homeSlotUiState$Today1;
        Today homeSlotUiState$Today0;
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onClickBlog");
        Intrinsics.checkNotNullParameter(function20, "onClickEntry");
        Intrinsics.checkNotNullParameter(function11, "onClickUrl");
        Intrinsics.checkNotNullParameter(function12, "onClickFollow");
        Intrinsics.checkNotNullParameter(function13, "onClickUnFollow");
        Intrinsics.checkNotNullParameter(function14, "onClickCategoryGroup");
        List list1 = new ArrayList();
        for(Object object0: list0) {
            try {
                if(((HomeSlot)object0) instanceof com.kakao.tistory.domain.home.entity.HomeSlot.Today) {
                    homeSlotUiState$Today0 = HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlot.Today)(((HomeSlot)object0))), function10, function11);
                }
                else {
                    if(((HomeSlot)object0) instanceof com.kakao.tistory.domain.home.entity.HomeSlot.Best) {
                    }
                    else if(((HomeSlot)object0) instanceof Banner) {
                        com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner homeSlotContent$Banner0 = ((Banner)(((HomeSlot)object0))).getContents();
                        homeSlotUiState$Today0 = homeSlotContent$Banner0 == null ? null : new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Banner(((Banner)(((HomeSlot)object0))).getSlotType(), ((Banner)(((HomeSlot)object0))).getPosition(), "", StringUtils.toColor-wrIjXm8$default(StringUtils.INSTANCE, homeSlotContent$Banner0.getColor(), 0L, 1, null), new v(homeSlotContent$Banner0, function11), null, 0x20, null);
                        goto label_40;
                    }
                    else {
                        if(((HomeSlot)object0) instanceof com.kakao.tistory.domain.home.entity.HomeSlot.Category) {
                            homeSlotUiState$Today0 = HomeSlotMapperKt.toUiState$default(((com.kakao.tistory.domain.home.entity.HomeSlot.Category)(((HomeSlot)object0))), function10, function20, function14, null, 8, null);
                        }
                        else if(((HomeSlot)object0) instanceof com.kakao.tistory.domain.home.entity.HomeSlot.Creator) {
                            homeSlotUiState$Today0 = HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlot.Creator)(((HomeSlot)object0))), function10, function20, function12, function13, function11);
                        }
                        else if(((HomeSlot)object0) instanceof com.kakao.tistory.domain.home.entity.HomeSlot.Subscription) {
                            homeSlotUiState$Today0 = HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlot.Subscription)(((HomeSlot)object0))), function10, function20, function12, function13);
                        }
                        else if(((HomeSlot)object0) instanceof com.kakao.tistory.domain.home.entity.HomeSlot.Focus) {
                            homeSlotUiState$Today0 = HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlot.Focus)(((HomeSlot)object0))), function10, function20);
                        }
                        else if(((HomeSlot)object0) instanceof com.kakao.tistory.domain.home.entity.HomeSlot.Tip) {
                            homeSlotUiState$Today0 = HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlot.Tip)(((HomeSlot)object0))), function10, function20);
                        }
                        else {
                            Exception exception0 = new Exception("HomeSlotMapper.toUiState unknown type " + ((HomeSlot)object0));
                            CrashlyticsUtils.INSTANCE.logException(exception0);
                            homeSlotUiState$Today0 = null;
                        }
                        goto label_40;
                    }
                    homeSlotUiState$Today0 = HomeSlotMapperKt.a(((com.kakao.tistory.domain.home.entity.HomeSlot.Best)(((HomeSlot)object0))), function10, function20);
                }
            label_40:
                homeSlotUiState$Today1 = homeSlotUiState$Today0;
            }
            catch(Throwable throwable0) {
                homeSlotUiState$Today1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
            Throwable throwable1 = Result.exceptionOrNull-impl(homeSlotUiState$Today1);
            if(throwable1 != null) {
                crashlyticsUtils0.logException(throwable1);
            }
            if(Result.isFailure-impl(homeSlotUiState$Today1)) {
                homeSlotUiState$Today1 = null;
            }
            if(homeSlotUiState$Today1 != null) {
                ((ArrayList)list1).add(homeSlotUiState$Today1);
            }
        }
        return list1;
    }

    public static com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category toUiState$default(com.kakao.tistory.domain.home.entity.HomeSlot.Category homeSlot$Category0, Function1 function10, Function2 function20, Function1 function11, List list0, int v, Object object0) {
        if((v & 8) != 0) {
            list0 = null;
        }
        return HomeSlotMapperKt.toUiState(homeSlot$Category0, function10, function20, function11, list0);
    }
}

