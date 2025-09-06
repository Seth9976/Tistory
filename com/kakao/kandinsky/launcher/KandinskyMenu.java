package com.kakao.kandinsky.launcher;

import ja.d;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt.WhenMappings;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UNINITIALIZED_VALUE;
import kotlin.UnsafeLazyImpl;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import md.f;
import md.h;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyMenu;", "", "Companion", "Resize", "Crop", "Effect", "Signature", "Sticker", "Mosaic", "Text", "Border", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public enum KandinskyMenu {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyMenu$Companion;", "", "", "Lcom/kakao/kandinsky/launcher/KandinskyMenu;", "menuList", "()Ljava/util/List;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final List menuList() {
            return CollectionsKt___CollectionsKt.toList(KandinskyMenu.getEntries());
        }

        public final KSerializer serializer() {
            return (KSerializer)KandinskyMenu.a.getValue();
        }
    }

    Resize,
    Crop,
    Effect,
    Signature,
    Sticker,
    Mosaic,
    Text,
    Border;

    public static final Companion Companion;
    public static final Lazy a;
    public static final KandinskyMenu[] b;
    public static final EnumEntries c;

    static {
        Lazy lazy0;
        KandinskyMenu.b = arr_kandinskyMenu;
        KandinskyMenu.c = new a(arr_kandinskyMenu);
        KandinskyMenu.Companion = new Companion(null);
        Function0 function00 = d.w;
        if(LazyThreadSafetyMode.PUBLICATION == null) {
            NullPointerException nullPointerException0 = new NullPointerException(Intrinsics.a("mode"));
            Intrinsics.b(nullPointerException0, Intrinsics.class.getName());
            throw nullPointerException0;
        }
        if(function00 == null) {
            NullPointerException nullPointerException1 = new NullPointerException(Intrinsics.a("initializer"));
            Intrinsics.b(nullPointerException1, Intrinsics.class.getName());
            throw nullPointerException1;
        }
        switch(LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0[LazyThreadSafetyMode.PUBLICATION.ordinal()]) {
            case 1: {
                lazy0 = new h(null, function00);
                break;
            }
            case 2: {
                if(function00 == null) {
                    NullPointerException nullPointerException2 = new NullPointerException(Intrinsics.a("initializer"));
                    Intrinsics.b(nullPointerException2, Intrinsics.class.getName());
                    throw nullPointerException2;
                }
                lazy0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
                lazy0.a = function00;
                lazy0.b = UNINITIALIZED_VALUE.INSTANCE;
                break;
            }
            case 3: {
                lazy0 = new UnsafeLazyImpl(function00);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        KandinskyMenu.a = lazy0;
    }

    public static EnumEntries getEntries() {
        return KandinskyMenu.c;
    }
}

