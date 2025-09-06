package com.kakao.keditor.plugin.itemspec.contentsearch.attrs;

import com.kakao.keditor.plugin.itemspec.EnumList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000B\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001A\u00020\u0004\u0082\u0001\u0007\r\u000E\u000F\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "", "()V", "toCdmValue", "", "Book", "Companion", "Exhibition", "Movie", "Music", "Person", "Play", "Tv", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Book;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Exhibition;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Movie;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Music;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Person;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Play;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Tv;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class Kind {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Book;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Book extends Kind {
        @NotNull
        public static final Book INSTANCE;

        static {
            Book.INSTANCE = new Book();
        }

        private Book() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u0004\u0018\u00010\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006J\u000E\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Companion;", "Lcom/kakao/keditor/plugin/itemspec/EnumList;", "()V", "byNameText", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "name", "", "typeSet", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion implements EnumList {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final Kind byNameText(@Nullable String s) {
            Kind kind0 = Music.INSTANCE;
            if(!Intrinsics.areEqual(s, "kind")) {
                kind0 = Movie.INSTANCE;
                if(!Intrinsics.areEqual(s, "kind")) {
                    kind0 = Tv.INSTANCE;
                    if(!Intrinsics.areEqual(s, "kind")) {
                        kind0 = Book.INSTANCE;
                        if(!Intrinsics.areEqual(s, "kind")) {
                            kind0 = Play.INSTANCE;
                            if(!Intrinsics.areEqual(s, "kind")) {
                                kind0 = Person.INSTANCE;
                                if(!Intrinsics.areEqual(s, "kind")) {
                                    return Intrinsics.areEqual(s, "kind") ? Exhibition.INSTANCE : null;
                                }
                            }
                        }
                    }
                }
            }
            return kind0;
        }

        // 去混淆评级： 中等(140)
        @Override  // com.kakao.keditor.plugin.itemspec.EnumList
        @NotNull
        public Set typeSet() {
            return f0.setOf(new String[]{"kind", "kind", "kind", "kind", "kind", "kind", "kind"});
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Exhibition;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Exhibition extends Kind {
        @NotNull
        public static final Exhibition INSTANCE;

        static {
            Exhibition.INSTANCE = new Exhibition();
        }

        private Exhibition() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Movie;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Movie extends Kind {
        @NotNull
        public static final Movie INSTANCE;

        static {
            Movie.INSTANCE = new Movie();
        }

        private Movie() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Music;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Music extends Kind {
        @NotNull
        public static final Music INSTANCE;

        static {
            Music.INSTANCE = new Music();
        }

        private Music() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Person;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Person extends Kind {
        @NotNull
        public static final Person INSTANCE;

        static {
            Person.INSTANCE = new Person();
        }

        private Person() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Play;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Play extends Kind {
        @NotNull
        public static final Play INSTANCE;

        static {
            Play.INSTANCE = new Play();
        }

        private Play() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind$Tv;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "()V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Tv extends Kind {
        @NotNull
        public static final Tv INSTANCE;

        static {
            Tv.INSTANCE = new Tv();
        }

        private Tv() {
            super(null);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        Kind.Companion = new Companion(null);
    }

    private Kind() {
    }

    public Kind(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public final String toCdmValue() [...] // 潜在的解密器
}

