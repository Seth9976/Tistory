package com.kakao.sdk.partner.user.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.kakao.sdk.user.model.AgeRange;
import com.kakao.sdk.user.model.Gender;
import com.kakao.sdk.user.model.Profile;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001A\u0004\u0018\u00010\r\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u001A\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u001C\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u001E\u001A\u0004\u0018\u00010\u0014\u0012\b\u0010\u001F\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001A\u0004\u0018\u00010\n\u0012\b\u0010!\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001A\u0004\u0018\u00010\n\u00A2\u0006\u0002\u0010#J\u0010\u0010C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010D\u001A\u0004\u0018\u00010\nH\u00C6\u0003J\u0010\u0010E\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010F\u001A\u0004\u0018\u00010\nH\u00C6\u0003J\u0010\u0010G\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010H\u001A\u0004\u0018\u00010\u0014H\u00C6\u0003J\u0010\u0010I\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010J\u001A\u0004\u0018\u00010\nH\u00C6\u0003J\u000B\u0010K\u001A\u0004\u0018\u00010\u0018H\u00C6\u0003J\u0010\u0010L\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010M\u001A\u0004\u0018\u00010\nH\u00C6\u0003J\u000B\u0010N\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u0010\u0010O\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010P\u001A\u0004\u0018\u00010\nH\u00C6\u0003J\u0010\u0010Q\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010R\u001A\u0004\u0018\u00010\u0014H\u00C6\u0003J\u0010\u0010S\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010T\u001A\u0004\u0018\u00010\nH\u00C6\u0003J\u0010\u0010U\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010V\u001A\u0004\u0018\u00010\nH\u00C6\u0003J\u0010\u0010W\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u0010\u0010X\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u0010\u0010Y\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010Z\u001A\u0004\u0018\u00010\nH\u00C6\u0003J\u0010\u0010[\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u000B\u0010\\\u001A\u0004\u0018\u00010\rH\u00C6\u0003J\u0010\u0010]\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\'J\u00D2\u0002\u0010^\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010\nH\u00C6\u0001\u00A2\u0006\u0002\u0010_J\t\u0010`\u001A\u00020aH\u00D6\u0001J\u0013\u0010b\u001A\u00020\u00032\b\u0010c\u001A\u0004\u0018\u00010dH\u00D6\u0003J\t\u0010e\u001A\u00020aH\u00D6\u0001J\t\u0010f\u001A\u00020\nH\u00D6\u0001J\u0019\u0010g\u001A\u00020h2\u0006\u0010i\u001A\u00020j2\u0006\u0010k\u001A\u00020aH\u00D6\u0001R\u0013\u0010\f\u001A\u0004\u0018\u00010\r\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010%R\u0015\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b&\u0010\'R\u0013\u0010\u0011\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b)\u0010*R\u0015\u0010\u0010\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b+\u0010\'R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010*R\u0015\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b-\u0010\'R\u0013\u0010\u0016\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b.\u0010*R\u0013\u0010\u0017\u001A\u0004\u0018\u00010\u0018\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u00100R\u0015\u0010\u0015\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b1\u0010\'R\u0013\u0010\"\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b2\u0010*R\u0013\u0010\t\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u0010*R\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b4\u0010\'R\u0013\u0010\u0013\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u00106R\u0015\u0010\u0012\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b7\u0010\'R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b\u0007\u0010\'R\u0015\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b\b\u0010\'R\u0015\u0010!\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b!\u0010\'R\u0013\u0010\u001C\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b8\u0010*R\u0015\u0010\u001B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b9\u0010\'R\u0013\u0010\u001E\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\b\n\u0000\u001A\u0004\b:\u00106R\u0015\u0010\u001D\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b;\u0010\'R\u0013\u0010\u001A\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b<\u0010*R\u0015\u0010\u0019\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b=\u0010\'R\u0013\u0010 \u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b>\u0010*R\u0015\u0010\u001F\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\b?\u0010\'R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b@\u0010AR\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010(\u001A\u0004\bB\u0010\'\u00A8\u0006l"}, d2 = {"Lcom/kakao/sdk/partner/user/model/PartnerAccount;", "Landroid/os/Parcelable;", "profileNeedsAgreement", "", "profile", "Lcom/kakao/sdk/user/model/Profile;", "emailNeedsAgreement", "isEmailValid", "isEmailVerified", "email", "", "ageRangeNeedsAgreement", "ageRange", "Lcom/kakao/sdk/user/model/AgeRange;", "birthyearNeedsAgreement", "birthyear", "birthdayNeedsAgreement", "birthday", "genderNeedsAgreement", "gender", "Lcom/kakao/sdk/user/model/Gender;", "ciNeedsAgreement", "ci", "ciAuthenticatedAt", "Ljava/util/Date;", "legalNameNeedsAgreement", "legalName", "legalBirthDateNeedsAgreement", "legalBirthDate", "legalGenderNeedsAgreement", "legalGender", "phoneNumberNeedsAgreement", "phoneNumber", "isKakaotalkUser", "displayId", "(Ljava/lang/Boolean;Lcom/kakao/sdk/user/model/Profile;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kakao/sdk/user/model/AgeRange;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kakao/sdk/user/model/Gender;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kakao/sdk/user/model/Gender;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAgeRange", "()Lcom/kakao/sdk/user/model/AgeRange;", "getAgeRangeNeedsAgreement", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBirthday", "()Ljava/lang/String;", "getBirthdayNeedsAgreement", "getBirthyear", "getBirthyearNeedsAgreement", "getCi", "getCiAuthenticatedAt", "()Ljava/util/Date;", "getCiNeedsAgreement", "getDisplayId", "getEmail", "getEmailNeedsAgreement", "getGender", "()Lcom/kakao/sdk/user/model/Gender;", "getGenderNeedsAgreement", "getLegalBirthDate", "getLegalBirthDateNeedsAgreement", "getLegalGender", "getLegalGenderNeedsAgreement", "getLegalName", "getLegalNameNeedsAgreement", "getPhoneNumber", "getPhoneNumberNeedsAgreement", "getProfile", "()Lcom/kakao/sdk/user/model/Profile;", "getProfileNeedsAgreement", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Lcom/kakao/sdk/user/model/Profile;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kakao/sdk/user/model/AgeRange;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kakao/sdk/user/model/Gender;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/kakao/sdk/user/model/Gender;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kakao/sdk/partner/user/model/PartnerAccount;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "partner-user_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class PartnerAccount implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            AgeRange ageRange0;
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            Boolean boolean0 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            Parcelable parcelable0 = parcel0.readParcelable(PartnerAccount.class.getClassLoader());
            Boolean boolean1 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            Boolean boolean2 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            Boolean boolean3 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            String s = parcel0.readString();
            Boolean boolean4 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            if(parcel0.readInt() == 0) {
                ageRange0 = null;
            }
            else {
                String s1 = parcel0.readString();
                ageRange0 = (AgeRange)Enum.valueOf(AgeRange.class, s1);
            }
            Boolean boolean5 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            String s2 = parcel0.readString();
            Boolean boolean6 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            String s3 = parcel0.readString();
            Boolean boolean7 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            Gender gender0 = parcel0.readInt() == 0 ? null : ((Gender)Enum.valueOf(Gender.class, parcel0.readString()));
            Boolean boolean8 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            String s4 = parcel0.readString();
            Serializable serializable0 = parcel0.readSerializable();
            Boolean boolean9 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            String s5 = parcel0.readString();
            Boolean boolean10 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            String s6 = parcel0.readString();
            Boolean boolean11 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            Gender gender1 = parcel0.readInt() == 0 ? null : ((Gender)Enum.valueOf(Gender.class, parcel0.readString()));
            Boolean boolean12 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            String s7 = parcel0.readString();
            if(parcel0.readInt() != 0) {
                return parcel0.readInt() == 0 ? new PartnerAccount(boolean0, ((Profile)parcelable0), boolean1, boolean2, boolean3, s, boolean4, ageRange0, boolean5, s2, boolean6, s3, boolean7, gender0, boolean8, s4, ((Date)serializable0), boolean9, s5, boolean10, s6, boolean11, gender1, boolean12, s7, Boolean.FALSE, parcel0.readString()) : new PartnerAccount(boolean0, ((Profile)parcelable0), boolean1, boolean2, boolean3, s, boolean4, ageRange0, boolean5, s2, boolean6, s3, boolean7, gender0, boolean8, s4, ((Date)serializable0), boolean9, s5, boolean10, s6, boolean11, gender1, boolean12, s7, Boolean.TRUE, parcel0.readString());
            }
            return new PartnerAccount(boolean0, ((Profile)parcelable0), boolean1, boolean2, boolean3, s, boolean4, ageRange0, boolean5, s2, boolean6, s3, boolean7, gender0, boolean8, s4, ((Date)serializable0), boolean9, s5, boolean10, s6, boolean11, gender1, boolean12, s7, null, parcel0.readString());
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new PartnerAccount[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    @Nullable
    private final AgeRange ageRange;
    @Nullable
    private final Boolean ageRangeNeedsAgreement;
    @Nullable
    private final String birthday;
    @Nullable
    private final Boolean birthdayNeedsAgreement;
    @Nullable
    private final String birthyear;
    @Nullable
    private final Boolean birthyearNeedsAgreement;
    @Nullable
    private final String ci;
    @Nullable
    private final Date ciAuthenticatedAt;
    @Nullable
    private final Boolean ciNeedsAgreement;
    @Nullable
    private final String displayId;
    @Nullable
    private final String email;
    @Nullable
    private final Boolean emailNeedsAgreement;
    @Nullable
    private final Gender gender;
    @Nullable
    private final Boolean genderNeedsAgreement;
    @Nullable
    private final Boolean isEmailValid;
    @Nullable
    private final Boolean isEmailVerified;
    @Nullable
    private final Boolean isKakaotalkUser;
    @Nullable
    private final String legalBirthDate;
    @Nullable
    private final Boolean legalBirthDateNeedsAgreement;
    @Nullable
    private final Gender legalGender;
    @Nullable
    private final Boolean legalGenderNeedsAgreement;
    @Nullable
    private final String legalName;
    @Nullable
    private final Boolean legalNameNeedsAgreement;
    @Nullable
    private final String phoneNumber;
    @Nullable
    private final Boolean phoneNumberNeedsAgreement;
    @Nullable
    private final Profile profile;
    @Nullable
    private final Boolean profileNeedsAgreement;

    static {
        PartnerAccount.CREATOR = new Creator();
    }

    public PartnerAccount(@Nullable Boolean boolean0, @Nullable Profile profile0, @Nullable Boolean boolean1, @Nullable Boolean boolean2, @Nullable Boolean boolean3, @Nullable String s, @Nullable Boolean boolean4, @Nullable AgeRange ageRange0, @Nullable Boolean boolean5, @Nullable String s1, @Nullable Boolean boolean6, @Nullable String s2, @Nullable Boolean boolean7, @Nullable Gender gender0, @Nullable Boolean boolean8, @Nullable String s3, @Nullable Date date0, @Nullable Boolean boolean9, @Nullable String s4, @Nullable Boolean boolean10, @Nullable String s5, @Nullable Boolean boolean11, @Nullable Gender gender1, @Nullable Boolean boolean12, @Nullable String s6, @Nullable Boolean boolean13, @Nullable String s7) {
        this.profileNeedsAgreement = boolean0;
        this.profile = profile0;
        this.emailNeedsAgreement = boolean1;
        this.isEmailValid = boolean2;
        this.isEmailVerified = boolean3;
        this.email = s;
        this.ageRangeNeedsAgreement = boolean4;
        this.ageRange = ageRange0;
        this.birthyearNeedsAgreement = boolean5;
        this.birthyear = s1;
        this.birthdayNeedsAgreement = boolean6;
        this.birthday = s2;
        this.genderNeedsAgreement = boolean7;
        this.gender = gender0;
        this.ciNeedsAgreement = boolean8;
        this.ci = s3;
        this.ciAuthenticatedAt = date0;
        this.legalNameNeedsAgreement = boolean9;
        this.legalName = s4;
        this.legalBirthDateNeedsAgreement = boolean10;
        this.legalBirthDate = s5;
        this.legalGenderNeedsAgreement = boolean11;
        this.legalGender = gender1;
        this.phoneNumberNeedsAgreement = boolean12;
        this.phoneNumber = s6;
        this.isKakaotalkUser = boolean13;
        this.displayId = s7;
    }

    @Nullable
    public final Boolean component1() {
        return this.profileNeedsAgreement;
    }

    @Nullable
    public final String component10() {
        return this.birthyear;
    }

    @Nullable
    public final Boolean component11() {
        return this.birthdayNeedsAgreement;
    }

    @Nullable
    public final String component12() {
        return this.birthday;
    }

    @Nullable
    public final Boolean component13() {
        return this.genderNeedsAgreement;
    }

    @Nullable
    public final Gender component14() {
        return this.gender;
    }

    @Nullable
    public final Boolean component15() {
        return this.ciNeedsAgreement;
    }

    @Nullable
    public final String component16() {
        return this.ci;
    }

    @Nullable
    public final Date component17() {
        return this.ciAuthenticatedAt;
    }

    @Nullable
    public final Boolean component18() {
        return this.legalNameNeedsAgreement;
    }

    @Nullable
    public final String component19() {
        return this.legalName;
    }

    @Nullable
    public final Profile component2() {
        return this.profile;
    }

    @Nullable
    public final Boolean component20() {
        return this.legalBirthDateNeedsAgreement;
    }

    @Nullable
    public final String component21() {
        return this.legalBirthDate;
    }

    @Nullable
    public final Boolean component22() {
        return this.legalGenderNeedsAgreement;
    }

    @Nullable
    public final Gender component23() {
        return this.legalGender;
    }

    @Nullable
    public final Boolean component24() {
        return this.phoneNumberNeedsAgreement;
    }

    @Nullable
    public final String component25() {
        return this.phoneNumber;
    }

    @Nullable
    public final Boolean component26() {
        return this.isKakaotalkUser;
    }

    @Nullable
    public final String component27() {
        return this.displayId;
    }

    @Nullable
    public final Boolean component3() {
        return this.emailNeedsAgreement;
    }

    @Nullable
    public final Boolean component4() {
        return this.isEmailValid;
    }

    @Nullable
    public final Boolean component5() {
        return this.isEmailVerified;
    }

    @Nullable
    public final String component6() {
        return this.email;
    }

    @Nullable
    public final Boolean component7() {
        return this.ageRangeNeedsAgreement;
    }

    @Nullable
    public final AgeRange component8() {
        return this.ageRange;
    }

    @Nullable
    public final Boolean component9() {
        return this.birthyearNeedsAgreement;
    }

    @NotNull
    public final PartnerAccount copy(@Nullable Boolean boolean0, @Nullable Profile profile0, @Nullable Boolean boolean1, @Nullable Boolean boolean2, @Nullable Boolean boolean3, @Nullable String s, @Nullable Boolean boolean4, @Nullable AgeRange ageRange0, @Nullable Boolean boolean5, @Nullable String s1, @Nullable Boolean boolean6, @Nullable String s2, @Nullable Boolean boolean7, @Nullable Gender gender0, @Nullable Boolean boolean8, @Nullable String s3, @Nullable Date date0, @Nullable Boolean boolean9, @Nullable String s4, @Nullable Boolean boolean10, @Nullable String s5, @Nullable Boolean boolean11, @Nullable Gender gender1, @Nullable Boolean boolean12, @Nullable String s6, @Nullable Boolean boolean13, @Nullable String s7) {
        return new PartnerAccount(boolean0, profile0, boolean1, boolean2, boolean3, s, boolean4, ageRange0, boolean5, s1, boolean6, s2, boolean7, gender0, boolean8, s3, date0, boolean9, s4, boolean10, s5, boolean11, gender1, boolean12, s6, boolean13, s7);
    }

    public static PartnerAccount copy$default(PartnerAccount partnerAccount0, Boolean boolean0, Profile profile0, Boolean boolean1, Boolean boolean2, Boolean boolean3, String s, Boolean boolean4, AgeRange ageRange0, Boolean boolean5, String s1, Boolean boolean6, String s2, Boolean boolean7, Gender gender0, Boolean boolean8, String s3, Date date0, Boolean boolean9, String s4, Boolean boolean10, String s5, Boolean boolean11, Gender gender1, Boolean boolean12, String s6, Boolean boolean13, String s7, int v, Object object0) {
        Boolean boolean14 = (v & 1) == 0 ? boolean0 : partnerAccount0.profileNeedsAgreement;
        Profile profile1 = (v & 2) == 0 ? profile0 : partnerAccount0.profile;
        Boolean boolean15 = (v & 4) == 0 ? boolean1 : partnerAccount0.emailNeedsAgreement;
        Boolean boolean16 = (v & 8) == 0 ? boolean2 : partnerAccount0.isEmailValid;
        Boolean boolean17 = (v & 16) == 0 ? boolean3 : partnerAccount0.isEmailVerified;
        String s8 = (v & 0x20) == 0 ? s : partnerAccount0.email;
        Boolean boolean18 = (v & 0x40) == 0 ? boolean4 : partnerAccount0.ageRangeNeedsAgreement;
        AgeRange ageRange1 = (v & 0x80) == 0 ? ageRange0 : partnerAccount0.ageRange;
        Boolean boolean19 = (v & 0x100) == 0 ? boolean5 : partnerAccount0.birthyearNeedsAgreement;
        String s9 = (v & 0x200) == 0 ? s1 : partnerAccount0.birthyear;
        Boolean boolean20 = (v & 0x400) == 0 ? boolean6 : partnerAccount0.birthdayNeedsAgreement;
        String s10 = (v & 0x800) == 0 ? s2 : partnerAccount0.birthday;
        Boolean boolean21 = (v & 0x1000) == 0 ? boolean7 : partnerAccount0.genderNeedsAgreement;
        Gender gender2 = (v & 0x2000) == 0 ? gender0 : partnerAccount0.gender;
        Boolean boolean22 = (v & 0x4000) == 0 ? boolean8 : partnerAccount0.ciNeedsAgreement;
        String s11 = (v & 0x8000) == 0 ? s3 : partnerAccount0.ci;
        Date date1 = (v & 0x10000) == 0 ? date0 : partnerAccount0.ciAuthenticatedAt;
        Boolean boolean23 = (v & 0x20000) == 0 ? boolean9 : partnerAccount0.legalNameNeedsAgreement;
        String s12 = (v & 0x40000) == 0 ? s4 : partnerAccount0.legalName;
        Boolean boolean24 = (v & 0x80000) == 0 ? boolean10 : partnerAccount0.legalBirthDateNeedsAgreement;
        String s13 = (v & 0x100000) == 0 ? s5 : partnerAccount0.legalBirthDate;
        Boolean boolean25 = (v & 0x200000) == 0 ? boolean11 : partnerAccount0.legalGenderNeedsAgreement;
        Gender gender3 = (v & 0x400000) == 0 ? gender1 : partnerAccount0.legalGender;
        Boolean boolean26 = (v & 0x800000) == 0 ? boolean12 : partnerAccount0.phoneNumberNeedsAgreement;
        String s14 = (v & 0x1000000) == 0 ? s6 : partnerAccount0.phoneNumber;
        Boolean boolean27 = (v & 0x2000000) == 0 ? boolean13 : partnerAccount0.isKakaotalkUser;
        return (v & 0x4000000) == 0 ? partnerAccount0.copy(boolean14, profile1, boolean15, boolean16, boolean17, s8, boolean18, ageRange1, boolean19, s9, boolean20, s10, boolean21, gender2, boolean22, s11, date1, boolean23, s12, boolean24, s13, boolean25, gender3, boolean26, s14, boolean27, s7) : partnerAccount0.copy(boolean14, profile1, boolean15, boolean16, boolean17, s8, boolean18, ageRange1, boolean19, s9, boolean20, s10, boolean21, gender2, boolean22, s11, date1, boolean23, s12, boolean24, s13, boolean25, gender3, boolean26, s14, boolean27, partnerAccount0.displayId);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(46)
    @Override
    public boolean equals(@Nullable Object object0) {
        if(this != object0) {
            if(object0 instanceof PartnerAccount) {
                PartnerAccount partnerAccount0 = (PartnerAccount)object0;
                return Intrinsics.areEqual(this.profileNeedsAgreement, partnerAccount0.profileNeedsAgreement) && Intrinsics.areEqual(this.profile, partnerAccount0.profile) && Intrinsics.areEqual(this.emailNeedsAgreement, partnerAccount0.emailNeedsAgreement) && Intrinsics.areEqual(this.isEmailValid, partnerAccount0.isEmailValid) && Intrinsics.areEqual(this.isEmailVerified, partnerAccount0.isEmailVerified) && Intrinsics.areEqual(this.email, partnerAccount0.email) && Intrinsics.areEqual(this.ageRangeNeedsAgreement, partnerAccount0.ageRangeNeedsAgreement) && Intrinsics.areEqual(this.ageRange, partnerAccount0.ageRange) && Intrinsics.areEqual(this.birthyearNeedsAgreement, partnerAccount0.birthyearNeedsAgreement) && Intrinsics.areEqual(this.birthyear, partnerAccount0.birthyear) && Intrinsics.areEqual(this.birthdayNeedsAgreement, partnerAccount0.birthdayNeedsAgreement) && Intrinsics.areEqual(this.birthday, partnerAccount0.birthday) && Intrinsics.areEqual(this.genderNeedsAgreement, partnerAccount0.genderNeedsAgreement) && Intrinsics.areEqual(this.gender, partnerAccount0.gender) && Intrinsics.areEqual(this.ciNeedsAgreement, partnerAccount0.ciNeedsAgreement) && Intrinsics.areEqual(this.ci, partnerAccount0.ci) && Intrinsics.areEqual(this.ciAuthenticatedAt, partnerAccount0.ciAuthenticatedAt) && Intrinsics.areEqual(this.legalNameNeedsAgreement, partnerAccount0.legalNameNeedsAgreement) && Intrinsics.areEqual(this.legalName, partnerAccount0.legalName) && Intrinsics.areEqual(this.legalBirthDateNeedsAgreement, partnerAccount0.legalBirthDateNeedsAgreement) && Intrinsics.areEqual(this.legalBirthDate, partnerAccount0.legalBirthDate) && Intrinsics.areEqual(this.legalGenderNeedsAgreement, partnerAccount0.legalGenderNeedsAgreement) && Intrinsics.areEqual(this.legalGender, partnerAccount0.legalGender) && Intrinsics.areEqual(this.phoneNumberNeedsAgreement, partnerAccount0.phoneNumberNeedsAgreement) && Intrinsics.areEqual(this.phoneNumber, partnerAccount0.phoneNumber) && Intrinsics.areEqual(this.isKakaotalkUser, partnerAccount0.isKakaotalkUser) && Intrinsics.areEqual(this.displayId, partnerAccount0.displayId);
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final AgeRange getAgeRange() {
        return this.ageRange;
    }

    @Nullable
    public final Boolean getAgeRangeNeedsAgreement() {
        return this.ageRangeNeedsAgreement;
    }

    @Nullable
    public final String getBirthday() {
        return this.birthday;
    }

    @Nullable
    public final Boolean getBirthdayNeedsAgreement() {
        return this.birthdayNeedsAgreement;
    }

    @Nullable
    public final String getBirthyear() {
        return this.birthyear;
    }

    @Nullable
    public final Boolean getBirthyearNeedsAgreement() {
        return this.birthyearNeedsAgreement;
    }

    @Nullable
    public final String getCi() {
        return this.ci;
    }

    @Nullable
    public final Date getCiAuthenticatedAt() {
        return this.ciAuthenticatedAt;
    }

    @Nullable
    public final Boolean getCiNeedsAgreement() {
        return this.ciNeedsAgreement;
    }

    @Nullable
    public final String getDisplayId() {
        return this.displayId;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Boolean getEmailNeedsAgreement() {
        return this.emailNeedsAgreement;
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final Boolean getGenderNeedsAgreement() {
        return this.genderNeedsAgreement;
    }

    @Nullable
    public final String getLegalBirthDate() {
        return this.legalBirthDate;
    }

    @Nullable
    public final Boolean getLegalBirthDateNeedsAgreement() {
        return this.legalBirthDateNeedsAgreement;
    }

    @Nullable
    public final Gender getLegalGender() {
        return this.legalGender;
    }

    @Nullable
    public final Boolean getLegalGenderNeedsAgreement() {
        return this.legalGenderNeedsAgreement;
    }

    @Nullable
    public final String getLegalName() {
        return this.legalName;
    }

    @Nullable
    public final Boolean getLegalNameNeedsAgreement() {
        return this.legalNameNeedsAgreement;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final Boolean getPhoneNumberNeedsAgreement() {
        return this.phoneNumberNeedsAgreement;
    }

    @Nullable
    public final Profile getProfile() {
        return this.profile;
    }

    @Nullable
    public final Boolean getProfileNeedsAgreement() {
        return this.profileNeedsAgreement;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.profileNeedsAgreement == null ? 0 : this.profileNeedsAgreement.hashCode();
        int v2 = this.profile == null ? 0 : this.profile.hashCode();
        int v3 = this.emailNeedsAgreement == null ? 0 : this.emailNeedsAgreement.hashCode();
        int v4 = this.isEmailValid == null ? 0 : this.isEmailValid.hashCode();
        int v5 = this.isEmailVerified == null ? 0 : this.isEmailVerified.hashCode();
        int v6 = this.email == null ? 0 : this.email.hashCode();
        int v7 = this.ageRangeNeedsAgreement == null ? 0 : this.ageRangeNeedsAgreement.hashCode();
        int v8 = this.ageRange == null ? 0 : this.ageRange.hashCode();
        int v9 = this.birthyearNeedsAgreement == null ? 0 : this.birthyearNeedsAgreement.hashCode();
        int v10 = this.birthyear == null ? 0 : this.birthyear.hashCode();
        int v11 = this.birthdayNeedsAgreement == null ? 0 : this.birthdayNeedsAgreement.hashCode();
        int v12 = this.birthday == null ? 0 : this.birthday.hashCode();
        int v13 = this.genderNeedsAgreement == null ? 0 : this.genderNeedsAgreement.hashCode();
        int v14 = this.gender == null ? 0 : this.gender.hashCode();
        int v15 = this.ciNeedsAgreement == null ? 0 : this.ciNeedsAgreement.hashCode();
        int v16 = this.ci == null ? 0 : this.ci.hashCode();
        int v17 = this.ciAuthenticatedAt == null ? 0 : this.ciAuthenticatedAt.hashCode();
        int v18 = this.legalNameNeedsAgreement == null ? 0 : this.legalNameNeedsAgreement.hashCode();
        int v19 = this.legalName == null ? 0 : this.legalName.hashCode();
        int v20 = this.legalBirthDateNeedsAgreement == null ? 0 : this.legalBirthDateNeedsAgreement.hashCode();
        int v21 = this.legalBirthDate == null ? 0 : this.legalBirthDate.hashCode();
        int v22 = this.legalGenderNeedsAgreement == null ? 0 : this.legalGenderNeedsAgreement.hashCode();
        int v23 = this.legalGender == null ? 0 : this.legalGender.hashCode();
        int v24 = this.phoneNumberNeedsAgreement == null ? 0 : this.phoneNumberNeedsAgreement.hashCode();
        int v25 = this.phoneNumber == null ? 0 : this.phoneNumber.hashCode();
        int v26 = this.isKakaotalkUser == null ? 0 : this.isKakaotalkUser.hashCode();
        String s = this.displayId;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((((((((((((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v19) * 0x1F + v20) * 0x1F + v21) * 0x1F + v22) * 0x1F + v23) * 0x1F + v24) * 0x1F + v25) * 0x1F + v26) * 0x1F + v;
    }

    @Nullable
    public final Boolean isEmailValid() {
        return this.isEmailValid;
    }

    @Nullable
    public final Boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    @Nullable
    public final Boolean isKakaotalkUser() {
        return this.isKakaotalkUser;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PartnerAccount(profileNeedsAgreement=");
        stringBuilder0.append(this.profileNeedsAgreement);
        stringBuilder0.append(", profile=");
        stringBuilder0.append(this.profile);
        stringBuilder0.append(", emailNeedsAgreement=");
        stringBuilder0.append(this.emailNeedsAgreement);
        stringBuilder0.append(", isEmailValid=");
        stringBuilder0.append(this.isEmailValid);
        stringBuilder0.append(", isEmailVerified=");
        stringBuilder0.append(this.isEmailVerified);
        stringBuilder0.append(", email=");
        stringBuilder0.append(this.email);
        stringBuilder0.append(", ageRangeNeedsAgreement=");
        stringBuilder0.append(this.ageRangeNeedsAgreement);
        stringBuilder0.append(", ageRange=");
        stringBuilder0.append(this.ageRange);
        stringBuilder0.append(", birthyearNeedsAgreement=");
        stringBuilder0.append(this.birthyearNeedsAgreement);
        stringBuilder0.append(", birthyear=");
        stringBuilder0.append(this.birthyear);
        stringBuilder0.append(", birthdayNeedsAgreement=");
        stringBuilder0.append(this.birthdayNeedsAgreement);
        stringBuilder0.append(", birthday=");
        stringBuilder0.append(this.birthday);
        stringBuilder0.append(", genderNeedsAgreement=");
        stringBuilder0.append(this.genderNeedsAgreement);
        stringBuilder0.append(", gender=");
        stringBuilder0.append(this.gender);
        stringBuilder0.append(", ciNeedsAgreement=");
        stringBuilder0.append(this.ciNeedsAgreement);
        stringBuilder0.append(", ci=");
        stringBuilder0.append(this.ci);
        stringBuilder0.append(", ciAuthenticatedAt=");
        stringBuilder0.append(this.ciAuthenticatedAt);
        stringBuilder0.append(", legalNameNeedsAgreement=");
        stringBuilder0.append(this.legalNameNeedsAgreement);
        stringBuilder0.append(", legalName=");
        stringBuilder0.append(this.legalName);
        stringBuilder0.append(", legalBirthDateNeedsAgreement=");
        stringBuilder0.append(this.legalBirthDateNeedsAgreement);
        stringBuilder0.append(", legalBirthDate=");
        stringBuilder0.append(this.legalBirthDate);
        stringBuilder0.append(", legalGenderNeedsAgreement=");
        stringBuilder0.append(this.legalGenderNeedsAgreement);
        stringBuilder0.append(", legalGender=");
        stringBuilder0.append(this.legalGender);
        stringBuilder0.append(", phoneNumberNeedsAgreement=");
        stringBuilder0.append(this.phoneNumberNeedsAgreement);
        stringBuilder0.append(", phoneNumber=");
        stringBuilder0.append(this.phoneNumber);
        stringBuilder0.append(", isKakaotalkUser=");
        stringBuilder0.append(this.isKakaotalkUser);
        stringBuilder0.append(", displayId=");
        return a.o(stringBuilder0, this.displayId, ")");
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        Boolean boolean0 = this.profileNeedsAgreement;
        if(boolean0 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean0);
        }
        parcel0.writeParcelable(this.profile, v);
        Boolean boolean1 = this.emailNeedsAgreement;
        if(boolean1 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean1);
        }
        Boolean boolean2 = this.isEmailValid;
        if(boolean2 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean2);
        }
        Boolean boolean3 = this.isEmailVerified;
        if(boolean3 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean3);
        }
        parcel0.writeString(this.email);
        Boolean boolean4 = this.ageRangeNeedsAgreement;
        if(boolean4 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean4);
        }
        AgeRange ageRange0 = this.ageRange;
        if(ageRange0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeString(ageRange0.name());
        }
        Boolean boolean5 = this.birthyearNeedsAgreement;
        if(boolean5 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean5);
        }
        parcel0.writeString(this.birthyear);
        Boolean boolean6 = this.birthdayNeedsAgreement;
        if(boolean6 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean6);
        }
        parcel0.writeString(this.birthday);
        Boolean boolean7 = this.genderNeedsAgreement;
        if(boolean7 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean7);
        }
        Gender gender0 = this.gender;
        if(gender0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeString(gender0.name());
        }
        Boolean boolean8 = this.ciNeedsAgreement;
        if(boolean8 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean8);
        }
        parcel0.writeString(this.ci);
        parcel0.writeSerializable(this.ciAuthenticatedAt);
        Boolean boolean9 = this.legalNameNeedsAgreement;
        if(boolean9 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean9);
        }
        parcel0.writeString(this.legalName);
        Boolean boolean10 = this.legalBirthDateNeedsAgreement;
        if(boolean10 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean10);
        }
        parcel0.writeString(this.legalBirthDate);
        Boolean boolean11 = this.legalGenderNeedsAgreement;
        if(boolean11 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean11);
        }
        Gender gender1 = this.legalGender;
        if(gender1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeString(gender1.name());
        }
        Boolean boolean12 = this.phoneNumberNeedsAgreement;
        if(boolean12 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean12);
        }
        parcel0.writeString(this.phoneNumber);
        Boolean boolean13 = this.isKakaotalkUser;
        if(boolean13 == null) {
            parcel0.writeInt(0);
        }
        else {
            wb.a.i(parcel0, 1, boolean13);
        }
        parcel0.writeString(this.displayId);
    }
}

