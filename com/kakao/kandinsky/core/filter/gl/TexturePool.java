package com.kakao.kandinsky.core.filter.gl;

import com.kakao.kandinsky.core.filter.core.Texture;
import com.kakao.kandinsky.utils.Logger;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w9.c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0000\u0018\u0000 \u001D*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u001DB?\u00126\u0010\n\u001A2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\r\u001A\u00028\u00002\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000F\u001A\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0017RG\u0010\n\u001A2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/TexturePool;", "Lcom/kakao/kandinsky/core/filter/core/Texture;", "T", "", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "width", "height", "createTexture", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "get", "(II)Lcom/kakao/kandinsky/core/filter/core/Texture;", "texture", "", "retain", "(Lcom/kakao/kandinsky/core/filter/core/Texture;)V", "", "release", "(Lcom/kakao/kandinsky/core/filter/core/Texture;)Z", "clear", "()V", "log", "a", "Lkotlin/jvm/functions/Function2;", "getCreateTexture", "()Lkotlin/jvm/functions/Function2;", "Companion", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTexturePool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TexturePool.kt\ncom/kakao/kandinsky/core/filter/gl/TexturePool\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n372#2,7:103\n1#3:110\n215#4:111\n216#4:114\n215#4,2:115\n215#4:117\n216#4:120\n215#4,2:121\n1855#5,2:112\n1855#5,2:118\n*S KotlinDebug\n*F\n+ 1 TexturePool.kt\ncom/kakao/kandinsky/core/filter/gl/TexturePool\n*L\n30#1:103,7\n54#1:111\n54#1:114\n60#1:115,2\n70#1:117\n70#1:120\n78#1:121,2\n55#1:112,2\n72#1:118,2\n*E\n"})
public final class TexturePool {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/core/filter/gl/TexturePool$Companion;", "", "", "k1", "k2", "pairing", "(II)I", "INITIAL_CAPACITY", "I", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int pairing(int v, int v1) [...] // Inlined contents
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int INITIAL_CAPACITY = 30;
    public final Function2 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    static {
        TexturePool.Companion = new Companion(null);
    }

    public TexturePool(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "createTexture");
        super();
        this.a = function20;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    public final void clear() {
        LinkedHashMap linkedHashMap0 = this.b;
        for(Object object0: linkedHashMap0.entrySet()) {
            for(Object object1: ((ArrayDeque)((Map.Entry)object0).getValue())) {
                ((c)object1).a.delete();
            }
        }
        LinkedHashMap linkedHashMap1 = this.c;
        for(Object object2: linkedHashMap1.entrySet()) {
            ((c)((Map.Entry)object2).getValue()).a.delete();
        }
        linkedHashMap0.clear();
        linkedHashMap1.clear();
    }

    @NotNull
    public final Texture get(int v, int v1) {
        LinkedHashMap linkedHashMap0 = this.b;
        Integer integer0 = (int)((v + v1 + 1) * (v + v1) / 2 + v1);
        ArrayDeque arrayDeque0 = linkedHashMap0.get(integer0);
        if(arrayDeque0 == null) {
            arrayDeque0 = new ArrayDeque(30);
            linkedHashMap0.put(integer0, arrayDeque0);
        }
        c c0 = (c)arrayDeque0.removeFirstOrNull();
        if(c0 == null) {
            c0 = new c(((Texture)this.a.invoke(v, v1)));
        }
        c0.b = 1;
        Integer integer1 = c0.a.getId();
        this.c.put(integer1, c0);
        return c0.a;
    }

    @NotNull
    public final Function2 getCreateTexture() {
        return this.a;
    }

    public final void log() {
        Logger.INSTANCE.log("availableList size = " + this.b.size());
        for(Object object0: this.b.entrySet()) {
            int v = ((Number)((Map.Entry)object0).getKey()).intValue();
            ArrayDeque arrayDeque0 = (ArrayDeque)((Map.Entry)object0).getValue();
            Logger.INSTANCE.log("availableList key = " + v + ", list size = " + arrayDeque0.size());
            for(Object object1: arrayDeque0) {
                int v1 = ((c)object1).a.getId();
                int v2 = ((c)object1).a.getWidth();
                Logger.INSTANCE.log("available " + ((c)object1) + " id=" + v1 + ", width=" + v2);
            }
        }
        Logger.INSTANCE.log("inUses size = " + this.c.size());
        for(Object object2: this.c.entrySet()) {
            int v3 = ((Number)((Map.Entry)object2).getKey()).intValue();
            c c0 = (c)((Map.Entry)object2).getValue();
            int v4 = c0.a.getId();
            int v5 = c0.a.getWidth();
            Logger.INSTANCE.log("inUse " + v3 + ", retaine=" + c0 + ", id=" + v4 + ", width=" + v5);
        }
    }

    public final boolean release(@NotNull Texture texture0) {
        Intrinsics.checkNotNullParameter(texture0, "texture");
        LinkedHashMap linkedHashMap0 = this.c;
        c c0 = (c)linkedHashMap0.get(texture0.getId());
        if(c0 != null) {
            int v = c0.b - 1;
            c0.b = v;
            if(v <= 0) {
                linkedHashMap0.remove(texture0.getId());
                int v1 = texture0.getWidth();
                int v2 = texture0.getHeight();
                LinkedHashMap linkedHashMap1 = this.b;
                Integer integer0 = (int)((v1 + v2 + 1) * (v1 + v2) / 2 + v2);
                ArrayDeque arrayDeque0 = linkedHashMap1.get(integer0);
                if(arrayDeque0 == null) {
                    arrayDeque0 = new ArrayDeque(30);
                    linkedHashMap1.put(integer0, arrayDeque0);
                }
                arrayDeque0.addFirst(c0);
            }
            return true;
        }
        int v3 = texture0.getId();
        Logger.INSTANCE.error("RetainableTexturePool::release - Invalid Texture " + v3);
        return false;
    }

    public final void retain(@NotNull Texture texture0) {
        Intrinsics.checkNotNullParameter(texture0, "texture");
        Integer integer0 = texture0.getId();
        c c0 = (c)this.c.get(integer0);
        if(c0 != null) {
            ++c0.b;
            return;
        }
        Logger.INSTANCE.error("RetainableTexturePool::retain - Invalid Texture " + texture0);
    }
}

