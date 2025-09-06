package com.squareup.moshi.kotlin.reflect;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader.Options;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002)*BW\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001C\u0010\b\u001A\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001A\u0010\t\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0005\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0013\u001A\u00020\u00122\b\u0010\u0014\u001A\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER-\u0010\b\u001A\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R+\u0010\t\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001A\u0004\b$\u0010\"R\u0017\u0010\u000B\u001A\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(¨\u0006+"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/reflect/KFunction;", "constructor", "", "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "", "allBindings", "nonTransientBindings", "Lcom/squareup/moshi/JsonReader$Options;", "options", "<init>", "(Lkotlin/reflect/KFunction;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonReader$Options;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/KFunction;", "getConstructor", "()Lkotlin/reflect/KFunction;", "b", "Ljava/util/List;", "getAllBindings", "()Ljava/util/List;", "c", "getNonTransientBindings", "d", "Lcom/squareup/moshi/JsonReader$Options;", "getOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "Binding", "IndexedParameterMap", "reflect"}, k = 1, mv = {1, 4, 2})
public final class KotlinJsonAdapter extends JsonAdapter {
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BM\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0012\u001A\u00028\u00022\u0006\u0010\u0011\u001A\u00028\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u001D\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00028\u00012\u0006\u0010\u0011\u001A\u00028\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001A\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001C\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0012\u0010\u001F\u001A\u0004\u0018\u00010\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"Jn\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00020\u00072\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\rH\u00C6\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001A\u00020\rH\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\"J\u001A\u0010)\u001A\u00020(2\b\u0010\'\u001A\u0004\u0018\u00010\u0003H\u00D6\u0003\u00A2\u0006\u0004\b)\u0010*R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u0019R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b.\u0010,\u001A\u0004\b/\u0010\u0019R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001CR#\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001ER\u0019\u0010\f\u001A\u0004\u0018\u00010\u000B8\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010 R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010\"\u00A8\u0006<"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "K", "P", "", "", "name", "jsonName", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "Lkotlin/reflect/KProperty1;", "property", "Lkotlin/reflect/KParameter;", "parameter", "", "propertyIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KParameter;I)V", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "result", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/squareup/moshi/JsonAdapter;", "component4", "()Lkotlin/reflect/KProperty1;", "component5", "()Lkotlin/reflect/KParameter;", "component6", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KParameter;I)Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getJsonName", "c", "Lcom/squareup/moshi/JsonAdapter;", "getAdapter", "d", "Lkotlin/reflect/KProperty1;", "getProperty", "e", "Lkotlin/reflect/KParameter;", "getParameter", "f", "I", "getPropertyIndex", "reflect"}, k = 1, mv = {1, 4, 2})
    public static final class Binding {
        public final String a;
        public final String b;
        public final JsonAdapter c;
        public final KProperty1 d;
        public final KParameter e;
        public final int f;

        public Binding(@NotNull String s, @Nullable String s1, @NotNull JsonAdapter jsonAdapter0, @NotNull KProperty1 kProperty10, @Nullable KParameter kParameter0, int v) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(jsonAdapter0, "adapter");
            Intrinsics.checkNotNullParameter(kProperty10, "property");
            super();
            this.a = s;
            this.b = s1;
            this.c = jsonAdapter0;
            this.d = kProperty10;
            this.e = kParameter0;
            this.f = v;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final JsonAdapter component3() {
            return this.c;
        }

        @NotNull
        public final KProperty1 component4() {
            return this.d;
        }

        @Nullable
        public final KParameter component5() {
            return this.e;
        }

        public final int component6() {
            return this.f;
        }

        @NotNull
        public final Binding copy(@NotNull String s, @Nullable String s1, @NotNull JsonAdapter jsonAdapter0, @NotNull KProperty1 kProperty10, @Nullable KParameter kParameter0, int v) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(jsonAdapter0, "adapter");
            Intrinsics.checkNotNullParameter(kProperty10, "property");
            return new Binding(s, s1, jsonAdapter0, kProperty10, kParameter0, v);
        }

        public static Binding copy$default(Binding kotlinJsonAdapter$Binding0, String s, String s1, JsonAdapter jsonAdapter0, KProperty1 kProperty10, KParameter kParameter0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = kotlinJsonAdapter$Binding0.a;
            }
            if((v1 & 2) != 0) {
                s1 = kotlinJsonAdapter$Binding0.b;
            }
            if((v1 & 4) != 0) {
                jsonAdapter0 = kotlinJsonAdapter$Binding0.c;
            }
            if((v1 & 8) != 0) {
                kProperty10 = kotlinJsonAdapter$Binding0.d;
            }
            if((v1 & 16) != 0) {
                kParameter0 = kotlinJsonAdapter$Binding0.e;
            }
            if((v1 & 0x20) != 0) {
                v = kotlinJsonAdapter$Binding0.f;
            }
            return kotlinJsonAdapter$Binding0.copy(s, s1, jsonAdapter0, kProperty10, kParameter0, v);
        }

        // 去混淆评级： 中等(60)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 || object0 instanceof Binding && Intrinsics.areEqual(this.a, ((Binding)object0).a) && Intrinsics.areEqual(this.b, ((Binding)object0).b) && Intrinsics.areEqual(this.c, ((Binding)object0).c) && Intrinsics.areEqual(this.d, ((Binding)object0).d) && Intrinsics.areEqual(this.e, ((Binding)object0).e) && this.f == ((Binding)object0).f;
        }

        public final Object get(Object object0) {
            return this.d.get(object0);
        }

        @NotNull
        public final JsonAdapter getAdapter() {
            return this.c;
        }

        @Nullable
        public final String getJsonName() {
            return this.b;
        }

        @NotNull
        public final String getName() {
            return this.a;
        }

        @Nullable
        public final KParameter getParameter() {
            return this.e;
        }

        @NotNull
        public final KProperty1 getProperty() {
            return this.d;
        }

        public final int getPropertyIndex() {
            return this.f;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            int v3 = this.c == null ? 0 : this.c.hashCode();
            int v4 = this.d == null ? 0 : this.d.hashCode();
            KParameter kParameter0 = this.e;
            if(kParameter0 != null) {
                v = kParameter0.hashCode();
            }
            return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v) * 0x1F + this.f;
        }

        public final void set(Object object0, Object object1) {
            if(object1 != KotlinJsonAdapterKt.a) {
                KProperty1 kProperty10 = this.d;
                if(kProperty10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K, P>");
                }
                ((KMutableProperty1)kProperty10).set(object0, object1);
            }
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Binding(name=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", jsonName=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", adapter=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", property=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", parameter=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", propertyIndex=");
            return a.c(this.f, ")", stringBuilder0);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\'\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B%\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001A\u0004\u0018\u00010\u00032\u0006\u0010\n\u001A\u00020\u00022\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0011\u001A\u0004\u0018\u00010\u00032\u0006\u0010\n\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0017\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$IndexedParameterMap;", "Lkotlin/collections/AbstractMutableMap;", "Lkotlin/reflect/KParameter;", "", "", "parameterKeys", "", "parameterValues", "<init>", "(Ljava/util/List;[Ljava/lang/Object;)V", "key", "value", "put", "(Lkotlin/reflect/KParameter;Ljava/lang/Object;)Ljava/lang/Object;", "", "containsKey", "(Lkotlin/reflect/KParameter;)Z", "get", "(Lkotlin/reflect/KParameter;)Ljava/lang/Object;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "reflect"}, k = 1, mv = {1, 4, 2})
    public static final class IndexedParameterMap extends AbstractMutableMap {
        public final List a;
        public final Object[] b;

        public IndexedParameterMap(@NotNull List list0, @NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(list0, "parameterKeys");
            Intrinsics.checkNotNullParameter(arr_object, "parameterValues");
            super();
            this.a = list0;
            this.b = arr_object;
        }

        // 去混淆评级： 低(20)
        @Override
        public final boolean containsKey(Object object0) {
            return object0 instanceof KParameter ? this.containsKey(((KParameter)object0)) : false;
        }

        public boolean containsKey(@NotNull KParameter kParameter0) {
            Intrinsics.checkNotNullParameter(kParameter0, "key");
            return this.b[kParameter0.getIndex()] != KotlinJsonAdapterKt.a;
        }

        // 去混淆评级： 低(20)
        @Override
        public final Object get(Object object0) {
            return object0 instanceof KParameter ? this.get(((KParameter)object0)) : null;
        }

        @Nullable
        public Object get(@NotNull KParameter kParameter0) {
            Intrinsics.checkNotNullParameter(kParameter0, "key");
            Object object0 = this.b[kParameter0.getIndex()];
            return object0 == KotlinJsonAdapterKt.a ? null : object0;
        }

        @Override  // kotlin.collections.AbstractMutableMap
        @NotNull
        public Set getEntries() {
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.a, 10));
            int v = 0;
            for(Object object0: this.a) {
                if(v < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList0.add(new AbstractMap.SimpleEntry(((KParameter)object0), this.b[v]));
                ++v;
            }
            Set set0 = new LinkedHashSet();
            for(Object object1: arrayList0) {
                if(((AbstractMap.SimpleEntry)object1).getValue() != KotlinJsonAdapterKt.a) {
                    set0.add(object1);
                }
            }
            return set0;
        }

        // 去混淆评级： 低(20)
        @Override
        public final Object getOrDefault(Object object0, Object object1) {
            return object0 instanceof KParameter ? this.getOrDefault(((KParameter)object0), object1) : object1;
        }

        public Object getOrDefault(KParameter kParameter0, Object object0) {
            return super.getOrDefault(kParameter0, object0);
        }

        @Override  // kotlin.collections.AbstractMutableMap
        public Object put(Object object0, Object object1) {
            return this.put(((KParameter)object0), object1);
        }

        @Nullable
        public Object put(@NotNull KParameter kParameter0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(kParameter0, "key");
            return null;
        }

        // 去混淆评级： 低(20)
        @Override
        public final Object remove(Object object0) {
            return object0 instanceof KParameter ? this.remove(((KParameter)object0)) : null;
        }

        public Object remove(KParameter kParameter0) {
            return super.remove(kParameter0);
        }

        // 去混淆评级： 低(20)
        @Override
        public final boolean remove(Object object0, Object object1) {
            return object0 instanceof KParameter ? this.remove(((KParameter)object0), object1) : false;
        }

        public boolean remove(KParameter kParameter0, Object object0) {
            return super.remove(kParameter0, object0);
        }
    }

    public final KFunction a;
    public final List b;
    public final List c;
    public final Options d;

    public KotlinJsonAdapter(@NotNull KFunction kFunction0, @NotNull List list0, @NotNull List list1, @NotNull Options jsonReader$Options0) {
        Intrinsics.checkNotNullParameter(kFunction0, "constructor");
        Intrinsics.checkNotNullParameter(list0, "allBindings");
        Intrinsics.checkNotNullParameter(list1, "nonTransientBindings");
        Intrinsics.checkNotNullParameter(jsonReader$Options0, "options");
        super();
        this.a = kFunction0;
        this.b = list0;
        this.c = list1;
        this.d = jsonReader$Options0;
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public Object fromJson(@NotNull JsonReader jsonReader0) {
        Intrinsics.checkNotNullParameter(jsonReader0, "reader");
        KFunction kFunction0 = this.a;
        int v = kFunction0.getParameters().size();
        List list0 = this.b;
        int v1 = list0.size();
        Object[] arr_object = new Object[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = KotlinJsonAdapterKt.a;
        }
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            int v3 = jsonReader0.selectName(this.d);
            if(v3 == -1) {
                jsonReader0.skipName();
                jsonReader0.skipValue();
                continue;
            }
            Binding kotlinJsonAdapter$Binding0 = (Binding)this.c.get(v3);
            int v4 = kotlinJsonAdapter$Binding0.getPropertyIndex();
            if(arr_object[v4] != KotlinJsonAdapterKt.a) {
                throw new JsonDataException("Multiple values for \'" + kotlinJsonAdapter$Binding0.getProperty().getName() + "\' at " + "$");
            }
            Object object0 = kotlinJsonAdapter$Binding0.getAdapter().fromJson(jsonReader0);
            arr_object[v4] = object0;
            if(object0 != null || kotlinJsonAdapter$Binding0.getProperty().getReturnType().isMarkedNullable()) {
                continue;
            }
            JsonDataException jsonDataException0 = Util.unexpectedNull(kotlinJsonAdapter$Binding0.getProperty().getName(), kotlinJsonAdapter$Binding0.getJsonName(), jsonReader0);
            Intrinsics.checkNotNullExpressionValue(jsonDataException0, "Util.unexpectedNull(\n   …         reader\n        )");
            throw jsonDataException0;
        }
        jsonReader0.endObject();
        boolean z = list0.size() == v;
        for(int v5 = 0; true; ++v5) {
            String s = null;
            if(v5 >= v) {
                break;
            }
            if(arr_object[v5] == KotlinJsonAdapterKt.a) {
                if(((KParameter)kFunction0.getParameters().get(v5)).isOptional()) {
                    z = false;
                }
                else {
                    if(((KParameter)kFunction0.getParameters().get(v5)).getType().isMarkedNullable()) {
                        arr_object[v5] = null;
                        continue;
                    }
                    String s1 = ((KParameter)kFunction0.getParameters().get(v5)).getName();
                    Binding kotlinJsonAdapter$Binding1 = (Binding)list0.get(v5);
                    if(kotlinJsonAdapter$Binding1 != null) {
                        s = kotlinJsonAdapter$Binding1.getJsonName();
                    }
                    JsonDataException jsonDataException1 = Util.missingProperty(s1, s, jsonReader0);
                    Intrinsics.checkNotNullExpressionValue(jsonDataException1, "Util.missingProperty(\n  …       reader\n          )");
                    throw jsonDataException1;
                }
            }
        }
        Object object1 = z ? kFunction0.call(Arrays.copyOf(arr_object, v1)) : kFunction0.callBy(new IndexedParameterMap(kFunction0.getParameters(), arr_object));
        int v6 = list0.size();
        while(v < v6) {
            Object object2 = list0.get(v);
            Intrinsics.checkNotNull(object2);
            ((Binding)object2).set(object1, arr_object[v]);
            ++v;
        }
        return object1;
    }

    @NotNull
    public final List getAllBindings() {
        return this.b;
    }

    @NotNull
    public final KFunction getConstructor() {
        return this.a;
    }

    @NotNull
    public final List getNonTransientBindings() {
        return this.c;
    }

    @NotNull
    public final Options getOptions() {
        return this.d;
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(jsonWriter0, "writer");
        if(object0 == null) {
            throw new NullPointerException("value == null");
        }
        jsonWriter0.beginObject();
        for(Object object1: this.b) {
            Binding kotlinJsonAdapter$Binding0 = (Binding)object1;
            if(kotlinJsonAdapter$Binding0 != null) {
                jsonWriter0.name(kotlinJsonAdapter$Binding0.getName());
                kotlinJsonAdapter$Binding0.getAdapter().toJson(jsonWriter0, kotlinJsonAdapter$Binding0.get(object0));
            }
        }
        jsonWriter0.endObject();
    }

    @Override
    @NotNull
    public String toString() {
        return "KotlinJsonAdapter(" + this.a.getReturnType() + ')';
    }
}

