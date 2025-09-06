package com.kakao.keditor.plugin.itemspec.contentsearch.entity;

import androidx.room.a;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Ready;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b*\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00CF\u0001\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0005\u0012\b\b\u0002\u0010\t\u001A\u00020\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0005\u0012\b\b\u0002\u0010\f\u001A\u00020\u0005\u0012\b\b\u0002\u0010\r\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0019J\t\u0010M\u001A\u00020\u0003H\u00C6\u0003J\t\u0010N\u001A\u00020\u0005H\u00C6\u0003J\t\u0010O\u001A\u00020\u0005H\u00C6\u0003J\t\u0010P\u001A\u00020\u0005H\u00C6\u0003J\t\u0010Q\u001A\u00020\u0005H\u00C6\u0003J\t\u0010R\u001A\u00020\u0005H\u00C6\u0003J\t\u0010S\u001A\u00020\u0005H\u00C6\u0003J\t\u0010T\u001A\u00020\u0005H\u00C6\u0003J\t\u0010U\u001A\u00020\u0005H\u00C6\u0003J\t\u0010V\u001A\u00020\u0005H\u00C6\u0003J\t\u0010W\u001A\u00020\u0005H\u00C6\u0003J\t\u0010X\u001A\u00020\u0005H\u00C6\u0003J\t\u0010Y\u001A\u00020\u0005H\u00C6\u0003J\t\u0010Z\u001A\u00020\u0005H\u00C6\u0003J\t\u0010[\u001A\u00020\u0005H\u00C6\u0003J\t\u0010\\\u001A\u00020\u0005H\u00C6\u0003J\t\u0010]\u001A\u00020\u0005H\u00C6\u0003J\t\u0010^\u001A\u00020\u0005H\u00C6\u0003J\t\u0010_\u001A\u00020\u0005H\u00C6\u0003J\t\u0010`\u001A\u00020\u0005H\u00C6\u0003J\t\u0010a\u001A\u00020\u0005H\u00C6\u0003J\u00DB\u0001\u0010b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0011\u001A\u00020\u00052\b\b\u0002\u0010\u0012\u001A\u00020\u00052\b\b\u0002\u0010\u0013\u001A\u00020\u00052\b\b\u0002\u0010\u0014\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u00052\b\b\u0002\u0010\u0016\u001A\u00020\u00052\b\b\u0002\u0010\u0017\u001A\u00020\u00052\b\b\u0002\u0010\u0018\u001A\u00020\u0005H\u00C6\u0001J\u0013\u0010c\u001A\u0002002\b\u0010d\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010e\u001A\u00020fH\u00D6\u0001J\t\u0010g\u001A\u00020\u0005H\u00D6\u0001R\u001A\u0010\r\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u001A\u0010\t\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001B\"\u0004\b\u001F\u0010\u001DR\u001A\u0010\b\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b \u0010\u001B\"\u0004\b!\u0010\u001DR\u001A\u0010\u0011\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010\u001B\"\u0004\b#\u0010\u001DR\u001A\u0010\u000E\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b$\u0010\u001B\"\u0004\b%\u0010\u001DR\u001A\u0010\u000F\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\u001B\"\u0004\b\'\u0010\u001DR\u001A\u0010\u0010\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010\u001B\"\u0004\b)\u0010\u001DR\u001A\u0010\f\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010\u001B\"\u0004\b+\u0010\u001DR\u001A\u0010\u0017\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b,\u0010\u001B\"\u0004\b-\u0010\u001DR\u0011\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b.\u0010\u001BR\u0011\u0010/\u001A\u0002008F\u00A2\u0006\u0006\u001A\u0004\b/\u00101R\u0011\u00102\u001A\u0002008F\u00A2\u0006\u0006\u001A\u0004\b2\u00101R\u001A\u0010\u0014\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b3\u0010\u001B\"\u0004\b4\u0010\u001DR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u00106R\u001A\u00107\u001A\u000208X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001A\u0010\u0018\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b=\u0010\u001B\"\u0004\b>\u0010\u001DR\u001A\u0010\u0015\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b?\u0010\u001B\"\u0004\b@\u0010\u001DR\u001A\u0010\u0013\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bA\u0010\u001B\"\u0004\bB\u0010\u001DR\u001A\u0010\u0012\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bC\u0010\u001B\"\u0004\bD\u0010\u001DR\u001A\u0010\n\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bE\u0010\u001B\"\u0004\bF\u0010\u001DR\u001A\u0010\u000B\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bG\u0010\u001B\"\u0004\bH\u0010\u001DR\u001A\u0010\u0016\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bI\u0010\u001B\"\u0004\bJ\u0010\u001DR\u0011\u0010\u0007\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bK\u0010\u001BR\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bL\u0010\u001B\u00A8\u0006h"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/entity/ContentItem;", "", "kind", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "url", "", "image", "title", "artist", "albumTitle", "rating", "releaseDate", "directors", "actors", "broadcastDayOfWeek", "broadcastTime", "channel", "authors", "publisher", "publicationDate", "jobTitles", "memberOf", "startDate", "endDate", "location", "(Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActors", "()Ljava/lang/String;", "setActors", "(Ljava/lang/String;)V", "getAlbumTitle", "setAlbumTitle", "getArtist", "setArtist", "getAuthors", "setAuthors", "getBroadcastDayOfWeek", "setBroadcastDayOfWeek", "getBroadcastTime", "setBroadcastTime", "getChannel", "setChannel", "getDirectors", "setDirectors", "getEndDate", "setEndDate", "getImage", "isBroadcastTimeNotEmpty", "", "()Z", "isDateNotEmpty", "getJobTitles", "setJobTitles", "getKind", "()Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "loadingStatus", "Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "getLoadingStatus", "()Lcom/kakao/keditor/plugin/attrs/LoadingStatus;", "setLoadingStatus", "(Lcom/kakao/keditor/plugin/attrs/LoadingStatus;)V", "getLocation", "setLocation", "getMemberOf", "setMemberOf", "getPublicationDate", "setPublicationDate", "getPublisher", "setPublisher", "getRating", "setRating", "getReleaseDate", "setReleaseDate", "getStartDate", "setStartDate", "getTitle", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContentItem {
    @NotNull
    private String actors;
    @NotNull
    private String albumTitle;
    @NotNull
    private String artist;
    @NotNull
    private String authors;
    @NotNull
    private String broadcastDayOfWeek;
    @NotNull
    private String broadcastTime;
    @NotNull
    private String channel;
    @NotNull
    private String directors;
    @NotNull
    private String endDate;
    @NotNull
    private final String image;
    @NotNull
    private String jobTitles;
    @NotNull
    private final Kind kind;
    @NotNull
    private LoadingStatus loadingStatus;
    @NotNull
    private String location;
    @NotNull
    private String memberOf;
    @NotNull
    private String publicationDate;
    @NotNull
    private String publisher;
    @NotNull
    private String rating;
    @NotNull
    private String releaseDate;
    @NotNull
    private String startDate;
    @NotNull
    private final String title;
    @NotNull
    private final String url;

    public ContentItem(@NotNull Kind kind0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @NotNull String s5, @NotNull String s6, @NotNull String s7, @NotNull String s8, @NotNull String s9, @NotNull String s10, @NotNull String s11, @NotNull String s12, @NotNull String s13, @NotNull String s14, @NotNull String s15, @NotNull String s16, @NotNull String s17, @NotNull String s18, @NotNull String s19) {
        Intrinsics.checkNotNullParameter(kind0, "kind");
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(s1, "image");
        Intrinsics.checkNotNullParameter(s2, "title");
        Intrinsics.checkNotNullParameter(s3, "artist");
        Intrinsics.checkNotNullParameter(s4, "albumTitle");
        Intrinsics.checkNotNullParameter(s5, "rating");
        Intrinsics.checkNotNullParameter(s6, "releaseDate");
        Intrinsics.checkNotNullParameter(s7, "directors");
        Intrinsics.checkNotNullParameter(s8, "actors");
        Intrinsics.checkNotNullParameter(s9, "broadcastDayOfWeek");
        Intrinsics.checkNotNullParameter(s10, "broadcastTime");
        Intrinsics.checkNotNullParameter(s11, "channel");
        Intrinsics.checkNotNullParameter(s12, "authors");
        Intrinsics.checkNotNullParameter(s13, "publisher");
        Intrinsics.checkNotNullParameter(s14, "publicationDate");
        Intrinsics.checkNotNullParameter(s15, "jobTitles");
        Intrinsics.checkNotNullParameter(s16, "memberOf");
        Intrinsics.checkNotNullParameter(s17, "startDate");
        Intrinsics.checkNotNullParameter(s18, "endDate");
        Intrinsics.checkNotNullParameter(s19, "location");
        super();
        this.kind = kind0;
        this.url = s;
        this.image = s1;
        this.title = s2;
        this.artist = s3;
        this.albumTitle = s4;
        this.rating = s5;
        this.releaseDate = s6;
        this.directors = s7;
        this.actors = s8;
        this.broadcastDayOfWeek = s9;
        this.broadcastTime = s10;
        this.channel = s11;
        this.authors = s12;
        this.publisher = s13;
        this.publicationDate = s14;
        this.jobTitles = s15;
        this.memberOf = s16;
        this.startDate = s17;
        this.endDate = s18;
        this.location = s19;
        this.loadingStatus = Ready.INSTANCE;
    }

    public ContentItem(Kind kind0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15, String s16, String s17, String s18, String s19, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(kind0, s, s1, s2, ((v & 16) == 0 ? s3 : ""), ((v & 0x20) == 0 ? s4 : ""), ((v & 0x40) == 0 ? s5 : ""), ((v & 0x80) == 0 ? s6 : ""), ((v & 0x100) == 0 ? s7 : ""), ((v & 0x200) == 0 ? s8 : ""), ((v & 0x400) == 0 ? s9 : ""), ((v & 0x800) == 0 ? s10 : ""), ((v & 0x1000) == 0 ? s11 : ""), ((v & 0x2000) == 0 ? s12 : ""), ((v & 0x4000) == 0 ? s13 : ""), ((0x8000 & v) == 0 ? s14 : ""), ((0x10000 & v) == 0 ? s15 : ""), ((0x20000 & v) == 0 ? s16 : ""), ((0x40000 & v) == 0 ? s17 : ""), ((0x80000 & v) == 0 ? s18 : ""), ((v & 0x100000) == 0 ? s19 : ""));
    }

    @NotNull
    public final Kind component1() {
        return this.kind;
    }

    @NotNull
    public final String component10() {
        return this.actors;
    }

    @NotNull
    public final String component11() {
        return this.broadcastDayOfWeek;
    }

    @NotNull
    public final String component12() {
        return this.broadcastTime;
    }

    @NotNull
    public final String component13() {
        return this.channel;
    }

    @NotNull
    public final String component14() {
        return this.authors;
    }

    @NotNull
    public final String component15() {
        return this.publisher;
    }

    @NotNull
    public final String component16() {
        return this.publicationDate;
    }

    @NotNull
    public final String component17() {
        return this.jobTitles;
    }

    @NotNull
    public final String component18() {
        return this.memberOf;
    }

    @NotNull
    public final String component19() {
        return this.startDate;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final String component20() {
        return this.endDate;
    }

    @NotNull
    public final String component21() {
        return this.location;
    }

    @NotNull
    public final String component3() {
        return this.image;
    }

    @NotNull
    public final String component4() {
        return this.title;
    }

    @NotNull
    public final String component5() {
        return this.artist;
    }

    @NotNull
    public final String component6() {
        return this.albumTitle;
    }

    @NotNull
    public final String component7() {
        return this.rating;
    }

    @NotNull
    public final String component8() {
        return this.releaseDate;
    }

    @NotNull
    public final String component9() {
        return this.directors;
    }

    @NotNull
    public final ContentItem copy(@NotNull Kind kind0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @NotNull String s5, @NotNull String s6, @NotNull String s7, @NotNull String s8, @NotNull String s9, @NotNull String s10, @NotNull String s11, @NotNull String s12, @NotNull String s13, @NotNull String s14, @NotNull String s15, @NotNull String s16, @NotNull String s17, @NotNull String s18, @NotNull String s19) {
        Intrinsics.checkNotNullParameter(kind0, "kind");
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(s1, "image");
        Intrinsics.checkNotNullParameter(s2, "title");
        Intrinsics.checkNotNullParameter(s3, "artist");
        Intrinsics.checkNotNullParameter(s4, "albumTitle");
        Intrinsics.checkNotNullParameter(s5, "rating");
        Intrinsics.checkNotNullParameter(s6, "releaseDate");
        Intrinsics.checkNotNullParameter(s7, "directors");
        Intrinsics.checkNotNullParameter(s8, "actors");
        Intrinsics.checkNotNullParameter(s9, "broadcastDayOfWeek");
        Intrinsics.checkNotNullParameter(s10, "broadcastTime");
        Intrinsics.checkNotNullParameter(s11, "channel");
        Intrinsics.checkNotNullParameter(s12, "authors");
        Intrinsics.checkNotNullParameter(s13, "publisher");
        Intrinsics.checkNotNullParameter(s14, "publicationDate");
        Intrinsics.checkNotNullParameter(s15, "jobTitles");
        Intrinsics.checkNotNullParameter(s16, "memberOf");
        Intrinsics.checkNotNullParameter(s17, "startDate");
        Intrinsics.checkNotNullParameter(s18, "endDate");
        Intrinsics.checkNotNullParameter(s19, "location");
        return new ContentItem(kind0, s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19);
    }

    public static ContentItem copy$default(ContentItem contentItem0, Kind kind0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15, String s16, String s17, String s18, String s19, int v, Object object0) {
        Kind kind1 = (v & 1) == 0 ? kind0 : contentItem0.kind;
        String s20 = (v & 2) == 0 ? s : contentItem0.url;
        String s21 = (v & 4) == 0 ? s1 : contentItem0.image;
        String s22 = (v & 8) == 0 ? s2 : contentItem0.title;
        String s23 = (v & 16) == 0 ? s3 : contentItem0.artist;
        String s24 = (v & 0x20) == 0 ? s4 : contentItem0.albumTitle;
        String s25 = (v & 0x40) == 0 ? s5 : contentItem0.rating;
        String s26 = (v & 0x80) == 0 ? s6 : contentItem0.releaseDate;
        String s27 = (v & 0x100) == 0 ? s7 : contentItem0.directors;
        String s28 = (v & 0x200) == 0 ? s8 : contentItem0.actors;
        String s29 = (v & 0x400) == 0 ? s9 : contentItem0.broadcastDayOfWeek;
        String s30 = (v & 0x800) == 0 ? s10 : contentItem0.broadcastTime;
        String s31 = (v & 0x1000) == 0 ? s11 : contentItem0.channel;
        String s32 = (v & 0x2000) == 0 ? s12 : contentItem0.authors;
        String s33 = (v & 0x4000) == 0 ? s13 : contentItem0.publisher;
        String s34 = (v & 0x8000) == 0 ? s14 : contentItem0.publicationDate;
        String s35 = (v & 0x10000) == 0 ? s15 : contentItem0.jobTitles;
        String s36 = (v & 0x20000) == 0 ? s16 : contentItem0.memberOf;
        String s37 = (v & 0x40000) == 0 ? s17 : contentItem0.startDate;
        String s38 = (v & 0x80000) == 0 ? s18 : contentItem0.endDate;
        return (v & 0x100000) == 0 ? contentItem0.copy(kind1, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s31, s32, s33, s34, s35, s36, s37, s38, s19) : contentItem0.copy(kind1, s20, s21, s22, s23, s24, s25, s26, s27, s28, s29, s30, s31, s32, s33, s34, s35, s36, s37, s38, contentItem0.location);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ContentItem)) {
            return false;
        }
        ContentItem contentItem0 = (ContentItem)object0;
        if(!Intrinsics.areEqual(this.kind, contentItem0.kind)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.url, contentItem0.url)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.image, contentItem0.image)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, contentItem0.title)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.artist, contentItem0.artist)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.albumTitle, contentItem0.albumTitle)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.rating, contentItem0.rating)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.releaseDate, contentItem0.releaseDate)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.directors, contentItem0.directors)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.actors, contentItem0.actors)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.broadcastDayOfWeek, contentItem0.broadcastDayOfWeek)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.broadcastTime, contentItem0.broadcastTime)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.channel, contentItem0.channel)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.authors, contentItem0.authors)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.publisher, contentItem0.publisher)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.publicationDate, contentItem0.publicationDate)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.jobTitles, contentItem0.jobTitles)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.memberOf, contentItem0.memberOf)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.startDate, contentItem0.startDate)) {
            return false;
        }
        return Intrinsics.areEqual(this.endDate, contentItem0.endDate) ? Intrinsics.areEqual(this.location, contentItem0.location) : false;
    }

    @NotNull
    public final String getActors() {
        return this.actors;
    }

    @NotNull
    public final String getAlbumTitle() {
        return this.albumTitle;
    }

    @NotNull
    public final String getArtist() {
        return this.artist;
    }

    @NotNull
    public final String getAuthors() {
        return this.authors;
    }

    @NotNull
    public final String getBroadcastDayOfWeek() {
        return this.broadcastDayOfWeek;
    }

    @NotNull
    public final String getBroadcastTime() {
        return this.broadcastTime;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getDirectors() {
        return this.directors;
    }

    @NotNull
    public final String getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getJobTitles() {
        return this.jobTitles;
    }

    @NotNull
    public final Kind getKind() {
        return this.kind;
    }

    @NotNull
    public final LoadingStatus getLoadingStatus() {
        return this.loadingStatus;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final String getMemberOf() {
        return this.memberOf;
    }

    @NotNull
    public final String getPublicationDate() {
        return this.publicationDate;
    }

    @NotNull
    public final String getPublisher() {
        return this.publisher;
    }

    @NotNull
    public final String getRating() {
        return this.rating;
    }

    @NotNull
    public final String getReleaseDate() {
        return this.releaseDate;
    }

    @NotNull
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override
    public int hashCode() {
        return this.location.hashCode() + q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(q.c(this.kind.hashCode() * 0x1F, 0x1F, this.url), 0x1F, this.image), 0x1F, this.title), 0x1F, this.artist), 0x1F, this.albumTitle), 0x1F, this.rating), 0x1F, this.releaseDate), 0x1F, this.directors), 0x1F, this.actors), 0x1F, this.broadcastDayOfWeek), 0x1F, this.broadcastTime), 0x1F, this.channel), 0x1F, this.authors), 0x1F, this.publisher), 0x1F, this.publicationDate), 0x1F, this.jobTitles), 0x1F, this.memberOf), 0x1F, this.startDate), 0x1F, this.endDate);
    }

    public final boolean isBroadcastTimeNotEmpty() {
        return this.broadcastDayOfWeek.length() > 0 && this.broadcastTime.length() > 0;
    }

    public final boolean isDateNotEmpty() {
        return this.startDate.length() > 0 && this.endDate.length() > 0;
    }

    public final void setActors(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.actors = s;
    }

    public final void setAlbumTitle(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.albumTitle = s;
    }

    public final void setArtist(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.artist = s;
    }

    public final void setAuthors(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.authors = s;
    }

    public final void setBroadcastDayOfWeek(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.broadcastDayOfWeek = s;
    }

    public final void setBroadcastTime(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.broadcastTime = s;
    }

    public final void setChannel(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.channel = s;
    }

    public final void setDirectors(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.directors = s;
    }

    public final void setEndDate(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.endDate = s;
    }

    public final void setJobTitles(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.jobTitles = s;
    }

    public final void setLoadingStatus(@NotNull LoadingStatus loadingStatus0) {
        Intrinsics.checkNotNullParameter(loadingStatus0, "<set-?>");
        this.loadingStatus = loadingStatus0;
    }

    public final void setLocation(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.location = s;
    }

    public final void setMemberOf(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.memberOf = s;
    }

    public final void setPublicationDate(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.publicationDate = s;
    }

    public final void setPublisher(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.publisher = s;
    }

    public final void setRating(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.rating = s;
    }

    public final void setReleaseDate(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.releaseDate = s;
    }

    public final void setStartDate(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.startDate = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.artist;
        String s1 = this.albumTitle;
        String s2 = this.rating;
        String s3 = this.releaseDate;
        String s4 = this.directors;
        String s5 = this.actors;
        String s6 = this.broadcastDayOfWeek;
        String s7 = this.broadcastTime;
        String s8 = this.channel;
        String s9 = this.authors;
        String s10 = this.publisher;
        String s11 = this.publicationDate;
        String s12 = this.jobTitles;
        String s13 = this.memberOf;
        String s14 = this.startDate;
        String s15 = this.endDate;
        String s16 = this.location;
        StringBuilder stringBuilder0 = new StringBuilder("ContentItem(kind=");
        stringBuilder0.append(this.kind);
        stringBuilder0.append(", url=");
        stringBuilder0.append(this.url);
        stringBuilder0.append(", image=");
        a.w(stringBuilder0, this.image, ", title=", this.title, ", artist=");
        a.w(stringBuilder0, s, ", albumTitle=", s1, ", rating=");
        a.w(stringBuilder0, s2, ", releaseDate=", s3, ", directors=");
        a.w(stringBuilder0, s4, ", actors=", s5, ", broadcastDayOfWeek=");
        a.w(stringBuilder0, s6, ", broadcastTime=", s7, ", channel=");
        a.w(stringBuilder0, s8, ", authors=", s9, ", publisher=");
        a.w(stringBuilder0, s10, ", publicationDate=", s11, ", jobTitles=");
        a.w(stringBuilder0, s12, ", memberOf=", s13, ", startDate=");
        a.w(stringBuilder0, s14, ", endDate=", s15, ", location=");
        return r0.a.o(stringBuilder0, s16, ")");
    }
}

