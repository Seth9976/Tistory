package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\t\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0000H\u0080\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/autofill/ContentType;", "", "", "contentHint", "<init>", "(Ljava/lang/String;)V", "other", "plus$ui_release", "(Landroidx/compose/ui/autofill/ContentType;)Landroidx/compose/ui/autofill/ContentType;", "plus", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContentType {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\f\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\f\u0010\t\u001A\u0004\b\r\u0010\u000BR\u0017\u0010\u000E\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u000BR\u0017\u0010\u0010\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0010\u0010\t\u001A\u0004\b\u0011\u0010\u000BR\u0017\u0010\u0012\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010\t\u001A\u0004\b\u0013\u0010\u000BR\u0017\u0010\u0014\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0014\u0010\t\u001A\u0004\b\u0015\u0010\u000BR\u0017\u0010\u0016\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0016\u0010\t\u001A\u0004\b\u0017\u0010\u000BR\u0017\u0010\u0018\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0018\u0010\t\u001A\u0004\b\u0019\u0010\u000BR\u0017\u0010\u001A\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\t\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u001C\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u001C\u0010\t\u001A\u0004\b\u001D\u0010\u000BR\u0017\u0010\u001E\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\t\u001A\u0004\b\u001F\u0010\u000BR\u0017\u0010 \u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b \u0010\t\u001A\u0004\b!\u0010\u000BR\u0017\u0010\"\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\"\u0010\t\u001A\u0004\b#\u0010\u000BR\u0017\u0010$\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b$\u0010\t\u001A\u0004\b%\u0010\u000BR\u0017\u0010&\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b&\u0010\t\u001A\u0004\b\'\u0010\u000BR\u0017\u0010(\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b(\u0010\t\u001A\u0004\b)\u0010\u000BR\u0017\u0010*\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b*\u0010\t\u001A\u0004\b+\u0010\u000BR\u0017\u0010,\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b,\u0010\t\u001A\u0004\b-\u0010\u000BR\u0017\u0010.\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b.\u0010\t\u001A\u0004\b/\u0010\u000BR\u0017\u00100\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b0\u0010\t\u001A\u0004\b1\u0010\u000BR\u0017\u00102\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b2\u0010\t\u001A\u0004\b3\u0010\u000BR\u0017\u00104\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b4\u0010\t\u001A\u0004\b5\u0010\u000BR\u0017\u00106\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b6\u0010\t\u001A\u0004\b7\u0010\u000BR\u0017\u00108\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b8\u0010\t\u001A\u0004\b9\u0010\u000BR\u0017\u0010:\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b:\u0010\t\u001A\u0004\b;\u0010\u000BR\u0017\u0010<\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b<\u0010\t\u001A\u0004\b=\u0010\u000BR\u0017\u0010>\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b>\u0010\t\u001A\u0004\b?\u0010\u000BR\u0017\u0010@\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b@\u0010\t\u001A\u0004\bA\u0010\u000BR\u0017\u0010B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bB\u0010\t\u001A\u0004\bC\u0010\u000BR\u0017\u0010D\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bD\u0010\t\u001A\u0004\bE\u0010\u000BR\u0017\u0010F\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bF\u0010\t\u001A\u0004\bG\u0010\u000BR\u0017\u0010H\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bH\u0010\t\u001A\u0004\bI\u0010\u000BR\u0017\u0010J\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bJ\u0010\t\u001A\u0004\bK\u0010\u000BR\u0017\u0010L\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bL\u0010\t\u001A\u0004\bM\u0010\u000BR\u0017\u0010N\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bN\u0010\t\u001A\u0004\bO\u0010\u000BR\u0017\u0010P\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bP\u0010\t\u001A\u0004\bQ\u0010\u000B\u00A8\u0006R"}, d2 = {"Landroidx/compose/ui/autofill/ContentType$Companion;", "", "", "value", "Landroidx/compose/ui/autofill/ContentType;", "from$ui_release", "(Ljava/lang/String;)Landroidx/compose/ui/autofill/ContentType;", "from", "Username", "Landroidx/compose/ui/autofill/ContentType;", "getUsername", "()Landroidx/compose/ui/autofill/ContentType;", "Password", "getPassword", "EmailAddress", "getEmailAddress", "NewUsername", "getNewUsername", "NewPassword", "getNewPassword", "PostalAddress", "getPostalAddress", "PostalCode", "getPostalCode", "CreditCardNumber", "getCreditCardNumber", "CreditCardSecurityCode", "getCreditCardSecurityCode", "CreditCardExpirationDate", "getCreditCardExpirationDate", "CreditCardExpirationMonth", "getCreditCardExpirationMonth", "CreditCardExpirationYear", "getCreditCardExpirationYear", "CreditCardExpirationDay", "getCreditCardExpirationDay", "AddressCountry", "getAddressCountry", "AddressRegion", "getAddressRegion", "AddressLocality", "getAddressLocality", "AddressStreet", "getAddressStreet", "AddressAuxiliaryDetails", "getAddressAuxiliaryDetails", "PostalCodeExtended", "getPostalCodeExtended", "PersonFullName", "getPersonFullName", "PersonFirstName", "getPersonFirstName", "PersonLastName", "getPersonLastName", "PersonMiddleName", "getPersonMiddleName", "PersonMiddleInitial", "getPersonMiddleInitial", "PersonNamePrefix", "getPersonNamePrefix", "PersonNameSuffix", "getPersonNameSuffix", "PhoneNumber", "getPhoneNumber", "PhoneNumberDevice", "getPhoneNumberDevice", "PhoneCountryCode", "getPhoneCountryCode", "PhoneNumberNational", "getPhoneNumberNational", "Gender", "getGender", "BirthDateFull", "getBirthDateFull", "BirthDateDay", "getBirthDateDay", "BirthDateMonth", "getBirthDateMonth", "BirthDateYear", "getBirthDateYear", "SmsOtpCode", "getSmsOtpCode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ContentType from$ui_release(@NotNull String s) {
            switch(s) {
                case "addressCountry": {
                    return this.getAddressCountry();
                }
                case "addressLocality": {
                    return this.getAddressLocality();
                }
                case "addressRegion": {
                    return this.getAddressRegion();
                }
                case "birthDateDay": {
                    return this.getBirthDateDay();
                }
                case "birthDateFull": {
                    return this.getBirthDateFull();
                }
                case "birthDateMonth": {
                    return this.getBirthDateMonth();
                }
                case "birthDateYear": {
                    return this.getBirthDateYear();
                }
                case "creditCardExpirationDate": {
                    return this.getCreditCardExpirationDate();
                }
                case "creditCardExpirationDay": {
                    return this.getCreditCardExpirationDay();
                }
                case "creditCardExpirationMonth": {
                    return this.getCreditCardExpirationMonth();
                }
                case "creditCardExpirationYear": {
                    return this.getCreditCardExpirationYear();
                }
                case "creditCardNumber": {
                    return this.getCreditCardNumber();
                }
                case "creditCardSecurityCode": {
                    return this.getCreditCardSecurityCode();
                }
                case "emailAddress": {
                    return this.getEmailAddress();
                }
                case "extendedAddress": {
                    return this.getAddressAuxiliaryDetails();
                }
                case "extendedPostalCode": {
                    return this.getPostalCodeExtended();
                }
                case "gender": {
                    return this.getGender();
                }
                case "newPassword": {
                    return this.getNewPassword();
                }
                case "newUsername": {
                    return this.getNewUsername();
                }
                case "password": {
                    return this.getPassword();
                }
                case "personFamilyName": {
                    return this.getPersonLastName();
                }
                case "personGivenName": {
                    return this.getPersonFirstName();
                }
                case "personMiddleInitial": {
                    return this.getPersonMiddleInitial();
                }
                case "personMiddleName": {
                    return this.getPersonMiddleName();
                }
                case "personName": {
                    return this.getPersonFullName();
                }
                case "personNamePrefix": {
                    return this.getPersonNamePrefix();
                }
                case "personNameSuffix": {
                    return this.getPersonNameSuffix();
                }
                case "phoneCountryCode": {
                    return this.getPhoneCountryCode();
                }
                case "phoneNational": {
                    return this.getPhoneNumberNational();
                }
                case "phoneNumber": {
                    return this.getPhoneNumber();
                }
                case "phoneNumberDevice": {
                    return this.getPhoneNumberDevice();
                }
                case "postalAddress": {
                    return this.getPostalAddress();
                }
                case "postalCode": {
                    return this.getPostalCode();
                }
                case "smsOTPCode": {
                    return this.getSmsOtpCode();
                }
                case "streetAddress": {
                    return this.getAddressStreet();
                }
                case "username": {
                    return this.getUsername();
                }
                default: {
                    return new ContentType(s);
                }
            }
        }

        @NotNull
        public final ContentType getAddressAuxiliaryDetails() {
            return ContentType.s;
        }

        @NotNull
        public final ContentType getAddressCountry() {
            return ContentType.o;
        }

        @NotNull
        public final ContentType getAddressLocality() {
            return ContentType.q;
        }

        @NotNull
        public final ContentType getAddressRegion() {
            return ContentType.p;
        }

        @NotNull
        public final ContentType getAddressStreet() {
            return ContentType.r;
        }

        @NotNull
        public final ContentType getBirthDateDay() {
            return ContentType.H;
        }

        @NotNull
        public final ContentType getBirthDateFull() {
            return ContentType.G;
        }

        @NotNull
        public final ContentType getBirthDateMonth() {
            return ContentType.I;
        }

        @NotNull
        public final ContentType getBirthDateYear() {
            return ContentType.J;
        }

        @NotNull
        public final ContentType getCreditCardExpirationDate() {
            return ContentType.k;
        }

        @NotNull
        public final ContentType getCreditCardExpirationDay() {
            return ContentType.n;
        }

        @NotNull
        public final ContentType getCreditCardExpirationMonth() {
            return ContentType.l;
        }

        @NotNull
        public final ContentType getCreditCardExpirationYear() {
            return ContentType.m;
        }

        @NotNull
        public final ContentType getCreditCardNumber() {
            return ContentType.i;
        }

        @NotNull
        public final ContentType getCreditCardSecurityCode() {
            return ContentType.j;
        }

        @NotNull
        public final ContentType getEmailAddress() {
            return ContentType.d;
        }

        @NotNull
        public final ContentType getGender() {
            return ContentType.F;
        }

        @NotNull
        public final ContentType getNewPassword() {
            return ContentType.f;
        }

        @NotNull
        public final ContentType getNewUsername() {
            return ContentType.e;
        }

        @NotNull
        public final ContentType getPassword() {
            return ContentType.c;
        }

        @NotNull
        public final ContentType getPersonFirstName() {
            return ContentType.v;
        }

        @NotNull
        public final ContentType getPersonFullName() {
            return ContentType.u;
        }

        @NotNull
        public final ContentType getPersonLastName() {
            return ContentType.w;
        }

        @NotNull
        public final ContentType getPersonMiddleInitial() {
            return ContentType.y;
        }

        @NotNull
        public final ContentType getPersonMiddleName() {
            return ContentType.x;
        }

        @NotNull
        public final ContentType getPersonNamePrefix() {
            return ContentType.z;
        }

        @NotNull
        public final ContentType getPersonNameSuffix() {
            return ContentType.A;
        }

        @NotNull
        public final ContentType getPhoneCountryCode() {
            return ContentType.D;
        }

        @NotNull
        public final ContentType getPhoneNumber() {
            return ContentType.B;
        }

        @NotNull
        public final ContentType getPhoneNumberDevice() {
            return ContentType.C;
        }

        @NotNull
        public final ContentType getPhoneNumberNational() {
            return ContentType.E;
        }

        @NotNull
        public final ContentType getPostalAddress() {
            return ContentType.g;
        }

        @NotNull
        public final ContentType getPostalCode() {
            return ContentType.h;
        }

        @NotNull
        public final ContentType getPostalCodeExtended() {
            return ContentType.t;
        }

        @NotNull
        public final ContentType getSmsOtpCode() {
            return ContentType.K;
        }

        @NotNull
        public final ContentType getUsername() {
            return ContentType.b;
        }
    }

    public static final int $stable;
    public static final ContentType A;
    public static final ContentType B;
    public static final ContentType C;
    @NotNull
    public static final Companion Companion;
    public static final ContentType D;
    public static final ContentType E;
    public static final ContentType F;
    public static final ContentType G;
    public static final ContentType H;
    public static final ContentType I;
    public static final ContentType J;
    public static final ContentType K;
    public final Set a;
    public static final ContentType b;
    public static final ContentType c;
    public static final ContentType d;
    public static final ContentType e;
    public static final ContentType f;
    public static final ContentType g;
    public static final ContentType h;
    public static final ContentType i;
    public static final ContentType j;
    public static final ContentType k;
    public static final ContentType l;
    public static final ContentType m;
    public static final ContentType n;
    public static final ContentType o;
    public static final ContentType p;
    public static final ContentType q;
    public static final ContentType r;
    public static final ContentType s;
    public static final ContentType t;
    public static final ContentType u;
    public static final ContentType v;
    public static final ContentType w;
    public static final ContentType x;
    public static final ContentType y;
    public static final ContentType z;

    static {
        ContentType.Companion = new Companion(null);
        ContentType.$stable = 8;
        ContentType.b = new ContentType("username");
        ContentType.c = new ContentType("password");
        ContentType.d = new ContentType("emailAddress");
        ContentType.e = new ContentType("newUsername");
        ContentType.f = new ContentType("newPassword");
        ContentType.g = new ContentType("postalAddress");
        ContentType.h = new ContentType("postalCode");
        ContentType.i = new ContentType("creditCardNumber");
        ContentType.j = new ContentType("creditCardSecurityCode");
        ContentType.k = new ContentType("creditCardExpirationDate");
        ContentType.l = new ContentType("creditCardExpirationMonth");
        ContentType.m = new ContentType("creditCardExpirationYear");
        ContentType.n = new ContentType("creditCardExpirationDay");
        ContentType.o = new ContentType("addressCountry");
        ContentType.p = new ContentType("addressRegion");
        ContentType.q = new ContentType("addressLocality");
        ContentType.r = new ContentType("streetAddress");
        ContentType.s = new ContentType("extendedAddress");
        ContentType.t = new ContentType("extendedPostalCode");
        ContentType.u = new ContentType("personName");
        ContentType.v = new ContentType("personGivenName");
        ContentType.w = new ContentType("personFamilyName");
        ContentType.x = new ContentType("personMiddleName");
        ContentType.y = new ContentType("personMiddleInitial");
        ContentType.z = new ContentType("personNamePrefix");
        ContentType.A = new ContentType("personNameSuffix");
        ContentType.B = new ContentType("phoneNumber");
        ContentType.C = new ContentType("phoneNumberDevice");
        ContentType.D = new ContentType("phoneCountryCode");
        ContentType.E = new ContentType("phoneNational");
        ContentType.F = new ContentType("gender");
        ContentType.G = new ContentType("birthDateFull");
        ContentType.H = new ContentType("birthDateDay");
        ContentType.I = new ContentType("birthDateMonth");
        ContentType.J = new ContentType("birthDateYear");
        ContentType.K = new ContentType("smsOTPCode");
    }

    public ContentType(@NotNull String s) {
        this(e0.setOf(s));
    }

    public ContentType(Set set0) {
        this.a = set0;
    }

    @NotNull
    public final ContentType plus$ui_release(@NotNull ContentType contentType0) {
        return new ContentType(g0.plus(this.a, contentType0.a));
    }
}

