package InterfaceAndInheritance.defaultmethods;

import java.time.*;
import java.time.ZonedDateTime;

public interface HandleInvalidTimeZoneClient extends TimeClient {
    default public ZonedDateTime getZoneDateTime(String zoneString) {
        try {
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.of(zoneString));
        } catch (DateTimeException e) {
            System.err.println("Invalid zone ID: " + zoneString + "; using the default time zone instead.");
            return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
        }
    }
}
