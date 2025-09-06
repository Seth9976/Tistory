package com.kakao.keditor.plugin.itemspec.contentsearch.util;

import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.databinding.KeItemContentSearchBinding;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind.Book;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind.Exhibition;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind.Movie;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind.Music;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind.Person;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind.Play;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind.Tv;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind;
import com.kakao.keditor.standard.EditTextStandardKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\u0014\u0010\u0003\u001A\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0006H\u0000\u001A\u0014\u0010\u0007\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0006H\u0000¨\u0006\b"}, d2 = {"applyCustomFont", "", "Lcom/kakao/keditor/databinding/KeItemContentSearchBinding;", "getImageViewBy", "Landroid/widget/ImageView;", "kind", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "setChildVisibleBy", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeItemContentSearchBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeItemContentSearchBinding.kt\ncom/kakao/keditor/plugin/itemspec/contentsearch/util/KeItemContentSearchBindingKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,94:1\n262#2,2:95\n262#2,2:97\n262#2,2:99\n262#2,2:101\n262#2,2:103\n262#2,2:105\n262#2,2:107\n*S KotlinDebug\n*F\n+ 1 KeItemContentSearchBinding.kt\ncom/kakao/keditor/plugin/itemspec/contentsearch/util/KeItemContentSearchBindingKt\n*L\n76#1:95,2\n77#1:97,2\n78#1:99,2\n79#1:101,2\n80#1:103,2\n81#1:105,2\n82#1:107,2\n*E\n"})
public final class KeItemContentSearchBindingKt {
    public static final void applyCustomFont(@NotNull KeItemContentSearchBinding keItemContentSearchBinding0) {
        Intrinsics.checkNotNullParameter(keItemContentSearchBinding0, "<this>");
        Typeface typeface0 = Keditor.INSTANCE.getCustomFont();
        keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchTitle.setTypeface(typeface0, 1);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchArtist, "keItemContentSearchArtist");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchArtist);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchArtistDesc, "keItemContentSearchArtistDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchArtistDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchAlbum, "keItemContentSearchAlbum");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchAlbum);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchAlbumDesc, "keItemContentSearchAlbumDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchAlbumDesc);
        Typeface typeface1 = Keditor.INSTANCE.getCustomFont();
        keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchTitle.setTypeface(typeface1, 1);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchRating, "keItemContentSearchRating");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchRating);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchRatingDesc, "keItemContentSearchRatingDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchRatingDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchRatingEmpty, "keItemContentSearchRatingEmpty");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchRatingEmpty);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchDirectors, "keItemContentSearchDirectors");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchDirectors);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchDirectorsDesc, "keItemContentSearchDirectorsDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchDirectorsDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchActors, "keItemContentSearchActors");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchActors);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchActorsDesc, "keItemContentSearchActorsDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchActorsDesc);
        Typeface typeface2 = Keditor.INSTANCE.getCustomFont();
        keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchTitle.setTypeface(typeface2, 1);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchActors, "keItemContentSearchActors");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchActors);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchActorsDesc, "keItemContentSearchActorsDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchActorsDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchChannel, "keItemContentSearchChannel");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchChannel);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchChannelDesc, "keItemContentSearchChannelDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchChannelDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchTime, "keItemContentSearchTime");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchTime);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchTimeDesc, "keItemContentSearchTimeDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchTimeDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchStartTimeDesc, "keItemContentSearchStartTimeDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchStartTimeDesc);
        Typeface typeface3 = Keditor.INSTANCE.getCustomFont();
        keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchTitle.setTypeface(typeface3, 1);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchAuthor, "keItemContentSearchAuthor");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchAuthor);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchAuthorDesc, "keItemContentSearchAuthorDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchAuthorDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchPublicationDate, "keItemContentSearchPublicationDate");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchPublicationDate);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchPublicationDateDesc, "keItemContentSearchPublicationDateDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchPublicationDateDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchPublisher, "keItemContentSearchPublisher");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchPublisher);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchPublisherDesc, "keItemContentSearchPublisherDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchPublisherDesc);
        Typeface typeface4 = Keditor.INSTANCE.getCustomFont();
        keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchTitle.setTypeface(typeface4, 1);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchJob, "keItemContentSearchJob");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchJob);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchJobDesc, "keItemContentSearchJobDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchJobDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchMemberOf, "keItemContentSearchMemberOf");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchMemberOf);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchMemberOfDesc, "keItemContentSearchMemberOfDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchMemberOfDesc);
        Typeface typeface5 = Keditor.INSTANCE.getCustomFont();
        keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchTitle.setTypeface(typeface5, 1);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchActors, "keItemContentSearchActors");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchActors);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchActorsDesc, "keItemContentSearchActorsDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchActorsDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchDate, "keItemContentSearchDate");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchDate);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchDateDesc, "keItemContentSearchDateDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchDateDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchLocation, "keItemContentSearchLocation");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchLocation);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchLocationDesc, "keItemContentSearchLocationDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchLocationDesc);
        Typeface typeface6 = Keditor.INSTANCE.getCustomFont();
        keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchTitle.setTypeface(typeface6, 1);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchDate, "keItemContentSearchDate");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchDate);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchDateDesc, "keItemContentSearchDateDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchDateDesc);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchLocation, "keItemContentSearchLocation");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchLocation);
        Intrinsics.checkNotNullExpressionValue(keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchLocationDesc, "keItemContentSearchLocationDesc");
        EditTextStandardKt.applyCustomFont(keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchLocationDesc);
    }

    @NotNull
    public static final ImageView getImageViewBy(@NotNull KeItemContentSearchBinding keItemContentSearchBinding0, @NotNull Kind kind0) {
        ImageView imageView0;
        Intrinsics.checkNotNullParameter(keItemContentSearchBinding0, "<this>");
        Intrinsics.checkNotNullParameter(kind0, "kind");
        if(kind0 instanceof Music) {
            imageView0 = keItemContentSearchBinding0.keItemContentSearchMusic.keItemContentSearchImage;
        }
        else {
            if(kind0 instanceof Movie) {
                imageView0 = keItemContentSearchBinding0.keItemContentSearchMovie.keItemContentSearchImage;
                Intrinsics.checkNotNull(imageView0);
                return imageView0;
            }
            if(kind0 instanceof Tv) {
                imageView0 = keItemContentSearchBinding0.keItemContentSearchTv.keItemContentSearchImage;
                Intrinsics.checkNotNull(imageView0);
                return imageView0;
            }
            if(kind0 instanceof Book) {
                imageView0 = keItemContentSearchBinding0.keItemContentSearchBook.keItemContentSearchImage;
                Intrinsics.checkNotNull(imageView0);
                return imageView0;
            }
            if(kind0 instanceof Person) {
                imageView0 = keItemContentSearchBinding0.keItemContentSearchPerson.keItemContentSearchImage;
                Intrinsics.checkNotNull(imageView0);
                return imageView0;
            }
            if(kind0 instanceof Play) {
                imageView0 = keItemContentSearchBinding0.keItemContentSearchPlay.keItemContentSearchImage;
            }
            else if(kind0 instanceof Exhibition) {
                imageView0 = keItemContentSearchBinding0.keItemContentSearchExhibition.keItemContentSearchImage;
            }
            else {
                throw new NoWhenBranchMatchedException();
            }
        }
        Intrinsics.checkNotNull(imageView0);
        return imageView0;
    }

    public static final void setChildVisibleBy(@NotNull KeItemContentSearchBinding keItemContentSearchBinding0, @NotNull Kind kind0) {
        Intrinsics.checkNotNullParameter(keItemContentSearchBinding0, "<this>");
        Intrinsics.checkNotNullParameter(kind0, "kind");
        View view0 = keItemContentSearchBinding0.keItemContentSearchMusic.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        int v = 8;
        view0.setVisibility((Intrinsics.areEqual(kind0, Music.INSTANCE) ? 0 : 8));
        View view1 = keItemContentSearchBinding0.keItemContentSearchMovie.getRoot();
        Intrinsics.checkNotNullExpressionValue(view1, "getRoot(...)");
        view1.setVisibility((Intrinsics.areEqual(kind0, Movie.INSTANCE) ? 0 : 8));
        View view2 = keItemContentSearchBinding0.keItemContentSearchTv.getRoot();
        Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
        view2.setVisibility((Intrinsics.areEqual(kind0, Tv.INSTANCE) ? 0 : 8));
        View view3 = keItemContentSearchBinding0.keItemContentSearchBook.getRoot();
        Intrinsics.checkNotNullExpressionValue(view3, "getRoot(...)");
        view3.setVisibility((Intrinsics.areEqual(kind0, Book.INSTANCE) ? 0 : 8));
        View view4 = keItemContentSearchBinding0.keItemContentSearchPerson.getRoot();
        Intrinsics.checkNotNullExpressionValue(view4, "getRoot(...)");
        view4.setVisibility((Intrinsics.areEqual(kind0, Person.INSTANCE) ? 0 : 8));
        View view5 = keItemContentSearchBinding0.keItemContentSearchPlay.getRoot();
        Intrinsics.checkNotNullExpressionValue(view5, "getRoot(...)");
        view5.setVisibility((Intrinsics.areEqual(kind0, Play.INSTANCE) ? 0 : 8));
        View view6 = keItemContentSearchBinding0.keItemContentSearchExhibition.getRoot();
        Intrinsics.checkNotNullExpressionValue(view6, "getRoot(...)");
        if(Intrinsics.areEqual(kind0, Exhibition.INSTANCE)) {
            v = 0;
        }
        view6.setVisibility(v);
    }
}

