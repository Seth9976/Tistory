package coil;

import coil.decode.Decoder.Factory;
import coil.decode.Decoder;
import coil.fetch.Fetcher;
import coil.fetch.SourceResult;
import coil.intercept.Interceptor;
import coil.key.Keyer;
import coil.map.Mapper;
import coil.request.Options;
import coil.util.-Collections;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00014B\t\b\u0016\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\u0007\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\n\u0010\u000BJ?\u0010\u0012\u001A\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u00102\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000EH\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u00102\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000EH\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001A\u0010\u001BR\u001D\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u001D0\u001C8\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!RA\u0010\'\u001A,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010#\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010$0\u00100\u001C8\u0006\u00A2\u0006\f\n\u0004\b%\u0010\u001F\u001A\u0004\b&\u0010!R9\u0010+\u001A$\u0012 \u0012\u001E\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010$0\u00100\u001C8\u0006\u00A2\u0006\f\n\u0004\b)\u0010\u001F\u001A\u0004\b*\u0010!R9\u0010/\u001A$\u0012 \u0012\u001E\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010,\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010$0\u00100\u001C8\u0006\u00A2\u0006\f\n\u0004\b-\u0010\u001F\u001A\u0004\b.\u0010!R\u001D\u00103\u001A\b\u0012\u0004\u0012\u0002000\u001C8\u0006\u00A2\u0006\f\n\u0004\b1\u0010\u001F\u001A\u0004\b2\u0010!\u00A8\u00065"}, d2 = {"Lcoil/ComponentRegistry;", "", "<init>", "()V", "data", "Lcoil/request/Options;", "options", "map", "(Ljava/lang/Object;Lcoil/request/Options;)Ljava/lang/Object;", "", "key", "(Ljava/lang/Object;Lcoil/request/Options;)Ljava/lang/String;", "Lcoil/ImageLoader;", "imageLoader", "", "startIndex", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher;", "newFetcher", "(Ljava/lang/Object;Lcoil/request/Options;Lcoil/ImageLoader;I)Lkotlin/Pair;", "Lcoil/fetch/SourceResult;", "result", "Lcoil/decode/Decoder;", "newDecoder", "(Lcoil/fetch/SourceResult;Lcoil/request/Options;Lcoil/ImageLoader;I)Lkotlin/Pair;", "Lcoil/ComponentRegistry$Builder;", "newBuilder", "()Lcoil/ComponentRegistry$Builder;", "", "Lcoil/intercept/Interceptor;", "a", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "interceptors", "Lcoil/map/Mapper;", "Ljava/lang/Class;", "b", "getMappers", "mappers", "Lcoil/key/Keyer;", "c", "getKeyers", "keyers", "Lcoil/fetch/Fetcher$Factory;", "d", "getFetcherFactories", "fetcherFactories", "Lcoil/decode/Decoder$Factory;", "e", "getDecoderFactories", "decoderFactories", "Builder", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComponentRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n12#2,2:178\n15#2:181\n12#2,4:182\n1#3:180\n*S KotlinDebug\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n*L\n38#1:178,2\n38#1:181\n52#1:182,4\n*E\n"})
public final class ComponentRegistry {
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\t\b\u0016\u00A2\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ.\u0010\t\u001A\u00020\u0000\"\n\b\u0000\u0010\u000B\u0018\u0001*\u00020\u00012\u0010\u0010\r\u001A\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\fH\u0086\b\u00A2\u0006\u0004\b\t\u0010\u000EJ7\u0010\t\u001A\u00020\u0000\"\b\b\u0000\u0010\u000B*\u00020\u00012\u0010\u0010\r\u001A\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F\u00A2\u0006\u0004\b\t\u0010\u0011J*\u0010\t\u001A\u00020\u0000\"\n\b\u0000\u0010\u000B\u0018\u0001*\u00020\u00012\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b\u00A2\u0006\u0004\b\t\u0010\u0014J3\u0010\t\u001A\u00020\u0000\"\b\b\u0000\u0010\u000B*\u00020\u00012\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F\u00A2\u0006\u0004\b\t\u0010\u0015J*\u0010\t\u001A\u00020\u0000\"\n\b\u0000\u0010\u000B\u0018\u0001*\u00020\u00012\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\b\u00A2\u0006\u0004\b\t\u0010\u0018J3\u0010\t\u001A\u00020\u0000\"\b\b\u0000\u0010\u000B*\u00020\u00012\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F\u00A2\u0006\u0004\b\t\u0010\u0019J\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u001A\u00A2\u0006\u0004\b\t\u0010\u001BJ\r\u0010\u001C\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001C\u0010\u001DR \u0010#\u001A\b\u0012\u0004\u0012\u00020\u00070\u001E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R@\u0010\'\u001A(\u0012$\u0012\"\u0012\u0010\u0012\u000E\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000F0$0\u001E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b%\u0010 \u001A\u0004\b&\u0010\"R<\u0010*\u001A$\u0012 \u0012\u001E\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000F0$0\u001E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b(\u0010 \u001A\u0004\b)\u0010\"R<\u0010-\u001A$\u0012 \u0012\u001E\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000F0$0\u001E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b+\u0010 \u001A\u0004\b,\u0010\"R \u00100\u001A\b\u0012\u0004\u0012\u00020\u001A0\u001E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b.\u0010 \u001A\u0004\b/\u0010\"\u00A8\u00061"}, d2 = {"Lcoil/ComponentRegistry$Builder;", "", "<init>", "()V", "Lcoil/ComponentRegistry;", "registry", "(Lcoil/ComponentRegistry;)V", "Lcoil/intercept/Interceptor;", "interceptor", "add", "(Lcoil/intercept/Interceptor;)Lcoil/ComponentRegistry$Builder;", "T", "Lcoil/map/Mapper;", "mapper", "(Lcoil/map/Mapper;)Lcoil/ComponentRegistry$Builder;", "Ljava/lang/Class;", "type", "(Lcoil/map/Mapper;Ljava/lang/Class;)Lcoil/ComponentRegistry$Builder;", "Lcoil/key/Keyer;", "keyer", "(Lcoil/key/Keyer;)Lcoil/ComponentRegistry$Builder;", "(Lcoil/key/Keyer;Ljava/lang/Class;)Lcoil/ComponentRegistry$Builder;", "Lcoil/fetch/Fetcher$Factory;", "factory", "(Lcoil/fetch/Fetcher$Factory;)Lcoil/ComponentRegistry$Builder;", "(Lcoil/fetch/Fetcher$Factory;Ljava/lang/Class;)Lcoil/ComponentRegistry$Builder;", "Lcoil/decode/Decoder$Factory;", "(Lcoil/decode/Decoder$Factory;)Lcoil/ComponentRegistry$Builder;", "build", "()Lcoil/ComponentRegistry;", "", "a", "Ljava/util/List;", "getInterceptors$coil_base_release", "()Ljava/util/List;", "interceptors", "Lkotlin/Pair;", "b", "getMappers$coil_base_release", "mappers", "c", "getKeyers$coil_base_release", "keyers", "d", "getFetcherFactories$coil_base_release", "fetcherFactories", "e", "getDecoderFactories$coil_base_release", "decoderFactories", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Builder {
        public final List a;
        public final List b;
        public final List c;
        public final List d;
        public final List e;

        public Builder() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public Builder(@NotNull ComponentRegistry componentRegistry0) {
            this.a = CollectionsKt___CollectionsKt.toMutableList(componentRegistry0.getInterceptors());
            this.b = CollectionsKt___CollectionsKt.toMutableList(componentRegistry0.getMappers());
            this.c = CollectionsKt___CollectionsKt.toMutableList(componentRegistry0.getKeyers());
            this.d = CollectionsKt___CollectionsKt.toMutableList(componentRegistry0.getFetcherFactories());
            this.e = CollectionsKt___CollectionsKt.toMutableList(componentRegistry0.getDecoderFactories());
        }

        @NotNull
        public final Builder add(@NotNull Factory decoder$Factory0) {
            this.e.add(decoder$Factory0);
            return this;
        }

        public final Builder add(coil.fetch.Fetcher.Factory fetcher$Factory0) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return this.add(fetcher$Factory0, Object.class);
        }

        @NotNull
        public final Builder add(@NotNull coil.fetch.Fetcher.Factory fetcher$Factory0, @NotNull Class class0) {
            Pair pair0 = TuplesKt.to(fetcher$Factory0, class0);
            this.d.add(pair0);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull Interceptor interceptor0) {
            this.a.add(interceptor0);
            return this;
        }

        public final Builder add(Keyer keyer0) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return this.add(keyer0, Object.class);
        }

        @NotNull
        public final Builder add(@NotNull Keyer keyer0, @NotNull Class class0) {
            Pair pair0 = TuplesKt.to(keyer0, class0);
            this.c.add(pair0);
            return this;
        }

        public final Builder add(Mapper mapper0) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return this.add(mapper0, Object.class);
        }

        @NotNull
        public final Builder add(@NotNull Mapper mapper0, @NotNull Class class0) {
            Pair pair0 = TuplesKt.to(mapper0, class0);
            this.b.add(pair0);
            return this;
        }

        @NotNull
        public final ComponentRegistry build() {
            return new ComponentRegistry(-Collections.toImmutableList(this.a), -Collections.toImmutableList(this.b), -Collections.toImmutableList(this.c), -Collections.toImmutableList(this.d), -Collections.toImmutableList(this.e), null);
        }

        @NotNull
        public final List getDecoderFactories$coil_base_release() {
            return this.e;
        }

        @NotNull
        public final List getFetcherFactories$coil_base_release() {
            return this.d;
        }

        @NotNull
        public final List getInterceptors$coil_base_release() {
            return this.a;
        }

        @NotNull
        public final List getKeyers$coil_base_release() {
            return this.c;
        }

        @NotNull
        public final List getMappers$coil_base_release() {
            return this.b;
        }
    }

    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public ComponentRegistry() {
        this(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    public ComponentRegistry(List list0, List list1, List list2, List list3, List list4) {
        this.a = list0;
        this.b = list1;
        this.c = list2;
        this.d = list3;
        this.e = list4;
    }

    public ComponentRegistry(List list0, List list1, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(list0, list1, list2, list3, list4);
    }

    @NotNull
    public final List getDecoderFactories() {
        return this.e;
    }

    @NotNull
    public final List getFetcherFactories() {
        return this.d;
    }

    @NotNull
    public final List getInterceptors() {
        return this.a;
    }

    @NotNull
    public final List getKeyers() {
        return this.c;
    }

    @NotNull
    public final List getMappers() {
        return this.b;
    }

    @Nullable
    public final String key(@NotNull Object object0, @NotNull Options options0) {
        List list0 = this.c;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Pair pair0 = (Pair)list0.get(v1);
            Keyer keyer0 = (Keyer)pair0.component1();
            if(((Class)pair0.component2()).isAssignableFrom(object0.getClass())) {
                Intrinsics.checkNotNull(keyer0, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String s = keyer0.key(object0, options0);
                if(s != null) {
                    return s;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Object map(@NotNull Object object0, @NotNull Options options0) {
        List list0 = this.b;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Pair pair0 = (Pair)list0.get(v1);
            Mapper mapper0 = (Mapper)pair0.component1();
            if(((Class)pair0.component2()).isAssignableFrom(object0.getClass())) {
                Intrinsics.checkNotNull(mapper0, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object object1 = mapper0.map(object0, options0);
                if(object1 != null) {
                    object0 = object1;
                }
            }
        }
        return object0;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @JvmOverloads
    @Nullable
    public final Pair newDecoder(@NotNull SourceResult sourceResult0, @NotNull Options options0, @NotNull ImageLoader imageLoader0) {
        return ComponentRegistry.newDecoder$default(this, sourceResult0, options0, imageLoader0, 0, 8, null);
    }

    @JvmOverloads
    @Nullable
    public final Pair newDecoder(@NotNull SourceResult sourceResult0, @NotNull Options options0, @NotNull ImageLoader imageLoader0, int v) {
        List list0 = this.e;
        int v1 = list0.size();
        while(v < v1) {
            Decoder decoder0 = ((Factory)list0.get(v)).create(sourceResult0, options0, imageLoader0);
            if(decoder0 != null) {
                return TuplesKt.to(decoder0, v);
            }
            ++v;
        }
        return null;
    }

    public static Pair newDecoder$default(ComponentRegistry componentRegistry0, SourceResult sourceResult0, Options options0, ImageLoader imageLoader0, int v, int v1, Object object0) {
        if((v1 & 8) != 0) {
            v = 0;
        }
        return componentRegistry0.newDecoder(sourceResult0, options0, imageLoader0, v);
    }

    @JvmOverloads
    @Nullable
    public final Pair newFetcher(@NotNull Object object0, @NotNull Options options0, @NotNull ImageLoader imageLoader0) {
        return ComponentRegistry.newFetcher$default(this, object0, options0, imageLoader0, 0, 8, null);
    }

    @JvmOverloads
    @Nullable
    public final Pair newFetcher(@NotNull Object object0, @NotNull Options options0, @NotNull ImageLoader imageLoader0, int v) {
        List list0 = this.d;
        int v1 = list0.size();
        while(v < v1) {
            Pair pair0 = (Pair)list0.get(v);
            coil.fetch.Fetcher.Factory fetcher$Factory0 = (coil.fetch.Fetcher.Factory)pair0.component1();
            if(((Class)pair0.component2()).isAssignableFrom(object0.getClass())) {
                Intrinsics.checkNotNull(fetcher$Factory0, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                Fetcher fetcher0 = fetcher$Factory0.create(object0, options0, imageLoader0);
                if(fetcher0 != null) {
                    return TuplesKt.to(fetcher0, v);
                }
            }
            ++v;
        }
        return null;
    }

    public static Pair newFetcher$default(ComponentRegistry componentRegistry0, Object object0, Options options0, ImageLoader imageLoader0, int v, int v1, Object object1) {
        if((v1 & 8) != 0) {
            v = 0;
        }
        return componentRegistry0.newFetcher(object0, options0, imageLoader0, v);
    }
}

