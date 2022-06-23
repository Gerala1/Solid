package i.after;

import java.time.LocalDateTime;
import java.util.List;

public class DVD implements BookItem, LibraryItem{

    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    int pages;
    String title;


    @Override
    public String getAuthor() {
        return "";
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public int getPages() {
        return -1;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkIn() {
        borrower = "";
    }

    @Override
    public void checkOut(String borrower) {
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
    }

    @Override
    public int getCheckOutDurationInDays() {
        return 14;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public LocalDateTime getDueDate() {
        return borrowDate.plusDays(checkOutDurationInDays);
    }
}
