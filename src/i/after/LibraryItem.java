package i.after;

import java.time.LocalDateTime;

public interface LibraryItem {

    int getCheckOutDurationInDays();

    LocalDateTime getBorrowDate();
    String getLibraryId();

    LocalDateTime getDueDate();

    void checkIn();

    void checkOut(String borrower);
}