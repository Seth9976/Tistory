package com.kakao.kandinsky.core.filter.info;

import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.core.kdphoto.FilterAdjustment;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/core/filter/info/FilterInfo;", "", "", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "a", "Ljava/util/List;", "getList", "()Ljava/util/List;", "list", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FilterInfo {
    @NotNull
    public static final FilterInfo INSTANCE;
    public static final List a;

    static {
        FilterInfo.INSTANCE = new FilterInfo();  // 初始化器: Ljava/lang/Object;-><init>()V
        FilterInfo.a = CollectionsKt__CollectionsKt.listOf(new Filter[]{Filter.Companion.getDefault(), new Filter("부드러운", "soft", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "aq02.png")), "1", "lookup512"))), new Filter("깨끗한", "clean", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "aq05.png")), "1", "lookup512"))), new Filter("그겨울", "winter", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "aq04.png")), "1", "lookup512"))), new Filter("따스한", "warm", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "so11.png")), "1", "lookup512"))), new Filter("빛나는", "shine", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "cl02.png")), "1", "lookup512"))), new Filter("달빛", "moonlight", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "cl01.png")), "1", "lookup512"))), new Filter("샴페인", "champagne", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "aq01.png")), "1", "lookup512"))), new Filter("선명", "clear", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "re01.png")), "1", "lookup512"))), new Filter("단아함", "monotonousness", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "cl09.png")), "1", "lookup512"))), new Filter("일상", "dailylife", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "aq07.png")), "1", "lookup512"))), new Filter("아련한", "dimly", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "re08.png")), "1", "lookup512"))), new Filter("달콤", "sweet", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "so01.png")), "1", "lookup512"))), new Filter("그레이", "gray", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "bw04.png")), "1", "lookup512"))), new Filter("우아한", "elegant", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "cl10.png")), "1", "lookup512"))), new Filter("따뜻함", "warmth", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "so02.png")), "1", "lookup512"))), new Filter("화사", "brightcolors", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "aq10.png")), "1", "lookup512"))), new Filter("솜사탕", "cottoncandy", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "aq09.png")), "1", "lookup512"))), new Filter("회상", "recollection", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "bw02.png")), "1", "lookup512"))), new Filter("필름", "film", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "cl07.png")), "1", "lookup512"))), new Filter("가을날", "autumn", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "re03.png")), "1", "lookup512"))), new Filter("로맨틱", "romantic", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "re05.png")), "1", "lookup512"))), new Filter("늦은 오후", "lateafternoon", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "so04.png")), "1", "lookup512"))), new Filter("빛바랜", "faded", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "so05.png")), "1", "lookup512"))), new Filter("안개", "mist", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "bw09.png")), "1", "lookup512"))), new Filter("블루베리", "blueberry", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "po09.png")), "1", "lookup512"))), new Filter("옐로우", "yellow", k.listOf(new FilterAdjustment(w.mapOf(TuplesKt.to("lookup", "po10.png")), "1", "lookup512")))});
    }

    @NotNull
    public final List getList() {
        return FilterInfo.a;
    }
}

